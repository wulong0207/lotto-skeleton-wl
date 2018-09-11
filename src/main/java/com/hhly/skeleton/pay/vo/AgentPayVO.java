package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 代理系统充值
 * @author YiJian
 * @date 2017年7月21日 上午10:12:15
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class AgentPayVO extends BaseVO {

	private static final long serialVersionUID = 1L;

	/**
	 * 账户名
	 */
	private String accountName;

	/**
	 * 真实姓名
	 */
	private String actualName;

	/**
	 * 充值金额
	 */
	private Double amount;

	/**
	 * 代理编码
	 */
	private String agentCode;

	/**
	 * 代理流水号
	 */
	private String agentTradeNo;

	/**
	 * 益彩用户ID
	 */
	private Integer userId;

	/**
	 * 益彩充值流水号
	 */
	private String tradeNo;
	/**
	 * 充值类型 1、充值现金；2、充值红包
	 */
	private Integer rechargeType;
	/**
	 * 充值Id
	 */
	private String channelId;
	private String activityCode;// 活动编号
	private String remark;// 描述

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentTradeNo() {
		return agentTradeNo;
	}

	public void setAgentTradeNo(String agentTradeNo) {
		this.agentTradeNo = agentTradeNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Integer getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Integer rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "AgentPayVO [accountName=" + accountName + ", actualName=" + actualName + ", amount=" + amount + ", agentCode=" + agentCode + ", agentTradeNo=" + agentTradeNo + ", userId=" + userId + ", tradeNo=" + tradeNo + ", rechargeType="
				+ rechargeType + ", channelId=" + channelId + ", activityCode=" + activityCode + "]";
	}

}
