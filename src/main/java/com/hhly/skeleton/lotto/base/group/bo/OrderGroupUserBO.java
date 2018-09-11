package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class OrderGroupUserBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 图像
     */
    private String headPic;

    /**
     * 用户标识；1：普通用户2：合买红人
     */
    private Boolean flag;

    /**
     * 用户总战绩；1颗星=1级 10颗星=1月亮 10月亮=1太阳 10太阳=1皇冠
     */
    private Short grade;

    /**
     * 是否推荐 ;0：不推荐；1：推荐；
     */
    private Boolean isRecommend;

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
    private Double orderSucAmount;

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
     * 定制总数
     */
    private Integer customizationCount;

    /**
     * 关注总数
     */
    private Integer focusCount;

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

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
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

    public Integer getCustomizationCount() {
        return customizationCount;
    }

    public void setCustomizationCount(Integer customizationCount) {
        this.customizationCount = customizationCount;
    }

    public Integer getFocusCount() {
        return focusCount;
    }

    public void setFocusCount(Integer focusCount) {
        this.focusCount = focusCount;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        isRecommend = recommend;
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

    public Double getOrderSucAmount() {
        return orderSucAmount;
    }

    public void setOrderSucAmount(Double orderSucAmount) {
        this.orderSucAmount = orderSucAmount;
    }
}