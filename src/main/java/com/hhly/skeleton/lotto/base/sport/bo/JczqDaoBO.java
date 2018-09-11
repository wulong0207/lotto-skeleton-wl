package com.hhly.skeleton.lotto.base.sport.bo;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @auth lgs on
 * @date 2017/2/24.
 * @desc 竞彩足球持久层BO
 * @compay 益彩网络科技有限公司
 * @vsersion 1.0
 */
public class JczqDaoBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 彩期销售时间
     */
    private String saleDate;

    /**
     * 是否是5大联赛
     */
    private Integer fiveLeague;

    /**
     * 半场比分
     */
    private String halfScore;

    /**
     * 全场比分
     */
    private String fullScore;

    /**
     * 全场胜平负
     */
    private String fullSpf;
    /**
     * 让分胜平负
     */
    private String letSpf;
    /**
     * 比分玩法结果
     */
    private String scoreResult;
    /**
     * 进球数
     */
    private String goalNum;
    /**
     * 半全场胜平负
     */
    private String hfWdf;


    private Integer statusWdf;

    private Integer statusLetWdf;

    private Integer statusGoal;

    private Integer statusHfWdf;

    private Integer statusScore;

    private Short newestLetNum;

    private Float newestLetSpWin;

    private Float newestLetSpDraw;

    private Float newestLetSpFail;

    private Float newestSpWin;

    private Float newestSpDraw;

    private Float newestSpFail;

    private Float newestSp0Goal;

    private Float newestSp1Goal;

    private Float newestSp2Goal;

    private Float newestSp3Goal;

    private Float newestSp4Goal;

    private Float newestSp5Goal;

    private Float newestSp6Goal;

    private Float newestSp7Goal;

    private Float newestSpWW;

    private Float newestSpWD;

    private Float newestSpWF;

    private Float newestSpDW;

    private Float newestSpDD;

    private Float newestSpDF;

    private Float newestSpFW;

    private Float newestSpFD;

    private Float newestSpFF;

    private Float newestSp10;

    private Float newestSp20;

    private Float newestSp21;

    private Float newestSp30;

    private Float newestSp31;

    private Float newestSp32;

    private Float newestSp40;

    private Float newestSp41;

    private Float newestSp42;

    private Float newestSp50;

    private Float newestSp51;

    private Float newestSp52;

    private Float newestSpWOther;

    private Float newestSp00;

    private Float newestSp11;

    private Float newestSp22;

    private Float newestSp33;

    private Float newestSpDOther;

    private Float newestSp01;

    private Float newestSp02;

    private Float newestSp12;

    private Float newestSp03;

    private Float newestSp13;

    private Float newestSp23;

    private Float newestSp04;

    private Float newestSp14;

    private Float newestSp24;

    private Float newestSp05;

    private Float newestSp15;

    private Float newestSp25;

    private Float newestSpFOther;
    
