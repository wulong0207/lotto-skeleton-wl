package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;
/**
 * 
 * @author longguoyou

 * @date 2017年2月7日 上午10:12:17

 * @desc 竞彩足球【总进球】业务实体
 *
 */
public class SportDataFbGoalBO extends BaseBO {
    private static final long serialVersionUID = -3707841402495113006L;
    private Long id;
    private Long sportAgainstInfoId;
    
    /** 总进球数0的SP值 */
    @JsonProperty("0")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp0Goal;
    /** 总进球数1的SP值 */
    @JsonProperty("1")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp1Goal;
    /** 总进球数2的SP值 */
    @JsonProperty("2")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp2Goal;
    /** 总进球数3的SP值 */
    @JsonProperty("3")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp3Goal;
    /** 总进球数4的SP值 */
    @JsonProperty("4")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp4Goal;
    /** 总进球数5的SP值 */
    @JsonProperty("5")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp5Goal;
    /** 总进球数6的SP值 */
    @JsonProperty("6")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp6Goal;
    /** 总进球数7以及以上的SP值 */
    @JsonProperty("7")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp7Goal;

    private Date releaseTime;
    private Date updateTime;
    private Date createTime;

    public SportDataFbGoalBO(Float sp0Goal, Float sp1Goal, Float sp2Goal, Float sp3Goal, Float sp4Goal, Float sp5Goal, Float sp6Goal, Float sp7Goal) {
        this.sp0Goal = sp0Goal;
        this.sp1Goal = sp1Goal;
        this.sp2Goal = sp2Goal;
        this.sp3Goal = sp3Goal;
        this.sp4Goal = sp4Goal;
        this.sp5Goal = sp5Goal;
        this.sp6Goal = sp6Goal;
        this.sp7Goal = sp7Goal;
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