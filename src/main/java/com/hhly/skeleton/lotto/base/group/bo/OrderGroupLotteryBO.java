package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class OrderGroupLotteryBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    private String lotteryName;

    /**
     * 1.数字彩(低频彩，高频彩) 2.竞技彩（竟足，竟篮，北京单场，胜负过关）老足彩  冠亚军
     */
    private Integer lotteryType;

    /**
     * 用户战绩；1颗星=1级 10颗星=1月亮 10月亮=1太阳 10太阳=1皇冠
     */
    private Integer grade;

    /**
     * 发单总数
     */
    private Integer orderCount;

    /**
     * 发单成功总数
     */
    private Integer orderSucCount;

    /**
     * 发单成功率；发单成功数/发单总数
     */
    private Double orderSucRate;

    /**
     * 发单总额
     */
    private Double orderAmount;

    /**
     * 成功单总额
     */
    private Float orderSucAmount;

    /**
     * 中奖总数
     */
    private Integer winCount;

    /**
     * 中奖百万以上次数
     */
    private Integer winBwCount;

    /**
     * 中奖十万以上次数
     */
    private Integer winSwCount;

    /**
     * 中奖万以上次数
     */
    private Integer winWCount;

    /**
     * 中奖千以上次数
     */
    private Integer winQCount;

    /**
     * 中奖千以下次数
     */
    private Integer winOtherCount;

    /**
     * 中奖总额
     */
    private Double winAmount;

    /**
     * 盈利总额;中奖总额-成功单总额
     */
    private Double profitAmount;

    /**
     * 盈利率;盈利总额/成功单总额
     */
    private Double profitRate;

    /**
     * 命中率;中奖总数/成功单总数
     */
    private Double hitRate;

    /**
     * 佣金总额
     */
    private Double commissionAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 备注说明
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }





    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getOrderSucCount() {
        return orderSucCount;
    }

    public void setOrderSucCount(Integer orderSucCount) {
        this.orderSucCount = orderSucCount;
    }





    public Float getOrderSucAmount() {
        return orderSucAmount;
    }

    public void setOrderSucAmount(Float orderSucAmount) {
        this.orderSucAmount = orderSucAmount;
    }

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getWinBwCount() {
        return winBwCount;
    }

    public void setWinBwCount(Integer winBwCount) {
        this.winBwCount = winBwCount;
    }

    public Integer getWinSwCount() {
        return winSwCount;
    }

    public void setWinSwCount(Integer winSwCount) {
        this.winSwCount = winSwCount;
    }

    public Integer getWinWCount() {
        return winWCount;
    }

    public void setWinWCount(Integer winWCount) {
        this.winWCount = winWCount;
    }

    public Integer getWinQCount() {
        return winQCount;
    }

    public void setWinQCount(Integer winQCount) {
        this.winQCount = winQCount;
    }

    public Integer getWinOtherCount() {
        return winOtherCount;
    }

    public void setWinOtherCount(Integer winOtherCount) {
        this.winOtherCount = winOtherCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Integer getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(Integer lotteryType) {
        this.lotteryType = lotteryType;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getOrderSucRate() {
        return orderSucRate;
    }

    public void setOrderSucRate(Double orderSucRate) {
        this.orderSucRate = orderSucRate;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(Double winAmount) {
        this.winAmount = winAmount;
    }

    public Double getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Double profitAmount) {
        this.profitAmount = profitAmount;
    }

    public Double getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(Double profitRate) {
        this.profitRate = profitRate;
    }

    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    public Double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
}