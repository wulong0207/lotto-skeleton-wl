package com.hhly.skeleton.cms.sportmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * Created by lgs on 2016/12/5.
 * 竞彩球类公共数据
 */
@SuppressWarnings("serial")
public class SportFBBaseBO extends BaseBO{
    private Long againstId;

    private Integer lotteryCode; //彩种编号

    private String issueCode; //彩期编号

    private Long matchPrimaryId;//match表主键id
    
    private Long matchId; //比赛id

    private Long homeTeamPrimaryId;//主队球队表主键id
    
    private Long homeTeamId;//主队球队id
    
    private Long guestTeamPrimaryId;//客队球队表主键id

    private Long guestTeamId;//客队球队id

    private String analysisUrl; //赛事分析id

    private String matchInfoUrl;//比赛信息id

    private Short isRecommend;//是否推荐

    private String color;//赛事颜色

    private String officialMatchCode; //赛事编号

    private String systemCode;//系统编号

    private Short matchStatus;//赛事状态

    private String officialId; //官方id

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime; //比赛时间

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date saleEndTime; //截止时间

    private String matchName;

    private String homeName;

    private String guestName;

    private Short isNeutral;//中立场

    private String stadium;//场馆

    private String weather;//天气

    private Date lotteryTime; //开奖时间

    private String saleStatus;//销售状态

    private String matchDataUrl;//赛事数据url

    private String matchFullName;//赛事全称

    private String matchShortName;//赛事简称

    private String logoUrl;//赛事logo
    
    private String logoImg; //赛事绝对路径

    private String matchType;//赛事类型

    private String oddsWin;//赛事赢平均赔率

    private String oddsDraw;//赛事平平均赔率

    private String oddsFail;//赛事负平均赔率

    private String homeTeamDataUrl;

    private String homeTeamFullName;

    private String homeTeamShortName;

    private String homeTeamOrder;

    private String homeLogoUrl;
    
    private String homeLogoImg;

    private String guestTeamDataUrl;

    private String guestTeamFullName;

    private String guestTeamShortName;

    private String guestTeamOrder;

    private String guestLogoUrl;
    
    private String guestLogoImg;

    /**
     * 创建人
     */
    private String createBy;
    /**
     * 修改人
     */
    private String modifyBy;
    /**
     * cms修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 问题
     */
    private String wrong;

    public String getWrong() {
        return wrong;
    }

    public void setWrong(String wrong) {
        this.wrong = wrong;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public Long getAgainstId() {
        return againstId;
    }

    public void setAgainstId(Long againstId) {
        this.againstId = againstId;
    }

  

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Long getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Long guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    public String getAnalysisUrl() {
        return analysisUrl;
    }

    public void setAnalysisUrl(String analysisUrl) {
        this.analysisUrl = analysisUrl;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
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

    public String getMatchDataUrl() {
        return matchDataUrl;
    }

    public void setMatchDataUrl(String matchDataUrl) {
        this.matchDataUrl = matchDataUrl;
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoImg() {
		return logoImg;
	}

	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}

	public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getOddsWin() {
        return oddsWin;
    }

    public void setOddsWin(String oddsWin) {
        this.oddsWin = oddsWin;
    }

    public String getOddsDraw() {
        return oddsDraw;
    }

    public void setOddsDraw(String oddsDraw) {
        this.oddsDraw = oddsDraw;
    }

    public String getOddsFail() {
        return oddsFail;
    }

    public void setOddsFail(String oddsFail) {
        this.oddsFail = oddsFail;
    }

    public String getHomeTeamDataUrl() {
        return homeTeamDataUrl;
    }

    public void setHomeTeamDataUrl(String homeTeamDataUrl) {
        this.homeTeamDataUrl = homeTeamDataUrl;
    }

    public String getHomeTeamFullName() {
        return homeTeamFullName;
    }

    public void setHomeTeamFullName(String homeTeamFullName) {
        this.homeTeamFullName = homeTeamFullName;
    }

    public String getHomeTeamShortName() {
        return homeTeamShortName;
    }

    public void setHomeTeamShortName(String homeTeamShortName) {
        this.homeTeamShortName = homeTeamShortName;
    }

    public String getHomeTeamOrder() {
        return homeTeamOrder;
    }

    public void setHomeTeamOrder(String homeTeamOrder) {
        this.homeTeamOrder = homeTeamOrder;
    }

    public String getHomeLogoUrl() {
        return homeLogoUrl;
    }

    public void setHomeLogoUrl(String homeLogoUrl) {
        this.homeLogoUrl = homeLogoUrl;
    }

    public String getHomeLogoImg() {
		return homeLogoImg;
	}

	public void setHomeLogoImg(String homeLogoImg) {
		this.homeLogoImg = homeLogoImg;
	}

	public String getGuestTeamDataUrl() {
        return guestTeamDataUrl;
    }

    public void setGuestTeamDataUrl(String guestTeamDataUrl) {
        this.guestTeamDataUrl = guestTeamDataUrl;
    }

    public String getGuestTeamFullName() {
        return guestTeamFullName;
    }

    public void setGuestTeamFullName(String guestTeamFullName) {
        this.guestTeamFullName = guestTeamFullName;
    }

    public String getGuestTeamShortName() {
        return guestTeamShortName;
    }

    public void setGuestTeamShortName(String guestTeamShortName) {
        this.guestTeamShortName = guestTeamShortName;
    }

    public String getGuestTeamOrder() {
        return guestTeamOrder;
    }

    public void setGuestTeamOrder(String guestTeamOrder) {
        this.guestTeamOrder = guestTeamOrder;
    }

    public String getGuestLogoUrl() {
        return guestLogoUrl;
    }

    public void setGuestLogoUrl(String guestLogoUrl) {
        this.guestLogoUrl = guestLogoUrl;
    }

    public String getGuestLogoImg() {
		return guestLogoImg;
	}

	public void setGuestLogoImg(String guestLogoImg) {
		this.guestLogoImg = guestLogoImg;
	}

	public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	public Long getMatchPrimaryId() {
		return matchPrimaryId;
	}

	public void setMatchPrimaryId(Long matchPrimaryId) {
		this.matchPrimaryId = matchPrimaryId;
	}

	public Long getHomeTeamPrimaryId() {
		return homeTeamPrimaryId;
	}

	public void setHomeTeamPrimaryId(Long homeTeamPrimaryId) {
		this.homeTeamPrimaryId = homeTeamPrimaryId;
	}

	public Long getGuestTeamPrimaryId() {
		return guestTeamPrimaryId;
	}

	public void setGuestTeamPrimaryId(Long guestTeamPrimaryId) {
		this.guestTeamPrimaryId = guestTeamPrimaryId;
	}

}
