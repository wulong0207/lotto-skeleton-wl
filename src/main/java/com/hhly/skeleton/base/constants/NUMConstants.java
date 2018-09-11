package com.hhly.skeleton.base.constants;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.common.LotteryEnum.Lottery;
import com.hhly.skeleton.base.common.LotteryEnum.LotteryPr;
import com.hhly.skeleton.base.common.OrderEnum.CancelType;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.lottery.bo.LotBettingMulBO;

/**
 * @author huangb
 *
 * @date 2016年11月15日
 *
 * @desc 所有数字彩的常量定义(继承公共常量)
 */
public class NUMConstants extends Constants {
	
	/**
	 * 默认追号期数154
	 */
	public static final int DEFAULT_CHASE_COUNT = 154;
	/** 追号期数100 */
	public static final int CHASE_COUNT_100 = 100;
	

	/************************************* 双色球 ******************************************/
	/**
	 * 双色球开奖日：每周的二、四、日
	 */
	public static final Integer[] SSQ_LOTTERY_DAYS = new Integer[] { Calendar.TUESDAY, Calendar.THURSDAY,
			Calendar.SUNDAY };

	/** 双色球红球最小1 */
	public static final int SSQ_RED_MIN = 1;
	/** 双色球红球最大33 */
	public static final int SSQ_RED_MAX = 33;
	/** 双色球蓝球最小1 */
	public static final int SSQ_BLUE_MIN = 1;
	/** 双色球蓝球最大16 */
	public static final int SSQ_BLUE_MAX = 16;
	/** 双色球选红球范围6 */
	public static final int SSQ_CHOOSE_RED6 = 6;
	/** 双色球选红球范围33 */
	public static final int SSQ_CHOOSE_RED33 = 33;
	/** 双色球选蓝球范围1 */
	public static final int SSQ_CHOOSE_BLUE1 = 1;
	/** 双色球选蓝球范围16 */
	public static final int SSQ_CHOOSE_BLUE16 = 16;
	/** 双色球投注红球基础数6 */
	public static final int SSQ_RED_BASE_COUNT = 6;
	/** 双色球投注篮球基础数1 */
	public static final int SSQ_BLUE_BASE_COUNT = 1;
	/** 双色球选胆码范围1 */
	public static final int SSQ_CHOOSE_DAN1 = 1;
	/** 双色球选胆码范围5 */
	public static final int SSQ_CHOOSE_DAN5 = 5;
	/** 双色球选拖码范围1 */
	public static final int SSQ_CHOOSE_TUO1 = 1;
	/** 双色球选拖码范围33 */
	public static final int SSQ_CHOOSE_TUO33 = 33;
	/** 双色球选胆+拖范围6 */
	public static final int SSQ_CHOOSE_DANTUO6 = 6;
	/** 双色球选胆+拖范围33 */
	public static final int SSQ_CHOOSE_DANTUO33 = 33;
	/** 双色球：正则(红6蓝1)：单式投注  eg:01,02,03,04,05,06|10 */
	public static final String SSQ_REGEX_BET_SINGLE = "^\\d{2}(,\\d{2}){5}[\\|]\\d{2}$";
	/** 双色球：正则(红大于6蓝1，红6蓝大于1，红大于6蓝大于1)：复式投注   eg:01,02,03,04,05,06,07,08|10,12,13 */
	public static final String SSQ_REGEX_BET_MULTIPLE = "(^\\d{2}(,\\d{2}){6,32}[\\|]\\d{2}$)|(^\\d{2}(,\\d{2}){5}[\\|]\\d{2}(,\\d{2}){1,15}$)|(^\\d{2}(,\\d{2}){6,32}[\\|]\\d{2}(,\\d{2}){1,15}$)";
	/** 双色球：正则(胆1~5拖1~32蓝1~16;;注：胆拖类型仅匹配分割格式,不匹配正确性)：胆拖投注   eg:01,02#03,04,05,06,07,08|10,11 */
	public static final String SSQ_REGEX_BET_DANTUO = "^\\d{2}(,\\d{2}){0,4}#\\d{2}(,\\d{2}){0,31}[\\|]\\d{2}(,\\d{2}){0,15}$";

	/************************************* 大乐透 ******************************************/

