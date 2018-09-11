package com.hhly.skeleton.activity.bo;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;
@SuppressWarnings("serial")
public class ActivityChpTeamBO extends BaseBO{
	/**
	 * 活动编号
	 */
	private String activityCode;
	/**
     * 投注规则详情ID
     */
    private Integer ruleId;
    /**
     * 分组（A,B,C...）
     */
    private String teamGroup;
    /**
     * 主队名称
     */
	private String homeName;
	/**
     * 球队logo
     */
	private String logoUrl;
	/**
	 * 赛事状态 9：销售中；15：已开奖；16：已派奖；17：已审核；18已淘汰
	 */
	private Short matchStatus;
	/**
	 * 奖池
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double jackpot;
	/**
	 * 总积分
	 */
	private Double totalScore; 
	
	/**
	 * 参与人数
	 */
	private Integer totalUser;
	/**
	 * 每个球队的投注返利金额
	 */
	private Double rebateMoney;
	/**
	 * 是否竞猜：1已竞猜：0未竞猜
	 */
	private Short isGuess;
	/**
	 * 处理状态
	 */
	private Short operactionType;
	/**
	 * 投注明细信息id
	 */
	private Integer activityInfoId;
	
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
    
    private Date modifyTime;
    
    private String activityName;
    
    private Short activityType;
    
    private String channelId;
    
	public Short getActivityType() {
		return activityType;
	}
	public void setActivityType(Short activityType) {
		this.activityType = activityType;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Date getUpdateTime() {
		return modifyTime;
	}
	public void setUpdateTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getRealityUser() {
		return realityUser;
	}
	public void setRealityUser(Integer realityUser) {
		this.realityUser = realityUser;
	}
	public Short getWinStatus() {
		return winStatus;
	}
	public void setWinStatus(Short winStatus) {
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
	public Integer getActivityInfoId() {
		return activityInfoId;
	}
	public void setActivityInfoId(Integer activityInfoId) {
		this.activityInfoId = activityInfoId;
	}
	public Short getOperactionType() {
		return operactionType;
	}
	public void setOperactionType(Short operactionType) {
		this.operactionType = operactionType;
	}
	public Short getIsGuess() {
		return isGuess;
	}
	public void setIsGuess(Short isGuess) {
		this.isGuess = isGuess;
	}
	public Integer getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(Integer totalUser) {
		this.totalUser = totalUser;
	}
	public Double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}
	public Double getRebateMoney() {
		return rebateMoney;
	}
	public void setRebateMoney(Double rebateMoney) {
		this.rebateMoney = rebateMoney;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	
	public Integer getRuleId() {
		return ruleId;
	}
	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}
	public Double getJackpot() {
		return jackpot;
	}
	public void setJackpot(Double jackpot) {
		this.jackpot = jackpot;
	}
	public String getTeamGroup() {
		return teamGroup;
	}
	public void setTeamGroup(String teamGroup) {
		this.teamGroup = teamGroup;
	}
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public Short getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}		
}
