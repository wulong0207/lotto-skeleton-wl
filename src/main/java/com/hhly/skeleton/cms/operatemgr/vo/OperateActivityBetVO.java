package com.hhly.skeleton.cms.operatemgr.vo;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 倍投立减
 * @date 2017/8/3
 * @company 益彩网络科技公司
 */
public class OperateActivityBetVO {

    /**
     * 倍数
     */
    private String num;

    /**
     * 减免金额
     */
    private String money;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
