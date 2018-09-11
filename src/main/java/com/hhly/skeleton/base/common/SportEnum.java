/**
 * 
 */
package com.hhly.skeleton.base.common;

import com.hhly.skeleton.base.constants.BJDCConstants;
import com.hhly.skeleton.base.constants.JCLQConstants;
import com.hhly.skeleton.base.constants.JCZQConstants;
import com.hhly.skeleton.base.constants.SportConstants;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 竞技彩枚举类
 * @author Bruce
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportEnum {
	/***
	 * 
	 * @author longguoyou
	 * @date 2017年2月8日 上午10:27:23
	 * @desc 竞彩足球玩法枚举
	 *
	 */
	public enum SportFbSubWay {
		/** 胜平负：S */
		JCZQ_S("S", "胜平负"),
		/** 让球胜平负：R */
		JCZQ_R("R", "让球胜平负"),
		/** 全场比分：Q */
		JCZQ_Q("Q", "全场比分"),
		/** 总进球数：Z */
		JCZQ_Z("Z", "总进球数"),
		/** 半全场胜平负：B */
		JCZQ_B("B", "半全场胜平负"),
		/** 混合 */
		JCZQ_M("M", "混合");

		private String value;
		
		private String name;

		SportFbSubWay(String _value, String name) {
			this.value = _value;
			this.name = name;
		}

		public static SportFbSubWay getSportFbSubWay(String value) {
			for (SportFbSubWay fbSubWay : SportFbSubWay.values()) {
				if (fbSubWay.value.equals(value)) {
					return fbSubWay;
				}
			}
			return null;
		}
		
		public static SportFbSubWay getSportFBSubWay(Integer lotteryChildCode){
			switch (lotteryChildCode) {
			case JCZQConstants.ID_JCZQ:
				return JCZQ_S;
			case JCZQConstants.ID_RQS:
				return JCZQ_R;
			case JCZQConstants.ID_FBF:
				return JCZQ_Q;
			case JCZQConstants.ID_FZJQ:
				return JCZQ_Z;
			case JCZQConstants.ID_FBCQ:
				return JCZQ_B;
			case JCZQConstants.ID_FHT:
				return JCZQ_M;
			}
			return null;
		}		

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}
	}

	/***
	 *
	 * @author yuanshangbing
	 * @date 2017年2月16日 上午10:27:23
	 * @desc 竞彩篮球玩法枚举 S:胜负，R-让分胜负，D-大小分，C-胜分差，M-混合
	 */
	public enum SportBBSubWay {
		/** 胜负：S */
		JCLQ_S("S", "胜负"),
		/** 让分胜负：R */
		JCLQ_R("R", "让分胜负"),
		/** 大小分：D */
		JCLQ_D("D", "大小分"),
		/** 胜分差：C */
		JCLQ_C("C", "胜分差"),
		/** 混合 */
		JCLQ_M("M", "混合");

		private String value;
		
		private String name;

		SportBBSubWay(String _value, String name) {
			this.value = _value;
			this.name = name;
		}

		public static SportBBSubWay getSportBBSubWay(String value) {
			for (SportBBSubWay bbSubWay : SportBBSubWay.values()) {
				if (bbSubWay.value.equals(value)) {
					return bbSubWay;
				}
			}
			return null;
		}
		
		public static SportBBSubWay getSportBBSubWay(Integer lotteryChildCode){
			switch (lotteryChildCode) {
			case JCLQConstants.ID_JCLQ_SF:
				return JCLQ_S;
			case JCLQConstants.ID_JCLQ_RF:
				return JCLQ_R;
			case JCLQConstants.ID_JCLQ_DXF:
				return JCLQ_D;
			case JCLQConstants.ID_JCLQ_SFC:
				return JCLQ_C;
			case JCLQConstants.ID_JCLQ_HHGG:
				return JCLQ_M;
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}
	}

	/**
	 * 北京单场子玩法枚举
	 * 
	 * @author longguoyou
	 * @date 2017年8月9日
	 * @compay 益彩网络科技有限公司
	 */
	public enum SportBJDCSubWay {
		/** 比分：Q */
		BJDC_Q("Q","比分"),
		/** 半全场胜平负：B */
		BJDC_B("B", "半全场胜平负"),
		/** 总进球：Z */
		BJDC_Z("Z", "总进球"),
		/** 让分胜负：R */
		BJDC_R("R", "让球胜负"),
		/** 上下单双：D */
		BJDC_D("D", "上下单双"),
		/** 胜负过关：W */
		BJDC_W("W", "胜负过关");

		private String value;
		
		private String name;

		SportBJDCSubWay(String value, String name) {
			this.value = value;
			this.name = name;
		}

		public static SportBJDCSubWay getSportBJDCSubWay(String value) {
			for (SportBJDCSubWay bbSubWay : SportBJDCSubWay.values()) {
				if (bbSubWay.value.equals(value)) {
					return bbSubWay;
				}
			}
			return null;
		}
		
		public static SportBJDCSubWay getSportBJDCSubWay(Integer lotteryChildCode){
			switch (lotteryChildCode) {
			case BJDCConstants.ID_RQS:
				return BJDC_R;
			case BJDCConstants.ID_SXDX:
				return BJDC_D;
			case BJDCConstants.ID_FZJQ:
				return BJDC_Z;
			case BJDCConstants.ID_FBF:
				return BJDC_Q;
			case BJDCConstants.ID_FBCQ:
				return BJDC_B;
			case BJDCConstants.ID_SFC:
				return BJDC_W;
			}
			return null;
		}		

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}
	}

	/**
	 * 竞彩过分方式enum
	 */
	public enum SportPassTypeEnum {
		/**
		 * 仅售过关
		 */
		PASS(0),
		/**
		 * 仅售单关
		 */
		SINGLE(1);
		private Integer value;

		SportPassTypeEnum(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	/**
	 * 销售状态enum
	 */
	public enum SportSaleStatusEnum {
		/**
		 * 正常销售
		 */
		NORMAL_SALE(1),
		/**
		 * 仅售过关
		 */
		PASS_SALE(2),
		/**
		 * 仅售单关
		 */
		SINGLE_SALE(3),
		/**
		 * 暂停销售
		 */
		STOP_SALE(4);

		private Integer value;

		SportSaleStatusEnum(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	/**
	 * 销售状态enum
	 */
	public enum SportBJSaleStatusEnum {
		/**
		 * 正常销售
		 */
		SALE(1), STOP_SALE(2);

		private Integer value;

		SportBJSaleStatusEnum(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	/**
	 * 竞技彩玩法
	 */
	public enum SportPayFlagEnum {
		/**
		 * 足球进球
		 */
		GOAL("goal"),
		/**
		 * 足球比分
		 */
		SCORE("score"),
		/**
		 * 足球胜平负
		 */
		WDF("wdf"),
		/**
		 * 足球让分胜平负
		 */
		LET_WDF("let_wdf"),
		/**
		 * 足球半全场
		 */
		HF("hf"),
		/**
		 * 足球混投
		 */
		MI("mi"),
		/**
		 * 篮球胜负
		 */
		WF("wf"),
		/**
		 * 篮球让分胜负
		 */
		LET_WF("let_wf"),
		/**
		 * 篮球比分差
		 */
		WS("ws"),
		/**
		 * 大小分
		 */
		BS("bs"),
		/**
		 * 大小分
		 */
		UD("ud");

		private String value;

		SportPayFlagEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	/**
	 * Created by lgs on 2017/1/9. 比赛类别枚举
	 */
	public enum MatchTypeEnum {
		FOOTBALL((short)1, "足球"), BASKETBALL((short)2, "篮球"), TENNIS_BALL((short)3, "网球"), AMERICAN_FOOTBALL((short)4, "橄榄球"), VOLLEYBALL((short)5, "排球"), BADMINTON((short)6,
				"羽毛球"), PING_PONG_BALL((short)7, "乒乓球"), BEACH_VOLLEYBALL((short)8,
						"沙滩排球"), ICE_HOCKEY((short)9, "冰球"), HOCKEY_BALL((short)10, "曲棍球"), HANDBALL((short)11, "手球"), WATER_POLO_BALL((short)12, "水球");

		private Short code;

		private String name;
		
		public static MatchTypeEnum getMatchTypeEnum(Short type){
			for (MatchTypeEnum matchTypeEnum : MatchTypeEnum.values()) {
				if(matchTypeEnum.getCode().equals(type))
					return matchTypeEnum;
			}
			return null;
		}
		
		public static Short getMatchTypeEnumCode(String name){
			for (MatchTypeEnum matchTypeEnum : MatchTypeEnum.values()) {
				if(matchTypeEnum.getName().equals(name))
					return matchTypeEnum.getCode();
			}
			return null;
		}		

		MatchTypeEnum(Short code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public Short getCode() {
			return code;
		}

		public void setCode(Short code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 获取赛事类别
	 *
	 * @param matchName
	 *            赛事名称
	 * @return 默认返回足球
	 */
	public static Short getMatchType(String matchName) {
		for (MatchTypeEnum matchTypeEnum : MatchTypeEnum.values()) {
			if (matchTypeEnum.getName().equals(matchName)) {
				return matchTypeEnum.getCode();
			}
		}
		return MatchTypeEnum.FOOTBALL.getCode();
	}

	/**
	 * 胜负类别。例如让球非让球
	 */
	public enum WfTypeEnum {
		/**
		 * 非让球
		 */
		NOT_LET((short) 1),
		/**
		 * 让球
		 */
		LET((short) 2);
		private Short value;

		WfTypeEnum(Short value) {
			this.value = value;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}
	}

	/**
	 * 比赛状态
	 */
	public enum JcMatchStatusEnum {
		OLD_WAIT(1, "等待比赛"),
		OLD_GOING(2, "比赛中"),
		OLD_END(3, "已完场"),
		OLD_DELAY(4, "延期"),
		OLD_CANCEL(5, "取消"), //
		TENTATIVE(6, "暂定赛程"),
		NOT_SALE(7, "未开售"),
		BEFORE_SALE(8, "预售中"),
		SALE(9, "销售中"),
		SALE_STOP(10, "暂停销售"),
		SALE_END(11, "销售截止"), //
		GOING(12, "比赛进行中"),
		DELAY(13, "延期"),
		CANCEL(14, "取消"),
		RUN_LOTTERY(15, "已开奖"),
		ALLOT_LOTTERY(16, "已派奖"),
		CHECK(17, "已审核"),
		OUT(18, "已淘汰");

		private int code;

		private String name;

		JcMatchStatusEnum(int code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public static boolean isUpdate(int status){
			if(status <= 0)
				return true;
			if(SALE_STOP.getCode() == status || SALE_END.getCode() == status 
					|| GOING.getCode() == status || DELAY.getCode() == status
					|| CANCEL.getCode() == status || RUN_LOTTERY.getCode() == status
					|| ALLOT_LOTTERY.getCode() == status || CHECK.getCode() == status)
				return true;
			return false;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static int getMatchStatus(String matchStatus) {
		for (JcMatchStatusEnum jcMatchStatusEnum : JcMatchStatusEnum.values()) {
			if (jcMatchStatusEnum.getName().equals(matchStatus)) {
				return jcMatchStatusEnum.getCode();
			}
		}

		return JcMatchStatusEnum.SALE_STOP.getCode();
	}

	/**
	 * 竞技彩页面TAB标签分类
	 * 
	 * @author longguoyou
	 * @date 2017年4月12日
	 * @compay 益彩网络科技有限公司
	 */
	public enum SportTabTypeEnum {
		/**
		 * 过关投注
		 */
		PASS_WAY_BET(1),
		/**
		 * 单关
		 */
		SINGLE_BET(2),
		/**
		 * 2选1
		 */
		TWO_AND_ONE(3),
		/**
		 * 单场致胜
		 */
		SINGLE_WIN(4);
		private int code;

		SportTabTypeEnum(int code) {
			this.code = code;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
	}

	public enum SportDataSource {
		JC_OFFICIAL("www.sporttery.cn", (short)1), FIVEHUNDRED_OFFICIAL("www.500.com", (short)2), AIBO_OFFICIAL("trade.aibo123.com",(short)3),
		JIMI_OFFICIAL("jimi", (short)4);

		private String name;
		
		private Short value;

		SportDataSource(String name, Short value) {
			this.name = name;
			this.value = value;
		}
		
		public static SportDataSource getSportDataSource(Short value) {
			for (SportDataSource sportDataSource : SportDataSource.values()) {
				if (sportDataSource.getValue() == value) {
					return sportDataSource;
				}
			}
			return null;
		}		

		public String getName() {
			return name;
		}

		public Short getValue() {
			return value;
		}
	}

	public enum SportWDFEnum {

		WIN((short) 3, "胜"), DRAW((short) 1, "平"), FAIL((short) 0, "负");

		private short value;
		private String name;

		private SportWDFEnum(short value, String name) {
			this.value = value;
			this.name = name;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		/**
		 * 胜、平、负
		 * 
		 * @param value
		 * @return
		 */
		public static String getWdfName(Short value) {
			if (value != null) {
				for (SportEnum.SportWDFEnum wdfEnum : SportEnum.SportWDFEnum.values()) {
					if (wdfEnum.getValue() == value) {
						return wdfEnum.getName();
					}
				}
			}
			return null;
		}
		
		public static Short getWdfValue(String name) {
			for (SportEnum.SportWDFEnum wdfEnum : SportEnum.SportWDFEnum.values()) {
				if (wdfEnum.getName().equals(name)) {
					return wdfEnum.getValue();
				}
			}
			return null;
		}		

		/**
		 * 半全场胜平负，胜胜，负负等
		 * 
		 * @param value
		 * @return
		 */
		public static String getHfWdfName(String value) {
			if (!ObjectUtil.isBlank(value) && value.length() == 2) {
				return getWdfName(Short.valueOf(value.substring(0, 1))) + getWdfName(Short.valueOf(value.substring(1)));
			}
			return null;
		}
		
		/**
		 * 主胜、客胜
		 * 
		 * @param value
		 * @return
		 */
		public static String getWfName(Short value) {
			if (value != null) {
				if (SportWDFEnum.WIN.getValue() == value.shortValue()) {
					return SportConstants.HOME_WIN;
				} else if (SportEnum.SportWDFEnum.FAIL.getValue() == value.shortValue()) {
					return SportConstants.GUEST_WIN;
				}
			}
			return null;
		}
	}

	public enum SportUdSdEnum {
		UP_SINGLE((short) 1, "上单"), UP_DOUBLE((short) 2, "上双"), DOWN_SINGLE((short) 3, "下单"), DOWN_DOUBLE((short) 4, "下双");
		private short value;
		private String name;

		private SportUdSdEnum(short value, String name) {
			this.value = value;
			this.name = name;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getUdSdName(Short value) {
			if (value != null) {
				for (SportEnum.SportUdSdEnum udsdEnum : SportEnum.SportUdSdEnum.values()) {
					if (udsdEnum.value == value) {
						return udsdEnum.name;
					}
				}
			}
			return null;
		}
		
		public static Short getUdSdValue(String name) {
			for (SportUdSdEnum udsdEnum : SportUdSdEnum.values()) {
				if (udsdEnum.getName().equals(name)) {
					return udsdEnum.getValue();
				}
			}
			return null;
		}		
	}
	
	public enum SportWinScoreEnum {
		WIN_01_05("01", "主胜1-5"), WIN_06_10("02", "主胜6-10"), WIN_11_15("03", "主胜11-15"), WIN_16_20("04", "主胜11-15"), //
		WIN_21_25("05", "主胜21-25"), WIN_26("06", "主胜26+"), //
		FAIL_01_05("11", "客胜1-5"), FAIL_06_10("12", "客胜6-10"), FAIL_11_15("13", "客胜11-15"), FAIL_16_20("14", "客胜11-15"), //
		FAIL_21_25("15", "客胜21-25"), FAIL_26("16", "客胜26+");
		private String value;
		private String name;

		private SportWinScoreEnum(String value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getWinScoreName(String value) {
			if (!ObjectUtil.isBlank(value)) {
				for (SportEnum.SportWinScoreEnum winScoreEnum : SportEnum.SportWinScoreEnum.values()) {
					if (winScoreEnum.value.equals(value)) {
						return winScoreEnum.name;
					}
				}
			}
			return null;
		}
	}
	
	public enum SportSizeScoreEnum {
		BIG("99", "大分"), SMALL("00", "小分");
		private String value;
		private String name;

		private SportSizeScoreEnum(String value, String name) {
			this.value = value;
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static String getSizeScoreName(String value) {
			if (!ObjectUtil.isBlank(value)) {
				for (SportEnum.SportSizeScoreEnum sizeScoreEnum : SportEnum.SportSizeScoreEnum.values()) {
					if (sizeScoreEnum.value.equals(value)) {
						return sizeScoreEnum.name;
					}
				}
			}
			return null;
		}
	}
	
	public enum SportOldFbLottery{
		
		WILO(304, "wilo", "胜负彩"), NINE_WILO(305, "wilo", "任选九场"), HAFU(302, "hafu", "六场半全场"), 
		GOAL(303, "goal", "四场进球");
		
		private SportOldFbLottery(Integer code, String key, String name) {
			this.code = code;
			this.key = key;
			this.name = name;
		}
		
		public static SportOldFbLottery getSportOldFbLottery(Integer lotteryCode){
			for (SportOldFbLottery sportOldFbLottery : SportOldFbLottery.values()) {
				if(ObjectUtil.equals(sportOldFbLottery.getCode(), lotteryCode))
					return sportOldFbLottery;
			}
			return null;
		}

		private Integer code;
		
		private String key;
		
		private String name;

		public Integer getCode() {
			return code;
		}
		
		public String getKey() {
			return key;
		}

		public String getName() {
			return name;
		}
	}
}
