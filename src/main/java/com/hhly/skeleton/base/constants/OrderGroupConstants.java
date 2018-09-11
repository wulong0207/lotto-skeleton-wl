package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 合买常量类
 * @author xiongJinGang
 * @date 2018年5月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OrderGroupConstants {

	/**
	 * 合买公司保底用户ID字段编码
	 */
	public static final String COMPANY_USER_DIC_CODE = "1000";

	/**
	 * @desc 合买状态;1：招募中；2：已满员；3：合买流产
	 * @author xiongJinGang
	 * @date 2018年5月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OrderGroupStatusEnum {
		RECRUITMENT((short) 1, "招募中"), // 招募中
		FULL((short) 2, "已满员"), // 已满员
		ABORTION((short) 3, "合买流产"),// 合买流产
		CANCEL((short)4,"合买撤单");

		private Short key;
		private String value;

		OrderGroupStatusEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		// 判断key是否存在
		public static boolean containsKey(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (OrderGroupStatusEnum orderEnum : OrderGroupStatusEnum.values()) {
					if (key.equals(orderEnum.getKey())) {
						return true;
					}
				}
			}
			return false;
		}

		// 根据key获取值
		public static OrderGroupStatusEnum getEnum(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (OrderGroupStatusEnum orderEnum : OrderGroupStatusEnum.values()) {
					if (key.equals(orderEnum.getKey())) {
						return orderEnum;
					}
				}
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/*合买退款类型，只有是合买订单退款时，才有值；代购、追号订单退款时为空
	1.未满员，合买流产退款处理（全退）
	2.未满员，平台保底认购账户处理（平台垫钱，扣平台账户的钱，然后加交易记录，http调用）
	3.满员，退发起人的保底账户金额的处理（全额退保底金额）
	4.系统发起的合买退款处理（同第一条）
	5.合买单出票失败的退款处理（同第一条）
	6.认购结束，合买进度大于90%时，需要退发起人一部分保底金额（如发起人保底金额20，需要扣除10元认购，另外10元退还给用户），参数refundAmount必须有值 */
	public enum OrderGroupRefundTypeEnum {
		NOT_FULL_ONE((short) 1, "未满员"), // 未满员
		NOT_FULL_TWO((short) 2, "未满员"), // 未满员
		FULL((short) 3, "已满员"), // 已满员
		SYSTEM_REFUND((short) 4, "系统退款"), // 系统退款
		FAIL_REFUND((short) 5, "失败退款"), // 失败退款
		PART_REFUND((short) 6, "保底部分退款");// 保底部分退款

		private Short key;
		private String value;

		OrderGroupRefundTypeEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		// 判断key是否存在
		public static boolean containsKey(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (OrderGroupRefundTypeEnum refundTypeEnum : OrderGroupRefundTypeEnum.values()) {
					if (key.equals(refundTypeEnum.getKey())) {
						return true;
					}
				}
			}
			return false;
		}

		// 根据key获取值
		public static OrderGroupRefundTypeEnum getEnum(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (OrderGroupRefundTypeEnum refundTypeEnum : OrderGroupRefundTypeEnum.values()) {
					if (key.equals(refundTypeEnum.getKey())) {
						return refundTypeEnum;
					}
				}
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/**
	 * @desc 订单合买交易类型
	 * @author xiongJinGang
	 * @date 2018年5月4日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OrderGroupTransTypeEnum {
		GUARANTEE((short) 1, "保底"), // 保底
		BUY_TOGETHER((short) 2, "认购");// 认购

		private Short key;
		private String value;

		OrderGroupTransTypeEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/**
	 * @desc 认购类型；1：普通认购 2：发起人保底认购 3：网站保底认购
	 * @author xiongJinGang
	 * @date 2018年7月19日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OrderGroupBuyTypeEnum {
		common((short) 1, "普通认购"), //
		Initiator_GUARANTEE((short) 2, "发起人保底认购"), //
		WEBSITE_GUARANTEE((short) 3, "网站保底认购");//

		private Short key;
		private String value;

		OrderGroupBuyTypeEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/**
	 * @desc 订单详情退款状态
	 * @author xiongJinGang
	 * @date 2018年5月4日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OrderGroupContentStatusEnum {
		NO((short) 0, "未退"), // 未退
		YES((short) 1, "已退");// 已退

		private Short key;
		private String value;

		OrderGroupContentStatusEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}
}