	/** 大乐透追加单注金额 */
	public static final int DLT_ADD_SINGLE_AMOUNT = 3;
	/** 大乐透红球最小1 */
	public static final int DLT_RED_MIN = 1;
	/** 大乐透红球最大35 */
	public static final int DLT_RED_MAX = 35;
	/** 大乐透蓝球最小1 */
	public static final int DLT_BLUE_MIN = 1;
	/** 大乐透蓝球最大12 */
	public static final int DLT_BLUE_MAX = 12;
	/** 大乐透选红球范围5 */
	public static final int DLT_CHOOSE_RED5 = 5;
	/** 大乐透选红球范围35 */
	public static final int DLT_CHOOSE_RED35 = 35;
	/** 大乐透选蓝球范围1 */
	public static final int DLT_CHOOSE_BLUE1 = 1;
	/** 大乐透选蓝球范围12 */
	public static final int DLT_CHOOSE_BLUE12 = 12;
	/** 大乐透投注红球基础数5 */
	public static final int DLT_RED_BASE_COUNT = 5;
	/** 大乐透投注篮球基础数2 */
	public static final int DLT_BLUE_BASE_COUNT = 2;
	/** 大乐透选红胆范围1 */
	public static final int DLT_CHOOSE_RED_DAN1 = 1;
	/** 大乐透选红胆范围4 */
	public static final int DLT_CHOOSE_RED_DAN4 = 4;
	/** 大乐透选红拖范围1 */
	public static final int DLT_CHOOSE_RED_TUO1 = 1;
	/** 大乐透选红拖范围34 */
	public static final int DLT_CHOOSE_RED_TUO34 = 34;
	/** 大乐透红胆+红拖范围5 */
	public static final int DLT_CHOOSE_RED_DANTUO5 = 5;
	/** 大乐透红胆+红拖范围35 */
	public static final int DLT_CHOOSE_RED_DANTUO35 = 35;
	/** 大乐透选蓝胆范围0 */
	public static final int DLT_CHOOSE_BLUE_DAN0 = 0;
	/** 大乐透选蓝胆范围1 */
	public static final int DLT_CHOOSE_BLUE_DAN1 = 1;
	/** 大乐透选蓝拖范围1 */
	public static final int DLT_CHOOSE_BLUE_TUO1 = 1;
	/** 大乐透选蓝拖范围12 */
	public static final int DLT_CHOOSE_BLUE_TUO12 = 12;
	/** 大乐透蓝胆+蓝拖范围2 */
	public static final int DLT_CHOOSE_BLUE_DANTUO2 = 2;
	/** 大乐透蓝胆+蓝拖范围12 */
	public static final int DLT_CHOOSE_BLUE_DANTUO12 = 12;

	/** 大乐透：正则(红5蓝2)：单式投注 (eg:01,02,03,04,05|07,08) */
	public static final String DLT_REGEX_BET_SINGLE = "^\\d{2}(,\\d{2}){4}[\\|]\\d{2}(,\\d{2}){1}$";
	/**
	 * 大乐透：正则(红大于5蓝2，红5蓝大于2，红大于5蓝大于2)：复式投注
	 * (eg:01,02,03,04,05,06,11,12,13|01,02,03)
	 */
	public static final String DLT_REGEX_BET_MULTIPLE = "(^\\d{2}(,\\d{2}){5,34}[\\|]\\d{2}(,\\d{2}){1}$)|(^\\d{2}(,\\d{2}){4}[\\|]\\d{2}(,\\d{2}){2,11}$)|(^\\d{2}(,\\d{2}){5,34}[\\|]\\d{2}(,\\d{2}){2,11}$)";
	/**
	 * 大乐透：正则(红胆1~4红拖1~34蓝胆0~1蓝拖1~12;;注：胆拖类型仅匹配分割格式,不匹配正确性)：胆拖投注(eg:01,02#03,04,
	 * 05,06,07,08|11,12;;01,02#03,04,05,06,07,08|08#11,12)
	 */
	public static final String DLT_REGEX_BET_DANTUO = "^\\d{2}(,\\d{2}){0,3}#\\d{2}(,\\d{2}){0,33}[\\|](\\d{2}#)?\\d{2}(,\\d{2}){0,11}$";

	/************************************* 福彩3D ******************************************/
	/** 福彩3D：最小号码0 */
	public static final int F3D_MIN_0 = 0;
	/** 福彩3D：最大号码9 */
	public static final int F3D_MAX_9 = 9;
	/** 福彩3D：选号个数范围1 */
	public static final int F3D_CHOOSE_1 = 1;
	/** 福彩3D：选号个数范围2 */
	public static final int F3D_CHOOSE_2 = 2;
	/** 福彩3D：选号个数范围3 */
	public static final int F3D_CHOOSE_3 = 3;
	/** 福彩3D：选号个数范围4 */
	public static final int F3D_CHOOSE_4 = 4;
	/** 福彩3D：选号个数范围9 */
	public static final int F3D_CHOOSE_9 = 9;
	/** 福彩3D：选号个数范围10 */
	public static final int F3D_CHOOSE_10 = 10;
	/** 福彩3D：选号个数范围20 */
	public static final int F3D_CHOOSE_20 = 20;
	/** 福彩3D：选号个数范围22 */
	public static final int F3D_CHOOSE_22 = 22;
	/** 福彩3D：选号个数范围26 */
	public static final int F3D_CHOOSE_26 = 26;
	/** 福彩3D：选号个数范围28 */
	public static final int F3D_CHOOSE_28 = 28;
	/** 福彩3D：选号个数范围30 */
	public static final int F3D_CHOOSE_30 = 30;
	/** 福彩3D：直选和值最小号码0 */
	public static final int F3D_DIRECT_SUM_MIN_0 = 0;
	/** 福彩3D：直选和值最大号码27 */
	public static final int F3D_DIRECT_SUM_MAX_27 = 27;
	/** 福彩3D：组三和值最小号码1 */
	public static final int F3D_G3_SUM_MIN_1 = 1;
	/** 福彩3D：组三和值最大号码26 */
	public static final int F3D_G3_SUM_MAX_26 = 26;
	/** 福彩3D：组六和值最小号码3 */
	public static final int F3D_G6_SUM_MIN_3 = 3;
	/** 福彩3D：组六和值最大号码24 */
	public static final int F3D_G6_SUM_MAX_24 = 24;
	
	
	/** 福彩3D：正则(百位1个号码、十位1个号码、个位1个号码；每个号码1位数)：直选单式投注 (eg:1|2|3) */
	public static final String F3D_REGEX_DIRECT_SINGLE = "^\\d{1}[\\|]\\d{1}[\\|]\\d{1}$";
	/**
	 * 福彩3D：正则(百、十、个区域每个区域1~10个号码；每个号码1位数)：直选复式投注 (eg:1,2,3,4|1,2,3|2,3)
	 */
	public static final String F3D_REGEX_DIRECT_MULTIPLE = "^\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}$";
	/**
	 * 福彩3D：正则(1~28个号码；0-9的号码是1位数，9以后的号码是2位数)：直选和值投注(eg:0,1,2,3,27)
	 */
	public static final String F3D_REGEX_DIRECT_SUM = "^(\\d{1}|[1-9]\\d{1})(,(\\d{1}|[1-9]\\d{1})){0,27}$";
	
