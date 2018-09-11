package com.hhly.skeleton.pay.vo;

import java.util.Map;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants.RefundStatusEnum;
import com.hhly.skeleton.base.constants.PayConstants.UserTransStatusEnum;

/**
 * @desc 退款结果（目前只针对了微信的结果内容，支付宝和银行的结果有待新增）
 * @author xiongJinGang
 * @date 2017年5月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RefundResultVO extends BaseBO {
	private static final long serialVersionUID = -3847764478745232572L;
	private Short resultCode;// 退款结果  先判断这个状态，为1则表示申请成功
	private String resultMsg;// 退款结果描述
	private String transactionId;// 第三方交易流水号
	private String orderCode;// 益彩订单号
	private String refundCode;// 益彩退款单号
	private String refundId;// 第三方退款单号
	private String refundAmount;// 退款金额
	private String orderAmount;// 订单金额
	private String payAmount;// 现金支付金额
	private RefundStatusEnum refundStatusEnum;// 退款状态枚举
	private String refundRecvAccout;// 退款入账账户
	private String refundSuccessTime;// 退款成功时间
	private String refundChannel;// 退款渠道 ORIGINAL—原路退款 BALANCE—退回到余额OTHER_BALANCE—原账户异常退到其他余额账户OTHER_BANKCARD—原银行卡异常退到其他银行卡
	private String refundReason;// 退款原因

	public RefundResultVO() {
		super();
	}

	/**微信退款返回参数*/
	public RefundResultVO(Map map) {
		String returnCode = (String) map.get("return_code");
		this.resultMsg = (String) map.get("return_msg");
		this.transactionId = (String) map.get("transaction_id");
		this.orderCode = (String) map.get("out_trade_no");
		this.refundCode = (String) map.get("out_refund_no");
		this.refundId = (String) map.get("refund_id");
		this.refundAmount = (String) map.get("refund_fee");
		this.orderAmount = (String) map.get("total_fee");
		this.payAmount = (String) map.get("cash_fee");
		if (returnCode.equals("SUCCESS")) {// 退款处理中
			this.resultCode = UserTransStatusEnum.TRADE_SUCCESS.getKey();
			this.refundStatusEnum = RefundStatusEnum.REFUND_PROCESSING;
		} else {// 申请退款失败
			this.resultCode =  UserTransStatusEnum.TRADE_FAIL.getKey();
			this.refundStatusEnum = RefundStatusEnum.REFUND_FAIL;
		}
	}

	public Short getResultCode() {
		return resultCode;
	}

	public void setResultCode(Short resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getRefundCode() {
		return refundCode;
	}

	public void setRefundCode(String refundCode) {
		this.refundCode = refundCode;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public RefundStatusEnum getRefundStatusEnum() {
		return refundStatusEnum;
	}

	public void setRefundStatusEnum(RefundStatusEnum refundStatusEnum) {
		this.refundStatusEnum = refundStatusEnum;
	}

	public String getRefundRecvAccout() {
		return refundRecvAccout;
	}

	public void setRefundRecvAccout(String refundRecvAccout) {
		this.refundRecvAccout = refundRecvAccout;
	}

	public String getRefundSuccessTime() {
		return refundSuccessTime;
	}

	public void setRefundSuccessTime(String refundSuccessTime) {
		this.refundSuccessTime = refundSuccessTime;
	}

	public String getRefundChannel() {
		return refundChannel;
	}

	public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

}
