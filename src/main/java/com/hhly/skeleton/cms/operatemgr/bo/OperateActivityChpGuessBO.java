package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

public class OperateActivityChpGuessBO extends BaseBO {
    private Integer id;

    private Integer activityConfigId;

    private Integer sportAgainstInfoId;

    /**
     * 分组（A,B,C...）
     */
    private String teamGroup;

    /**
     * 球队名
     */
    private String homeName;

    /**
     * 赛事状态=竞猜状态
     */
    private Short matchStatus;

    /**
     * 实际参与人数
     */
    private Integer realityUser;

    /**
     * 1：未开奖；2：已开奖；3：已派奖
     */
    private Integer winStatus;

    /**
     * 本站参与人数=竞猜总人数
     */
    private Integer localUser;

    /**
     * 实际奖池
     */
    private Double realityJackpot;

    /**
     * 本站奖池=奖金池（元）
     */
    private Double localJackpot;

    private String modifyBy;

    private Date createTime;

    private String createBy;

    private Date modifyTime;

    private Date updateTime;

    private Integer orderId;
    
    /**
     * 实际贡献值
     */
    private Double realScore;
    
    /**
     * 本地贡献值
     */
    private Double localScore;


    private String activityCode;

    private Integer localUserIncrease;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    public Integer getSportAgainstInfoId() {
        return sportAgainstInfoId;
    }

    public void setSportAgainstInfoId(Integer sportAgainstInfoId) {
        this.sportAgainstInfoId = sportAgainstInfoId;
    }

    public String getTeamGroup() {
        return teamGroup;
    }

    public void setTeamGroup(String teamGroup) {
        this.teamGroup = teamGroup == null ? null : teamGroup.trim();
    }

    public Integer getRealityUser() {
        return realityUser;
    }

    public void setRealityUser(Integer realityUser) {
        this.realityUser = realityUser;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public Short getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Short matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Integer getWinStatus() {
        return winStatus;
    }

    public void setWinStatus(Integer winStatus) {
        this.winStatus = winStatus;
    }

    public Integer getLocalUser() {
        return localUser;
    }

    public void setLocalUser(Integer localUser) {
        this.localUser = localUser;
    }

    public Double getRealityJackpot() {
        return realityJackpot;
    }

    public void setRealityJackpot(Double realityJackpot) {
        this.realityJackpot = realityJackpot;
    }

    public Double getLocalJackpot() {
        return localJackpot;
    }

    public void setLocalJackpot(Double localJackpot) {
        this.localJackpot = localJackpot;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

	public Double getRealScore() {
		return realScore;
	}

	public void setRealScore(Double realScore) {
		this.realScore = realScore;
	}

	public Double getLocalScore() {
		return localScore;
	}

	public void setLocalScore(Double localScore) {
		this.localScore = localScore;
	}

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getLocalUserIncrease() {
        return localUserIncrease;
    }

    public void setLocalUserIncrease(Integer localUserIncrease) {
        this.localUserIncrease = localUserIncrease;
    }
}