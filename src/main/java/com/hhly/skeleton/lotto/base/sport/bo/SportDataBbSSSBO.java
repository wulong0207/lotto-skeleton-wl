package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

public class SportDataBbSSSBO extends BaseBO {
    private static final long serialVersionUID = 6470698356161971865L;
    @JsonIgnore
    private Long id;
    @JsonIgnore
    private Long sportAgainstInfoId;

    @JsonProperty("score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float presetScore;

    @JsonProperty("b")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spBig;

    @JsonProperty("s")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spSmall;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("sportAgainstInfoId", sportAgainstInfoId)
                .append("presetScore", presetScore)
                .append("spBig", spBig)
                .append("spSmall", spSmall)
                .append("releaseTime", releaseTime)
                .append("updateTime", updateTime)
                .append("createTime", createTime)
                .toString();
    }
}