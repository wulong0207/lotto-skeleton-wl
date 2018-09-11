package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author lgs on
 * @version 1.0
 * @desc 前端球队近期对阵页面展示BO
 * @date 2017/11/4.
 * @company 益彩网络科技有限公司
 */
public class FootBallMatchAnsBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    private String matchTime;
    private Integer homeScore;
    private Integer guestScore;
    private String letGo;
    private String letGoResult;
    private String totalScore;
    private String totalScoreResult;
    private Integer homeTeamId;
    private Integer guestTeamId;
    private String homeTeamName;
    private String guestTeamName;
    private String homeOrder;
    private String guestOrder;
    private String result;
    private Integer scheduleId;
    private List<String[]> euAvgOdds;
    private List<String[]> asOdds;
    private String gNameEn;
    private String gNamezh;
    private String gNameKo;
    private String gNameIn;
    private String gNameTh;
    private String gNameVi;
    private String gNamezhTw;
    private Integer matchGap;
    private Integer minute;
    private String scoreResult;// 赛果
    private Integer sclassId;
    private String sclassName;
    private String sColor;
    private Integer homeHalfScore;//主队半场比分
    private Integer guestHalfScore;//客队半场比分
    private String letGoHalf;//让球半场
    private String totHalf;//大小球半场
    private String lgHalfRs;//半场盘路
    private String totHalfRs;//半场大小
    private String scoreHalfRs;//半场赛果

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
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

    public String getLetGo() {
        return letGo;
    }

    public void setLetGo(String letGo) {
        this.letGo = letGo;
    }

    public String getLetGoResult() {
        return letGoResult;
    }

    public void setLetGoResult(String letGoResult) {
        this.letGoResult = letGoResult;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getTotalScoreResult() {
        return totalScoreResult;
    }

    public void setTotalScoreResult(String totalScoreResult) {
        this.totalScoreResult = totalScoreResult;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Integer guestTeamId) {
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

    public String getGuestOrder() {
        return guestOrder;
    }

    public void setGuestOrder(String guestOrder) {
        this.guestOrder = guestOrder;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public List<String[]> getEuAvgOdds() {
        return euAvgOdds;
    }

    public void setEuAvgOdds(List<String[]> euAvgOdds) {
        this.euAvgOdds = euAvgOdds;
    }

    public List<String[]> getAsOdds() {
        return asOdds;
    }

    public void setAsOdds(List<String[]> asOdds) {
        this.asOdds = asOdds;
    }

    public String getgNameEn() {
        return gNameEn;
    }

    public void setgNameEn(String gNameEn) {
        this.gNameEn = gNameEn;
    }

    public String getgNamezh() {
        return gNamezh;
    }

    public void setgNamezh(String gNamezh) {
        this.gNamezh = gNamezh;
    }

    public String getgNameKo() {
        return gNameKo;
    }

    public void setgNameKo(String gNameKo) {
        this.gNameKo = gNameKo;
    }

    public String getgNameIn() {
        return gNameIn;
    }

    public void setgNameIn(String gNameIn) {
        this.gNameIn = gNameIn;
    }

    public String getgNameTh() {
        return gNameTh;
    }

    public void setgNameTh(String gNameTh) {
        this.gNameTh = gNameTh;
    }

    public String getgNameVi() {
        return gNameVi;
    }

    public void setgNameVi(String gNameVi) {
        this.gNameVi = gNameVi;
    }

    public String getgNamezhTw() {
        return gNamezhTw;
    }

    public void setgNamezhTw(String gNamezhTw) {
        this.gNamezhTw = gNamezhTw;
    }

    public Integer getMatchGap() {
        return matchGap;
    }

    public void setMatchGap(Integer matchGap) {
        this.matchGap = matchGap;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public String getScoreResult() {
        return scoreResult;
    }

    public void setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
    }

    public Integer getSclassId() {
        return sclassId;
    }

    public void setSclassId(Integer sclassId) {
        this.sclassId = sclassId;
    }

    public String getSclassName() {
        return sclassName;
    }

    public void setSclassName(String sclassName) {
        this.sclassName = sclassName;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public Integer getHomeHalfScore() {
        return homeHalfScore;
    }

    public void setHomeHalfScore(Integer homeHalfScore) {
        this.homeHalfScore = homeHalfScore;
    }

    public Integer getGuestHalfScore() {
        return guestHalfScore;
    }

    public void setGuestHalfScore(Integer guestHalfScore) {
        this.guestHalfScore = guestHalfScore;
    }

    public String getLetGoHalf() {
        return letGoHalf;
    }

    public void setLetGoHalf(String letGoHalf) {
        this.letGoHalf = letGoHalf;
    }

    public String getTotHalf() {
        return totHalf;
    }

    public void setTotHalf(String totHalf) {
        this.totHalf = totHalf;
    }

    public String getLgHalfRs() {
        return lgHalfRs;
    }

    public void setLgHalfRs(String lgHalfRs) {
        this.lgHalfRs = lgHalfRs;
    }

    public String getTotHalfRs() {
        return totHalfRs;
    }

    public void setTotHalfRs(String totHalfRs) {
        this.totHalfRs = totHalfRs;
    }

    public String getScoreHalfRs() {
        return scoreHalfRs;
    }

    public void setScoreHalfRs(String scoreHalfRs) {
        this.scoreHalfRs = scoreHalfRs;
    }
}
