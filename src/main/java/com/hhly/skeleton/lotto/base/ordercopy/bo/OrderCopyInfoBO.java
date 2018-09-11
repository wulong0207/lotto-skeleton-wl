package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.order.bo.OrderFullDetailInfoBO;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 方案详情BO
 * @date 2017/10/19.
 * @company 益彩网络科技有限公司
 */
public class OrderCopyInfoBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 方案id
     */
    private Long id;
    /**
     * 发单id
     */
    private Integer userIssueId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 最高回报率
     */
    @JsonIgnore
    private Double maxRoiStr;

    /**
     * 最高回报率
     */
    private String maxRoi;

    /**
     * 推荐理由
     */
    private String recommendReason;
    /**
     * 是否推荐
     */
    private Integer isRecommend;
    /**
     * 显示规则
     */
    private Integer orderVisibleType;
    /**
     * 佣金提成比例
     */
    private String commissionRate;

    /**
     * 佣金提成比例
     */
    @JsonIgnore
    private Double commissionRateTemp;
    /**
     * 跟单人数
     */
    private Integer followNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 头像url
     */
    private String headUrl;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 命中率
     */
    private String hitRate;

    /**
     * 命中率
     */
    @JsonIgnore
    private Double hitRateTemp;
    /**
     * 近期战绩
     */
    @JsonIgnore
    private String recentRecordStr;

    /**
     * 近期战绩
     */
    private String recentRecord;

    /**
     * 连红数
     */
    private String continueHit;

    /**
     * 连红数
     */
    @JsonIgnore
    private Integer continueHitTemp;

    /**
     * 单倍方案金额
     */
    private Double minMoney;

    /**
     * 推荐内容是否显示
     */
    private Integer isShow;

    /**
     * 盈利率
     */
    @JsonIgnore
    private Double profitRateTemp;

    /**
     * 盈利率
     */
    private String profitRate;

    /**
     * 单倍截止时间
     */
    private Date endLocalTime;

    /**
     * 方案订单信息
     */
    private OrderFullDetailInfoBO orderFullDetailInfoBO;

    /**
     * 用户是否是专家
     */
    private Integer level;

    public Integer getContinueHitTemp() {
        return continueHitTemp;
    }

    public void setContinueHitTemp(Integer continueHitTemp) {
        this.continueHitTemp = continueHitTemp;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Double getCommissionRateTemp() {
        return commissionRateTemp;
    }

    public void setCommissionRateTemp(Double commissionRateTemp) {
        this.commissionRateTemp = commissionRateTemp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getEndLocalTime() {
        return endLocalTime;
    }

    public void setEndLocalTime(Date endLocalTime) {
        this.endLocalTime = endLocalTime;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Double getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Double minMoney) {
        this.minMoney = minMoney;
    }

    public String getContinueHit() {
        return continueHit;
    }

    public void setContinueHit(String continueHit) {
        this.continueHit = continueHit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserIssueId() {
        return userIssueId;
    }

    public void setUserIssueId(Integer userIssueId) {
        this.userIssueId = userIssueId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Double getMaxRoiStr() {
        return maxRoiStr;
    }

    public void setMaxRoiStr(Double maxRoiStr) {
        this.maxRoiStr = maxRoiStr;
    }

    public String getMaxRoi() {
        return maxRoi;
    }

    public void setMaxRoi(String maxRoi) {
        this.maxRoi = maxRoi;
    }

    public String getRecommendReason() {
        return recommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getOrderVisibleType() {
        return orderVisibleType;
    }

    public void setOrderVisibleType(Integer orderVisibleType) {
        this.orderVisibleType = orderVisibleType;
    }


    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getHitRate() {
        return hitRate;
    }

    public void setHitRate(String hitRate) {
        this.hitRate = hitRate;
    }

    public Double getHitRateTemp() {
        return hitRateTemp;
    }

    public void setHitRateTemp(Double hitRateTemp) {
        this.hitRateTemp = hitRateTemp;
    }

    public String getRecentRecordStr() {
        return recentRecordStr;
    }

    public void setRecentRecordStr(String recentRecordStr) {
        this.recentRecordStr = recentRecordStr;
    }

    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public OrderFullDetailInfoBO getOrderFullDetailInfoBO() {
        return orderFullDetailInfoBO;
    }

    public void setOrderFullDetailInfoBO(OrderFullDetailInfoBO orderFullDetailInfoBO) {
        this.orderFullDetailInfoBO = orderFullDetailInfoBO;
    }

    public Double getProfitRateTemp() {
        return profitRateTemp;
    }

    public void setProfitRateTemp(Double profitRateTemp) {
        this.profitRateTemp = profitRateTemp;
    }

    public String getProfitRate() {
        return profitRate;
    }

    public void setProfitRate(String profitRate) {
        this.profitRate = profitRate;
    }
}
