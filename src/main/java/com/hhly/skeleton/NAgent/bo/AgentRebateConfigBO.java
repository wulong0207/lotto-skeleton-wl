package com.hhly.skeleton.NAgent.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    返佣配置明细表
 * @date 2018/3/3 11:28
 * @company 益彩网络科技有限公司
 */
public class AgentRebateConfigBO {
    private Integer id;

    private Integer rebateId;

    private BigDecimal directMinMoney;

    private BigDecimal directMaxMoney;

    private BigDecimal directRatio;

    private BigDecimal agentMinMoney;

    private BigDecimal agentMaxMoney;

    private BigDecimal agentRatio;

    private String createBy;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRebateId() {
        return rebateId;
    }

    public void setRebateId(Integer rebateId) {
        this.rebateId = rebateId;
    }

    public BigDecimal getDirectMinMoney() {
        return directMinMoney;
    }

    public void setDirectMinMoney(BigDecimal directMinMoney) {
        this.directMinMoney = directMinMoney;
    }

    public BigDecimal getDirectMaxMoney() {
        return directMaxMoney;
    }

    public void setDirectMaxMoney(BigDecimal directMaxMoney) {
        this.directMaxMoney = directMaxMoney;
    }

    public BigDecimal getDirectRatio() {
        return directRatio;
    }

    public void setDirectRatio(BigDecimal directRatio) {
        this.directRatio = directRatio;
    }

    public BigDecimal getAgentMinMoney() {
        return agentMinMoney;
    }

    public void setAgentMinMoney(BigDecimal agentMinMoney) {
        this.agentMinMoney = agentMinMoney;
    }

    public BigDecimal getAgentMaxMoney() {
        return agentMaxMoney;
    }

    public void setAgentMaxMoney(BigDecimal agentMaxMoney) {
        this.agentMaxMoney = agentMaxMoney;
    }

    public BigDecimal getAgentRatio() {
        return agentRatio;
    }

    public void setAgentRatio(BigDecimal agentRatio) {
        this.agentRatio = agentRatio;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AgentRebateConfigBO{" +
                "id=" + id +
                ", rebateId=" + rebateId +
                ", directMinMoney=" + directMinMoney +
                ", directMaxMoney=" + directMaxMoney +
                ", directRatio=" + directRatio +
                ", agentMinMoney=" + agentMinMoney +
                ", agentMaxMoney=" + agentMaxMoney +
                ", agentRatio=" + agentRatio +
                '}';
    }
}
