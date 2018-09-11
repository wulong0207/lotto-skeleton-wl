package com.hhly.skeleton.cms.transmgr.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class TransChannelSettleBO extends BaseBO {
	private static final long serialVersionUID = 8261639702982491341L;
	// 自增长主键
  private BigDecimal id;
  // 自定义流水结算流水编号
  private String transChannelSettleCode;
  // 渠道名称
  private String channelName;
  // 渠道自定义ID
  private String channelId;
  // 应结佣金
  private Double settleCommission;
  // 结算状态
  private Short settleStatus;
  // 结算类型
  private Short settleType;
  // 结算总量
  private Double settleCount;
  // 结算费率
  private Double settleRate;
  // 结算开始时间
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date settleStartTime;
  // 结算结束时间
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date settleEndTime;
  // 结算时间
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date settleTime;
  // sendTime
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date sendTime;
  // 修改时间
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date modifyTime;
  // 
  // 修改人
  private String modifyBy;
  // 创建人
  private String createBy;
  // 更新时间
  //private Date updateTime;
  // 创建时间
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;
  // 备注
  private String remark;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getTransChannelSettleCode() {
		return transChannelSettleCode;
	}
	public void setTransChannelSettleCode(String transChannelSettleCode) {
		this.transChannelSettleCode = transChannelSettleCode;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Double getSettleCommission() {
		return settleCommission;
	}
	public void setSettleCommission(Double settleCommission) {
		this.settleCommission = settleCommission;
	}
	public Short getSettleStatus() {
		return settleStatus;
	}
	public void setSettleStatus(Short settleStatus) {
		this.settleStatus = settleStatus;
	}
	public Short getSettleType() {
		return settleType;
	}
	public void setSettleType(Short settleType) {
		this.settleType = settleType;
	}
	public Double getSettleCount() {
		return settleCount;
	}
	public void setSettleCount(Double settleCount) {
		this.settleCount = settleCount;
	}
	public Double getSettleRate() {
		return settleRate;
	}
	public void setSettleRate(Double settleRate) {
		this.settleRate = settleRate;
	}
	public Date getSettleStartTime() {
		return settleStartTime;
	}
	public void setSettleStartTime(Date settleStartTime) {
		this.settleStartTime = settleStartTime;
	}
	public Date getSettleEndTime() {
		return settleEndTime;
	}
	public void setSettleEndTime(Date settleEndTime) {
		this.settleEndTime = settleEndTime;
	}
	public Date getSettleTime() {
		return settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
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
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
}