package com.hhly.skeleton.cms.agent.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class AgentRebateConfigVO extends BaseVO{
	//中间表信息
	private Integer id;
	private Integer agentId;
	private Date addTime;
	private Integer defaultFlag;
	private String createBy;
	private String updateBy;
	private Date updateTime;
	private String remark;
	
	//配置表中信息
	private Integer configId;
	private Double  directMinMoney;
	private Double directMaxMoney;
	private Double directRatio;
	private Double agentMinMoney;
	private Double agentMaxMoney;
	private Double agentRatio;
	private String configCreateBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date configCreateTime;
	
	public AgentRebateConfigVO(){}
	
	public AgentRebateConfigVO(Integer agentId,Date addTime, Integer defaultFlag,String createBy,String updateBy,Date updateTime){
		this.agentId = agentId;
		this.addTime = addTime;
		this.defaultFlag = defaultFlag;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
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
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Integer getDefaultFlag() {
		return defaultFlag;
	}
	public void setDefaultFlag(Integer defaultFlag) {
		this.defaultFlag = defaultFlag;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
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
	public Integer getConfigId() {
		return configId;
	}
	public void setConfigId(Integer configId) {
		this.configId = configId;
	}
	public Double getDirectMinMoney() {
		return directMinMoney;
	}
	public void setDirectMinMoney(Double directMinMoney) {
		this.directMinMoney = directMinMoney;
	}
	public Double getDirectMaxMoney() {
		return directMaxMoney;
	}
	public void setDirectMaxMoney(Double directMaxMoney) {
		this.directMaxMoney = directMaxMoney;
	}
	public Double getDirectRatio() {
		return directRatio;
	}
	public void setDirectRatio(Double directRatio) {
		this.directRatio = directRatio;
	}
	public Double getAgentMinMoney() {
		return agentMinMoney;
	}
	public void setAgentMinMoney(Double agentMinMoney) {
		this.agentMinMoney = agentMinMoney;
	}
	public Double getAgentMaxMoney() {
		return agentMaxMoney;
	}
	public void setAgentMaxMoney(Double agentMaxMoney) {
		this.agentMaxMoney = agentMaxMoney;
	}
	public Double getAgentRatio() {
		return agentRatio;
	}
	public void setAgentRatio(Double agentRatio) {
		this.agentRatio = agentRatio;
	}
	public String getConfigCreateBy() {
		return configCreateBy;
	}
	public void setConfigCreateBy(String configCreateBy) {
		this.configCreateBy = configCreateBy;
	}
	public Date getConfigCreateTime() {
		return configCreateTime;
	}
	public void setConfigCreateTime(Date configCreateTime) {
		this.configCreateTime = configCreateTime;
	}

	
	
	
	
}
