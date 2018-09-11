package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class BBTechStat extends BaseBO {
    private static final long serialVersionUID = 1L;

    private String matchKind;//-1近10场，1常规，2季后，3季前
    private String shootRate;//命中率
    private String threeminRate;//三分率
    private String twominRate;//二分率
    private String punishRate;//罚球率
    private String avgRebound;//平均篮板
    private String avgHelpattack;//平均助攻
    private String avgRob;//平均抢断
    private String avgMisplay;//平均失误

    public String getMatchKind() {
        return matchKind;
    }

    public void setMatchKind(String matchKind) {
        this.matchKind = matchKind;
    }

    public String getShootRate() {
        return shootRate;
    }

    public void setShootRate(String shootRate) {
        this.shootRate = shootRate;
    }

    public String getThreeminRate() {
        return threeminRate;
    }

    public void setThreeminRate(String threeminRate) {
        this.threeminRate = threeminRate;
    }

    public String getTwominRate() {
        return twominRate;
    }

    public void setTwominRate(String twominRate) {
        this.twominRate = twominRate;
    }

    public String getPunishRate() {
        return punishRate;
    }

    public void setPunishRate(String punishRate) {
        this.punishRate = punishRate;
    }

    public String getAvgRebound() {
        return avgRebound;
    }

    public void setAvgRebound(String avgRebound) {
        this.avgRebound = avgRebound;
    }

    public String getAvgHelpattack() {
        return avgHelpattack;
    }

    public void setAvgHelpattack(String avgHelpattack) {
        this.avgHelpattack = avgHelpattack;
    }

    public String getAvgRob() {
        return avgRob;
    }

    public void setAvgRob(String avgRob) {
        this.avgRob = avgRob;
    }

    public String getAvgMisplay() {
        return avgMisplay;
    }

    public void setAvgMisplay(String avgMisplay) {
        this.avgMisplay = avgMisplay;
    }


}
