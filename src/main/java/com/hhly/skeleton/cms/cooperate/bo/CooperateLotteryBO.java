package com.hhly.skeleton.cms.cooperate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.math.BigDecimal;
import java.util.Date;

public class CooperateLotteryBO extends BaseBO {
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
    private Short lotteryCode;

    /**
     * 面额
     */
    private Float denomination;

    /**
     * 兑换金额
     */
    private Double exchangeBalance;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private Date modifyTime;

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

    public Short getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Short lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Float getDenomination() {
        return denomination;
    }

    public void setDenomination(Float denomination) {
        this.denomination = denomination;
    }

    public Double getExchangeBalance() {
        return exchangeBalance;
    }

    public void setExchangeBalance(Double exchangeBalance) {
        this.exchangeBalance = exchangeBalance;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}