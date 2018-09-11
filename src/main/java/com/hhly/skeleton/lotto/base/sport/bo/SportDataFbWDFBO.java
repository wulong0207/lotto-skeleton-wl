package com.hhly.skeleton.lotto.base.sport.bo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;
/**
 * 
 * @author longguoyou

 * @date 2017年2月7日 上午10:32:41

 * @desc 竞彩足球【胜平负/让胜平负】业务实体
 *
 */
public class SportDataFbWDFBO extends BaseBO {
    private static final long serialVersionUID = -159039654847159963L;
    @JsonIgnore
    private Long id;
    @JsonIgnore
    private Long sportAgainstInfoId;
    /** 让球值 */
    @JsonProperty("let_goal")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Short letNum;
    /** 胜的SP */
    @JsonProperty("w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWin;
    /** 平的SP */
    @JsonProperty("d")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDraw;
    /** 负的SP */
    @JsonProperty("f")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFail;
    /** 是否让球 */
    @JsonIgnore
    private Short spType;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("u_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonIgnore
    private Date updateTime;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonIgnore
    private Date createTime;

    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer single;

    public SportDataFbWDFBO() {
    }

    /**
     * 前端展示SP值
     *
     * @param spWin
     * @param spDraw
     * @param spFail
     * @param single
     */
    public SportDataFbWDFBO(Float spWin, Float spDraw, Float spFail, Integer single) {
        this.spWin = spWin;
        this.spDraw = spDraw;
        this.spFail = spFail;
        this.single = single;
    }

    /**
     * 让球SP值
     *
     * @param letNum
     * @param spWin
     * @param spDraw
     * @param spFail
     * @param single
     */
    public SportDataFbWDFBO(Short letNum, Float spWin, Float spDraw, Float spFail, Integer single) {
        this(spWin, spDraw, spFail, single);
        this.letNum = letNum;

    }

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

    public Integer getSingle() {
        return single;
    }

    public void setSingle(Integer single) {
        this.single = single;
    }
}