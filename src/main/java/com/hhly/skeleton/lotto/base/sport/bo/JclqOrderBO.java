package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomFloatSerialize;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/3/28.
 * @company 益彩网络科技有限公司
 */
public class JclqOrderBO extends JcBaseBO {
    private static final long serialVersionUID = -8594863920235115473L;
    /**
     * 第一节比分
     */
    private String firstScore;
    /**
     * 第二节比分
     */
    private String secondScore;
    /**
     * 第三节比分
     */
    private String thirdScore;
    /**
     * 第四节比分
     */
    private String fourthScore;
    /**
     * 加时比分
     */
    private String outTimeScore;
    /**
     * 全场比分
     */
    private String fullScore;
    /**
     * 全场胜负
     */
    private String fullWf;

    /**
     * 让分预设值
     */
    private  String letScore;

    /**
     * 大小分预设值
     */
    private String dxfScore;
    /**
     * 让分胜负
     */
    private String letWf;
    /**
     * 大小分
     */
    private String sizeScore;
    /**
     * 主胜分
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
     * 大小分 预设分
     */
    private Float newestPresetScore;

    /**
     * 大分SP值
     */
    private Float newestSpBig;

    /**
     * 小分SP值
     */
    private Float newestSpSmall;

    /**
     * 更新时间(用于和历史记录的记录比较更新时间)
     */
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(String firstScore) {
        this.firstScore = firstScore;
    }

    public String getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(String secondScore) {
        this.secondScore = secondScore;
    }

    public String getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(String thirdScore) {
        this.thirdScore = thirdScore;
    }

    public String getFourthScore() {
        return fourthScore;
    }

    public void setFourthScore(String fourthScore) {
        this.fourthScore = fourthScore;
    }

    public String getOutTimeScore() {
        return outTimeScore;
    }

    public void setOutTimeScore(String outTimeScore) {
        this.outTimeScore = outTimeScore;
    }

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

    public String getLetScore() {
        return letScore;
    }

    public void setLetScore(String letScore) {
        this.letScore = letScore;
    }

    public String getDxfScore() {
        return dxfScore;
    }

    public void setDxfScore(String dxfScore) {
        this.dxfScore = dxfScore;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstScore", firstScore)
                .append("secondScore", secondScore)
                .append("thirdScore", thirdScore)
                .append("fourthScore", fourthScore)
                .append("outTimeScore", outTimeScore)
                .append("fullScore", fullScore)
                .append("fullWf", fullWf)
                .append("letScore", letScore)
                .append("dxfScore", dxfScore)
                .append("letWf", letWf)
                .append("sizeScore", sizeScore)
                .append("winScore", winScore)
                .append("statusWf", statusWf)
                .append("statusLetWf", statusLetWf)
                .append("statusBigSmall", statusBigSmall)
                .append("statusScoreWf", statusScoreWf)
                .toString();
    }
}
