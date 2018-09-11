package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBjUDSDBO extends BaseBO{
    private static final long serialVersionUID = 5718925751768285126L;
    private Long id;

    private Long sportAgainstInfoId;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spUpSingle;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spUpDouble;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDownSingle;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDownDouble;

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

    public Float getSpUpSingle() {
        return spUpSingle;
    }

    public void setSpUpSingle(Float spUpSingle) {
        this.spUpSingle = spUpSingle;
    }

    public Float getSpUpDouble() {
        return spUpDouble;
    }

    public void setSpUpDouble(Float spUpDouble) {
        this.spUpDouble = spUpDouble;
    }

    public Float getSpDownSingle() {
        return spDownSingle;
    }

    public void setSpDownSingle(Float spDownSingle) {
        this.spDownSingle = spDownSingle;
    }

    public Float getSpDownDouble() {
        return spDownDouble;
    }

    public void setSpDownDouble(Float spDownDouble) {
        this.spDownDouble = spDownDouble;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }


}