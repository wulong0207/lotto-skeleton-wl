package com.hhly.skeleton.cms.operatemgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author chenkn679
 * @version 1.0
 * @desc
 * @date 2018/1/9
 * @company 益彩网络科 技公司
 */
public class OperateActivityCdkeyBO extends BaseBO {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 兑换码
     */
    private String cdkey;

    /**
     * 状态
     */
    private Short status;

    /**
     * 账户id
     */
    private Integer userId;

    /**
     * 账户名
     */
    private String accountName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 兑换时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeTime;

    /**
     * cdk总数
     */
    private Integer cdkTotal;

    /**
     * 有效的cdk数量
     */
    private Integer validCdkCount;

    /**
     * 无效cdk数量
     */
    private Integer invalidCdkCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    public Integer getCdkTotal() {
        return cdkTotal;
    }

    public void setCdkTotal(Integer cdkTotal) {
        this.cdkTotal = cdkTotal;
    }

    public Integer getValidCdkCount() {
        return validCdkCount;
    }

    public void setValidCdkCount(Integer validCdkCount) {
        this.validCdkCount = validCdkCount;
    }

    public Integer getInvalidCdkCount() {
        return invalidCdkCount;
    }

    public void setInvalidCdkCount(Integer invalidCdkCount) {
        this.invalidCdkCount = invalidCdkCount;
    }
}
