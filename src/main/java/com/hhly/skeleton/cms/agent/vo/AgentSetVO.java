package com.hhly.skeleton.cms.agent.vo;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class AgentSetVO extends PageVO {
	
	private Integer id;
	private Integer agentId;
	// 用户账号
	private String accountName;
	// 真实姓名
	private String actualName;
	// 用户手机
	private String cusMobile;
	// 代理编码
	private String agentCode;
	// 本月直属会员返佣
	private double monthDirectIncome;
	// 本月代理会员返佣
	private double monthAgentIncome;
	// 代理钱包
	private double agentWallet;
	// 代理状态
	private Integer agentStatus;
	
	public AgentSetVO(){}
	public AgentSetVO(Integer agentId){
		this.agentId = agentId;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAgentId() {
		return agentId;
	}
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getCusMobile() {
		return cusMobile;
	}
	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public double getMonthDirectIncome() {
		return monthDirectIncome;
	}
	public void setMonthDirectIncome(double monthDirectIncome) {
		this.monthDirectIncome = monthDirectIncome;
	}
	public double getMonthAgentIncome() {
		return monthAgentIncome;
	}
	public void setMonthAgentIncome(double monthAgentIncome) {
		this.monthAgentIncome = monthAgentIncome;
	}
	public double getAgentWallet() {
		return agentWallet;
	}
	public void setAgentWallet(double agentWallet) {
		this.agentWallet = agentWallet;
	}
	public Integer getAgentStatus() {
		return agentStatus;
	}
	public void setAgentStatus(Integer agentStatus) {
		this.agentStatus = agentStatus;
	}
	
	

}
