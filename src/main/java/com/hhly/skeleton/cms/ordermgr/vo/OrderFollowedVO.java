package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OrderFollowedVO extends PageVO {

	private Integer orderIssueId;
	private Integer orderStatus;

	private String accountName;

	private String orderCode;
	
	private boolean joinUser;

	private boolean joinOrder;

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public boolean isJoinUser() {
		return joinUser;
	}

	public void setJoinUser(boolean joinUser) {
		this.joinUser = joinUser;
	}

	public boolean isJoinOrder() {
		return joinOrder;
	}

	public void setJoinOrder(boolean joinOrder) {
		this.joinOrder = joinOrder;
	}

	public Integer getOrderIssueId() {
		return orderIssueId;
	}

	public void setOrderIssueId(Integer orderIssueId) {
		this.orderIssueId = orderIssueId;
	}
}