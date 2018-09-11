package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 用户中奖轮播信息实体类
 * @date 2017/10/17
 * @company 益彩网络科技公司
 */
public class UserWinInfoBO extends BaseBO {

    /**
     * 税前奖金
     */
    private Double preBonus;

    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    /**
     * 彩种名
     */
    private String lotteryName;

    /**
     * 用户昵称
     */
    private String nickName;

    public Double getPreBonus() {
        return preBonus;
    }

    public void setPreBonus(Double preBonus) {
        this.preBonus = preBonus;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
