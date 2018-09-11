package com.hhly.skeleton.cms.recommend.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RcSearchBO extends BaseBO{

	private Integer passWay;
	private Date startTime;
	private Date endTime;
	//场数
	private Integer times;
	
	private String rcmdCode;
	
	private Integer userId;
	
	private Integer lotteryChildCode;
	
	private Integer lotteryCode;
	
	//周期类型
	private Integer type;
	
	private String groupBy;
	public RcSearchBO(){}
	
	
	
	public RcSearchBO(Integer passWay){
		this.passWay = passWay;
	}
	
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}



	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}



	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
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
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public String getRcmdCode() {
		return rcmdCode;
	}
	public void setRcmdCode(String rcmdCode) {
		this.rcmdCode = rcmdCode;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}
	
	
}
