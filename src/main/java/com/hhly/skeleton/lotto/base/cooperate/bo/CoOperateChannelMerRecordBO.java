package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 渠道商户交易信息查询
 *
 * @author lidecheng
 * @date 2018年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelMerRecordBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1618130719358257037L;
	/**
	 * 交易类型,1,资金充值，2，兑换
	 */
	private Short payClass;
	/**
	 * 本站兑换码
	 */
	private String myCdkey;
	/**
	 * 兑换状态;1,交易成功;2,已兑换;3未兑换，4,已过期	
	 */
	private Short status;
	/**
	 * 流水类别，1，商户充值流水；2，cdkey使用流水详情
	 */
	private Short serialType;
	/**
	 * 流水金额
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double payAmount;
	
	/**
	 * 订单信息
	 */
	private String orderInfo;
	
	/**
	 * 订单信息
	 */
	private String orderCode;
	/**
	 * 手机号
	 */
	private String cusMobile;
	/**
	 * 兑换时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date exchangeRecordTime;	
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Short getPayClass() {
		return payClass;
	}
	public void setPayClass(Short payClass) {
		this.payClass = payClass;
	}
	public String getMyCdkey() {
		return myCdkey;
	}
	public void setMyCdkey(String myCdkey) {
		this.myCdkey = myCdkey;
	}
	
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public Double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getCusMobile() {
		return cusMobile;
	}
	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
	public Date getExchangeRecordTime() {
		return exchangeRecordTime;
	}
	public void setExchangeRecordTime(Date exchangeRecordTime) {
		this.exchangeRecordTime = exchangeRecordTime;
	}
	public Short getSerialType() {
		return serialType;
	}
	public void setSerialType(Short serialType) {
		this.serialType = serialType;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}		
	
}
