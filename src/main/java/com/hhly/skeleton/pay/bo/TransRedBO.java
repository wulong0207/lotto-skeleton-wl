package com.hhly.skeleton.pay.bo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TransRedBO implements Serializable {

	private static final long serialVersionUID = 5870127784455253721L;
	/**
	 *  流水id
	 */
	private Integer id;
	/**
	 * 系统流水编号
	 */
	private String redTransCode;
	/**
	 * 红包编号
	 */
	private String redCode;
	/**
	 * 会员ID 
	 */
	private Integer userId;
	/**
	 * 交易分类 1：充值；2：购彩；3：返奖；4：退款；5：提款；6：其它 
	 */
	private Integer transType;
	/**
	 * 交易状态 0：交易失败；1：交易成功；
	 */
	private Integer transStatus;
	/**
	 * 交易金额
	 */
	private Double transAmount;
	/**
	 * 交易后红包金额
	 */
	private Double aftTransAmount;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 订单信息
	 */
	private String orderInfo;
	/**
	 * 交易时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	/**
	 * 更新时间 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	 * 红包类型；1：充值优惠；2：消费折扣；3：彩金红包；4：加奖红包；5：大礼包；6：随机红包 
	 */
	private Short redType;
	
	/**
	 * 固定彩种code:低频：100开始；高频：200；竞技彩：300 
	 */
	private String lotteryCode;
	/**
	 * 彩种名称 
	 */
	private String lotteryName;
	/**
	 * 彩期
	 */
	private String lotteryIssue;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

}
