package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by lgs on 2016/12/5.
 * 胜负过关
 */
public class SportWFLotteryInfoBO extends SportFBBaseBO{

    private static final long serialVersionUID = 9156039105851350859L;

    private Long sportDrawWfId;

    private String fullScore;

    private Double letNum;

    private Short letSf;

    private Double spLetWf;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date drawTime;

    private Long sportStatusWfId;

    private Short statusLetWf;

    public Long getSportDrawWfId() {
        return sportDrawWfId;
    }

    public void setSportDrawWfId(Long sportDrawWfId) {
        this.sportDrawWfId = sportDrawWfId;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public Double getLetNum() {
        return letNum;
    }

    public void setLetNum(Double letNum) {
        this.letNum = letNum;
    }

    public Short getLetSf() {
        return letSf;
    }

    public void setLetSf(Short letSf) {
        this.letSf = letSf;
    }

    public Double getSpLetWf() {
        return spLetWf;
    }

    public void setSpLetWf(Double spLetWf) {
        this.spLetWf = spLetWf;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public Long getSportStatusWfId() {
        return sportStatusWfId;
    }

    public void setSportStatusWfId(Long sportStatusWfId) {
        this.sportStatusWfId = sportStatusWfId;
    }

    public Short getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Short statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

}
