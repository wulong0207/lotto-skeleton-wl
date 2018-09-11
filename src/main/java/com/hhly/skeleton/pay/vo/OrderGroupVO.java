package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 合买订单信息
 * @author xiongJinGang
 * @date 2018年4月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OrderGroupVO implements Serializable {
	private static final long serialVersionUID = -6748705403378209350L;
	private String orderCode;// 合买订单编号
	private Double buyAmount;// 支付金额
	private Integer userId;// 用户ID
	private String buyCode;// 合买详情中的编号

	public OrderGroupVO() {
		super();
	}

	public OrderGroupVO(String orderCode, Double buyAmount) {
		super();
		this.orderCode = orderCode;
		this.buyAmount = buyAmount;
	}

	public OrderGroupVO(String orderCode, Double buyAmount, Integer userId) {
		super();
		this.orderCode = orderCode;
		this.buyAmount = buyAmount;
		this.userId = userId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBuyCode() {
		return buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

	@Override
	public String toString() {
		return "OrderGroupVO [orderCode=" + orderCode + ", buyAmount=" + buyAmount + ", userId=" + userId + ", buyCode=" + buyCode + "]";
	}

}