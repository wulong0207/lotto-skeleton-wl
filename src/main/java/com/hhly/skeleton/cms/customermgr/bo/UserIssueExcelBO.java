package com.hhly.skeleton.cms.customermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class UserIssueExcelBO extends BaseBO{
	@ExcelHeader("id")
    private Integer id;

	@ExcelHeader("会员帐号")
    private String accountName;

	@ExcelHeader("标识")
	@ReplaceAttribute(DicDataEnum.CUST_USER_ISSUE_LEVEL)
    private String level;

	@ExcelHeader("近期战绩")
    private String recentRecord;
	@ExcelHeader("命中率")
    private String hitRate;
	@ExcelHeader("盈利率")
    private String profitRate;
	
    /**
     * 发单总次数
     */
	@ExcelHeader("发单次数")
    private String issueNum;
	@ExcelHeader("发单金额")
    private String issueAmount;
	@ExcelHeader("命中次数")
    private String hitNum;
	@ExcelHeader("命中金额")
    private String hitMoney;
	@ExcelHeader("发单总奖金")
    private String winAmount;
	@ExcelHeader("跟单人数")
    private String followNum;
	@ExcelHeader("跟单金额")
    private String followAmount;
	@ExcelHeader("总佣金")
    private String commissionAmount;
	/**
     * 默认启用 0:禁用; 1:启用
     */
	@ExcelHeader("状态")
	@ReplaceAttribute(DicDataEnum.CUST_USER_ISSUE_STATUS)
    private String status;

	@ExcelHeader("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

	@ExcelHeader("备注")
    private String remark;

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

	public String getRecentRecord() {
		return recentRecord;
	}

	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord;
    }

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getHitRate() {
		return hitRate;
	}

	public void setHitRate(String hitRate) {
		this.hitRate = hitRate;
	}

	public String getProfitRate() {
		return profitRate;
	}

	public void setProfitRate(String profitRate) {
		this.profitRate = profitRate;
	}

	public String getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(String issueNum) {
		this.issueNum = issueNum;
	}

	public String getIssueAmount() {
		return issueAmount;
	}

	public void setIssueAmount(String issueAmount) {
		this.issueAmount = issueAmount;
	}

	public String getHitNum() {
		return hitNum;
	}

	public void setHitNum(String hitNum) {
		this.hitNum = hitNum;
	}

	public String getHitMoney() {
		return hitMoney;
	}

	public void setHitMoney(String hitMoney) {
		this.hitMoney = hitMoney;
	}

	public String getWinAmount() {
		return winAmount;
	}

	public void setWinAmount(String winAmount) {
		this.winAmount = winAmount;
	}

	public String getFollowNum() {
		return followNum;
	}

	public void setFollowNum(String followNum) {
		this.followNum = followNum;
	}

	public String getFollowAmount() {
		return followAmount;
	}

	public void setFollowAmount(String followAmount) {
		this.followAmount = followAmount;
	}

	public String getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(String commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

}