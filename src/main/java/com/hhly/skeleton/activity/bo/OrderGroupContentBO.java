package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class OrderGroupContentBO extends BaseBO{
	private String orderCode;
	//认购id
	private Integer id;
	private Integer userId;
	//认购比例
	private Double buyRatio;
	//官方嘉奖奖金
	private Double addedBonus;
	//本站加奖金额
	private Double siteAddedBonus;
	private String redCode;
	
	public String getRedCode() {
		return redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode; 
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
	public Double getBuyRatio() {
		return buyRatio;
	}
	public void setBuyRatio(Double buyRatio) {
		this.buyRatio = buyRatio;
	}
	public Double getAddedBonus() {
		return addedBonus;
	}
	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
	}
	public Double getSiteAddedBonus() {
		return siteAddedBonus;
	}
	public void setSiteAddedBonus(Double siteAddedBonus) {
		this.siteAddedBonus = siteAddedBonus;
	}
	
}