	/** 福彩3D：正则(3个号码；每个号码1位数)：组三单式投注 (eg:1,1,0) （支持直接出票）
	 * 20170701 add 福彩3D：正则(分前后区，每区1个号码；每个号码1位数)：组三直选单式投注 (eg:1|0)（等同于上面的单式，需要转成上面的格式才能出票） 
	 * */
	public static final String F3D_REGEX_G3_SINGLE = "(^\\d{1},\\d{1},\\d{1}$)|(^\\d{1}[\\|]\\d{1}$)";
	/**
	 * 福彩3D：正则(2~10个号码；每个号码1位数)：组三复式投注 (eg:0,1,2,3)（支持直接出票）
	 * 20170701 add 福彩3D：正则(分前后区，每区1~10个号码；每个号码1位数)：组三直选复式投注 (eg:0,1,2,3,4,5,6,7,8,9|0,1,2,3,4,5,6,7,8,9)（等同于上面的复式，需要转成上面的格式才能出票） 
	 */
	public static final String F3D_REGEX_G3_MULTIPLE = "(^\\d{1}(,\\d{1}){1,9}$)|(^\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}$)";
	/**
	 * 福彩3D：正则(1~26个号码；0-9的号码是1位数，9以后的号码是2位数)：组三和值投注(eg:1,2,3,26)
	 */
	public static final String F3D_REGEX_G3_SUM = "^(\\d{1}|[1-9]\\d{1})(,(\\d{1}|[1-9]\\d{1})){0,25}$";
	
