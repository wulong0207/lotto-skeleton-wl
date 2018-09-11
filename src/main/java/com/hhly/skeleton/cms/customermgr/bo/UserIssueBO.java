package com.hhly.skeleton.cms.customermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class UserIssueBO extends BaseBO{
    private Integer id;

    private String accountName;
    
    private Integer level;
    
    private String recentRecord;
    
    private Double hitRate;
    
    private Double profitRate;
	
    /**
     * 发单总次数
     */
    private Integer issueNum;
    private Double issueAmount;
    private Integer hitNum;
    private Double hitMoney;
    private Double winAmount;
    private Integer followNum;
    private Integer followAmount;
    private Double commissionAmount;
	/**
     * 默认启用 0:禁用; 1:启用
     */
    private Integer status;
	
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
	
    private String remark;
	
    private Integer focusNum;
    private Integer continueHit;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getRecentRecord() {
		return recentRecord;
	}
	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord;
	}
	public Double getHitRate() {
		return hitRate;
	}
	public void setHitRate(Double hitRate) {
		this.hitRate = hitRate;
	}
	public Double getProfitRate() {
		return profitRate;
	}
	public void setProfitRate(Double profitRate) {
		this.profitRate = profitRate;
	}
	public Integer getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(Integer issueNum) {
		this.issueNum = issueNum;
	}
	public Double getIssueAmount() {
		return issueAmount;
	}

	public void setIssueAmount(double issueAmount) {
		this.issueAmount = issueAmount;
	}
	public Integer getHitNum() {
		return hitNum;
	}
	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}
	public Double getHitMoney() {
		return hitMoney;
	}
	public void setHitMoney(Double hitMoney) {
		this.hitMoney = hitMoney;
	}
	public Double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Double getWinAmount() {
		return winAmount;
	}
	public void setWinAmount(Double winAmount) {
		this.winAmount = winAmount;
	}
	public void setIssueAmount(Double issueAmount) {
		this.issueAmount = issueAmount;
	}
	public Integer getFollowNum() {
		return followNum;
	}
	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}
	public Integer getFollowAmount() {
		return followAmount;
	}
	public void setFollowAmount(Integer followAmount) {
		this.followAmount = followAmount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Integer getFocusNum() {
		return focusNum;
	}
	public void setFocusNum(Integer focusNum) {
		this.focusNum = focusNum;
	}
	public Integer getContinueHit() {
		return continueHit;
	}
	public void setContinueHit(Integer continueHit) {
		this.continueHit = continueHit;
	}
}