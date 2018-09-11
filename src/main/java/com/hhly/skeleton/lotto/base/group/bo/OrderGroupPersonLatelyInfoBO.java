package com.hhly.skeleton.lotto.base.group.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/6/30 11:05
 * @company 益彩网络科技公司
 */
public class OrderGroupPersonLatelyInfoBO extends BaseBO {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 累计中奖
     */
    private Double winAmount;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * caizhognbianhao
     */
    @JsonIgnore
    private Integer lotteryCode;

    /**
     * 中奖金额
     */
    private Double winAmout;

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Double getWinAmout() {
        return winAmout;
    }

    public void setWinAmout(Double winAmout) {
        this.winAmout = winAmout;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(Double winAmount) {
        this.winAmount = winAmount;
    }


    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}
