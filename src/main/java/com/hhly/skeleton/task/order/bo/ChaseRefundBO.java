package com.hhly.skeleton.task.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户追号退款信息(如金额、红包等信息)
 * @author huangb
 * @date 2017年6月24日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseRefundBO extends BaseBO {

	private static final long serialVersionUID = 750919839340451231L;
	/**
	 * 追号撤单退款金额
	 */
	private Double refundAmount;

	public Double getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

}
