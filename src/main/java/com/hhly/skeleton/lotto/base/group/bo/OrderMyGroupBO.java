package com.hhly.skeleton.lotto.base.group.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/4/28 18:26
 * @company 益彩网络科技公司
 */
public class OrderMyGroupBO extends BaseBO {

    /**
     * 用户名
     */
    private String nick;

    /**
     * 认购比例
     */
    private Double buyRatio;

    /**
     * 认购金额
     */
    private Double buyAmount;

    /**
     * 购买时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;

    /**
     * 中奖金额。根据订单状态，等待开奖，未中奖，已中奖则取此字段,已经扣除了佣金
     */
    private Double winAmount;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Double getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(Double winAmount) {
        this.winAmount = winAmount;
    }

    public Double getBuyRatio() {
        return buyRatio;
    }

    public void setBuyRatio(Double buyRatio) {
        this.buyRatio = buyRatio;
    }
}
