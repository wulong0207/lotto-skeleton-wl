package com.hhly.skeleton.cms.agent.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;

import java.math.BigDecimal;
import java.util.Date;

public class AgentTransLogBO extends BaseBO {
    @ExcelHeader("序号")
    private Integer rank;

    @ExcelHeader("时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ExcelHeader("账号")
    private String accountName;

    @ExcelHeader("变动数值")
    private BigDecimal transAmount;

    @ExcelHeader("变动原因")
    private String transInfo;

    @ExcelHeader("税费")
    private BigDecimal taxCharge;

    @ExcelIgnore
    private Integer id;

    @ExcelIgnore
    private Integer agentId;

    @ExcelIgnore
    private String transCode;

    @ExcelIgnore
    private Integer transType;

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date transEndTime;

    @ExcelIgnore
    private Integer transStatus;

    @ExcelIgnore
    private BigDecimal serviceCharge;

    @ExcelIgnore
    private BigDecimal realAmount;

    @ExcelIgnore
    private BigDecimal totalCashBalance;

    @ExcelIgnore
    private String tradeCode;

    @ExcelIgnore
    private String createBy;

    @ExcelIgnore
    private String updateBy;

    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @ExcelIgnore
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getTransInfo() {
        return transInfo;
    }

    public void setTransInfo(String transInfo) {
        this.transInfo = transInfo;
    }

    public Date getTransEndTime() {
        return transEndTime;
    }

    public void setTransEndTime(Date transEndTime) {
        this.transEndTime = transEndTime;
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getTaxCharge() {
        return taxCharge;
    }

    public void setTaxCharge(BigDecimal taxCharge) {
        this.taxCharge = taxCharge;
    }

    public BigDecimal getTotalCashBalance() {
        return totalCashBalance;
    }

    public void setTotalCashBalance(BigDecimal totalCashBalance) {
        this.totalCashBalance = totalCashBalance;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}