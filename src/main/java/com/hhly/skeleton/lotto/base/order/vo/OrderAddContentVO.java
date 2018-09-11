package com.hhly.skeleton.lotto.base.order.vo;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号投注内容(与订单明细内容基本一致，生成订单时即作为明细内容入表)
 */
public class OrderAddContentVO extends OrderDetailVO {

	private static final long serialVersionUID = 2011328170854215709L;

	/**
	 * 追号投注内容编号
	 */
	private String orderAddCode;

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

}
