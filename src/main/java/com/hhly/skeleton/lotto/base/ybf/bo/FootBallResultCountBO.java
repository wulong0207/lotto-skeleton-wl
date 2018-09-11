package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;
import java.util.Map;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/11/8.
 * @company 益彩网络科技有限公司
 */
public class FootBallResultCountBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    private Map<String, Double> full;
    private Map<String, Double> hafl;
    private List<String> score;
    private List<String> goalNum;


    public Map<String, Double> getFull() {
        return full;
    }

    public void setFull(Map<String, Double> full) {
        this.full = full;
    }

    public Map<String, Double> getHafl() {
        return hafl;
    }

    public void setHafl(Map<String, Double> hafl) {
        this.hafl = hafl;
    }

    public List<String> getScore() {
        return score;
    }

    public void setScore(List<String> score) {
        this.score = score;
    }

    public List<String> getGoalNum() {
        return goalNum;
    }

    public void setGoalNum(List<String> goalNum) {
        this.goalNum = goalNum;
    }
}
