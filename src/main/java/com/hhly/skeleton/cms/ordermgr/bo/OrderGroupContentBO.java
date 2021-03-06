package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OrderGroupContentBO extends BaseBO {
	
	private Integer id;
	
	// 跟单用户名
	private String userName;
	
	//认购金额
	private Double buyAmount;
	//认购比例
	private Double buyRatio;
	
	//参与合买时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
	
	//税前奖金
	private Double preBonus;
	//税后奖金
	private Double aftBonus;
	// 派发奖金
	private Double sendBonus;
	//认购编号
	private String buyCode;
	//认购类型
	private Short buyType;
	//官方加奖奖金
	private Double addedBonus;
	//本站加奖奖金
	private Double siteAddedBonus;

	public String getBuyCode() {
		return buyCode;
	}
	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}
	public Short getBuyType() {
		return buyType;
	}
	public void setBuyType(Short buyType) {
		this.buyType = buyType;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Double getBuyAmount() {
		return buyAmount;
	}
	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}
	public Double getBuyRatio() {
		return buyRatio;
	}
	public void setBuyRatio(Double buyRatio) {
		this.buyRatio = buyRatio;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Double getPreBonus() {
		return preBonus;
	}
	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}
	public Double getAftBonus() {
		return aftBonus;
	}
	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}
	public Double getSendBonus() {
		return sendBonus;
	}
	public void setSendBonus(Double sendBonus) {
		this.sendBonus = sendBonus;
	}

}