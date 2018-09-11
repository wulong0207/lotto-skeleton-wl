package com.hhly.skeleton.cms.sportmgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.Pattern;

/**
 * Created by lgs on 2016/12/16.
 */
public class BJDataVO extends  SportDataBaseVO{
    private static final long serialVersionUID = -9127085448555882781L;
    private Long sportDrawBj;

    private Short letWdf;

    private Short udSd;

    private Double spLetWdf;

    private Double spGoalNum;

    private Double spHfWdf;

    private Double spUdSd;

    private Double spScore;

    @Group("upd")
    @Pattern(value= MatchPattern.POSITIVE_NEGATIVE_NUM,msg="让分")
    private Short letNum; //让球数

    private String score; //总比分

    private Short goalNum; //总进球

    private String hfWdf; //半场胜平负

    private Date drawTime;//开奖时间

    private Long sportStatusBjId;

    private Short statusLetWdf;

    private Short statusGoal;

    private Short statusHfWdf;

    private Short statusUdSd;

    private Short statusScore;

    private String notSalePay;

    public String getNotSalePay() {
        return notSalePay;
    }

    public void setNotSalePay(String notSalePay) {
        this.notSalePay = notSalePay;
    }

    public Long getSportDrawBj() {
        return sportDrawBj;
    }

    public void setSportDrawBj(Long sportDrawBj) {
        this.sportDrawBj = sportDrawBj;
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

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public Short getLetWdf() {
        return letWdf;
    }

    public void setLetWdf(Short letWdf) {
        this.letWdf = letWdf;
    }

    public Short getUdSd() {
        return udSd;
    }

    public void setUdSd(Short udSd) {
        this.udSd = udSd;
    }

    public Double getSpLetWdf() {
        return spLetWdf;
    }

    public void setSpLetWdf(Double spLetWdf) {
        this.spLetWdf = spLetWdf;
    }

    public Double getSpGoalNum() {
        return spGoalNum;
    }

    public void setSpGoalNum(Double spGoalNum) {
        this.spGoalNum = spGoalNum;
    }

    public Double getSpHfWdf() {
        return spHfWdf;
    }

    public void setSpHfWdf(Double spHfWdf) {
        this.spHfWdf = spHfWdf;
    }

    public Double getSpUdSd() {
        return spUdSd;
    }

    public void setSpUdSd(Double spUdSd) {
        this.spUdSd = spUdSd;
    }

    public Double getSpScore() {
        return spScore;
    }

    public void setSpScore(Double spScore) {
        this.spScore = spScore;
    }

    public Long getSportStatusBjId() {
        return sportStatusBjId;
    }

    public void setSportStatusBjId(Long sportStatusBjId) {
        this.sportStatusBjId = sportStatusBjId;
    }

    public Short getStatusUdSd() {
        return statusUdSd;
    }

    public void setStatusUdSd(Short statusUdSd) {
        this.statusUdSd = statusUdSd;
    }
}
