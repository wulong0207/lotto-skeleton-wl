package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

public class DayIncomeVO extends PageVO{
	
	private Integer id;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date dt;
	private double directBuyCount;
	private double directBuyTimes;
	private double directBuyMoney;
	private double todayDirectIncome;
	
	private double agentBuyCount;
	private double agentBuyTimes;
	private double agentBuyMoney;
	private double todayAgentIncome;
	
	private double todayIncome;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
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

	public double getTodayDirectIncome() {
		return todayDirectIncome;
	}

	public void setTodayDirectIncome(double todayDirectIncome) {
		this.todayDirectIncome = todayDirectIncome;
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

	public double getTodayAgentIncome() {
		return todayAgentIncome;
	}

	public void setTodayAgentIncome(double todayAgentIncome) {
		this.todayAgentIncome = todayAgentIncome;
	}

	public double getTodayIncome() {
		return todayIncome;
	}

	public void setTodayIncome(double todayIncome) {
		this.todayIncome = todayIncome;
	}
	
}
