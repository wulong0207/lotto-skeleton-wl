package com.hhly.skeleton.lotto.base.agent.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @Description 代理系统查询参数封装
 * @Author longguoyou
 * @Date 2018/3/3 18:04
 * @Since 1.8
 */

public class AgentQueryVO extends PageVO {

    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 注册代理时间
     */
    private Date agentTime;
    /**
     * 代理编号
     */
    private Integer agentId;
    /**
     * 用户token
     */
    private String token;
    /**
     * 排序规则：默认为2。1：注册时间顺序；2：注册时间倒序；3：按投注金额顺序；4：按投注金额倒序
     */
    private Integer sortType;
    /**
     * 代理级别
     */
    private Integer agentLevel;
    /**
     * 返佣配置 : 默认为1。0=用户配置信息，1=系统自动添加
     */
    private Integer defaultFlag;

    public Integer getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Integer defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAgentTime() {
        return agentTime;
    }

    public void setAgentTime(Date agentTime) {
        this.agentTime = agentTime;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public Integer getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(Integer agentLevel) {
        this.agentLevel = agentLevel;
    }
}
