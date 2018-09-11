package com.hhly.skeleton.lotto.base.sport.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description 世界杯冠军、冠亚军前端展示BO
 * @Author longguoyou
 * @Date 2018/3/20 16:45
 * @Since 1.8
 */

public class GjDataBO extends BaseBO {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 彩期
     */
    private String issueCode;
    /**
     * 夺冠概率
     */
    private String gl;
    /**
     * 冠军国家队
     */
    private String homeName;
    /**
     * 亚军国家队
     */
    private String visitiName;
    /**
     * 赛事名称
     */
    private String matchName;
    /**
     * 赛事状态
     */
    private Integer matchStatus;
    /**
     * 赔率
     */
    private String sp;
    /**
     * 系统编号
     */
    private String systemCode;
    /**
     * 冠军队编号
     */
    private Integer homeTeamId;
    /**
     * 亚军队编号
     */
    private Integer visitiTeamId;
    /**
     * 冠军队LOGO
     */
    private String homeLogo;
    /**
     * 亚军队LOGO
     */
    private String visitiLogo;
    /**
     * 主队资料库id（一比分）
     */
    private String homeId;
    /**
     * 客队资料库id（一比分）
     */
    private String guestId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public String getGl() {
        return gl;
    }

    public void setGl(String gl) {
        this.gl = gl;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getVisitiName() {
        return visitiName;
    }

    public void setVisitiName(String visitiName) {
        this.visitiName = visitiName;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getVisitiTeamId() {
        return visitiTeamId;
    }

    public void setVisitiTeamId(Integer visitiTeamId) {
        this.visitiTeamId = visitiTeamId;
    }

    public String getHomeLogo() {
        return homeLogo;
    }

    public void setHomeLogo(String homeLogo) {
        this.homeLogo = homeLogo;
    }

    public String getVisitiLogo() {
        return visitiLogo;
    }

    public void setVisitiLogo(String visitiLogo) {
        this.visitiLogo = visitiLogo;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }
}
