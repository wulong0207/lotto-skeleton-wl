package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;


public class RAgentDetailBO extends BaseBO{
    /**
     * 
     */
    private Integer id;

    /**
     * 日期 yyyy-MM-dd
     */
    private String dt;

    /**
     * 代理id
     */
    private Integer agentId;

    /**
     * 业务投注人数
     */
    private Integer directBuyCount;

    /**
     * 业务投注金额
     */
    private String directBuyMoney;

    /**
     * 业务月投注金额
     */
    private String directMonthBuyMoney;

    /**
     * 代理投注人数
     */
    private Integer agentBuyCount;

    /**
     * 代理投注金额
     */
    private String agentBuyMoney;

    /**
     * 代理月投注金额
     */
    private String agentMonthBuyMoney;

    /**
     * 今日直属会员新增人数
     */
    private Integer todayDirectAdd;

    /**
     * 累计直属会员总数
     */
    private Integer totalDirectCount;

    /**
     * 今日代理新增人数
     */
    private Integer todayAgentAdd;

    /**
     * 累计代理人总数
     */
    private Integer totalAgentCount;

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

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getDirectBuyCount() {
        return directBuyCount;
    }

    public void setDirectBuyCount(Integer directBuyCount) {
        this.directBuyCount = directBuyCount;
    }

    public Integer getAgentBuyCount() {
        return agentBuyCount;
    }

    public void setAgentBuyCount(Integer agentBuyCount) {
        this.agentBuyCount = agentBuyCount;
    }


    public String getDirectBuyMoney() {
        return directBuyMoney;
    }

    public void setDirectBuyMoney(String directBuyMoney) {
        this.directBuyMoney = directBuyMoney;
    }

    public String getDirectMonthBuyMoney() {
        return directMonthBuyMoney;
    }

    public void setDirectMonthBuyMoney(String directMonthBuyMoney) {
        this.directMonthBuyMoney = directMonthBuyMoney;
    }

    public String getAgentBuyMoney() {
        return agentBuyMoney;
    }

    public void setAgentBuyMoney(String agentBuyMoney) {
        this.agentBuyMoney = agentBuyMoney;
    }

    public String getAgentMonthBuyMoney() {
        return agentMonthBuyMoney;
    }

    public void setAgentMonthBuyMoney(String agentMonthBuyMoney) {
        this.agentMonthBuyMoney = agentMonthBuyMoney;
    }

    public Integer getTodayDirectAdd() {
        return todayDirectAdd;
    }

    public void setTodayDirectAdd(Integer todayDirectAdd) {
        this.todayDirectAdd = todayDirectAdd;
    }

    public Integer getTotalDirectCount() {
        return totalDirectCount;
    }

    public void setTotalDirectCount(Integer totalDirectCount) {
        this.totalDirectCount = totalDirectCount;
    }

    public Integer getTodayAgentAdd() {
        return todayAgentAdd;
    }

    public void setTodayAgentAdd(Integer todayAgentAdd) {
        this.todayAgentAdd = todayAgentAdd;
    }

    public Integer getTotalAgentCount() {
        return totalAgentCount;
    }

    public void setTotalAgentCount(Integer totalAgentCount) {
        this.totalAgentCount = totalAgentCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}