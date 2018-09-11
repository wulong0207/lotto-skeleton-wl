package com.hhly.skeleton.cms.cooperate.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class CooperateExchangeRecordVO extends PageVO {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 交易类型,1,资金充值，2，兑换
     */
    private Integer payClass;

    /**
     * 渠道余额。
     */
    private Double channelBalance;

    /**
     * 流水号
     */
    private String serialNumber;

    /**
     * 兑换码id
     */
    private Integer cdkeyId;

    /**
     * 兑换渠道
     */
    private String channelId;

    /**
     * 兑换时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeRecordTime;

    /**
     * 兑换过期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeOverTime;

    /**
     * 兑换订单编号
     */
    private String orderCode;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 备注,用于记录出票失败，或者兑换码过期等信息
     */
    private String remark;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 兑换时间区间查询
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeRecordBeginTime;

    /**
     * 兑换时间区间查询
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeRecordEndTime;

    /**
     * 账户名
     */
    private String account;

    /**
     * 手机号码
     */
    private String phoneNum;

    /**
     * 彩种编号
     */
    private String lotteryCode;

    /**
     * cdkey
     */
    private String cdKey;

    /**
     * 下拉框查询条件
     */
    private String field;

    /**
     * 下拉框查询值
     */
    private String fieldValue;

    /**
     * 交易金额
     */
    private Double payAmount;


    /**
     * 订单信息
     */
    private String orderInfo;

    /**
     * 流水描述
     */
    private String desc;

    /**
     * 流水类别
     */
    private Integer serialType;


    public Integer getSerialType() {
        return serialType;
    }

    public void setSerialType(Integer serialType) {
        this.serialType = serialType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getCdKey() {
        return cdKey;
    }

    public void setCdKey(String cdKey) {
        this.cdKey = cdKey;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Date getExchangeRecordBeginTime() {
        return exchangeRecordBeginTime;
    }

    public void setExchangeRecordBeginTime(Date exchangeRecordBeginTime) {
        this.exchangeRecordBeginTime = exchangeRecordBeginTime;
    }

    public Date getExchangeRecordEndTime() {
        return exchangeRecordEndTime;
    }

    public void setExchangeRecordEndTime(Date exchangeRecordEndTime) {
        this.exchangeRecordEndTime = exchangeRecordEndTime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPayClass() {
        return payClass;
    }

    public void setPayClass(Integer payClass) {
        this.payClass = payClass;
    }

    public Double getChannelBalance() {
        return channelBalance;
    }

    public void setChannelBalance(Double channelBalance) {
        this.channelBalance = channelBalance;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getCdkeyId() {
        return cdkeyId;
    }

    public void setCdkeyId(Integer cdkeyId) {
        this.cdkeyId = cdkeyId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Date getExchangeRecordTime() {
        return exchangeRecordTime;
    }

    public void setExchangeRecordTime(Date exchangeRecordTime) {
        this.exchangeRecordTime = exchangeRecordTime;
    }

    public Date getExchangeOverTime() {
        return exchangeOverTime;
    }

    public void setExchangeOverTime(Date exchangeOverTime) {
        this.exchangeOverTime = exchangeOverTime;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}