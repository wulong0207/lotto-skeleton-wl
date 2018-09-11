package com.hhly.skeleton.base.qiniu;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.MessageCodeConstants;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.HttpUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.ProxyConfiguration;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.BatchStatus;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.storage.persistent.FileRecorder;
import com.qiniu.util.Auth;

public class QiniuUpload {
	private static final Logger logger = Logger.getLogger(QiniuUpload.class);

	private QiniuUploadVO qiniuUploadVO;

	/**
	 *构建一个带指定Zone对象的配置类，目前使用的是华南
	 *华东:Zone.zone0(),华北:Zone.zone1(),华南:Zone.zone2(),北美:Zone.zoneNa0()
	 */
	private Configuration cfg = new Configuration(Zone.zone2());

	/** 创建上传对象 **/
	private UploadManager uploadManager = null;

	public QiniuUpload(QiniuUploadVO qiniuUploadVO) {
		super();
		this.qiniuUploadVO = qiniuUploadVO;
		boolean isProxy = HttpUtil.isProxy("http://api.qiniu.com");
		if (isProxy) {
			ProxyConfiguration proxyConfiguration = new ProxyConfiguration(HttpUtil.HTTP_PROXYHOST, Integer.parseInt(HttpUtil.HTTP_PROXYPORT));
			cfg.proxy = proxyConfiguration;
		}
		if (ObjectUtil.isBlank(uploadManager)) {
			uploadManager = new UploadManager(cfg);
		}
	}

