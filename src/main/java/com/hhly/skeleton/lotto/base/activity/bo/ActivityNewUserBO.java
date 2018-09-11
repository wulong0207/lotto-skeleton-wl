package com.hhly.skeleton.lotto.base.activity.bo;

import java.util.List;

/**
 * 新用户活动（注册送活动）VO
 *
 * @author huangchengfang1219
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ActivityNewUserBO extends BaseActivityBO {

	private static final long serialVersionUID = -2268383188117612955L;

	/**
	 * 是否是白名单用户
	 */
	private Short isWhiteListUser;

	/**
	 * 订单号列表
	 */
	private List<String> orderCodeList;

	/**
	 * 红包编号列表
	 */
	private List<String> couponCodeList;

	/**
	 * 订单编号
	 */
	private String orderCode;

	public Short getIsWhiteListUser() {
		return isWhiteListUser;
	}

	public void setIsWhiteListUser(Short isWhiteListUser) {
		this.isWhiteListUser = isWhiteListUser;
	}

	public List<String> getOrderCodeList() {
		return orderCodeList;
	}

	public void setOrderCodeList(List<String> orderCodeList) {
		this.orderCodeList = orderCodeList;
	}

	public List<String> getCouponCodeList() {
		return couponCodeList;
	}

	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

}
