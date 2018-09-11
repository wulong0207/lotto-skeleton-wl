package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class OrderChannelBO extends BaseBO {

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 彩种编码
     */
    private String lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 彩期编码
     */
    private String lotteryIssue;

    /**
     * 订单金额
     */
    private Double orderAmount;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 订单统一状态
     */
    private Short orderUnionStatus;

    /**
     * 开奖状态
     */
    private Short winningStatus;

    /**
     * 税后奖金
     */
    private Double aftBonus;

    /**
     * 平台
     */
    private Short platform;

    /**
     * 开奖时间，格式yyyy-MM-dd HH:mm:ss
     */
    private Date lotteryTime;

    /**
     * 派奖时间，格式yyyy-MM-dd HH:mm:ss
     */
    private Date sendTime;

    /**
     * 用户渠道id
     */
    private String channelMemberId;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getLotteryIssue() {
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getOrderUnionStatus() {
        return orderUnionStatus;
    }

    public void setOrderUnionStatus(Short orderUnionStatus) {
        this.orderUnionStatus = orderUnionStatus;
    }

    public Short getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Short winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Double getAftBonus() {
        return aftBonus;
    }

    public void setAftBonus(Double aftBonus) {
        this.aftBonus = aftBonus;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getChannelMemberId() {
        return channelMemberId;
    }

    public void setChannelMemberId(String channelMemberId) {
        this.channelMemberId = channelMemberId;
    }
}