	/** 福彩3D：正则(3个号码；每个号码1位数)：组六单式投注 (eg:0,1,2) */
	public static final String F3D_REGEX_G6_SINGLE = "^\\d{1},\\d{1},\\d{1}$";
	/**
	 * 福彩3D：正则(4~10个号码；每个号码1位数)：组六复式投注 (eg:0,1,2,3,4)
	 */
	public static final String F3D_REGEX_G6_MULTIPLE = "^\\d{1}(,\\d{1}){3,9}$";
	/**
	 * 福彩3D：正则(胆1~2  拖1~9；每个号码1位数)：组六胆拖投注 (eg:0,1#3,4)
	 */
	public static final String F3D_REGEX_G6_DANTUO = "^\\d{1}(,\\d{1}){0,1}#\\d{1}(,\\d{1}){0,8}$";
	/**
	 * 福彩3D：正则(1~22个号码；0-9的号码是1位数，9以后的号码是2位数)：组六和值投注(eg:3,5,24)
	 */
	public static final String F3D_REGEX_G6_SUM = "^(\\d{1}|[1-9]\\d{1})(,(\\d{1}|[1-9]\\d{1})){0,21}$";
	/**
	 * 福彩3D：直选和值-注数对应表
	 */
	public static final Map<Integer, Integer> F3D_DIRECT_SUM_BETNUM = new HashMap<Integer, Integer>();
	static {
		F3D_DIRECT_SUM_BETNUM.put(NUM_0, NUM_1);
		F3D_DIRECT_SUM_BETNUM.put(NUM_1, NUM_3);
		F3D_DIRECT_SUM_BETNUM.put(NUM_2, NUM_6);
		F3D_DIRECT_SUM_BETNUM.put(NUM_3, NUM_10);
		F3D_DIRECT_SUM_BETNUM.put(NUM_4, NUM_15);
		F3D_DIRECT_SUM_BETNUM.put(NUM_5, NUM_21);
		F3D_DIRECT_SUM_BETNUM.put(NUM_6, NUM_28);
		F3D_DIRECT_SUM_BETNUM.put(NUM_7, NUM_36);
		F3D_DIRECT_SUM_BETNUM.put(NUM_8, NUM_45);
		F3D_DIRECT_SUM_BETNUM.put(NUM_9, NUM_55);
		F3D_DIRECT_SUM_BETNUM.put(NUM_10, NUM_63);
		F3D_DIRECT_SUM_BETNUM.put(NUM_11, NUM_69);
		F3D_DIRECT_SUM_BETNUM.put(NUM_12, NUM_73);
		F3D_DIRECT_SUM_BETNUM.put(NUM_13, NUM_75);
		F3D_DIRECT_SUM_BETNUM.put(NUM_14, NUM_75);
		F3D_DIRECT_SUM_BETNUM.put(NUM_15, NUM_73);
		F3D_DIRECT_SUM_BETNUM.put(NUM_16, NUM_69);
		F3D_DIRECT_SUM_BETNUM.put(NUM_17, NUM_63);
		F3D_DIRECT_SUM_BETNUM.put(NUM_18, NUM_55);
		F3D_DIRECT_SUM_BETNUM.put(NUM_19, NUM_45);
		F3D_DIRECT_SUM_BETNUM.put(NUM_20, NUM_36);
		F3D_DIRECT_SUM_BETNUM.put(NUM_21, NUM_28);
		F3D_DIRECT_SUM_BETNUM.put(NUM_22, NUM_21);
		F3D_DIRECT_SUM_BETNUM.put(NUM_23, NUM_15);
		F3D_DIRECT_SUM_BETNUM.put(NUM_24, NUM_10);
		F3D_DIRECT_SUM_BETNUM.put(NUM_25, NUM_6);
		F3D_DIRECT_SUM_BETNUM.put(NUM_26, NUM_3);
		F3D_DIRECT_SUM_BETNUM.put(NUM_27, NUM_1);
	}
	/**
	 * 福彩3D：组三和值-注数对应表
	 */
	public static final Map<Integer, Integer> F3D_G3_SUM_BETNUM = new HashMap<Integer, Integer>();
	static {
		F3D_G3_SUM_BETNUM.put(NUM_1, NUM_1);
		F3D_G3_SUM_BETNUM.put(NUM_2, NUM_2);
		F3D_G3_SUM_BETNUM.put(NUM_3, NUM_1);
		F3D_G3_SUM_BETNUM.put(NUM_4, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_5, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_6, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_7, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_8, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_9, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_10, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_11, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_12, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_13, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_14, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_15, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_16, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_17, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_18, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_19, NUM_5);
		F3D_G3_SUM_BETNUM.put(NUM_20, NUM_4);
		F3D_G3_SUM_BETNUM.put(NUM_21, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_22, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_23, NUM_3);
		F3D_G3_SUM_BETNUM.put(NUM_24, NUM_1);
		F3D_G3_SUM_BETNUM.put(NUM_25, NUM_2);
		F3D_G3_SUM_BETNUM.put(NUM_26, NUM_1);
	}
	/**
	 * 福彩3D：组六和值-注数对应表
	 */
	public static final Map<Integer, Integer> F3D_G6_SUM_BETNUM = new HashMap<Integer, Integer>();
	static {
		F3D_G6_SUM_BETNUM.put(NUM_3, NUM_1);
		F3D_G6_SUM_BETNUM.put(NUM_4, NUM_1);
		F3D_G6_SUM_BETNUM.put(NUM_5, NUM_2);
		F3D_G6_SUM_BETNUM.put(NUM_6, NUM_3);
		F3D_G6_SUM_BETNUM.put(NUM_7, NUM_4);
		F3D_G6_SUM_BETNUM.put(NUM_8, NUM_5);
		F3D_G6_SUM_BETNUM.put(NUM_9, NUM_7);
		F3D_G6_SUM_BETNUM.put(NUM_10, NUM_8);
		F3D_G6_SUM_BETNUM.put(NUM_11, NUM_9);
		F3D_G6_SUM_BETNUM.put(NUM_12, NUM_10);
		F3D_G6_SUM_BETNUM.put(NUM_13, NUM_10);
		F3D_G6_SUM_BETNUM.put(NUM_14, NUM_10);
		F3D_G6_SUM_BETNUM.put(NUM_15, NUM_10);
		F3D_G6_SUM_BETNUM.put(NUM_16, NUM_9);
		F3D_G6_SUM_BETNUM.put(NUM_17, NUM_8);
		F3D_G6_SUM_BETNUM.put(NUM_18, NUM_7);
		F3D_G6_SUM_BETNUM.put(NUM_19, NUM_5);
		F3D_G6_SUM_BETNUM.put(NUM_20, NUM_4);
		F3D_G6_SUM_BETNUM.put(NUM_21, NUM_3);
		F3D_G6_SUM_BETNUM.put(NUM_22, NUM_2);
		F3D_G6_SUM_BETNUM.put(NUM_23, NUM_1);
		F3D_G6_SUM_BETNUM.put(NUM_24, NUM_1);
	}

	/************************************* 排列三 ******************************************/
	
	/** 排列三：选号个数范围3 => 等同福彩3d规则*/
	public static final int PL3_CHOOSE_3 = F3D_CHOOSE_3;
	/** 排列三：选号个数范围4 => 等同福彩3d规则*/
	public static final int PL3_CHOOSE_4 = F3D_CHOOSE_4;
	/** 排列三：选号个数范围10 => 等同福彩3d规则*/
	public static final int PL3_CHOOSE_10 = F3D_CHOOSE_10;
	/** 排列三：选号个数范围20 => 等同福彩3d规则*/
	public static final int PL3_CHOOSE_20 = F3D_CHOOSE_20;
	/** 排列三：选号个数范围30 => 等同福彩3d规则*/
	public static final int PL3_CHOOSE_30 = F3D_CHOOSE_30;
	/** 排列三：直选和值最小号码0 => 等同福彩3d规则*/
	public static final int PL3_DIRECT_SUM_MIN_0 = F3D_DIRECT_SUM_MIN_0;
	/** 排列三：直选和值最大号码27 => 等同福彩3d规则*/
	public static final int PL3_DIRECT_SUM_MAX_27 = F3D_DIRECT_SUM_MAX_27;
	/** 排列三：组三和值最小号码1 => 等同福彩3d规则*/
	public static final int PL3_G3_SUM_MIN_1 = F3D_G3_SUM_MIN_1;
	/** 排列三：组三和值最大号码26 => 等同福彩3d规则*/
	public static final int PL3_G3_SUM_MAX_26 = F3D_G3_SUM_MAX_26;
	/** 排列三：组六和值最小号码3 => 等同福彩3d规则*/
	public static final int PL3_G6_SUM_MIN_3 = F3D_G6_SUM_MIN_3;
	/** 排列三：组六和值最大号码24 => 等同福彩3d规则*/
	public static final int PL3_G6_SUM_MAX_24 = F3D_G6_SUM_MAX_24;
	
