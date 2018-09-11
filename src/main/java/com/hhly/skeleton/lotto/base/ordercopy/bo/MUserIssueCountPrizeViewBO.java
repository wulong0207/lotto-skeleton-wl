package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/10/10.
 * @company 益彩网络科技有限公司
 */
public class MUserIssueCountPrizeViewBO extends BaseBO {

    private static final long serialVersionUID = 1L;

    /**
     * 中奖单数
     */
    private int prizeTotal;

    /**
     * 未中奖单数
     */
    private int notPrizeTotal;

    /**
     * 发单时间
     */
    private String date;

    public int getPrizeTotal() {
        return prizeTotal;
    }

    public void setPrizeTotal(int prizeTotal) {
        this.prizeTotal = prizeTotal;
    }

    public int getNotPrizeTotal() {
        return notPrizeTotal;
    }

    public void setNotPrizeTotal(int notPrizeTotal) {
        this.notPrizeTotal = notPrizeTotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
