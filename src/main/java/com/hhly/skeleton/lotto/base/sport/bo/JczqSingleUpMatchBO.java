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
 * @desc 单式上传对阵BO
 * @date 2017/6/23.
 * @company 益彩网络科技有限公司
 */
public class JczqSingleUpMatchBO extends BaseBO {
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
     * 主队id
     */
    @JsonProperty("h_id")
    private Long homeTeamId;

    /**
     * 客队id
     */
    @JsonProperty("g_id")
    private Long visitiTeamId;

    /**
     * 系统编号
     */
    @JsonProperty("systemCode")
    private String systemCode;

    /**
     * 官方比赛编号
     */
    @JsonIgnore
    private String officialMatchCode;

    private String week;

    private String num;

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
     * 官方编号
     */
    @JsonIgnore
    private String officialId;


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
     * 胜平负玩法状态
     */
    @JsonProperty("status_wdf")
    private Integer statusWdf;

    /**
     * 让球胜平负玩法状态
     */
    @JsonProperty("status_letWdf")
    private Integer statusLetWdf;

    /**
     * 总进球玩法状态
     */
    @JsonProperty("status_goal")
    private Integer statusGoal;

    /**
     * 半全场胜平负玩法状态
     */
    @JsonProperty("status_hfWdf")
    private Integer statusHfWdf;

    /**
     * 比分玩法状态
     */
    @JsonProperty("status_score")
    private Integer statusScore;


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

    public Long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Long getVisitiTeamId() {
        return visitiTeamId;
    }

    public void setVisitiTeamId(Long visitiTeamId) {
        this.visitiTeamId = visitiTeamId;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public String getOfficialId() {
        return officialId;
    }

    public void setOfficialId(String officialId) {
        this.officialId = officialId;
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


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("lotteryCode", lotteryCode)
                .append("issueCode", issueCode)
                .append("sportMatchInfoId", sportMatchInfoId)
                .append("homeTeamId", homeTeamId)
                .append("visitiTeamId", visitiTeamId)
                .append("systemCode", systemCode)
                .append("officialMatchCode", officialMatchCode)
                .append("week", week)
                .append("num", num)
                .append("matchFullName", matchFullName)
                .append("matchShortName", matchShortName)
                .append("homeFullName", homeFullName)
                .append("homeShortName", homeShortName)
                .append("guestFullName", guestFullName)
                .append("guestShortName", guestShortName)
                .append("matchStatus", matchStatus)
                .append("officialId", officialId)
                .append("date", date)
                .append("time", time)
                .append("saleEndTime", saleEndTime)
                .append("saleEndDate", saleEndDate)
                .append("statusWdf", statusWdf)
                .append("statusLetWdf", statusLetWdf)
                .append("statusGoal", statusGoal)
                .append("statusHfWdf", statusHfWdf)
                .append("statusScore", statusScore)
                .toString();
    }
}
