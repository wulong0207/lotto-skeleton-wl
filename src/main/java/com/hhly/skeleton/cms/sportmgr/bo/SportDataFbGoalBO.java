package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataFbGoalBO extends BaseBO {
    private static final long serialVersionUID = 1380512159434189086L;
    private Long id;

    private Long sportAgainstInfoId;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp0Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp1Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp2Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp3Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp4Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp5Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp6Goal;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp7Goal;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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

    public Float getSp0Goal() {
        return sp0Goal;
    }

    public void setSp0Goal(Float sp0Goal) {
        this.sp0Goal = sp0Goal;
    }

    public Float getSp1Goal() {
        return sp1Goal;
    }

    public void setSp1Goal(Float sp1Goal) {
        this.sp1Goal = sp1Goal;
    }

    public Float getSp2Goal() {
        return sp2Goal;
    }

    public void setSp2Goal(Float sp2Goal) {
        this.sp2Goal = sp2Goal;
    }

    public Float getSp3Goal() {
        return sp3Goal;
    }

    public void setSp3Goal(Float sp3Goal) {
        this.sp3Goal = sp3Goal;
    }

    public Float getSp4Goal() {
        return sp4Goal;
    }

    public void setSp4Goal(Float sp4Goal) {
        this.sp4Goal = sp4Goal;
    }

    public Float getSp5Goal() {
        return sp5Goal;
    }

    public void setSp5Goal(Float sp5Goal) {
        this.sp5Goal = sp5Goal;
    }

    public Float getSp6Goal() {
        return sp6Goal;
    }

    public void setSp6Goal(Float sp6Goal) {
        this.sp6Goal = sp6Goal;
    }

    public Float getSp7Goal() {
        return sp7Goal;
    }

    public void setSp7Goal(Float sp7Goal) {
        this.sp7Goal = sp7Goal;
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