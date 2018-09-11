package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;
import java.util.Map;

public class BBAnalysis extends BaseBO {
    private static final long serialVersionUID = 1L;

    private int scheduleId;//赛事id
    private int leagueId;//联赛id
    private String leagueColor;//联赛颜色
    private int continentId;//联赛所属洲id
    private int nationId;//联赛所属国家id
    private int leagueKind;//联赛类型，1联赛，2杯赛
    private String leagueName;//联赛名
    private String season;//赛季
    private String matchTime;//比赛时间
    private int matchStatus;//比赛状态 0未开赛 ，-1完场
    private int homeTeamId;//主队id
    private int guestTeamId;//客队id
    private String homeTeamName;//主队名
    private String guestTeamName;//客队名
    private Integer homeScore;//主队得分
    private Integer guestScore;//客队得分
    private String homeAlliance;//所属联盟简称
    private String homeOrder;//主队排名
    private String guestAlliance;//所属联盟简称
    private String guestOrder;//客队排名
    private String homeImg;//主队图片
    private String guestImg;//客队图片
    private String location;//比赛场地
    private String homeStatus;//主队状态，如：3W
    private String guestStatus;//客队状态，如：3L
    private String homeTrend;//主队走势，如：WLLWWW
    private String guestTrend;//客队走势，如：WLLWWW
    private List<BBScheduleOdds> oddsInfo;//即时赔率
    private List<BBLeagueRank> homeLeagueRank;//主队联赛排名
    private List<BBLeagueRank> guestLeagueRank;//客队联赛排名
    private Map<String, Object> hisMatch;//历史对阵
    private Map<String, Object> homeNear;//主队近期战绩
    private Map<String, Object> guestNear;//客队近期战绩
    private List<BBTechStat> homeStat;//数据统计-主队
    private List<BBTechStat> guestStat;//数据统计-客队
    private List<BBLeagueRank> homeBothStat;//双方盘路对比-主队
    private List<BBLeagueRank> guestBothStat;//双方盘路对比-客队
    private Map<String, Object> homeLetStat;//让分盘路对比-主队
    private Map<String, Object> guestLetStat;//让分盘路对比-客队
    private Map<String, Object> homeLetSame;//让球-主队历史同盘
    private Map<String, Object> guestLetSame;//让球-客队历史同盘
    private Map<String, Object> homeTotStat;//总分盘路对比-主队
    private Map<String, Object> guestTotStat;//总分盘路对比-客队
    private Map<String, Object> homeTotSame;//总分-主队历史同盘
    private Map<String, Object> guestTotSame;//总分-客队历史同盘
    private List<String[]> homeAvgScore;//平均得分-失分对比-主队
    private List<String[]> guestAvgScore;//平均得分-失分对比-客队
    private List<String[]> homeSingle;//球队得分分数-单双统计-主队
    private List<String[]> guestSingle;//球队得分分数-单双统计-客队
    private List<String[]> homeFull;//总分统计-全场-主队
    private List<String[]> guestFull;//总分统计-全场-客队
    private List<String[]> homeHalf;//总分统计-半场-主队
    private List<String[]> guestHalf;//总分统计-半场-客队
    private List<String[]> homeFullHalf;//半-全场统计-主队
    private List<String[]> guestFullHalf;//半-全场统计-客队
    private List<BBFurMatch> homeFurMatch;//未来赛程-主队
    private List<BBFurMatch> guestFurMatch;//未来赛程-客队
    private String recommend;//心水推荐
    private List<BBTipsInfo> homeTips;//情报中心-主队
    private List<BBTipsInfo> guestTips;//情报中心-客队

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public int getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(int homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public int getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(int guestTeamId) {
        this.guestTeamId = guestTeamId;
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

    public String getHomeOrder() {
        return homeOrder;
    }

    public void setHomeOrder(String homeOrder) {
        this.homeOrder = homeOrder;
    }

    public String getHomeAlliance() {
        return homeAlliance;
    }

    public void setHomeAlliance(String homeAlliance) {
        this.homeAlliance = homeAlliance;
    }

    public String getGuestAlliance() {
        return guestAlliance;
    }

    public void setGuestAlliance(String guestAlliance) {
        this.guestAlliance = guestAlliance;
    }

    public String getGuestOrder() {
        return guestOrder;
    }

    public void setGuestOrder(String guestOrder) {
        this.guestOrder = guestOrder;
    }

    public String getHomeImg() {
        return homeImg;
    }

    public void setHomeImg(String homeImg) {
        this.homeImg = homeImg;
    }

    public String getGuestImg() {
        return guestImg;
    }

    public void setGuestImg(String guestImg) {
        this.guestImg = guestImg;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHomeStatus() {
        return homeStatus;
    }

    public void setHomeStatus(String homeStatus) {
        this.homeStatus = homeStatus;
    }

    public String getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(String guestStatus) {
        this.guestStatus = guestStatus;
    }

    public List<BBScheduleOdds> getOddsInfo() {
        return oddsInfo;
    }

    public void setOddsInfo(List<BBScheduleOdds> oddsInfo) {
        this.oddsInfo = oddsInfo;
    }

    public String getHomeTrend() {
        return homeTrend;
    }

    public void setHomeTrend(String homeTrend) {
        this.homeTrend = homeTrend;
    }

    public String getGuestTrend() {
        return guestTrend;
    }

    public void setGuestTrend(String guestTrend) {
        this.guestTrend = guestTrend;
    }

    public List<BBLeagueRank> getHomeLeagueRank() {
        return homeLeagueRank;
    }

    public void setHomeLeagueRank(List<BBLeagueRank> homeLeagueRank) {
        this.homeLeagueRank = homeLeagueRank;
    }

    public List<BBLeagueRank> getGuestLeagueRank() {
        return guestLeagueRank;
    }

    public void setGuestLeagueRank(List<BBLeagueRank> guestLeagueRank) {
        this.guestLeagueRank = guestLeagueRank;
    }

    public Map<String, Object> getHisMatch() {
        return hisMatch;
    }

    public void setHisMatch(Map<String, Object> hisMatch) {
        this.hisMatch = hisMatch;
    }

    public List<BBTechStat> getHomeStat() {
        return homeStat;
    }

    public void setHomeStat(List<BBTechStat> homeStat) {
        this.homeStat = homeStat;
    }

    public List<BBTechStat> getGuestStat() {
        return guestStat;
    }

    public void setGuestStat(List<BBTechStat> guestStat) {
        this.guestStat = guestStat;
    }

    public List<BBLeagueRank> getHomeBothStat() {
        return homeBothStat;
    }

    public void setHomeBothStat(List<BBLeagueRank> homeBothStat) {
        this.homeBothStat = homeBothStat;
    }

    public List<BBLeagueRank> getGuestBothStat() {
        return guestBothStat;
    }

    public void setGuestBothStat(List<BBLeagueRank> guestBothStat) {
        this.guestBothStat = guestBothStat;
    }

    public Map<String, Object> getHomeLetStat() {
        return homeLetStat;
    }

    public void setHomeLetStat(Map<String, Object> homeLetStat) {
        this.homeLetStat = homeLetStat;
    }

    public Map<String, Object> getGuestLetStat() {
        return guestLetStat;
    }

    public void setGuestLetStat(Map<String, Object> guestLetStat) {
        this.guestLetStat = guestLetStat;
    }

    public Map<String, Object> getHomeNear() {
        return homeNear;
    }

    public void setHomeNear(Map<String, Object> homeNear) {
        this.homeNear = homeNear;
    }

    public Map<String, Object> getGuestNear() {
        return guestNear;
    }

    public void setGuestNear(Map<String, Object> guestNear) {
        this.guestNear = guestNear;
    }

    public Map<String, Object> getHomeLetSame() {
        return homeLetSame;
    }

    public void setHomeLetSame(Map<String, Object> homeLetSame) {
        this.homeLetSame = homeLetSame;
    }

    public Map<String, Object> getGuestLetSame() {
        return guestLetSame;
    }

    public void setGuestLetSame(Map<String, Object> guestLetSame) {
        this.guestLetSame = guestLetSame;
    }

    public Map<String, Object> getHomeTotStat() {
        return homeTotStat;
    }

    public void setHomeTotStat(Map<String, Object> homeTotStat) {
        this.homeTotStat = homeTotStat;
    }

    public Map<String, Object> getGuestTotStat() {
        return guestTotStat;
    }

    public void setGuestTotStat(Map<String, Object> guestTotStat) {
        this.guestTotStat = guestTotStat;
    }

    public Map<String, Object> getHomeTotSame() {
        return homeTotSame;
    }

    public void setHomeTotSame(Map<String, Object> homeTotSame) {
        this.homeTotSame = homeTotSame;
    }

    public Map<String, Object> getGuestTotSame() {
        return guestTotSame;
    }

    public void setGuestTotSame(Map<String, Object> guestTotSame) {
        this.guestTotSame = guestTotSame;
    }

    public List<String[]> getGuestAvgScore() {
        return guestAvgScore;
    }

    public void setGuestAvgScore(List<String[]> guestAvgScore) {
        this.guestAvgScore = guestAvgScore;
    }

    public List<String[]> getHomeAvgScore() {
        return homeAvgScore;
    }

    public void setHomeAvgScore(List<String[]> homeAvgScore) {
        this.homeAvgScore = homeAvgScore;
    }

    public List<String[]> getHomeSingle() {
        return homeSingle;
    }

    public void setHomeSingle(List<String[]> homeSingle) {
        this.homeSingle = homeSingle;
    }

    public List<String[]> getGuestSingle() {
        return guestSingle;
    }

    public void setGuestSingle(List<String[]> guestSingle) {
        this.guestSingle = guestSingle;
    }

    public List<String[]> getHomeFull() {
        return homeFull;
    }

    public void setHomeFull(List<String[]> homeFull) {
        this.homeFull = homeFull;
    }

    public List<String[]> getGuestFull() {
        return guestFull;
    }

    public void setGuestFull(List<String[]> guestFull) {
        this.guestFull = guestFull;
    }

    public List<String[]> getHomeHalf() {
        return homeHalf;
    }

    public void setHomeHalf(List<String[]> homeHalf) {
        this.homeHalf = homeHalf;
    }

    public List<String[]> getGuestHalf() {
        return guestHalf;
    }

    public void setGuestHalf(List<String[]> guestHalf) {
        this.guestHalf = guestHalf;
    }

    public List<String[]> getHomeFullHalf() {
        return homeFullHalf;
    }

    public void setHomeFullHalf(List<String[]> homeFullHalf) {
        this.homeFullHalf = homeFullHalf;
    }

    public List<String[]> getGuestFullHalf() {
        return guestFullHalf;
    }

    public void setGuestFullHalf(List<String[]> guestFullHalf) {
        this.guestFullHalf = guestFullHalf;
    }

    public List<BBFurMatch> getHomeFurMatch() {
        return homeFurMatch;
    }

    public void setHomeFurMatch(List<BBFurMatch> homeFurMatch) {
        this.homeFurMatch = homeFurMatch;
    }

    public List<BBFurMatch> getGuestFurMatch() {
        return guestFurMatch;
    }

    public void setGuestFurMatch(List<BBFurMatch> guestFurMatch) {
        this.guestFurMatch = guestFurMatch;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public List<BBTipsInfo> getHomeTips() {
        return homeTips;
    }

    public void setHomeTips(List<BBTipsInfo> homeTips) {
        this.homeTips = homeTips;
    }

    public List<BBTipsInfo> getGuestTips() {
        return guestTips;
    }

    public void setGuestTips(List<BBTipsInfo> guestTips) {
        this.guestTips = guestTips;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public int getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(int matchStatus) {
        this.matchStatus = matchStatus;
    }

    public int getContinentId() {
        return continentId;
    }

    public void setContinentId(int continentId) {
        this.continentId = continentId;
    }

    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    public int getLeagueKind() {
        return leagueKind;
    }

    public void setLeagueKind(int leagueKind) {
        this.leagueKind = leagueKind;
    }

    public String getLeagueColor() {
        return leagueColor;
    }

    public void setLeagueColor(String leagueColor) {
        this.leagueColor = leagueColor;
    }


}
