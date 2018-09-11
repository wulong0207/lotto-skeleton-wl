package com.hhly.skeleton.lotto.base.singleupload.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 单式上传结果
 * @author YiJian
 * @date 2017年6月9日 下午2:48:24
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class SingleUploadErrorResultBO  extends BaseBO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 错误行号
	 */
	@JsonProperty("el")
	private Integer errorLine;
	/**
	 * 投注内容
	 */
	@JsonProperty("bc")
	private String bettingContent;
	/**
	 * 错误信息
	 */
	@JsonProperty("em")
	private String errorMsg;
	/**
	 * 错误编码
	 */
	@JsonProperty("ec")
	private String errorCode;
	
	
	public SingleUploadErrorResultBO(Integer errorLine, String bettingContent, String errorCode) {
		super();
		this.errorLine = errorLine;
		this.bettingContent = bettingContent;
		this.errorCode = errorCode;
	}
	
	public SingleUploadErrorResultBO(Integer errorLine, String bettingContent, String errorCode, String errorMsg) {
		super();
		this.errorLine = errorLine;
		this.bettingContent = bettingContent;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public Integer getErrorLine() {
		return errorLine;
	}
	public void setErrorLine(Integer errorLine) {
		this.errorLine = errorLine;
	}
	public String getBettingContent() {
		return bettingContent;
	}
	public void setBettingContent(String bettingContent) {
		this.bettingContent = bettingContent;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
