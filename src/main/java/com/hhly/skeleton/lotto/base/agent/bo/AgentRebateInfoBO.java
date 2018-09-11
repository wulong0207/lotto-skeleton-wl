package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
import java.util.List;

/**
 * @Description 代理返佣配置变更信息BO
 * @Author longguoyou
 * @Date  2018/3/3 18:20
 * @Since 1.8
 */
public class AgentRebateInfoBO extends BaseBO{
    /**主表信息*/
    private Integer id;
    private Integer agentId;
    private Date addTime;
    private Short defaultFlag;
    private String updateBy;
    private Date updateTime;
    private String remark;
    private List<AgentRebateConfigInfoBO> agentRebateConfigs;

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Short getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Short defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
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
        this.remark = remark;
    }

    public List<AgentRebateConfigInfoBO> getAgentRebateConfigs() {
        return agentRebateConfigs;
    }

    public void setAgentRebateConfigs(List<AgentRebateConfigInfoBO> agentRebateConfigs) {
        this.agentRebateConfigs = agentRebateConfigs;
    }
}
