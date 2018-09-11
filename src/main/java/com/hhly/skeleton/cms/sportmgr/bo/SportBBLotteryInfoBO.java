package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by lgs on 2016/12/5.
 * 竞彩篮球BO
 */
public class SportBBLotteryInfoBO extends SportFBBaseBO{
    private static final long serialVersionUID = 1663081777377625368L;

    private Long sportDrawBbId;

    private String firstScore;

    private String secondScore;

    private String thirdScore;

    private String fourthScore;

    private String outTimeScore;

    private String fullScore;

    private Short fullWf;//全分胜负

    private String letWf;//让分胜负

    private String sizeScore;//大小分

    private String winScore;//胜负差

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date drawTime; //开始时间

    private String notSalePay; //未开售玩法

    private Long sportStatusBbId;

    private Short statusWf;

    private Short statusLetWf;

    private Short statusBigSmall;

    private Short statusScoreWf;

    private Double letScore;

    private Double presetScore;

    public Long getSportDrawBbId() {
        return sportDrawBbId;
    }

    public void setSportDrawBbId(Long sportDrawBbId) {
        this.sportDrawBbId = sportDrawBbId;
    }

    public String getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(String firstScore) {
        this.firstScore = firstScore;
    }

    public String getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(String secondScore) {
        this.secondScore = secondScore;
    }

    public String getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(String thirdScore) {
        this.thirdScore = thirdScore;
    }

    public String getFourthScore() {
        return fourthScore;
    }

    public void setFourthScore(String fourthScore) {
        this.fourthScore = fourthScore;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public Short getFullWf() {
        return fullWf;
    }

    public void setFullWf(Short fullWf) {
        this.fullWf = fullWf;
    }

    public String getLetWf() {
        return letWf;
    }

    public void setLetWf(String letWf) {
        this.letWf = letWf;
    }

    public String getSizeScore() {
        return sizeScore;
    }

    public void setSizeScore(String sizeScore) {
        this.sizeScore = sizeScore;
    }

    public String getWinScore() {
        return winScore;
    }

    public void setWinScore(String winScore) {
        this.winScore = winScore;
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

    public Long getSportStatusBbId() {
        return sportStatusBbId;
    }

    public void setSportStatusBbId(Long sportStatusBbId) {
        this.sportStatusBbId = sportStatusBbId;
    }

    public Short getStatusWf() {
        return statusWf;
    }

    public void setStatusWf(Short statusWf) {
        this.statusWf = statusWf;
    }

    public Short getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Short statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

    public Short getStatusBigSmall() {
        return statusBigSmall;
    }

    public void setStatusBigSmall(Short statusBigSmall) {
        this.statusBigSmall = statusBigSmall;
    }

    public Short getStatusScoreWf() {
        return statusScoreWf;
    }

    public void setStatusScoreWf(Short statusScoreWf) {
        this.statusScoreWf = statusScoreWf;
    }

    public String getOutTimeScore() {
        return outTimeScore;
    }

    public void setOutTimeScore(String outTimeScore) {
        this.outTimeScore = outTimeScore;
    }

    public Double getLetScore() {
        return letScore;
    }

    public void setLetScore(Double letScore) {
        this.letScore = letScore;
    }

    public Double getPresetScore() {
        return presetScore;
    }

    public void setPresetScore(Double presetScore) {
        this.presetScore = presetScore;
    }
}
