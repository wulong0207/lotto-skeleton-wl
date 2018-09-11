package com.hhly.skeleton.lotto.base.recommend.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/15 14:48
 * @company 益彩网络科技公司
 */
public class RcmdAttentionBO extends BaseBO {

    /**
     * 推单用户userId
     */
    private Integer rcmdUserId;

    /**
     * 用户名
     */
    private String accountName;

    /**
     * 图像地址
     */
    private String headUrl;

    /**
     * 足彩专家、分析师、职业玩家
     */
    private Integer type;

    /**
     * 几中几
     */
    private String recentRecord;

    /**
     * 连红
     */
    private Integer continueHit;

    /**
     * 粉丝数
     */
    private Integer focusNum;

    /**
     * 个人描述
     */
    private String summary;

    /**
     * 进行中的推荐数量
     */
    private Integer runningRcmdCount;
    /**
     * 是否已关注 1:关注 0：未关注
     */
    private Integer focus;

    /**
     * 推单用户主键ID
     */
    private Integer userIssueInfoId;

    public Integer getRcmdUserId() {
        return rcmdUserId;
    }

    public void setRcmdUserId(Integer rcmdUserId) {
        this.rcmdUserId = rcmdUserId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord;
    }

    public Integer getContinueHit() {
        return continueHit;
    }

    public void setContinueHit(Integer continueHit) {
        this.continueHit = continueHit;
    }

    public Integer getFocusNum() {
        return focusNum;
    }

    public void setFocusNum(Integer focusNum) {
        this.focusNum = focusNum;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getRunningRcmdCount() {
        return runningRcmdCount;
    }

    public void setRunningRcmdCount(Integer runningRcmdCount) {
        this.runningRcmdCount = runningRcmdCount;
    }

    public Integer getFocus() {
        return focus;
    }

    public void setFocus(Integer focus) {
        this.focus = focus;
    }

    public Integer getUserIssueInfoId() {
        return userIssueInfoId;
    }

    public void setUserIssueInfoId(Integer userIssueInfoId) {
        this.userIssueInfoId = userIssueInfoId;
    }
}
