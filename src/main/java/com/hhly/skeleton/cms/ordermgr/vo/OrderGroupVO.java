package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OrderGroupVO extends PageVO {
	
	private Integer id;
	
	private Integer lotteryCode;
	
	private Short lotteryCategory;
	
	private String lotteryIssue;
	
	private Short orderStatus;
	
	private Short grpbuyStatus;
	
	private Integer winningStatus;
	
	/**
	 * 渠道
	 */
	private String channelId;
	
	private Short platform;
	
	private String orderCode;
	
	/**
	 * 是否置顶 0：不置顶；1：置顶；
	 */
	private Short isTop;
	
	/**
	 * 是否加推荐 0：不推荐；1：推荐；
	 */
	private Short isRecommend;
	
	/**
	 * 支付截止时间
	 */
	private Date endSysTime;
	
	//备注
	private String remark;
	
	private Short visibleType;
	
	private String userName;// 根据用户名查询参与合买用户
	
	private String userType;
	private String userTypeVal;
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserTypeVal() {
		return userTypeVal;
	}

	public void setUserTypeVal(String userTypeVal) {
		this.userTypeVal = userTypeVal;
	}

	public Short getVisibleType() {
		return visibleType;
	}

	public void setVisibleType(Short visibleType) {
		this.visibleType = visibleType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Short getIsTop() {
		return isTop;
	}

	public void setIsTop(Short isTop) {
		this.isTop = isTop;
	}

	public Short getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Date getEndSysTime() {
		return endSysTime;
	}

	public void setEndSysTime(Date endSysTime) {
		this.endSysTime = endSysTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getGrpbuyStatus() {
		return grpbuyStatus;
	}

	public void setGrpbuyStatus(Short grpbuyStatus) {
		this.grpbuyStatus = grpbuyStatus;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

}