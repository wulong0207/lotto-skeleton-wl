package com.hhly.skeleton.cms.transmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class TransChannelSettleVO extends PageVO {
	
	private static final long serialVersionUID = -3177974134103205042L;
  // 自定义流水结算流水编号
  private String transChannelSettleCode;
  // 渠道名称
  private String channelName;
  // 结算状态
  private Short settleStatus;
  // 结算类型
  private Short settleType;
	private Integer searchTimeType;
	private Date startTime;
	private Date endTime;
	// 用户id
	private Long channelId;
	// 修改人
	private String modifyBy;
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
	public Integer getSearchTimeType() {
		return searchTimeType;
	}
	public void setSearchTimeType(Integer searchTimeType) {
		this.searchTimeType = searchTimeType;
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
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
}