package com.hhly.skeleton.cms.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    代理直属会员或代理VO
 * @date 2018/3/9 9:04
 * @company 益彩网络科技有限公司
 */
public class AgentSubMemberBO extends BaseBO {

    /**
     * 代理账号
     */
    private String agentAccount;

    /**
     * 代理账号真实姓名
     */
    private String agentRealName;

    /**
     * 代理绑定手机号
     */
    private String agentMobile;

    /**
     * 下级直属用户或代理账号
     */
    private String memberAccount;

    /**
     * 下级直属用户或代理真实姓名
     */
    private String memberRealName;

    /**
     * 本月投注金额
     */
    private double monthOrderAmount;

    /**
     * 累计投注金额
     */
    private double accruedOrderAmount;

    /**
     * 累计投注次数
     */
    private int accruedOrderNum;

    /**
     * 下级直属用户或代理真实姓名用户id
     */
    private Integer memberUserId;

    /**
     * 会员本身的代理code
     */
    private String memberAgentCode;


    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public String getAgentRealName() {
        return agentRealName;
    }

    public void setAgentRealName(String agentRealName) {
        this.agentRealName = agentRealName;
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberRealName() {
        return memberRealName;
    }

    public void setMemberRealName(String memberRealName) {
        this.memberRealName = memberRealName;
    }

    public double getMonthOrderAmount() {
        return monthOrderAmount;
    }

    public void setMonthOrderAmount(double monthOrderAmount) {
        this.monthOrderAmount = monthOrderAmount;
    }

    public double getAccruedOrderAmount() {
        return accruedOrderAmount;
    }

    public void setAccruedOrderAmount(double accruedOrderAmount) {
        this.accruedOrderAmount = accruedOrderAmount;
    }

    public int getAccruedOrderNum() {
        return accruedOrderNum;
    }

    public void setAccruedOrderNum(int accruedOrderNum) {
        this.accruedOrderNum = accruedOrderNum;
    }

    public Integer getMemberUserId() {
        return memberUserId;
    }

    public void setMemberUserId(Integer memberUserId) {
        this.memberUserId = memberUserId;
    }

    public String getMemberAgentCode() {
        return memberAgentCode;
    }

    public void setMemberAgentCode(String memberAgentCode) {
        this.memberAgentCode = memberAgentCode;
    }
}
