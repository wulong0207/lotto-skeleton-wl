package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @Description 代理返佣配置变更明细信息BO
 * @Author longguoyou
 * @Date  2018/3/3 18:16
 * @Since 1.8
 */

public class AgentRebateConfigInfoBO extends BaseBO{

    private Integer id;
    private Integer rebateId;
    private Double agentMaxMoney;
    private Double agentMinMoney;
    private Float agentRatio;
    private Double directMaxMoney;
    private Double directMinMoney;
    private Float directRatio;
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

    public Double getAgentMaxMoney() {
        return agentMaxMoney;
    }

    public void setAgentMaxMoney(Double agentMaxMoney) {
        this.agentMaxMoney = agentMaxMoney;
    }

    public Double getAgentMinMoney() {
        return agentMinMoney;
    }

    public void setAgentMinMoney(Double agentMinMoney) {
        this.agentMinMoney = agentMinMoney;
    }

    public Float getAgentRatio() {
        return agentRatio;
    }

    public void setAgentRatio(Float agentRatio) {
        this.agentRatio = agentRatio;
    }

    public Double getDirectMaxMoney() {
        return directMaxMoney;
    }

    public void setDirectMaxMoney(Double directMaxMoney) {
        this.directMaxMoney = directMaxMoney;
    }

    public Double getDirectMinMoney() {
        return directMinMoney;
    }

    public void setDirectMinMoney(Double directMinMoney) {
        this.directMinMoney = directMinMoney;
    }

    public Float getDirectRatio() {
        return directRatio;
    }

    public void setDirectRatio(Float directRatio) {
        this.directRatio = directRatio;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
