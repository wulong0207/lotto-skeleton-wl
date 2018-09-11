package com.hhly.skeleton.lotto.base.ybf.bo;


import com.hhly.skeleton.base.bo.BaseBO;

public class HomeScoreBoard extends BaseBO {
    private static final long serialVersionUID = 1L;
    private Integer teamId;

    private String teamName;

    private String area;

    private String target;

    private Integer ranking;

    private Integer round;

    private String season;

    private String flag;

    private int matchCount;
    private int win;
    private int draw;
    private int lose;
    private int getIn;
    private int getOut;
    private int jing;
    private String avgIn;
    private String avgOut;
    private int score;
    private String near1;
    private String near2;
    private String near3;
    private String near4;
    private String near5;
    private String near6;
    private int qualification;//赛程的资格   1：代表有欧冠资格  2：代表欧冠附加  3：代表欧罗巴  4：代表欧罗附  5：代表直接升级 6：代表升级附加 7；代表降级 8：代表降级附加  
    private int deductMarks;  //扣分情况   ：  0:代表该球队没有扣分情况   1:代表该球有扣分情况

    public int getDeductMarks() {
        return deductMarks;
    }

    public void setDeductMarks(int deductMarks) {
        this.deductMarks = deductMarks;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getWin() {
        return win;
    }

    public int getDraw() {
        return draw;
    }

    public int getLose() {
        return lose;
    }

    public int getGetIn() {
        return getIn;
    }

    public int getGetOut() {
        return getOut;
    }

    public int getJing() {
        return jing;
    }

    public String getAvgIn() {
        return avgIn;
    }

    public String getAvgOut() {
        return avgOut;
    }

    public int getScore() {
        return score;
    }

    public String getNear1() {
        return near1;
    }

    public String getNear2() {
        return near2;
    }

    public String getNear3() {
        return near3;
    }

    public String getNear4() {
        return near4;
    }

    public String getNear5() {
        return near5;
    }

    public String getNear6() {
        return near6;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setGetIn(int getIn) {
        this.getIn = getIn;
    }

    public void setGetOut(int getOut) {
        this.getOut = getOut;
    }

    public void setJing(int jing) {
        this.jing = jing;
    }

    public void setAvgIn(String avgIn) {
        this.avgIn = avgIn;
    }

    public void setAvgOut(String avgOut) {
        this.avgOut = avgOut;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setNear1(String near1) {
        this.near1 = near1;
    }

    public void setNear2(String near2) {
        this.near2 = near2;
    }

    public void setNear3(String near3) {
        this.near3 = near3;
    }

    public void setNear4(String near4) {
        this.near4 = near4;
    }

    public void setNear5(String near5) {
        this.near5 = near5;
    }

    public void setNear6(String near6) {
        this.near6 = near6;
    }


}