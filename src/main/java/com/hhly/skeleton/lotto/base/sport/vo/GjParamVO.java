package com.hhly.skeleton.lotto.base.sport.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @Description 世界杯冠军、冠亚军相关业务接口查询VO入参
 * @Author longguoyou
 * @Date 2018/3/20 15:41
 * @Since 1.8
 */

public class GjParamVO extends PageVO {
    /**
     * 彩种
     */
    private Integer lotteryCode;

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}
