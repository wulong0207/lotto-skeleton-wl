package com.hhly.skeleton.task.sport.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 竞技彩对阵信息表
 * @author huangb
 * @date 2017年6月6日
 * @company 益彩网络
 * @version v1.0
 */
public class SportAgainstInfoVO extends BaseBO {

	private static final long serialVersionUID = 7885651418301239572L;
	/**
	 * 彩种
	 */
	private Integer lotteryCode;
	/**
	 * 彩期
	 */
	private String issueCode;
	/**
	 * 竞技彩场次集合，逗号分割
	 */
	private String systemCodes;
	/**
	 * 竞技彩场次集合
	 */
	private List<String> systemCodeList;

	public SportAgainstInfoVO() {
	}

	public SportAgainstInfoVO(Integer lotteryCode, String issueCode) {
		this.lotteryCode = lotteryCode;
		this.issueCode = issueCode;
	}

	public SportAgainstInfoVO(Integer lotteryCode, String issueCode, List<String> systemCodeList) {
		this(lotteryCode, issueCode);
		this.systemCodeList = systemCodeList;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getSystemCodes() {
		return systemCodes;
	}

	public void setSystemCodes(String systemCodes) {
		this.systemCodes = systemCodes;
	}

	public List<String> getSystemCodeList() {
		return systemCodeList;
	}

	public void setSystemCodeList(List<String> systemCodeList) {
		this.systemCodeList = systemCodeList;
	}

}