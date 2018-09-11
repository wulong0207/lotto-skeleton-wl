package com.hhly.skeleton.NAgent.bo;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    返佣配置信息
 * @date 2018/3/3 11:28
 * @company 益彩网络科技有限公司
 */
public class AgentRebateBO {
    private Integer id;

    private Integer agentId;

    private Date addTime;

    /**
     * 默认标识0-否，1-是
     */
    private Integer defaultFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;

    private List<AgentRebateConfigBO> agentRebateConfigs;

    private String type;

    private Set<? extends Object> values;

    private Date maxAddTime;

    private Boolean searchOldAgent;

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

    public Integer getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Integer defaultFlag) {
        this.defaultFlag = defaultFlag;
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

    public List<AgentRebateConfigBO> getAgentRebateConfigs() {
        return agentRebateConfigs;
    }

    public void setAgentRebateConfigs(List<AgentRebateConfigBO> agentRebateConfigs) {
        this.agentRebateConfigs = agentRebateConfigs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<? extends Object> getValues() {
        return values;
    }

    public void setValues(Set<? extends Object> values) {
        this.values = values;
    }

    public Date getMaxAddTime() {
        return maxAddTime;
    }

    public void setMaxAddTime(Date maxAddTime) {
        this.maxAddTime = maxAddTime;
    }

    public Boolean getSearchOldAgent() {
        return searchOldAgent;
    }

    public void setSearchOldAgent(Boolean searchOldAgent) {
        this.searchOldAgent = searchOldAgent;
    }

    @Override
    public String toString() {
        return "AgentRebateBO{" +
                "id=" + id +
                ", agentId=" + agentId +
                ", addTime=" + addTime +
                ", agentRebateConfigs=" + agentRebateConfigs +
                '}';
    }
}