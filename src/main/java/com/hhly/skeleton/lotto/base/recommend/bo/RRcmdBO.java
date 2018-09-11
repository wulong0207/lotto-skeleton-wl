package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class RRcmdBO extends BaseBO{
    /**
     * 
     */
    private Integer id;

    /**
     * 周期类型；0：全部；1:周 2：月 3：年
     */
    private Boolean type;

    /**
     * 日期 (周、月、年等)
     */
    private Date dt;

    /**
     * 周
     */
    private Short wk;

    /**
     * 周期开始日
     */
    private Date dtBegin;

    /**
     * 周期结束日
     */
    private Date dtEnd;

    /**
     * 过关方式；1：单关 2：2串1(注：目前仅针对竞足)
     */
    private Byte passWay;

    /**
     * 推单次数
     */
    private Integer times;

    /**
     * 收费推单次数
     */
    private Integer payTimes;

    /**
     * 收费18元推单次数
     */
    private Integer pay18Times;

    /**
     * 收费28元推单次数
     */
    private Integer pay28Times;

    /**
     * 收费58元推单次数
     */
    private Integer pay58Times;

    /**
     * 收费198元推单次数
     */
    private Integer pay198Times;

    /**
     * 免费推单次数
     */
    private Integer freeTimes;

    /**
     * 推单人数
     */
    private Integer counts;

    /**
     * 收费发单人数
     */
    private Integer payCounts;

    /**
     * 免费发单人数
     */
    private Integer freeCounts;

    /**
     * 收费2串1发单人数
     */
    private Integer pay2c1Counts;

    /**
     * 收费单关发单人数
     */
    private Integer payDgCounts;

    /**
     * 购买人数
     */
    private Integer buyCounts;

    /**
     * 购买18元单人数
     */
    private Integer buy18Counts;

    /**
     * 购买28元单人数
     */
    private Integer buy28Counts;

    /**
     * 购买58元单人数
     */
    private Integer buy58Counts;

    /**
     * 购买198元单人数
     */
    private Integer buy198Counts;

    /**
     * 购买2串1人数
     */
    private Integer buy2c1Counts;

    /**
     * 购买单关人数
     */
    private Integer buyDgCounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Short getWk() {
        return wk;
    }

    public void setWk(Short wk) {
        this.wk = wk;
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

    public Byte getPassWay() {
        return passWay;
    }

    public void setPassWay(Byte passWay) {
        this.passWay = passWay;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getPayTimes() {
        return payTimes;
    }

    public void setPayTimes(Integer payTimes) {
        this.payTimes = payTimes;
    }

    public Integer getPay18Times() {
        return pay18Times;
    }

    public void setPay18Times(Integer pay18Times) {
        this.pay18Times = pay18Times;
    }

    public Integer getPay28Times() {
        return pay28Times;
    }

    public void setPay28Times(Integer pay28Times) {
        this.pay28Times = pay28Times;
    }

    public Integer getPay58Times() {
        return pay58Times;
    }

    public void setPay58Times(Integer pay58Times) {
        this.pay58Times = pay58Times;
    }

    public Integer getPay198Times() {
        return pay198Times;
    }

    public void setPay198Times(Integer pay198Times) {
        this.pay198Times = pay198Times;
    }

    public Integer getFreeTimes() {
        return freeTimes;
    }

    public void setFreeTimes(Integer freeTimes) {
        this.freeTimes = freeTimes;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Integer getPayCounts() {
        return payCounts;
    }

    public void setPayCounts(Integer payCounts) {
        this.payCounts = payCounts;
    }

    public Integer getFreeCounts() {
        return freeCounts;
    }

    public void setFreeCounts(Integer freeCounts) {
        this.freeCounts = freeCounts;
    }

    public Integer getPay2c1Counts() {
        return pay2c1Counts;
    }

    public void setPay2c1Counts(Integer pay2c1Counts) {
        this.pay2c1Counts = pay2c1Counts;
    }

    public Integer getPayDgCounts() {
        return payDgCounts;
    }

    public void setPayDgCounts(Integer payDgCounts) {
        this.payDgCounts = payDgCounts;
    }

    public Integer getBuyCounts() {
        return buyCounts;
    }

    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    public Integer getBuy18Counts() {
        return buy18Counts;
    }

    public void setBuy18Counts(Integer buy18Counts) {
        this.buy18Counts = buy18Counts;
    }

    public Integer getBuy28Counts() {
        return buy28Counts;
    }

    public void setBuy28Counts(Integer buy28Counts) {
        this.buy28Counts = buy28Counts;
    }

    public Integer getBuy58Counts() {
        return buy58Counts;
    }

    public void setBuy58Counts(Integer buy58Counts) {
        this.buy58Counts = buy58Counts;
    }

    public Integer getBuy198Counts() {
        return buy198Counts;
    }

    public void setBuy198Counts(Integer buy198Counts) {
        this.buy198Counts = buy198Counts;
    }

    public Integer getBuy2c1Counts() {
        return buy2c1Counts;
    }

    public void setBuy2c1Counts(Integer buy2c1Counts) {
        this.buy2c1Counts = buy2c1Counts;
    }

    public Integer getBuyDgCounts() {
        return buyDgCounts;
    }

    public void setBuyDgCounts(Integer buyDgCounts) {
        this.buyDgCounts = buyDgCounts;
    }
}