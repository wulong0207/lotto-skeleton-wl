package com.hhly.skeleton.lotto.base.cooperate.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 代理商户信息
 *
 * @author huangchengfang1219
 * @date 2018年4月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateProxyInfoBO extends CoOperateChannelBO {

	private static final long serialVersionUID = 1428634962435001050L;

	/**
	 * 今日订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderToday;
	/**
	 * 一周订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderWeek;
	/**
	 * 一月订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderMonth;

	@Override
	@JsonSerialize(using = CustomDoubleSerialize.class)
	public Double getBalance() {
		return super.getBalance();
	}

	public Double getOrderToday() {
		return orderToday;
	}

	public void setOrderToday(Double orderToday) {
		this.orderToday = orderToday;
	}

	public Double getOrderWeek() {
		return orderWeek;
	}

	public void setOrderWeek(Double orderWeek) {
		this.orderWeek = orderWeek;
	}

	public Double getOrderMonth() {
		return orderMonth;
	}

	public void setOrderMonth(Double orderMonth) {
		this.orderMonth = orderMonth;
	}
	
}
