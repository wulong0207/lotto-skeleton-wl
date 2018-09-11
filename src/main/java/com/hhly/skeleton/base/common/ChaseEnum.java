package com.hhly.skeleton.base.common;

/**
 * @desc 追号枚举类
 * @author Tony Wang
 * @date 2017年2月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public class ChaseEnum {

	/**
	 * @author huangb
	 *
	 * @Date 2016年12月16日
	 *
	 * @Desc 追号期数状态
	 */
	public enum ChaseIssueStatus {

		CHASE_SUCCESS("追号成功", (short) 1),
		CHASE_FAILED("追号失败", (short) 2),
		SYSTEM_CANCEL("系统撤单", (short) 3),
		USER_CANCEL("用户撤单", (short) 4),
		CHASE_WAITING("等待追号", (short) 5),
		CANCELLING("撤单中", (short) 6),
		STOP_CANCELLING("停追撤单中", (short) 7),
		USER_CANCELLING("用户撤单中", (short) 8);

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ChaseIssueStatus(String desc, short value) {
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
	}
	/**
	 * @desc 追号彩期标识（主要标识头、尾）
	 * @author huangb
	 * @date 2017年3月29日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum ChaseIssueFlag {

		A("既是头期也是尾期", "A"), F("头期", "F"), L("尾期", "L");

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private String value;

		ChaseIssueFlag(String desc, String value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}
	/**
	 * @author huangb
	 *
	 * @Date 2016年12月16日
	 *
	 * @Desc 追号计划状态
	 */
	public enum ChaseStatus {

		CHASING("追号中", (short) 1), CHASE_STOP("中奖停追", (short) 2), CHASE_END("追号结束", (short) 3), USER_CANCEL("用户撤单",
				(short) 4), SYSTEM_CANCEL("系统撤单", (short) 5);

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ChaseStatus(String desc, short value) {
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

	}

	/**
	 * @author huangb
	 *
	 * @Date 2016年12月16日
	 *
	 * @Desc 追号停止类型
	 */
	public enum ChaseStopType {

		PRIZE("奖项", (short) 1), AMOUNT("金额", (short) 2), ALWAYS("永追", (short) 3);

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 类型值
		 */
		private short value;

		ChaseStopType(String desc, short value) {
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

		public static boolean contain(Short stopType) {
			if (stopType == null) {
				return false;
			}
			for (ChaseStopType temp : ChaseStopType.values()) {
				if (temp.getValue() == stopType.shortValue()) {
					return true;
				}
			}
			return false;
		}

		/**
		 * @desc 获取停追类型对象
		 * @author huangb
		 * @date 2017年3月20日
		 * @param stopType
		 *            停追类型
		 * @return 获取追号类型对象
		 */
		public static ChaseStopType getChaseStopType(Short stopType) {
			if (stopType == null) {
				return null;
			}
			for (ChaseStopType tmp : ChaseStopType.values()) {
				if (tmp.getValue() == stopType.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}

	/**
	 * @author huangb
	 *
	 * @Date 2016年12月16日
	 *
	 * @Desc 追号类型
	 */
	public enum ChaseType {

		FIXED_NUMBER("固定选号", (short) 1), RANDOM_NUMBER("随机选号", (short) 2);

		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 类型值
		 */
		private short value;

		ChaseType(String desc, short value) {
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

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含指定类型
		 */
		public static boolean contain(Short value) {
			if(null == value) return false;
			for (ChaseType temp : ChaseType.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}

		/**
		 * @desc 获取追号类型对象
		 * @author huangb
		 * @date 2017年3月20日
		 * @param chaseType
		 *            追号类型
		 * @return 获取追号类型对象
		 */
		public static ChaseType getChaseType(Short chaseType) {
			if (chaseType == null) {
				return null;
			}
			for (ChaseType tmp : ChaseType.values()) {
				if (tmp.getValue() == chaseType.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}
	
	/**
	 * @desc 客户端类型（追号计划分不同客户端录入）
	 * @author huangb
	 * @date 2017年4月6日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum ClientType {

		PC("PC端", (short) 1), IOS("IOS端", (short) 2), H5("H5端", (short) 3), ANDROID("ANDROID端", (short) 4);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		ClientType(String desc, short value) {
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

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含类型
		 */
		public static boolean contain(Short value) {
			if (value == null) {
				return false;
			}
			for (ClientType temp : ClientType.values()) {
				if (temp.getValue() == value.shortValue()) {
					return true;
				}
			}
			return false;
		}

		/**
		 * @desc 获取客户端类型
		 * @author huangb
		 * @date 2017年4月6日
		 * @param value
		 *            类型值
		 * @return 获取客户端类型
		 */
		public static ClientType getClientType(Short value) {
			if (value == null) {
				return null;
			}
			for (ClientType tmp : ClientType.values()) {
				if (tmp.getValue() == value.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}
	
	/**
	 * @desc 是/否的枚举
	 * @author huangb
	 * @date 2017年5月25日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum YesOrNo {

		N("否", (short) 0), Y("是", (short) 1);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		YesOrNo(String desc, short value) {
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

		public static boolean contain(Short value) {
			if (value == null) {
				return false;
			}
			for (YesOrNo temp : YesOrNo.values()) {
				if (temp.getValue() == value.shortValue()) {
					return true;
				}
			}
			return false;
		}

		public static YesOrNo getYesOrNo(Short value) {
			if (value == null) {
				return null;
			}
			for (YesOrNo tmp : YesOrNo.values()) {
				if (tmp.getValue() == value.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}
}
