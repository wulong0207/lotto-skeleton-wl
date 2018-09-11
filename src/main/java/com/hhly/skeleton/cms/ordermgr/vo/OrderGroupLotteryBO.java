package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.bo.BaseBO;

public class OrderGroupLotteryBO extends BaseBO {
	
	private Integer userId;
	private Integer lotteryCode;
	private String orderCode;
	private double orderAmount;
	private double winAmount;
	private double commissionAmount;
	//中奖状态  0未中奖 1中奖
	private Integer winStatus;  
	
	/**
	 * 1. 下单
	 * 2.开奖
	 * 3.重置开奖
	 * 4.合买任务
	 */
	private int type;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public double getWinAmount() {
		return winAmount;
	}
	public void setWinAmount(double winAmount) {
		this.winAmount = winAmount;
	}
	public double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Integer getWinStatus() {
		return winStatus;
	}
	public void setWinStatus(Integer winStatus) {
		this.winStatus = winStatus;
	}
	
	


		
}
