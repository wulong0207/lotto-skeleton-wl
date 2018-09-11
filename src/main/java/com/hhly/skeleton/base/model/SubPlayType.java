package com.hhly.skeleton.base.model;

import com.hhly.skeleton.base.util.StringUtil;

/**
 * @author huangb
 *
 * @Date 2016年12月1日
 *
 * @Desc 彩种子玩法类型
 */
public enum SubPlayType {

	SSQ_PT("普通投注", "SSQ_PT"), SSQ_DT("胆拖投注", "SSQ_DT"),
	
	/**
	 * 山东十一选五子玩法
	 */
	SD11X5_R2("山东十一选五任选二", "SD11X5_R2"), SD11X5_R3("山东十一选五任选三", "SD11X5_R3"),
	SD11X5_R4("山东十一选五任选四", "SD11X5_R4"), SD11X5_R5("山东十一选五任选五", "SD11X5_R5"),
	SD11X5_R6("山东十一选五任选六", "SD11X5_R6"), SD11X5_R7("山东十一选五任选七", "SD11X5_R7"),
	SD11X5_R8("山东十一选五任选八", "SD11X5_R8"), SD11X5_Q1("山东十一选五前一", "SD11X5_Q1"),
	SD11X5_Q2_GROUP("山东十一选五前二组选", "SD11X5_Q2_GROUP"), SD11X5_Q2_DIRECT("山东十一选五前二直选", "SD11X5_Q2_DIRECT"),
	SD11X5_Q3_GROUP("山东十一选五前三组选", "SD11X5_Q3_GROUP"), SD11X5_Q3_DIRECT("山东十一选五前三直选", "SD11X5_Q3_DIRECT");
	/**
	 * 状态描述
	 */
	private String desc;
	/**
	 * 类型值
	 */
	private String value;

	SubPlayType(String desc, String value) {
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

	/**
	 * @param value
	 *            类型值
	 * @return true/false
	 * @Desc 是否包含指定类型
	 */
	public static boolean contain(String value) {
		if (value == null || value.trim().length() == 0) {
			return false;
		}
		for (SubPlayType temp : SubPlayType.values()) {
			if (temp.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param value
	 *            类型值
	 * @return true/false
	 * @Desc 是否是双色球玩法
	 */
	public static boolean isSsq(String value) {
		if (value == null || value.trim().length() == 0) {
			return false;
		}
		// ssq-两种子玩法
        return SubPlayType.SSQ_PT.getValue().equals(value) || SubPlayType.SSQ_DT.getValue().equals(value);
    }
	
	/**
	 * 判断是否为十一选五的子玩法
	 * @param value
	 * @return
	 */
	public static boolean is11X5(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R2.getValue().equals(value) || SubPlayType.SD11X5_R3.getValue().equals(value) ||
                SubPlayType.SD11X5_R4.getValue().equals(value) || SubPlayType.SD11X5_R5.getValue().equals(value) ||
                SubPlayType.SD11X5_R6.getValue().equals(value) || SubPlayType.SD11X5_R7.getValue().equals(value) ||
                SubPlayType.SD11X5_R8.getValue().equals(value) || SubPlayType.SD11X5_Q1.getValue().equals(value) ||
                SubPlayType.SD11X5_Q2_GROUP.getValue().equals(value) || SubPlayType.SD11X5_Q2_DIRECT.getValue().equals(value) ||
                SubPlayType.SD11X5_Q3_GROUP.getValue().equals(value) || SubPlayType.SD11X5_Q3_DIRECT.getValue().equals(value);
    }

	/**
	 * 判断是否为十一选五的任二子玩法
	 * @param value
	 * @return
	 */
	public static boolean is11X5R2(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R2.getValue().equals(value);
    }
	
	public static boolean is11X5R3(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R3.getValue().equals(value);
    }
	
	public static boolean is11X5R4(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R4.getValue().equals(value);
    }
	
	public static boolean is11X5R5(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R5.getValue().equals(value);
    }
	
	public static boolean is11X5R6(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R6.getValue().equals(value);
    }
	
	public static boolean is11X5R7(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R7.getValue().equals(value);
    }
	
	public static boolean is11X5R8(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_R8.getValue().equals(value);
    }
	
	public static boolean is11X5Q1(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_Q1.getValue().equals(value);
    }
	
	public static boolean is11X5Q2Direct(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_Q2_DIRECT.getValue().equals(value);
    }
	
	public static boolean is11X5Q2Group(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_Q2_GROUP.getValue().equals(value);
    }
	
	public static boolean is11X5Q3Direct(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_Q3_DIRECT.getValue().equals(value);
    }
	
	public static boolean is11X5Q3Group(String value) {
		if(StringUtil.isBlank(value)) return false;
        return SubPlayType.SD11X5_Q3_GROUP.getValue().equals(value);
    }
	/**
	 * 获取描述信息
	 * @param value
	 * @return
	 */
	public static String getSubPlayName(String value) {
		if (StringUtil.isBlank(value)) return "";
		for (SubPlayType temp : SubPlayType.values()) {
			if (temp.getValue().equals(value)) {
				return temp.getDesc();
			}
		}
		return "";
	}


}
