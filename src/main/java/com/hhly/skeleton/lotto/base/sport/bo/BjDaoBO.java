package com.hhly.skeleton.lotto.base.sport.bo;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 北京单场数据层BO
 * @date 2017/7/6.
 * @company 益彩网络科技有限公司
 */
public class BjDaoBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 北京单场官方编号
     */
    private String bjNum;

    /**
     * 是否是5大联赛
     */
    private Integer fiveLeague;

    /**
     * 销售时间
     */
    private String saleDate;

    /**
     * 赛事类别
     */
    private Long matchType;

    /**
     * 半场比分；例如： 1:1
     */
    private String halfScore;

    /**
     * 全场比分；例如： 2:1
     */
    private String fullScore;

    /**
     * 让球胜平负；0：负；1：平；3：胜
     */
    private String letWdf;

    /**
     * 大于等于7 时为  7
     */
    private String goalNum;

    /**
     * 可能值为33;31;30;13;11;10;03;01;00;3：胜；1：平；0：负
     */
    private String hfWdf;

    /**
     * 1：上单；2：上双；3：下单；4：下双；  例如： 4 解释：下盘：进球数小于等于2；上盘：进球数大于2单双：进球总数的单双；
     */
    private String udSd;

    /**
     * 10：1:0 ；20：2:0； 21：2:1； 30：3:0； 31：3:1； 32：3:2； 40：4:0； 41：4:1 ；42：4:2 ；90：胜其它；00： 0:0； 11：1:1； 22：2:2； 33：3:3；99：平其它；01：0:1 ；02：0:2； 12：1:2 ；03：0:3； 13：1:3； 23：2:3； 04：0:4； 14：1:4 ；24：2:4 ；09：负其它；
     */
    private String score;

    /**
     * 让球胜平负SP值
     */
    private Double spLetWdf;

    /**
     * 总进球数SP值
     */
    private Double spGoalNum;

    /**
     * 半全场胜平负SP值
     */
    private Double spHfWdf;

    /**
     * 上下盘单双SP值
     */
    private Double spUdSd;

    /**
     * 单场比分SP值
     */
    private Double spScore;

    /**
     * 开奖时间
     */
    private Date drawTime;


    /**
     * 胜负过关彩果
     */
    private String letSf;


    /**
     * 胜负过关sp开奖值
     */
    private String spLetSf;

    /**
     * 1：正常销售；2：暂停销售 让球胜平负玩法
     */
    private Integer statusLetWdf;

    /**
     * 1：正常销售；2：暂停销售 总进球数玩法
     */
    private Integer statusGoal;

    /**
     * 1：正常销售；2：暂停销售 半全场胜平负玩法
     */
    private Integer statusHfWdf;

    /**
     * 1：正常销售；2：暂停销售 上下盘单双玩法
     */
    private Integer statusUdSd;

    /**
     * 1：正常销售；2：暂停销售 单场比分固定玩法
     */
    private Integer statusScore;

    /**
     * 1：正常销售；2：暂停销售  胜负过关状态玩法
     */
    private Integer statusLetWf;

    /**
     * 总进球0SP值
     */
    private Double sp0Goal;

    /**
     * 总进球1SP值
     */
    private Double sp1Goal;

    /**
     * 总进球2SP
     */
    private Double sp2Goal;

    /**
     * 总进球3SP
     */
    private Double sp3Goal;

    /**
     * 总进球4SP
     */
    private Double sp4Goal;

    /**
     * 总进球5SP
     */
    private Double sp5Goal;

    /**
     * 总进球6SP
     */
    private Double sp6Goal;

    /**
     * 总进球7+SP
     */
    private Double sp7Goal;

    /**
     * SP胜胜
     */
    private Double spWW;

    /**
     * SP胜平
     */
    private Double spWD;

    /**
     * SP胜负
     */
    private Double spWF;

    /**
     * SP平胜
     */
    private Double spDW;

    /**
     * SP平平
     */
    private Double spDD;

    /**
     * SP平负
     */
    private Double spDF;

    /**
     * SP负胜
     */
    private Double spFW;

    /**
     * SP负平
     */
    private Double spFD;

    /**
     * SP负负
     */
    private Double spFF;

    /**
     * SP1:0
     */
    private Double sp10;

    /**
     * SP2:0
     */
    private Double sp20;

    /**
     * SP2:1
     */
    private Double sp21;

    /**
     * SP3:0
     */
    private Double sp30;

    /**
     * SP3:1
     */
    private Double sp31;

    /**
     * SP3:2
     */
    private Double sp32;

    /**
     * SP4:0
     */
    private Double sp40;

    /**
     * SP4:1
     */
    private Double sp41;

    /**
     * SP4:2
     */
    private Double sp42;

    /**
     * SP胜其它
     */
    private Double spWOther;

    /**
     * SP0:0
     */
    private Double sp00;

    /**
     * SP1:1
     */
    private Double sp11;

    /**
     * SP2:2
     */
    private Double sp22;

    /**
     * SP3:3
     */
    private Double sp33;

    /**
     * SP平其它
     */
    private Double spDOther;

    /**
     * SP0:1
     */
    private Double sp01;

    /**
     * SP0:2
     */
    private Double sp02;

    /**
     * SP1:2
     */
    private Double sp12;

    /**
     * SP0:3
     */
    private Double sp03;

    /**
     * SP1:3
     */
    private Double sp13;

    /**
     * SP2:3
     */
    private Double sp23;

    /**
     * SP0:4
     */
    private Double sp04;

    /**
     * SP1:4
     */
    private Double sp14;

    /**
     * SP2:4
     */
    private Double sp24;

    /**
     * 负其它
     */
    private Double spFOther;

    /**
     * SP上单
     */
    private Double spUpSingle;

    /**
     * SP上双
     */
    private Double spUpDouble;

    /**
     * SP下单
     */
    private Double spDownSingle;

    /**
     * SP下双
     */
    private Double spDownDouble;

    /**
     * 让球值；例如：-1
     */
    private Double letNum;

    /**
     * 胜的赔率；例如：2.21
     */
    private Double spWin;

    /**
     * 平的赔率；例如：2.21
     */
    private Double spDraw;

    /**
     * 负的赔率；例如：2.21
     */
    private Double spFail;

    /**
     * 让分值
     */
    private Double letScore;

    /**
     * SP主胜
     */
    private Double spWinWf;

    /**
     * SP主负
     */
    private Double spFailWf;

    public Integer getFiveLeague() {
        return fiveLeague;
    }

    public void setFiveLeague(Integer fiveLeague) {
        this.fiveLeague = fiveLeague;
    }

    public String getBjNum() {
        return bjNum;
    }

    public void setBjNum(String bjNum) {
        this.bjNum = bjNum;
    }

    public Long getMatchType() {
        return matchType;
    }

    public void setMatchType(Long matchType) {
        this.matchType = matchType;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getHalfScore() {
        return halfScore;
    }

    public void setHalfScore(String halfScore) {
        this.halfScore = halfScore;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getLetWdf() {
        return letWdf;
    }

    public void setLetWdf(String letWdf) {
        this.letWdf = letWdf;
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

    public String getUdSd() {
        return udSd;
    }

    public void setUdSd(String udSd) {
        this.udSd = udSd;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Double getSpLetWdf() {
        return spLetWdf;
    }

    public void setSpLetWdf(Double spLetWdf) {
        this.spLetWdf = spLetWdf;
    }

    public Double getSpGoalNum() {
        return spGoalNum;
    }

    public void setSpGoalNum(Double spGoalNum) {
        this.spGoalNum = spGoalNum;
    }

    public Double getSpHfWdf() {
        return spHfWdf;
    }

    public void setSpHfWdf(Double spHfWdf) {
        this.spHfWdf = spHfWdf;
    }

    public Double getSpUdSd() {
        return spUdSd;
    }

    public void setSpUdSd(Double spUdSd) {
        this.spUdSd = spUdSd;
    }

    public Double getSpScore() {
        return spScore;
    }

    public void setSpScore(Double spScore) {
        this.spScore = spScore;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
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

    public Integer getStatusUdSd() {
        return statusUdSd;
    }

    public void setStatusUdSd(Integer statusUdSd) {
        this.statusUdSd = statusUdSd;
    }

    public Integer getStatusScore() {
        return statusScore;
    }

    public void setStatusScore(Integer statusScore) {
        this.statusScore = statusScore;
    }

    public Integer getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Integer statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

    public Double getSp0Goal() {
        return sp0Goal;
    }

    public void setSp0Goal(Double sp0Goal) {
        this.sp0Goal = sp0Goal;
    }

    public Double getSp1Goal() {
        return sp1Goal;
    }

    public void setSp1Goal(Double sp1Goal) {
        this.sp1Goal = sp1Goal;
    }

    public Double getSp2Goal() {
        return sp2Goal;
    }

    public void setSp2Goal(Double sp2Goal) {
        this.sp2Goal = sp2Goal;
    }

    public Double getSp3Goal() {
        return sp3Goal;
    }

    public void setSp3Goal(Double sp3Goal) {
        this.sp3Goal = sp3Goal;
    }

    public Double getSp4Goal() {
        return sp4Goal;
    }

    public void setSp4Goal(Double sp4Goal) {
        this.sp4Goal = sp4Goal;
    }

    public Double getSp5Goal() {
        return sp5Goal;
    }

    public void setSp5Goal(Double sp5Goal) {
        this.sp5Goal = sp5Goal;
    }

    public Double getSp6Goal() {
        return sp6Goal;
    }

    public void setSp6Goal(Double sp6Goal) {
        this.sp6Goal = sp6Goal;
    }

    public Double getSp7Goal() {
        return sp7Goal;
    }

    public void setSp7Goal(Double sp7Goal) {
        this.sp7Goal = sp7Goal;
    }

    public Double getSpWW() {
        return spWW;
    }

    public void setSpWW(Double spWW) {
        this.spWW = spWW;
    }

    public Double getSpWD() {
        return spWD;
    }

    public void setSpWD(Double spWD) {
        this.spWD = spWD;
    }

    public Double getSpWF() {
        return spWF;
    }

    public void setSpWF(Double spWF) {
        this.spWF = spWF;
    }

    public Double getSpDW() {
        return spDW;
    }

    public void setSpDW(Double spDW) {
        this.spDW = spDW;
    }

    public Double getSpDD() {
        return spDD;
    }

    public void setSpDD(Double spDD) {
        this.spDD = spDD;
    }

    public Double getSpDF() {
        return spDF;
    }

    public void setSpDF(Double spDF) {
        this.spDF = spDF;
    }

    public Double getSpFW() {
        return spFW;
    }

    public void setSpFW(Double spFW) {
        this.spFW = spFW;
    }

    public Double getSpFD() {
        return spFD;
    }

    public void setSpFD(Double spFD) {
        this.spFD = spFD;
    }

    public Double getSpFF() {
        return spFF;
    }

    public void setSpFF(Double spFF) {
        this.spFF = spFF;
    }

    public Double getSp10() {
        return sp10;
    }

    public void setSp10(Double sp10) {
        this.sp10 = sp10;
    }

    public Double getSp20() {
        return sp20;
    }

    public void setSp20(Double sp20) {
        this.sp20 = sp20;
    }

    public Double getSp21() {
        return sp21;
    }

    public void setSp21(Double sp21) {
        this.sp21 = sp21;
    }

    public Double getSp30() {
        return sp30;
    }

    public void setSp30(Double sp30) {
        this.sp30 = sp30;
    }

    public Double getSp31() {
        return sp31;
    }

    public void setSp31(Double sp31) {
        this.sp31 = sp31;
    }

    public Double getSp32() {
        return sp32;
    }

    public void setSp32(Double sp32) {
        this.sp32 = sp32;
    }

    public Double getSp40() {
        return sp40;
    }

    public void setSp40(Double sp40) {
        this.sp40 = sp40;
    }

    public Double getSp41() {
        return sp41;
    }

    public void setSp41(Double sp41) {
        this.sp41 = sp41;
    }

    public Double getSp42() {
        return sp42;
    }

    public void setSp42(Double sp42) {
        this.sp42 = sp42;
    }

    public Double getSpWOther() {
        return spWOther;
    }

    public void setSpWOther(Double spWOther) {
        this.spWOther = spWOther;
    }

    public Double getSp00() {
        return sp00;
    }

    public void setSp00(Double sp00) {
        this.sp00 = sp00;
    }

    public Double getSp11() {
        return sp11;
    }

    public void setSp11(Double sp11) {
        this.sp11 = sp11;
    }

    public Double getSp22() {
        return sp22;
    }

    public void setSp22(Double sp22) {
        this.sp22 = sp22;
    }

    public Double getSp33() {
        return sp33;
    }

    public void setSp33(Double sp33) {
        this.sp33 = sp33;
    }

    public Double getSpDOther() {
        return spDOther;
    }

    public void setSpDOther(Double spDOther) {
        this.spDOther = spDOther;
    }

    public Double getSp01() {
        return sp01;
    }

    public void setSp01(Double sp01) {
        this.sp01 = sp01;
    }

    public Double getSp02() {
        return sp02;
    }

    public void setSp02(Double sp02) {
        this.sp02 = sp02;
    }

    public Double getSp12() {
        return sp12;
    }

    public void setSp12(Double sp12) {
        this.sp12 = sp12;
    }

    public Double getSp03() {
        return sp03;
    }

    public void setSp03(Double sp03) {
        this.sp03 = sp03;
    }

    public Double getSp13() {
        return sp13;
    }

    public void setSp13(Double sp13) {
        this.sp13 = sp13;
    }

    public Double getSp23() {
        return sp23;
    }

    public void setSp23(Double sp23) {
        this.sp23 = sp23;
    }

    public Double getSp04() {
        return sp04;
    }

    public void setSp04(Double sp04) {
        this.sp04 = sp04;
    }

    public Double getSp14() {
        return sp14;
    }

    public void setSp14(Double sp14) {
        this.sp14 = sp14;
    }

    public Double getSp24() {
        return sp24;
    }

    public void setSp24(Double sp24) {
        this.sp24 = sp24;
    }

    public Double getSpFOther() {
        return spFOther;
    }

    public void setSpFOther(Double spFOther) {
        this.spFOther = spFOther;
    }

    public Double getSpUpSingle() {
        return spUpSingle;
    }

    public void setSpUpSingle(Double spUpSingle) {
        this.spUpSingle = spUpSingle;
    }

    public Double getSpUpDouble() {
        return spUpDouble;
    }

    public void setSpUpDouble(Double spUpDouble) {
        this.spUpDouble = spUpDouble;
    }

    public Double getSpDownSingle() {
        return spDownSingle;
    }

    public void setSpDownSingle(Double spDownSingle) {
        this.spDownSingle = spDownSingle;
    }

    public Double getSpDownDouble() {
        return spDownDouble;
    }

    public void setSpDownDouble(Double spDownDouble) {
        this.spDownDouble = spDownDouble;
    }

    public Double getLetNum() {
        return letNum;
    }

    public void setLetNum(Double letNum) {
        this.letNum = letNum;
    }

    public Double getSpWin() {
        return spWin;
    }

    public void setSpWin(Double spWin) {
        this.spWin = spWin;
    }

    public Double getSpDraw() {
        return spDraw;
    }

    public void setSpDraw(Double spDraw) {
        this.spDraw = spDraw;
    }

    public Double getSpFail() {
        return spFail;
    }

    public void setSpFail(Double spFail) {
        this.spFail = spFail;
    }

    public Double getLetScore() {
        return letScore;
    }

    public void setLetScore(Double letScore) {
        this.letScore = letScore;
    }

    public Double getSpWinWf() {
        return spWinWf;
    }

    public void setSpWinWf(Double spWinWf) {
        this.spWinWf = spWinWf;
    }

    public Double getSpFailWf() {
        return spFailWf;
    }

    public void setSpFailWf(Double spFailWf) {
        this.spFailWf = spFailWf;
    }

    public String getLetSf() {
        return letSf;
    }

    public void setLetSf(String letSf) {
        this.letSf = letSf;
    }

    public String getSpLetSf() {
        return spLetSf;
    }

    public void setSpLetSf(String spLetSf) {
        this.spLetSf = spLetSf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("bjNum", bjNum)
                .append("halfScore", halfScore)
                .append("fullScore", fullScore)
                .append("letWdf", letWdf)
                .append("goalNum", goalNum)
                .append("hfWdf", hfWdf)
                .append("udSd", udSd)
                .append("score", score)
                .append("spLetWdf", spLetWdf)
                .append("spGoalNum", spGoalNum)
                .append("spHfWdf", spHfWdf)
                .append("spUdSd", spUdSd)
                .append("spScore", spScore)
                .append("drawTime", drawTime)
                .append("letSf", letSf)
                .append("spLetSf", spLetSf)
                .append("statusLetWdf", statusLetWdf)
                .append("statusGoal", statusGoal)
                .append("statusHfWdf", statusHfWdf)
                .append("statusUdSd", statusUdSd)
                .append("statusScore", statusScore)
                .append("statusLetWf", statusLetWf)
                .append("sp0Goal", sp0Goal)
                .append("sp1Goal", sp1Goal)
                .append("sp2Goal", sp2Goal)
                .append("sp3Goal", sp3Goal)
                .append("sp4Goal", sp4Goal)
                .append("sp5Goal", sp5Goal)
                .append("sp6Goal", sp6Goal)
                .append("sp7Goal", sp7Goal)
                .append("spWW", spWW)
                .append("spWD", spWD)
                .append("spWF", spWF)
                .append("spDW", spDW)
                .append("spDD", spDD)
                .append("spDF", spDF)
                .append("spFW", spFW)
                .append("spFD", spFD)
                .append("spFF", spFF)
                .append("sp10", sp10)
                .append("sp20", sp20)
                .append("sp21", sp21)
                .append("sp30", sp30)
                .append("sp31", sp31)
                .append("sp32", sp32)
                .append("sp40", sp40)
                .append("sp41", sp41)
                .append("sp42", sp42)
                .append("spWOther", spWOther)
                .append("sp00", sp00)
                .append("sp11", sp11)
                .append("sp22", sp22)
                .append("sp33", sp33)
                .append("spDOther", spDOther)
                .append("sp01", sp01)
                .append("sp02", sp02)
                .append("sp12", sp12)
                .append("sp03", sp03)
                .append("sp13", sp13)
                .append("sp23", sp23)
                .append("sp04", sp04)
                .append("sp14", sp14)
                .append("sp24", sp24)
                .append("spFOther", spFOther)
                .append("spUpSingle", spUpSingle)
                .append("spUpDouble", spUpDouble)
                .append("spDownSingle", spDownSingle)
                .append("spDownDouble", spDownDouble)
                .append("letNum", letNum)
                .append("spWin", spWin)
                .append("spDraw", spDraw)
                .append("spFail", spFail)
                .append("letScore", letScore)
                .append("spWinWf", spWinWf)
                .append("spFailWf", spFailWf)
                .toString();
    }
}
