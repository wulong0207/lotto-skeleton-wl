package com.hhly.skeleton.activity.bo;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;
@SuppressWarnings("serial")
public class ActivityChpUserBO extends BaseBO{	
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 头像URL
	 */
	private String headUrl;
	
	/**
	 * 参与活动编号
	 */
	private String activityCode;
	/**
	 * 贡献值
	 */
	private Double totalScore;
	/**
	 * 返利金额
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double rebateMoney;
	/**
	 * 排名
	 */
	private Integer rank;
	
	private List<ActivityChpTeamBO> teamList;
	
	
	public List<ActivityChpTeamBO> getTeamList() {
		return teamList;
	}
	public void setTeamList(List<ActivityChpTeamBO> teamList) {
		this.teamList = teamList;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
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
	
	
}
