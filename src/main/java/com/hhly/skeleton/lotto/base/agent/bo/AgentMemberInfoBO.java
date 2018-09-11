package com.hhly.skeleton.lotto.base.agent.bo;

/**
 * @Description 代理会员信息BO
 * @Author longguoyou
 * @Date  2018/3/1 14:56
 * @Since 1.8
 */

public class AgentMemberInfoBO extends BaseInfoBO{
    /**
     * 代理编号
     */
    private String agentCode;
    /**
     * 会员账号
     */
    private String accountName;

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
