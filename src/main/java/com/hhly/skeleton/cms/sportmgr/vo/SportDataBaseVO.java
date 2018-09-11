package com.hhly.skeleton.cms.sportmgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

/**
 * Created by lgs on 2016/12/16.
 * 体彩公共属性VO类
 */
public class SportDataBaseVO extends BaseVO{
    private static final long serialVersionUID = -9127085448555882781L;


    private Long againstId;
    private String lotteryCode;
    private String issueCode;
    private Long matchId;
    private Long homeTeamId;
    private Long guestTeamId;
    private String systemCode;

    private String isRecommend;

    private String logoUrl;

    @Group("upd")
    //@NotNull
    private String matchFullName;
    private String matchShortName;
    private String color;
    private String matchInfoUrl;

    @Group("upd")
    //@NotNull
    private String analysisUrl;
    private String oddsWin;
    private String oddsDraw;
    private String oddsFail;

    @Group("upd")
    //@NotNull
    private String homeTeamFullName;
    private String homeTeamShortName;

    @Group("upd")
   // @NotNull
    private String guestTeamFullName;
    private String guestTeamShortName;

    private String homeLogoUrl;
    private String guestLogoUrl;
    private String homeTeamOrder;
    private String guestTeamOrder;

    @Group("upd")
    //@NotNull
    @Pattern(value= MatchPattern.SCORE,msg="半场比分")
    private String halfScore;

    @Group("upd")
    //@NotNull
    @Pattern(value=MatchPattern.SCORE,msg="全场比分")
    private String fullScore;

    private Date lotteryTime;       //
    private String officialMatchCode;//官方赛事id

    @Group("upd")
    //@NotNull
    private String matchStatus;//赛事状态
    @Group("upd")
   // @NotNull
    private String officialId;//官方id
    private Date startTime;  //比赛开始时间
    private Date saleEndTime;//销售截止时间
    private String isNeutral;//是否中立场
    private String remark;   //备注
    private String createBy; //创建人
    private Date modifyTime; //修改时间
    private String modifyBy; //修改人

    private String stadium;  //场馆
    private String weather; //天气
    
    private Long matchPrimaryId;//match表主键id
    private Long homeTeamPrimaryId;//主队球队表主键id
    private Long guestTeamPrimaryId;//客队球队表主键id
    
    private String matchDataUrl;//一比分同步资料id
    private String homeTeamDataUrl;
    private String guestTeamDataUrl;

    /**
     * 得奖概率
     */
    private String winProb;

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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Long getAgainstId() {
        return againstId;
    }

    public void setAgainstId(Long againstId) {
        this.againstId = againstId;
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

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatchInfoUrl() {
        return matchInfoUrl;
    }

    public void setMatchInfoUrl(String matchInfoUrl) {
        this.matchInfoUrl = matchInfoUrl;
    }

    public String getAnalysisUrl() {
        return analysisUrl;
    }

    public void setAnalysisUrl(String analysisUrl) {
        this.analysisUrl = analysisUrl;
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

    public String getHomeLogoUrl() {
        return homeLogoUrl;
    }

    public void setHomeLogoUrl(String homeLogoUrl) {
        this.homeLogoUrl = homeLogoUrl;
    }

    public String getGuestLogoUrl() {
        return guestLogoUrl;
    }

    public void setGuestLogoUrl(String guestLogoUrl) {
        this.guestLogoUrl = guestLogoUrl;
    }

    public String getHomeTeamOrder() {
        return homeTeamOrder;
    }

    public void setHomeTeamOrder(String homeTeamOrder) {
        this.homeTeamOrder = homeTeamOrder;
    }

    public String getGuestTeamOrder() {
        return guestTeamOrder;
    }

    public void setGuestTeamOrder(String guestTeamOrder) {
        this.guestTeamOrder = guestTeamOrder;
    }

    public String getHalfScore() {
        return halfScore;
    }

    public void setHalfScore(String halfScore) {
        this.halfScore = halfScore;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
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

    public String getIsNeutral() {
        return isNeutral;
    }

    public void setIsNeutral(String isNeutral) {
        this.isNeutral = isNeutral;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
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

	public String getMatchDataUrl() {
		return matchDataUrl;
	}

	public void setMatchDataUrl(String matchDataUrl) {
		this.matchDataUrl = matchDataUrl;
	}

	public String getHomeTeamDataUrl() {
		return homeTeamDataUrl;
	}

	public void setHomeTeamDataUrl(String homeTeamDataUrl) {
		this.homeTeamDataUrl = homeTeamDataUrl;
	}

	public String getGuestTeamDataUrl() {
		return guestTeamDataUrl;
	}

	public void setGuestTeamDataUrl(String guestTeamDataUrl) {
		this.guestTeamDataUrl = guestTeamDataUrl;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

    public String getWinProb() {
        return winProb;
    }

    public void setWinProb(String winProb) {
        this.winProb = winProb;
    }
}
