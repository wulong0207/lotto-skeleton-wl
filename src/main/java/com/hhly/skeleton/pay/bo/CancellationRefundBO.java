package com.hhly.skeleton.pay.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.mq.OrderCancelMsgModel;
import com.hhly.skeleton.base.util.ObjectUtil;

import java.io.Serializable;

/**
 * @author YiJian
 * @version 1.0
 * @desc 撤单 BO
 * @date 2017/5/24.
 * @company 益彩网络科技有限公司
 */
public class CancellationRefundBO extends BaseBO implements Serializable {
	private static final long serialVersionUID = -1028181415602000320L;

	private Short orderType; // 订单类型；1-代购订单；2-追号计划
	// orderType=1时，分2种退款类型；refundType为空或者为1时，为代购订单撤单；为2时，表示追号订单撤单（追号成功，出票失败撤单）
	// orderType=2时，分3种退款类型；refundType 为1-中奖停追退款;2-单期撤单退款;3-用户撤单退款
	private Short refundType;
	private String orderCode; // 订单编号号或追号计划编号
	private String issueCode; // 期号 （追号单期退款用到）
	private Double refundAmount;// 退款金额
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

	public CancellationRefundBO() {
		super();
	}

	public CancellationRefundBO(OrderCancelMsgModel orderCancelMsgModel) {
		super();
		this.orderType = orderCancelMsgModel.getOrderType();
		this.orderCode = orderCancelMsgModel.getOrderCode();
		this.issueCode = orderCancelMsgModel.getIssueCode();
		this.buyTogetherRefundType = orderCancelMsgModel.getBuyTogetherRefundType();
		this.buyCode = orderCancelMsgModel.getBuyCode();
		if (!ObjectUtil.isBlank(orderCancelMsgModel.getRefundAmount())) {
			this.refundAmount = Double.valueOf(orderCancelMsgModel.getRefundAmount());
		}
	}

	public Short getOrderType() {
		return orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType;
	}

	public Short getRefundType() {
		return refundType;
	}

	public void setRefundType(Short refundType) {
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

	public Double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
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
