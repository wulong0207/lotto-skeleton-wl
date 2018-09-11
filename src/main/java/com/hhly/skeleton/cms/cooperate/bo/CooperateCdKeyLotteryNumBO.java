package com.hhly.skeleton.cms.cooperate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author lgs on
 * @version 1.0
 * @desc 彩种库存
 * @date 2018/3/12.
 * @company 益彩网络科技有限公司
 */
public class CooperateCdKeyLotteryNumBO extends BaseBO {
    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    /**
     * 总数量
     */
    private String total;

    /**
     * 已经使用数量
     */
    private String usedTotal;

    /**
     * 未使用数量
     */
    private String usedNewTotal;


    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUsedTotal() {
        return usedTotal;
    }

    public void setUsedTotal(String usedTotal) {
        this.usedTotal = usedTotal;
    }

    public String getUsedNewTotal() {
        return usedNewTotal;
    }

    public void setUsedNewTotal(String usedNewTotal) {
        this.usedNewTotal = usedNewTotal;
    }
}
