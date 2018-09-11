package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class BBScheduleOdds extends BaseBO {
    private static final long serialVersionUID = 1L;
    private int scheduleId;//赛事id
    //公司id，以让球公司为主：(1澳门,2易胜博,3皇冠,8bet365,9韦德,101浩博);大小球：(4,5,6,11,12,201);欧赔：(265,6,458,214,82,471);
    private int companyId;
    private String euHomeOdds;//即时欧赔主队
    private String euGuestOdds;//即时欧赔客队

    private String letHomeOdds;//即时让球主队
    private String letGoal;//即时让球盘口
    private String letGuestOdds;//即时让球客队

    private String letHalfHomeOdds;//即时让球半场主队
    private String letHalfGoal;//即时让球半场盘口
    private String letHalfGuestOdds;//即时让球半场客队

    private String totHomeOdds;//即时大小球主队
    private String totScore;//即时大小球盘口
    private String totGuestOdds;//即时大小球客队

    private String totHalfHomeOdds;//即时大小球半场主队
    private String totHalfScore;//即时大小球半场盘口
    private String totHalfGuestOdds;//即时大小球半场客队

    private String ceuHomeOdds;//初盘欧赔主队
    private String ceuGuestOdds;//初盘欧赔客队

    private String cletHomeOdds;//初盘让球主队
    private String cletGoal;//初盘让球盘口
    private String cletGuestOdds;//初盘让球客队

    private String cletHalfHomeOdds;//初盘让球半场主队
    private String cletHalfGoal;//初盘让球半场盘口
    private String cletHalfGuestOdds;//初盘让球半场客队

    private String ctotHomeOdds;//初盘大小球主队
    private String ctotScore;//初盘大小球盘口
    private String ctotGuestOdds;//初盘大小球客队

    private String ctotHalfHomeOdds;//初盘大小球半场主队
    private String ctotHalfScore;//初盘大小球半场盘口
    private String ctotHalfGuestOdds;//初盘大小球半场客队

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getEuHomeOdds() {
        return euHomeOdds;
    }

    public void setEuHomeOdds(String euHomeOdds) {
        this.euHomeOdds = euHomeOdds;
    }

    public String getEuGuestOdds() {
        return euGuestOdds;
    }

    public void setEuGuestOdds(String euGuestOdds) {
        this.euGuestOdds = euGuestOdds;
    }

    public String getLetHomeOdds() {
        return letHomeOdds;
    }

    public void setLetHomeOdds(String letHomeOdds) {
        this.letHomeOdds = letHomeOdds;
    }

    public String getLetGoal() {
        return letGoal;
    }

    public void setLetGoal(String letGoal) {
        this.letGoal = letGoal;
    }

    public String getLetGuestOdds() {
        return letGuestOdds;
    }

    public void setLetGuestOdds(String letGuestOdds) {
        this.letGuestOdds = letGuestOdds;
    }

    public String getLetHalfHomeOdds() {
        return letHalfHomeOdds;
    }

    public void setLetHalfHomeOdds(String letHalfHomeOdds) {
        this.letHalfHomeOdds = letHalfHomeOdds;
    }

    public String getLetHalfGoal() {
        return letHalfGoal;
    }

    public void setLetHalfGoal(String letHalfGoal) {
        this.letHalfGoal = letHalfGoal;
    }

    public String getLetHalfGuestOdds() {
        return letHalfGuestOdds;
    }

    public void setLetHalfGuestOdds(String letHalfGuestOdds) {
        this.letHalfGuestOdds = letHalfGuestOdds;
    }

    public String getTotHomeOdds() {
        return totHomeOdds;
    }

    public void setTotHomeOdds(String totHomeOdds) {
        this.totHomeOdds = totHomeOdds;
    }

    public String getTotScore() {
        return totScore;
    }

    public void setTotScore(String totScore) {
        this.totScore = totScore;
    }

    public String getTotGuestOdds() {
        return totGuestOdds;
    }

    public void setTotGuestOdds(String totGuestOdds) {
        this.totGuestOdds = totGuestOdds;
    }

    public String getTotHalfHomeOdds() {
        return totHalfHomeOdds;
    }

    public void setTotHalfHomeOdds(String totHalfHomeOdds) {
        this.totHalfHomeOdds = totHalfHomeOdds;
    }

    public String getTotHalfScore() {
        return totHalfScore;
    }

    public void setTotHalfScore(String totHalfScore) {
        this.totHalfScore = totHalfScore;
    }

    public String getTotHalfGuestOdds() {
        return totHalfGuestOdds;
    }

    public void setTotHalfGuestOdds(String totHalfGuestOdds) {
        this.totHalfGuestOdds = totHalfGuestOdds;
    }

    public String getCeuHomeOdds() {
        return ceuHomeOdds;
    }

    public void setCeuHomeOdds(String ceuHomeOdds) {
        this.ceuHomeOdds = ceuHomeOdds;
    }

    public String getCeuGuestOdds() {
        return ceuGuestOdds;
    }

    public void setCeuGuestOdds(String ceuGuestOdds) {
        this.ceuGuestOdds = ceuGuestOdds;
    }

    public String getCletHomeOdds() {
        return cletHomeOdds;
    }

    public void setCletHomeOdds(String cletHomeOdds) {
        this.cletHomeOdds = cletHomeOdds;
    }

    public String getCletGoal() {
        return cletGoal;
    }

    public void setCletGoal(String cletGoal) {
        this.cletGoal = cletGoal;
    }

    public String getCletGuestOdds() {
        return cletGuestOdds;
    }

    public void setCletGuestOdds(String cletGuestOdds) {
        this.cletGuestOdds = cletGuestOdds;
    }

    public String getCletHalfHomeOdds() {
        return cletHalfHomeOdds;
    }

    public void setCletHalfHomeOdds(String cletHalfHomeOdds) {
        this.cletHalfHomeOdds = cletHalfHomeOdds;
    }

    public String getCletHalfGoal() {
        return cletHalfGoal;
    }

    public void setCletHalfGoal(String cletHalfGoal) {
        this.cletHalfGoal = cletHalfGoal;
    }

    public String getCletHalfGuestOdds() {
        return cletHalfGuestOdds;
    }

    public void setCletHalfGuestOdds(String cletHalfGuestOdds) {
        this.cletHalfGuestOdds = cletHalfGuestOdds;
    }

    public String getCtotHomeOdds() {
        return ctotHomeOdds;
    }

    public void setCtotHomeOdds(String ctotHomeOdds) {
        this.ctotHomeOdds = ctotHomeOdds;
    }

    public String getCtotScore() {
        return ctotScore;
    }

    public void setCtotScore(String ctotScore) {
        this.ctotScore = ctotScore;
    }

    public String getCtotGuestOdds() {
        return ctotGuestOdds;
    }

    public void setCtotGuestOdds(String ctotGuestOdds) {
        this.ctotGuestOdds = ctotGuestOdds;
    }

    public String getCtotHalfHomeOdds() {
        return ctotHalfHomeOdds;
    }

    public void setCtotHalfHomeOdds(String ctotHalfHomeOdds) {
        this.ctotHalfHomeOdds = ctotHalfHomeOdds;
    }

    public String getCtotHalfScore() {
        return ctotHalfScore;
    }

    public void setCtotHalfScore(String ctotHalfScore) {
        this.ctotHalfScore = ctotHalfScore;
    }

    public String getCtotHalfGuestOdds() {
        return ctotHalfGuestOdds;
    }

    public void setCtotHalfGuestOdds(String ctotHalfGuestOdds) {
        this.ctotHalfGuestOdds = ctotHalfGuestOdds;
    }


}
