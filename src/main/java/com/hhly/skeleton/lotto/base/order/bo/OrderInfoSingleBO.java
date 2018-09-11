package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;


/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/4/5 15:07
 * @company 益彩网络科技公司
 */
public class OrderInfoSingleBO extends BaseBO {

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 彩种编号
     */
    private String lotteryCode;

    /**
     * 订单总金额
     */
    private Double totalAmount;

    /**
     * 税前奖金
     */
    private Double preBonus;

    /**
     * 支付使用的红包金额
     */
    private Double redAmount;

    /**
     * 支付使用的现金金额
     */
    private Double cashAmount;

    /**
     * 加奖奖金
     */
    private Double addAmount;

    /**
     * 加奖红包
     */
    private Double addRedAmount;

    /**
     * 投注失败原因
     */
    private String betFailMsg;

    /**
     *  中奖追停原因
     */
    private String addStopFailMsg;

    /**
     *  出票时间
     */
    private String comeTicketDate;


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

    public String getBetFailMsg() {
        return betFailMsg;
    }

    public void setBetFailMsg(String betFailMsg) {
        this.betFailMsg = betFailMsg;
    }

    public String getAddStopFailMsg() {
        return addStopFailMsg;
    }

    public void setAddStopFailMsg(String addStopFailMsg) {
        this.addStopFailMsg = addStopFailMsg;
    }

    public String getComeTicketDate() {
        return comeTicketDate;
    }

    public void setComeTicketDate(String comeTicketDate) {
        this.comeTicketDate = comeTicketDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getRedAmount() {
        return redAmount;
    }

    public void setRedAmount(Double redAmount) {
        this.redAmount = redAmount;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Double getAddAmount() {
        return addAmount;
    }

    public void setAddAmount(Double addAmount) {
        this.addAmount = addAmount;
    }

    public Double getAddRedAmount() {
        return addRedAmount;
    }

    public void setAddRedAmount(Double addRedAmount) {
        this.addRedAmount = addRedAmount;
    }

    public Double getPreBonus() {
        return preBonus;
    }

    public void setPreBonus(Double preBonus) {
        this.preBonus = preBonus;
    }
}




