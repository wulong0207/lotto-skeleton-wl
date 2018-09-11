package com.hhly.skeleton.lotto.base.buy.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryDetailBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateAdLottoBO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 购彩大厅数据实体类
 * @date 2017/11/2
 * @company 益彩网络科技公司
 */
public class LotteryBuyBO extends BaseBO {

    /**
     * 在售彩种集合
     */
    private List<LotteryDetailBO> lotteryList = new ArrayList<>();

    /**
     * 推荐彩种
     */
    private List<LotteryDetailBO> commendLotteryList = new ArrayList<>();

    /**
     * 广告位
     */
    private List<OperateAdLottoBO> adList = new ArrayList<>();

    public List<LotteryDetailBO> getLotteryList() {
        return lotteryList;
    }

    public void setLotteryList(List<LotteryDetailBO> lotteryList) {
        this.lotteryList = lotteryList;
    }

    public List<LotteryDetailBO> getCommendLotteryList() {
        return commendLotteryList;
    }

    public void setCommendLotteryList(List<LotteryDetailBO> commendLotteryList) {
        this.commendLotteryList = commendLotteryList;
    }

    public List<OperateAdLottoBO> getAdList() {
        return adList;
    }

    public void setAdList(List<OperateAdLottoBO> adList) {
        this.adList = adList;
    }
}