	/** 排列三：正则(百位1个号码、十位1个号码、个位1个号码；每个号码1位数)：直选单式投注 (eg:1|2|3) => 等同福彩3d规则 */
	public static final String PL3_REGEX_DIRECT_SINGLE = F3D_REGEX_DIRECT_SINGLE;
	/**
	 * 排列三：正则(百、十、个区域每个区域1~10个号码；每个号码1位数)：直选复式投注 (eg:1,2,3,4|1,2,3|2,3) => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_DIRECT_MULTIPLE = F3D_REGEX_DIRECT_MULTIPLE;
	/**
	 * 排列三：正则(1~28个号码；0-9的号码是1位数，9以后的号码是2位数)：直选和值投注(eg:0,1,2,3,27) => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_DIRECT_SUM = F3D_REGEX_DIRECT_SUM;
	
	/** 排列三：正则(3个号码；每个号码1位数)：组三单式投注 (eg:1,1,0) （支持直接出票）
	 * 20170701 add 福彩3D：正则(分前后区，每区1个号码；每个号码1位数)：组三直选单式投注 (eg:1|0)（等同于上面的单式，需要转成上面的格式才能出票）  => 等同福彩3d规则
	 * */
	public static final String PL3_REGEX_G3_SINGLE = F3D_REGEX_G3_SINGLE;
	/**
	 * 排列三：正则(2~10个号码；每个号码1位数)：组三复式投注 (eg:0,1,2,3)（支持直接出票）     => 等同福彩3d规则
	 * 20170701 add 福彩3D：正则(分前后区，每区1~10个号码；每个号码1位数)：组三直选复式投注 (eg:0,1,2,3,4,5,6,7,8,9|0,1,2,3,4,5,6,7,8,9)（等同于上面的复式，需要转成上面的格式才能出票） 
	 */
	public static final String PL3_REGEX_G3_MULTIPLE = F3D_REGEX_G3_MULTIPLE;
	/**
	 * 排列三：正则(1~26个号码；0-9的号码是1位数，9以后的号码是2位数)：组三和值投注(eg:1,2,3,26)  => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_G3_SUM = F3D_REGEX_G3_SUM;
	
	/** 排列三：正则(3个号码；每个号码1位数)：组六单式投注 (eg:0,1,2)  => 等同福彩3d规则*/
	public static final String PL3_REGEX_G6_SINGLE = F3D_REGEX_G6_SINGLE;
	/**
	 * 排列三：正则(4~10个号码；每个号码1位数)：组六复式投注 (eg:0,1,2,3,4) => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_G6_MULTIPLE = F3D_REGEX_G6_MULTIPLE;
	/**
	 * 排列三：正则(胆1~2  拖1~9；每个号码1位数)：组六胆拖投注 (eg:0,1#3,4)  => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_G6_DANTUO = F3D_REGEX_G6_DANTUO;
	/**
	 * 排列三：正则(1~22个号码；0-9的号码是1位数，9以后的号码是2位数)：组六和值投注(eg:3,5,24)  => 等同福彩3d规则
	 */
	public static final String PL3_REGEX_G6_SUM = F3D_REGEX_G6_SUM;
	/**
	 * 排列三：直选和值-注数对应表     => 等同福彩3d规则
	 */
	public static final Map<Integer, Integer> PL3_DIRECT_SUM_BETNUM = F3D_DIRECT_SUM_BETNUM;
	/**
	 * 排列三：组三和值-注数对应表     => 等同福彩3d规则
	 */
	public static final Map<Integer, Integer> PL3_G3_SUM_BETNUM = F3D_G3_SUM_BETNUM;
	/**
	 * 排列三：组六和值-注数对应表     => 等同福彩3d规则
	 */
	public static final Map<Integer, Integer> PL3_G6_SUM_BETNUM = F3D_G6_SUM_BETNUM;
	
	/************************************* 排列五 ******************************************/
	/** 排列五：选号最小值0 */
	public static final int PL5_NUM_MIN = 0;
	/** 排列五：选号最大值9 */
	public static final int PL5_NUM_MAX = 9;
	/** 排列五：选号个数范围5 */
	public static final int PL5_CHOOSE_5 = 5;
	/** 排列五：选号个数范围6 */
	public static final int PL5_CHOOSE_6 = 6;
	/** 排列五：选号个数范围50 */
	public static final int PL5_CHOOSE_50 = 50;
	/** 排列五：五个区域选号最大注数100000 */
	public static final int PL5_MAX_BETNUM = 100000;
	/** 排列五：正则(万位1个号码、千位1个号码、百位1个号码、十位1个号码、个位1个号码；每个号码1位数)：直选单式投注 (eg:1|2|3|4|5) */
	public static final String PL5_REGEX_DIRECT_SINGLE = "^\\d{1}[\\|]\\d{1}[\\|]\\d{1}[\\|]\\d{1}[\\|]\\d{1}$";
	/**
	 * 排列五：正则(万、千、百、十、个区域每个区域1~10个号码；每个号码1位数)：直选复式投注 (eg:0,1,2|1,2,3|2,3,4|4,5,6|5,6,9)
	 */
	public static final String PL5_REGEX_DIRECT_MULTIPLE = "^\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}[\\|]\\d{1}(,\\d{1}){0,9}$";
	
