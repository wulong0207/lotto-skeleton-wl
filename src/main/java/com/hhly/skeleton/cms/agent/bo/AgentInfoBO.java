package com.hhly.skeleton.cms.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class AgentInfoBO extends BaseBO {

	private Integer id;
	private Integer userId;
	private Integer agentStatus;

	public AgentInfoBO(){}
	
	public AgentInfoBO(Integer agentStatus){
		this.agentStatus = agentStatus;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(Integer agentStatus) {
		this.agentStatus = agentStatus;
	}

}
