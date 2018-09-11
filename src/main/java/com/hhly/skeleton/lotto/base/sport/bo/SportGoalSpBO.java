package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/2/26.
 * @desc 进球数SP值
 * @compay 益彩网络科技有限公司
 */
public class SportGoalSpBO extends BaseBO {
    private static final long serialVersionUID = -7842400573129817538L;

    @JsonProperty("s")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer single;

    /**
     * 半全场进球
     */
    @JsonProperty("sp_arr")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String[] goal;

    public SportGoalSpBO() {
    }

    public SportGoalSpBO(Integer single, String[] goal) {
        this.single = single;
        this.goal = goal;
    }

    public Integer getSingle() {
        return single;
    }

    public void setSingle(Integer single) {
        this.single = single;
    }

    public String[] getGoal() {
        return goal;
    }

    public void setGoal(String[] goal) {
        this.goal = goal;
    }
}
