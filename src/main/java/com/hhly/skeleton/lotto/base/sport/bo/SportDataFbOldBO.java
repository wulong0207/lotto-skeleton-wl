package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
/**
 * 
 * @author longguoyou

 * @date 2017年2月7日 上午10:15:59

 * @desc 竞彩足球(老足彩)【胜平负半全场】业务实体
 *
 */
public class SportDataFbOldBO extends BaseBO {
    private static final long serialVersionUID = -5049384019125067284L;
    private Long id;
    private Long sportAgainstInfoId;
    
    /** 胜的SP值 */
    private Float spWin;
    /** 平的SP值 */
    private Float spDraw;
    /** 负的SP值 */
    private Float spFail;

    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer single;

    private Short spType;
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
}