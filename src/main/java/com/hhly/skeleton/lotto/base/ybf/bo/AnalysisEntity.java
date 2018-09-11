package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;
import java.util.Map;

/**
 * 手机端接口-析页面实体
 *
 * @author Lenovo
 */
public class AnalysisEntity extends BaseBO {
    private static final long serialVersionUID = 1L;
    //积分排名
    private Integer ifCountry;//0不是国家队比赛，1是国家队比赛
    private List<String[]> scoreRank;//全场
    private List<String[]> scoreRankHalf;//半场

    //杯赛有小组赛积分排名，如果是国家队比赛，会有国际足联排名
    private List<DybfWordRanking> nationalRank;//国家队比赛显示国际足联排名
    private List<HomeScoreBoard> groupRank;//小组赛积分排名

    //历史交锋
    //公司：3-SB,31-SBO,38-IBC,44-ISN,45-VinBet
    private List<List<OddsInfo>> hisMatch;//全场
    private List<List<OddsInfo>> hisHalf;//半场

    //近期战绩
    private List<MatchAns> homeNear;//主队
    private List<MatchAns> guestNear;//客队

    //未来比赛
    private List<MatchAns> homeFuture;//主队
    private List<MatchAns> guestFuture;//客队

    //历史同轮
    private List<List<OddsInfo>> homeRound;//主队全场
    private List<List<OddsInfo>> guestRound;//客队全场
    private List<List<OddsInfo>> homeRoundHalf;//主队半场
    private List<List<OddsInfo>> guestRoundHalf;//客队半场

    //进球时间
    private List<int[]> homeGoalTime;//主队
    private List<int[]> guestGoalTime;//客队

    //角球时间
    private List<int[]> homeCorner;//主队
    private List<int[]> guestCorner;//客队

    //平均统计
    private String[] homeAvg;//主队
    private String[] guestAvg;//客队

    //当前赛事数据统计
    private List<String[]> homeGoalMiss;//主队得失球统计
    private List<String[]> guestGoalMiss;//客场得失球统计
    private List<String[]> homeNetWin;//主队净胜球统计
    private List<String[]> guestNetWin;//客队净胜球统计
    private List<String[]> homeGoals;//主队进球数统计
    private List<String[]> guestGoals;//客队进球数统计
    private List<String[]> homeOddEven;//主队单双数统计
    private List<String[]> guestOddEven;//客队单双数统计

    private List<String> seasons;//前三个赛季
    //历史赛季亚盘统计分析
    private Map<String, Object> homeLetGo;//主队亚盘统计分析
    private Map<String, Object> guestLetGo;//客队亚盘统计分析
    //历史赛季大小盘统计分析
    private Map<String, Object> homeTot;//主队大小盘统计分析
    private Map<String, Object> guestTot;//客队大小盘统计分析

    //情报汇总
    private List<String> homeTips;//主
    private List<String> guestTips;//客
    private String homeTipNum;//主队情报所有百分比数据
    private String guestTipNum;//客队情报所有百分比数据
    //心水推荐
    private String mainRecommend;
    //联赛积分榜统计
    private Integer locationType;//地区类型
    private List<Integer> quaTypes;//用于统计资格赛事
    private List<List<String[]>> scoreData;//联赛积分榜

    public Integer getIfCountry() {
        return ifCountry;
    }

    public void setIfCountry(Integer ifCountry) {
        this.ifCountry = ifCountry;
    }

    public List<String[]> getScoreRank() {
        return scoreRank;
    }

    public void setScoreRank(List<String[]> scoreRank) {
        this.scoreRank = scoreRank;
    }

    public List<String[]> getScoreRankHalf() {
        return scoreRankHalf;
    }

    public void setScoreRankHalf(List<String[]> scoreRankHalf) {
        this.scoreRankHalf = scoreRankHalf;
    }

    public List<DybfWordRanking> getNationalRank() {
        return nationalRank;
    }

    public void setNationalRank(List<DybfWordRanking> nationalRank) {
        this.nationalRank = nationalRank;
    }

    public List<HomeScoreBoard> getGroupRank() {
        return groupRank;
    }

    public void setGroupRank(List<HomeScoreBoard> groupRank) {
        this.groupRank = groupRank;
    }

    public List<List<OddsInfo>> getHisMatch() {
        return hisMatch;
    }

    public void setHisMatch(List<List<OddsInfo>> hisMatch) {
        this.hisMatch = hisMatch;
    }

    public List<List<OddsInfo>> getHisHalf() {
        return hisHalf;
    }

    public void setHisHalf(List<List<OddsInfo>> hisHalf) {
        this.hisHalf = hisHalf;
    }

    public List<MatchAns> getHomeNear() {
        return homeNear;
    }

    public void setHomeNear(List<MatchAns> homeNear) {
        this.homeNear = homeNear;
    }

    public List<MatchAns> getGuestNear() {
        return guestNear;
    }

    public void setGuestNear(List<MatchAns> guestNear) {
        this.guestNear = guestNear;
    }

    public List<MatchAns> getHomeFuture() {
        return homeFuture;
    }

    public void setHomeFuture(List<MatchAns> homeFuture) {
        this.homeFuture = homeFuture;
    }

    public List<MatchAns> getGuestFuture() {
        return guestFuture;
    }

    public void setGuestFuture(List<MatchAns> guestFuture) {
        this.guestFuture = guestFuture;
    }

    public List<List<OddsInfo>> getHomeRound() {
        return homeRound;
    }

    public void setHomeRound(List<List<OddsInfo>> homeRound) {
        this.homeRound = homeRound;
    }

