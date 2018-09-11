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

 * @date 2017年2月7日 上午10:17:52

 * @desc  竞彩足球【比分进球数】业务实体
 *
 */
public class SportDataFbScoreBO extends BaseBO {
    private static final long serialVersionUID = 8927567956398664787L;
    @JsonIgnore
    private Long id;
    @JsonIgnore
    private Long sportAgainstInfoId;
    /** 比分 1:0 的 赔率*/
    @JsonProperty("10")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp10;
    /** 比分 2:0 的 赔率*/
    @JsonProperty("20")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp20;
    /** 比分 2:1 的 赔率*/
    @JsonProperty("21")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp21;
    /** 比分 3:0 的 赔率*/
    @JsonProperty("30")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp30;
    /** 比分 3:1 的 赔率*/
    @JsonProperty("31")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp31;
    /** 比分 3:2 的 赔率*/
    @JsonProperty("32")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp32;
    /** 比分 4:0 的 赔率*/
    @JsonProperty("40")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp40;
    /** 比分 4:1 的 赔率*/
    @JsonProperty("41")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp41;
    /** 比分 4:2 的 赔率*/
    @JsonProperty("42")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp42;
    /** 比分 5:0 的 赔率*/
    @JsonProperty("50")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp50;
    /** 比分 5:1 的 赔率*/
    @JsonProperty("51")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp51;
    /** 比分 5:2 的 赔率*/
    @JsonProperty("52")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp52;
    /** 胜其它 赔率*/
    @JsonProperty("w-other")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWOther;
    /** 比分 0:0 的 赔率*/
    @JsonProperty("00")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp00;
    /** 比分 1:1 的 赔率*/
    @JsonProperty("11")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp11;
    /** 比分 2:2 的 赔率*/
    @JsonProperty("22")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp22;
    /** 比分 3:3 的 赔率*/
    @JsonProperty("33")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp33;
    /** 平其它 赔率*/
    @JsonProperty("d-other")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDOther;
    /** 比分 0:1 的 赔率*/
    @JsonProperty("01")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp01;
    /** 比分 0:2 的 赔率*/
    @JsonProperty("02")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp02;
    /** 比分 1:2 的 赔率*/
    @JsonProperty("12")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp12;
    /** 比分 0:3 的 赔率*/
    @JsonProperty("03")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp03;
    /** 比分 1:3 的 赔率*/
    @JsonProperty("13")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp13;
    /** 比分 2:3 的 赔率*/
    @JsonProperty("23")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp23;
    /** 比分 0:4 的 赔率*/
    @JsonProperty("04")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp04;
    /** 比分 1:4 的 赔率*/
    @JsonProperty("14")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp14;
    /** 比分 2:4 的 赔率*/
    @JsonProperty("24")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp24;
    /** 比分 0:5 的 赔率*/
    @JsonProperty("05")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp05;
    /** 比分 1:5 的 赔率*/
    @JsonProperty("15")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp15;
    /** 比分 2:5 的 赔率*/
    @JsonProperty("25")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp25;
    /** 负其它 赔率*/
    @JsonProperty("l-other")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFOther;

    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer single;

    @JsonIgnore
    private Date releaseTime;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private Date createTime;

    public SportDataFbScoreBO() {
    }

