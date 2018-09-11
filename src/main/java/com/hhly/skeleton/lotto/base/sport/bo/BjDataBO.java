package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 北京单场展示BO
 * @date 2017/7/6.
 * @company 益彩网络科技有限公司
 */
public class BjDataBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 北京单场官方编号
     */
    private String bjNum;

    /**
     * 销售时间
     */
    private String saleDate;

    /**
     * 是否是5大联赛
     */
    @JsonProperty("f_l")
    private Integer fiveLeague;

    /**
     * 赛事类别
     */
    @JsonProperty("m_t")
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
    private Float spLetWdf;

    /**
     * 总进球数SP值
     */
    private Float spGoalNum;

    /**
     * 半全场胜平负SP值
     */
    private Float spHfWdf;

    /**
     * 上下盘单双SP值
     */
    private Float spUdSd;

    /**
     * 单场比分SP值
     */
    private Float spScore;

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
     * 进球数SP值
     */
    private String[] goals;

    /**
     * 半全场sp值
     */
    private String[] hfwdfs;

    /**
     * 胜其他sp值
     */
    private String[] wins;

    /**
     * 平其他sp值
     */
    private String[] draws;

    /**
     * 负其他sp值
     */
    private String[] losts;

    /**
     * 上下盘单双sp值
     */
    private String[] uds;

    /**
     * 胜平负sp值
     */
    private String[] wdfs;

    /**
     * 胜负过关sp值
     */
    private String[] sfs;


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

    public Float getSpLetWdf() {
        return spLetWdf;
    }

    public void setSpLetWdf(Float spLetWdf) {
        this.spLetWdf = spLetWdf;
    }

    public Float getSpGoalNum() {
        return spGoalNum;
    }

    public void setSpGoalNum(Float spGoalNum) {
        this.spGoalNum = spGoalNum;
    }

    public Float getSpHfWdf() {
        return spHfWdf;
    }

    public void setSpHfWdf(Float spHfWdf) {
        this.spHfWdf = spHfWdf;
    }

    public Float getSpUdSd() {
        return spUdSd;
    }

    public void setSpUdSd(Float spUdSd) {
        this.spUdSd = spUdSd;
    }

    public Float getSpScore() {
        return spScore;
    }

    public void setSpScore(Float spScore) {
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


    public String[] getGoals() {
        return goals;
    }

    public void setGoals(String[] goals) {
        this.goals = goals;
    }

    public String[] getHfwdfs() {
        return hfwdfs;
    }

    public void setHfwdfs(String[] hfwdfs) {
        this.hfwdfs = hfwdfs;
    }

    public String[] getWins() {
        return wins;
    }

    public void setWins(String[] wins) {
        this.wins = wins;
    }

    public String[] getDraws() {
        return draws;
    }

    public void setDraws(String[] draws) {
        this.draws = draws;
    }

    public String[] getLosts() {
        return losts;
    }

    public void setLosts(String[] losts) {
        this.losts = losts;
    }

    public String[] getUds() {
        return uds;
    }

    public void setUds(String[] uds) {
        this.uds = uds;
    }

    public String[] getWdfs() {
        return wdfs;
    }

    public void setWdfs(String[] wdfs) {
        this.wdfs = wdfs;
    }

    public String[] getSfs() {
        return sfs;
    }

    public void setSfs(String[] sfs) {
        this.sfs = sfs;
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


    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "bjNum='" + bjNum + '\'' +
                ", halfScore='" + halfScore + '\'' +
                ", fullScore='" + fullScore + '\'' +
                ", letWdf=" + letWdf +
                ", goalNum=" + goalNum +
                ", hfWdf='" + hfWdf + '\'' +
                ", udSd=" + udSd +
                ", score='" + score + '\'' +
                ", spLetWdf=" + spLetWdf +
                ", spGoalNum=" + spGoalNum +
                ", spHfWdf=" + spHfWdf +
                ", spUdSd=" + spUdSd +
                ", spScore=" + spScore +
                ", drawTime=" + drawTime +
                ", letSf='" + letSf + '\'' +
                ", spLetSf='" + spLetSf + '\'' +
                ", statusLetWdf=" + statusLetWdf +
                ", statusGoal=" + statusGoal +
                ", statusHfWdf=" + statusHfWdf +
                ", statusUdSd=" + statusUdSd +
                ", statusScore=" + statusScore +
                ", statusLetWf=" + statusLetWf +
                ", goals=" + Arrays.toString(goals) +
                ", hfwdfs=" + Arrays.toString(hfwdfs) +
                ", wins=" + Arrays.toString(wins) +
                ", draws=" + Arrays.toString(draws) +
                ", losts=" + Arrays.toString(losts) +
                ", uds=" + Arrays.toString(uds) +
                ", wdfs=" + Arrays.toString(wdfs) +
                ", sfs=" + Arrays.toString(sfs) +
                '}';
    }
}
