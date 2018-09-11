package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataSfWFBO extends BaseBO{
    private static final long serialVersionUID = 387844189020528427L;

    private Integer id;

    private Integer sportAgainstInfoId;

    private Integer letScore;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    private Date updateTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSportAgainstInfoId() {
        return sportAgainstInfoId;
    }

    public void setSportAgainstInfoId(Integer sportAgainstInfoId) {
        this.sportAgainstInfoId = sportAgainstInfoId;
    }

    public Integer getLetScore() {
        return letScore;
    }

    public void setLetScore(Integer letScore) {
        this.letScore = letScore;
    }

    public Float getSpWin() {
        return spWin;
    }

    public void setSpWin(Float spWin) {
        this.spWin = spWin;
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