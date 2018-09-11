package com.hhly.skeleton.cms.ordermgr.vo;

public class OrderGroupLotteryVO extends OrderGroupCommonVO {

	private Integer lotteryCode;

	private String orderCode;
	
	//中奖状态
	private Integer winStatus;

	/**
	 * 1.下单 2.开奖 3.重置开奖
	 */
	private Integer type;

	public OrderGroupLotteryVO(Integer userId, Integer lotteryCode) {
		super(userId);
		this.lotteryCode = lotteryCode;
	}

	public OrderGroupLotteryVO() {
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getWinStatus() {
		return winStatus;
	}

	public void setWinStatus(Integer winStatus) {
		this.winStatus = winStatus;
	}

}
