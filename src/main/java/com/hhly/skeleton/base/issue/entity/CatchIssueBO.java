package com.hhly.skeleton.base.issue.entity;

import java.util.Date;

/**
 * 
 * @desc 抓取彩期信息
 * @author jiangwei
 * @date 2017年4月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CatchIssueBO {
	/**
	 * 彩期
	 */
	private String issueCode;
	/**
	 * 开始销售时间
	 */
	private Date startTime;
	/**
	 * 结束销售时间
	 */
	private Date endTime;
	/**
	 * 开奖时间
	 */
	private Date prizeTime;
	
	

	public CatchIssueBO(String issueCode, Date startTime, Date endTime, Date prizeTime) {
		super();
		this.issueCode = issueCode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.prizeTime = prizeTime;
	}
	
	public CatchIssueBO() {

	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getPrizeTime() {
		return prizeTime;
	}

	public void setPrizeTime(Date prizeTime) {
		this.prizeTime = prizeTime;
	}

}
