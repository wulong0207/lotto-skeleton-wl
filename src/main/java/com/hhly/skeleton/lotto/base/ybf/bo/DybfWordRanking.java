package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class DybfWordRanking extends BaseBO {
    private static final long serialVersionUID = 1L;
    private Integer rankId;// 名次
    private String teamName;
    private Integer nationalTeamId;//国家队Id
    private Integer rankChange;//排名升降
    private Integer score;//积分
    private Integer scoreChange;//积分升降
    private Integer location;//地区
    private Integer kind;//男足或女足    0:男足，1：女足
    private Integer year;//年
    private Integer month;//月
    private String nearSix;//近六轮赛果
    private String yearRanking;//近一年排名趋势

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public Integer getNationalTeamId() {
        return nationalTeamId;
    }

    public void setNationalTeamId(Integer nationalTeamId) {
        this.nationalTeamId = nationalTeamId;
    }

    public Integer getRankChange() {
        return rankChange;
    }

    public void setRankChange(Integer rankChange) {
        this.rankChange = rankChange;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreChange() {
        return scoreChange;
    }

    public void setScoreChange(Integer scoreChange) {
        this.scoreChange = scoreChange;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getNearSix() {
        return nearSix;
    }

    public void setNearSix(String nearSix) {
        this.nearSix = nearSix;
    }

    public String getYearRanking() {
        return yearRanking;
    }

    public void setYearRanking(String yearRanking) {
        this.yearRanking = yearRanking;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}