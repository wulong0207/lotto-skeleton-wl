package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class GroupUserBO extends BaseBO {
	
	private Integer id;
	private String userAccount;
	private Integer flag;
	private Integer orderCount;
	private Double orderSucRate;
	private Integer winCount;
	private Double winAmount;
	private Double profitAmount;
	private Double profitRate;
	private Integer customizationCount;
	private Integer isRecommend;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Integer getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(Integer orderCount) {
		this.orderCount = orderCount;
	}
	public Double getOrderSucRate() {
		return orderSucRate;
	}
	public void setOrderSucRate(Double orderSucRate) {
		this.orderSucRate = orderSucRate;
	}
	public Integer getWinCount() {
		return winCount;
	}
	public void setWinCount(Integer winCount) {
		this.winCount = winCount;
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
	public Integer getCustomizationCount() {
		return customizationCount;
	}
	public void setCustomizationCount(Integer customizationCount) {
		this.customizationCount = customizationCount;
	}
	public Integer getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	

}