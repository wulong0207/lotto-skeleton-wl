package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author lgs on
 * @version 1.0
 * @desc 竞彩足球订单详情BO
 * @date 2017/3/27.
 * @company 益彩网络科技有限公司
 */
public class JczqOrderBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;
    /**
     * 半场比分
     */
    private String halfScore;
    /**
     * 全场比分
     */
    private String fullScore;
    /**
     * 让球数
     */
    private String letNum;
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
    private String score;
    /**
     * 进球数
     */
    private String goalNum;
    /**
     * 半全场胜平负
     */
    private String hfWdf;

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
     * 让球数
     */
    private Short newestLetNum;

    /**
     * 让球胜Sp值
     */
    private Float newestLetSpWin;

    /**
     * 让球平Sp值
     */
    private Float newestLetSpDraw;

    /**
     * 让球负Sp值
     */
    private Float newestLetSpFail;

    /**
     * 胜Sp值
     */
    private Float newestSpWin;

    /**
     * 平Sp值
     */
    private Float newestSpDraw;

    /**
     * 负Sp值
     */
    private Float newestSpFail;


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

    public String getLetNum() {
        return letNum;
    }

    public void setLetNum(String letNum) {
        this.letNum = letNum;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("halfScore", halfScore)
                .append("fullScore", fullScore)
                .append("letNum", letNum)
                .append("fullSpf", fullSpf)
                .append("letSpf", letSpf)
                .append("score", score)
                .append("goalNum", goalNum)
                .append("hfWdf", hfWdf)
                .append("statusWdf", statusWdf)
                .append("statusLetWdf", statusLetWdf)
                .append("statusGoal", statusGoal)
                .append("statusHfWdf", statusHfWdf)
                .append("statusScore", statusScore)
                .toString();
    }
}
