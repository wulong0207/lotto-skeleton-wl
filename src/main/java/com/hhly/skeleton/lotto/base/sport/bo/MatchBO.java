package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 对阵BO
 * @author zhanglei
 *
 */
public class MatchBO extends BaseBO {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 期号
	 */
	private String issueNo;

	/**
	 * 彩种id
	 */
	private Integer lotteryId;

	/**
	 * 比赛gameno
	 */
	private String gameNo;

	/**
	 * 球探网关联id
	 */
	private String gliveId;
	
	/**
	 * bet500关联id
	 */
	private String betLiveId;

	/**
	 * 本站对阵期号关联ID
	 */
	private Integer issueNoId;

	/**
	 * 比赛场次-周几00几(或者第几场)
	 */
	private String matchNo;

	/**
	 * 联赛名简体
	 */
	private String leagueName;

	/**
	 * 联赛名英文
	 */
	private String leagueNameEn;

	/**
	 * 联赛id
	 */
	private String leagueId;

	/**
	 * 联赛类型
	 */
	private String leagueType;

	/**
	 * 联赛颜色
	 */
	private String leagueColor;

	/**
	 * 主队id
	 */
	private Integer homeTeamId;

	/**
	 * 客队id
	 */
	private Integer awayTeamId;

	/**
	 * 主队名简体
	 */
	private String homeTeamName;
	
	/**
	 * 主队名英文
	 */
	private String homeTeamNameEn;

	/**
	 * 客队名简体
	 */
	private String awayTeamName;
	
	/**
	 * 客队名英文
	 */
	private String awayTeamNameEn;

	/**
	 * 主队名中文简称
	 */
	private String homeTeamShortName;

	/**
	 * 客队名中文简称
	 */
	private String awayTeamShortName;

	/**
	 * 比赛时间
	 */
	private Date playTime;

	/**
	 * 半场比分
	 */
	private String halfScore;

	/**
	 * 全场比分
	 */
	private String totalScore;

	/**
	 * 让球数
	 */
	private Integer handicap;
	
	/**
	 * 比赛状态
	 */
	private Integer status;
	
	/**
	 * 焦点标识
	 */
	private String focusFlag;

	/**
	 * 专家推荐内容
	 */
	private String recommend;

	/**
	 * 温度
	 */
	private String temperature;

	/**
	 * 天气
	 */
	private String weather;

	/**
	 * 天气图片
	 */
	private String weatherPic;

	/**
	 * 中立场标识
	 */
	private String neutralFlag;

	/**
	 * 描述
	 */
	private String prompt;
	
	/**
	 * 复式截止时间
	 */
	private Date multiendTime;
	
	/**
	 * 主队排名
	 */
	private String homeRank;
	
	/**
	 * 客队排名
	 */
	private String awayRank;
	/**
	 * 是否热门 1:是,0:否
	 */
	private String isHot;
	/**
	 * 是否单关 1:是,0:否
	 */
	private String isSingle;
	
	

