package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.util.Date;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/3/1.
 * @desc
 * @compay 益彩网络科技有限公司
 */
public class JclqDataBO extends JcBaseBO {
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

    /** 胜负玩法状态*/
    private Integer statusWf;

    /** 让分胜负玩法状态*/
    private Integer statusLetWf;

    /** 大小分玩法状态*/
    private Integer statusBigSmall;

    /** 比分玩法状态*/
    private Integer statusScoreWf;

    /**
     * 销售时间
     */
    private String saleDate;

    /**
     * 竞彩篮球比分
     */
    private BasketBallScoreBO score;

    public BasketBallScoreBO getScore() {
        return score;
    }

    public void setScore(BasketBallScoreBO score) {
        this.score = score;
    }

    /** 让分*/
    @JsonProperty("let_score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetScore;

    /** 让分胜SP*/
    @JsonProperty("let_w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetSpWin;

    /** 让分负SP*/
    @JsonProperty("let_l")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestLetSpFail;

    /** 胜负 胜SP*/
    @JsonProperty("w")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin;

    /** 胜负 负SP*/
    @JsonProperty("l")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail;

    /** 大小分分数*/
    @JsonProperty("p_score")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestPresetScore;

    /** 大分SP值*/
    @JsonProperty("b")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpBig;

    /** 小分SP值*/
    @JsonProperty("s")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpSmall;

    @JsonProperty("L15")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail15;

    @JsonProperty("L610")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail610;

    @JsonProperty("L1115")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail1115;

    @JsonProperty("L1620")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail1620;

    @JsonProperty("L2125")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail2125;

    @JsonProperty("L26")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpFail26;

    @JsonProperty("w15")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin15;

    @JsonProperty("w610")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin610;

    @JsonProperty("w1115")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin1115;

    @JsonProperty("w1620")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin1620;

    @JsonProperty("w2125")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin2125;

    @JsonProperty("w26")
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float newestSpWin26;

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

    public Float getNewestSpFail15() {
        return newestSpFail15;
    }

    public void setNewestSpFail15(Float newestSpFail15) {
        this.newestSpFail15 = newestSpFail15;
    }

    public Float getNewestSpFail610() {
        return newestSpFail610;
    }

    public void setNewestSpFail610(Float newestSpFail610) {
        this.newestSpFail610 = newestSpFail610;
    }

    public Float getNewestSpFail1115() {
        return newestSpFail1115;
    }

    public void setNewestSpFail1115(Float newestSpFail1115) {
        this.newestSpFail1115 = newestSpFail1115;
    }

    public Float getNewestSpFail1620() {
        return newestSpFail1620;
    }

    public void setNewestSpFail1620(Float newestSpFail1620) {
        this.newestSpFail1620 = newestSpFail1620;
    }

    public Float getNewestSpFail2125() {
        return newestSpFail2125;
    }

    public void setNewestSpFail2125(Float newestSpFail2125) {
        this.newestSpFail2125 = newestSpFail2125;
    }

    public Float getNewestSpFail26() {
        return newestSpFail26;
    }

    public void setNewestSpFail26(Float newestSpFail26) {
        this.newestSpFail26 = newestSpFail26;
    }

    public Float getNewestSpWin15() {
        return newestSpWin15;
    }

    public void setNewestSpWin15(Float newestSpWin15) {
        this.newestSpWin15 = newestSpWin15;
    }

    public Float getNewestSpWin610() {
        return newestSpWin610;
    }

    public void setNewestSpWin610(Float newestSpWin610) {
        this.newestSpWin610 = newestSpWin610;
    }

    public Float getNewestSpWin1115() {
        return newestSpWin1115;
    }

    public void setNewestSpWin1115(Float newestSpWin1115) {
        this.newestSpWin1115 = newestSpWin1115;
    }

    public Float getNewestSpWin1620() {
        return newestSpWin1620;
    }

    public void setNewestSpWin1620(Float newestSpWin1620) {
        this.newestSpWin1620 = newestSpWin1620;
    }

    public Float getNewestSpWin2125() {
        return newestSpWin2125;
    }

    public void setNewestSpWin2125(Float newestSpWin2125) {
        this.newestSpWin2125 = newestSpWin2125;
    }

    public Float getNewestSpWin26() {
        return newestSpWin26;
    }

    public void setNewestSpWin26(Float newestSpWin26) {
        this.newestSpWin26 = newestSpWin26;
    }


    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
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
                ", newestSpFail15=" + newestSpFail15 +
                ", newestSpFail610=" + newestSpFail610 +
                ", newestSpFail1115=" + newestSpFail1115 +
                ", newestSpFail1620=" + newestSpFail1620 +
                ", newestSpFail2125=" + newestSpFail2125 +
                ", newestSpFail26=" + newestSpFail26 +
                ", newestSpWin15=" + newestSpWin15 +
                ", newestSpWin610=" + newestSpWin610 +
                ", newestSpWin1115=" + newestSpWin1115 +
                ", newestSpWin1620=" + newestSpWin1620 +
                ", newestSpWin2125=" + newestSpWin2125 +
                ", newestSpWin26=" + newestSpWin26 +
                '}';
    }
}
