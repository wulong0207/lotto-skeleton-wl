package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class AgentIncomeVO extends PageVO {
	
	private String accountName;
	private Integer agentId;
	private Date startTime;
	private Date endTime;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	
	
}
