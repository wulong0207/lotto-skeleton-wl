package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户追号退款信息
 * @author huangb
 * @date 2017年4月12日
 * @company 益彩网络
 * @version v1.0
 */
public class UserChaseRefundBO extends BaseBO {

	private static final long serialVersionUID = 2276446461184419172L;

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
