package com.hhly.skeleton.cms.ticketmgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class TicketConfigVO extends PageVO {

	@Group({ UPD })
	@NotNull(msg = "主键ID")
	private Integer id;

	@Group({ ADD })
	@NotNull(msg = "渠道ID")
	@LenRange(min = 1, max = 20, msg = "渠道ID")
	private String ticketChannelId;

	@Group({ ADD, UPD })
	@NotNull(msg = "彩种")
	private Integer lotteryCode;

	@Group({ ADD, UPD })
	@NotNull(msg = "出票状态")
	@Range(min = 0, max = 1, msg = "出票状态")
	private Short sendStatus;

	@Group({ ADD, UPD })
	@NotNull(msg = "批次号前缀")
	@LenRange(min = 1, max = 20, msg = "批次号前缀")
	private String preBatch;

	@Group({ ADD, UPD })
	@NotNull(msg = "第三方票号前缀")
	@LenRange(min = 1, max = 20, msg = "第三方票号前缀")
	private String preTicket;

	@Group({ ADD, UPD })
	@NotNull(msg = "送票权重")
	private Short sendWeight;

	@Group({ ADD, UPD })
	@NotNull(msg = "每次发送票的数量")
	private Short sendEachBatch;

	@Group({ ADD, UPD })
	@NotNull(msg = "开启线程数")
	private Short threadCount;

	@Group({ ADD, UPD })
	@NotNull(msg = "是否主动查票")
	@Range(min = 0, max = 1, msg = "是否主动查票")
	private Short searchAuto;

	private String searchIdent;

	@Group({ ADD, UPD })
	@NotNull(msg = "查票最大票数")
	private Short searchMaxTicket;
	
	private String endSendSpace;
	
	@Group({ ADD, UPD })
	@NotNull(msg = "送票间隔（前）")
	private String beforeTime;
	
	@Group({ ADD, UPD })
	@NotNull(msg = "送票间隔（分割）")
	private String interval;
	
	@Group({ ADD, UPD })
	@NotNull(msg = "送票间隔（后）")
	private String afterTime;

	@Group({ ADD, UPD })
	@NotNull(msg = "允许送票时间时间段")
	@LenRange(min = 1, max = 300, msg = "允许送票时间时间段")
	private String allowSendTime;

	@Group({ ADD, UPD })
	@LenRange(min = 1, max = 300, msg = "停售玩法")
	private String stopLottery;
	
	private Integer dealerEndTime; 

	private String remark;

	private String createBy;

	private String modifyBy;

	private Date modifyTime;

	private Date updateTime;

	private Date createTime;
	
	private Integer startMoney;
	
	private Integer endMoeny;

	// 彩种类型
	private Short lotteryCategory;
	
	

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

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public String getEndSendSpace() {
		return endSendSpace;
	}

	public void setEndSendSpace(String endSendSpace) {
		this.endSendSpace = endSendSpace;
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