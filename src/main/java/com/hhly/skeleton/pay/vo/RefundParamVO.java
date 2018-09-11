package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.hhly.skeleton.pay.bo.TransRechargeBO;

/**
 * @desc 申请退款请求参数
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RefundParamVO implements Serializable {
	private static final long serialVersionUID = 8558662094519741365L;
	private Integer userId;// 用户Id
	private String orderCode;// 订单号
	private Double refundAmount;// 退款金额
	private Double refundRate;// 退款手续费
	private String refundReason;// 退款原因
	private String tradeNo;// 支付成功返回的交易流水，易宝退款，此参数必传
	private String transCode;// 充值交易号(充值表中的系统生成的交易号)
	private String rechargeChannel;// 第三方充值类型（支付宝、微信、QQ）
	private TransRechargeBO transRechargeBO;

	/**以下参数不需要传递*/
	private String refundCode;// 退款单号
	private Double orderAmount;// 订单金额
	private String remark;// 备注
	private String extraData;// 附加数据
	private String notifyUrl;// 退款异步通知地址

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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getRefundRate() {
		return refundRate;
	}

	public void setRefundRate(Double refundRate) {
		this.refundRate = refundRate;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public String getRefundCode() {
		return refundCode;
	}

	public void setRefundCode(String refundCode) {
		this.refundCode = refundCode;
	}

	public Double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(String rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public TransRechargeBO getTransRechargeBO() {
		return transRechargeBO;
	}

	public void setTransRechargeBO(TransRechargeBO transRechargeBO) {
		this.transRechargeBO = transRechargeBO;
	}

}
