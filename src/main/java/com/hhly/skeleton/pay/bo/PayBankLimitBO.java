package com.hhly.skeleton.pay.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

public class PayBankLimitBO extends BaseBO{
    /**
     * 主键ID
     */
    @JsonProperty("p_id")
    private Long id;

    /**
     * 银行ID
     */
    @JsonProperty("bk_id")
    private Long bankId;

    /**
     * 单笔限额(元)
     */
    @JsonProperty("lt")
    private String limitTime;

    /**
     * 每日限额(元)
     */
    @JsonProperty("ld")
    private String limitDay;

    /**
     * 每月限额(元)
     */
    @JsonProperty("lm")
    private String limitMonth;

    /**
     * 限额需要满足的条件
     */
    @JsonProperty("ct")
    private String condition;

    /**
     * 备注
     */
    @JsonProperty("rk")
    private String remark;
    /**
     * 卡类型 1储蓄卡 2信用卡
     */
    @JsonIgnore
    private Short cardType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBankId() {
        return bankId;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    public String getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(String limitTime) {
        this.limitTime = limitTime;
    }

    public String getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(String limitDay) {
        this.limitDay = limitDay;
    }

    public String getLimitMonth() {
        return limitMonth;
    }

    public void setLimitMonth(String limitMonth) {
        this.limitMonth = limitMonth;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public Short getCardType() {
		return cardType;
	}

	public void setCardType(Short cardType) {
		this.cardType = cardType;
	}
    
}