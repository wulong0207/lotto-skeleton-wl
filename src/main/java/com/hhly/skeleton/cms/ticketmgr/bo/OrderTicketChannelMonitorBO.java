package com.hhly.skeleton.cms.ticketmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 出票监控 出票商统计信息
 * @author jiangwei
 * @date 2017-2-15
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderTicketChannelMonitorBO extends BaseBO {
    // 出票商名称
    private String channelName;
    // 出票商ID
    private String ticketChannelId;
    // 出票商权重
    private int sendWeight;
    // 已送票数
    private int sendTicketCount;
    // 已送票金额
    private double sendTicketMoney;
    
    //最早出票时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date comeOutTime;
    
    public OrderTicketChannelMonitorBO(){
        
    }
    
    public OrderTicketChannelMonitorBO(TicketConfigBO ticketConfigBO) {
       this.channelName = ticketConfigBO.getDrawerName();
       this.sendWeight = ticketConfigBO.getSendWeight();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getTicketChannelId() {
        return ticketChannelId;
    }

    public void setTicketChannelId(String ticketChannelId) {
        this.ticketChannelId = ticketChannelId;
    }

    public int getSendWeight() {
        return sendWeight;
    }

    public void setSendWeight(int sendWeight) {
        this.sendWeight = sendWeight;
    }

    public int getSendTicketCount() {
        return sendTicketCount;
    }

    public void setSendTicketCount(int sendTicketCount) {
        this.sendTicketCount = sendTicketCount;
    }

    public double getSendTicketMoney() {
        return sendTicketMoney;
    }

    public void setSendTicketMoney(double sendTicketMoney) {
        this.sendTicketMoney = sendTicketMoney;
    }

    public Date getComeOutTime() {
        return comeOutTime;
    }

    public void setComeOutTime(Date comeOutTime) {
        this.comeOutTime = comeOutTime;
    }

}
