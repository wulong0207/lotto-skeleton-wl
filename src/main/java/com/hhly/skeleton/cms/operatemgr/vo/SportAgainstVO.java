package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 竞技彩赛事vo
 * @date 2017/10/25
 * @company 益彩网络科技公司
 */
public class SportAgainstVO extends PageVO {

   private Short lotteryCode;

    public Short getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Short lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}
