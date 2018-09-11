package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.hhly.skeleton.base.constants.PayConstants.PayStatusEnum;

/**
 * @desc 支付异步通知处理结果
 * @author xiongJinGang
 * @date 2017年3月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayNotifyResultVO implements Serializable {

	private static final long serialVersionUID = -6256136837171857492L;

	private String payId; // 支付号
	private Double orderAmt; // 订单金额、到账金额（元），微信的需要将分转成元
	private String channelType; // 支付渠道类型
	private String thirdTradeNo; // 第三方交易号
	private String tradeTime; // 付款时间 yyyy-MM-dd HH:mm:ss
	private String attachData; // 支付时的附加数据，异步通知时原样返回
	private String batchData; // 批量结果数据（当为批量支付时有值）
	private PayStatusEnum status; // 支付状态
	private String response; // 响应给第三方支付异步回调的数据（SUCCESS、{"ret_code":"0000","ret_msg":"交易成功"}）
	private String orderCode; // 益彩充值交易流水号
	private String settleDate;// YYYYMMDD 清算日期
	private String payAccount;// 付款账号
	private String payType;// 支付方式 BARCODE_PAY：条码支付；JS_PAY：公众号支付；QRCODE_PAY：扫码支付；WAP_PAY：WAP(H5)支付；APP_PAY：APP支付；
	private String tradeType;// 交易类型 WX-微信支付；AP-支付宝支付；QQ-QQ钱包支付；

	/**
	 * 方法间做为值的传递，第三方接口非必填
	 */
	private String remark;// 描述

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public Double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(Double orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getThirdTradeNo() {
		return thirdTradeNo;
	}

	public void setThirdTradeNo(String thirdTradeNo) {
		this.thirdTradeNo = thirdTradeNo;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getAttachData() {
		return attachData;
	}

	public void setAttachData(String attachData) {
		this.attachData = attachData;
	}

	public String getBatchData() {
		return batchData;
	}

	public void setBatchData(String batchData) {
		this.batchData = batchData;
	}

	public PayStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PayStatusEnum status) {
		this.status = status;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	@Override
	public String toString() {
		return "PayNotifyResultVO [payId=" + payId + ", orderAmt=" + orderAmt + ", channelType=" + channelType + ", thirdTradeNo=" + thirdTradeNo + ", tradeTime=" + tradeTime + ", attachData=" + attachData + ", batchData=" + batchData + ", status="
				+ status + ", response=" + response + ", orderCode=" + orderCode + ", settleDate=" + settleDate + "]";
	}

}