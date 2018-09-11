package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.CoOperateEnum;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 渠道订单列表
 *
 * @author huangchengfang1219
 * @date 2018年3月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelOrderBO extends BaseBO {

	private static final long serialVersionUID = -5879530811988800011L;

	/**
	 * 本站兑换码
	 */
	private String myCdkey;

	/**
	 * 兑换码过期时间
	 */
	@JsonIgnore
	private Date exchangeOverTime;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	/**
	 * 订单编号
	 */
	private String orderCode;

	/**
	 * 账号
	 */
	private String accountName;

	/**
	 * 手机号
	 */
	private String cusMobile;

	/**
	 * 兑换码状态
	 */
	@JsonIgnore
	private Short cdkeyStatus;

	/**
	 * 订单状态
	 */
	@JsonIgnore
	private Short orderStatus;

	/**
	 * 中奖状态
	 */
	@JsonIgnore
	private Short winningStatus;

	/**
	 * 订单状态
	 */
	private Short status;

	/**
	 * 税前奖金
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double preBonus;

	/**
	 * 交易时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date exchangeTime;

	public String getMyCdkey() {
		return myCdkey;
	}

	public void setMyCdkey(String myCdkey) {
		this.myCdkey = myCdkey;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Date getExchangeOverTime() {
		return exchangeOverTime;
	}

	public void setExchangeOverTime(Date exchangeOverTime) {
		this.exchangeOverTime = exchangeOverTime;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public Short getCdkeyStatus() {
		return cdkeyStatus;
	}

	public void setCdkeyStatus(Short cdkeyStatus) {
		this.cdkeyStatus = cdkeyStatus;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getStatusText() {
		CoOperateEnum.ChannelOrderStatus channelOrderStatus = CoOperateEnum.ChannelOrderStatus.valueOf(status);
		return channelOrderStatus == null ? null : channelOrderStatus.getName();
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Date getExchangeTime() {
		return exchangeTime;
	}

	public void setExchangeTime(Date exchangeTime) {
		this.exchangeTime = exchangeTime;
	}

}
