package com.hhly.skeleton.pay.channel.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 支付渠道限额
 * @author xiongJinGang
 * @date 2017年12月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayChannelLimitBO extends BaseBO {
	private static final long serialVersionUID = -96964438334613459L;

	private Integer id;
	private Integer payChannelMgrId;// 支付渠道ID,关联pay_channel_mgr表的主键id
	private Double limittime;// 单笔限额(元)
	private Double limitday;// 每日限额(元)
	private Double limitmonth;// 每月限额(元)
	private Short payType;// 渠道支付类型:1网银支付;2快捷支付,3第三方支付
	private Short cardType;// 卡类型:1储蓄卡;2信用卡,3第三方支付
	private String remark;// 备注

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPayChannelMgrId() {
		return payChannelMgrId;
	}

	public void setPayChannelMgrId(Integer payChannelMgrId) {
		this.payChannelMgrId = payChannelMgrId;
	}

	public Double getLimittime() {
		return limittime;
	}

	public void setLimittime(Double limittime) {
		this.limittime = limittime;
	}

	public Double getLimitday() {
		return limitday;
	}

	public void setLimitday(Double limitday) {
		this.limitday = limitday;
	}

	public Double getLimitmonth() {
		return limitmonth;
	}

	public void setLimitmonth(Double limitmonth) {
		this.limitmonth = limitmonth;
	}

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
	}

	public Short getCardType() {
		return cardType;
	}

	public void setCardType(Short cardType) {
		this.cardType = cardType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}