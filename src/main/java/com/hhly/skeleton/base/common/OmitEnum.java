package com.hhly.skeleton.base.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @desc    走势遗漏枚举类
 * @author  Tony Wang
 * @date    2017年3月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OmitEnum {

	/**
	 * @desc    高频彩遗漏类型
	 * @author  Tony Wang
	 * @date    2017年3月15日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum HighOmitType {
		/**
		 * N期冷热
		 */
		COLD_HOT(1),
		/**
		 * 当前遗漏(遗漏数据)
		 */
		CURRENT(2),
		/**
		 * 最大遗漏
		 */
		MAX(3),
		/**
		 * 上次遗漏
		 */
		PRE(4);
		
		private static final List<Integer> VALUES;
		
		static {
	        VALUES = new ArrayList<>();
	        for (HighOmitType someEnum : HighOmitType.values()) {
	            VALUES.add(someEnum.getOmitType());
	        }
	    }
		
		public static List<Integer> getValues() {
	        return Collections.unmodifiableList(VALUES);
	    }
		
		private final int omitType;

		HighOmitType(int omitType) {
			this.omitType = omitType;
		}
		
		public int getOmitType() {
			return omitType;
		}


		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(HighOmitType tmp : HighOmitType.values()) {
				if(Objects.equals(tmp.getOmitType(), target))
					return true;
			}
			return false;
		}
		
		/**
		 * @desc   是否为合法的遗漏类型
		 * @author Tony Wang
		 * @create 2017年3月15日
		 * @param targets
		 * @return 
		 */
		public static boolean containsAll(List<Integer> targets) {
			return null != targets && VALUES.containsAll(targets);
		}
	}
	
	/**
	 * @desc    遗漏统计范围类型
	 * @author  Tony Wang
	 * @date    2017年3月25日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum QryFlag {
		/**
		 * 1：普通;2：近期;3胆拖;4和值
		 */
		NORMAL((byte)1),
		RECENT((byte)2),
		DANTUO((byte)3),
		SUM((byte)4),
		;
		
		private final byte range;

		QryFlag(byte range) {
			this.range = range;
		}
		public byte getRange() {
			return range;
		}
		public static boolean contains(Byte target) {
			if(null == target) return false;
			for(QryFlag tmp : QryFlag.values()) {
				if(Objects.equals(tmp.getRange(), target))
					return true;
			}
			return false;
		}
		public static QryFlag valueOf(Byte target) {
			if(null == target) return null;
			for(QryFlag range : QryFlag.values()) {
				if(Objects.equals(range.getRange(), target))
					return range;
			}
			return null;
		}
	}
	
	/**
	 * @desc 福彩3d遗漏类型
	 * @author huangb
	 * @date 2017年6月29日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum F3dOmitType {
		/**
		 * 1：直选-普通遗漏
		 */
		D_PT("直选-普通遗漏", (short) 1),
		/**
		 * 2：组三-包号遗漏|组六-普通遗漏|组六-胆拖遗漏
		 */
		G3_BH_G6_PT_DT("组三-包号遗漏|组六-普通遗漏|组六-胆拖遗漏", (short) 2),
		/**
		 * 3：直选-和值遗漏
		 */
		D_SUM("直选-和值遗漏", (short) 3),
		/**
		 * 4.组三-和值遗漏
		 */
		G3_SUM("组三-和值遗漏", (short) 4),
		/**
		 * 5：组六-和值遗漏
		 */
		G6_SUM("组六-和值遗漏", (short) 5);
		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		F3dOmitType(String desc, short value) {
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
			for (F3dOmitType temp : F3dOmitType.values()) {
				if (temp.getValue() == value.shortValue()) {
					return true;
				}
			}
			return false;
		}

		public static F3dOmitType getF3dOmitType(Short value) {
			if (value == null) {
				return null;
			}
			for (F3dOmitType tmp : F3dOmitType.values()) {
				if (tmp.getValue() == value.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}
	/**
	 * @desc 排列三遗漏类型
	 * @author huangb
	 * @date 2017年6月29日
	 * @company 益彩网络
	 * @version v1.0
	 */
	public enum Pl3OmitType {
		/**
		 * 1：直选-普通遗漏
		 */
		D_PT("直选-普通遗漏", (short) 1),
		/**
		 * 2：组三-包号遗漏|组六-普通遗漏|组六-胆拖遗漏
		 */
		G3_BH_G6_PT_DT("组三-包号遗漏|组六-普通遗漏|组六-胆拖遗漏", (short) 2),
		/**
		 * 3：直选-和值遗漏
		 */
		D_SUM("直选-和值遗漏", (short) 3),
		/**
		 * 4.组三-和值遗漏
		 */
		G3_SUM("组三-和值遗漏", (short) 4),
		/**
		 * 5：组六-和值遗漏
		 */
		G6_SUM("组六-和值遗漏", (short) 5);
		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		Pl3OmitType(String desc, short value) {
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
			for (Pl3OmitType temp : Pl3OmitType.values()) {
				if (temp.getValue() == value.shortValue()) {
					return true;
				}
			}
			return false;
		}

		public static Pl3OmitType getPl3OmitType(Short value) {
			if (value == null) {
				return null;
			}
			for (Pl3OmitType tmp : Pl3OmitType.values()) {
				if (tmp.getValue() == value.shortValue()) {
					return tmp;
				}
			}
			return null;
		}
	}
}
