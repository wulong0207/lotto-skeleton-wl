package com.hhly.skeleton.lotto.base.buy.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryDetailBO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 购彩大厅开奖实体类
 * @date 2017/11/7
 * @company 益彩网络科技公司
 */
public class LotteryDrawBO extends BaseBO {

    private List<LotteryDetailBO> numList = new ArrayList<>();

    private List<LotteryDetailBO> highList = new ArrayList<>();

    private List<LotteryDetailBO> sportList = new ArrayList<>();

    private List<LotteryDetailBO> hotList = new ArrayList<>();

    public List<LotteryDetailBO> getNumList() {
        return numList;
    }

    public void setNumList(List<LotteryDetailBO> numList) {
        this.numList = numList;
    }

    public List<LotteryDetailBO> getHighList() {
        return highList;
    }

    public void setHighList(List<LotteryDetailBO> highList) {
        this.highList = highList;
    }

    public List<LotteryDetailBO> getSportList() {
        return sportList;
    }

    public void setSportList(List<LotteryDetailBO> sportList) {
        this.sportList = sportList;
    }

    public List<LotteryDetailBO> getHotList() {
        return hotList;
    }

    public void setHotList(List<LotteryDetailBO> hotList) {
        this.hotList = hotList;
    }
}
