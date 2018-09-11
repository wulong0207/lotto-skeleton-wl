package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;

import java.math.BigDecimal;

/**
 * @author lgs on
 * @version 1.0
 * @desc 竞彩即时平均欧赔
 * @date 2017/3/29.
 * @company 益彩网络科技有限公司
 */
public class JcAvgOddsBO extends BaseBO {
    private static final long serialVersionUID = 7565908659150536739L;
    /**
     * 对阵id
     */
    private String matchId;
    /**
     * 胜平均欧赔值
     */
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float winAvg;
    /**
     * 平平均欧赔值
     */
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float drawAvg;
    /**
     * 负平均欧赔值
     */
    @JsonSerialize(using = CustomFloatSerialize.class)
    private Float lostAvg;

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Float getWinAvg() {
        if(winAvg>0){
            BigDecimal   b  =   new BigDecimal(winAvg);
            float   f1  = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            return f1;
        }
        return winAvg;
    }

    public void setWinAvg(Float winAvg) {
        this.winAvg = winAvg;
    }

    public Float getDrawAvg() {
        if(drawAvg>0){
            BigDecimal   b  =   new BigDecimal(drawAvg);
            float   f1  = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            return f1;
        }
        return drawAvg;
    }

    public void setDrawAvg(Float drawAvg) {
        this.drawAvg = drawAvg;
    }

    public Float getLostAvg() {
        if(lostAvg>0){
            BigDecimal   b  =   new BigDecimal(lostAvg);
            float   f1  = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            return f1;
        }
        return lostAvg;
    }

    public void setLostAvg(Float lostAvg) {
        this.lostAvg = lostAvg;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "matchId='" + matchId + '\'' +
                ", winAvg=" + winAvg +
                ", drawAvg=" + drawAvg +
                ", lostAvg=" + lostAvg +
                '}';
    }
}
