package com.hhly.skeleton.base.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class HighEnum {

	
	/**
	 * @desc    十一选五子玩法，只要用于查询遗漏，值与表TREND_11X5_result和TREND_11X5_BASE对应
	 * @author  Tony Wang
	 * @date    2017年3月31日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum X115Subplay {
		/**
		 * 任选
		 */
		RX(1),
		/**
		 * 万位
		 */
		MYRIAD(2),
		/**
		 * 千位
		 */
		THOUSAND(3),
		/**
		 * 百位
		 */
		HUNDRED(4),
		/**
		 * 前二组选
		 */
		Q2_GROUP(5),
		/**
		 * 前三组选
		 */
		Q3_GROUP(6);
		
		private static final List<Integer> VALUES;
		
		static {
	        VALUES = new ArrayList<>();
	        for (X115Subplay someEnum : X115Subplay.values()) {
	            VALUES.add(someEnum.getValue());
	        }
	    }
		
		public static List<Integer> getValues() {
	        return Collections.unmodifiableList(VALUES);
	    }
		
		private final int value;

		X115Subplay(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(X115Subplay tmp : X115Subplay.values()) {
				if(Objects.equals(tmp.getValue(), target))
					return true;
			}
			return false;
		}
		
		/**
		 * @desc   是否为合法的子玩法
		 * @author Tony Wang
		 * @create 2017年3月15日
		 * @param targets
		 * @return 
		 */
		public static boolean containsAll(List<Integer> targets) {
			return null != targets && VALUES.containsAll(targets);
		}
	}
}
