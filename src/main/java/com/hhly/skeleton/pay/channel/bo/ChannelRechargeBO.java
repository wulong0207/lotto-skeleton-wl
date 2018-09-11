package com.hhly.skeleton.pay.channel.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author zhouyang
 * @date 2018.6.8
 * 渠道充值列表
 */
public class ChannelRechargeBO extends BaseBO {

    /**
     * 充值流水号（交易流水号）
     */
    private String transRechargeCode;

    /**
     * 交易状态
     */
    private Short transStatus;

    /**
     * 充值到账金额
     */
    private Double arrivalAmount;

    /**
     * 充值平台
     */
    private Short platform;

    /**
     * 渠道用户id
     */
    private String channelMemberId;

    /**
     * 交易时间
     */
    private Date transTime;

    public String getTransRechargeCode() {
        return transRechargeCode;
    }

    public void setTransRechargeCode(String transRechargeCode) {
        this.transRechargeCode = transRechargeCode;
    }

    public Short getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(Short transStatus) {
        this.transStatus = transStatus;
    }

    public Double getArrivalAmount() {
        return arrivalAmount;
    }

    public void setArrivalAmount(Double arrivalAmount) {
        this.arrivalAmount = arrivalAmount;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getChannelMemberId() {
        return channelMemberId;
    }

    public void setChannelMemberId(String channelMemberId) {
        this.channelMemberId = channelMemberId;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }
}
