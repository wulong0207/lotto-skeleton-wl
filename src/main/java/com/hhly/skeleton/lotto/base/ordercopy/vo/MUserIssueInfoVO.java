package com.hhly.skeleton.lotto.base.ordercopy.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

public class MUserIssueInfoVO extends PageVO {
    private static final long serialVersionUID = 1L;
    /**
     * 自动增长id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户近期战绩 例如近7中7
     */
    private String recentRecord;

    /**
     * 命中率
     */
    private Float hitRate;

    /**
     * 盈利率
     */
    private Float profitRate;

    /**
     * 关注总人数
     */
    private Integer focusNum;

    /**
     * 发单总次数
     */
    private Integer issueNum;

    /**
     * 发单总金额
     */
    private Float issueAmount;

    /**
     * 命中次数
     */
    private Integer hitNum;

    /**
     * 命中总金额
     */
    private Float hitMoney;

    /**
     * 返佣总金额
     */
    private Float commissionAmount;

    /**
     * 跟单总人数
     */
    private Integer followNum;

    /**
     * 跟单总金额
     */
    private Integer followAmount;

    /**
     * 总中奖金额(发单)
     */
    private Float winAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改用户id(后台操作员ID)
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 连红数
     */
    private Integer continueHit;

    private String lotteryCode;
    /**
     * token
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getContinueHit() {
		return continueHit;
	}

	public void setContinueHit(Integer continueHit) {
		this.continueHit = continueHit;
	}

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

    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord == null ? null : recentRecord.trim();
    }

    public Float getHitRate() {
        return hitRate;
    }

    public void setHitRate(Float hitRate) {
        this.hitRate = hitRate;
    }

    public Float getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Float profitRate) {
        this.profitRate = profitRate;
    }

    public Integer getFocusNum() {
        return focusNum;
    }

    public void setFocusNum(Integer focusNum) {
        this.focusNum = focusNum;
    }

    public Integer getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
    }

    public Float getIssueAmount() {
        return issueAmount;
    }

    public void setIssueAmount(Float issueAmount) {
        this.issueAmount = issueAmount;
    }

    public Integer getHitNum() {
        return hitNum;
    }

    public void setHitNum(Integer hitNum) {
        this.hitNum = hitNum;
    }

    public Float getHitMoney() {
        return hitMoney;
    }

    public void setHitMoney(Float hitMoney) {
        this.hitMoney = hitMoney;
    }

    public Float getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Float commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public Integer getFollowAmount() {
        return followAmount;
    }

    public void setFollowAmount(Integer followAmount) {
        this.followAmount = followAmount;
    }

    public Float getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(Float winAmount) {
        this.winAmount = winAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}