    public List<List<OddsInfo>> getGuestRound() {
        return guestRound;
    }

    public void setGuestRound(List<List<OddsInfo>> guestRound) {
        this.guestRound = guestRound;
    }

    public List<List<OddsInfo>> getHomeRoundHalf() {
        return homeRoundHalf;
    }

    public void setHomeRoundHalf(List<List<OddsInfo>> homeRoundHalf) {
        this.homeRoundHalf = homeRoundHalf;
    }

    public List<List<OddsInfo>> getGuestRoundHalf() {
        return guestRoundHalf;
    }

    public void setGuestRoundHalf(List<List<OddsInfo>> guestRoundHalf) {
        this.guestRoundHalf = guestRoundHalf;
    }

    public List<int[]> getHomeGoalTime() {
        return homeGoalTime;
    }

    public void setHomeGoalTime(List<int[]> homeGoalTime) {
        this.homeGoalTime = homeGoalTime;
    }

    public List<int[]> getGuestGoalTime() {
        return guestGoalTime;
    }

    public void setGuestGoalTime(List<int[]> guestGoalTime) {
        this.guestGoalTime = guestGoalTime;
    }

    public List<int[]> getHomeCorner() {
        return homeCorner;
    }

    public void setHomeCorner(List<int[]> homeCorner) {
        this.homeCorner = homeCorner;
    }

    public List<int[]> getGuestCorner() {
        return guestCorner;
    }

    public void setGuestCorner(List<int[]> guestCorner) {
        this.guestCorner = guestCorner;
    }

    public String[] getHomeAvg() {
        return homeAvg;
    }

    public void setHomeAvg(String[] homeAvg) {
        this.homeAvg = homeAvg;
    }

    public String[] getGuestAvg() {
        return guestAvg;
    }

    public void setGuestAvg(String[] guestAvg) {
        this.guestAvg = guestAvg;
    }

    public List<String[]> getHomeGoalMiss() {
        return homeGoalMiss;
    }

    public void setHomeGoalMiss(List<String[]> homeGoalMiss) {
        this.homeGoalMiss = homeGoalMiss;
    }

    public List<String[]> getGuestGoalMiss() {
        return guestGoalMiss;
    }

    public void setGuestGoalMiss(List<String[]> guestGoalMiss) {
        this.guestGoalMiss = guestGoalMiss;
    }

    public List<String[]> getHomeNetWin() {
        return homeNetWin;
    }

    public void setHomeNetWin(List<String[]> homeNetWin) {
        this.homeNetWin = homeNetWin;
    }

    public List<String[]> getGuestNetWin() {
        return guestNetWin;
    }

    public void setGuestNetWin(List<String[]> guestNetWin) {
        this.guestNetWin = guestNetWin;
    }

    public List<String[]> getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(List<String[]> homeGoals) {
        this.homeGoals = homeGoals;
    }

    public List<String[]> getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(List<String[]> guestGoals) {
        this.guestGoals = guestGoals;
    }

    public List<String[]> getHomeOddEven() {
        return homeOddEven;
    }

    public void setHomeOddEven(List<String[]> homeOddEven) {
        this.homeOddEven = homeOddEven;
    }

    public List<String[]> getGuestOddEven() {
        return guestOddEven;
    }

    public void setGuestOddEven(List<String[]> guestOddEven) {
        this.guestOddEven = guestOddEven;
    }

    public List<String> getHomeTips() {
        return homeTips;
    }

    public void setHomeTips(List<String> homeTips) {
        this.homeTips = homeTips;
    }

    public List<String> getGuestTips() {
        return guestTips;
    }

    public void setGuestTips(List<String> guestTips) {
        this.guestTips = guestTips;
    }

    public String getMainRecommend() {
        return mainRecommend;
    }

    public void setMainRecommend(String mainRecommend) {
        this.mainRecommend = mainRecommend;
    }

    public Integer getLocationType() {
        return locationType;
    }

    public void setLocationType(Integer locationType) {
        this.locationType = locationType;
    }

    public List<Integer> getQuaTypes() {
        return quaTypes;
    }

    public void setQuaTypes(List<Integer> quaTypes) {
        this.quaTypes = quaTypes;
    }

    public List<List<String[]>> getScoreData() {
        return scoreData;
    }

    public void setScoreData(List<List<String[]>> scoreData) {
        this.scoreData = scoreData;
    }

    public List<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<String> seasons) {
        this.seasons = seasons;
    }

    public Map<String, Object> getHomeLetGo() {
        return homeLetGo;
    }

    public void setHomeLetGo(Map<String, Object> homeLetGo) {
        this.homeLetGo = homeLetGo;
    }

    public Map<String, Object> getGuestLetGo() {
        return guestLetGo;
    }

    public void setGuestLetGo(Map<String, Object> guestLetGo) {
        this.guestLetGo = guestLetGo;
    }

    public Map<String, Object> getHomeTot() {
        return homeTot;
    }

    public void setHomeTot(Map<String, Object> homeTot) {
        this.homeTot = homeTot;
    }

    public Map<String, Object> getGuestTot() {
        return guestTot;
    }

    public void setGuestTot(Map<String, Object> guestTot) {
        this.guestTot = guestTot;
    }

    public String getGuestTipNum() {
        return guestTipNum;
    }

    public void setGuestTipNum(String guestTipNum) {
        this.guestTipNum = guestTipNum;
    }

    public String getHomeTipNum() {
        return homeTipNum;
    }

    public void setHomeTipNum(String homeTipNum) {
        this.homeTipNum = homeTipNum;
    }


}
