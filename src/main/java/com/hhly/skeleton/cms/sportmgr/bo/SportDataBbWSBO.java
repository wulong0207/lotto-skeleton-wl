package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBbWSBO extends BaseBO {
    private static final long serialVersionUID = -7745007623273958300L;
    private Long id;

    private Long sportAgainstInfoId;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail15;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail610;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail1115;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail1620;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail2125;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail26;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin15;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin610;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin1115;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin1620;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin2125;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin26;


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

    public Float getSpFail15() {
        return spFail15;
    }

    public void setSpFail15(Float spFail15) {
        this.spFail15 = spFail15;
    }

    public Float getSpFail610() {
        return spFail610;
    }

    public void setSpFail610(Float spFail610) {
        this.spFail610 = spFail610;
    }

    public Float getSpFail1115() {
        return spFail1115;
    }

    public void setSpFail1115(Float spFail1115) {
        this.spFail1115 = spFail1115;
    }

    public Float getSpFail1620() {
        return spFail1620;
    }

    public void setSpFail1620(Float spFail1620) {
        this.spFail1620 = spFail1620;
    }

    public Float getSpFail2125() {
        return spFail2125;
    }

    public void setSpFail2125(Float spFail2125) {
        this.spFail2125 = spFail2125;
    }

    public Float getSpFail26() {
        return spFail26;
    }

    public void setSpFail26(Float spFail26) {
        this.spFail26 = spFail26;
    }

    public Float getSpWin15() {
        return spWin15;
    }

    public void setSpWin15(Float spWin15) {
        this.spWin15 = spWin15;
    }

    public Float getSpWin610() {
        return spWin610;
    }

    public void setSpWin610(Float spWin610) {
        this.spWin610 = spWin610;
    }

    public Float getSpWin1115() {
        return spWin1115;
    }

    public void setSpWin1115(Float spWin1115) {
        this.spWin1115 = spWin1115;
    }

    public Float getSpWin1620() {
        return spWin1620;
    }

    public void setSpWin1620(Float spWin1620) {
        this.spWin1620 = spWin1620;
    }

    public Float getSpWin2125() {
        return spWin2125;
    }

    public void setSpWin2125(Float spWin2125) {
        this.spWin2125 = spWin2125;
    }

    public Float getSpWin26() {
        return spWin26;
    }

    public void setSpWin26(Float spWin26) {
        this.spWin26 = spWin26;
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