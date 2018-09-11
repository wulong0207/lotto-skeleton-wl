package com.hhly.skeleton.cms.ticketmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

@SuppressWarnings("serial")
public class TicketMonitorConfigVO extends PageVO{
    
    private Integer id;

    private Integer lotteryId;

    private String lotteryName;

    private Integer noSplit;

    private Integer noOut;

    private Integer noOutMoney;

    private Integer noSend;

    private Integer send;

    private Integer endTime;

    private Integer channelTicketNum;

    private Integer channelMoney;

    private Integer maxSendtime;

    private String refreshTime;
    
    private Integer beforeIssueEnd;
    
    private Integer beforeIssueEndSecond;

    private Short status;
    
    private String createBy;

    private String modifyBy;

    private Date modifyTime;

    private Date updateTime;

    private Date createTime;
    
    

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Integer getNoSplit() {
        return noSplit;
    }

    public void setNoSplit(Integer noSplit) {
        this.noSplit = noSplit;
    }

    public Integer getNoOut() {
        return noOut;
    }

    public void setNoOut(Integer noOut) {
        this.noOut = noOut;
    }

    public Integer getNoOutMoney() {
        return noOutMoney;
    }

    public void setNoOutMoney(Integer noOutMoney) {
        this.noOutMoney = noOutMoney;
    }

    public Integer getNoSend() {
        return noSend;
    }

    public void setNoSend(Integer noSend) {
        this.noSend = noSend;
    }

    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
    }

    

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getChannelTicketNum() {
        return channelTicketNum;
    }

    public void setChannelTicketNum(Integer channelTicketNum) {
        this.channelTicketNum = channelTicketNum;
    }

    public Integer getChannelMoney() {
        return channelMoney;
    }

    public void setChannelMoney(Integer channelMoney) {
        this.channelMoney = channelMoney;
    }

    public Integer getMaxSendtime() {
        return maxSendtime;
    }

    public void setMaxSendtime(Integer maxSendtime) {
        this.maxSendtime = maxSendtime;
    }

    

    public String getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(String refreshTime) {
        this.refreshTime = refreshTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getBeforeIssueEndSecond() {
        return beforeIssueEndSecond;
    }

    public void setBeforeIssueEndSecond(Integer beforeIssueEndSecond) {
        this.beforeIssueEndSecond = beforeIssueEndSecond;
    }

    public Integer getBeforeIssueEnd() {
        return beforeIssueEnd;
    }

    public void setBeforeIssueEnd(Integer beforeIssueEnd) {
        this.beforeIssueEnd = beforeIssueEnd;
    }
}