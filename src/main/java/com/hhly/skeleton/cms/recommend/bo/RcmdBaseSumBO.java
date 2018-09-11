package com.hhly.skeleton.cms.recommend.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RcmdBaseSumBO extends BaseBO{
	
	
	private Integer id;
	private Integer userId;
	private Integer click;
	private Integer lotteryCode;
	private String lotteryName;
	private Integer lotteryIssue;
	
	private Integer lotteryChildCode;
	private Integer passWay;
	private Integer winningStatus;
	private double planAmount;
	private double winningAmount;
	private double payAmount;
	private Integer payCount;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getLotteryName() {
		return lotteryName;
	}
	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	public Integer getLotteryIssue() {
		return lotteryIssue;
	}
	public void setLotteryIssue(Integer lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}
	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}
	public Integer getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}
	public double getPlanAmount() {
		return planAmount;
	}
	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}
	public double getWinningAmount() {
		return winningAmount;
	}
	public void setWinningAmount(double winningAmount) {
		this.winningAmount = winningAmount;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public Integer getPayCount() {
		return payCount;
	}
	public void setPayCount(Integer payCount) {
		this.payCount = payCount;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
	
	
}
