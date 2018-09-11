package com.hhly.skeleton.lotto.base.cooperate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class CoOperateCdkeyExchangeBO extends BaseBO{

	private static final long serialVersionUID = 7327043703552090097L;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	
	/**
	 * 兑换数量
	 */
	private Integer exchangeNum;
	
	/**
	 * 彩种名称
	 */
	private String lotteryName;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getExchangeNum() {
		return exchangeNum;
	}

	public void setExchangeNum(Integer exchangeNum) {
		this.exchangeNum = exchangeNum;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	
	
}
