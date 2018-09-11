package com.hhly.skeleton.pay.vo;

import java.util.Map;
import java.util.TreeMap;

import com.hhly.skeleton.base.constants.PayConstants.PayStatusEnum;
import com.hhly.skeleton.base.util.DateUtil;

public class PayQueryResultVO {
	private String tradeNo;// 交易号
	private String orderCode;// 益彩订单号
	private String buyerAccount;// 买家支付状态
	private PayStatusEnum tradeStatus;// 支付状态
	private String totalAmount;// 交易的订单金额，单位为元，两位小数
	private String receiptAmount;// 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	private String payAmount;// 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
	private String arriveTime;// 本次交易打款给卖家的时间 yyyy-MM-dd HH:mm:ss
	private String returnMsg;// 返回结果
	private String tradeType;// 交易类型 APP
	private String bankType;// 付款银行类型
	private String bankName;// 付款银行名称
	private String attach;// 附加数据

	public PayQueryResultVO() {
		super();
	}

	/**
	 * 微信构造函数
	 */
	public PayQueryResultVO(Map<Object, Object> map) {
		super();
		this.tradeNo = (String) map.get("transaction_id");
		this.orderCode = (String) map.get("out_trade_no");
		this.buyerAccount = (String) map.get("openid");
		this.tradeStatus = getWxPayStatus((String) map.get("trade_state"));
		this.totalAmount = (String) map.get("total_fee");
		this.receiptAmount = (String) map.get("cash_fee");
		this.payAmount = (String) map.get("cash_fee");
		String arriveTime = (String) map.get("time_end");
		String targetDate = DateUtil.convertStrToTarget(arriveTime, DateUtil.DATE_FORMAT_NUM, DateUtil.DEFAULT_FORMAT);
		this.arriveTime = targetDate;
		this.returnMsg = (String) map.get("return_msg");
		this.tradeType = (String) map.get("trade_type");
		this.bankType = (String) map.get("bank_type");
		this.attach = (String) map.get("attach ");
	}

	// 易宝支付的构造
	public PayQueryResultVO(TreeMap<String, String> responseDataMap) {
		super();
		this.tradeNo = responseDataMap.get("yborderid");
		this.orderCode = responseDataMap.get("orderid");
		this.buyerAccount = responseDataMap.get("");// 没有返回
		this.tradeStatus = getYeePayStatus(responseDataMap.get("status"));
		this.totalAmount = responseDataMap.get("");
		this.receiptAmount = responseDataMap.get("");
		// this.payAmount = responseDataMap.get("sourceamount");// 付款方实付金额
		// this.arriveTime = responseDataMap.get("closetime");//交易时间
		this.returnMsg = responseDataMap.get("");
		this.tradeType = responseDataMap.get("type");// 1： 银行卡2： 非银行卡
		this.bankType = responseDataMap.get("bankcardtype");
		this.bankName = responseDataMap.get("bank");
		this.attach = responseDataMap.get("");
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getBuyerAccount() {
		return buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public PayStatusEnum getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(PayStatusEnum tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// 微信返回订单状态 SUCCESS—支付成功 REFUND—转入退款 NOTPAY—未支付 CLOSED—已关闭 REVOKED—已撤销（刷卡支付） USERPAYING--用户支付中 PAYERROR--支付失败(其他原因，如银行返回失败)
	private PayStatusEnum getWxPayStatus(String status) {
		PayStatusEnum payStatusEnum = null;
		switch (status) {
		case "SUCCESS":// 支付成功
			payStatusEnum = PayStatusEnum.PAYMENT_SUCCESS;
			break;
		case "REFUND":// 转入退款
			payStatusEnum = PayStatusEnum.REFUND;
			break;
		case "NOTPAY":// 未支付
			payStatusEnum = PayStatusEnum.WAITTING_PAYMENT;
			break;
		case "CLOSED":// 已关闭
			payStatusEnum = PayStatusEnum.OVERDUE_PAYMENT;
			break;
		case "REVOKED":// 已撤销（刷卡支付）
			payStatusEnum = PayStatusEnum.USER_CANCELLED_PAYMENT;
			break;
		case "USERPAYING":// 用户支付中
			payStatusEnum = PayStatusEnum.WAITTING_PAYMENT;
			break;
		case "PAYERROR":// 支付失败(其他原因，如银行返回失败)
			payStatusEnum = PayStatusEnum.PAYMENT_FAILURE;
			break;
		case "REVERSE":// 已冲正。 没成功，当银行转账交易出现如通讯超时等异常情况时，交易发起方自动或人工发起银行转账冲正交易，取消原转账交易
			payStatusEnum = PayStatusEnum.PAYMENT_FAILURE;
			break;
		default:
			payStatusEnum = PayStatusEnum.WAITTING_PAYMENT;// 未知状态
			break;
		}
		return payStatusEnum;
	}

	// 易宝的支付状态 0：未支付1：支付成功2 : 已撤销【表示订单已过有效期】3：阻断交易 - 订单因为高风险而被阻断4：失败
	private PayStatusEnum getYeePayStatus(String status) {
		PayStatusEnum payStatusEnum = null;
		switch (status) {
		case "1":// 支付成功
			payStatusEnum = PayStatusEnum.PAYMENT_SUCCESS;
			break;
		case "4":// 失败
			payStatusEnum = PayStatusEnum.PAYMENT_FAILURE;
			break;
		case "3":// 阻断交易 - 订单因为高风险而被阻断
		case "0":// 支付失败(其他原因，如银行返回失败)
		case "2":// 已撤销【表示订单已过有效期】
			payStatusEnum = PayStatusEnum.OVERDUE_PAYMENT;
			break;
		default:
			payStatusEnum = PayStatusEnum.WAITTING_PAYMENT;// 未知状态
			break;
		}
		return payStatusEnum;
	}

	@Override
	public String toString() {
		return "PayQueryResultVO [tradeNo=" + tradeNo + ", orderCode=" + orderCode + ", buyerAccount=" + buyerAccount + ", totalAmount=" + totalAmount + ", receiptAmount=" + receiptAmount + ", payAmount=" + payAmount + ", arriveTime=" + arriveTime
				+ ", returnMsg=" + returnMsg + ", tradeType=" + tradeType + ", bankType=" + bankType + ", bankName=" + bankName + ", attach=" + attach + "]";
	}

}
