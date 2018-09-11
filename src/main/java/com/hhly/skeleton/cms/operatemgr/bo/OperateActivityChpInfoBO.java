package com.hhly.skeleton.cms.operatemgr.bo;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

public class OperateActivityChpInfoBO extends PageVO {
    /**
     * 自增ID
     */
    @ExcelIgnore
    private Integer id;

    /**
     * 排名
     */
    @ExcelHeader("排名")
    private Integer rank;

    /**
     * 活动明细id
     */
    @ExcelIgnore
    private Integer activityInfoId;

    /**
     * 用户昵称
     */
    @ExcelHeader("用户名")
    private String nickName;

    /**
     * 球队积分（已赛事淘汰时间为准）
     */
    @ExcelIgnore
    private Double teamScore;

    /**
     * 总积分
     */
    @ExcelHeader("贡献值")
    private Double totalScore;

    /**
     * 用户状态，1真实用户，2测试用户
     */
    @ExcelIgnore
    private Short userType;

    /**
     * 创建时间
     */
    @ExcelIgnore
    private Date createTime;

    /**
     * 瓜分奖金（元）
     */
    @ExcelHeader("瓜分奖金（元）")
    private Double totalRebateMoney;

    /**
     * 单个球队瓜分奖金（元）
     */
    @ExcelIgnore
    private Double  rebateMoney;

    @ExcelIgnore
    private String activityCode;

    @ExcelIgnore
    private Integer userId;

    @ExcelIgnore
    private Integer activityRuleId;

    @ExcelIgnore
    private String createBy;

    @ExcelIgnore
    private String type;

    @ExcelIgnore
    private List<? extends Object> values;

    @ExcelIgnore
    private String homeName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getRebateMoney() {
        return rebateMoney;
    }

    public void setRebateMoney(Double rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

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
    public Double getTeamScore() {
        return teamScore;
    }

    /**
     * 球队积分（已赛事淘汰时间为准）
     * @param teamScore 球队积分（已赛事淘汰时间为准）
     */
    public void setTeamScore(Double teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * 总积分
     * @return total_score 总积分
     */
    public Double getTotalScore() {
        return totalScore;
    }

    /**
     * 总积分
     * @param totalScore 总积分
     */
    public void setTotalScore(Double totalScore) {
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

    public Double getTotalRebateMoney() {
        return totalRebateMoney;
    }

    public void setTotalRebateMoney(Double totalRebateMoney) {
        this.totalRebateMoney = totalRebateMoney;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getActivityRuleId() {
        return activityRuleId;
    }

    public void setActivityRuleId(Integer activityRuleId) {
        this.activityRuleId = activityRuleId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<? extends Object> getValues() {
        return values;
    }

    public void setValues(List<? extends Object> values) {
        this.values = values;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }
}