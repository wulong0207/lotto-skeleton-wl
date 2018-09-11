package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBbSSSBO extends BaseBO {
    private static final long serialVersionUID = 6470698356161971865L;
    private Long id;

    private Long sportAgainstInfoId;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float presetScore;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spBig;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spSmall;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    private Date updateTime;

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

    public Float getPresetScore() {
        return presetScore;
    }

    public void setPresetScore(Float presetScore) {
        this.presetScore = presetScore;
    }

    public Float getSpBig() {
        return spBig;
    }

    public void setSpBig(Float spBig) {
        this.spBig = spBig;
    }

    public Float getSpSmall() {
        return spSmall;
    }

    public void setSpSmall(Float spSmall) {
        this.spSmall = spSmall;
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