package com.hhly.skeleton.lotto.base.sport.vo;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.cms.sportmgr.vo.SportDataBaseVO;

/**
 * Created by lgs on 2016/12/16.
 */
public class FBDataVO extends  SportDataBaseVO{
    private static final long serialVersionUID = -9127085448555882781L;

    private Long sportDrawFbId;

    private Short fullSpf; //全场SP

    private Short letSpf; //让球SP

    @Group("upd")
    //@NotNull
    @Pattern(value= MatchPattern.POSITIVE_NEGATIVE_NUM,msg="让分")
    private Short letNum; //让球数

    private String score; //总比分

    private Short goalNum; //总进球

    private String hfWdf; //半场胜平负

    private Date drawTime;//开奖时间

    private Long sportStatusFbId;

    private Short statusWdf;

    private Short statusLetWdf;

    private Short statusGoal;

    private Short statusHfWdf;

    private Short statusScore;

    private String notSalePay;

    public Long getSportDrawFbId() {
        return sportDrawFbId;
    }

    public void setSportDrawFbId(Long sportDrawFbId) {
        this.sportDrawFbId = sportDrawFbId;
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
}
