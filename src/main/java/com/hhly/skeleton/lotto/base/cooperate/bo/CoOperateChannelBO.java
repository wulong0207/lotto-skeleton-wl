package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 渠道
 *
 * @author huangchengfang1219
 * @date 2018年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelBO extends BaseBO {

	private static final long serialVersionUID = -7811989936419878880L;

	/**
	 * cooperate_channel表主键
	 */
	private Integer id;

	/**
	 * 实际渠道ID
	 */
	private String channelId;

	/**
	 * 渠道名称
	 */
	private String channelName;

	/**
	 * 渠道余额
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
	 * 合作开始时间
	 */
	private Date coopStartTime;

	/**
	 * 合作结束时间
	 */
	private Date coopEndTime;

	/**
	 * 渠道状态
	 */
	private Short channelStatus;

	/**
	 * 渠道类型；1,普通商户；2,中介商户
	 */
	private Short type;

	/**
	 * 商户结算类型；1,余额（可欠款）;2,余额（不可欠款）；3,彩种库存
	 */
	private Short settlementType;

	/**
	 * 密钥
	 */
	private String key;

	/**
	 * 渠道登录密码
	 */
	@JsonIgnore
	private String password;

	/**
	 * 密码尾缀随机码
	 */
	@JsonIgnore
	private String rcode;

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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Short settlementType) {
		this.settlementType = settlementType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRcode() {
		return rcode;
	}

	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

}
