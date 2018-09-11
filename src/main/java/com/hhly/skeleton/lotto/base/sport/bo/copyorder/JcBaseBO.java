package com.hhly.skeleton.lotto.base.sport.bo.copyorder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

/**
 * 
 * @author longguoyou
 * 
 * @date 2017年2月7日 上午9:54:45
 *
 * @desc 竞彩业务实体基类
 *
 */
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class JcBaseBO extends BaseBO {

	private static final long serialVersionUID = 1L;

	/** 对阵id*/
	private Long id;

	/** 彩种Code*/
	private String lotteryCode;

	/** 彩期Code*/
	private String issueCode;

	/** 赛事id*/
	private Long sportMatchInfoId;

	/** 主队id*/
	private Long homeTeamId;

	/** 客队id*/
	private Long visitiTeamId;

	/** 分析id 例如一比分分析页面id*/
	private String matchAnalysisUrl;

	/** 赛事详细信息id 例如详细信息id*/
	private String matchInfoUrl;

	/** 是否热门赛事*/
	private Short isRecommend;

	/** 赛事颜色*/
	private String matchLabelColor;

	/** 系统编号*/
	private String systemCode;

	/** 官方比赛编号  */
	private String officialMatchCode;

	private String week;

	private String num;

	/** 赛事全称 */
	private String matchFullName;

	/** 赛事简称*/
	private String matchShortName;

	/** 赛事资料库id*/
	private String matchDataUrl;

	/** 赛事logo*/
	private String matchLogo;

	/** 主队名全称 */
	private String homeFullName;
	/**
	 * 主队名简称
	 */
	private String homeShortName;

	/** 主队资料库id*/
	private String homeDataUrl;

	/** 主队排名*/
	private String homeOrder;

	/** 主队logo*/
	private String homeLogo;

	/** 客队名全称 */
	private String guestFullName;
	/**
	 * 客队名简称
	 */
	private String guestShortName;

	/** 客队资料库id*/
	private String guestDataUrl;

	/** 客队排名*/
	private String guestOrder;

	/** 客队logo*/
	private String guestLogo;
	/** 平均欧赔胜 */
	private Float oddsWin;
	/** 平均欧赔平 */
	private Float oddsDraw;
	/** 平均欧赔负 */
	private Float oddsFail;

	/** 赛事状态*/
	private Short matchStatus;

	/** 官方编号*/
	private String officialId;


	/**
	 * 比赛日期
	 */
	private String date;

	/**
	 * 比赛时间
	 */
	private String time;

	/** 销售截止时间*/
	private Date saleEndTime;

	/**
	 * 销售截止时间时间戳
	 */
	private Date saleEndTimeStamp;

    /**
     * 销售截止时间
     */
    private Date saleEndDate;

	/** 是否中立*/
	private Short isNeutral;

	/** 比赛体育馆*/
	private String stadium;

	/** 天气*/
	private String weather;

	/** 备注信息*/
	private String remark;

	/**
	 * 赛季
	 */
	private String season;

	/**
	 * 小组赛或者决赛名称
	 */
	private String round;

	/**
	 * 第几轮比赛
	 */
	private String gameweek;

	/**
	 * 比赛时间时间戳
	 */
	private Date startTimeStamp;

	public Date getSaleEndTimeStamp() {
		return saleEndTimeStamp;
	}

	public void setSaleEndTimeStamp(Date saleEndTimeStamp) {
		this.saleEndTimeStamp = saleEndTimeStamp;
	}

	public Date getStartTimeStamp() {
		return startTimeStamp;
	}

	public void setStartTimeStamp(Date startTimeStamp) {
		this.startTimeStamp = startTimeStamp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Long getSportMatchInfoId() {
		return sportMatchInfoId;
	}

	public void setSportMatchInfoId(Long sportMatchInfoId) {
		this.sportMatchInfoId = sportMatchInfoId;
	}

	public Long getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(Long homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public Long getVisitiTeamId() {
		return visitiTeamId;
	}

	public void setVisitiTeamId(Long visitiTeamId) {
		this.visitiTeamId = visitiTeamId;
	}

	public String getMatchAnalysisUrl() {
		return matchAnalysisUrl;
	}

	public void setMatchAnalysisUrl(String matchAnalysisUrl) {
		this.matchAnalysisUrl = matchAnalysisUrl;
	}

	public String getMatchInfoUrl() {
		return matchInfoUrl;
	}

	public void setMatchInfoUrl(String matchInfoUrl) {
		this.matchInfoUrl = matchInfoUrl;
	}

	public Short getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}

	public String getMatchLabelColor() {
		return matchLabelColor;
	}

	public void setMatchLabelColor(String matchLabelColor) {
		this.matchLabelColor = matchLabelColor;
	}

	public String getSystemCode() {
		return systemCode;
	}

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public Date getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(Date saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

	public String getOfficialMatchCode() {
		return officialMatchCode;
	}

	public void setOfficialMatchCode(String officialMatchCode) {
		this.officialMatchCode = officialMatchCode;
	}

	public String getMatchFullName() {
		return matchFullName;
	}

	public void setMatchFullName(String matchFullName) {
		this.matchFullName = matchFullName;
	}

	public String getMatchShortName() {
		return matchShortName;
	}

	public void setMatchShortName(String matchShortName) {
		this.matchShortName = matchShortName;
	}

	public String getMatchDataUrl() {
		return matchDataUrl;
	}

	public void setMatchDataUrl(String matchDataUrl) {
		this.matchDataUrl = matchDataUrl;
	}

	public String getMatchLogo() {
		return matchLogo;
	}

	public void setMatchLogo(String matchLogo) {
		this.matchLogo = matchLogo;
	}

	public String getHomeFullName() {
		return homeFullName;
	}

	public void setHomeFullName(String homeFullName) {
		this.homeFullName = homeFullName;
	}

	public String getHomeShortName() {
		return homeShortName;
	}

	public void setHomeShortName(String homeShortName) {
		this.homeShortName = homeShortName;
	}

	public String getHomeDataUrl() {
		return homeDataUrl;
	}

	public void setHomeDataUrl(String homeDataUrl) {
		this.homeDataUrl = homeDataUrl;
	}

	public String getHomeOrder() {
		return homeOrder;
	}

	public void setHomeOrder(String homeOrder) {
		this.homeOrder = homeOrder;
	}

	public String getHomeLogo() {
		return homeLogo;
	}

	public void setHomeLogo(String homeLogo) {
		this.homeLogo = homeLogo;
	}

	public String getGuestFullName() {
		return guestFullName;
	}

	public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

	public String getGuestShortName() {
		return guestShortName;
	}

	public void setGuestShortName(String guestShortName) {
		this.guestShortName = guestShortName;
	}

	public String getGuestDataUrl() {
		return guestDataUrl;
	}

	public void setGuestDataUrl(String guestDataUrl) {
		this.guestDataUrl = guestDataUrl;
	}

	public String getGuestOrder() {
		return guestOrder;
	}

	public void setGuestOrder(String guestOrder) {
		this.guestOrder = guestOrder;
	}

	public String getGuestLogo() {
		return guestLogo;
	}

	public void setGuestLogo(String guestLogo) {
		this.guestLogo = guestLogo;
	}

	public Float getOddsWin() {
		return oddsWin;
	}

	public void setOddsWin(Float oddsWin) {
		this.oddsWin = oddsWin;
	}

	public Float getOddsDraw() {
		return oddsDraw;
	}

	public void setOddsDraw(Float oddsDraw) {
		this.oddsDraw = oddsDraw;
	}

	public Float getOddsFail() {
		return oddsFail;
	}

	public void setOddsFail(Float oddsFail) {
		this.oddsFail = oddsFail;
	}

	public Short getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getOfficialId() {
		return officialId;
	}

	public void setOfficialId(String officialId) {
		this.officialId = officialId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Short getIsNeutral() {
		return isNeutral;
	}

	public void setIsNeutral(Short isNeutral) {
		this.isNeutral = isNeutral;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getGameweek() {
		return gameweek;
	}

	public void setGameweek(String gameweek) {
		this.gameweek = gameweek;
	}

	@Override
	public String toString() {
		return getClass().getName() + "{" + "id=" + id + ", lotteryCode='" + lotteryCode + '\'' + ", issueCode='" + issueCode + '\'' + ", sportMatchInfoId=" + sportMatchInfoId + ", homeTeamId=" + homeTeamId + ", visitiTeamId=" + visitiTeamId + ", matchAnalysisUrl='" + matchAnalysisUrl + '\'' + ", matchInfoUrl='" + matchInfoUrl + '\'' + ", isRecommend=" + isRecommend + ", matchLabelColor='" + matchLabelColor + '\'' + ", systemCode='" + systemCode + '\'' + ", officialMatchCode='" + officialMatchCode + '\'' + ", week='" + week + '\'' + ", num='" + num + '\'' + ", matchFullName='" + matchFullName + '\'' + ", matchShortName='" + matchShortName + '\'' + ", matchDataUrl='" + matchDataUrl + '\'' + ", matchLogo='" + matchLogo + '\'' + ", homeFullName='" + homeFullName + '\'' + ", homeShortName='" + homeShortName + '\'' + ", homeDataUrl='" + homeDataUrl + '\'' + ", homeOrder='" + homeOrder + '\'' + ", homeLogo='" + homeLogo + '\'' + ", guestFullName='" + guestFullName + '\'' + ", guestShortName='" + guestShortName + '\'' + ", guestDataUrl='" + guestDataUrl + '\'' + ", guestOrder='" + guestOrder + '\'' + ", guestLogo='" + guestLogo + '\'' + ", oddsWin=" + oddsWin + ", oddsDraw=" + oddsDraw + ", oddsFail=" + oddsFail + ", matchStatus=" + matchStatus + ", officialId='" + officialId + '\'' + ", date='" + date + '\'' + ", time='" + time + '\'' + ", saleEndTime=" + saleEndTime + ", saleEndTimeStamp=" + saleEndTimeStamp + ", saleEndDate=" + saleEndDate + ", isNeutral=" + isNeutral + ", stadium='" + stadium + '\'' + ", weather='" + weather + '\'' + ", remark='" + remark + '\'' + ", season='" + season + '\'' + ", round='" + round + '\'' + ", gameweek='" + gameweek + '\'' + ", startTimeStamp=" + startTimeStamp + '}';
	}
}
