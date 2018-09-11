package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/11 11:37
 * @company 益彩网络科技公司
 */
public class RcmdRersonInfoBO extends BaseBO {

    /**
     * 账户名
     */
    private String accountName;

    /**
     * 图像
     */
    private String headPic;

    /**
     * 个人描述
     */
    private String summary;

    /**
     * 推文总次数
     */
    private Integer issueNum;

    /**
     * 浏览总次数
     */
    private Integer clicks;

    /**
     * 粉丝总数
     */
    private Integer fanNum;

    /**
     * 总收入
     */
    private Double totalIncome;

    /**
     * 1:普通用户主页 2：发单人主页 3.推荐人主页（查看其他人，可以关注）
     */
    private Integer isRcmdPerson;

    /**
     * 推单表主键（主要是为了在推单人主页，关注使用）
     */
    private Integer mUserIssueInfoId;

    /**
     * 进七天单关战绩
     */
    private RcmdPersonStatisInfo rcmdSingle7;

    /**
     * 进七天2串1战绩
     */
    private RcmdPersonStatisInfo rcmd2C17;

    /**
     * 进15天单关战绩
     */
    private RcmdPersonStatisInfo rcmdSingle15;

    /**
     * 进15天2串1战绩
     */
    private RcmdPersonStatisInfo rcmd2C115;


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getFanNum() {
        return fanNum;
    }

    public void setFanNum(Integer fanNum) {
        this.fanNum = fanNum;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public RcmdPersonStatisInfo getRcmd2C17() {
        return rcmd2C17;
    }

    public void setRcmd2C17(RcmdPersonStatisInfo rcmd2C17) {
        this.rcmd2C17 = rcmd2C17;
    }

    public RcmdPersonStatisInfo getRcmd2C115() {
        return rcmd2C115;
    }

    public void setRcmd2C115(RcmdPersonStatisInfo rcmd2C115) {
        this.rcmd2C115 = rcmd2C115;
    }

    public RcmdPersonStatisInfo getRcmdSingle7() {
        return rcmdSingle7;
    }

    public void setRcmdSingle7(RcmdPersonStatisInfo rcmdSingle7) {
        this.rcmdSingle7 = rcmdSingle7;
    }

    public RcmdPersonStatisInfo getRcmdSingle15() {
        return rcmdSingle15;
    }

    public void setRcmdSingle15(RcmdPersonStatisInfo rcmdSingle15) {
        this.rcmdSingle15 = rcmdSingle15;
    }


    public Integer getIsRcmdPerson() {
        return isRcmdPerson;
    }

    public void setIsRcmdPerson(Integer isRcmdPerson) {
        this.isRcmdPerson = isRcmdPerson;
    }

    public Integer getmUserIssueInfoId() {
        return mUserIssueInfoId;
    }

    public void setmUserIssueInfoId(Integer mUserIssueInfoId) {
        this.mUserIssueInfoId = mUserIssueInfoId;
    }
}