	public String getIsHot() {
		return isHot;
	}

	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}

	public String getIsSingle() {
		return isSingle;
	}

	public void setIsSingle(String isSingle) {
		this.isSingle = isSingle;
	}

	public String getIssueNo() {
		return issueNo;
	}

	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}

	public Integer getLotteryId() {
		return lotteryId;
	}

	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}

	public String getGameNo() {
		return gameNo;
	}

	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}

	public String getGliveId() {
		return gliveId;
	}

	public void setGliveId(String gliveId) {
		this.gliveId = gliveId;
	}

	public String getBetLiveId() {
		return betLiveId;
	}

	public void setBetLiveId(String betLiveId) {
		this.betLiveId = betLiveId;
	}

	public Integer getIssueNoId() {
		return issueNoId;
	}

	public void setIssueNoId(Integer issueNoId) {
		this.issueNoId = issueNoId;
	}

	public String getMatchNo() {
		return matchNo;
	}

	public void setMatchNo(String matchNo) {
		this.matchNo = matchNo;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueNameEn() {
		return leagueNameEn;
	}

	public void setLeagueNameEn(String leagueNameEn) {
		this.leagueNameEn = leagueNameEn;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueType() {
		return leagueType;
	}

	public void setLeagueType(String leagueType) {
		this.leagueType = leagueType;
	}

	public String getLeagueColor() {
		return leagueColor;
	}

	public void setLeagueColor(String leagueColor) {
		this.leagueColor = leagueColor;
	}

	public Integer getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(Integer homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public Integer getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(Integer awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getHomeTeamNameEn() {
		return homeTeamNameEn;
	}

	public void setHomeTeamNameEn(String homeTeamNameEn) {
		this.homeTeamNameEn = homeTeamNameEn;
	}

	public String getAwayTeamName() {
		return awayTeamName;
	}

	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}

	public String getAwayTeamNameEn() {
		return awayTeamNameEn;
	}

	public void setAwayTeamNameEn(String awayTeamNameEn) {
		this.awayTeamNameEn = awayTeamNameEn;
	}

	public String getHomeTeamShortName() {
		return homeTeamShortName;
	}

	public void setHomeTeamShortName(String homeTeamShortName) {
		this.homeTeamShortName = homeTeamShortName;
	}

	public String getAwayTeamShortName() {
		return awayTeamShortName;
	}

	public void setAwayTeamShortName(String awayTeamShortName) {
		this.awayTeamShortName = awayTeamShortName;
	}

	public Date getPlayTime() {
		return playTime;
	}

	public void setPlayTime(Date playTime) {
		this.playTime = playTime;
	}

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	public Integer getHandicap() {
		return handicap;
	}

	public void setHandicap(Integer handicap) {
		this.handicap = handicap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFocusFlag() {
		return focusFlag;
	}

	public void setFocusFlag(String focusFlag) {
		this.focusFlag = focusFlag;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWeatherPic() {
		return weatherPic;
	}

	public void setWeatherPic(String weatherPic) {
		this.weatherPic = weatherPic;
	}

	public String getNeutralFlag() {
		return neutralFlag;
	}

	public void setNeutralFlag(String neutralFlag) {
		this.neutralFlag = neutralFlag;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public Date getMultiendTime() {
		return multiendTime;
	}

	public void setMultiendTime(Date multiendTime) {
		this.multiendTime = multiendTime;
	}

	public String getHomeRank() {
		return homeRank;
	}

	public void setHomeRank(String homeRank) {
		this.homeRank = homeRank;
	}

	public String getAwayRank() {
		return awayRank;
	}

	public void setAwayRank(String awayRank) {
		this.awayRank = awayRank;
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("issueNo", issueNo)
				.append("lotteryId", lotteryId)
				.append("gameNo", gameNo)
				.append("gliveId", gliveId)
				.append("betLiveId", betLiveId)
				.append("issueNoId", issueNoId)
				.append("matchNo", matchNo)
				.append("leagueName", leagueName)
				.append("leagueNameEn", leagueNameEn)
				.append("leagueId", leagueId)
				.append("leagueType", leagueType)
				.append("leagueColor", leagueColor)
				.append("homeTeamId", homeTeamId)
				.append("awayTeamId", awayTeamId)
				.append("homeTeamName", homeTeamName)
				.append("homeTeamNameEn", homeTeamNameEn)
				.append("awayTeamName", awayTeamName)
				.append("awayTeamNameEn", awayTeamNameEn)
				.append("homeTeamShortName", homeTeamShortName)
				.append("awayTeamShortName", awayTeamShortName)
				.append("playTime", playTime)
				.append("halfScore", halfScore)
				.append("totalScore", totalScore)
				.append("handicap", handicap)
				.append("status", status)
				.append("focusFlag", focusFlag)
				.append("recommend", recommend)
				.append("temperature", temperature)
				.append("weather", weather)
				.append("weatherPic", weatherPic)
				.append("neutralFlag", neutralFlag)
				.append("prompt", prompt)
				.append("multiendTime", multiendTime)
				.append("homeRank", homeRank)
				.append("awayRank", awayRank)
				.append("isHot", isHot)
				.append("isSingle", isSingle)
				.toString();
	}
}
