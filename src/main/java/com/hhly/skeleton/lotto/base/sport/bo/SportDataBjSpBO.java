package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

public class SportDataBjSpBO {
    /**
     *
     */
    private Long id;

    /**
     * 竞技彩对阵详情表ID
     */
    private Long sportAgainstInfoId;

    /**
     * 总进球0SP值
     */
    private Float sp0Goal;

    /**
     * 总进球1SP值
     */
    private Float sp1Goal;

    /**
     * 总进球2SP
     */
    private Float sp2Goal;

    /**
     * 总进球3SP
     */
    private Float sp3Goal;

    /**
     * 总进球4SP
     */
    private Float sp4Goal;

    /**
     * 总进球5SP
     */
    private Float sp5Goal;

    /**
     * 总进球6SP
     */
    private Float sp6Goal;

    /**
     * 总进球7+SP
     */
    private Float sp7Goal;

    /**
     * SP胜胜
     */
    private Float spWW;

    /**
     * SP胜平
     */
    private Float spWD;

    /**
     * SP胜负
     */
    private Float spWF;

    /**
     * SP平胜
     */
    private Float spDW;

    /**
     * SP平平
     */
    private Float spDD;

    /**
     * SP平负
     */
    private Float spDF;

    /**
     * SP负胜
     */
    private Float spFW;

    /**
     * SP负平
     */
    private Float spFD;

    /**
     * SP负负
     */
    private Float spFF;

    /**
     * SP1:0
     */
    private Float sp10;

    /**
     * SP2:0
     */
    private Float sp20;

    /**
     * SP2:1
     */
    private Float sp21;

    /**
     * SP3:0
     */
    private Float sp30;

    /**
     * SP3:1
     */
    private Float sp31;

    /**
     * SP3:2
     */
    private Float sp32;

    /**
     * SP4:0
     */
    private Float sp40;

    /**
     * SP4:1
     */
    private Float sp41;

    /**
     * SP4:2
     */
    private Float sp42;

    /**
     * SP胜其它
     */
    private Float spWOther;

    /**
     * SP0:0
     */
    private Float sp00;

    /**
     * SP1:1
     */
    private Float sp11;

    /**
     * SP2:2
     */
    private Float sp22;

    /**
     * SP3:3
     */
    private Float sp33;

    /**
     * SP平其它
     */
    private Float spDOther;

    /**
     * SP0:1
     */
    private Float sp01;

    /**
     * SP0:2
     */
    private Float sp02;

    /**
     * SP1:2
     */
    private Float sp12;

    /**
     * SP0:3
     */
    private Float sp03;

    /**
     * SP1:3
     */
    private Float sp13;

    /**
     * SP2:3
     */
    private Float sp23;

    /**
     * SP0:4
     */
    private Float sp04;

    /**
     * SP1:4
     */
    private Float sp14;

    /**
     * SP2:4
     */
    private Float sp24;

    /**
     * 负其它
     */
    private Float spFOther;

    /**
     * SP上单
     */
    private Float spUpSingle;

    /**
     * SP上双
     */
    private Float spUpDouble;

    /**
     * SP下单
     */
    private Float spDownSingle;

    /**
     * SP下双
     */
    private Float spDownDouble;

    /**
     * 让球值；例如：-1
     */
    private Float letNum;

    /**
     * 胜的赔率；例如：2.21
     */
    private Float spWin;

    /**
     * 平的赔率；例如：2.21
     */
    private Float spDraw;

    /**
     * 负的赔率；例如：2.21
     */
    private Float spFail;

    /**
     * 让分值
     */
    private Float letScore;

    /**
     * SP主胜
     */
    private Float spWinWf;

    /**
     * SP主负
     */
    private Float spFailWf;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
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

    public Float getSpUpSingle() {
        return spUpSingle;
    }

    public void setSpUpSingle(Float spUpSingle) {
        this.spUpSingle = spUpSingle;
    }

    public Float getSpUpDouble() {
        return spUpDouble;
    }

    public void setSpUpDouble(Float spUpDouble) {
        this.spUpDouble = spUpDouble;
    }

    public Float getSpDownSingle() {
        return spDownSingle;
    }

    public void setSpDownSingle(Float spDownSingle) {
        this.spDownSingle = spDownSingle;
    }

    public Float getSpDownDouble() {
        return spDownDouble;
    }

    public void setSpDownDouble(Float spDownDouble) {
        this.spDownDouble = spDownDouble;
    }

    public Float getLetNum() {
        return letNum;
    }

    public void setLetNum(Float letNum) {
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

    public Float getLetScore() {
        return letScore;
    }

    public void setLetScore(Float letScore) {
        this.letScore = letScore;
    }

    public Float getSpWinWf() {
        return spWinWf;
    }

    public void setSpWinWf(Float spWinWf) {
        this.spWinWf = spWinWf;
    }

    public Float getSpFailWf() {
        return spFailWf;
    }

    public void setSpFailWf(Float spFailWf) {
        this.spFailWf = spFailWf;
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