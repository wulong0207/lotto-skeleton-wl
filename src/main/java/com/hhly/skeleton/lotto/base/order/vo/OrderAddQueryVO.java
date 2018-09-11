package com.hhly.skeleton.lotto.base.order.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc    用作查询追号记录用
 * @author  Tony Wang
 * @date    2017年8月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderAddQueryVO extends BaseVO {

	/**
	 * 用户ID
	 */
	private Integer userId;
	
	/**
	 * 用于查询 userId != xxx
	 */
	private Integer negativeUserId;
	/**
	 * 活动来源ID
	 */
	private String activityId;
	/**
	 * 身份证号码
	 */
	private String idCard;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 真实姓名
	 */
	private String actualName;
	
	/**
	 * 用于not in 查询
	 */
	private List<Short> negativePayStatuses;
	
	/**
	 * 用于 in 查询
	 */
	private List<Short> payStatuses;
	
	/**
	 * 是否join用户表查询
	 */
	private boolean joinUser;
	
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
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<Short> getNegativePayStatuses() {
		return negativePayStatuses;
	}
	public void setNegativePayStatuses(List<Short> negativePayStatuses) {
		this.negativePayStatuses = negativePayStatuses;
	}
	public List<Short> getPayStatuses() {
		return payStatuses;
	}
	public void setPayStatuses(List<Short> payStatuses) {
		this.payStatuses = payStatuses;
	}
	public Integer getNegativeUserId() {
		return negativeUserId;
	}
	public void setNegativeUserId(Integer negativeUserId) {
		this.negativeUserId = negativeUserId;
	}
	public boolean isJoinUser() {
		return joinUser;
	}
	public void setJoinUser(boolean joinUser) {
		this.joinUser = joinUser;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
}
