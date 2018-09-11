package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc CMS充值VO
 * @author xiongJinGang
 * @date 2017年7月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CmsRechargeVO extends BaseBO {
	private Integer userId;// 会员Id
	private Double rechargeAmount;// 充值金额
	private Short rechargeType;// 交易类型 1、充值现金；2、充值彩金红包
	private String rechargeRemark;// 充值描述
	private String operator;// 操作人
	private Short tradeType;// 参考PayConstants.TransTypeEnum所有入账的交易

	// 活动相关
	private String rechargeCode;// 充值流水编号
	private String activityCode;// 活动编号
	private String orderInfo;// 用于存交易流水的详细信息

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Short getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Short rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getRechargeRemark() {
		return rechargeRemark;
	}

	public void setRechargeRemark(String rechargeRemark) {
		this.rechargeRemark = rechargeRemark;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRechargeCode() {
		return rechargeCode;
	}

	public void setRechargeCode(String rechargeCode) {
		this.rechargeCode = rechargeCode;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Short getTradeType() {
		return tradeType;
	}

	public void setTradeType(Short tradeType) {
		this.tradeType = tradeType;
	}

	@Override
	public String toString() {
		return "CmsRechargeVO [userId=" + userId + ", rechargeAmount=" + rechargeAmount + ", rechargeType=" + rechargeType + ", rechargeRemark=" + rechargeRemark + ", operator=" + operator + ", rechargeCode=" + rechargeCode + ", activityCode="
				+ activityCode + "]";
	}

}
