package com.hhly.skeleton.base.qiniu;

/**
 * @desc 七牛上传参数传递
 * @author xiongJinGang
 * @date 2017年9月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class QiniuUploadVO {
	/**
	 * 7牛accessKey 【必填】
	 */
	private String accessKey;
	/**
	 * 7牛secretKey 【必填】
	 */
	private String secretKey;
	/**
	 * 七牛云上保存图片的空间名 【必填】
	 */
	private String bucketName;
	/**
	 * 批量上传、批量删除数量，批量上传、批量删除时该参数才有用，默认100
	 */
	private Integer batchLimit = 100;
	/**
	 * 限制上传文件类型【必填】
	 */
	private String fileType;
	/**
	 * 文件访问URL 【选填】，读取远程文件时，必须存在
	 */
	private String uploadURL;
	/**
	 * 上传文件大小，单位为MB
	 */
	private Long fileSize = 10l;// 默认10M = 10485760 字节【 10M=10*1024*1024】
	/**
	 * 保存图片的相对路径：如：_upload_images/default/
	 */
	private String savePath;

	/*********上传的文件名***********/
	// 1、使用文件流上传时，该文件名是该文件流的文件名
	// 2、使用MultipartFile上传时，如果使用了该文件名，则使用原文件名（不重命名原文件）
	private String fileName;// 文件名称。只能是 xxx.jpg，没有前缀

	private String fileRelativePath;// 文件相对路径。_upload_images/default/girl.jpg

	public QiniuUploadVO() {
		super();
	}

	public QiniuUploadVO(String accessKey, String secretKey, String bucketName, Integer batchLimit, String fileType, String savePath, Long fileSize) {
		super();
		this.accessKey = accessKey;
		this.secretKey = secretKey;
		this.bucketName = bucketName;
		this.batchLimit = batchLimit;
		this.fileType = fileType;
		this.savePath = savePath;
		this.fileSize = fileSize;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Integer getBatchLimit() {
		return batchLimit;
	}

	public void setBatchLimit(Integer batchLimit) {
		this.batchLimit = batchLimit;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getUploadURL() {
		return uploadURL;
	}

	public void setUploadURL(String uploadURL) {
		this.uploadURL = uploadURL;
	}

	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileRelativePath() {
		return fileRelativePath;
	}

	public void setFileRelativePath(String fileRelativePath) {
		this.fileRelativePath = fileRelativePath;
	}

	@Override
	public String toString() {
		return "QiniuUploadVO [accessKey=" + accessKey + ", secretKey=" + secretKey + ", bucketName=" + bucketName + ", batchLimit=" + batchLimit + ", fileType=" + fileType + ", uploadURL=" + uploadURL + ", fileSize=" + fileSize + ", savePath="
				+ savePath + ", fileName=" + fileName + "]";
	}

}
