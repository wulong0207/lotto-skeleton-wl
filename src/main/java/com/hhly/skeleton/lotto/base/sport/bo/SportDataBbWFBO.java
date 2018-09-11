package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBbWFBO extends BaseBO {
    private static final long serialVersionUID = -4244571937449284221L;
    @JsonIgnore
    private Long id;

    @JsonIgnore
    private Long sportAgainstInfoId;

    @JsonProperty("let_score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float letScore;

    @JsonProperty("l")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail;

    @JsonProperty("w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin;

    @JsonIgnore
    private Short spType;

    @JsonProperty("u_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    @JsonIgnore
    private Date updateTime;

    @JsonIgnore
    private Date createTime;

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

    public Float getLetScore() {
        return letScore;
    }

    public void setLetScore(Float letScore) {
        this.letScore = letScore;
    }

    public Float getSpFail() {
        return spFail;
    }

    public void setSpFail(Float spFail) {
        this.spFail = spFail;
    }

    public Float getSpWin() {
        return spWin;
    }

    public void setSpWin(Float spWin) {
        this.spWin = spWin;
    }

    public Short getSpType() {
        return spType;
    }

    public void setSpType(Short spType) {
        this.spType = spType;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}