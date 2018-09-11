package com.hhly.skeleton.task.order.vo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class OrderChannelVO extends BaseBO {

    /**
     * 查询开始时间
     */
    private String startTime;

    /**
     * 查询结束时间
     */
    private String endTime;

    /**
     * 渠道id
     */
    private String channelId;

    /**
     * 渠道最上级id
     */
    private String channelTopId;

    /**
     * 渠道等级
     */
    private Short orderNum;

    /**
     * 渠道过来的会员id
     */
    private String memberId;

    /**
     * 本站用户id
     */
    private String userId;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelTopId() {
        return channelTopId;
    }

    public void setChannelTopId(String channelTopId) {
        this.channelTopId = channelTopId;
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