	/************************************* 七乐彩 ******************************************/
	/** 七乐彩：最小号码1 */
	public static final int QLC_NUM_MIN = 1;
	/** 七乐彩：最大号码30 */
	public static final int QLC_NUM_MAX = 30;
	/** 七乐彩：选号个数范围7 */
	public static final int QLC_CHOOSE_7 = 7;
	/** 七乐彩：选号个数范围30 */
	public static final int QLC_CHOOSE_30 = 30;
	
	/** 七乐彩：正则(7个号码)：单式投注  eg:01,02,03,04,05,06,07 */
	public static final String QLC_REGEX_PT_SINGLE = "^\\d{2}(,\\d{2}){6}$";
	/** 七乐彩：正则(8~30个号码)：复式投注   eg:01,02,03,04,05,06,07,08,09,10 */
	public static final String QLC_REGEX_PT_MULTIPLE = "^\\d{2}(,\\d{2}){7,29}$";
	/** 七乐彩：正则(胆1~6 拖1~29 胆+拖7~30;;注：胆拖类型仅匹配分割格式,不匹配正确性)：胆拖投注   eg:01,02,03,04,05,06#07,08,09,10 */
	public static final String QLC_REGEX_DT_DANTUO = "^\\d{2}(,\\d{2}){0,5}#\\d{2}(,\\d{2}){0,28}$";
	
	
	/************************************* 七星彩 ******************************************/
	public static final String QXC_REGEX_NORMAL_SINGLE = "^[0-9](\\|[0-9]){6}$";
	public static final String QXC_REGEX_NORMAL_MULTIPLE = "^[0-9](,[0-9]){0,9}(\\|[0-9](,[0-9]){0,9}){6}$";
	public static final int QXC_CHASE_COUNT = 100;
	public static final int QXC_MAX_BETNUM = 10000000;
	/************************************* 七星彩 ******************************************/

	
	
	
	
	/*************************************以下为数字彩公用方法定义 ******************************************/
	/**
	 * @desc 获取支付边界值（也叫延迟支付时长），高频为30s,低频和竞技彩为2分钟
	 * @author huangb
	 * @date 2017年5月24日
	 * @param lotteryCode
	 *            彩种
	 * @return 获取支付边界值
	 */
	public static int getPayEdgeVal(Integer lotteryCode) {
		// 支付边界值（延迟支付时长）
		LotteryPr lotType = LotteryEnum.getLottery(lotteryCode);
		if (null == lotType) {
			return Constants.PAY_END_TIME_THIRTY;
		}
		switch (lotType) {
		case GPC:
			return Constants.PAY_END_TIME_THIRTY; // 高频的支付延迟时长为30s
		default:
			return Constants.PAY_END_TIME_TWELVE; // 低频和竞技彩为2分钟(120s)
		}
	}
	
	/**
	 * @desc 获取支付时间节点集合（按注数限制控制）<br>
	 *       举例：<br>
	 *       双色球的本站截止时间为19:50;<br>
	 *       按双色球的注、倍数配置;<br>
	 *       每个配置时间点的延迟支付时长是2分钟(高频的30s),即支付边界值定义；<br>
	 *       1000注以上的订单下单时间是距离本站截止时间的3600s(即18:50),则支付最晚时间点是18:52(计算规则：19:50-
	 *       3600s+120s(120s是支付边界值))<br>
	 *       500注以上的订单下单时间是距离本站截止时间的1800s(即19:20),则支付最晚时间点是19:22(计算规则：19:50-
	 *       1800s+120s(120s是支付边界值))<br>
	 *       100注以上的订单下单时间是距离本站截止时间的1200s(即19:30),则支付最晚时间点是19:32(计算规则：19:50-
	 *       1200s+120s(120s是支付边界值))<br>
	 *       50注以上的订单下单时间是距离本站截止时间的600s(即19:40),则支付最晚时间点是19:42(计算规则：19:50-600s+
	 *       120s(120s是支付边界值))<br>
	 *       20注以上的订单下单时间是距离本站截止时间的1s(即19:50),则支付最晚时间点是19:52(计算规则：19:50-1s+120s(
	 *       120s是支付边界值))<br>
	 * @author huangb
	 * @date 2017年5月25日
	 * @param lotteryCode
	 *            彩种code
	 * @param betMulCfg
	 *            注数限制控制集合(key:距离截止时长（s）,value：最大总注数)
	 * @param saleEndTime
	 *            销售截止时间
	 * @param isDelay
	 * 			 是否需要延期进行处理            
	 * @return 获取支付时间节点集合（按注数限制控制）(key:时长点,value：最大总注数)
	 */
	public static Map<Long, Integer> getPayDates(Integer lotteryCode, LinkedHashMap<Integer, Integer> betMulCfg,
			Date saleEndTime,boolean isDelay) {
		if (lotteryCode == null || saleEndTime == null) {
			return null;
		}
		Map<Long, Integer> datesMap = new LinkedHashMap<Long, Integer>();
		// 1.支付边界值
		int payEdgeVal = 0;
		if(isDelay){
			payEdgeVal = getPayEdgeVal(lotteryCode);
		}
		// 2.按注、倍数配置执行的时间节点
		if (!ObjectUtil.isBlank(betMulCfg)) {
			Date t = null;
			int i = Constants.NUM_1;
			for (Entry<Integer, Integer> entry : betMulCfg.entrySet()) {
				t = DateUtil.addSecond(saleEndTime, -entry.getKey() + payEdgeVal);// 参考方法描述的计算规则
				// 如果是最后一条配置，则设置最大总注数=0，即最后一个时间节点处理掉所有数据
				if (i == betMulCfg.size()) {
					datesMap.put(t.getTime(), Constants.NUM_0);
				} else {
					datesMap.put(t.getTime(), entry.getValue());
				}
				i++;
			}
		}
		// 3.最后加一条销售截止的时间配置(以防没有配置节点)
		if (datesMap.isEmpty()) {
			datesMap.put(saleEndTime.getTime() + payEdgeVal * 1000, Constants.NUM_0);
		}

		return datesMap;
	}

