package com.hhly.skeleton.cms.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    代理用户订单额统计信息
 * @date 2018/3/9 9:04
 * @company 益彩网络科技有限公司
 */
public class AgentOrderInfoBO extends BaseBO {

    private Integer userId;
    /**
     * 本月投注金额
     */
    private double monthOrderAmount;

    /**
     * 累计投注金额
     */
    private double accruedOrderAmount;

    /**
     * 累计投注次数
     */
    private int accruedOrderNum;

    private String agentCode;

    public double getMonthOrderAmount() {
        return monthOrderAmount;
    }

    public void setMonthOrderAmount(double monthOrderAmount) {
        this.monthOrderAmount = monthOrderAmount;
    }

    public double getAccruedOrderAmount() {
        return accruedOrderAmount;
    }

    public void setAccruedOrderAmount(double accruedOrderAmount) {
        this.accruedOrderAmount = accruedOrderAmount;
    }

    public int getAccruedOrderNum() {
        return accruedOrderNum;
    }

    public void setAccruedOrderNum(int accruedOrderNum) {
        this.accruedOrderNum = accruedOrderNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
