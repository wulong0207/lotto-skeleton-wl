package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.CoOperateEnum;
import com.hhly.skeleton.base.constants.PayConstants.TransTypeEnum;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 代理商户订单记录
 *
 * @author huangchengfang1219
 * @date 2018年4月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateProxyOrderBO extends BaseBO {

	@ExcelIgnore
	private static final long serialVersionUID = -2564342988150059212L;

	@ExcelHeader("系统流水号")
	private String transCode;

	@ExcelIgnore
	private Short payType;

	@ExcelHeader("支付类型")
	private String payTypeText;

	@ExcelIgnore
	private Short transType;

	@ExcelHeader("订单编号")
	private String orderCode;

	@ExcelHeader("订单信息")
	private String orderInfo;

	@ExcelHeader("交易金额")
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderAmount;

	@ExcelIgnore
	private Short status;

	@ExcelHeader("订单状态")
	private String statusText;

	@ExcelIgnore
	private Short buyType;

	@JsonIgnore
	@ExcelIgnore
	private Short payStatus;

	@JsonIgnore
	@ExcelIgnore
	private Short orderStatus;

	@JsonIgnore
	@ExcelIgnore
	private Short winningStatus;

	@JsonIgnore
	@ExcelIgnore
	private Short addStatus;

	@JsonIgnore
	@ExcelIgnore
	private Double cashAmount;

	@JsonIgnore
	@ExcelIgnore
	private Double redTransAmount;

	@ExcelHeader("中奖金额")
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double preBonus;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelIgnore
	private Date createTime;

	@ExcelHeader("交易时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public String getTransTypeText() {
		TransTypeEnum transTypeEnum = TransTypeEnum.getEnum(transType);
		return transTypeEnum == null ? null : transTypeEnum.getValue();
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
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

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
		CoOperateEnum.ProxyOrderStatus proxyOrderStatus = CoOperateEnum.ProxyOrderStatus.valueOf(status);
		this.statusText = proxyOrderStatus == null ? null : proxyOrderStatus.getName();
	}

	public String getStatusText() {
		return statusText;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public Double getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(Double cashAmount) {
		this.cashAmount = cashAmount;
	}

	public Double getRedTransAmount() {
		return redTransAmount;
	}

	public void setRedTransAmount(Double redTransAmount) {
		this.redTransAmount = redTransAmount;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
		CoOperateEnum.PayType payTypeEnum = CoOperateEnum.PayType.valueOf(payType);
		this.payTypeText = payTypeEnum == null ? null : payTypeEnum.getName();
	}

	public String getPayTypeText() {
		return payTypeText;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

}
