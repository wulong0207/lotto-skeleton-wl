package com.hhly.skeleton.cms.ticketmgr.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种出票监控信息
 * @author jiangwei
 * @date 2017-2-15
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderTicketMonitorBO extends BaseBO {
    // 彩种名称
    private String lotteryName;
    // 期号
    private String lotteryIssue;
    // 彩种编号
    private int lotteryCode;
    // 彩期截止时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    // 未出票数
    private int notOutTicketCount;
    //竞技彩最近截止一场比赛的未出票数
    private int notOutTicketCountSport;
    // 未出票数金额
    private double notOutTicketMoney;
    // 未送票
    private int notSendTicketCount;
    // 已送票
    private int sendTicketCount;
    // 出票失败数
    private int failOutTicketCount;

    // 未拆票数
    private int notSplitOrderCount;
    // 未拆票金额
    private double notSplitOrderMoney;
    // 合买1进度 80%-90% 金额
    private double cooperationMoneyOne;
    // 合买2进度 70%-80% 金额
    private double cooperationMoneyTwo;
    // 合买3进度 70% 以下 金额
    private double cooperationMoneyThree;
    // 出票商统计信息
    private List<OrderTicketChannelMonitorBO> channelInfo;
    
    //出票警告判断
    private Map<String, Integer> isWarnMap;
    
    
    public OrderTicketMonitorBO(String lotteryName, String lotteryIssue,
            int lotteryCode, Date endTime) {
        this();
        this.lotteryName = lotteryName;
        this.lotteryIssue = lotteryIssue;
        this.lotteryCode = lotteryCode;
        this.endTime = endTime;
    }

    public OrderTicketMonitorBO(){
        channelInfo = new ArrayList<OrderTicketChannelMonitorBO>();
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

    public int getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(int lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getNotOutTicketCount() {
        return notOutTicketCount;
    }

    public void setNotOutTicketCount(int notOutTicketCount) {
        this.notOutTicketCount = notOutTicketCount;
    }

    public int getNotOutTicketCountSport() {
        return notOutTicketCountSport;
    }

    public void setNotOutTicketCountSport(int notOutTicketCountSport) {
        this.notOutTicketCountSport = notOutTicketCountSport;
    }

    public double getNotOutTicketMoney() {
        return notOutTicketMoney;
    }

    public void setNotOutTicketMoney(double notOutTicketMoney) {
        this.notOutTicketMoney = notOutTicketMoney;
    }

    public int getNotSendTicketCount() {
        return notSendTicketCount;
    }

    public void setNotSendTicketCount(int notSendTicketCount) {
        this.notSendTicketCount = notSendTicketCount;
    }

    public int getSendTicketCount() {
        return sendTicketCount;
    }

    public void setSendTicketCount(int sendTicketCount) {
        this.sendTicketCount = sendTicketCount;
    }

    public int getFailOutTicketCount() {
        return failOutTicketCount;
    }

    public void setFailOutTicketCount(int failOutTicketCount) {
        this.failOutTicketCount = failOutTicketCount;
    }

    public int getNotSplitOrderCount() {
        return notSplitOrderCount;
    }

    public void setNotSplitOrderCount(int notSplitOrderCount) {
        this.notSplitOrderCount = notSplitOrderCount;
    }

    public double getNotSplitOrderMoney() {
        return notSplitOrderMoney;
    }

    public void setNotSplitOrderMoney(double notSplitOrderMoney) {
        this.notSplitOrderMoney = notSplitOrderMoney;
    }

    public double getCooperationMoneyOne() {
        return cooperationMoneyOne;
    }

    public void setCooperationMoneyOne(double cooperationMoneyOne) {
        this.cooperationMoneyOne = cooperationMoneyOne;
    }

    public double getCooperationMoneyTwo() {
        return cooperationMoneyTwo;
    }

    public void setCooperationMoneyTwo(double cooperationMoneyTwo) {
        this.cooperationMoneyTwo = cooperationMoneyTwo;
    }

    public double getCooperationMoneyThree() {
        return cooperationMoneyThree;
    }

    public void setCooperationMoneyThree(double cooperationMoneyThree) {
        this.cooperationMoneyThree = cooperationMoneyThree;
    }

    public List<OrderTicketChannelMonitorBO> getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(List<OrderTicketChannelMonitorBO> channelInfo) {
        this.channelInfo = channelInfo;
    }

	public Map<String, Integer> getIsWarnMap() {
		return isWarnMap;
	}

	public void setIsWarnMap(Map<String, Integer> isWarnMap) {
		this.isWarnMap = isWarnMap;
	} 
}
