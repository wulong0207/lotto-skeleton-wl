package com.hhly.skeleton.pay.activity.vo;

import java.io.Serializable;

/**
 * @desc 活动支付请求参数
 * @author xiongJinGang
 * @date 2018年1月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ActivityPayParamVO implements Serializable {
	private static final long serialVersionUID = -3884363437105703055L;

	public static enum ACTIVITY_TYPE {
		DOUBLE_CHROMOSPHERE(9, "双色球"), //
		ELEVEN_CHOSE_FIVE(14, "11选5");

		private ACTIVITY_TYPE(Integer key, String value) {
			this.key = key;
			this.value = value;
		}

		private Integer key;
		private String value;

		public Integer getKey() {
			return key;
		}

		public void setKey(Integer key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

	private String orderCode;// 订单号
	private Integer activityType;// 活动编号 新用户活动（双色球）9，年会派发活动（11x5）14

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

}
