package com.hhly.skeleton.cms.transmgr.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 用户流水
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransRedBO extends BaseBO{

	private static final long serialVersionUID = -217223568775016919L;
	// 流水id
	private BigDecimal id;
	// 会员昵称
	private String nickName;
	// 系统流水编号
	private String redTransCode;
	// 红包编号
	private String redCode;
	// 交易分类
	private Integer transType;
	// 交易状态
	private Integer transStatus;
	// 交易金额
	private Double transAmount;
	// 交易后红包金额
	private Double aftTransAmount;
	// 订单信息
	private String orderInfo;
	// 交易时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	// 订单编号
	private String orderCode;
	
	private Integer redType;
	
	
	public Integer getRedType() {
		return redType;
	}
	public void setRedType(Integer redType) {
		this.redType = redType;
	}
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRedTransCode() {
		return redTransCode;
	}
	public void setRedTransCode(String redTransCode) {
		this.redTransCode = redTransCode;
	}
	public String getRedCode() {
		return redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}
	public Integer getTransType() {
		return transType;
	}
	public void setTransType(Integer transType) {
		this.transType = transType;
	}
	public Integer getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public Double getAftTransAmount() {
		return aftTransAmount;
	}
	public void setAftTransAmount(Double aftTransAmount) {
		this.aftTransAmount = aftTransAmount;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public Date getTransTime() {
		return transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
}
