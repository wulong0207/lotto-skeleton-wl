package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OrderIssueBO extends BaseBO {
	private Integer id;
	
	private Integer userIssueId;
	
    private Integer lotteryCode;
	
	private String lotteryIssue;
	
	private String nickName;
	
	private String accountName;

	private Integer buyType;
	
	private String orderCode;
	
	private Double orderAmount;
	
	private Integer multipleNum;
	
	private Double preBonus;
	
	private Double aftBonus;

    private Integer orderStatus;
    
    private Integer winningStatus;
    
    private Double commissionRate;

    private Double commissionAmount;
	
    private Double followAmount;
    
    private Double maxRoi;
    
    private String remark;
    
    /**
     * 1：开奖后可见；2：全部可见；3：仅对抄单人可见；4：仅对关注人可见
     */
    private Integer orderVisibleType;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
    
    /**
     * 显示隐藏开关。默认为 1：显示， 0：隐藏
     */
    private Integer isShow;

    /**
     * 置顶标签 1：置顶；0：不置顶 默认0
     */
    private Integer isTop;
    /**
     * 推荐标签 1：推荐；0：不推荐 默认0
     */
    private Integer isRecommend;
    
    private Integer categoryId;
    
    private String recommendReason;
    
    private String modifyBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    
    private Integer followNum;
    
    /**
     * 用户标识0:用户 1:专家
     */
    private Integer level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
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

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public Double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(Double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Double getFollowAmount() {
		return followAmount;
	}

	public void setFollowAmount(Double followAmount) {
		this.followAmount = followAmount;
	}

	public Double getMaxRoi() {
		return maxRoi;
	}

	public void setMaxRoi(Double maxRoi) {
		this.maxRoi = maxRoi;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderVisibleType() {
		return orderVisibleType;
	}

	public void setOrderVisibleType(Integer orderVisibleType) {
		this.orderVisibleType = orderVisibleType;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getRecommendReason() {
		return recommendReason;
	}

	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getFollowNum() {
		return followNum;
	}

	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getUserIssueId() {
		return userIssueId;
	}

	public void setUserIssueId(Integer userIssueId) {
		this.userIssueId = userIssueId;
	}
//    /**
//     * 最近战况
//     */
//    private String recentRecord;
//
//    private Double hitRate;
//
//    /**
//     * Integer
//     */
//    private Integer continueHit;

	
}