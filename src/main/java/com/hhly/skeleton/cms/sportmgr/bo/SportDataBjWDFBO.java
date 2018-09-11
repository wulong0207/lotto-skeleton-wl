package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBjWDFBO extends BaseBO{
    private static final long serialVersionUID = -4472841819541201566L;
    private Long id;

    private Long sportAgainstInfoId;

    private Short letNum;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDraw;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSportAgainstInfoId() {
        return sportAgainstInfoId;
    }

    public void setSportAgainstInfoId(Long sportAgainstInfoId) {
        this.sportAgainstInfoId = sportAgainstInfoId;
    }

    public Short getLetNum() {
        return letNum;
    }

    public void setLetNum(Short letNum) {
        this.letNum = letNum;
    }

    public Float getSpWin() {
        return spWin;
    }

    public void setSpWin(Float spWin) {
        this.spWin = spWin;
    }

    public Float getSpDraw() {
        return spDraw;
    }

    public void setSpDraw(Float spDraw) {
        this.spDraw = spDraw;
    }

    public Float getSpFail() {
        return spFail;
    }

    public void setSpFail(Float spFail) {
        this.spFail = spFail;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }


}