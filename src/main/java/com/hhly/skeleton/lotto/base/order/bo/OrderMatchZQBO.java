package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.ticket.bo.BetContentBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单详情足球相关内容
 * @date 2017/3/29 11:47
 * @company 益彩网络科技公司
 */
public class OrderMatchZQBO extends BaseBO {
    /**
     * 半场比分 如 1:1
     */
    private String halfScore;
    /**
     * 全场比分 如 1:1
     */
    private String fullScore;
    /**
     * 让球数
     */
    private String letNum;
    /**
     * 全场胜平负 3：胜 1 ： 平 0：负
     */
    private String fullSpf;
    /**
     * 让分胜平负 3：胜 1 ： 平 0：负
     */
    private String letSpf;
    /**
     * 比分玩法结果  具体 参考足球格式说明
     */
    private String score;
    /**
     * 进球数
     */
    private String goalNum;
    /**
     * 半全场胜平负 具体 参考足球格式说明
     */
    private String hfWdf;


    /**
     * 让球胜Sp值
     */
    @JsonProperty("let_sp_s")
    private String newestLetSpWin;

    /**
     * 让球平Sp值
     */
    @JsonProperty("let_sp_p")
    private String newestLetSpDraw;

    /**
     * 让球负Sp值
     */
    @JsonProperty("let_sp_f")
    private String newestLetSpFail;

    /**
     * 胜Sp值
     */
    @JsonProperty("sp_s")
    private String newestSpWin;

    /**
     * 平Sp值
     */
    @JsonProperty("sp_p")
    private String newestSpDraw;

    /**
     * 负Sp值
     */
    @JsonProperty("sp_f")
    private String newestSpFail;

    /**
     * 彩果信息
     */
    private List<BetContentBO> betContentBOs;

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

    public List<BetContentBO> getBetContentBOs() {
        return betContentBOs;
    }

    public void setBetContentBOs(List<BetContentBO> betContentBOs) {
        this.betContentBOs = betContentBOs;
    }

    public String getNewestLetSpWin() {
        return newestLetSpWin;
    }

    public void setNewestLetSpWin(String newestLetSpWin) {
        this.newestLetSpWin = newestLetSpWin;
    }

    public String getNewestLetSpDraw() {
        return newestLetSpDraw;
    }

    public void setNewestLetSpDraw(String newestLetSpDraw) {
        this.newestLetSpDraw = newestLetSpDraw;
    }

    public String getNewestLetSpFail() {
        return newestLetSpFail;
    }

    public void setNewestLetSpFail(String newestLetSpFail) {
        this.newestLetSpFail = newestLetSpFail;
    }

    public String getNewestSpWin() {
        return newestSpWin;
    }

    public void setNewestSpWin(String newestSpWin) {
        this.newestSpWin = newestSpWin;
    }

    public String getNewestSpDraw() {
        return newestSpDraw;
    }

    public void setNewestSpDraw(String newestSpDraw) {
        this.newestSpDraw = newestSpDraw;
    }

    public String getNewestSpFail() {
        return newestSpFail;
    }

    public void setNewestSpFail(String newestSpFail) {
        this.newestSpFail = newestSpFail;
    }
}
