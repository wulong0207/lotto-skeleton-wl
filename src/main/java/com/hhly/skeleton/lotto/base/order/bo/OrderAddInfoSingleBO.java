package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/4/7 16:41
 * @company 益彩网络科技公司
 */
public class OrderAddInfoSingleBO extends BaseBO {

    /**
     * 追号编号
     */
    private String orderAddCode;

    /**
     * 停止类型； 1：奖项；2：金额；3：永追
     */
    private Integer stopType;

    /**
     * 追停条件
     */
    private String stopCondition;

    public String getOrderAddCode() {
        return orderAddCode;
    }

    public void setOrderAddCode(String orderAddCode) {
        this.orderAddCode = orderAddCode;
    }

    public Integer getStopType() {
        return stopType;
    }

    public void setStopType(Integer stopType) {
        this.stopType = stopType;
    }

    public String getStopCondition() {
        return stopCondition;
    }

    public void setStopCondition(String stopCondition) {
        this.stopCondition = stopCondition;
    }
}
