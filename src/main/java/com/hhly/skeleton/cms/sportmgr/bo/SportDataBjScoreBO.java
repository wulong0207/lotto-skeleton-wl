package com.hhly.skeleton.cms.sportmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

public class SportDataBjScoreBO extends BaseBO{
    private static final long serialVersionUID = 9183868850679850737L;
    private Long id;

    private Long sportAgainstInfoId;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp10;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp20;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp21;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp30;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp31;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp32;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp40;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp41;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp42;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spWOther;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp00;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp11;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp22;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp33;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spDOther;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp01;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp02;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp12;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp03;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp13;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp23;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp04;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp14;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float sp24;

    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float spFOther;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date releaseTime;


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


}