package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;
import com.hhly.skeleton.lotto.base.ticket.bo.BetContentBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 篮球对阵BO
 * @date 2017/4/6 14:44
 * @company 益彩网络科技公司
 */
public class OrderMatchLQBO extends BaseBO {

    /**
     * 全场比分
     */
    private String fullScore;
    /**
     * 全场胜负 3：胜，0：负
     */
    private String fullWf;
    /**
     * 让分值 接口还没提供
     */
    private  String letScore;
    /**
     * 让分胜负 如： -3.5|0,-4.5|0 盘口值|彩果
     */
    private String letWf;
    /**
     * 大小分 大：99，小：00
     */
    private String dxfWF;

    /**
     * 大小分预设值 接口没提供
     */
    //private String dxfScore;

    /**
     * 胜分差 01：1-5；02：6-10；03：11-15；04：16-20；05：21-25；06：25分以上；主胜
     11：1-5；12：6-10；13：11-15；14：16-20；15：21-25；16：25分以上；客胜
     例如： 05  代表主队胜客队21-25分；
     */
    private String sfcWF;

    /**
     * 让分胜SP
     */
    @JsonProperty("let_sp_s")
    private String newestLetSpWin;

    /**
     * 让分负SP
     */
    @JsonProperty("let_sp_f")
    private String newestLetSpFail;

    /**
     * 胜负 胜SP
     */
    @JsonProperty("sp_s")
    private String newestSpWin;

    /**
     * 胜负 负SP
     */
    @JsonProperty("sp_f")
    private String newestSpFail;

    /**
     * 彩果信息
     */
    private List<BetContentBO> betContentBOs;

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

    public String getDxfWF() {
        return dxfWF;
    }

    public void setDxfWF(String dxfWF) {
        this.dxfWF = dxfWF;
    }

    public String getSfcWF() {
        return sfcWF;
    }

    public void setSfcWF(String sfcWF) {
        this.sfcWF = sfcWF;
    }

    public String getLetScore() {
        return letScore;
    }

    public void setLetScore(String letScore) {
        this.letScore = letScore;
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

    public String getNewestSpFail() {
        return newestSpFail;
    }

    public void setNewestSpFail(String newestSpFail) {
        this.newestSpFail = newestSpFail;
    }
}
