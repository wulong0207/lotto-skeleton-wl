package com.hhly.skeleton.cms.cooperate.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class CooperateCdkeyVO extends PageVO {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 官方cdkey
     */
    private String lottoCdkey;

    /**
     * 本站cdkey
     */
    private String myCdkey;

    /**
     * 彩种code
     */
    private String lotteryCode;

    /**
     * 彩种code
     */
    private String channelId;


    /**
     * 兑换状态;1,已分配;2,未分配;3,待兑换;4,已兑换;5,已过期
     */
    private Integer stauts;

    /**
     * 出票渠道;1,福彩积分兑换;2,体彩积分兑换
     */
    private String exchangeChannel;

    /**
     * 官方兑换截止时间，如果null则永久有效
     */
    private Date overTime;


    /**
     * 官方兑换开始时间
     */
    private Date beginTime;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    /**
     * 出票渠道
     */
    private String ticketChannel;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTimeBegin;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTimeEnd;


    public Date getModifyTimeBegin() {
        return modifyTimeBegin;
    }

    public void setModifyTimeBegin(Date modifyTimeBegin) {
        this.modifyTimeBegin = modifyTimeBegin;
    }

    public Date getModifyTimeEnd() {
        return modifyTimeEnd;
    }

    public void setModifyTimeEnd(Date modifyTimeEnd) {
        this.modifyTimeEnd = modifyTimeEnd;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getTicketChannel() {
        return ticketChannel;
    }

    public void setTicketChannel(String ticketChannel) {
        this.ticketChannel = ticketChannel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLottoCdkey() {
        return lottoCdkey;
    }

    public void setLottoCdkey(String lottoCdkey) {
        this.lottoCdkey = lottoCdkey == null ? null : lottoCdkey.trim();
    }

    public String getMyCdkey() {
        return myCdkey;
    }

    public void setMyCdkey(String myCdkey) {
        this.myCdkey = myCdkey == null ? null : myCdkey.trim();
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public String getExchangeChannel() {
        return exchangeChannel;
    }

    public void setExchangeChannel(String exchangeChannel) {
        this.exchangeChannel = exchangeChannel;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
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
}