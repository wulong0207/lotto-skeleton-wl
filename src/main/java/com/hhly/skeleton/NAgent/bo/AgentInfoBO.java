package com.hhly.skeleton.NAgent.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    代理用户信息
 * @date 2018/3/3 11:28
 * @company 益彩网络科技有限公司
 */
public class AgentInfoBO {
    private Integer id;

    private Integer userId;

    private String agentCode;

    private Integer parentAgentId;

    private Short agentLevel;

    /**
     * '代理状态;0：禁用；1：启用'
     */
    private Integer agentStatus;

    private Date agentTime;

    private BigDecimal agentWallet;

    private Date updateTime;

    private String remark;

    /**
     * 直属会员投注总金额
     */
    private BigDecimal directMoney;

    /**
     * 直属下级会员投注总金额
     */
    private BigDecimal agentMoney;

    private BigDecimal agentRatio;

    private BigDecimal directRatio;

    private AgentRebateBO agentRebate;

    /**
     * 直属会员投注总金额
     */
    private BigDecimal directCommission;

    /**
     * 直属下级会员投注总金额
     */
    private BigDecimal agentCommission;

    /**
     * 此时间点成为代理，作查询用
     */
    private Date beforeAgentTime;

    private BigDecimal totalCommission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    public Integer getParentAgentId() {
        return parentAgentId;
    }

    public void setParentAgentId(Integer parentAgentId) {
        this.parentAgentId = parentAgentId;
    }

    public Short getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Short agentLevel) {
        this.agentLevel = agentLevel;
    }

    public Integer getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
    }

    public Date getAgentTime() {
        return agentTime;
    }

    public void setAgentTime(Date agentTime) {
        this.agentTime = agentTime;
    }

    public BigDecimal getAgentWallet() {
        return agentWallet;
    }

    public void setAgentWallet(BigDecimal agentWallet) {
        this.agentWallet = agentWallet;
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

    public AgentRebateBO getAgentRebate() {
        return agentRebate;
    }

    public void setAgentRebate(AgentRebateBO agentRebate) {
        this.agentRebate = agentRebate;
    }

    public BigDecimal getDirectMoney() {
        return directMoney;
    }

    public void setDirectMoney(BigDecimal directMoney) {
        this.directMoney = directMoney;
    }

    public BigDecimal getAgentMoney() {
        return agentMoney;
    }

    public void setAgentMoney(BigDecimal agentMoney) {
        this.agentMoney = agentMoney;
    }

    public BigDecimal getAgentRatio() {
        return agentRatio;
    }

    public void setAgentRatio(BigDecimal agentRatio) {
        this.agentRatio = agentRatio;
    }

    public BigDecimal getDirectRatio() {
        return directRatio;
    }

    public void setDirectRatio(BigDecimal directRatio) {
        this.directRatio = directRatio;
    }

    public BigDecimal getDirectCommission() {
        return directCommission;
    }

    public void setDirectCommission(BigDecimal directCommission) {
        this.directCommission = directCommission;
    }

    public BigDecimal getAgentCommission() {
        return agentCommission;
    }

    public void setAgentCommission(BigDecimal agentCommission) {
        this.agentCommission = agentCommission;
    }

    public Date getBeforeAgentTime() {
        return beforeAgentTime;
    }

    public void setBeforeAgentTime(Date beforeAgentTime) {
        this.beforeAgentTime = beforeAgentTime;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    @Override
    public String toString() {
        return "AgentInfoBO{" +
                "id=" + id +
                ", userId=" + userId +
                ", agentCode='" + agentCode + '\'' +
                ", directMoney=" + directMoney +
                ", agentMoney=" + agentMoney +
                ", agentRatio=" + agentRatio +
                ", directRatio=" + directRatio +
                ", agentRebate=" + agentRebate +
                ", directCommission=" + directCommission +
                ", agentCommission=" + agentCommission +
                ", totalCommission=" + totalCommission +
                '}';
    }
}