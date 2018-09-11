package com.hhly.skeleton.cms.cooperate.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class CooperateChannelVO extends PageVO {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 商户渠道名称
	 */
	private String cooperateName;

	/**
	 * 账户余额
	 */
	private Double balance;

	/**
	 * 单笔充值限额
	 */
	private Double singleRechargeAmount;

	/**
	 * 充值类型
	 */
	private Short rechargeType;

	/**
	 * 商户渠道id
	 */
	private String marketChannelId;

	/**
	 * 出票渠道;1,福彩积分兑换;2,体彩积分兑换
	 */
	private String ticketChannel;

	/**
	 * 操作时间
	 */
	private Date actionTime;

	/**
	 * 合作开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cooperateBeginTime;

	/**
	 * 合作结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date cooperateEndTime;

	/**
	 * 是否启动，0,启动;1,停止
	 */
	private Integer isStop;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 修改人
	 */
	private String modifyBy;

	/**
	 * 渠道密码
	 */
	private String key;

	/**
	 * 结算类型
	 */
	private Integer settlementType;

	/**
	 * 商户类别
	 */
	private Integer type;

	/**
	 * 登录密码
	 */
	private String password;

	/**
	 * 盐值
	 */
	private String rcode;

	/**
	 * 是否合作结束
	 */
	private Integer isOver;

	public Integer getIsOver() {
		return isOver;
	}

	public void setIsOver(Integer isOver) {
		this.isOver = isOver;
	}

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Integer settlementType) {
		this.settlementType = settlementType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMarketChannelId() {
		return marketChannelId;
	}

	public void setMarketChannelId(String marketChannelId) {
		this.marketChannelId = marketChannelId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCooperateName() {
		return cooperateName;
	}

	public void setCooperateName(String cooperateName) {
		this.cooperateName = cooperateName == null ? null : cooperateName.trim();
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getSingleRechargeAmount() {
		return singleRechargeAmount;
	}

	public void setSingleRechargeAmount(Double singleRechargeAmount) {
		this.singleRechargeAmount = singleRechargeAmount;
	}

	public Short getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Short rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getTicketChannel() {
		return ticketChannel;
	}

	public void setTicketChannel(String ticketChannel) {
		this.ticketChannel = ticketChannel == null ? null : ticketChannel.trim();
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public Date getCooperateBeginTime() {
		return cooperateBeginTime;
	}

	public void setCooperateBeginTime(Date cooperateBeginTime) {
		this.cooperateBeginTime = cooperateBeginTime;
	}

	public Date getCooperateEndTime() {
		return cooperateEndTime;
	}

	public void setCooperateEndTime(Date cooperateEndTime) {
		this.cooperateEndTime = cooperateEndTime;
	}

	public Integer getIsStop() {
		return isStop;
	}

	public void setIsStop(Integer isStop) {
		this.isStop = isStop;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy == null ? null : modifyBy.trim();
	}
}