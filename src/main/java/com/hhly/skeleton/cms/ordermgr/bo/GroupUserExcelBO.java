package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

@SuppressWarnings("serial")
public class GroupUserExcelBO extends BaseBO {
	
	@ExcelHeader("序号")
	private Integer id;
	@ExcelHeader("用户账号")
	private String userAccount;
	@ExcelHeader("用户标识")
	private String flagName;
	@ExcelHeader("累计发单次数")
	private Integer orderCount;
	@ExcelHeader("累计发单成功率")
	private Double orderSucRate;
	@ExcelHeader("累计中奖次数")
	private Integer winCount;
	@ExcelHeader("累计中奖金额")
	private Double winAmount;
	@ExcelHeader("盈利总额")
	private Double profitAmount;
	@ExcelHeader("盈利率")
	private Double profitRate;
	@ExcelHeader("定制人数")
	private Integer customizationCount;
	@ExcelHeader("是否推荐")
	private String recommendName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelHeader("创建时间")
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getFlagName() {
		return flagName;
	}
	public void setFlagName(String flagName) {
		this.flagName = flagName;
	}
	public String getRecommendName() {
		return recommendName;
	}
	public void setRecommendName(String recommendName) {
		this.recommendName = recommendName;
	}

}