	/**  
	* 方法说明: 单个文件上传，如果fileName有值，原始文件名将不会修改，如果没有值，系统将会生成一个文件名
	* @auth: xiongJinGang
	* @param file
	* @time: 2017年9月6日 下午6:55:17
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> uploadFile(MultipartFile file) {
		ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
		if (resultBO.isError()) {
			logger.info("单文件上传参数验证不通过，参数【" + qiniuUploadVO.toString() + "】：" + resultBO.getMessage());
			return resultBO;
		}
		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		// 上传文件到七牛云
		resultBO = uploadFileToQiniu(file);
		QiniuUploadResultVO qiniuUploadResultVO = (QiniuUploadResultVO) resultBO.getData();
		list.add(qiniuUploadResultVO);
		return ResultBO.ok(list);
	}

	/**  
	* 方法说明: 上传文件流，会重命名文件。fileName 为该文件我名称，不包含路径（如：girl.png）
	* @auth: xiongJinGang
	* @param byteInputStream 字节流 byte[] uploadBytes = file.getBytes();
	* @time: 2017年9月14日 下午6:11:00
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> uploadFileRename(ByteArrayInputStream byteInputStream) {
		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		QiniuUploadResultVO qiniuUploadResultVO = new QiniuUploadResultVO();
		String fileName = qiniuUploadVO.getFileName();
		if (ObjectUtil.isBlank(fileName)) {
			return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_NAME_IS_NULL);
		}
		try {
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			if (resultBO.isError()) {
				logger.info("单文件上传参数验证不通过，参数【" + qiniuUploadVO.toString() + "】：" + resultBO.getMessage());
				return resultBO;
			}
			boolean flag = QiniuUtil.validateType(fileName, qiniuUploadVO);
			if (!flag) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_TYPE_LIMIT_SERVICE, fileName);
			}
			// 上传文件到七牛云
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			// String upToken = auth.uploadToken(qiniuUploadVO.getBucketName(), null, 3600, new StringMap().putNotEmpty("saveKey", fileName), true);
			String upToken = auth.uploadToken(qiniuUploadVO.getBucketName());
			String newFileName = DateUtil.getNow("yyMMddHHmmss") + RandomUtils.nextInt(5);
			// 文件扩展名
			String filenameExtension = "";
			if (fileName.contains(".")) {
				filenameExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			}
			// 需要上传到七牛云的路径
			String saveFileName = qiniuUploadVO.getSavePath() + newFileName + filenameExtension;
			Response response = uploadManager.put(byteInputStream, saveFileName, upToken, null, null);
			// 解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("上传图片返回：" + JSON.toJSONString(putRet));
			qiniuUploadResultVO.setFileName(saveFileName);
		} catch (QiniuException e) {
			logger.error("上传图片【" + fileName + "】异常：", e);
			qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
			qiniuUploadResultVO.setDesc(QiniuUploadResultVO.FAIL_CODE);
			return ResultBO.err();
		}
		list.add(qiniuUploadResultVO);
		return ResultBO.ok(list);
	}

	/**  
	* 方法说明: 上传文件，不重新命名，参数：fileRelativePath 必须有值，并且是相对路径：_upload_images/default/girl.jpg
	* 如果是修改文件内容，并且要立即生效，需要传递uploadURL参数。
	* @auth: xiongJinGang
	* @param byteInputStream
	* @time: 2017年9月19日 上午11:22:17
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> uploadFileNotRename(ByteArrayInputStream byteInputStream) {
		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		QiniuUploadResultVO qiniuUploadResultVO = new QiniuUploadResultVO();
		String fileName = qiniuUploadVO.getFileRelativePath();// 文件相对路径
		logger.info("上传文件参数：" + qiniuUploadVO.toString());
		if (fileName.contains("?")) {
			fileName = fileName.substring(0, fileName.lastIndexOf("?"));
		}
		if (ObjectUtil.isBlank(fileName)) {
			logger.error("上传文件名为空");
			return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_NAME_IS_NULL);
		}
		try {
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			if (resultBO.isError()) {
				logger.error("单文件上传参数验证不通过，参数【" + qiniuUploadVO.toString() + "】：" + resultBO.getMessage());
				return resultBO;
			}
			boolean flag = QiniuUtil.validateType(fileName, qiniuUploadVO);
			if (!flag) {
				logger.error("验证文件【" + fileName + "】类型错误");
				return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_TYPE_LIMIT_SERVICE, fileName);
			}
			// 上传文件到七牛云
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			// String upToken = auth.uploadToken(qiniuUploadVO.getBucketName(), null, 3600, new StringMap().putNotEmpty("saveKey", fileName), true);
			String upToken = auth.uploadToken(qiniuUploadVO.getBucketName());
			// 需要上传到七牛云的路径
			Response response = uploadManager.put(byteInputStream, fileName, upToken, null, null);
			// 解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("上传图片返回：" + JSON.toJSONString(putRet));
			qiniuUploadResultVO.setFileName(fileName + "?v=" + System.currentTimeMillis());
			// 刷新文件
			// refreshFile(fileName, auth);
		} catch (QiniuException e) {
			logger.error("上传图片【" + fileName + "】异常：", e);
			qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
			qiniuUploadResultVO.setDesc(QiniuUploadResultVO.FAIL_CODE);
			return ResultBO.err();
		}
		list.add(qiniuUploadResultVO);
		return ResultBO.ok(list);
	}

	/**  
	* 方法说明: 刷新文件（因为走了代理，这个api无法通过代理访问，所以改用链接后面加?v=时间戳的形式）
	* @auth: xiongJinGang
	* @param fileName
	* @param auth
	* @throws QiniuException
	* @time: 2017年9月20日 下午5:18:17
	* @return: void 
	*/
	/*	private void refreshFile(String fileName, Auth auth) {
			try {
				String[] urls = new String[] { qiniuUploadVO.getUploadURL() + fileName };
				Client client = new Client(cfg);
				// 使用代理
				CdnManagerProxy cdnManager = new CdnManagerProxy(auth, client);
				CdnResult.RefreshResult result = cdnManager.refreshUrls(urls);
				logger.info("刷新文件【" + fileName + "】返回：" + result.code);
			} catch (QiniuException e) {
				logger.error("刷新文件【" + fileName + "】异常", e);
			}
		}*/

