package com.hhly.skeleton.cms.cooperate.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

import java.util.Date;

public class CooperateExchangeRecordBO extends BaseBO {
    /**
     * 主键
     */
    @ExcelHeader("序号")
    private Integer id;

    /**
     * 渠道名称
     */
    @ExcelHeader("渠道名称")
    private String channelName;

    /**
     * 流水号
     */
    @ExcelHeader("serialNumber")
    private String serialNumber;

    /**
     * 交易类型,1,资金充值，2，兑换
     */
    @ExcelHeader("交易类型")
    private String payClass;

    /**
     * 交易金额
     */
    @ExcelHeader("交易金额")
    private Double payAmount;

    /**
     * 订单信息
     */
    @ExcelHeader("订单信息")
    private String orderInfo;

    /**
     * 渠道余额。
     */
    @ExcelHeader("渠道余额")
    private Float channelBalance;


    /**
     * 兑换账户
     */
    @ExcelHeader("兑换账户")
    private String account;


    /**
     * 兑换用户手机号码
     */
    @ExcelHeader("兑换用户手机号码")
    private String phoneNum;

    /**
     * 兑换时间
     */
    @ExcelHeader("兑换时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeRecordTime;


    /**
     * 兑换订单编号
     */
    @ExcelHeader("兑换订单编号")
    private String orderCode;

    /**
     * 兑换码id
     */
    private Integer cdkeyId;

    /**
     * cdkey
     */
    private String cdKey;

    /**
     * 兑换渠道
     */
    private String channelId;


    /**
     * 兑换过期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeOverTime;


    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    /**
     * 备注,用于记录出票失败，或者兑换码过期等信息
     */
    private String remark;


    /**
     * 流水描述
     */
    private String desc;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayClass() {
        return payClass;
    }

    public void setPayClass(String payClass) {
        this.payClass = payClass;
    }

    public Float getChannelBalance() {
        return channelBalance;
    }

    public void setChannelBalance(Float channelBalance) {
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


    public String getCdKey() {
        return cdKey;
    }

    public void setCdKey(String cdKey) {
        this.cdKey = cdKey;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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
}