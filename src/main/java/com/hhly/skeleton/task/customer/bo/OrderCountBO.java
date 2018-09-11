package com.hhly.skeleton.task.customer.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OrderCountBO extends BaseBO{
	private Integer userId;
	private String orderCode;
	
	private double aftBonus;
	
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * 购彩金额
	 */
	private Double orderAmount ;
	/**
	 * 购彩次数
	 */
	private Integer orderNum ;
	
	/**
	 * 中奖金额
	 */
	private Double preBonus;
	
	/**
	 * 中奖次数
	 */
	private Integer aftNum ;
	/**
	 * 1：代购；2：追号；3：合买
	 */
	private Short buyType;
	/**
	 * 彩种类型
	 */
	private Integer lotteryCode;
	/**
	 * 提成金额
	 */
	private Double joinCommissionAmount;
	/**
	 * 实购金额
	 */
	private Double joinBuyMoney;
	/**
	 * 实际派送金额（减去提成后的金额）
	 */
	private Double joinIncomeMoney;
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}


	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Integer getAftNum() {
		return aftNum;
	}

	public void setAftNum(Integer aftNum) {
		this.aftNum = aftNum;
	}

	public Double getJoinCommissionAmount() {
		return joinCommissionAmount;
	}

	public void setJoinCommissionAmount(Double joinCommissionAmount) {
		this.joinCommissionAmount = joinCommissionAmount;
	}

	public Double getJoinBuyMoney() {
		return joinBuyMoney;
	}

	public void setJoinBuyMoney(Double joinBuyMoney) {
		this.joinBuyMoney = joinBuyMoney;
	}

	public Double getJoinIncomeMoney() {
		return joinIncomeMoney;
	}

	public void setJoinIncomeMoney(Double joinIncomeMoney) {
		this.joinIncomeMoney = joinIncomeMoney;
	}

	public double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(double aftBonus) {
		this.aftBonus = aftBonus;
	}	
	
}
