package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OrderIssueVO extends PageVO {
	
	private Integer id;
	
	private Integer lotteryCode;
	
	private String lotteryIssue;
	
	private String orderCode;
	
	private String followOrderCode;
	
	private Integer userType;
	
	private String userTypeValue;
	
	private Integer timeType;
	
	private Date startTime;
	
	private Date endTime;
	
	private Integer winningStatus;
	
	private boolean joinOrder;
	
	private boolean joinUser;
	
	private boolean joinUserIssue;
	
	private boolean joinOrderFollowedInfo;
	
	private String recommendReason;
	
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
    
    private String remark;
    
    private String modifyBy;
    
    private Date modifyTime;
    
    private Date updateTime;
    
    

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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserTypeValue() {
		return userTypeValue;
	}

	public void setUserTypeValue(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}

	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public boolean isJoinOrder() {
		return joinOrder;
	}

	public void setJoinOrder(boolean joinOrder) {
		this.joinOrder = joinOrder;
	}

	public boolean isJoinUser() {
		return joinUser;
	}

	public void setJoinUser(boolean joinUser) {
		this.joinUser = joinUser;
	}

	public boolean isJoinUserIssue() {
		return joinUserIssue;
	}

	public void setJoinUserIssue(boolean joinUserIssue) {
		this.joinUserIssue = joinUserIssue;
	}

	public String getRecommendReason() {
		return recommendReason;
	}

	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	public String getFollowOrderCode() {
		return followOrderCode;
	}

	public void setFollowOrderCode(String followOrderCode) {
		this.followOrderCode = followOrderCode;
	}

	public boolean isJoinOrderFollowedInfo() {
		return joinOrderFollowedInfo;
	}

	public void setJoinOrderFollowedInfo(boolean joinOrderFollowedInfo) {
		this.joinOrderFollowedInfo = joinOrderFollowedInfo;
	}

	
}