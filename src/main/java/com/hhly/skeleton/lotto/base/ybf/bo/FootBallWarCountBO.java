package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author lgs on
 * @version 1.0
 * @desc 战绩统计BO
 * @date 2017/11/3.
 * @company 益彩网络科技有限公司
 */
public class FootBallWarCountBO extends BaseBO {
    /**
     * 双方交战历史主队胜次数
     */
    private int winNum;
    /**
     * 双方交战历史主队平次数
     */
    private int drawNum;
    /**
     * 双方交战历史主队负次数
     */
    private int lostNum;

    /**
     * 更多url
     */
    private String moreUrl;

    public String getMoreUrl() {
        return moreUrl;
    }

    public void setMoreUrl(String moreUrl) {
        this.moreUrl = moreUrl;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    public int getDrawNum() {
        return drawNum;
    }

    public void setDrawNum(int drawNum) {
        this.drawNum = drawNum;
    }

    public int getLostNum() {
        return lostNum;
    }

    public void setLostNum(int lostNum) {
        this.lostNum = lostNum;
    }


}
