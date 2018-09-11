package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants;

/**
 * @desc 红包或者中奖金额交易参数
 * @author xiongJinGang
 * @date 2017年8月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserRedAddParamVo extends BaseBO {

	private static final long serialVersionUID = 9181964611946124838L;

	private Integer userId;// 用户ID
	private Double redAmount;// 操作金额（多个意义，根据不同的接口来定，可以是红包金额，也可以是中奖金额）
	private String redCode;// 红包编号
	private Short operateType;// 操作类型 1、CMS后台作废 ; 2、红包过期作废

	// 参数传递
	private Short transType;// 交易类型
	private String orderInfo;// 描述
	private Short status;// 状态
	private Double afterRedAmount;// 交易后红包金额
	private Short transStatus;// 交易状态
	private Double amountWin = 0d;// 中奖金额
	private Double transAmount;// 交易金额
	private Double totalRedBalance;// 剩余红包总金额
	private Double totalCashBalance;// 剩余现金总金额
	private String channelId = PayConstants.ChannelEnum.UNKNOWN.getKey();// 渠道ID
	private Short sourceType;// 充值来源
	private Double cashAmount = 0d;// 现金交易金额
	private Double amount80 = 0d;// 80%部分
	private Double amount20 = 0d;// 20%部分

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(Double redAmount) {
		this.redAmount = redAmount;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
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

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Double getAfterRedAmount() {
		return afterRedAmount;
	}

	public void setAfterRedAmount(Double afterRedAmount) {
		this.afterRedAmount = afterRedAmount;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Double getAmountWin() {
		return amountWin;
	}

	public void setAmountWin(Double amountWin) {
		this.amountWin = amountWin;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Double getTotalRedBalance() {
		return totalRedBalance;
	}

	public void setTotalRedBalance(Double totalRedBalance) {
		this.totalRedBalance = totalRedBalance;
	}

	public Short getSourceType() {
		return sourceType;
	}

	public void setSourceType(Short sourceType) {
		this.sourceType = sourceType;
	}

	public Double getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(Double cashAmount) {
		this.cashAmount = cashAmount;
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

	public Short getOperateType() {
		return operateType;
	}

	public void setOperateType(Short operateType) {
		this.operateType = operateType;
	}

	@Override
	public String toString() {
		return "UserRedAddParamVo [userId=" + userId + ", redAmount=" + redAmount + ", redCode=" + redCode + "," + operateType + "]";
	}

}
