package com.hhly.skeleton.lotto.base.group.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class OrderGroupContentVO extends PageVO{

    /**
     * 主键
     */
    private Integer id;

    /**
     * 合买订单编号;关联合买订单表grpbuy_order_info
     */
    private String orderCode;

    /**
     * 认购用户id;关联用户表
     */
    private Integer userId;

    /**
     * 认购比例
     */
    private Double buyRatio;

    /**
     * 认购金额
     */
    private Double buyAmount;

    /**
     * 认购时间
     */
    private Date buyTime;

    /**
     * 税前奖金
     */
    private Double preBonus;

    /**
     * 税后奖金
     */
    private Double aftBonus;

    /**
     * 抽成佣金
     */
    private Double commissionAmount;

    /**
     * 派发奖金;税后-抽成佣金
     */
    private Double sendBonus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注说明
     */
    private String remark;
    /**
     * 是否发起合买
     */
    private Integer flag;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getBuyRatio() {
        return buyRatio;
    }

    public void setBuyRatio(Double buyRatio) {
        this.buyRatio = buyRatio;
    }

    public Double getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Double getPreBonus() {
        return preBonus;
    }

    public void setPreBonus(Double preBonus) {
        this.preBonus = preBonus;
    }

    public Double getAftBonus() {
        return aftBonus;
    }

    public void setAftBonus(Double aftBonus) {
        this.aftBonus = aftBonus;
    }

    public Double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Double getSendBonus() {
        return sendBonus;
    }

    public void setSendBonus(Double sendBonus) {
        this.sendBonus = sendBonus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
