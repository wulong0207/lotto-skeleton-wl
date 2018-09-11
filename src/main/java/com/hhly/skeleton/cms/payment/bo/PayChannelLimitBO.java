package com.hhly.skeleton.cms.payment.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class PayChannelLimitBO extends BaseBO {

	private Integer id;

	private Integer payChannelMgrId;

	private Double limittime;

	private Double limitday;

	private Double limitmonth;

	private Integer payType;

	private Integer cardType;

	private String remark;

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

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
