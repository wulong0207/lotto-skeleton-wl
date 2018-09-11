package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 追号计划返回信息
 * @author huangb
 * @date 2017年5月8日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderAddBO extends BaseBO {

	private static final long serialVersionUID = -1923428891999386722L;
	/**
	 * 自定义追号编号
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
	 * 追号金额
	 */
	private Double addAmount;
	/**
	 * 追号投注数(主要保存随机追号时的注数；选号追号也可以保留注数)
	 */
	private Integer addCount;
	/**
	 * 未支付订单数量（验证及返回用）
	 */
	private Integer noPayCount;
	
	/*******20170815 add 1分钱活动-撤单用*********/
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 活动来源ID
	 */
	private String activityId;

	public OrderAddBO() {
	}

	public OrderAddBO(String orderAddCode, Integer noPayCount) {
		this.orderAddCode = orderAddCode;
		this.noPayCount = noPayCount;
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

	public Double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(Double addAmount) {
		this.addAmount = addAmount;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public Integer getNoPayCount() {
		return noPayCount;
	}

	public void setNoPayCount(Integer noPayCount) {
		this.noPayCount = noPayCount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