    public SportDataFbScoreBO(Float sp10, Float sp20, Float sp21, Float sp30, Float sp31, Float sp32, Float sp40, Float sp41, Float sp42, Float sp50, Float sp51, Float sp52, Float spWOther, Float sp00, Float sp11, Float sp22, Float sp33, Float spDOther, Float sp01, Float sp02, Float sp12, Float sp03, Float sp13, Float sp23, Float sp04, Float sp14, Float sp24, Float sp05, Float sp15, Float sp25, Float spFOther, Integer single) {
        this.sp10 = sp10;
        this.sp20 = sp20;
        this.sp21 = sp21;
        this.sp30 = sp30;
        this.sp31 = sp31;
        this.sp32 = sp32;
        this.sp40 = sp40;
        this.sp41 = sp41;
        this.sp42 = sp42;
        this.sp50 = sp50;
        this.sp51 = sp51;
        this.sp52 = sp52;
        this.spWOther = spWOther;
        this.sp00 = sp00;
        this.sp11 = sp11;
        this.sp22 = sp22;
        this.sp33 = sp33;
        this.spDOther = spDOther;
        this.sp01 = sp01;
        this.sp02 = sp02;
        this.sp12 = sp12;
        this.sp03 = sp03;
        this.sp13 = sp13;
        this.sp23 = sp23;
        this.sp04 = sp04;
        this.sp14 = sp14;
        this.sp24 = sp24;
        this.sp05 = sp05;
        this.sp15 = sp15;
        this.sp25 = sp25;
        this.spFOther = spFOther;
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

    public Float getSp10() {
        return sp10;
    }

    public void setSp10(Float sp10) {
        this.sp10 = sp10;
    }

    public Float getSp20() {
        return sp20;
    }

    public void setSp20(Float sp20) {
        this.sp20 = sp20;
    }

    public Float getSp21() {
        return sp21;
    }

    public void setSp21(Float sp21) {
        this.sp21 = sp21;
    }

    public Float getSp30() {
        return sp30;
    }

    public void setSp30(Float sp30) {
        this.sp30 = sp30;
    }

    public Float getSp31() {
        return sp31;
    }

    public void setSp31(Float sp31) {
        this.sp31 = sp31;
    }

    public Float getSp32() {
        return sp32;
    }

    public void setSp32(Float sp32) {
        this.sp32 = sp32;
    }

    public Float getSp40() {
        return sp40;
    }

    public void setSp40(Float sp40) {
        this.sp40 = sp40;
    }

    public Float getSp41() {
        return sp41;
    }

    public void setSp41(Float sp41) {
        this.sp41 = sp41;
    }

    public Float getSp42() {
        return sp42;
    }

    public void setSp42(Float sp42) {
        this.sp42 = sp42;
    }

    public Float getSp50() {
        return sp50;
    }

    public void setSp50(Float sp50) {
        this.sp50 = sp50;
    }

    public Float getSp51() {
        return sp51;
    }

    public void setSp51(Float sp51) {
        this.sp51 = sp51;
    }

    public Float getSp52() {
        return sp52;
    }

    public void setSp52(Float sp52) {
        this.sp52 = sp52;
    }

    public Float getSpWOther() {
        return spWOther;
    }

    public void setSpWOther(Float spWOther) {
        this.spWOther = spWOther;
    }

    public Float getSp00() {
        return sp00;
    }

    public void setSp00(Float sp00) {
        this.sp00 = sp00;
    }

    public Float getSp11() {
        return sp11;
    }

    public void setSp11(Float sp11) {
        this.sp11 = sp11;
    }

    public Float getSp22() {
        return sp22;
    }

    public void setSp22(Float sp22) {
        this.sp22 = sp22;
    }

    public Float getSp33() {
        return sp33;
    }

    public void setSp33(Float sp33) {
        this.sp33 = sp33;
    }

    public Float getSpDOther() {
        return spDOther;
    }

    public void setSpDOther(Float spDOther) {
        this.spDOther = spDOther;
    }

    public Float getSp01() {
        return sp01;
    }

    public void setSp01(Float sp01) {
        this.sp01 = sp01;
    }

    public Float getSp02() {
        return sp02;
    }

    public void setSp02(Float sp02) {
        this.sp02 = sp02;
    }

    public Float getSp12() {
        return sp12;
    }

    public void setSp12(Float sp12) {
        this.sp12 = sp12;
    }

    public Float getSp03() {
        return sp03;
    }

    public void setSp03(Float sp03) {
        this.sp03 = sp03;
    }

    public Float getSp13() {
        return sp13;
    }

    public void setSp13(Float sp13) {
        this.sp13 = sp13;
    }

    public Float getSp23() {
        return sp23;
    }

    public void setSp23(Float sp23) {
        this.sp23 = sp23;
    }

    public Float getSp04() {
        return sp04;
    }

    public void setSp04(Float sp04) {
        this.sp04 = sp04;
    }

    public Float getSp14() {
        return sp14;
    }

    public void setSp14(Float sp14) {
        this.sp14 = sp14;
    }

    public Float getSp24() {
        return sp24;
    }

    public void setSp24(Float sp24) {
        this.sp24 = sp24;
    }

    public Float getSp05() {
        return sp05;
    }

    public void setSp05(Float sp05) {
        this.sp05 = sp05;
    }

    public Float getSp15() {
        return sp15;
    }

    public void setSp15(Float sp15) {
        this.sp15 = sp15;
    }

    public Float getSp25() {
        return sp25;
    }

    public void setSp25(Float sp25) {
        this.sp25 = sp25;
    }

    public Float getSpFOther() {
        return spFOther;
    }

    public void setSpFOther(Float spFOther) {
        this.spFOther = spFOther;
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