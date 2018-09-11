package com.hhly.skeleton.lotto.base.recommend.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/11 11:51
 * @company 益彩网络科技公司
 */
public class RcmdPersonStatisInfo extends BaseBO {

    /**
     * 周期类型；2：近1周 3：近15天
     */
    @JsonIgnore
    private Integer type;

    /**
     * 过关方式；1：单关 2：2串1
     */
    @JsonIgnore
    private Integer passWay;

    /**
     * 战绩，几种几
     */
    private String recentRecord;

    /**
     * 命中率
     */
    private Double hitRate;

    /**
     * 回报率
     */
    private Double returnRate;

    /**
     * 近期状态走势
     */
    private String recentStatusTrend;



    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord;
    }

    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    public Double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(Double returnRate) {
        this.returnRate = returnRate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPassWay() {
        return passWay;
    }

    public void setPassWay(Integer passWay) {
        this.passWay = passWay;
    }

    public String getRecentStatusTrend() {
        return recentStatusTrend;
    }

    public void setRecentStatusTrend(String recentStatusTrend) {
        this.recentStatusTrend = recentStatusTrend;
    }
}