	/**  
	* 方法说明: 批量文件上传
	* @auth: xiongJinGang
	* @param files
	* @time: 2017年9月14日 下午2:28:37
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> uploadFiles(MultipartFile[] files) {
		ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
		if (resultBO.isError()) {
			logger.info("批量上传参数验证不通过，参数【" + qiniuUploadVO.toString() + "】：" + resultBO.getMessage());
			return resultBO;
		}
		// 上传文件为空
		if (ObjectUtil.isBlank(files)) {
			logger.info("批量上传文件为空");
			return ResultBO.err(MessageCodeConstants.UPLOAD_NULL_FAIL);
		}
		// 批量上传文件数量超限
		if (files.length > qiniuUploadVO.getBatchLimit()) {
			logger.info("批量上传文件数量超限，允许上传数量：" + qiniuUploadVO.getBatchLimit() + "，实际上传数量：" + files.length);
			return ResultBO.err(MessageCodeConstants.UPLOAD_NUM_OVER_FIELD);
		}
		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		for (MultipartFile file : files) {
			// 上传文件到七牛云
			resultBO = uploadFileToQiniu(file);
			QiniuUploadResultVO qiniuUploadResultVO = (QiniuUploadResultVO) resultBO.getData();
			list.add(qiniuUploadResultVO);
		}
		return ResultBO.ok(list);
	}

	/**  
	* 方法说明: 断点续传文件
	* @auth: xiongJinGang
	* @param file
	* @time: 2017年9月14日 下午2:45:22
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> breakpointUpload(MultipartFile file) {
		ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
		if (resultBO.isError()) {
			logger.info("断点续传上传参数验证不通过，参数【" + qiniuUploadVO.toString() + "】：" + resultBO.getMessage());
			return resultBO;
		}
		String bucketName = qiniuUploadVO.getBucketName();
		String fileName = file.getOriginalFilename();// 获取文件名称
		String localTempDir = Paths.get(System.getenv("java.io.tmpdir"), bucketName).toString();

		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		QiniuUploadResultVO qiniuUploadResultVO = new QiniuUploadResultVO(fileName);

		try {
			resultBO = QiniuUtil.validateFile(qiniuUploadVO, file);
			if (resultBO.isError()) {
				logger.info("上传文件【" + fileName + "】验证不通过：" + resultBO.getMessage());
				// return resultBO;
				qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
				qiniuUploadResultVO.setDesc(resultBO.getMessage());
				return ResultBO.ok(qiniuUploadResultVO);
			}
			byte[] uploadBytes = file.getBytes();
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			String upToken = auth.uploadToken(qiniuUploadVO.getBucketName());
			// 设置断点续传文件进度保存目录
			FileRecorder fileRecorder = new FileRecorder(localTempDir);
			UploadManager uploadManager = new UploadManager(cfg, fileRecorder);

			String newFileName = DateUtil.getNow("yyMMddHHmmss") + RandomUtils.nextInt(5);
			// 文件扩展名
			String filenameExtension = "";
			if (fileName.contains(".")) {
				filenameExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			}
			// 需要上传到七牛云的路径
			String saveFileName = qiniuUploadVO.getSavePath() + newFileName + filenameExtension;

			Response response = uploadManager.put(uploadBytes, saveFileName, upToken);
			// 解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("上传图片【" + fileName + "】返回：" + JSON.toJSONString(putRet));
			qiniuUploadResultVO.setFileName(saveFileName);
		} catch (Exception e) {
			logger.error("上传图片【" + fileName + "】异常：", e);
			qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
			qiniuUploadResultVO.setDesc(QiniuUploadResultVO.FAIL_CODE);
			return ResultBO.err();
		}
		list.add(qiniuUploadResultVO);
		return ResultBO.ok(list);
	}

	/**  
	* 方法说明: 上传文件到七牛云
	* @auth: xiongJinGang
	* @param file
	* @param fileName
	* @time: 2017年9月14日 上午11:36:20
	* @return: void 
	*/
	private ResultBO<?> uploadFileToQiniu(MultipartFile file) {
		String needUseName = qiniuUploadVO.getFileName();// 如果存在该值，则保持原有的文件名不变
		String fileName = file.getOriginalFilename();// 获取文件名称
		String fileRelativePath = qiniuUploadVO.getFileRelativePath();// 文件相对路径

		QiniuUploadResultVO qiniuUploadResultVO = new QiniuUploadResultVO(fileName);
		try {
			ResultBO<?> resultBO = QiniuUtil.validateFile(qiniuUploadVO, file);
			if (resultBO.isError()) {
				logger.info("上传文件【" + fileName + "】验证不通过：" + resultBO.getMessage());
				// return resultBO;
				qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
				qiniuUploadResultVO.setDesc(resultBO.getMessage());
				return ResultBO.ok(qiniuUploadResultVO);
			}
			byte[] uploadBytes = file.getBytes();
			ByteArrayInputStream byteInputStream = new ByteArrayInputStream(uploadBytes);
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			// String upToken = auth.uploadToken(qiniuUploadVO.getBucketName(), null, 3600, new StringMap().putNotEmpty("saveKey", fileName), true);
			String upToken = auth.uploadToken(qiniuUploadVO.getBucketName());

			String filenameExtension = "";// 文件扩展名
			String saveFileName = "";// 需要上传到七牛云的路径
			String newFileName = "";// 新文件名
			// 优先使用文件相对路径
			if (ObjectUtil.isBlank(fileRelativePath)) {
				if (!ObjectUtil.isBlank(needUseName)) {
					newFileName = needUseName;
					saveFileName = qiniuUploadVO.getSavePath() + newFileName;
				} else {
					newFileName = DateUtil.getNow("yyMMddHHmmss") + RandomUtils.nextInt(5);
					if (fileName.contains(".")) {
						filenameExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					}
					saveFileName = qiniuUploadVO.getSavePath() + newFileName + filenameExtension;
				}
			} else {
				saveFileName = fileRelativePath;
			}
			Response response = uploadManager.put(byteInputStream, saveFileName, upToken, null, null);
			// 解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("上传图片【" + fileName + "】返回：" + JSON.toJSONString(putRet));
			qiniuUploadResultVO.setFileName(saveFileName);
		} catch (Exception e) {
			logger.error("上传图片【" + fileName + "】异常：", e);
			qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
			qiniuUploadResultVO.setDesc(QiniuUploadResultVO.FAIL_CODE);
			return ResultBO.err();
		}
		return ResultBO.ok(qiniuUploadResultVO);
	}

