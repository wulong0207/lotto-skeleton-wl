package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.vo.BaseVO;

public class MonthIncomeExcelVO extends BaseVO{

	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	@ExcelHeader("月份")
	private Date mt;
	@ExcelHeader("账号")
	private String accountName;
	@ExcelHeader("业务投注人数")
	private double directBuyCount;
	@ExcelHeader("业务投注金额")
	private double directBuyMoney;
	@ExcelHeader("业务返佣金额")
	private double directIncome;
	
	@ExcelHeader("代理投注人数")
	private double agentBuyCount;
	@ExcelHeader("代理投注金额")
	private double agentBuyMoney;
	@ExcelHeader("代理返佣金额")
	private double agentIncome;
	@ExcelHeader("累计返佣金额")
	private double monthIncome;
	public Date getMt() {
		return mt;
	}
	public void setMt(Date mt) {
		this.mt = mt;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getDirectBuyCount() {
		return directBuyCount;
	}
	public void setDirectBuyCount(double directBuyCount) {
		this.directBuyCount = directBuyCount;
	}
	public double getDirectBuyMoney() {
		return directBuyMoney;
	}
	public void setDirectBuyMoney(double directBuyMoney) {
		this.directBuyMoney = directBuyMoney;
	}
	public double getDirectIncome() {
		return directIncome;
	}
	public void setDirectIncome(double directIncome) {
		this.directIncome = directIncome;
	}
	public double getAgentBuyCount() {
		return agentBuyCount;
	}
	public void setAgentBuyCount(double agentBuyCount) {
		this.agentBuyCount = agentBuyCount;
	}
	public double getAgentBuyMoney() {
		return agentBuyMoney;
	}
	public void setAgentBuyMoney(double agentBuyMoney) {
		this.agentBuyMoney = agentBuyMoney;
	}
	public double getAgentIncome() {
		return agentIncome;
	}
	public void setAgentIncome(double agentIncome) {
		this.agentIncome = agentIncome;
	}
	public double getMonthIncome() {
		return monthIncome;
	}
	public void setMonthIncome(double monthIncome) {
		this.monthIncome = monthIncome;
	}
	
	
}
