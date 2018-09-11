package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateMarketChannelBO extends BaseBO{
    

	private Integer id;

    private String channelId;

    private String channelName;

    private Short terminalPlatform;

    private String parentChannelId;

    private Short grade;

    private Short settlementType;

    private String resourceUrl;

    private Double settlementRate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date coopStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date coopEndTime;

    private Short channelStatus;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    private String modifyBy;

    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String remark;
    
    private String resourceName;

	/**
	 * 是否为马甲包0：否；1：是
	 */
	private Integer majia;
	
	/**
	 * 渠道秘钥
	 */
	private String secretKey;
    
    

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Short getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(Short terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public String getParentChannelId() {
		return parentChannelId;
	}

	public void setParentChannelId(String parentChannelId) {
		this.parentChannelId = parentChannelId;
	}

	public Short getGrade() {
		return grade;
	}

	public void setGrade(Short grade) {
		this.grade = grade;
	}

	public Short getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Short settlementType) {
		this.settlementType = settlementType;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	

	public Double getSettlementRate() {
		return settlementRate;
	}

	public void setSettlementRate(Double settlementRate) {
		this.settlementRate = settlementRate;
	}

	public Date getCoopStartTime() {
		return coopStartTime;
	}

	public void setCoopStartTime(Date coopStartTime) {
		this.coopStartTime = coopStartTime;
	}

	public Date getCoopEndTime() {
		return coopEndTime;
	}

	public void setCoopEndTime(Date coopEndTime) {
		this.coopEndTime = coopEndTime;
	}

	public Short getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(Short channelStatus) {
		this.channelStatus = channelStatus;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getMajia() {
		return majia;
	}

	public void setMajia(Integer majia) {
		this.majia = majia;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
}