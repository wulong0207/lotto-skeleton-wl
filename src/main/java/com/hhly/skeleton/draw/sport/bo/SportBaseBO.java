package com.hhly.skeleton.draw.sport.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 竞技彩
 * 
 * @desc
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportBaseBO extends BaseBO {

	private static final long serialVersionUID = 4289117590232978752L;

	/**
	 * 对阵ID
	 */
	private Integer matchId;

	/**
	 * 彩期
	 */
	@JsonIgnore
	private String issueCode;

	/**
	 * 赛事名称
	 */
	private String raceName;

	/**
	 * 比赛时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date matchTime;

	/**
	 * 比赛状态
	 */
	private Short matchStatus;

	/**
	 * 赛事标签颜色
	 */
	private String raceColor;

	/**
	 * 赛事编号
	 */
	private String num;

	/**
	 * 星期
	 */
	private String week;

	/**
	 * 主队名称
	 */
	private String homeTeamName;

	/**
	 * 客队名称
	 */
	private String guestTeamName;

	/**
	 * 全场比分
	 */
	private String fullScore;

	/**
	 * 让球数
	 */
	private Double letNum;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public Date getMatchTime() {
		return matchTime;
	}

	public void setMatchTime(Date matchTime) {
		this.matchTime = matchTime;
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

	public String getRaceColor() {
		return raceColor;
	}

	public void setRaceColor(String raceColor) {
		this.raceColor = raceColor;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getWeek() {
		if (ObjectUtil.isBlank(week) && matchTime != null) {
			week = DateUtil.dayForWeekStr(matchTime);
		}
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

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

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}

	public Double getLetNum() {
		return letNum;
	}

	public void setLetNum(Double letNum) {
		this.letNum = letNum;
	}

}
