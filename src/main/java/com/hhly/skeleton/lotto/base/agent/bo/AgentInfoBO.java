package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description 代理信息 BO
 * @Author longguoyou
 * @Date  2018/3/6 16:02 
 * @Since 1.8
 */

public class AgentInfoBO extends BaseBO {

    private Integer id;
    private Integer userId;
    private String agentCode;
    private Integer parentAgentId;
    private Integer agentLevel;

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
        this.agentCode = agentCode;
    }

    public Integer getParentAgentId() {
        return parentAgentId;
    }

    public void setParentAgentId(Integer parentAgentId) {
        this.parentAgentId = parentAgentId;
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }
}
