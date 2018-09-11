package com.hhly.skeleton.lotto.base.cooperate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 兑换码订单
 *
 * @author huangchengfang1219
 * @date 2018年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateOrderBO extends BaseBO {

	private static final long serialVersionUID = 47934429457297846L;

	private String orderCode;

	private Short buyType;

	private Integer lotteryCode;

	/**
	 * 兑换码类型， 1:红包，2:积分兑换
	 */
	private Short cdkeyType;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getCdkeyType() {
		return cdkeyType;
	}

	public void setCdkeyType(Short cdkeyType) {
		this.cdkeyType = cdkeyType;
	}

}
