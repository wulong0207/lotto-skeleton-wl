package com.hhly.skeleton.base.common;

import java.util.Objects;


/**
 * @desc
 * @author cheng chen
 * @date 2017年4月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserTypeEnum {

	public enum TimeType {
		
		create(1), modify(2);

		private int value;

		TimeType(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static boolean contains(Integer target) {
			if (null == target)
				return false;
			for (TimeType timeType : TimeType.values()) {
				if (Objects.equals(timeType, target))
					return true;
			}
			return false;
		}

		public static TimeType valueOf(Integer target) {
			if (null == target)
				return null;
			for (TimeType timeType : TimeType.values()) {
				if (Objects.equals(timeType.getValue(), target))
					return timeType;
			}
			return null;
		}
	}
}