	/**  
	* 方法说明: 删除指定文件
	* @auth: xiongJinGang
	* @param key 不带域名的相对路径，即数据库中保存的相对路径 _upload_images/default/newFile.png
	* @time: 2017年9月14日 下午2:57:23
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> deleteFile(String key) {
		try {
			if (ObjectUtil.isBlank(key)) {
				logger.info("文件名为空，不能删除");
				return ResultBO.err(MessageCodeConstants.DELETE_FILE_IS_NULL);
			}
			key = key.trim();
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			if (resultBO.isError()) {
				logger.info("删除文件【" + key + "】参数验证不通过：" + resultBO.getMessage());
				return resultBO;
			}
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			BucketManager bucketManager = new BucketManager(auth, cfg);
			Response response = bucketManager.delete(qiniuUploadVO.getBucketName(), key);
			// 解析上传成功的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("删除文件【" + key + "】返回：" + JSON.toJSONString(putRet));
			return ResultBO.ok();
		} catch (QiniuException ex) {
			// 如果遇到异常，说明删除失败
			logger.error("删除文件【" + key + "】失败，错误码：" + ex.code() + "，失败信息：" + ex.response.toString());
		}
		return ResultBO.err();
	}

	/**  
	* 方法说明: 批量删除文件
	* @auth: xiongJinGang
	* @param keys  不带域名的相对路径，即数据库中保存的相对路径 _upload_images/default/newFile.png，以数组形式
	* @time: 2017年9月14日 下午3:38:47
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> deleteFiles(String[] fileNames) {
		List<QiniuUploadResultVO> list = new ArrayList<QiniuUploadResultVO>();
		QiniuUploadResultVO qiniuUploadResultVO = null;
		try {
			if (ObjectUtil.isBlank(fileNames)) {
				logger.info("批量删除文件名为空");
				return ResultBO.err(MessageCodeConstants.DELETE_FILE_IS_NULL);
			}
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			if (resultBO.isError()) {
				logger.info("批量删除文件参数验证不通过：" + resultBO.getMessage());
				return resultBO;
			}
			if (fileNames.length > qiniuUploadVO.getBatchLimit()) {
				logger.info("批量删除文件数量超过限制，限制批量操作数量：" + qiniuUploadVO.getBatchLimit() + "，实际操作数量：" + fileNames.length);
				return ResultBO.err(MessageCodeConstants.UPLOAD_NUM_OVER_FIELD);
			}
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			BucketManager bucketManager = new BucketManager(auth, cfg);
			BucketManager.BatchOperations batchOperations = new BucketManager.BatchOperations();

			// 去掉空格
			List<String> keyList = new ArrayList<String>();
			for (String key : fileNames) {
				if (!ObjectUtil.isBlank(key)) {
					keyList.add(key.trim());
				}
			}
			String[] keys = keyList.toArray(new String[0]);
			batchOperations.addDeleteOp(qiniuUploadVO.getBucketName(), keys);
			Response response = bucketManager.batch(batchOperations);
			BatchStatus[] batchStatusList = response.jsonToObject(BatchStatus[].class);
			for (int i = 0; i < keys.length; i++) {
				qiniuUploadResultVO = new QiniuUploadResultVO(keys[i]);
				BatchStatus status = batchStatusList[i];
				if (status.code == 200) {
					logger.info(keys[i] + "文件删除成功");
				} else {
					logger.info(keys[i] + "文件删除失败：" + status.data.error);
					qiniuUploadResultVO.setCode(QiniuUploadResultVO.FAIL_CODE);
					qiniuUploadResultVO.setDesc(status.data.error);
				}
				list.add(qiniuUploadResultVO);
			}
			return ResultBO.ok(list);
		} catch (QiniuException ex) {
			// 如果遇到异常，说明删除失败
			logger.error("批量删除文件异常", ex);
		}
		return ResultBO.err();
	}

	/**  
	* 方法说明: 重命名文件名
	* @auth: xiongJinGang
	* @param oldFileName 原文件名
	* @param newFileName 新文件名
	* @time: 2017年9月14日 下午3:46:30
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> renameFileName(String oldFileName, String newFileName) {
		try {
			if (ObjectUtil.isBlank(oldFileName) || ObjectUtil.isBlank(newFileName)) {
				logger.info("原文件名或者新文件名为空，不能重命名");
				return ResultBO.err(MessageCodeConstants.DELETE_FILE_IS_NULL);
			}
			oldFileName = oldFileName.trim();
			newFileName = newFileName.trim();
			if (oldFileName.equals(newFileName)) {
				logger.info("原文件名和新文件名同名，不能重命名");
				return ResultBO.err(MessageCodeConstants.FILE_NAME_IS_SAME);
			}
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			BucketManager bucketManager = new BucketManager(auth, cfg);
			if (resultBO.isError()) {
				logger.info("重命名文件参数验证不通过：" + resultBO.getMessage());
				return resultBO;
			}
			Response response = bucketManager.move(qiniuUploadVO.getBucketName(), oldFileName, qiniuUploadVO.getBucketName(), newFileName);
			// 解析重命名的结果
			DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
			logger.info("原文件名【" + oldFileName + "】重命名新文件名【" + newFileName + "】返回：" + JSON.toJSONString(putRet));
			return ResultBO.ok();
		} catch (QiniuException ex) {
			// 如果遇到异常，说明移动失败
			logger.error("重命名文件【" + oldFileName + "】异常：" + ex.response.toString());
		}
		return ResultBO.err(MessageCodeConstants.RENAME_FILE_NAME_ERROR);
	}

	/**  
	* 方法说明: 读取远程文件
	* @auth: xiongJinGang
	* @param fileName 数据库中保存的相对路径
	* @throws QiniuException
	* @time: 2017年9月14日 下午6:31:04
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> readRemoteFile(String fileName) {
		return readFile(fileName, null, Constants.NUM_1);
	}

	/**  
	* 方法说明: 读远程文件
	* @auth: xiongJinGang
	* @param fileName
	* @param charset 文件编码
	* @time: 2017年9月19日 下午4:15:50
	* @return: ResultBO<?> 
	*/
	public ResultBO<?> readRemoteFile(String fileName, String charset) {
		return readFile(fileName, charset, Constants.NUM_1);
	}

