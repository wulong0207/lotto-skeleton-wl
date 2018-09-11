package com.hhly.skeleton.cms.agent.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

/**
 * @author Tony Wang
 * @version 1.0
 * @desc    代理查询VO
 * @date 2018/3/9 11:49
 * @company 益彩网络科技有限公司
 */
public class AgentQueryVO extends PageVO {

    /**
     * 代理账号
     */
    private String agentAccount;

    /**
     * 下级直属用户或代理账号
     */
    private String memberAccount;

    private Date start;

    private Date end;

    private List<Integer> userIds;

    private List<Integer> parentIds;

    private String yearMonth;

    public String getAgentAccount() {
        return agentAccount;
    }

    public void setAgentAccount(String agentAccount) {
        this.agentAccount = agentAccount;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public List<Integer> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<Integer> parentIds) {
        this.parentIds = parentIds;
    }
}
