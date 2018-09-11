package com.hhly.skeleton.cms.agent.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AgentTransTakenVO  extends PageVO {
    private Integer id;

    private String transTakenCode;

    private Integer agentId;

    private Integer payChannel;

    private Integer takenBank;

    private String bankCardNum;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date reviewTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date remitTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date arrivalTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dealTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendDownTime;

    private String bankInfo;

    private BigDecimal extractAmount;

    private BigDecimal serviceCharge;

    private BigDecimal taxCharge;

    private String reviewBy;

    private String transCert;

    private String transFailInfo;

    private Integer transStatus;

    private Integer takenPlatform;

    private String channelId;

    private String thirdTransNum;

    private String batchNum;

    private Integer batchStatus;

    private String bankReturnInfo;

    private BigDecimal realAmount;

    private String createBy;

    private String accountName;

    private String actualName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private String remark;

    private String channelName;

    private String cusMobile;


    private Integer searchUserType;
    private String searchUserValue;
    private Integer searchTimeType;
    private Date startTime;
    private Date endTime;

    private List<Long> ids;

    /**
     * 查询提款金额小于 extractAmountLt
     */
    private Integer extractAmountLt;

    private Integer userId;

    private Integer excelBank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransTakenCode() {
        return transTakenCode;
    }

    public void setTransTakenCode(String transTakenCode) {
        this.transTakenCode = transTakenCode;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getTakenBank() {
        return takenBank;
    }

    public void setTakenBank(Integer takenBank) {
        this.takenBank = takenBank;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Date getRemitTime() {
        return remitTime;
    }

    public void setRemitTime(Date remitTime) {
        this.remitTime = remitTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Date getSendDownTime() {
        return sendDownTime;
    }

    public void setSendDownTime(Date sendDownTime) {
        this.sendDownTime = sendDownTime;
    }

    public String getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    public BigDecimal getExtractAmount() {
        return extractAmount;
    }

    public void setExtractAmount(BigDecimal extractAmount) {
        this.extractAmount = extractAmount;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getTaxCharge() {
        return taxCharge;
    }

    public void setTaxCharge(BigDecimal taxCharge) {
        this.taxCharge = taxCharge;
    }

    public String getReviewBy() {
        return reviewBy;
    }

    public void setReviewBy(String reviewBy) {
        this.reviewBy = reviewBy;
    }

    public String getTransCert() {
        return transCert;
    }

    public void setTransCert(String transCert) {
        this.transCert = transCert;
    }

    public String getTransFailInfo() {
        return transFailInfo;
    }

    public void setTransFailInfo(String transFailInfo) {
        this.transFailInfo = transFailInfo;
    }

    public Integer getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Integer transStatus) {
        this.transStatus = transStatus;
    }

    public Integer getTakenPlatform() {
        return takenPlatform;
    }

    public void setTakenPlatform(Integer takenPlatform) {
        this.takenPlatform = takenPlatform;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getThirdTransNum() {
        return thirdTransNum;
    }

    public void setThirdTransNum(String thirdTransNum) {
        this.thirdTransNum = thirdTransNum;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public Integer getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(Integer batchStatus) {
        this.batchStatus = batchStatus;
    }

    public String getBankReturnInfo() {
        return bankReturnInfo;
    }

    public void setBankReturnInfo(String bankReturnInfo) {
        this.bankReturnInfo = bankReturnInfo;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
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

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public Integer getSearchUserType() {
        return searchUserType;
    }

    public void setSearchUserType(Integer searchUserType) {
        this.searchUserType = searchUserType;
    }

    public String getSearchUserValue() {
        return searchUserValue;
    }

    public void setSearchUserValue(String searchUserValue) {
        this.searchUserValue = searchUserValue;
    }

    public Integer getSearchTimeType() {
        return searchTimeType;
    }

    public void setSearchTimeType(Integer searchTimeType) {
        this.searchTimeType = searchTimeType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public Integer getExtractAmountLt() {
        return extractAmountLt;
    }

    public void setExtractAmountLt(Integer extractAmountLt) {
        this.extractAmountLt = extractAmountLt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExcelBank() {
        return excelBank;
    }

    public void setExcelBank(Integer excelBank) {
        this.excelBank = excelBank;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile;
    }
}