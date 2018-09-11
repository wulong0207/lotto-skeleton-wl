package com.hhly.skeleton.cms.ticketmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class TicketConfigBO extends BaseBO {
	private Integer id;

	private String ticketChannelId;

	private Integer lotteryCode;

	private Short sendStatus;

	private String preBatch;

	private String preTicket;

	private Short sendWeight;

	private Short sendEachBatch;

	private Short threadCount;

	private Short searchAuto;

	private String searchIdent;

	private Short searchMaxTicket;

	private String endSendSpace;

	private String allowSendTime;

	private String stopLottery;
	
	private Integer dealerEndTime;

	private String remark;

	private String createBy;

	private String modifyBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	private String drawerName;

	private String stopLotteryName;
	

	private String beforeTime;

	private String interval;
	
	private String afterTime;
	
	private Integer startMoney;
	
	private Integer endMoeny;
	

	public Integer getStartMoney() {
		return startMoney;
	}

	public void setStartMoney(Integer startMoney) {
		this.startMoney = startMoney;
	}

	public Integer getEndMoeny() {
		return endMoeny;
	}

	public void setEndMoeny(Integer endMoeny) {
		this.endMoeny = endMoeny;
	}

	public String getBeforeTime() {
		return beforeTime;
	}

	public void setBeforeTime(String beforeTime) {
		this.beforeTime = beforeTime;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getAfterTime() {
		return afterTime;
	}

	public void setAfterTime(String afterTime) {
		this.afterTime = afterTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTicketChannelId() {
		return ticketChannelId;
	}

	public void setTicketChannelId(String ticketChannelId) {
		this.ticketChannelId = ticketChannelId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getSendStatus() {
		return sendStatus;
	}

	public void setSendStatus(Short sendStatus) {
		this.sendStatus = sendStatus;
	}

	public String getPreBatch() {
		return preBatch;
	}

	public void setPreBatch(String preBatch) {
		this.preBatch = preBatch;
	}

	public String getPreTicket() {
		return preTicket;
	}

	public void setPreTicket(String preTicket) {
		this.preTicket = preTicket;
	}

	public Short getSendWeight() {
		return sendWeight;
	}

	public void setSendWeight(Short sendWeight) {
		this.sendWeight = sendWeight;
	}

	public Short getSendEachBatch() {
		return sendEachBatch;
	}

	public void setSendEachBatch(Short sendEachBatch) {
		this.sendEachBatch = sendEachBatch;
	}

	public Short getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(Short threadCount) {
		this.threadCount = threadCount;
	}

	public Short getSearchAuto() {
		return searchAuto;
	}

	public void setSearchAuto(Short searchAuto) {
		this.searchAuto = searchAuto;
	}

	public String getSearchIdent() {
		return searchIdent;
	}

	public void setSearchIdent(String searchIdent) {
		this.searchIdent = searchIdent;
	}

	public Short getSearchMaxTicket() {
		return searchMaxTicket;
	}

	public void setSearchMaxTicket(Short searchMaxTicket) {
		this.searchMaxTicket = searchMaxTicket;
	}

	public String getEndSendSpace() {
		return endSendSpace;
	}

	public void setEndSendSpace(String endSendSpace) {
		this.endSendSpace = endSendSpace;
	}

	public String getAllowSendTime() {
		return allowSendTime;
	}

	public void setAllowSendTime(String allowSendTime) {
		this.allowSendTime = allowSendTime;
	}

	public String getStopLottery() {
		return stopLottery;
	}

	public void setStopLottery(String stopLottery) {
		this.stopLottery = stopLottery;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

	public String getDrawerName() {
		return drawerName;
	}

	public void setDrawerName(String drawerName) {
		this.drawerName = drawerName;
	}

	public String getStopLotteryName() {
		return stopLotteryName;
	}

	public void setStopLotteryName(String stopLotteryName) {
		this.stopLotteryName = stopLotteryName;
	}

	/**
	 * @return the dealerEndTime
	 */
	public Integer getDealerEndTime() {
		return dealerEndTime;
	}

	/**
	 * @param dealerEndTime the dealerEndTime to set
	 */
	public void setDealerEndTime(Integer dealerEndTime) {
		this.dealerEndTime = dealerEndTime;
	}

}