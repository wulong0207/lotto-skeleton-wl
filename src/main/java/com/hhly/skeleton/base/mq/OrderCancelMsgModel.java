package com.hhly.skeleton.base.mq;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 订单撤单队列消息模型
 * @author huangb
 * @date 2017年5月29日
 * @company 益彩网络
 * @version v1.0
 */

public class OrderCancelMsgModel extends BaseVO {
	private static final long serialVersionUID = 8275763706080083693L;
	/**
	 * 订单类型；1-代购订单；2-追号计划；3-合买订单
	 */
	private Short orderType;
	/**
	 * 退款类型；
	 * orderType=1时，分2种退款类型；refundType为空或者为1时，为代购订单撤单；为2时，表示追号订单撤单（追号成功，出票失败撤单）
	 * orderType=2时，分3种退款类型；refundType为1-中奖停追退款;2-单期撤单退款;3-用户撤单退款;4-多期撤单退款(与2对应，2只支持单期退款)
	 * 注：退款类型改为String类型，因为在单独执行退款功能时，同个订单可能包含多种撤单中类型（如：1,2表示同时处理中奖停追撤单中退款+系统撤单中退款）     added to 20171114
	 */
	private String refundType;
	/**
	 * 订单编号号或追号计划编号
	 */
	private String orderCode;
	/**
	 * 期号 （追号单期退款用到）
	 */
	private String issueCode;
	/**
	 * 退款金额
	 * 注：金额改为String类型，因为在单独执行退款功能时，同个订单可能包含多种撤单中金额（如：1,2表示同时处理中奖停追撤单中退款金额+系统撤单中退款金额）     added to 20171114
	 */
	private String refundAmount;

	/*合买退款类型，只有是合买订单退款时，才有值；代购、追号订单退款时为空
	1.未满员，合买流产退款处理（全退）
	2.未满员，平台保底认购账户处理（平台垫钱，扣平台账户的钱，然后加交易记录，http调用）
	3.满员，退发起人的保底账户金额的处理（全额退保底金额）
	4.系统发起的合买退款处理（同第一条）
	5.合买单出票失败的退款处理（同第一条）
	6.认购结束，合买进度大于90%时，需要退发起人一部分保底金额（如发起人保底金额20，需要扣除10元认购，另外10元退还给用户），参数refundAmount必须有值 */
	private Short buyTogetherRefundType;

	/**
	 * 合买订单详情中的唯一编码
	 */
	private String buyCode;

	public OrderCancelMsgModel() {
	}

	/**
	 * 构造(支持现有的数据模型)
	 * @param orderType
	 * @param refundType
	 * @param orderCode
	 * @param issueCode
	 * @param refundAmount
	 */
	public OrderCancelMsgModel(Short orderType, String refundType, String orderCode, String issueCode, String refundAmount) {
		this.orderType = orderType;
		this.refundType = refundType;
		this.orderCode = orderCode;
		this.issueCode = issueCode;
		this.refundAmount = refundAmount;
	}

	/**
	 * 构造 (支持旧的处理方式使用，因为旧的数据模型中refundType的类型时short,refundAmount的类型时double)
	 * @param orderType
	 * @param refundType
	 * @param orderCode
	 * @param issueCode
	 * @param refundAmount
	 */
	public OrderCancelMsgModel(Short orderType, Short refundType, String orderCode, String issueCode, Double refundAmount) {
		this.orderType = orderType;
		this.refundType = (null == refundType ? null : String.valueOf(refundType));
		this.orderCode = orderCode;
		this.issueCode = issueCode;
		this.refundAmount = (null == refundAmount ? null : String.valueOf(refundAmount));
	}

	public OrderCancelMsgModel(Short orderType, String refundType, String orderCode, String issueCode, String refundAmount, Short buyTogetherRefundType) {
		super();
		this.orderType = orderType;
		this.refundType = refundType;
		this.orderCode = orderCode;
		this.issueCode = issueCode;
		this.refundAmount = refundAmount;
		this.buyTogetherRefundType = buyTogetherRefundType;
	}


	public Short getOrderType() {
		return orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType;
	}

	public String getRefundType() {
		return refundType;
	}

	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Short getBuyTogetherRefundType() {
		return buyTogetherRefundType;
	}

	public void setBuyTogetherRefundType(Short buyTogetherRefundType) {
		this.buyTogetherRefundType = buyTogetherRefundType;
	}

	public String getBuyCode() {
		return buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

}
