package com.hhly.skeleton.lotto.base.singleupload.vo;

import java.util.Map;

import com.hhly.skeleton.base.vo.BaseVO;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SingleUploadJCVO extends BaseVO {

	private static final long serialVersionUID = 1L;
	
	private String token;
	/**
	 * 过关方式 R、S、B、Q、Z、M
	 */
	private String playCode;
	/**
	 * 转换格式
	 */
	private String shiftContent;
	/**
	 * 文件路径
	 */
	private String filePath;
	/**
	 * 彩种
	 */
	private Integer lotteryCode;
	/**
	 * 子玩法
	 */
	private Integer lotteryChildCode;
	/**
	 * 上传类型没举
	 */
	private Short uploadType;
	
	/**
	 * 彩期
	 */
	private String issueCode;
	
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 是否第一次上传
	 */
	private Boolean flag;
	
	/**
	 * 选择的赛事信息
	 */
	private String selectedMatchs;
	/**
	 * 转换对照器
	 */
	private Map<String, String> transfer;
	
	private String secondFileName;
	
	public String getSecondFileName() {
		return secondFileName;
	}
	public void setSecondFileName(String secondFileName) {
		this.secondFileName = secondFileName;
	}
	public Map<String, String> getTransfer() {
		return transfer;
	}
	public void setTransfer(Map<String, String> transfer) {
		this.transfer = transfer;
	}
	public String getSelectedMatchs() {
		return selectedMatchs;
	}
	public void setSelectedMatchs(String selectedMatchs) {
		this.selectedMatchs = selectedMatchs;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public String getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public Short getUploadType() {
		return uploadType;
	}
	public void setUploadType(Short uploadType) {
		this.uploadType = uploadType;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getPlayCode() {
		return playCode;
	}
	public void setPlayCode(String playCode) {
		this.playCode = playCode;
	}
	public String getShiftContent() {
		return shiftContent;
	}
	public void setShiftContent(String shiftContent) {
		this.shiftContent = shiftContent;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("token", token)
				.append("playCode", playCode)
				.append("shiftContent", shiftContent)
				.append("filePath", filePath)
				.append("lotteryCode", lotteryCode)
				.append("lotteryChildCode", lotteryChildCode)
				.append("uploadType", uploadType)
				.append("issueCode", issueCode)
				.append("userId", userId)
				.append("flag", flag)
				.append("selectedMatchs", selectedMatchs)
				.append("transfer", transfer)
				.append("secondFileName", secondFileName)
				.toString();
	}
}
