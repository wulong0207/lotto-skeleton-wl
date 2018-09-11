package com.hhly.skeleton.lotto.base.order.vo;

/**
 * @desc 用户追号明细查询实体
 * @author huangb
 * @date 2017年4月11日
 * @company 益彩网络
 * @version v1.0
 */
public class UserChaseDetailQueryVO extends UserNumOrderDetailQueryVO {

	private static final long serialVersionUID = -4970282789705412675L;
	/**
	 * 追号计划编号
	 */
	private String orderAddCode;

	/**
	 * 追号状态或追号彩期状态
	 */
	private Short addStatus;
	/**
	 * 新的追号状态或追号彩期状态（用于状态更新时的替换值）
	 */
	private Short newAddStatus;

	public UserChaseDetailQueryVO() {
	}

	public UserChaseDetailQueryVO(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public UserChaseDetailQueryVO(String orderAddCode, String token) {
		this.orderAddCode = orderAddCode;
		super.setToken(token);
	}

	public UserChaseDetailQueryVO(String orderAddCode, String token, Integer pageIndex, Integer pageSize) {
		this(orderAddCode, token);
		super.setPageIndex(pageIndex);
		super.setPageSize(pageSize);
	}

	public UserChaseDetailQueryVO(String orderAddCode, Short addStatus) {
		this.orderAddCode = orderAddCode;
		this.addStatus = addStatus;
	}

	public UserChaseDetailQueryVO(String orderAddCode, Integer userId, Short addStatus) {
		this.orderAddCode = orderAddCode;
		super.setUserId(userId);
		this.addStatus = addStatus;
	}
	
	public UserChaseDetailQueryVO(String orderAddCode, Integer userId, Short addStatus, Short newAddStatus) {
		this(orderAddCode, userId, addStatus);
		this.newAddStatus = newAddStatus;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public Short getNewAddStatus() {
		return newAddStatus;
	}

	public void setNewAddStatus(Short newAddStatus) {
		this.newAddStatus = newAddStatus;
	}

}
