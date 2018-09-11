package com.hhly.skeleton.lotto.base.sport.bo;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/3/2.
 * @desc
 * @compay 益彩网络科技有限公司
 */
public class JcOldDataBO extends JcBaseBO {
    private static final long serialVersionUID = -8031870873151146350L;

    /**
     * 半场比分
     */
    private String halfScore;
    /**
     * 全场比分
     */
    private String fullScore;
    /**
     * 进球数
     */
    private Integer fourGoal;
    /**
     * 半全场胜负
     */
    private String sixHfWdf;
    /**
     * 14场胜负
     */
    private Integer fourteenWdf;

    /**
     * 胜SP值
     */
    private Float spWin;
    /**
     * 平SP值
     */
    private Float spDraw;
    /**
     * 负SP值
     */
    private Float spFail;

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

    public Integer getFourGoal() {
        return fourGoal;
    }

    public void setFourGoal(Integer fourGoal) {
        this.fourGoal = fourGoal;
    }

    public String getSixHfWdf() {
        return sixHfWdf;
    }

    public void setSixHfWdf(String sixHfWdf) {
        this.sixHfWdf = sixHfWdf;
    }

    public Integer getFourteenWdf() {
        return fourteenWdf;
    }

    public void setFourteenWdf(Integer fourteenWdf) {
        this.fourteenWdf = fourteenWdf;
    }

    public Float getSpWin() {
        return spWin;
    }

    public void setSpWin(Float spWin) {
        this.spWin = spWin;
    }

    public Float getSpDraw() {
        return spDraw;
    }

    public void setSpDraw(Float spDraw) {
        this.spDraw = spDraw;
    }

    public Float getSpFail() {
        return spFail;
    }

    public void setSpFail(Float spFail) {
        this.spFail = spFail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("halfScore", halfScore)
                .append("fullScore", fullScore)
                .append("fourGoal", fourGoal)
                .append("sixHfWdf", sixHfWdf)
                .append("fourteenWdf", fourteenWdf)
                .append("spWin", spWin)
                .append("spDraw", spDraw)
                .append("spFail", spFail)
                .toString();
    }
}
