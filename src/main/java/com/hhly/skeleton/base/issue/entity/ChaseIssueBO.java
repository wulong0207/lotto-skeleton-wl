package com.hhly.skeleton.base.issue.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 返回彩种期号信息
 * 
 * @author HouXB
 *
 */
@SuppressWarnings("serial")
public class ChaseIssueBO extends BaseBO {
	
	public ChaseIssueBO(){}
	
	public ChaseIssueBO(String issueCode,Date lotteryTime){
		this.issueCode = issueCode;
		this.lotteryTime = lotteryTime;
	}

	/**
	 * 彩期期号
	 */
	private String issueCode;
	/**
	 * 彩票开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;
	public String getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}
	public Date getLotteryTime() {
		return lotteryTime;
	}
	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}
	
	
	
}
