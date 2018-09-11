package com.hhly.skeleton.cms.lotterymgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class LotteryTypeBO extends BaseBO{

	private Integer id;

    private Integer lotteryCode;

    private String lotteryName;

    private Short conIssueNum;

    private Short stopAddIssue;

    private String lotteryLogoUrl;
	/**
	 * 移动端logo
	 */
	private String lotteryLogoMobile;

    private Short adminCategory;

    private Short lotteryCategory;

    private Short saleStatus;
    
    private String platform;

    private String area;

    private Short autoType;

    private Short synIssue;

    private Integer saleTime;

    private Integer buyEndTime;

    private Integer splitMaxNum;

    private Integer endCheckTime;

    private Integer splitMaxAmount;

    private String createBy;

    private String modifyBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String remark;

    private String startSailTime;

	private String endSailTime;

	private String sailDayCycle;

	private String vacations;
	
	private String drawTime;
	
	private String format;
	
	private String comeOutTime;
	
	private Integer orderId;
	
	private Integer minBet;
	
	private Integer mrMultiple;
	    
	private Integer minMultiple;
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Short getConIssueNum() {
		return conIssueNum;
	}

	public void setConIssueNum(Short conIssueNum) {
		this.conIssueNum = conIssueNum;
	}

	public Short getStopAddIssue() {
		return stopAddIssue;
	}

	public void setStopAddIssue(Short stopAddIssue) {
		this.stopAddIssue = stopAddIssue;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public Short getAdminCategory() {
		return adminCategory;
	}

	public void setAdminCategory(Short adminCategory) {
		this.adminCategory = adminCategory;
	}

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Short getAutoType() {
		return autoType;
	}

	public void setAutoType(Short autoType) {
		this.autoType = autoType;
	}

	public Short getSynIssue() {
		return synIssue;
	}

	public void setSynIssue(Short synIssue) {
		this.synIssue = synIssue;
	}

	public Integer getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Integer saleTime) {
		this.saleTime = saleTime;
	}

	public Integer getBuyEndTime() {
		return buyEndTime;
	}

	public void setBuyEndTime(Integer buyEndTime) {
		this.buyEndTime = buyEndTime;
	}

	public Integer getSplitMaxNum() {
		return splitMaxNum;
	}

	public void setSplitMaxNum(Integer splitMaxNum) {
		this.splitMaxNum = splitMaxNum;
	}

	public Integer getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Integer endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public Integer getSplitMaxAmount() {
		return splitMaxAmount;
	}

	public void setSplitMaxAmount(Integer splitMaxAmount) {
		this.splitMaxAmount = splitMaxAmount;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStartSailTime() {
		return startSailTime;
	}

	public void setStartSailTime(String startSailTime) {
		this.startSailTime = startSailTime;
	}

	public String getEndSailTime() {
		return endSailTime;
	}

	public void setEndSailTime(String endSailTime) {
		this.endSailTime = endSailTime;
	}

	public String getSailDayCycle() {
		return sailDayCycle;
	}

	public void setSailDayCycle(String sailDayCycle) {
		this.sailDayCycle = sailDayCycle;
	}

	public String getVacations() {
		return vacations;
	}

	public void setVacations(String vacations) {
		this.vacations = vacations;
	}

	public String getDrawTime() {
		return drawTime;
	}

	public void setDrawTime(String drawTime) {
		this.drawTime = drawTime;
	}

	public String getComeOutTime() {
		return comeOutTime;
	}

	public void setComeOutTime(String comeOutTime) {
		this.comeOutTime = comeOutTime;
	}

	public String getLotteryLogoMobile() {
		return lotteryLogoMobile;
	}

	public void setLotteryLogoMobile(String lotteryLogoMobile) {
		this.lotteryLogoMobile = lotteryLogoMobile;
	}

	public Integer getMinBet() {
		return minBet;
	}

	public void setMinBet(Integer minBet) {
		this.minBet = minBet;
	}

	public Integer getMrMultiple() {
		return mrMultiple;
	}

	public void setMrMultiple(Integer mrMultiple) {
		this.mrMultiple = mrMultiple;
	}

	public Integer getMinMultiple() {
		return minMultiple;
	}

	public void setMinMultiple(Integer minMultiple) {
		this.minMultiple = minMultiple;
	}
    
	
}