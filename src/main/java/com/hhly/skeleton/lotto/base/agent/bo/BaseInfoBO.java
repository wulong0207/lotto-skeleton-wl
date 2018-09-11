package com.hhly.skeleton.lotto.base.agent.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @Description 代理系统个人中心查询基础信息BO
 * @Author longguoyou
 * @Date  2018/3/1 14:44
 * @Since 1.8
 */
public class BaseInfoBO extends BaseBO{
    private Integer id;
    /**注册来源*/
    private String registerSource;
    /**注册时间*/
//    @JsonFormat(pattern = "MM-dd HH:mm", timezone = "GMT+8")
    private Date agentTime;
    /**投注金额*/
    private Double orderAmount;
    /**手机号码*/
    private String phoneNumber;
    /**会员头像*/
    private String headUrl;
    /**
     * 昵称
     */
    private String nickName;

    public String getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(String registerSource) {
        this.registerSource = registerSource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAgentTime() {
        return agentTime;
    }

    public void setAgentTime(Date agentTime) {
        this.agentTime = agentTime;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
