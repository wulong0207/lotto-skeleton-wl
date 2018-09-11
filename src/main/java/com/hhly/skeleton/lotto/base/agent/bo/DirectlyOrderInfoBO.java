package com.hhly.skeleton.lotto.base.agent.bo;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description 区分之前的订单信息BO，用于代理系统查询
 * @Author longguoyou
 * @Date  2018/3/1 15:02
 * @Since 1.8
 */

public class DirectlyOrderInfoBO extends BaseBO{
    /**
     * 注册时间
     */
    private String registerTime;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 彩种名称
     */
    private String lotteryName;
    /**
     * 投注金额
     */
    private Double orderAmount;

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
