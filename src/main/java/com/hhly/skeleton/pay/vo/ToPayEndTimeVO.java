package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;

public class ToPayEndTimeVO extends BaseBO {
	private static final long serialVersionUID = -795623028780275860L;
	private Double orderAmount;// 需要支付的总金额
	private Long leavePayTime;// 剩余支付时间
	private OrderBaseInfoBO orderBaseInfo;// 订单信息

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Long getLeavePayTime() {
		return leavePayTime;
	}

	public void setLeavePayTime(Long leavePayTime) {
		this.leavePayTime = leavePayTime;
	}

	public OrderBaseInfoBO getOrderBaseInfo() {
		return orderBaseInfo;
	}

	public void setOrderBaseInfo(OrderBaseInfoBO orderBaseInfo) {
		this.orderBaseInfo = orderBaseInfo;
	}

}
