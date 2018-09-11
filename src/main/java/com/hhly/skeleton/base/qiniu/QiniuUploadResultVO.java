package com.hhly.skeleton.base.qiniu;

/**
 * @desc 七牛上传文件返回结果
 * @author xiongJinGang
 * @date 2017年9月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class QiniuUploadResultVO {
	public static final String SUCCESS_CODE = "SUCCESS";
	public static final String SUCCESS_MSG = "成功";

	public static final String FAIL_CODE = "FAIL";
	public static final String FAIL_MSG = "失败";

	private String code = SUCCESS_CODE;// 编码
	private String desc = SUCCESS_MSG;// 描述
	private String originalFileName;// 原始文件名
	private String fileName;// 文件名

	public QiniuUploadResultVO() {
		super();
	}

	public QiniuUploadResultVO(String originalFileName) {
		super();
		this.originalFileName = originalFileName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOriginalFileName() {
		return originalFileName;
	}

	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}

}
