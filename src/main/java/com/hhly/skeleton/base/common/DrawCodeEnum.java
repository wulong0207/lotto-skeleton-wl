package com.hhly.skeleton.base.common;

import com.hhly.skeleton.base.constants.Constants;

public class DrawCodeEnum {

	/**
	 * @desc 大小
	 * @author huangchengfang1219
	 * @date 2017年10月11日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public static enum BIG_SMALL {
		BIG((short) 1, "大"), SMALL((short) 2, "小");
		private Short value;
		private String name;

		private BIG_SMALL(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public String getName() {
			return name;
		}

		public static BIG_SMALL get(Integer num, Integer compareNum) {
			if (num != null && compareNum != null) {
				return num <= compareNum ? SMALL : BIG;
			}
			return null;
		}

		public static String getNameByValue(Short value) {
			if (value != null) {
				for (BIG_SMALL obj : BIG_SMALL.values()) {
					if (obj.value.equals(value)) {
						return obj.name;
					}
				}
			}
			return null;
		}

	}

	/**
	 * @desc 单双
	 * @author huangchengfang1219
	 * @date 2017年10月11日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public static enum SINGLE_DOUBLE {

		SINGLE((short) 1, "单"), DOUBLE((short) 2, "双");

		private Short value;
		private String name;

		private SINGLE_DOUBLE(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public String getName() {
			return name;
		}

		public static SINGLE_DOUBLE get(Integer num) {
			if (num != null) {
				return num % Constants.NUM_2 == Constants.NUM_0 ? DOUBLE : SINGLE;
			}
			return null;
		}

		public static String getNameByValue(Short value) {
			if (value != null) {
				for (SINGLE_DOUBLE obj : SINGLE_DOUBLE.values()) {
					if (obj.value.equals(value)) {
						return obj.name;
					}
				}
			}
			return null;
		}

	}

	public static enum DRAW_CODE_TYPE {

		Z3((short) 1, "组三"), Z6((short) 2, "组六"), BZ((short) 3, "豹子"), // 福彩3D，排列3，重庆时时彩（后3位号码）
		TH((short) 4, "同花"), SZ((short) 5, "顺子"), DZ((short) 6, "对子"), THS((short) 7, "同花顺"), SP((short) 8, "散牌"), // 快乐扑克，豹子共用
		SAME3((short) 9, "三同号"), NOT_SAME3((short) 10, "三不同"), SERIAL3((short) 11, "三连号"), SAME2((short) 12, "二同号");

		private Short value;
		private String name;

		private DRAW_CODE_TYPE(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public String getName() {
			return name;
		}

		public static String getNameByValue(Short value) {
			if (value != null) {
				for (DRAW_CODE_TYPE obj : DRAW_CODE_TYPE.values()) {
					if (obj.value.equals(value)) {
						return obj.name;
					}
				}
			}
			return null;
		}

	}
}