	/**
	 * 方法说明：读取远程文件
	 * @author longguoyou
	 * @date 2017年9月19日
	 * @param fileName
	 * @param charset
	 * @return List&lt;String&gt;
	 */
	public ResultBO<?> readRemoteFileAsList(String fileName, String charset) {
		return readFile(fileName, charset, Constants.NUM_2);
	}

	/**  
	* 方法说明: 读取远程文件
	* @auth: xiongJinGang
	* @param fileName 文件名
	* @param charset 编码
	* @param retType 返回数据类型 1:字符串   2：List&lt;String&gt;
	* @time: 2017年9月19日 下午4:18:08
	* @return: ResultBO<?> 
	*/
	private ResultBO<?> readFile(String fileName, String charset, int retType) {
		logger.debug("开始读取远程文件：" + fileName);
		BufferedReader in = null;
		String readContent = "";// 读的文件内容
		List<String> readList = new ArrayList<String>();
		try {
			if (ObjectUtil.isBlank(fileName)) {
				logger.info("需要读取的远程文件名为空");
				return ResultBO.err(MessageCodeConstants.DELETE_FILE_IS_NULL);
			}
			fileName = fileName.trim();// 去除左右空格
			ResultBO<?> resultBO = QiniuUtil.validateUploadParam(qiniuUploadVO);
			Auth auth = Auth.create(qiniuUploadVO.getAccessKey(), qiniuUploadVO.getSecretKey());
			if (resultBO.isError()) {
				logger.info("读取远程文【" + fileName + "】件参数验证不通过：" + resultBO.getMessage());
				return resultBO;
			}
			if (ObjectUtil.isBlank(qiniuUploadVO.getUploadURL())) {
				logger.info("需要读取的远程文件访问路径为空");
				return ResultBO.err(MessageCodeConstants.UPLOAD_URL_IS_NULL);
			}
			String encodedFileName = URLEncoder.encode(fileName, "utf-8");
			String publicUrl = String.format("%s/%s", qiniuUploadVO.getUploadURL(), encodedFileName);
			long expireInSeconds = 3600;// 1小时，可以自定义链接过期时间
			// 最终访问路径
			String accessUrl = auth.privateDownloadUrl(publicUrl, expireInSeconds);

			URL url = new URL(accessUrl);
			HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
			urlCon.setConnectTimeout(10000);
			urlCon.setReadTimeout(30000);
			if (ObjectUtil.isBlank(charset)) {
				charset = "UTF-8";
			}
			in = new BufferedReader(new InputStreamReader(urlCon.getInputStream(), charset));
			String inputLine = " ";
			while ((inputLine = in.readLine()) != null) {
				if (1 == retType) {
					readContent += inputLine.trim();
				} else {
					readList.add(inputLine.trim());
				}
			}
		} catch (Exception ex) {
			// 如果遇到异常，说明移动失败
			logger.error("读取远程文件【" + fileName + "】异常：", ex);
			return ResultBO.err(MessageCodeConstants.RUNTIME_HTTP_ERROR_CODE);
		} finally {
			try {
				if (null != in) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return ResultBO.ok(1 == retType ? readContent : readList);
	}

}
