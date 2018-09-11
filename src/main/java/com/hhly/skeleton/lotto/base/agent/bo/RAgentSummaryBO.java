package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class RAgentSummaryBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 代理id
     */
    private Integer agentId;

    /**
     * 总收入
     */
    private String totalIncome;

    /**
     * 本月收入
     */
    private String monthIncome;

    /**
     * 今日收入
     */
    private String todayIncome;

    /**
     * 今日直属会员返佣
     */
    private String todayDirectIncome;

    /**
     * 今日代理会员返佣
     */
    private String todayAgentIncome;

    /**
     * 直属会员总数
     */
    private Integer totalDirectCount;

    /**
     * 本月直属会员新增人数
     */
    private Integer monthDirectAdd;

    /**
     * 今日直属会员新增人数
     */
    private Integer todayDirectAdd;

    /**
     * 名下代理人总数
     */
    private Integer totalAgentCount;

    /**
     * 本月名下代理新增人数
     */
    private Integer monthAgentAdd;

    /**
     * 今日名下代理新增人数
     */
    private Integer todayAgentAdd;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * 备注说明
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getTotalDirectCount() {
        return totalDirectCount;
    }

    public void setTotalDirectCount(Integer totalDirectCount) {
        this.totalDirectCount = totalDirectCount;
    }

    public Integer getMonthDirectAdd() {
        return monthDirectAdd;
    }

    public void setMonthDirectAdd(Integer monthDirectAdd) {
        this.monthDirectAdd = monthDirectAdd;
    }

    public Integer getTodayDirectAdd() {
        return todayDirectAdd;
    }

    public void setTodayDirectAdd(Integer todayDirectAdd) {
        this.todayDirectAdd = todayDirectAdd;
    }

    public Integer getTotalAgentCount() {
        return totalAgentCount;
    }

    public void setTotalAgentCount(Integer totalAgentCount) {
        this.totalAgentCount = totalAgentCount;
    }

    public Integer getMonthAgentAdd() {
        return monthAgentAdd;
    }

    public void setMonthAgentAdd(Integer monthAgentAdd) {
        this.monthAgentAdd = monthAgentAdd;
    }

    public Integer getTodayAgentAdd() {
        return todayAgentAdd;
    }

    public void setTodayAgentAdd(Integer todayAgentAdd) {
        this.todayAgentAdd = todayAgentAdd;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(String totalIncome) {
        this.totalIncome = totalIncome;
    }

    public String getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(String monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(String todayIncome) {
        this.todayIncome = todayIncome;
    }

    public String getTodayDirectIncome() {
        return todayDirectIncome;
    }

    public void setTodayDirectIncome(String todayDirectIncome) {
        this.todayDirectIncome = todayDirectIncome;
    }

    public String getTodayAgentIncome() {
        return todayAgentIncome;
    }

    public void setTodayAgentIncome(String todayAgentIncome) {
        this.todayAgentIncome = todayAgentIncome;
    }
}