	/**
	 * @desc 按购买注数获取对应支付时间
	 * @author huangb
	 * @date 2017年5月25日
	 * @param lotteryCode
	 *            彩种
	 * @param betMulCfg
	 *            注数限制控制集合(key:距离截止时长（s）,value：最大总注数)
	 * @param saleEndTime
	 *            销售截止时间
	 * @param totalBuyNum
	 *            订单总注数
	 * @return 按总注数获取对应的支付时间
	 */
	public static Date getPayDateByBuyNum(Integer lotteryCode, LinkedHashMap<Integer, Integer> betMulCfg,
			Date saleEndTime, Integer totalBuyNum) {
		Map<Long, Integer> payDates = getPayDates(lotteryCode, betMulCfg, saleEndTime,true);
		if (ObjectUtil.isBlank(payDates)) {
			return new Date(); // 如果没有时间点，则返回当前时间点作为支付时间点
		}
		totalBuyNum = (totalBuyNum == null) ? NUM_1 : totalBuyNum; // 总投注数没有则默认1
		for (Entry<Long, Integer> entry : payDates.entrySet()) {
			if (totalBuyNum.intValue() >= entry.getValue().intValue()) {
				return new Date(entry.getKey());
			}
		}
		return new Date(); // 如果没有时间点，则返回当前时间点作为支付时间点
	}
	
	/**
	 * @desc 计算获取追号计划的支付截止时间<br>
	 *       规则1:取方案明细中的最大注数作为目标注数，取追号期列表中的当前期的倍数作为目标倍数（注：如果追号计划不包含当前期，则设置目标注数为1
	 *       ，目标倍数为1，即意味着支付截止时间可以取最小配置的时间节点）<br>
	 *       规则2:先找出目标注数对应的配置时间节点，再找出目标倍数对应的配置时间节点，最后取两者中较大的时间节点作为最终计算的节点<br>
	 *       规则3：取当期销售的截止时间-最终的时间节点=追号计划的支付截止时间
	 * @author huangb
	 * @date 2017年11月21日
	 * @param lotBetMulCfg
	 *            注/倍数配置列表
	 * @param saleEndTime
	 *            当期本站销售截止时间
	 * @param targetBetNum
	 *            目标注数(订单明细中最大注数)
	 * @param targetMulNum
	 *            目标倍数(追号期列表中的当前期倍数，如果不含当前期，则可设定为1)
	 * @return 计算获取追号计划的支付截止时间
	 */
	public static Date getPayEndTime(List<LotBettingMulBO> lotBetMulCfg, Date saleEndTime, int targetBetNum,
			int targetMulNum) {
		// 1.无论是否配置了注、倍数，最后都加一条最小的时间节点(0秒)配置
		lotBetMulCfg = (null == lotBetMulCfg) ? new ArrayList<LotBettingMulBO>() : lotBetMulCfg;
		lotBetMulCfg.add(new LotBettingMulBO(NUM_1, NUM_1, NUM_0));

		// 2.先找出目标注数对应的配置时间节点，再找出目标倍数对应的配置时间节点，最后取两者中较大的时间节点作为最终计算的节点
		int betNumTimeCfg = NUM_0;
		int mulNumTimeCfg = NUM_0;
		for (LotBettingMulBO temp : lotBetMulCfg) {
			// 加betNumTimeCfg == NUM_0，可以断定找到符合的第一条注数配置时间节点后，后面的注数配置时间节点不再考虑
			if (betNumTimeCfg == NUM_0 && targetBetNum >= temp.getBettindNum()) {
				betNumTimeCfg = temp.getEndTime();
			}
			// 同上
			if (mulNumTimeCfg == NUM_0 && targetMulNum >= temp.getMultipleNum()) {
				mulNumTimeCfg = temp.getEndTime();
			}
		}
		int targetTimeCfg = (betNumTimeCfg >= mulNumTimeCfg) ? betNumTimeCfg : mulNumTimeCfg;

		// 3.取当期销售的截止时间-最终的时间节点=追号计划的支付截止时间
		return DateUtil.addSecond(saleEndTime, -targetTimeCfg);
	}
	
	/**
	 * @desc 获取截止检票时间，公式：最后检票时间 = 彩期官方截止出票时间 + 彩种最后检票提前时间秒
	 * @author huangb
	 * @date 2017年8月8日
	 * @param officialEndTime 官方截止出票时间
	 * @param endCheckTimeSec 彩种最后检票提前时间秒(彩种表配置)
	 * @return 获取截止检票时间
	 */
	public static Date getEndCheckTime(Date officialEndTime, Integer endCheckTimeSec) {
		if (officialEndTime == null) {
			return null;
		}
		// 检票提前时间秒处理
		endCheckTimeSec = (null == endCheckTimeSec) ? NUM_0 : endCheckTimeSec;
		return DateUtil.addSecond(officialEndTime, endCheckTimeSec);
	}
	
