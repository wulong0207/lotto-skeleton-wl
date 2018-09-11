package com.hhly.skeleton.pay.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @desc 阿里退款对象
 * @author xiongJinGang
 * @date 2017年5月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class AlipayRefundInfoVO {
	@JSONField(name = "out_trade_no")
	private String orderCode;// 订单号
	@JSONField(name = "refund_amount")
	private String refundAmount;// 退款金额
	@JSONField(name = "trade_no")
	private String tradeNo;// 交易号
	@JSONField(name = "refund_reason")
	private String refundReason;// 退款原因
	@JSONField(name = "out_request_no")
	private String outRequestNo;// 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getOutRequestNo() {
		return outRequestNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
