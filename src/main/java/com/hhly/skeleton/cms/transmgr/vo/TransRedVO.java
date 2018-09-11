package com.hhly.skeleton.cms.transmgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * 
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午4:46:41
 */
@SuppressWarnings("serial")
public class TransRedVO extends PageVO{
	// 彩种类型
	private Integer lotteryCategory;
	// 彩种
	private Integer lotteryCode;
	// 开始彩期
	private Long startIssue;
	// 结束彩期
	private Long endIssue;
	// 订单信息
	private String orderInfo;
	// 系统流水编号
	private String redTransCode;
	// 方案编号，即订单编号
	private String orderCode;
	// 红包编号
	@Group({"coupon"})
	@NotNull
	private String redCode;
	private Integer userSearchType;
	private String userSearchValue;
	private Integer searchTimeType;
	private Date startTime;
	private Date endTime;
	// 交易分类
	private Integer transType;
	// 交易状态
	private Integer transStatus;
	
	private Integer redType;
	
	
	public Integer getRedType() {
		return redType;
	}
	public void setRedType(Integer redType) {
		this.redType = redType;
	}
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
	public String getRedTransCode() {
		return redTransCode;
	}
	public void setRedTransCode(String redTransCode) {
		this.redTransCode = redTransCode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getRedCode() {
		return redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
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
	public Integer getSearchTimeType() {
		return searchTimeType;
	}
	public void setSearchTimeType(Integer searchTimeType) {
		this.searchTimeType = searchTimeType;
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
}
