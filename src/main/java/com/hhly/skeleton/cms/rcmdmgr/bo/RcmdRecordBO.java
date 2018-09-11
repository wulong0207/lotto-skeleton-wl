package com.hhly.skeleton.cms.rcmdmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

public class RcmdRecordBO extends BaseBO {
    /**
     *
     */
    private Integer id;

    /**
     * 周期类型；0：全部；1:近7场2：近1周3：近15天4：近1个月5：近3个月6：近1年
     */
    private Integer type;

    /**
     * 周期开始日
     */
    private Date dtBegin;

    /**
     * 周期结束日
     */
    private Date dtEnd;

    /**
     * 过关方式；1：单关2：2串1(注：目前仅针对竞足)
     */
    private Integer passWay;

    /**
     * 推单人
     */
    private Integer userId;

    /**
     * 推单次数
     */
    private Integer times;

    /**
     * 命中次数
     */
    private Integer hitTimes;

    /**
     * 命中率
     */
    private Double hitRate;

    /**
     * 盈利率
     */
    private Double profitRate;

    /**
     * 关注人数
     */
    private Integer focusCounts;

    /**
     * 付费人数（购买人数）
     */
    private Integer payCounts;

    /**
     * 付费总额（购买总额）
     */
    private Double payAmount;

    /**
     * 阅读总数量/总浏览量
     */
    private Integer clicks;

    /**
     * 近期状态;1:不好；2：好；3：非常好
     */
    private Boolean recentStatus;

    /**
     * 近期状态走势;如：中,不中,中,中.....标识规则可自定
     */
    private String recentStatusTrend;

    /**
     * 连红数
     */
    private Integer continueHit;

    /**
     * 用户近期战绩；例如近7中7；15中12
     */
    private String recentRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDtBegin() {
        return dtBegin;
    }

    public void setDtBegin(Date dtBegin) {
        this.dtBegin = dtBegin;
    }

    public Date getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(Date dtEnd) {
        this.dtEnd = dtEnd;
    }

    public Integer getPassWay() {
        return passWay;
    }

    public void setPassWay(Integer passWay) {
        this.passWay = passWay;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getHitTimes() {
        return hitTimes;
    }

    public void setHitTimes(Integer hitTimes) {
        this.hitTimes = hitTimes;
    }

    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    public Double getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    public Integer getFocusCounts() {
        return focusCounts;
    }

    public void setFocusCounts(Integer focusCounts) {
        this.focusCounts = focusCounts;
    }

    public Integer getPayCounts() {
        return payCounts;
    }

    public void setPayCounts(Integer payCounts) {
        this.payCounts = payCounts;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Boolean getRecentStatus() {
        return recentStatus;
    }

    public void setRecentStatus(Boolean recentStatus) {
        this.recentStatus = recentStatus;
    }

    public String getRecentStatusTrend() {
        return recentStatusTrend;
    }

    public void setRecentStatusTrend(String recentStatusTrend) {
        this.recentStatusTrend = recentStatusTrend;
    }

    public Integer getContinueHit() {
        return continueHit;
    }

    public void setContinueHit(Integer continueHit) {
        this.continueHit = continueHit;
    }

    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord;
    }
}