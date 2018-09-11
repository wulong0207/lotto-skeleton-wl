package com.hhly.skeleton.base.qiniu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.constants.MessageCodeConstants;
import com.hhly.skeleton.base.util.FileTypeUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 七牛云工具类
 * @author xiongJinGang
 * @date 2017年9月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class QiniuUtil {
	private static final Logger logger = LoggerFactory.getLogger(QiniuUtil.class);

	/**  
	* 方法说明: 验证七牛上传的基本参数
	* @auth: xiongJinGang
	* @param qiniuUploadVO
	* @param file
	* @time: 2017年9月4日 下午5:35:25
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateUploadParam(QiniuUploadVO qiniuUploadVO) {
		try {
			if (ObjectUtil.isBlank(qiniuUploadVO.getAccessKey())) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_PARAM_IS_NULL_FIELD, "accessKey");
			}
			if (ObjectUtil.isBlank(qiniuUploadVO.getSecretKey())) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_PARAM_IS_NULL_FIELD, "secretKey");
			}
			if (ObjectUtil.isBlank(qiniuUploadVO.getBucketName())) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_PARAM_IS_NULL_FIELD, "bucketName");
			}
			if (ObjectUtil.isBlank(qiniuUploadVO.getFileType())) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_PARAM_IS_NULL_FIELD, "fileType");
			}
			return ResultBO.ok();
		} catch (Exception e) {
			logger.error("验证上传文件参数异常", e);
			return ResultBO.err(MessageCodeConstants.UPLOAD_FAIL);
		}
	}

	/**  
	* 方法说明: 验证文件有效性
	* @auth: xiongJinGang
	* @param qiniuUploadVO
	* @param file
	* @time: 2017年9月14日 上午11:32:47
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateFile(QiniuUploadVO qiniuUploadVO, MultipartFile file) {
		try {
			if (ObjectUtil.isBlank(file)) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_NULL_FAIL);
			}
			String fileName = file.getOriginalFilename();
			// TODO mp3先不验证
			if(fileName.endsWith(".mp3"))
				return ResultBO.ok();
			Long fileSize = file.getSize();
			String file_type = FileTypeUtil.getFileType(file.getBytes());// 验证文件的真实类型
			if (!ObjectUtil.isBlank(file_type)) {
				// 判断是否文件类型允许上传 txt文件除外
				if (!fileName.endsWith(".txt")) {
					if (!qiniuUploadVO.getFileType().contains(file_type)) {
						return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_TYPE_LIMIT_SERVICE);
					}
				}
			} else {
				if (fileName.contains(".")) {
					boolean flag = validateType(fileName, qiniuUploadVO);
					if (!flag) {
						return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_TYPE_LIMIT_SERVICE);
					}
				}
			}

			// 允许上传多少字节
			Long fileSizeKB = qiniuUploadVO.getFileSize() * 1024 * 1024;
			// 字节大小
			if (fileSize > fileSizeKB) {
				return ResultBO.err(MessageCodeConstants.UPLOAD_FILE_SIZE_LIMIT_SERVICE);
			}
			return ResultBO.ok();
		} catch (Exception e) {
			logger.error("验证上传文件参数异常", e);
			return ResultBO.err(MessageCodeConstants.UPLOAD_FAIL);
		}
	}

	/**  
	* 方法说明: 验证文件类型
	* @auth: xiongJinGang
	* @param fileName
	* @param qiniuUploadVO
	* @time: 2017年9月22日 下午12:09:39
	* @return: boolean 
	*/
	public static boolean validateType(String fileName, QiniuUploadVO qiniuUploadVO) {
		boolean flag = false;
		String fileType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		String[] fileTypes = qiniuUploadVO.getFileType().split(",");
		for (String type : fileTypes) {
			if (type.equalsIgnoreCase(fileType)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
}
