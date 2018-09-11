package com.hhly.skeleton.pay.third.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @desc 汇潮支付查询订单结果，订单列表
 * @author xiongJinGang
 * @date 2018年1月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@XmlRootElement
public class HuiChaoOrderQueryResultListVO {
	private String orderNumber;// 交易的订单号
	private String orderDate;// 订单交易时间
	private String orderAmount;// 订单金额 元
	private String orderStatus;// 订单的状态 1：成功
	private String gouduiStatus;// 勾兑状态 1：已勾兑
	private String refundStatus;// 退款状态 1：已退款

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getGouduiStatus() {
		return gouduiStatus;
	}

	public void setGouduiStatus(String gouduiStatus) {
		this.gouduiStatus = gouduiStatus;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

}
