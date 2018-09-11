package com.hhly.skeleton.cms.transmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * 
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午4:46:41
 */
@SuppressWarnings("serial")
public class TransUserVO extends PageVO{
	
	// 用户流水ID
	//private Long id;
	private Integer lotteryCategory;
	private Integer lotteryCode;
	private Long startIssue;
	private Long endIssue;
	// 订单信息
	private String orderInfo;
	// 市场渠道
	private String channelName;
	private String transCode;
	private String thirdTransId;
	private String orderCode;
	private Integer userSearchType;
	private String userSearchValue;
	private Integer transTimeType;
	private Date startTime;
	private Date endTime;
	private Integer transType;
	private Integer transStatus;

	// 市场渠道id
	private Integer channelId;
	
	public Integer getLotteryCategory() {
		return lotteryCategory;
	}
	public void setLotteryCategory(Integer lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}
	
	public Integer getLotteryCode() {
        return lotteryCode;
    }
    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
    public Long getStartIssue() {
		return startIssue;
	}
	public void setStartIssue(Long startIssue) {
		this.startIssue = startIssue;
	}
	public Long getEndIssue() {
		return endIssue;
	}
	public void setEndIssue(Long endIssue) {
		this.endIssue = endIssue;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	public String getThirdTransId() {
		return thirdTransId;
	}
	public void setThirdTransId(String thirdTransId) {
		this.thirdTransId = thirdTransId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getUserSearchType() {
		return userSearchType;
	}
	public void setUserSearchType(Integer userSearchType) {
		this.userSearchType = userSearchType;
	}
	public String getUserSearchValue() {
		return userSearchValue;
	}
	public void setUserSearchValue(String userSearchValue) {
		this.userSearchValue = userSearchValue;
	}
	public Integer getTransTimeType() {
		return transTimeType;
	}
	public void setTransTimeType(Integer transTimeType) {
		this.transTimeType = transTimeType;
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
	public Integer getTransType() {
		return transType;
	}
	public void setTransType(Integer transType) {
		this.transType = transType;
	}
	public Integer getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
}
