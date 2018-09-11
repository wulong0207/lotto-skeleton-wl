package com.hhly.skeleton.base.common;

/**
 * @desc 会员枚举类
 * @author huangb
 * @date 2017年2月8日
 * @company 益彩网络
 * @version v1.0
 */
public class MemberEnum {
	/**
	 * @desc 用户钱包状态
	 * @author huangb
	 * @date 2017年2月8日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum UserWalletStatus {

		DISABLE("禁用", (short) 0), ENABLE("启用", (short) 1);

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		UserWalletStatus(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public static boolean contain(short value) {
			for (UserWalletStatus temp : UserWalletStatus.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}
}
