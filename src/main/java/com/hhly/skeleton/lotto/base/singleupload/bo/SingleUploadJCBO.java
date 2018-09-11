package com.hhly.skeleton.lotto.base.singleupload.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 单式上传返回BO
 * @author YiJian
 * @date 2017年6月9日 下午3:16:50
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class SingleUploadJCBO  extends BaseBO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 内容验证出错List
	 */
	@JsonProperty("el")
	private List<SingleUploadErrorResultBO> errorList;
	/**
	 * 内容验证正确List
	 */
	@JsonProperty("sl")
	private List<SingleUploadSuccessResultBO> successList;
	/**
	 * 该方案截止时间
	 */
	@JsonProperty("et")
	private String currentMatchSaleEndTime;
	
	/**
	 * 子玩法编号
	 */
	@JsonProperty("lcc")
	private String lotteryChildCode;
	
	/**
	 * 成功总条数
	 */
	@JsonProperty("wt")
	private Integer winTotal;
	
	/**
	 * 失败总条数
	 */
	@JsonProperty("lt")
	private Integer	loseTotal;
	
	/**
	 * 该方案截止时间对应彩期
	 */
	@JsonProperty("ic")
	private String currentMatchIssueCode;
	
	
	/**
	 * 上传文件名
	 */
	@JsonProperty("fn")
	private String fileName;
	
	
	public Integer getWinTotal() {
		if(successList != null && successList.size()>1)
			return successList.size();
		return winTotal;
	}
	public void setWinTotal(Integer winTotal) {
		this.winTotal = winTotal;
	}
	public Integer getLoseTotal() {
		if(errorList != null && errorList.size()>1)
			return errorList.size();
		return loseTotal;
	}
	public void setLoseTotal(Integer loseTotal) {
		this.loseTotal = loseTotal;
	}
	public String getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public List<SingleUploadErrorResultBO> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<SingleUploadErrorResultBO> errorList) {
		this.errorList = errorList;
	}
	public List<SingleUploadSuccessResultBO> getSuccessList() {
		return successList;
	}
	public void setSuccessList(List<SingleUploadSuccessResultBO> successList) {
		this.successList = successList;
	}
	public String getCurrentMatchSaleEndTime() {
		return currentMatchSaleEndTime;
	}
	public void setCurrentMatchSaleEndTime(String currentMatchSaleEndTime) {
		this.currentMatchSaleEndTime = currentMatchSaleEndTime;
	}
	public String getCurrentMatchIssueCode() {
		return currentMatchIssueCode;
	}
	public void setCurrentMatchIssueCode(String currentMatchIssueCode) {
		this.currentMatchIssueCode = currentMatchIssueCode;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
