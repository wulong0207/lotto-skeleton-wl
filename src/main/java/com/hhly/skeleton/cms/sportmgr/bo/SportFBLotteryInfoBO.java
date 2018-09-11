package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by lgs on 2016/12/5.
 *
 */
public class SportFBLotteryInfoBO extends SportFBBaseBO{
    private static final long serialVersionUID = 1663081777377625368L;

    private Long sportDrawFbId;

    private String halfScore; //半场比分

    private String fullScore; //全场比分

    private Short fullSpf; //全场胜平负

    private Short letSpf; //让球胜平负

    private Short letNum; //让球数

    private String score; //总比分

    private Short goalNum; //总进球

    private String hfWdf; //半场胜平负

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date drawTime; //开始时间

    private String notSalePay; //未开售玩法

    private Long sportStatusFbId;

    private Short statusWdf;

    private Short statusLetWdf;

    private Short statusGoal;

    private Short statusHfWdf;

    private Short statusScore;

    public Long getSportDrawFbId() {
        return sportDrawFbId;
    }

    public void setSportDrawFbId(Long sportDrawFbId) {
        this.sportDrawFbId = sportDrawFbId;
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

    public Short getFullSpf() {
        return fullSpf;
    }

    public void setFullSpf(Short fullSpf) {
        this.fullSpf = fullSpf;
    }

    public Short getLetSpf() {
        return letSpf;
    }

    public void setLetSpf(Short letSpf) {
        this.letSpf = letSpf;
    }

    public Short getLetNum() {
        return letNum;
    }

    public void setLetNum(Short letNum) {
        this.letNum = letNum;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Short getGoalNum() {
        return goalNum;
    }

    public void setGoalNum(Short goalNum) {
        this.goalNum = goalNum;
    }

    public String getHfWdf() {
        return hfWdf;
    }

    public void setHfWdf(String hfWdf) {
        this.hfWdf = hfWdf;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public String getNotSalePay() {
        return notSalePay;
    }

    public void setNotSalePay(String notSalePay) {
        this.notSalePay = notSalePay;
    }

    public Long getSportStatusFbId() {
        return sportStatusFbId;
    }

    public void setSportStatusFbId(Long sportStatusFbId) {
        this.sportStatusFbId = sportStatusFbId;
    }

    public Short getStatusWdf() {
        return statusWdf;
    }

    public void setStatusWdf(Short statusWdf) {
        this.statusWdf = statusWdf;
    }

    public Short getStatusLetWdf() {
        return statusLetWdf;
    }

    public void setStatusLetWdf(Short statusLetWdf) {
        this.statusLetWdf = statusLetWdf;
    }

    public Short getStatusGoal() {
        return statusGoal;
    }

    public void setStatusGoal(Short statusGoal) {
        this.statusGoal = statusGoal;
    }

    public Short getStatusHfWdf() {
        return statusHfWdf;
    }

    public void setStatusHfWdf(Short statusHfWdf) {
        this.statusHfWdf = statusHfWdf;
    }

    public Short getStatusScore() {
        return statusScore;
    }

    public void setStatusScore(Short statusScore) {
        this.statusScore = statusScore;
    }
}
