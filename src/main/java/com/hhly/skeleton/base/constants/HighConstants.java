package com.hhly.skeleton.base.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class HighConstants {

	/*********************************高频彩公用常量 start***********************************************************/
	/*
	 * TODO 要确定  查询默认期数
	 */
	public static final int QRY_DEFAULT_ISSUE_COUNT = 10;
	/*
	 * 高频彩提供号码的组选（直选）走势、遗漏信息、和值走势、形态走势（10、20、30、50期内四种数据）
	 */
	public static final int QRY_MAX_ISSUE_COUNT = 50;
	
	/*********************************高频彩公用常量       end***********************************************************/
	
	/*********************************追号相关常量 start***********************************************************/
	// 重庆时时彩需求.docx 41页  追号期数最高可追彩期两天的期数，如11选5每天的期数为87期，那么最高的追号期数为174期；
	// 山东11选5
	public static final int SDX115_MAX_CHASE = 87*2;
	// 广东11选5每天84期
	public static final int DX115_MAX_CHASE = 84*2;
	// 江西11选5
	public static final int JXX115_MAX_CHASE = 84*2;
	//广西11选5
	public static final int GXX115_MAX_CHASE = 90*2;
	// 湖北11选5
	public static final int HBX115_MAX_CHASE = 81*2;
	// 江苏11选5
	public static final int JSX115_MAX_CHASE = 82*2;
	// 新疆11选5
	public static final int XJX115_MAX_CHASE = 97*2;
	// 辽宁11选5
	public static final int LNX115_MAX_CHASE = 83*2;
	// 江苏快3
	public static final int JSK3_MAX_CHASE = 82*2;
	// 江西快3
	public static final int JXK3_MAX_CHASE = 84*2;
	// 广西快3
	public static final int GXK3_MAX_CHASE = 78*2;
	// 安徽快3
	public static final int AHK3_MAX_CHASE = 80*2;
	// 吉林快3
	public static final int JLK3_MAX_CHASE = 87*2;
	// 上海时时乐
	public static final int SHSSL_MAX_CHASE = 23*2;
	// 江西时时彩
	public static final int JXSSC_MAX_CHASE = 84*2;
	// 新疆时时彩
	public static final int XJSSC_MAX_CHASE = 96*2;
	// 云南时时彩
	public static final int YNSSC_MAX_CHASE = 72*2;
	// 天津时时彩
	public static final int TJSSC_MAX_CHASE = 84*2;
	// 重庆时时彩每天120期
	public static final int CQSSC_MAX_CHASE = 120*2;
	// 山东快乐扑克3每天88期
	public static final int SDPOKER_MAX_CHASE = 88*2;
	// 重庆快乐10分每天97期
	public static final int CQKL10_MAX_CHASE = 97*2;
	// 广东快乐10分每天84期
	public static final int DKL10_MAX_CHASE = 84*2;
	// 湖南快乐10分每天84期
	public static final int HNKL10_MAX_CHASE = 84*2;
	// 北京赛车
	public static final int PK10_MAX_CHASE = 179*2;
	// 北京快乐8
	public static final int BJKL8_MAX_CHASE = 180*2;
	
	
	/*********************************追号相关常量       end***********************************************************/

	/*********************************快乐扑克相关常量 start***********************************************************/
	// 注意程序中不能修改
	public static final String [] POKER_NUM_RANGE = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	// 花色:黑桃同花：1T; 红心同花：2T; 梅花同花：3T; 方块同花：4T; 同花包选：AT；
	public static final String [] POKER_SAME_NUM_RANGE = {"1T", "2T","3T","4T","AT"};
	public static final String [] POKER_SEQUENCE_NUM_RANGE = {"A23","234","345","456","567","678","789","8910","910J","10JQ","JQK","QKA","XYZ"};
	// 黑桃同花顺：1S; 红心同花顺：2S; 梅花同花顺：3S; 方块同花顺：4S; 同花顺包选：AS;
	// 同花顺没做
	//public static final String [] POKER_SAME_SEQUENCE_NUM_RANGE = {"1S","2S","3S","4S","AS"};
	public static final String [] POKER_DZ_NUM_RANGE = {"AA","22","33","44","55","66","77","88","99","1010","JJ","QQ","KK","XX"};
	public static final String [] POKER_BZ_NUM_RANGE = {"AAA","222","333","444","555","666","777","888","999","101010","JJJ","QQQ","KKK","YYY"};
	// 1任1,2任2,3任3,4任4,5任5,6任6,7同花,8顺子,9对子,10豹子//,11同花顺
	public static final List<Integer> POKER_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	/*********************************快乐扑克相关常量  end***********************************************************/
	
	
	/*********************************时时彩相关常量 start***********************************************************/
	public static final String[] SSC_NUM_RANGE = {"0","1","2","3","4","5","6","7","8","9"};
	// 注意程序中不能修改
	// 二星和值
	public static final String[] SSC_2_SUM_RANGE = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
	// 三星和值
	public static final String[] SSC_3_SUM_RANGE = {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};
	// 1五星直选,2五星通选,3三星直选,4三星组三,5三星组六,6二星直选,7二星组选,8一星,9大小单双
	public static final List<Integer> SSC_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8,9));
	/*********************************时时彩相关常量 start***********************************************************/
	
	
	/*********************************快3相关常量 start***********************************************************/
	public static final String[] K3_NUM_RANGE = {"1","2","3","4","5","6"};
	public static final String[] K3_SUM_RANGE = {"3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
	public static final String[] K3_TD3_RANGE = {"111","222","333","444","555","666"};
	public static final String[] K3_TF2_RANGE = {"11*","22*","33*","44*","55*","66*"};
	// 
	public static final List<Integer> K3_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8));
	/*********************************快3相关常量 end***********************************************************/
	
	/*********************************快乐10分相关常量 start***********************************************************/
	public static final String[] KL10_NUM_RANGE = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20"};
	// 前一数投数值范围
	public static final String[] KL10_ST_NUM_RANGE = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18"};
	// 前一数投数值范围
	public static final String[] KL10_HT_NUM_RANGE = {"19","20"};
	// 1前一数投,2前一红投,3任选二,4选二连组,5选二连直,6任选三,7选三前组,8选三前直,9任选四,10任选五
	public static final List<Integer> KL10_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	/*********************************快乐10分相关常量 end***********************************************************/

	
	// 数字彩单区选号个数大于或等于10的选号个数的所有数字为两位数字（如1为01）；
	// 数字彩单区选号个数小于10的选号个数的所有数字为一位数字（如1为1）；
	/*********************************十一选五相关常量 start***********************************************************/
	/**
	 * 十一选五选号范围,注意程序中不能修改
	 */
	public static final String [] X115_NUM_RANGE = {"01","02","03","04","05","06","07","08","09","10","11"};
	
	/**
	 * 十一选五子玩法,后台会拼上彩种编号，如1--》25501
	 * 1:任选二至任选八;2:前一;3:前直选二;4:前直选三;5:前二组选;6:前三组选
	 */
	public static final List<Integer> X115_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6));
	/**
	 * 十一选五子玩法   开奖中支持1:任选二至任选八;4:前直选三;
	 */
	public static final List<Integer> X115_Draw_info_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,4));
	
	/**
	 * 十一选五遗漏 父类型  任选遗漏
	 */
	public static final List<String> X115_FA_TYPES = Collections.unmodifiableList(Arrays.asList("rx2","rx3","rx4","rx5","rx6","rx7","rx8","dw0","qx2","qz2","qz3"));
	
	public static final List<String> X115_SON_TYPES = Collections.unmodifiableList(Arrays.asList("m2","m3","m4","m5","m6","m7","m8","m9","w1","w2","w3","w4","w5","ds","hz"));
