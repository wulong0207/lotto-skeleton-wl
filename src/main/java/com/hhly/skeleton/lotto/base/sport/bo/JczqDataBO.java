package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.util.ObjectUtil;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @auth lgs on
 * @date 2017/2/24.
 * @desc 竞彩足球受注赛程
 * @compay 益彩网络科技有限公司
 * @version 1.0
 */
public class JczqDataBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;

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

    /**
     * 彩期销售时间
     */
    private String saleDate;


    /**
     * 进球数SP值
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String[] goal;

    /**
     * 半全场胜平负SP
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String[] hf;

    /**
     * 比分SP
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private SportScoreSpBO  score;

    /**
     * 胜平负SP 和让球胜平负
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String[]  wdf;


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

    /**
     * 移动端分析页面更多url
     */
    private String fbAnalysisUrl;

    public String getFbAnalysisUrl() {
        if (!ObjectUtil.isBlank(this.getMatchInfoUrl())) {
            this.fbAnalysisUrl = "http://m.13322.com/live/bifen/index.html?id={matchId}&wap=YC#/".replace("{matchId}", this.getMatchInfoUrl());
        }
        return fbAnalysisUrl;
    }

    public void setFbAnalysisUrl(String fbAnalysisUrl) {
        this.fbAnalysisUrl = fbAnalysisUrl;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public Integer getFiveLeague() {
        return fiveLeague;
    }

    public void setFiveLeague(Integer fiveLeague) {
        this.fiveLeague = fiveLeague;
    }

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

    public String[] getGoal() {
        return goal;
    }

    public void setGoal(String[] goal) {
        this.goal = goal;
    }

    public String[] getHf() {
        return hf;
    }

    public void setHf(String[] hf) {
        this.hf = hf;
    }

    public SportScoreSpBO getScore() {
        return score;
    }

    public void setScore(SportScoreSpBO score) {
        this.score = score;
    }

    public String[] getWdf() {
        return wdf;
    }

    public void setWdf(String[] wdf) {
        this.wdf = wdf;
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

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fiveLeague", fiveLeague)
                .append("halfScore", halfScore)
                .append("fullScore", fullScore)
                .append("fullSpf", fullSpf)
                .append("letSpf", letSpf)
                .append("scoreResult", scoreResult)
                .append("goalNum", goalNum)
                .append("hfWdf", hfWdf)
                .append("saleDate", saleDate)
                .append("goal", goal)
                .append("hf", hf)
                .append("score", score)
                .append("wdf", wdf)
                .append("statusWdf", statusWdf)
                .append("statusLetWdf", statusLetWdf)
                .append("statusGoal", statusGoal)
                .append("statusHfWdf", statusHfWdf)
                .append("statusScore", statusScore)
                .toString();
    }
}
