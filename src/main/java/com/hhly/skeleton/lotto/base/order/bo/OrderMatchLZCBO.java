package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 老足彩相关
 * @date 2017/3/29 12:00
 * @company 益彩网络科技公司
 */
public class OrderMatchLZCBO extends BaseBO {

    /**
     * 半场比分 如 1:1
     */
    private String halfScore;
    /**
     * 全场比分 如 1:1
     */
    private String fullScore;
    /**
     * 进球数
     */
    private Integer fourGoal;
    /**
     * 半全场胜负 3：胜 1 ： 平 0：负
     */
    private String sixHfWdf;
    /**
     * 14场,任九，六场半，四场 胜负
     */
    private Integer fourteenWdf;

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
}
