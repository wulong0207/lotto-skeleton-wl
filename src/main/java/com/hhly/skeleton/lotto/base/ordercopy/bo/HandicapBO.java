package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author longguoyou
 * @date 2018年01月03日
 * @compay 益彩网络科技有限公司
 * @since jdk 1.8
 */
public class HandicapBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 赛事编号：如,周三003
     */
    private String serNum;
    /**
     * 日期，如，18-01 12:11
     */
    private String time;
    /**
     * 方案变更前赔率 , 如：+12.5
     */
    private String preSp;
    /**
     * 最新赔率，如：+11.5， 前端：显示 没有＋号 ，只有向上、下箭头
     */
    private String newSp;
    /**
     * 1：显示箭头向上；0：显示箭头向下
     */
    private Integer flag;

    /**
     * 玩法
     */
    @JsonIgnore
    private String play;

    public HandicapBO() {
    }

    public HandicapBO(String time, String newSp) {
        this.time = time;
        this.newSp = newSp;
    }

    public HandicapBO(String serNum, String newSp, String play) {
        this.serNum = serNum;
        this.newSp = newSp;
        this.play = play;
    }

    public HandicapBO(String serNum, String time, String newSp, String play) {
        this.serNum = serNum;
        this.time = time;
        this.newSp = newSp;
        this.play = play;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPreSp() {
        return preSp;
    }

    public void setPreSp(String preSp) {
        this.preSp = preSp;
    }

    public String getNewSp() {
        return newSp;
    }

    public void setNewSp(String newSp) {
        this.newSp = newSp;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }
}
