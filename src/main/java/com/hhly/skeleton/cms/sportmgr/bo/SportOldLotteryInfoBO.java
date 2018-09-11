package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by lgs on 2016/12/5.
 *
 */
public class SportOldLotteryInfoBO extends SportFBBaseBO{
    private static final long serialVersionUID = 1663081777377625368L;

    private Long drawOldInfoId;

    private String halfScore;

    private String fullScore;

    private Short fourGoal;

    private String sixHfWdf;

    private Short fourteenWdf;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date drawTime;

    public Long getDrawOldInfoId() {
        return drawOldInfoId;
    }

    public void setDrawOldInfoId(Long drawOldInfoId) {
        this.drawOldInfoId = drawOldInfoId;
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

    public Short getFourGoal() {
        return fourGoal;
    }

    public void setFourGoal(Short fourGoal) {
        this.fourGoal = fourGoal;
    }

    public String getSixHfWdf() {
        return sixHfWdf;
    }

    public void setSixHfWdf(String sixHfWdf) {
        this.sixHfWdf = sixHfWdf;
    }

    public Short getFourteenWdf() {
        return fourteenWdf;
    }

    public void setFourteenWdf(Short fourteenWdf) {
        this.fourteenWdf = fourteenWdf;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }
}
