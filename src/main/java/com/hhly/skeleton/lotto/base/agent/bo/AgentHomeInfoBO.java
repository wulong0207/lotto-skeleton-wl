package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/3/3 15:15
 * @company 益彩网络科技公司
 */
public class AgentHomeInfoBO extends BaseBO {

    /**
     * 代理人ID
     */
    private Integer agentId;

    /**
     * 头部信息-账号
     */
    private String account;

    /**
     * 头部信息-代理钱包
     */
    private String agentWallet;

    /**
     * 头部信息-购彩余额
     */
    private String balance;

    /**
     * 头部信息-推广编号
     */
    private String code;

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
     * 今日直属会员返佣
     */
    private Double todayDirectIncome;

    /**
     * 今日代理会员返佣
     */
    private Double todayAgentIncome;

    /**
     * 今日收入
     */
    private Double todayIncome;

    /**
     * 本月收入
     */
    private Double monthIncome;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAgentWallet() {
        return agentWallet;
    }

    public void setAgentWallet(String agentWallet) {
        this.agentWallet = agentWallet;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Double getTodayDirectIncome() {
        return todayDirectIncome;
    }

    public void setTodayDirectIncome(Double todayDirectIncome) {
        this.todayDirectIncome = todayDirectIncome;
    }

    public Double getTodayAgentIncome() {
        return todayAgentIncome;
    }

    public void setTodayAgentIncome(Double todayAgentIncome) {
        this.todayAgentIncome = todayAgentIncome;
    }

    public Double getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(Double todayIncome) {
        this.todayIncome = todayIncome;
    }

    public Double getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(Double monthIncome) {
        this.monthIncome = monthIncome;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }
}
