package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;

public class OrderGroupLogVO extends BaseVO {
	
	private Integer id;
	private Integer userId;
	private String orderCode;
	private int buyStageFlag;
	private int drawStageFlag;
	private String backupInfo;
	private Date createTime;
	private Date updateTime;
	private String modifyBy;
	private Date modifyTime;
	private String remark;
	private double amount;
	private double commissionAmount;
	
	public OrderGroupLogVO(){}
	
	public OrderGroupLogVO(Integer userId,String orderCode,int buyStageFlag,int drawStageFlag,double amount){
		this.userId = userId;
		this.orderCode = orderCode;
		this.buyStageFlag = buyStageFlag;
		this.drawStageFlag = drawStageFlag;
		this.amount = amount;
		createTime = new Date();
		updateTime = new Date();
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
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public int getBuyStageFlag() {
		return buyStageFlag;
	}
	public void setBuyStageFlag(int buyStageFlag) {
		this.buyStageFlag = buyStageFlag;
	}
	public int getDrawStageFlag() {
		return drawStageFlag;
	}
	public void setDrawStageFlag(int drawStageFlag) {
		this.drawStageFlag = drawStageFlag;
	}
	public String getBackupInfo() {
		return backupInfo;
	}
	public void setBackupInfo(String backupInfo) {
		this.backupInfo = backupInfo;
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
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}


	
	
	
}
