package com.hhly.skeleton.cms.cooperate.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 彩种库存
 * @date 2018/3/12.
 * @company 益彩网络科技有限公司
 */
public class CooperateCdKeyLotteryRecodeListBO extends BaseBO {

    /**
     * id
     */
    private Integer id;

    /**
     * 官方兑换码
     */
    private String lottoCdkey;


    /**
     * 本站兑换码
     */
    private String myCdKey;

    /**
     * 兑换状态
     */
    private String stauts;

    /**
     * 兑换渠道id
     */
    private String channelId;

    /**
     * 彩种
     */
    private String lotteryCode;

    /**
     * 兑换码来源
     */
    private String exchangeChannel;

    /**
     * 兑换时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeRecordTime;


    /**
     * 兑换截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date exchangeOverTime;


    /**
     * userid
     */
    private String userId;

    /**
     * 账号名称
     */
    private String account;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getLottoCdkey() {
        return lottoCdkey;
    }

    public void setLottoCdkey(String lottoCdkey) {
        this.lottoCdkey = lottoCdkey;
    }

    public String getMyCdKey() {
        return myCdKey;
    }

    public void setMyCdKey(String myCdKey) {
        this.myCdKey = myCdKey;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getExchangeChannel() {
        return exchangeChannel;
    }

    public void setExchangeChannel(String exchangeChannel) {
        this.exchangeChannel = exchangeChannel;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
