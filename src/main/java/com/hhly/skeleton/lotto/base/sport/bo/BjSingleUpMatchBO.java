package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 北单单式上传对阵BO
 * @date 2017/6/23.
 * @company 益彩网络科技有限公司
 */
public class BjSingleUpMatchBO extends BaseBO {
    public static final long serialVersionUID = 1L;

    /**
     * 对阵id
     */
    private Long id;

    /**
     * 彩种Code
     */
    @JsonIgnore
    private String lotteryCode;

    /**
     * 彩期Code
     */
    private String issueCode;

    /**
     * 赛事id
     */
    @JsonProperty("m_id")
    private Long sportMatchInfoId;

    /**
     * 系统编号
     */
    @JsonProperty("systemCode")
    private String systemCode;


    /**
     * 赛事全称
     */
    @JsonProperty("m_f_name")
    private String matchFullName;

    /**
     * 赛事简称
     */
    @JsonProperty("m_s_name")
    private String matchShortName;

    /**
     * 主队名全称
     */
    @JsonProperty("h_f_name")
    private String homeFullName;
    /**
     * 主队名简称
     */
    @JsonProperty("h_s_name")
    private String homeShortName;

    /**
     * 客队名全称
     */
    @JsonProperty("g_f_name")
    private String guestFullName;
    /**
     * 客队名简称
     */
    @JsonProperty("g_s_name")
    private String guestShortName;

    /**
     * 赛事状态
     */
    private Short matchStatus;


    /**
     * 比赛日期
     */
    private String date;

    /**
     * 比赛时间
     */
    private String time;

    /**
     * 销售截止时间
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date saleEndTime;

    /**
     * 销售截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date saleEndDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public Long getSportMatchInfoId() {
        return sportMatchInfoId;
    }

    public void setSportMatchInfoId(Long sportMatchInfoId) {
        this.sportMatchInfoId = sportMatchInfoId;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getMatchFullName() {
        return matchFullName;
    }

    public void setMatchFullName(String matchFullName) {
        this.matchFullName = matchFullName;
    }

    public String getMatchShortName() {
        return matchShortName;
    }

    public void setMatchShortName(String matchShortName) {
        this.matchShortName = matchShortName;
    }

    public String getHomeFullName() {
        return homeFullName;
    }

    public void setHomeFullName(String homeFullName) {
        this.homeFullName = homeFullName;
    }

    public String getHomeShortName() {
        return homeShortName;
    }

    public void setHomeShortName(String homeShortName) {
        this.homeShortName = homeShortName;
    }

    public String getGuestFullName() {
        return guestFullName;
    }

    public void setGuestFullName(String guestFullName) {
        this.guestFullName = guestFullName;
    }

    public String getGuestShortName() {
        return guestShortName;
    }

    public void setGuestShortName(String guestShortName) {
        this.guestShortName = guestShortName;
    }

    public Short getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Short matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public Date getSaleEndDate() {
        return saleEndDate;
    }

    public void setSaleEndDate(Date saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    public String getBjNum() {
        return bjNum;
    }

    public void setBjNum(String bjNum) {
        this.bjNum = bjNum;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getFiveLeague() {
        return fiveLeague;
    }

    public void setFiveLeague(Integer fiveLeague) {
        this.fiveLeague = fiveLeague;
    }
}
