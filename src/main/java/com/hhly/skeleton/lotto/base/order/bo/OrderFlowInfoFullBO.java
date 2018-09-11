package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/4/28 17:44
 * @company 益彩网络科技公司
 */
public class OrderFlowInfoFullBO extends BaseBO {

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 彩旗
     */
    private String lotteryIssue;

    /**
     * 订单详情流程
     */
    private List<OrderFlowInfoBO> orderFlowInfoBOs;

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getLotteryIssue() {
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue;
    }

    public List<OrderFlowInfoBO> getOrderFlowInfoBOs() {
        return orderFlowInfoBOs;
    }

    public void setOrderFlowInfoBOs(List<OrderFlowInfoBO> orderFlowInfoBOs) {
        this.orderFlowInfoBOs = orderFlowInfoBOs;
    }
}
