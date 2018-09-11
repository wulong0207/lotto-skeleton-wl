package com.hhly.skeleton.base.mq;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 追号订单创建的队列消息模型(主要用于追号下单支付完成后，对当前期的追号生成订单)
 * @author huangb
 * @date 2017年5月29日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseOrderCreateMsgModel extends BaseVO {

	private static final long serialVersionUID = 490805668390038259L;
	/**
	 * 彩种；必填
	 */
	private Integer lotteryCode;
	/**
	 * 追号订单编号；必填
	 */
	private String orderAddCode;
	/**
	 * 用户id；选填
	 */
	private Long userId;

	public ChaseOrderCreateMsgModel() {
	}

	public ChaseOrderCreateMsgModel(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public ChaseOrderCreateMsgModel(Integer lotteryCode, String orderAddCode, Long userId) {
		this(orderAddCode);
		this.lotteryCode = lotteryCode;
		this.userId = userId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
