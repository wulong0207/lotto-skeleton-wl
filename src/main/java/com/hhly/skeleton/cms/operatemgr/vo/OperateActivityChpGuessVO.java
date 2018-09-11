package com.hhly.skeleton.cms.operatemgr.vo;

import java.util.Date;

public class OperateActivityChpGuessVO {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 活动配置主键id
     */
    private Integer activityConfigId;

    /**
     * 竞技彩对阵详情表ID
     */
    private Integer sportAgainstInfoId;

    /**
     * 分组（A,B,C...）
     */
    private String teamGroup;

    /**
     * 实际参与人数
     */
    private Integer realityUser;

    /**
     * 1：未开奖；2：已开奖；3：已派奖
     */
    private Short winStatus;

    /**
     * 本站参与人数
     */
    private Integer localUser;

    /**
     * 实际奖池
     */
    private Double realityJackpot;

    /**
     * 本站奖池
     */
    private Double localJackpot;

    /**
     * 
     */
    private String modifyBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date modifyTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 自增ID
     * @return id 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 活动配置主键id
     * @return activity_config_id 活动配置主键id
     */
    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    /**
     * 活动配置主键id
     * @param activityConfigId 活动配置主键id
     */
    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    /**
     * 竞技彩对阵详情表ID
     * @return sport_against_info_id 竞技彩对阵详情表ID
     */
    public Integer getSportAgainstInfoId() {
        return sportAgainstInfoId;
    }

    /**
     * 竞技彩对阵详情表ID
     * @param sportAgainstInfoId 竞技彩对阵详情表ID
     */
    public void setSportAgainstInfoId(Integer sportAgainstInfoId) {
        this.sportAgainstInfoId = sportAgainstInfoId;
    }

    /**
     * 分组（A,B,C...）
     * @return team_group 分组（A,B,C...）
     */
    public String getTeamGroup() {
        return teamGroup;
    }

    /**
     * 分组（A,B,C...）
     * @param teamGroup 分组（A,B,C...）
     */
    public void setTeamGroup(String teamGroup) {
        this.teamGroup = teamGroup == null ? null : teamGroup.trim();
    }

    /**
     * 实际参与人数
     * @return reality_user 实际参与人数
     */
    public Integer getRealityUser() {
        return realityUser;
    }

    /**
     * 实际参与人数
     * @param realityUser 实际参与人数
     */
    public void setRealityUser(Integer realityUser) {
        this.realityUser = realityUser;
    }

    /**
     * 1：未开奖；2：已开奖；3：已派奖
     * @return win_status 1：未开奖；2：已开奖；3：已派奖
     */
    public Short getWinStatus() {
        return winStatus;
    }

    /**
     * 1：未开奖；2：已开奖；3：已派奖
     * @param winStatus 1：未开奖；2：已开奖；3：已派奖
     */
    public void setWinStatus(Short winStatus) {
        this.winStatus = winStatus;
    }

    /**
     * 本站参与人数
     * @return local_user 本站参与人数
     */
    public Integer getLocalUser() {
        return localUser;
    }

    /**
     * 本站参与人数
     * @param localUser 本站参与人数
     */
    public void setLocalUser(Integer localUser) {
        this.localUser = localUser;
    }

    /**
     * 实际奖池
     * @return reality_jackpot 实际奖池
     */
    public Double getRealityJackpot() {
        return realityJackpot;
    }

    /**
     * 实际奖池
     * @param realityJackpot 实际奖池
     */
    public void setRealityJackpot(Double realityJackpot) {
        this.realityJackpot = realityJackpot;
    }

    /**
     * 本站奖池
     * @return local_jackpot 本站奖池
     */
    public Double getLocalJackpot() {
        return localJackpot;
    }

    /**
     * 本站奖池
     * @param localJackpot 本站奖池
     */
    public void setLocalJackpot(Double localJackpot) {
        this.localJackpot = localJackpot;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 
     * @return modify_time 
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 
     * @param modifyTime 
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}