	/**
	 * @desc 获取不同彩种的默认撤单原因<br>
	 *       1.中心通讯故障：竞彩，北单，胜负彩，双色球，大乐透，七星彩，七乐彩，排列五<br>
	 *       2.中心限号原因：所有高频彩，福彩3D 排列3<br>
	 * @author huangb
	 * @date 2017年8月24日
	 * @param lotteryCode
	 *            彩种id
	 * @return 获取不同彩种的默认撤单原因
	 */
	public static String getCancelReason(Integer lotteryCode) {
		if (!Lottery.contain(lotteryCode)) {
			return "";
		}
		// 1.先彩种类型分类
		LotteryPr lott = LotteryEnum.getLottery(lotteryCode);
		switch (lott) {
		case GPC:
			// 高频彩撤单原因为空的默认值
			return CancelType.LIMIT.getDesc();
		case SZC:
			// 数字彩->福3d和排3 撤单原因为空的默认值
			if (Lottery.F3D.getName() == lotteryCode || Lottery.PL3.getName() == lotteryCode) {
				return CancelType.LIMIT.getDesc();
			} else {// 数字彩->非福3d和排3 撤单原因为空的默认值
				return CancelType.TRANS.getDesc();
			}
		case ZC:
		case JJC:
		case BJDC:
		case GYJ:  // 20180328  冠亚军彩种撤单原因
			// 非高频彩撤单原因为空的默认值
			return CancelType.TRANS.getDesc();
		default:
			return CancelType.TRANS.getDesc();
		}
	}
	
	/**
	 * 
	 * @Description 获取数字彩追号最大期数
	 * @author HouXiangBao289
	 * @param lotCode
	 * @return
	 */
	public static int getLotChaseCount(int lotCode){
		Lottery lottery = LotteryEnum.Lottery.getLottery(lotCode);
		switch(lottery){
			case SSQ://双色球
			case QLC://七乐彩
			case DLT://大乐透
			case PL5://排列5
			case PL3://排列3
			case F3D://福彩3D
			case LHC://六合彩
			case QXC://七星彩
				return NUMConstants.DEFAULT_CHASE_COUNT;
			case CQSSC://重庆时时彩
				return HighConstants.CQSSC_MAX_CHASE;
			case JXSSC://江西时时彩
				return HighConstants.JXSSC_MAX_CHASE;
			case XJSSC://新疆时时彩
				return HighConstants.XJSSC_MAX_CHASE;
			case YNSSC://云南时时彩
				return HighConstants.YNSSC_MAX_CHASE;
			case TJSSC://天津时时彩
				return HighConstants.TJSSC_MAX_CHASE;
			case D11X5://广东11选5
				return HighConstants.DX115_MAX_CHASE;
			case HB11X5://湖北11选5
				return HighConstants.HBX115_MAX_CHASE;
			case JS11X5://江苏11选5
				return HighConstants.JSX115_MAX_CHASE;
			case JX11X5://江西11选5
				return HighConstants.JXX115_MAX_CHASE;
			case LN11X5://辽宁11选5
				return HighConstants.LNX115_MAX_CHASE;
			case SD11X5://山东11选5
				return HighConstants.SDX115_MAX_CHASE;
			case XJ11X5://新疆11选5
				return HighConstants.XJX115_MAX_CHASE;
			case HNKL10://湖南快乐10分
				return HighConstants.HNKL10_MAX_CHASE;
			case DKL10://广东快乐10分
				return HighConstants.DKL10_MAX_CHASE;
			case CQKL10://幸运农场(重庆快乐10分)
				return HighConstants.CQKL10_MAX_CHASE;
			case PK10://北京赛车
				return HighConstants.PK10_MAX_CHASE;
			case BJKL8://北京快乐8
				return HighConstants.BJKL8_MAX_CHASE;
			case GXK3://广西快3
				return HighConstants.GXK3_MAX_CHASE;
			case AHK3://安徽块3
				return HighConstants.AHK3_MAX_CHASE;
			case JLK3://吉林块3
				return HighConstants.JLK3_MAX_CHASE;
			case JSK3://江苏快3
				return HighConstants.JSK3_MAX_CHASE;
			case JXK3://江西快3
				return HighConstants.JXK3_MAX_CHASE;
			case SHSSL://上海时时
				return HighConstants.SHSSL_MAX_CHASE;
			case SDPOKER://山东快乐扑克3
				return HighConstants.SDPOKER_MAX_CHASE;
			default:
				return 0;
		}
	}


	public static void main(String[] args) {
		/*Integer lotteryCode = 100;
		LinkedHashMap<Integer, Integer> betMulCfg = new LinkedHashMap<>();
		betMulCfg.put(3600, 1000);
		betMulCfg.put(1800, 500);
		Date saleEndTime = new Date();
		System.out.println(saleEndTime);
		Integer totalBuyNum = 1000;
		System.out.println(getPayDateByBuyNum(lotteryCode, betMulCfg, saleEndTime, totalBuyNum));
		System.out.println(getPayDateByBuyNum(betMulCfg, saleEndTime, totalBuyNum));;*/
		System.out.println(F3D_DIRECT_SUM_BETNUM.get(Integer.valueOf("1")));
	}
}
