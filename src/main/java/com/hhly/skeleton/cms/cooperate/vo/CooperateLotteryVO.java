package com.hhly.skeleton.cms.cooperate.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class CooperateLotteryVO extends PageVO {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 合作商户渠道id
     */
    private String channelId;

    /**
     * 彩种编号
     */
    private String lotteryCode;

    /**
     * 面额
     */
    private Float denomination;

    /**
     * 兑换金额
     */
    private Float exchangeBalance;

    /**
     * 创建人
     */
    private String createBy;


    /**
     * 修改人
     */
    private String modifyBy;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Float getDenomination() {
        return denomination;
    }

    public void setDenomination(Float denomination) {
        this.denomination = denomination;
    }

    public Float getExchangeBalance() {
        return exchangeBalance;
    }

    public void setExchangeBalance(Float exchangeBalance) {
        this.exchangeBalance = exchangeBalance;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }


    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

}