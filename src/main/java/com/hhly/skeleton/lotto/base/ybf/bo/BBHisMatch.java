package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class BBHisMatch extends BaseBO {
    private static final long serialVersionUID = 1L;
    private int scheduleId;//赛事id
    private int leagueId;//联赛id
    private String leagueColor;//联赛颜色
    private String leagueName;//联赛名
    private int continentId;//联赛所属洲id
    private int nationId;//联赛所属国家id
    private int leagueKind;//联赛类型，1联赛，2杯赛
    private String matchTime;//比赛时间
    private int homeTeamId;//主队id
    private int guestTeamId;//客队id
    private String homeTeamName;//主队名
    private String guestTeamName;//客队名
    private Integer homeScore;//主队得分
    private Integer homeFhalf;//主队上半场得分
    private Integer homeShalf;//主队下半场得分
    private Integer homeOne;//主队第一节得分
    private Integer homeTwo;//主队第二节得分
    private Integer homeThree;//主队第三节得分
    private Integer homeFour;//主队第四节得分
    private Integer guestScore;//客队得分
    private Integer guestFhalf;//客队上半场得分
    private Integer guestShalf;//客队下半场得分
    private Integer guestOne;//客队第一节得分
    private Integer guestTwo;//客队第二节得分
    private Integer guestThree;//客队第三节得分
    private Integer guestFour;//客队第四节得分
    private Integer homeAdd;//主队加时得分
    private Integer guestAdd;//主队加时得分
    private String winLose;//胜负赛果
    private Integer differ;//分差
    private Integer total;//总分
    private String letGoal;//让球盘口
    private String letPan;//让球赛果
    private String totalScore;//大小球盘口
    private String totPan;//大小球赛果

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

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
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

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getHomeFhalf() {
        return homeFhalf;
    }

    public void setHomeFhalf(Integer homeFhalf) {
        this.homeFhalf = homeFhalf;
    }

    public Integer getHomeShalf() {
        return homeShalf;
    }

    public void setHomeShalf(Integer homeShalf) {
        this.homeShalf = homeShalf;
    }

    public Integer getHomeOne() {
        return homeOne;
    }

    public void setHomeOne(Integer homeOne) {
        this.homeOne = homeOne;
    }

    public Integer getHomeTwo() {
        return homeTwo;
    }

    public void setHomeTwo(Integer homeTwo) {
        this.homeTwo = homeTwo;
    }

    public Integer getHomeThree() {
        return homeThree;
    }

    public void setHomeThree(Integer homeThree) {
        this.homeThree = homeThree;
    }

    public Integer getHomeFour() {
        return homeFour;
    }

    public void setHomeFour(Integer homeFour) {
        this.homeFour = homeFour;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public Integer getGuestFhalf() {
        return guestFhalf;
    }

    public void setGuestFhalf(Integer guestFhalf) {
        this.guestFhalf = guestFhalf;
    }

    public Integer getGuestShalf() {
        return guestShalf;
    }

    public void setGuestShalf(Integer guestShalf) {
        this.guestShalf = guestShalf;
    }

    public Integer getGuestOne() {
        return guestOne;
    }

    public void setGuestOne(Integer guestOne) {
        this.guestOne = guestOne;
    }

    public Integer getGuestTwo() {
        return guestTwo;
    }

    public void setGuestTwo(Integer guestTwo) {
        this.guestTwo = guestTwo;
    }

    public Integer getGuestThree() {
        return guestThree;
    }

    public void setGuestThree(Integer guestThree) {
        this.guestThree = guestThree;
    }

    public Integer getGuestFour() {
        return guestFour;
    }

    public void setGuestFour(Integer guestFour) {
        this.guestFour = guestFour;
    }

    public Integer getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(Integer homeAdd) {
        this.homeAdd = homeAdd;
    }

    public Integer getGuestAdd() {
        return guestAdd;
    }

    public void setGuestAdd(Integer guestAdd) {
        this.guestAdd = guestAdd;
    }

    public String getWinLose() {
        return winLose;
    }

    public void setWinLose(String winLose) {
        this.winLose = winLose;
    }

    public Integer getDiffer() {
        return differ;
    }

    public void setDiffer(Integer differ) {
        this.differ = differ;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getLetGoal() {
        return letGoal;
    }

    public void setLetGoal(String letGoal) {
        this.letGoal = letGoal;
    }

    public String getLetPan() {
        return letPan;
    }

    public void setLetPan(String letPan) {
        this.letPan = letPan;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getTotPan() {
        return totPan;
    }

    public void setTotPan(String totPan) {
        this.totPan = totPan;
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
