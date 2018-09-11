package com.hhly.skeleton.lotto.base.cooperate.bo;

import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;

/**
 * 第三方积分兑换下单，订单信息
 *
 * @author huangchengfang1219
 * @date 2018年3月31日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateOrderInfoBO extends OrderBaseInfoBO {

	private static final long serialVersionUID = -442037794175506090L;

	public CoOperateOrderInfoBO() {
		setOrderType(null);
	}

	private String cdkey;

	public String getCdkey() {
		return cdkey;
	}

	public void setCdkey(String cdkey) {
		this.cdkey = cdkey;
	}

	@Override
	public Double getMaxBonus() {
		Double maxBonus = super.getMaxBonus();
		if (maxBonus == 0d) {
			return null;
		}
		return maxBonus;
	}

	@Override
	public Double getMinBonus() {
		Double minBonus = super.getMinBonus();
		if (minBonus == 0d) {
			return null;
		}
		return minBonus;
	}

}
