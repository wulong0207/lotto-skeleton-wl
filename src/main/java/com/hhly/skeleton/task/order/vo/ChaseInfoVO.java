package com.hhly.skeleton.task.order.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc 追号计划信息
 * @author huangb
 * @date 2017年4月20日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseInfoVO extends PageVO {
	private static final long serialVersionUID = 882626932826415131L;
	/**
	 * 追号编号
	 */
	private String orderAddCode;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期编号
	 */
	private String issueCode;
	/**
	 * 用户
	 */
	private Long userId;
	/**
	 * 追号状态或追号彩期状态
	 */
	private Short addStatus;
	/**
	 * 新的追号状态或追号彩期状态（用于状态更新时的替换值）
	 */
	private Short newAddStatus;
	/**
	 * 是否有停追条件 1-有, 0-没有
	 */
	private Short hasStopCondition;
	/**
	 * 追号订单编号（追号成功后的订单号）
	 */
	private String orderCode;
	/**
	 * 追号彩期id 
	 */
	private Long chaseIssueId;
	/**
	 * 追号总注数
	 */
	private Integer addCount;
	/**
	 * 20180124 added
	 * 分批查询时的追号计划自增id;分批查询时作为起始分批条件，用于确定每批的起始数据范围 
	 */
	private Long batChaseId;
	
	public ChaseInfoVO() {
	}

	public ChaseInfoVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	/**
	 * 构造
	 * 
	 * @param lotteryCode
	 *            彩种code
	 * @param hasStopCondition
	 *            是否有停追条件
	 */
	public ChaseInfoVO(Integer lotteryCode, Short hasStopCondition) {
		this(lotteryCode);
		this.hasStopCondition = hasStopCondition;
	}

	public ChaseInfoVO(Integer lotteryCode, Short hasStopCondition, Integer pageIndex, Integer pageSize) {
		this(lotteryCode, hasStopCondition);
		super.setPageIndex(pageIndex);
		super.setPageSize(pageSize);
	}
	
	public ChaseInfoVO(Integer lotteryCode, Short hasStopCondition, Integer pageIndex, Integer pageSize, Long batChaseId) {
		this(lotteryCode, hasStopCondition, pageIndex, pageSize);
		this.batChaseId = batChaseId;
	}

	/**
	 * 构造
	 * 
	 * @param lotteryCode
	 *            彩种code
	 * @param orderAddCode
	 *            追号计划编号
	 */
	public ChaseInfoVO(Integer lotteryCode, String orderAddCode) {
		this.lotteryCode = lotteryCode;
		this.orderAddCode = orderAddCode;
	}

	public ChaseInfoVO(Integer lotteryCode, String orderAddCode, Long userId) {
		this(lotteryCode, orderAddCode);
		this.userId = userId;
	}

	public ChaseInfoVO(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public ChaseInfoVO(String orderAddCode, Long userId) {
		this(orderAddCode);
		this.userId = userId;
	}

	public ChaseInfoVO(String orderAddCode, Short addStatus) {
		this(orderAddCode);
		this.addStatus = addStatus;
	}

	public ChaseInfoVO(String orderAddCode, Short addStatus, Short newAddStatus) {
		this(orderAddCode, addStatus);
		this.newAddStatus = newAddStatus;
	}

	public ChaseInfoVO(String orderAddCode, String issueCode, Short addStatus, Short newAddStatus) {
		this(orderAddCode, addStatus, newAddStatus);
		this.issueCode = issueCode;
	}
	
	public ChaseInfoVO(String orderAddCode, String issueCode, Short addStatus, Short newAddStatus, String orderCode) {
		this(orderAddCode, issueCode, addStatus, newAddStatus);
		this.orderCode = orderCode;
	}

	public ChaseInfoVO(String orderAddCode, Long userId, Short addStatus, Short newAddStatus) {
		this(orderAddCode, addStatus, newAddStatus);
		this.userId = userId;
	}

	/***********追号撤单用到的构造************/
	public ChaseInfoVO(Long chaseIssueId) {
		this.chaseIssueId = chaseIssueId;
	}

	public ChaseInfoVO(String orderAddCode, String issueCode) {
		this(orderAddCode);
		this.issueCode = issueCode;
	}

	public ChaseInfoVO(String orderAddCode, String issueCode, Short addStatus) {
		this(orderAddCode, issueCode);
		this.addStatus = addStatus;
	}
	
	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Short getHasStopCondition() {
		return hasStopCondition;
	}

	public void setHasStopCondition(Short hasStopCondition) {
		this.hasStopCondition = hasStopCondition;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Long getChaseIssueId() {
		return chaseIssueId;
	}

	public void setChaseIssueId(Long chaseIssueId) {
		this.chaseIssueId = chaseIssueId;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public Long getBatChaseId() {
		return batChaseId;
	}

	public void setBatChaseId(Long batChaseId) {
		this.batChaseId = batChaseId;
	}

}