//			
//	
//	/**
//	 * 十一选五任二单式,两个1~11之间的数字,如"01,11"
//	 */
//	public static final String X115_REGEX_R2_SINGLE = "^(0[1-9]|10|11),(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五任二复式,3至11个1~11之间的数字,如"01,02,11"
//	 */
//	public static final String X115_REGEX_R2_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){2,10}$";
//	//public static final String X115_REGEX_R2_MULTIPLE = "^(0[1-9]|1[0-1])(,0[1-9]|,1[0-1]){2,10}$";
//	
//	/**
//	 * 十一选五任二胆拖,如：01#04,05,06,07,08,09。胆码[1,1]个，拖码[1,10]个,胆码加拖码个数[2,11]个，可投1注如01#02
//	 */
//	public static final String X115_REGEX_R2_DANTUO = "^(0[1-9]|10|11)#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任三单式,3个1~11之间的数字,如"01,02,03"
//	 */
//	public static final String X115_REGEX_R3_SINGLE = "^(0[1-9]|10|11),(0[1-9]|10|11),(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五任三复式,4至11个1~11之间的数字,如"01,02,03,04"
//	 */
//	public static final String X115_REGEX_R3_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){3,10}$";
//	
//	/**
//	 * 十一选五任三胆拖,如：01#04,05,06,07,08,09。胆码[1,2]个，拖码[1,10]个,胆码加拖码个数[3,11]个
//	 */
//	public static final String X115_REGEX_R3_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,1}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任四单式,4个1~11之间的数字,如"01,02,03,04"
//	 */
//	public static final String X115_REGEX_R4_SINGLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){3}$";
//	
//	/**
//	 * 十一选五任四复式,5至11个1~11之间的数字,如"01,02,03,04,05"
//	 */
//	public static final String X115_REGEX_R4_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){4,10}$";
//	
//	/**
//	 * 十一选五任四胆拖,如：01,02,03#04,05,06,07,08,09。胆码[1,3]个，拖码[1,10]个,胆码加拖码个数[4,11]个
//	 */
//	public static final String X115_REGEX_R4_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,2}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任五单式,5个1~11之间的数字,如"01,02,03,04,05"
//	 */
//	public static final String X115_REGEX_R5_SINGLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){4}$";
//	
//	/**
//	 * 十一选五任五复式,6至11个1~11之间的数字,如"01,02,03,04,05,06"
//	 */
//	public static final String X115_REGEX_R5_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){5,10}$";
//	
//	/**
//	 * 十一选五任五胆拖,如：01,02,03,04#05,06,07,08,09。胆码[1,4]个，拖码[1,10]个,胆码加拖码个数[5,11]个
//	 */
//	public static final String X115_REGEX_R5_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,3}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任六单式,6个1~11之间的数字,如"01,02,03,04,05,06"
//	 */
//	public static final String X115_REGEX_R6_SINGLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){5}$";
//	
//	/**
//	 * 十一选五任六复式,7至11个1~11之间的数字,如"01,02,03,04,05,06,07"
//	 */
//	public static final String X115_REGEX_R6_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){6,10}$";
//	
//	/**
//	 * 十一选五任六胆拖,如：01,02,03,04,05#06,07,08,09。胆码[1,5]个，拖码[1,10]个,胆码加拖码个数[6,11]个
//	 */
//	public static final String X115_REGEX_R6_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,4}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任七单式,7个1~11之间的数字,如"01,02,03,04,05,06,07"
//	 */
//	public static final String X115_REGEX_R7_SINGLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){6}$";
//	
//	/**
//	 * 十一选五任七复式,8至11个1~11之间的数字,如"01,02,03,04,05,06,07,08"
//	 */
//	public static final String X115_REGEX_R7_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){7,10}$";
//	
//	/**
//	 * 十一选五任七胆拖,如：01,02,03,04,05,06#07,08,09。胆码[1,6]个，拖码[1,10]个,胆码加拖码个数[7,11]个
//	 */
//	public static final String X115_REGEX_R7_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,5}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五任八单式,8个1~11之间的数字,如"01,02,03,04,05,06,07,08"
//	 */
//	public static final String X115_REGEX_R8_SINGLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){7}$";
//	
//	/**
//	 * 十一选五任八复式,9至11个1~11之间的数字,如"01,02,03,04,05,06,07,08,09"
//	 */
//	public static final String X115_REGEX_R8_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){8,10}$";
//	
//	/**
//	 * 十一选五任八胆拖,如：01,02,03,04,05,06,07#08,09。胆码[1,7]个，拖码[1,10]个,胆码加拖码个数[8,11]个
//	 */
//	public static final String X115_REGEX_R8_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,6}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	// 前二组选与任二的验证一样，只是算奖时以开奖号码前两位为范围
//	/**
//	 * 十一选五前二组选单式,两个1~11之间的数字,如"01,11"
//	 */
//	public static final String X115_REGEX_Q2_GROUP_SINGLE = "^(0[1-9]|10|11),(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五前二组选复式,3至11个1~11之间的数字,如"01,02,11"
//	 */
//	public static final String X115_REGEX_Q2_GROUP_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){2,10}$";
//	//public static final String X115_REGEX_R2_MULTIPLE = "^(0[1-9]|1[0-1])(,0[1-9]|,1[0-1]){2,10}$";
//	
//	/**
//	 * 十一选五前二组选胆拖,如：01#04,05,06,07,08,09。胆码[1,1]个，拖码[1,10]个,胆码加拖码个数[2,11]个
//	 */
//	public static final String X115_REGEX_Q2_GROUP_DANTUO = "^(0[1-9]|10|11)#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五前三组选单式,3个1~11之间的数字,如"01,02,03"
//	 */
//	public static final String X115_REGEX_Q3_GROUP_SINGLE = "^(0[1-9]|10|11),(0[1-9]|10|11),(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五前三组选复式,4至11个1~11之间的数字,如"01,02,03,04"
//	 */
//	public static final String X115_REGEX_Q3_GROUP_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){3,10}$";
//	
//	/**
//	 * 十一选五前三组选胆拖,如：01#04,05,06,07,08,09。胆码[1,2]个，拖码[1,10]个,胆码加拖码个数[3,11]个
//	 */
//	public static final String X115_REGEX_Q3_GROUP_DANTUO = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,1}#(0[1-9]|10|11)(,0[1-9]|,10|,11){0,9}$";
//	
//	/**
//	 * 十一选五前一单式,一个两位数,如"01"
//	 */
//	public static final String X115_REGEX_Q1_SINGLE = "^(0[1-9]|10|11)$";
//	/**
//	 * 十一选五前一复式,2至11个1~11之间的数字,如"01,011"
//	 */
//	public static final String X115_REGEX_Q1_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){1,10}$";
//	
//	/**
//	 * 十一选五前二单式,如"01|02"
//	 */
//	public static final String X115_REGEX_Q2_DIRECT_SINGLE = "^(0[1-9]|10|11)\\|(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五前二复式,如"01|02,03",号码总个数[3,11]
//	 */
//	public static final String X115_REGEX_Q2_DIRECT_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,10}\\|(0[1-9]|10|11)(,0[1-9]|,10|,11){0,10}$";
//	
//	/**
//	 * 十一选五前三单式,如"01|02|03"
//	 */
//	public static final String X115_REGEX_Q3_DIRECT_SINGLE = "^(0[1-9]|10|11)\\|(0[1-9]|10|11)\\|(0[1-9]|10|11)$";
//	
//	/**
//	 * 十一选五前三复式,如"01,02,03|02|01,02,03",号码总个数[4,11]
//	 */
//	public static final String X115_REGEX_Q3_DIRECT_MULTIPLE = "^(0[1-9]|10|11)(,0[1-9]|,10|,11){0,10}\\|(0[1-9]|10|11)(,0[1-9]|,10|,11){0,10}\\|(0[1-9]|10|11)(,0[1-9]|,10|,11){0,10}$";

	/*********************************十一选五相关常量  end***********************************************************/
	
	
	
	/*********************************快三相关常量  start***********************************************************/
