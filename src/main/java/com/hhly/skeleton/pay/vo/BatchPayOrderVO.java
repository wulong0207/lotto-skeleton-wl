package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 批量支付订单号信息
 * @author xiongJinGang
 * @date 2017年5月16日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class BatchPayOrderVO extends BaseBO {
	private static final long serialVersionUID = 1971828328632525881L;
	private String orderCodes;// 订单编号，多个用英文逗号隔开
	private String buyTypes;// 购买类型
	private List<PayOrderBaseInfoVO> list;// 订单列表

	public String getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(String orderCodes) {
		this.orderCodes = orderCodes;
	}

	public String getBuyTypes() {
		return buyTypes;
	}

	public void setBuyTypes(String buyTypes) {
		this.buyTypes = buyTypes;
	}

	public List<PayOrderBaseInfoVO> getList() {
		return list;
	}

	public void setList(List<PayOrderBaseInfoVO> list) {
		this.list = list;
	}

}
