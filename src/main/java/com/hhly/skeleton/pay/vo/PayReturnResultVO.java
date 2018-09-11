package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 支付同步通知处理结果
 * @author xiongJinGang
 * @date 2017年4月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayReturnResultVO implements Serializable {

	private static final long serialVersionUID = -6256136837171857492L;

	private Double orderAmt; // 订单金额、到账金额（元），微信的需要将分转成元
	private String notifyTime; // 通知时间
	private String thirdTradeNo; // 第三方交易号
	private Short status; // 支付状态 0失败 1成功
	private String orderCode; // 益彩订单号
	private String attachData; // 支付时的附加数据，异步通知时原样返回

	public Double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(Double orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getNotifyTime() {
		return notifyTime;
	}

	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}

	public String getThirdTradeNo() {
		return thirdTradeNo;
	}

	public void setThirdTradeNo(String thirdTradeNo) {
		this.thirdTradeNo = thirdTradeNo;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getAttachData() {
		return attachData;
	}

	public void setAttachData(String attachData) {
		this.attachData = attachData;
	}

}