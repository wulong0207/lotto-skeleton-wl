package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/6/16 16:06
 * @company 益彩网络科技公司
 */
public class OrderStatisBO extends BaseBO {
    /**
     * 中奖次数
     */
    private Integer winCount;
    /**
     * 投注次数
     */
    private Integer betCount;

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getBetCount() {
        return betCount;
    }

    public void setBetCount(Integer betCount) {
        this.betCount = betCount;
    }
}
