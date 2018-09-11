package com.hhly.skeleton.base.util;

import com.hhly.skeleton.base.util.NumberUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @author lgs on
 * @version 1.0
 * @desc 欧赔返回率计算
 * @date 2017/11/17.
 * @company 益彩网络科技有限公司
 */
public class OddsUtil {

    /**
     * 获取返还率
     *
     * @param win  胜的赔率
     * @param draw 平的赔率
     * @param lost 负的赔率
     * @return
     */
    public static Double getRateOfReturn(Double win, Double draw, Double lost) {
        double rateOfReturn = 0;
        if (ObjectUtil.isBlank(win) || ObjectUtil.isBlank(draw) || ObjectUtil.isBlank(lost)) {
            return rateOfReturn;
        }

        Double numerator = NumberUtil.mul(NumberUtil.mul(win, draw), lost);

        Double denominator = NumberUtil.sum(NumberUtil.sum(NumberUtil.mul(win, draw), NumberUtil.mul(win, lost)), NumberUtil.mul(draw, lost));

        rateOfReturn = NumberUtil.div(numerator, denominator, 4);

        return NumberUtil.mul(rateOfReturn, 100);
    }

    /**
     * 获取某赔率出现概率
     *
     * @param x            某赔率
     * @param rateOfReturn 返还率
     * @return
     */
    public static Double getOneOfProbability(Double x, Double rateOfReturn) {
        double y = 0;
        if (ObjectUtil.isBlank(x) || ObjectUtil.isBlank(rateOfReturn)) {
            return y;
        }
        y = NumberUtil.div(rateOfReturn, x, 2);
        return y;
    }

    /**
     * 获取凯利指数
     *
     * @param x                某即时赔率赔率
     * @param oneOfProbability 某即时平均赔率的概率
     * @return
     */
    public static Double getKelly(Double x, Double oneOfProbability) {
        double y = 0;
        if (ObjectUtil.isBlank(x) || ObjectUtil.isBlank(oneOfProbability)) {
            return y;
        }
        y = NumberUtil.mul(NumberUtil.div(oneOfProbability, 100, 4), x);
        return y;
    }

}
