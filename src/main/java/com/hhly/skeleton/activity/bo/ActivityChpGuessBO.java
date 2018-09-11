package com.hhly.skeleton.activity.bo;
import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
@SuppressWarnings("serial")
public class ActivityChpGuessBO extends BaseBO{
	/**
     * 规则主键id
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
     * 主队名称
     */
	private String homeName;
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
	 * 赛事状态 9：销售中；15：已开奖；16：已派奖；17：已审核；18已淘汰
	 */
	private Short matchStatus;	
	/**
	 * 球队赛事更新时间
	 */
	private Date matchUpdateTime;

	
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public String getTeamGroup() {
		return teamGroup;
	}
	public void setTeamGroup(String teamGroup) {
		this.teamGroup = teamGroup;
	}	
	public Short getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}
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
	public Date getMatchUpdateTime() {
		return matchUpdateTime;
	}
	public void setMatchUpdateTime(Date matchUpdateTime) {
		this.matchUpdateTime = matchUpdateTime;
	}
	
}
