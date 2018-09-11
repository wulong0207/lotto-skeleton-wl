package com.hhly.skeleton.activity.bo;


import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 竟足/竞篮首投活动规则
 * @date 2017/8/3 16:41
 * @company 益彩网络科技公司
 */
public class JzstActivityRule extends BaseBO {

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 订单总倍数
     */
    private Integer multipleNum;

    /**
     * 倍数对应的立减金额
     */
    private Double reduceAmount;

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(Integer multipleNum) {
        this.multipleNum = multipleNum;
    }

    public Double getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(Double reduceAmount) {
        this.reduceAmount = reduceAmount;
    }
}
