package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.BaseVO;

public class MonthIncomeVO extends BaseVO{
	private Integer id;
	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	private Date mt;
	private Integer agentId;
	private double directBuyCount;
	private double directBuyTimes;
	private double directBuyMoney;
	private double directRation;
	private double directIncome;
	
	private double agentBuyCount;
	private double agentBuyTimes;
	private double agentBuyMoney;
	private double agentRation;
	private double agentIncome;
	
	private String accountName;
	private Integer userId;
	private double monthIncome;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMt() {
		return mt;
	}
	public void setMt(Date mt) {
		this.mt = mt;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public double getDirectBuyCount() {
		return directBuyCount;
	}
	public void setDirectBuyCount(double directBuyCount) {
		this.directBuyCount = directBuyCount;
	}
	public double getDirectBuyTimes() {
		return directBuyTimes;
	}
	public void setDirectBuyTimes(double directBuyTimes) {
		this.directBuyTimes = directBuyTimes;
	}
	public double getDirectBuyMoney() {
		return directBuyMoney;
	}
	public void setDirectBuyMoney(double directBuyMoney) {
		this.directBuyMoney = directBuyMoney;
	}
	public double getDirectRation() {
		return directRation;
	}
	public void setDirectRation(double directRation) {
		this.directRation = directRation;
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
	public double getAgentBuyTimes() {
		return agentBuyTimes;
	}
	public void setAgentBuyTimes(double agentBuyTimes) {
		this.agentBuyTimes = agentBuyTimes;
	}
	public double getAgentBuyMoney() {
		return agentBuyMoney;
	}
	public void setAgentBuyMoney(double agentBuyMoney) {
		this.agentBuyMoney = agentBuyMoney;
	}
	public double getAgentRation() {
		return agentRation;
	}
	public void setAgentRation(double agentRation) {
		this.agentRation = agentRation;
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
