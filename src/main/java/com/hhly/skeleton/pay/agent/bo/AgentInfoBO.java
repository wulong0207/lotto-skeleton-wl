package com.hhly.skeleton.pay.agent.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 代理信息表
 * @author xiongJinGang
 * @date 2018年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class AgentInfoBO extends BaseBO {
	private Integer id;

	private Integer userId;

	private String agentCode;

	private Integer parentAgentId;

	private Short agentLevel;

	private Short agentStatus;

	private Date agentTime;

	private Double agentWallet;

	private Date updateTime;

	private String remark;

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

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public Integer getParentAgentId() {
		return parentAgentId;
	}

	public void setParentAgentId(Integer parentAgentId) {
		this.parentAgentId = parentAgentId;
	}

	public Short getAgentLevel() {
		return agentLevel;
	}

	public void setAgentLevel(Short agentLevel) {
		this.agentLevel = agentLevel;
	}

	public Short getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(Short agentStatus) {
		this.agentStatus = agentStatus;
	}

	public Date getAgentTime() {
		return agentTime;
	}

	public void setAgentTime(Date agentTime) {
		this.agentTime = agentTime;
	}

	public Double getAgentWallet() {
		return agentWallet;
	}

	public void setAgentWallet(Double agentWallet) {
		this.agentWallet = agentWallet;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}