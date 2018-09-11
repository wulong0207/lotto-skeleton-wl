package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Arrays;

/**
 * @author lgs on
 * @version 1.0
 * @desc 移动端竞彩篮球BO
 * @date 2017/7/4.
 * @company 益彩网络科技有限公司
 */
public class JclqMobileDataBO extends JcBaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 全场比分
     */
    private String fullScore;

    /**
     * 全场胜负
     */
    private String fullWf;
    /**
     * 让分胜负
     */
    private String letWf;
    /**
     * 大小分胜负
     */
    private String sizeScore;
    /**
     * 胜分差胜负
     */
    private String winScore;

    /**
     * 胜负玩法状态
     */
    private Integer statusWf;

    /**
     * 让分胜负玩法状态
     */
    private Integer statusLetWf;

    /**
     * 大小分玩法状态
     */
    private Integer statusBigSmall;

    /**
     * 比分玩法状态
     */
    private Integer statusScoreWf;

    /**
     * 销售时间
     */
    private String saleDate;


    /**
     * 让分
     */
    @JsonProperty("let_score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetScore;

    /**
     * 让分胜SP
     */
    @JsonProperty("let_w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetSpWin;

    /**
     * 让分负SP
     */
    @JsonProperty("let_l")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetSpFail;

    /**
     * 胜负 胜SP
     */
    @JsonProperty("w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin;

    /**
     * 胜负 负SP
     */
    @JsonProperty("l")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail;

    /**
     * 大小分分数
     */
    @JsonProperty("p_score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestPresetScore;

    /**
     * 大分SP值
     */
    @JsonProperty("b")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpBig;

    /**
     * 小分SP值
     */
    @JsonProperty("s")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpSmall;

    /**
     * 主队胜 胜分差
     */
    private String[] wins;

    /**
     * 客队胜 胜分差
     */
    private String[] losts;


    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getFullWf() {
        return fullWf;
    }

    public void setFullWf(String fullWf) {
        this.fullWf = fullWf;
    }

    public String getLetWf() {
        return letWf;
    }

    public void setLetWf(String letWf) {
        this.letWf = letWf;
    }

    public String getSizeScore() {
        return sizeScore;
    }

    public void setSizeScore(String sizeScore) {
        this.sizeScore = sizeScore;
    }

    public String getWinScore() {
        return winScore;
    }

    public void setWinScore(String winScore) {
        this.winScore = winScore;
    }

    public Integer getStatusWf() {
        return statusWf;
    }

    public void setStatusWf(Integer statusWf) {
        this.statusWf = statusWf;
    }

    public Integer getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Integer statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

    public Integer getStatusBigSmall() {
        return statusBigSmall;
    }

    public void setStatusBigSmall(Integer statusBigSmall) {
        this.statusBigSmall = statusBigSmall;
    }

    public Integer getStatusScoreWf() {
        return statusScoreWf;
    }

    public void setStatusScoreWf(Integer statusScoreWf) {
        this.statusScoreWf = statusScoreWf;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public Float getNewestLetScore() {
        return newestLetScore;
    }

    public void setNewestLetScore(Float newestLetScore) {
        this.newestLetScore = newestLetScore;
    }

    public Float getNewestLetSpWin() {
        return newestLetSpWin;
    }

    public void setNewestLetSpWin(Float newestLetSpWin) {
        this.newestLetSpWin = newestLetSpWin;
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

    public Float getNewestSpFail() {
        return newestSpFail;
    }

    public void setNewestSpFail(Float newestSpFail) {
        this.newestSpFail = newestSpFail;
    }

    public Float getNewestPresetScore() {
        return newestPresetScore;
    }

    public void setNewestPresetScore(Float newestPresetScore) {
        this.newestPresetScore = newestPresetScore;
    }

    public Float getNewestSpBig() {
        return newestSpBig;
    }

    public void setNewestSpBig(Float newestSpBig) {
        this.newestSpBig = newestSpBig;
    }

    public Float getNewestSpSmall() {
        return newestSpSmall;
    }

    public void setNewestSpSmall(Float newestSpSmall) {
        this.newestSpSmall = newestSpSmall;
    }

    public String[] getWins() {
        return wins;
    }

    public void setWins(String[] wins) {
        this.wins = wins;
    }

    public String[] getLosts() {
        return losts;
    }

    public void setLosts(String[] losts) {
        this.losts = losts;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "fullScore='" + fullScore + '\'' +
                ", fullWf='" + fullWf + '\'' +
                ", letWf='" + letWf + '\'' +
                ", sizeScore='" + sizeScore + '\'' +
                ", winScore='" + winScore + '\'' +
                ", statusWf=" + statusWf +
                ", statusLetWf=" + statusLetWf +
                ", statusBigSmall=" + statusBigSmall +
                ", statusScoreWf=" + statusScoreWf +
                ", saleDate='" + saleDate + '\'' +
                ", newestLetScore=" + newestLetScore +
                ", newestLetSpWin=" + newestLetSpWin +
                ", newestLetSpFail=" + newestLetSpFail +
                ", newestSpWin=" + newestSpWin +
                ", newestSpFail=" + newestSpFail +
                ", newestPresetScore=" + newestPresetScore +
                ", newestSpBig=" + newestSpBig +
                ", newestSpSmall=" + newestSpSmall +
                ", wins=" + Arrays.toString(wins) +
                ", losts=" + Arrays.toString(losts) +
                "} " + super.toString();
    }
}
