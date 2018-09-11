package com.hhly.skeleton.lotto.base.sport.bo;


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

 * @date 2017年2月7日 上午10:10:39

 * @desc  竞彩足球【半全场胜平负】业务实体
 *
 */

public class SportDataFbHfWDFBO extends BaseBO {
    private static final long serialVersionUID = -6476922621312389510L;
    @JsonIgnore
    private Long id;
    @JsonIgnore
    private Long sportAgainstInfoId;
    
    /**赔率 胜胜*/
    @JsonProperty("ww")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWW;
    /**赔率 胜平*/
    @JsonProperty("wd")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWD;
    /**赔率 胜负*/
    @JsonProperty("wf")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWF;
    /**赔率 平胜*/
    @JsonProperty("dw")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDW;
    /**赔率 平平*/
    @JsonProperty("dd")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDD;
    /**赔率 平负*/
    @JsonProperty("df")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDF;
    /**赔率 负胜*/
    @JsonProperty("fw")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFW;
    /**赔率 负平*/
    @JsonProperty("fd")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFD;
    /**赔率 负负*/
    @JsonProperty("ff")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFF;
    /**
     * 是否单关0否1是
     */
    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer single;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonIgnore
    private Date releaseTime;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private Date createTime;


    public SportDataFbHfWDFBO() {
    }

    /**
     * 前端显示SP值
     *
     * @param spWW
     * @param spWD
     * @param spWF
     * @param spDW
     * @param spDD
     * @param spDF
     * @param spFW
     * @param spFD
     * @param spFF
     * @param single
     */
    public SportDataFbHfWDFBO(Float spWW, Float spWD, Float spWF, Float spDW, Float spDD, Float spDF, Float spFW, Float spFD, Float spFF, Integer single) {
        this.spWW = spWW;
        this.spWD = spWD;
        this.spWF = spWF;
        this.spDW = spDW;
        this.spDD = spDD;
        this.spDF = spDF;
        this.spFW = spFW;
        this.spFD = spFD;
        this.spFF = spFF;
        this.single = single;
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

    public Float getSpWW() {
        return spWW;
    }

    public void setSpWW(Float spWW) {
        this.spWW = spWW;
    }

    public Float getSpWD() {
        return spWD;
    }

    public void setSpWD(Float spWD) {
        this.spWD = spWD;
    }

    public Float getSpWF() {
        return spWF;
    }

    public void setSpWF(Float spWF) {
        this.spWF = spWF;
    }

    public Float getSpDW() {
        return spDW;
    }

    public void setSpDW(Float spDW) {
        this.spDW = spDW;
    }

    public Float getSpDD() {
        return spDD;
    }

    public void setSpDD(Float spDD) {
        this.spDD = spDD;
    }

    public Float getSpDF() {
        return spDF;
    }

    public void setSpDF(Float spDF) {
        this.spDF = spDF;
    }

    public Float getSpFW() {
        return spFW;
    }

    public void setSpFW(Float spFW) {
        this.spFW = spFW;
    }

    public Float getSpFD() {
        return spFD;
    }

    public void setSpFD(Float spFD) {
        this.spFD = spFD;
    }

    public Float getSpFF() {
        return spFF;
    }

    public void setSpFF(Float spFF) {
        this.spFF = spFF;
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