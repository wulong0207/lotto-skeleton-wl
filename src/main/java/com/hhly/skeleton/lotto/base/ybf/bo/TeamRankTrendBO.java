package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/11/7.
 * @company 益彩网络科技有限公司
 */
public class TeamRankTrendBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    private String rank;
    /**
     * 球队名称
     */
    private String team;
    /**
     * 比赛场次数
     */
    private String vsCount;
    /**
     * 赢场次数
     */
    private String win;
    /**
     * 平场次数
     */
    private String draw;
    /**
     * 负场次数
     */
    private String lose;
    /**
     * 积分
     */
    private String integral;
    /**
     * 净胜球
     */
    private String goalDiff;
    /**
     * 进球数
     */
    private String goal;
    /**
     * 丢球数
     */
    private String miss;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getVsCount() {
        return vsCount;
    }

    public void setVsCount(String vsCount) {
        this.vsCount = vsCount;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public String getLose() {
        return lose;
    }

    public void setLose(String lose) {
        this.lose = lose;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getGoalDiff() {
        return goalDiff;
    }

    public void setGoalDiff(String goalDiff) {
        this.goalDiff = goalDiff;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getMiss() {
        return miss;
    }

    public void setMiss(String miss) {
        this.miss = miss;
    }
}
