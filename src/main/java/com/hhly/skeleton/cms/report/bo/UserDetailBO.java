package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

@SuppressWarnings("serial")
public class UserDetailBO extends BaseBO {
	@ExcelHeader("用户名")
	private String userName;
	@ExcelHeader("充值金额")
	private double fillAmount;
	@ExcelHeader("投注金额")
	private double orderAmount;
	@ExcelHeader("中奖金额")
	private double winningAmount;
	@ExcelHeader("盈利率")
	private double winningRate;
	@ExcelHeader("流水价值")
	private double waterValue;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getFillAmount() {
		return fillAmount;
	}

	public void setFillAmount(double fillAmount) {
		this.fillAmount = fillAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public double getWinningAmount() {
		return winningAmount;
	}

	public void setWinningAmount(double winningAmount) {
		this.winningAmount = winningAmount;
	}

	public double getWinningRate() {
		return winningRate;
	}

	public void setWinningRate(double winningRate) {
		this.winningRate = winningRate;
	}

	public double getWaterValue() {
		return waterValue;
	}

	public void setWaterValue(double waterValue) {
		this.waterValue = waterValue;
	}

}
