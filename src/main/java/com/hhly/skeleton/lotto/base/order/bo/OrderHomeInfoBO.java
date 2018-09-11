package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 用户首页订单
 * @date 2017/3/31 12:10
 * @company 益彩网络科技公司
 */
public class OrderHomeInfoBO extends BaseBO {

    /**
     * 投注次数
     */
    private Integer betNum;

    /**
     * 中奖次数
     */
    private Integer winNum;

    /**
     * 订单集合
     */
    private List<OrderBaseInfoBO> orderListInfoBOs;

    public List<OrderBaseInfoBO> getOrderListInfoBOs() {
        return orderListInfoBOs;
    }

    public void setOrderListInfoBOs(List<OrderBaseInfoBO> orderListInfoBOs) {
        this.orderListInfoBOs = orderListInfoBOs;
    }

    public Integer getBetNum() {
        return betNum;
    }

    public void setBetNum(Integer betNum) {
        this.betNum = betNum;
    }

    public Integer getWinNum() {
        return winNum;
    }

    public void setWinNum(Integer winNum) {
        this.winNum = winNum;
    }
}
