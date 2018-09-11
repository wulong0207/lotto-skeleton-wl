package com.hhly.skeleton.cms.rcmdmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

import java.util.Date;

public class RcmdExeclBO extends BaseBO {

    /**
     * 日期 (周、月、年等)
     */
    @ExcelHeader("日期")
    private Date dt;

    /**
     * 过关方式；1：单关 2：2串1(注：目前仅针对竞足)
     */
    @ExcelHeader("投注方式")
    private Integer passWay;

    /**
     * 推单次数
     */
    @ExcelHeader("推单次数")
    private Integer times;

    /**
     * 收费推单次数
     */
    @ExcelHeader("收费推单次数")
    private Integer payTimes;

    /**
     * 免费推单次数
     */
    @ExcelHeader("免费推单次数")
    private Integer freeTimes;

    /**
     * 推单人数
     */
    @ExcelHeader("推单人数")
    private Integer counts;

    /**
     * 收费发单人数
     */
    @ExcelHeader("收费发单人数")
    private Integer payCounts;

    /**
     * 免费发单人数
     */
    @ExcelHeader("免费发单人数")
    private Integer freeCounts;

    /**
     * 收费2串1发单人数
     */
    @ExcelHeader("收费2串1发单人数")
    private Integer pay2c1Counts;

    /**
     * 收费单关发单人数
     */
    @ExcelHeader("收费单关发单人数")
    private Integer payDgCounts;

    /**
     * 购买人数
     */
    @ExcelHeader("购买人数")
    private Integer buyCounts;

    /**
     * 购买2串1人数
     */
    @ExcelHeader("购买2串1人数")
    private Integer buy2c1Counts;

    /**
     * 购买单关人数
     */
    @ExcelHeader("购买单关人数")
    private Integer buyDgCounts;

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Integer getPassWay() {
        return passWay;
    }

    public void setPassWay(Integer passWay) {
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