//    private String systemCode;
//
//
//    public String getSystemCode() {
//		return systemCode;
//	}
//
//	public void setSystemCode(String systemCode) {
//		this.systemCode = systemCode;
//	}

	public String getHalfScore() {
        return halfScore;
    }

    public void setHalfScore(String halfScore) {
        this.halfScore = halfScore;
    }

    public String getFullSpf() {
        return fullSpf;
    }

    public void setFullSpf(String fullSpf) {
        this.fullSpf = fullSpf;
    }

    public String getLetSpf() {
        return letSpf;
    }

    public void setLetSpf(String letSpf) {
        this.letSpf = letSpf;
    }

    public String getScoreResult() {
        return scoreResult;
    }

    public void setScoreResult(String scoreResult) {
        this.scoreResult = scoreResult;
    }

    public String getGoalNum() {
        return goalNum;
    }

    public void setGoalNum(String goalNum) {
        this.goalNum = goalNum;
    }

    public String getHfWdf() {
        return hfWdf;
    }

    public void setHfWdf(String hfWdf) {
        this.hfWdf = hfWdf;
    }

    public Integer getFiveLeague() {
        return fiveLeague;
    }

    public void setFiveLeague(Integer fiveLeague) {
        this.fiveLeague = fiveLeague;
    }

    public Integer getStatusWdf() {
        return statusWdf;
    }

    public void setStatusWdf(Integer statusWdf) {
        this.statusWdf = statusWdf;
    }

    public Integer getStatusLetWdf() {
        return statusLetWdf;
    }

    public void setStatusLetWdf(Integer statusLetWdf) {
        this.statusLetWdf = statusLetWdf;
    }

    public Integer getStatusGoal() {
        return statusGoal;
    }

    public void setStatusGoal(Integer statusGoal) {
        this.statusGoal = statusGoal;
    }

    public Integer getStatusHfWdf() {
        return statusHfWdf;
    }

    public void setStatusHfWdf(Integer statusHfWdf) {
        this.statusHfWdf = statusHfWdf;
    }

    public Integer getStatusScore() {
        return statusScore;
    }

    public void setStatusScore(Integer statusScore) {
        this.statusScore = statusScore;
    }

    public Short getNewestLetNum() {
        return newestLetNum;
    }

    public void setNewestLetNum(Short newestLetNum) {
        this.newestLetNum = newestLetNum;
    }

    public Float getNewestLetSpWin() {
        return newestLetSpWin;
    }

    public void setNewestLetSpWin(Float newestLetSpWin) {
        this.newestLetSpWin = newestLetSpWin;
    }

    public Float getNewestLetSpDraw() {
        return newestLetSpDraw;
    }

    public void setNewestLetSpDraw(Float newestLetSpDraw) {
        this.newestLetSpDraw = newestLetSpDraw;
    }

    public Float getNewestLetSpFail() {
        return newestLetSpFail;
    }

    public void setNewestLetSpFail(Float newestLetSpFail) {
        this.newestLetSpFail = newestLetSpFail;
    }

    public Float getNewestSpWin() {
        return newestSpWin;
    }

    public void setNewestSpWin(Float newestSpWin) {
        this.newestSpWin = newestSpWin;
    }

    public Float getNewestSpDraw() {
        return newestSpDraw;
    }

    public void setNewestSpDraw(Float newestSpDraw) {
        this.newestSpDraw = newestSpDraw;
    }

    public Float getNewestSpFail() {
        return newestSpFail;
    }

    public void setNewestSpFail(Float newestSpFail) {
        this.newestSpFail = newestSpFail;
    }

    public Float getNewestSp0Goal() {
        return newestSp0Goal;
    }

    public void setNewestSp0Goal(Float newestSp0Goal) {
        this.newestSp0Goal = newestSp0Goal;
    }

    public Float getNewestSp1Goal() {
        return newestSp1Goal;
    }

    public void setNewestSp1Goal(Float newestSp1Goal) {
        this.newestSp1Goal = newestSp1Goal;
    }

    public Float getNewestSp2Goal() {
        return newestSp2Goal;
    }

    public void setNewestSp2Goal(Float newestSp2Goal) {
        this.newestSp2Goal = newestSp2Goal;
    }

    public Float getNewestSp3Goal() {
        return newestSp3Goal;
    }

    public void setNewestSp3Goal(Float newestSp3Goal) {
        this.newestSp3Goal = newestSp3Goal;
    }

    public Float getNewestSp4Goal() {
        return newestSp4Goal;
    }

    public void setNewestSp4Goal(Float newestSp4Goal) {
        this.newestSp4Goal = newestSp4Goal;
    }

    public Float getNewestSp5Goal() {
        return newestSp5Goal;
    }

    public void setNewestSp5Goal(Float newestSp5Goal) {
        this.newestSp5Goal = newestSp5Goal;
    }

    public Float getNewestSp6Goal() {
        return newestSp6Goal;
    }

    public void setNewestSp6Goal(Float newestSp6Goal) {
        this.newestSp6Goal = newestSp6Goal;
    }

    public Float getNewestSp7Goal() {
        return newestSp7Goal;
    }

    public void setNewestSp7Goal(Float newestSp7Goal) {
        this.newestSp7Goal = newestSp7Goal;
    }

    public Float getNewestSpWW() {
        return newestSpWW;
    }

    public void setNewestSpWW(Float newestSpWW) {
        this.newestSpWW = newestSpWW;
    }

    public Float getNewestSpWD() {
        return newestSpWD;
    }

    public void setNewestSpWD(Float newestSpWD) {
        this.newestSpWD = newestSpWD;
    }

    public Float getNewestSpWF() {
        return newestSpWF;
    }

    public void setNewestSpWF(Float newestSpWF) {
        this.newestSpWF = newestSpWF;
    }

    public Float getNewestSpDW() {
        return newestSpDW;
    }

    public void setNewestSpDW(Float newestSpDW) {
        this.newestSpDW = newestSpDW;
    }

    public Float getNewestSpDD() {
        return newestSpDD;
    }

    public void setNewestSpDD(Float newestSpDD) {
        this.newestSpDD = newestSpDD;
    }

    public Float getNewestSpDF() {
        return newestSpDF;
    }

    public void setNewestSpDF(Float newestSpDF) {
        this.newestSpDF = newestSpDF;
    }

    public Float getNewestSpFW() {
        return newestSpFW;
    }

    public void setNewestSpFW(Float newestSpFW) {
        this.newestSpFW = newestSpFW;
    }

    public Float getNewestSpFD() {
        return newestSpFD;
    }

    public void setNewestSpFD(Float newestSpFD) {
        this.newestSpFD = newestSpFD;
    }

    public Float getNewestSpFF() {
        return newestSpFF;
    }

    public void setNewestSpFF(Float newestSpFF) {
        this.newestSpFF = newestSpFF;
    }

    public Float getNewestSp10() {
        return newestSp10;
    }

    public void setNewestSp10(Float newestSp10) {
        this.newestSp10 = newestSp10;
    }

    public Float getNewestSp20() {
        return newestSp20;
    }

    public void setNewestSp20(Float newestSp20) {
        this.newestSp20 = newestSp20;
    }

    public Float getNewestSp21() {
        return newestSp21;
    }

    public void setNewestSp21(Float newestSp21) {
        this.newestSp21 = newestSp21;
    }

    public Float getNewestSp30() {
        return newestSp30;
    }

    public void setNewestSp30(Float newestSp30) {
        this.newestSp30 = newestSp30;
    }

    public Float getNewestSp31() {
        return newestSp31;
    }

    public void setNewestSp31(Float newestSp31) {
        this.newestSp31 = newestSp31;
    }

    public Float getNewestSp32() {
        return newestSp32;
    }

    public void setNewestSp32(Float newestSp32) {
        this.newestSp32 = newestSp32;
    }

    public Float getNewestSp40() {
        return newestSp40;
    }

    public void setNewestSp40(Float newestSp40) {
        this.newestSp40 = newestSp40;
    }

    public Float getNewestSp41() {
        return newestSp41;
    }

    public void setNewestSp41(Float newestSp41) {
        this.newestSp41 = newestSp41;
    }

    public Float getNewestSp42() {
        return newestSp42;
    }

    public void setNewestSp42(Float newestSp42) {
        this.newestSp42 = newestSp42;
    }

    public Float getNewestSp50() {
        return newestSp50;
    }

    public void setNewestSp50(Float newestSp50) {
        this.newestSp50 = newestSp50;
    }

    public Float getNewestSp51() {
        return newestSp51;
    }

    public void setNewestSp51(Float newestSp51) {
        this.newestSp51 = newestSp51;
    }

    public Float getNewestSp52() {
        return newestSp52;
    }

    public void setNewestSp52(Float newestSp52) {
        this.newestSp52 = newestSp52;
    }

    public Float getNewestSpWOther() {
        return newestSpWOther;
    }

    public void setNewestSpWOther(Float newestSpWOther) {
        this.newestSpWOther = newestSpWOther;
    }

    public Float getNewestSp00() {
        return newestSp00;
    }

    public void setNewestSp00(Float newestSp00) {
        this.newestSp00 = newestSp00;
    }

    public Float getNewestSp11() {
        return newestSp11;
    }

    public void setNewestSp11(Float newestSp11) {
        this.newestSp11 = newestSp11;
    }

    public Float getNewestSp22() {
        return newestSp22;
    }

    public void setNewestSp22(Float newestSp22) {
        this.newestSp22 = newestSp22;
    }

    public Float getNewestSp33() {
        return newestSp33;
    }

    public void setNewestSp33(Float newestSp33) {
        this.newestSp33 = newestSp33;
    }

    public Float getNewestSpDOther() {
        return newestSpDOther;
    }

    public void setNewestSpDOther(Float newestSpDOther) {
        this.newestSpDOther = newestSpDOther;
    }

    public Float getNewestSp01() {
        return newestSp01;
    }

    public void setNewestSp01(Float newestSp01) {
        this.newestSp01 = newestSp01;
    }

    public Float getNewestSp02() {
        return newestSp02;
    }

    public void setNewestSp02(Float newestSp02) {
        this.newestSp02 = newestSp02;
    }

    public Float getNewestSp12() {
        return newestSp12;
    }

    public void setNewestSp12(Float newestSp12) {
        this.newestSp12 = newestSp12;
    }

    public Float getNewestSp03() {
        return newestSp03;
    }

    public void setNewestSp03(Float newestSp03) {
        this.newestSp03 = newestSp03;
    }

    public Float getNewestSp13() {
        return newestSp13;
    }

    public void setNewestSp13(Float newestSp13) {
        this.newestSp13 = newestSp13;
    }

    public Float getNewestSp23() {
        return newestSp23;
    }

    public void setNewestSp23(Float newestSp23) {
        this.newestSp23 = newestSp23;
    }

    public Float getNewestSp04() {
        return newestSp04;
    }

    public void setNewestSp04(Float newestSp04) {
        this.newestSp04 = newestSp04;
    }

    public Float getNewestSp14() {
        return newestSp14;
    }

    public void setNewestSp14(Float newestSp14) {
        this.newestSp14 = newestSp14;
    }

    public Float getNewestSp24() {
        return newestSp24;
    }

    public void setNewestSp24(Float newestSp24) {
        this.newestSp24 = newestSp24;
    }

    public Float getNewestSp05() {
        return newestSp05;
    }

    public void setNewestSp05(Float newestSp05) {
        this.newestSp05 = newestSp05;
    }

    public Float getNewestSp15() {
        return newestSp15;
    }

    public void setNewestSp15(Float newestSp15) {
        this.newestSp15 = newestSp15;
    }

    public Float getNewestSp25() {
        return newestSp25;
    }

    public void setNewestSp25(Float newestSp25) {
        this.newestSp25 = newestSp25;
    }

    public Float getNewestSpFOther() {
        return newestSpFOther;
    }

    public void setNewestSpFOther(Float newestSpFOther) {
        this.newestSpFOther = newestSpFOther;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("saleDate", saleDate)
                .append("fiveLeague", fiveLeague)
                .append("halfScore", halfScore)
                .append("fullScore", fullScore)
                .append("fullSpf", fullSpf)
                .append("letSpf", letSpf)
                .append("scoreResult", scoreResult)
                .append("goalNum", goalNum)
                .append("hfWdf", hfWdf)
                .append("statusWdf", statusWdf)
                .append("statusLetWdf", statusLetWdf)
                .append("statusGoal", statusGoal)
                .append("statusHfWdf", statusHfWdf)
                .append("statusScore", statusScore)
                .append("newestLetNum", newestLetNum)
                .append("newestLetSpWin", newestLetSpWin)
                .append("newestLetSpDraw", newestLetSpDraw)
                .append("newestLetSpFail", newestLetSpFail)
                .append("newestSpWin", newestSpWin)
                .append("newestSpDraw", newestSpDraw)
                .append("newestSpFail", newestSpFail)
                .append("newestSp0Goal", newestSp0Goal)
                .append("newestSp1Goal", newestSp1Goal)
                .append("newestSp2Goal", newestSp2Goal)
                .append("newestSp3Goal", newestSp3Goal)
                .append("newestSp4Goal", newestSp4Goal)
                .append("newestSp5Goal", newestSp5Goal)
                .append("newestSp6Goal", newestSp6Goal)
                .append("newestSp7Goal", newestSp7Goal)
                .append("newestSpWW", newestSpWW)
                .append("newestSpWD", newestSpWD)
                .append("newestSpWF", newestSpWF)
                .append("newestSpDW", newestSpDW)
                .append("newestSpDD", newestSpDD)
                .append("newestSpDF", newestSpDF)
                .append("newestSpFW", newestSpFW)
                .append("newestSpFD", newestSpFD)
                .append("newestSpFF", newestSpFF)
                .append("newestSp10", newestSp10)
                .append("newestSp20", newestSp20)
                .append("newestSp21", newestSp21)
                .append("newestSp30", newestSp30)
                .append("newestSp31", newestSp31)
                .append("newestSp32", newestSp32)
                .append("newestSp40", newestSp40)
                .append("newestSp41", newestSp41)
                .append("newestSp42", newestSp42)
                .append("newestSp50", newestSp50)
                .append("newestSp51", newestSp51)
                .append("newestSp52", newestSp52)
                .append("newestSpWOther", newestSpWOther)
                .append("newestSp00", newestSp00)
                .append("newestSp11", newestSp11)
                .append("newestSp22", newestSp22)
                .append("newestSp33", newestSp33)
                .append("newestSpDOther", newestSpDOther)
                .append("newestSp01", newestSp01)
                .append("newestSp02", newestSp02)
                .append("newestSp12", newestSp12)
                .append("newestSp03", newestSp03)
                .append("newestSp13", newestSp13)
                .append("newestSp23", newestSp23)
                .append("newestSp04", newestSp04)
                .append("newestSp14", newestSp14)
                .append("newestSp24", newestSp24)
                .append("newestSp05", newestSp05)
                .append("newestSp15", newestSp15)
                .append("newestSp25", newestSp25)
                .append("newestSpFOther", newestSpFOther)
                .toString();
    }
}
