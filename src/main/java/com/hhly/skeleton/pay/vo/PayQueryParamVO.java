package com.hhly.skeleton.pay.vo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.pay.bo.TransRechargeBO;

/**
 * @desc 支付查询请求参数
 * @author xiongJinGang
 * @date 2017年5月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayQueryParamVO extends BaseBO {
	private static final long serialVersionUID = -8554973856437020778L;
	private String tradeNo;// 第三方交易流水号
	private String transCode;// 充值交易号（查询充值必填）
	private Date orderTime;// 充值记录的创建时间

	private String refundRequestNo;// 请求退款接口时，传入的退款请求号
	/**
	 * 1:支付宝支付，2：微信支付 PayConstants.RechargeChannelEnum
	 */
	private String rechargeChannel;
	// 带充值记录，因为有些第三方查询支付结果只返回一个交易状态，没有到账金额等有效信息
	private TransRechargeBO transRechargeBO;

	public String getTradeNo() {
		return tradeNo;
	}

	public String getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(String rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getRefundRequestNo() {
		return refundRequestNo;
	}

	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public TransRechargeBO getTransRechargeBO() {
		return transRechargeBO;
	}

	public void setTransRechargeBO(TransRechargeBO transRechargeBO) {
		this.transRechargeBO = transRechargeBO;
	}

	@Override
	public String toString() {
		return "查询参数 [tradeNo=" + tradeNo + ", transCode=" + transCode + ", refundRequestNo=" + refundRequestNo + "]";
	}

}
