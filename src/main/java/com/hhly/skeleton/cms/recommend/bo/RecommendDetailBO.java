package com.hhly.skeleton.cms.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RecommendDetailBO extends BaseBO {

	private Integer id;
	private String rcmdCode;
	private Integer lotteryChildCode;
	private String lotteryChildName;
	private Integer passWay;
	private String planContext;
	private Integer planNumber;
	private double planAmount;
	private double winningAmount;
	private String screens;
	private String maxScreens;
	private String minScreens;
	private String actualResult;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRcmdCode() {
		return rcmdCode;
	}
	public void setRcmdCode(String rcmdCode) {
		this.rcmdCode = rcmdCode;
	}
	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public String getLotteryChildName() {
		return lotteryChildName;
	}
	public void setLotteryChildName(String lotteryChildName) {
		this.lotteryChildName = lotteryChildName;
	}
	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}
	public String getPlanContext() {
		return planContext;
	}
	public void setPlanContext(String planContext) {
		this.planContext = planContext;
	}
	public Integer getPlanNumber() {
		return planNumber;
	}
	public void setPlanNumber(Integer planNumber) {
		this.planNumber = planNumber;
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
	public String getScreens() {
		return screens;
	}
	public void setScreens(String screens) {
		this.screens = screens;
	}
	public String getMaxScreens() {
		return maxScreens;
	}
	public void setMaxScreens(String maxScreens) {
		this.maxScreens = maxScreens;
	}
	public String getMinScreens() {
		return minScreens;
	}
	public void setMinScreens(String minScreens) {
		this.minScreens = minScreens;
	}
	public String getActualResult() {
		return actualResult;
	}
	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}
	
	
	
}
