package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 查询用户渠道钱包列表
 * @date 2018.6.8
 * @author zhouyang
 * @return
 */
public class ChannelMemberWalletBO extends BaseBO {

    /**
     * 现金总额
     */
    private String cashMoney;

    /**
     * 红包总额
     */
    private String redMoney;

    /**
     * 渠道会员id
     */
    private String channelMemberId;

    public String getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(String cashMoney) {
        this.cashMoney = cashMoney;
    }

    public String getRedMoney() {
        return redMoney;
    }

    public void setRedMoney(String redMoney) {
        this.redMoney = redMoney;
    }

    public String getChannelMemberId() {
        return channelMemberId;
    }

    public void setChannelMemberId(String channelMemberId) {
        this.channelMemberId = channelMemberId;
    }
}
