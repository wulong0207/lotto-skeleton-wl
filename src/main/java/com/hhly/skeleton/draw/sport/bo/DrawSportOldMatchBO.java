package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.SportEnum;

/**
 * @desc 老足彩对阵详情
 * @author huangchengfang1219
 * @date 2017年10月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawSportOldMatchBO extends BaseBO {

	private static final long serialVersionUID = -7822936754501450490L;

	/**
	 * 主队名称
	 */
	private String homeTeamName;

	/**
	 * 客队名称
	 */
	private String guestTeamName;

	/**
	 * 赛事状态
	 */
	private Short matchStatus;

	/**
	 * 全场比分
	 */
	private String fullScore;

	/**
	 * 半场比分
	 */
	private String halfScore;

	/**
	 * 半全场胜平负
	 */
	@JsonIgnore
	private String hfWdf;

	/**
	 * 进球数
	 */
	@JsonIgnore
	private String goal;

	/**
	 * 全场胜平负
	 */
	private Short fullWdf;

	/**
	 * 半场胜平负
	 */
	private Short halfWdf;

	/**
	 * 主队进球数
	 */
	private Integer homeGoal;

	/**
	 * 客队进球数
	 */
	private Integer guestGoal;

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getGuestTeamName() {
		return guestTeamName;
	}

	public void setGuestTeamName(String guestTeamName) {
		this.guestTeamName = guestTeamName;
	}

	public Short getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getMatchStatusText() {
		if (matchStatus != null) {
			for (SportEnum.JcMatchStatusEnum matchStatusEnum : SportEnum.JcMatchStatusEnum.values()) {
				if (matchStatusEnum.getCode() == matchStatus.intValue()) {
					return matchStatusEnum.getName();
				}
			}
		}
		return null;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public String getHfWdf() {
		return hfWdf;
	}

	public void setHfWdf(String hfWdf) {
		this.hfWdf = hfWdf;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public Short getFullWdf() {
		return fullWdf;
	}

	public void setFullWdf(Short fullWdf) {
		this.fullWdf = fullWdf;
	}

	public Short getHalfWdf() {
		return halfWdf;
	}

	public void setHalfWdf(Short halfWdf) {
		this.halfWdf = halfWdf;
	}

	public Integer getHomeGoal() {
		return homeGoal;
	}

	public void setHomeGoal(Integer homeGoal) {
		this.homeGoal = homeGoal;
	}

	public Integer getGuestGoal() {
		return guestGoal;
	}

	public void setGuestGoal(Integer guestGoal) {
		this.guestGoal = guestGoal;
	}

}
