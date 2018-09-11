package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

public class TransUserVO implements Serializable {

	private static final long serialVersionUID = 6375363918869698583L;
	/**
	 *用户登录token
	 */
	private String token;
	private Integer userId;// 用户ID
	/**
	 *关联订单表的订单编号
	 */
	private String orderCode;
	/**
	 *1：充值；2：购彩；3：返奖；4：退款；5：提款；6：其它
	 */
	private Short transType;
	/**
	 *订单信息说明；有相应文档。
	 */
	private String orderInfo;
	/**
	 *交易总金额；现金金额+红包金额+服务费
	 */
	private Double transAmount;
	/**
	 *账户余额
	 */
	private Double totalCashBalance;
	/**
	 *实付现金金额
	 */
	private Double cashAmount;
	/**
	 *所用的红包消费总金额
	 */
	private Double redTransAmount;
	/**
	 *0：交易失败；1：交易成功；
	 */
	private Short transStatus;
	/**
	 *渠道表ID；取渠道ID，订单来源
	 */
	private String channelId;
	/**
	 *第三方返回的订单编号
	 */
	private String thirdTransId;
	/**
	 *服务费
	 */
	private Double serviceCharge;
	/**
	 * 使用80%金额
	 */
	private Double amount80;
	/**
	 * 使用20%金额
	 */
	private Double amount20;
	/**
	 * 使用中奖金额
	 */
	private Double amountWin;
	/**
	 * 使用红包编号 2017-07-12 添加，用户撤单生成相应的红包
	 */
	private String redCode;
	/**
	 * 流水编号，可以是充值编号、提款编号等，存的是自己内部其它交易表的编号
	 */
	private String tradeCode;
	private String remark;// 描述
	private Short sourceType;// 交易来源 1直接充值、2即买即付、3人工充值、4代理充值 2017-11-08号添加
	/**
	 * 剩余红包总余额
	 */
	private Double totalRedBalance;

	public TransUserVO() {
		super();
	}

	public TransUserVO(Integer userId, String orderCode, Short transType, Short transStatus) {
		super();
		this.userId = userId;
		this.orderCode = orderCode;
		this.transType = transType;
		this.transStatus = transStatus;
	}

	public TransUserVO(String orderCode, Short transType, Short transStatus) {
		super();
		this.orderCode = orderCode;
		this.transType = transType;
		this.transStatus = transStatus;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Double getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(Double cashAmount) {
		this.cashAmount = cashAmount;
	}

	public Double getRedTransAmount() {
		return redTransAmount;
	}

	public void setRedTransAmount(Double redTransAmount) {
		this.redTransAmount = redTransAmount;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getThirdTransId() {
		return thirdTransId;
	}

	public void setThirdTransId(String thirdTransId) {
		this.thirdTransId = thirdTransId;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public Double getAmount80() {
		return amount80;
	}

	public void setAmount80(Double amount80) {
		this.amount80 = amount80;
	}

	public Double getAmount20() {
		return amount20;
	}

	public void setAmount20(Double amount20) {
		this.amount20 = amount20;
	}

	public Double getAmountWin() {
		return amountWin;
	}

	public void setAmountWin(Double amountWin) {
		this.amountWin = amountWin;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Short getSourceType() {
		return sourceType;
	}

	public void setSourceType(Short sourceType) {
		this.sourceType = sourceType;
	}

	public Double getTotalRedBalance() {
		return totalRedBalance;
	}

	public void setTotalRedBalance(Double totalRedBalance) {
		this.totalRedBalance = totalRedBalance;
	}

	@Override
	public String toString() {
		return "TransUserVO [token=" + token + ", userId=" + userId + ", orderCode=" + orderCode + ", transType=" + transType + ", orderInfo=" + orderInfo + ", transAmount=" + transAmount + ", cashAmount=" + cashAmount + ", redTransAmount="
				+ redTransAmount + ", transStatus=" + transStatus + ", channelId=" + channelId + ", thirdTransId=" + thirdTransId + ", serviceCharge=" + serviceCharge + "]";
	}

}