//	/**
//	 * 快3子玩法
//	 * 1和值,2三同号通选,3三同号单选,4三不同号,5三连号通选,6二同号复选,7二同号单选,8二不同号,//9一码包中(到后台会拆成各种单式)
//	 */
//	public static final List<Integer> K3_SUBPLAY = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7,8));
//	
//	/**
//	 * 和值单式,1个4~17之间的数字,如"4"
//	 */
//	public static final String K3_REGEX_S_SINGLE = "^[4-9]|10|11|12|13|14|15|16|17$";
//	
//	/**
//	 * 和值复式,2~14个个4~17之间的数字,如"1,2,11"
//	 */
//	public static final String K3_REGEX_S_MULTIPLE = "^([4-9]|10|11|12|13|14|15|16|17)(,[4-9]|,10|,11|,12|,13|,14|,15|,16|,17){1,13}$";
//	
//	/**
//	 * 三同号单式,1个3同号数字的数字,如"111"
//	 */
//	public static final String K3_REGEX_TD3_SINGLE = "^111|222|333|444|555|666$";
//	
//	/**
//	 * 三同号复式,2~6个3同号数字的数字,如"111;222;333"
//	 */
//	public static final String K3_REGEX_TD3_MULTIPLE = "^(111|222|333|444|555|666)(;111|;222|;333|;444|;555|;666){1,5}$";
//	
//	/**
//	 * 二同号复选单式,1个2同号数字的数字,如"11*"
//	 */
//	public static final String K3_REGEX_TF2_SINGLE = "^11*|22*|33*|44*|55*|66*$";
//	
//	/**
//	 * 二同号复选单式,2~6个2同号数字的数字,如"11*;22*;33*"
//	 */
//	public static final String K3_REGEX_TF2_MULTIPLE  = "^(11*|22*|33*|44*|55*|66*)(;11*|;22*|;33*|;44*|;55*|;66*){1,5}$";
//	
//	/**
//	 * 三同号通选单式
//	 */
//	public static final String K3_REGEX_TT3_SINGLE = "^3T$";
//	/**
//	 * 三连号通选单式
//	 */
//	public static final String K3_REGEX_L3_SINGLE = "^3L$";
//	/**
//	 * 二同号单选单式,两个同号+一个不同号，如1,1,2
//	 */
//	public static final String K3_REGEX_TD2_SINGLE = "^(1,1,|2,2,|3,3,|4,4,|5,5,|6,6,)[1-6]$";
//	/**
//	 * 二同号单选复式,2到9组两个同号+一个不同号，如1,1,2;2,2,1;3,3,2
//	 */
//	public static final String K3_REGEX_TD2_MULTIPLE = "^(1,1,|2,2,|3,3,|4,4,|5,5,|6,6,)[1-6]((;1,1,|;2,2,|;3,3,|;4,4,|;5,5,|;6,6,)[1-6]){1,7}$";
//	/**
//	 * 二不同号单式,两个不同号，如1,2 TODO号码排序
//	 */
//	public static final String K3_REGEX_BT2_SINGLE = "^[1-6]{2}$";
//	/**
//	 * 二不同号复式,3~6个不同号，如1,2,3
//	 */
//	public static final String K3_REGEX_BT2_MULTIPLE = "^[1-6]{3,6}$";
//	/**
//	 * 二不同号胆拖,1个胆加1~5个拖码，如1#2,3,4，可以投1注
//	 */
//	public static final String K3_REGEX_BT2_DANTUO = "^[1-6]#[1-6](,[1-6]){0,4}$";
//	/**
//	 * 三不同号单式,三个不同号，如1,2,3
//	 */
//	public static final String K3_REGEX_BT3_SINGLE = "^[1-6]{3}$";
//	/**
//	 * 三不同号复式,4~6个不同号，如1,2,3,4
//	 */
//	public static final String K3_REGEX_BT3_MULTIPLE = "^[1-6]{4,6}$";
//	/**
//	 * 三不同号胆拖,1~2个胆加2~5个拖码，如1,2#3,4，胆拖必须2元以上
//	 */
//	public static final String K3_REGEX_BT3_DANTUO = "^[1-6]{1,2}#[1-6](,[1-6]){1,4}$";
	
	/*********************************快三相关常量  end***********************************************************/
}
