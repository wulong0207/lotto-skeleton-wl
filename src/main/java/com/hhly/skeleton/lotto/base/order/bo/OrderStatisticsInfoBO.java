package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单统计信息
 * @date 2017/3/17 17:10
 * @company 益彩网络科技公司
 */
public class OrderStatisticsInfoBO extends BaseBO {

    /**
     * 认购总金额
     */
    private Double totalOrderAmount;

    /**
     *   中奖总金额
     */
    private Double winTotalAmount;

    /**
     * 中奖次数
     */
    private Integer winCount;

    public Double getTotalOrderAmount() {
        return totalOrderAmount;
    }

    public void setTotalOrderAmount(Double totalOrderAmount) {
        this.totalOrderAmount = totalOrderAmount;
    }

    public Double getWinTotalAmount() {
        return winTotalAmount;
    }

    public void setWinTotalAmount(Double winTotalAmount) {
        this.winTotalAmount = winTotalAmount;
    }

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }
}
