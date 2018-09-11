package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;

public class OrderGroupCommonVO extends BaseVO {

	private static final long serialVersionUID = -614802233990840308L;

	private Integer id;
	private Integer userId;
	
	private Integer grade;
	private Integer orderCount;
	private Integer orderSucCount;
	private Double orderSucRate;
	private Double orderAmount;
	private Double orderSucAmount;

	private Integer winCount;
	private Integer winBwCount;
	private Integer winSwCount;
	private Integer winWCount;
	private Integer winQCount;
	private Integer winOtherCount;

	private Double winAmount;
	private Double profitAmount;
	private Double profitRate;
	private Double hitRate;
	private Double commissionAmount;

	private Date createTime;
	private Date updateTime;
	private Date modifyTime;
	private String modifyBy;
	private String remark;
	
	{
		grade = 0;
		orderCount =0;
		orderSucCount=0;
		orderAmount=0d;
		orderSucRate=0d;
		orderSucAmount=0d;
		
		winCount=0;
		winBwCount=0;
		winSwCount=0;
		winWCount=0;
		winQCount=0;
		winOtherCount=0;
		
		winAmount=0d;
		profitAmount=0d;
		profitRate=0d;
		hitRate=0d;
		commissionAmount=0d;
		
		createTime = new Date();
	}
	public OrderGroupCommonVO(){}
	
	public OrderGroupCommonVO(Integer userId){
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}

	public Integer getOrderSucCount() {
		return orderSucCount;
	}

	public void setOrderSucCount(Integer orderSucCount) {
		this.orderSucCount = orderSucCount;
	}

	public Double getOrderSucRate() {
		return orderSucRate;
	}

	public void setOrderSucRate(Double orderSucRate) {
		this.orderSucRate = orderSucRate;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getOrderSucAmount() {
		return orderSucAmount;
	}

	public void setOrderSucAmount(Double orderSucAmount) {
		this.orderSucAmount = orderSucAmount;
	}

	public Integer getWinCount() {
		return winCount;
	}

	public void setWinCount(Integer winCount) {
		this.winCount = winCount;
	}

	public Integer getWinBwCount() {
		return winBwCount;
	}

	public void setWinBwCount(Integer winBwCount) {
		this.winBwCount = winBwCount;
	}

	public Integer getWinSwCount() {
		return winSwCount;
	}

	public void setWinSwCount(Integer winSwCount) {
		this.winSwCount = winSwCount;
	}

	public Integer getWinWCount() {
		return winWCount;
	}

	public void setWinWCount(Integer winWCount) {
		this.winWCount = winWCount;
	}

	public Integer getWinQCount() {
		return winQCount;
	}

	public void setWinQCount(Integer winQCount) {
		this.winQCount = winQCount;
	}

	public Integer getWinOtherCount() {
		return winOtherCount;
	}

	public void setWinOtherCount(Integer winOtherCount) {
		this.winOtherCount = winOtherCount;
	}

	public Double getWinAmount() {
		return winAmount;
	}

	public void setWinAmount(Double winAmount) {
		this.winAmount = winAmount;
	}

	public Double getProfitAmount() {
		return profitAmount;
	}

	public void setProfitAmount(Double profitAmount) {
		this.profitAmount = profitAmount;
	}

	public Double getProfitRate() {
		return profitRate;
	}

	public void setProfitRate(Double profitRate) {
		this.profitRate = profitRate;
	}

	public Double getHitRate() {
		return hitRate;
	}

	public void setHitRate(Double hitRate) {
		this.hitRate = hitRate;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
