package com.hhly.skeleton.cms.report.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class AgentSearchVO extends PageVO {

	private Integer agentId;
	// 1 表示业务 2表示代理
	private Integer type;
	@DateTimeFormat(pattern = "yy-MM")
	private Date month;
	// 近N天 N
	private Integer limit;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

}
