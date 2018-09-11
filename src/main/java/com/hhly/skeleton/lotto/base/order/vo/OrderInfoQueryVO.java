package com.hhly.skeleton.lotto.base.order.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号计划信息
 */
/**
 * @desc    用作查询追号记录用
 * @author  Tony Wang
 * @date    2017年8月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class OrderInfoQueryVO extends BaseVO {

	/**
	 * 用户ID
	 */
	private Integer userId;
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
	 * 彩种id
	 */
	private Integer lotteryCode;
	
	/**
	 * 是否联m_user_info表查询
	 */
	private boolean joinUser;
	
	/**
	 * 用于 (status=a or status=b) 查询
	 */
	private List<Short> payStatuses;
	
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
	public List<Short> getPayStatuses() {
		return payStatuses;
	}
	public void setPayStatuses(List<Short> payStatuses) {
		this.payStatuses = payStatuses;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public boolean isJoinUser() {
		return joinUser;
	}
	public void setJoinUser(boolean joinUser) {
		this.joinUser = joinUser;
	}
}
