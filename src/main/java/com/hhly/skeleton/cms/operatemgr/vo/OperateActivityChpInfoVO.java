package com.hhly.skeleton.cms.operatemgr.vo;
import java.util.Date;

public class OperateActivityChpInfoVO {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 活动明细id
     */
    private Integer activityInfoId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 球队积分（已赛事淘汰时间为准）
     */
    private Integer teamScore;

    /**
     * 总积分
     */
    private Integer totalScore;

    /**
     * 用户状态，1真实用户，2测试用户
     */
    private Short userType;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * 活动明细id
     * @return activity_info_id 活动明细id
     */
    public Integer getActivityInfoId() {
        return activityInfoId;
    }

    /**
     * 活动明细id
     * @param activityInfoId 活动明细id
     */
    public void setActivityInfoId(Integer activityInfoId) {
        this.activityInfoId = activityInfoId;
    }

    /**
     * 用户昵称
     * @return nick_name 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户昵称
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 球队积分（已赛事淘汰时间为准）
     * @return team_score 球队积分（已赛事淘汰时间为准）
     */
    public Integer getTeamScore() {
        return teamScore;
    }

    /**
     * 球队积分（已赛事淘汰时间为准）
     * @param teamScore 球队积分（已赛事淘汰时间为准）
     */
    public void setTeamScore(Integer teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * 总积分
     * @return total_score 总积分
     */
    public Integer getTotalScore() {
        return totalScore;
    }

    /**
     * 总积分
     * @param totalScore 总积分
     */
    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * 用户状态，1真实用户，2测试用户
     * @return user_type 用户状态，1真实用户，2测试用户
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * 用户状态，1真实用户，2测试用户
     * @param userType 用户状态，1真实用户，2测试用户
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}