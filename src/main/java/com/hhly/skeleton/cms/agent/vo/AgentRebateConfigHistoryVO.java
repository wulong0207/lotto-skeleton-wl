package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class AgentRebateConfigHistoryVO extends BaseVO{
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date configCreateTime;
	
	private List<AgentRebateConfigVO> configs;

	public Date getConfigCreateTime() {
		return configCreateTime;
	}

	public void setConfigCreateTime(Date configCreateTime) {
		this.configCreateTime = configCreateTime;
	}

	public List<AgentRebateConfigVO> getConfigs() {
		return configs;
	}

	public void setConfigs(List<AgentRebateConfigVO> configs) {
		this.configs = configs;
	}
	
 }
