package com.hhly.skeleton.base.common;

import java.util.Objects;

import com.hhly.skeleton.base.common.OperateCouponEnum.RedTypeEnum;


public class ActivityEnum {
	/**
	 * @desc 规则类型
	 * @author lidecheng
	 * @date 2017年7月2日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityRuleType {
		TIME("时间", (short)1), ISSUE("期号", (short)2),SCREEN("场次", (short)3);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ActivityRuleType(String desc, short value) {
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
	 * @desc 返利类型 返利类型(1:金额;2:百分比)
	 * @author lidecheng
	 * @date 2017年7月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityRebateType{
		MONEY("金额", (short)1), PERCENT("百分比", (short)2);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ActivityRebateType(String desc, short value) {
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
	 * @desc 操作类型(1:未处理;2:等待处理:3:已处理)
	 * @author lidecheng
	 * @date 2017年7月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityOperactionType{
		NOHANDLE("未处理", (short)1), HANDLING("等待处理", (short)2),HANDED("已处理", (short)3);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ActivityOperactionType(String desc, short value) {
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
	 * @desc 用户类型(1所有,2发起人, 3合买人,4新用户)
	 * @author lidecheng
	 * @date 2017年7月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityUserType{
		ALL("所有", (short)1), SPON("发起人", (short)2),JOIN("合买人", (short)3),NEWS("新用户", (short)4),NEWS_ACR("活动时间内首充用户",(short)5);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ActivityUserType(String desc, short value) {
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
	 * @desc 用户类型(1所有,2发起人, 3合买人,4新用户)
	 * @author lidecheng
	 * @date 2017年7月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum RebateUserType{
		 SPON("发起人", (short)1),ALL("所有用户", (short)2);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		RebateUserType(String desc, short value) {
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
	 * @desc 统计类型(1用户真实姓名,2手机号)
	 * @author lidecheng
	 * @date 2017年7月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityCountType{
		NAME("用户真实姓名", (short)1), PHONE("手机号", (short)2), USERID("同一真实用户（身份证）", (short)3), DAY_ACTIVITY("当天活动生成数量", (short)4);
		/**
		 * 状态描述
		 */
		private String desc;
		/**
		 * 状态值
		 */
		private short value;

		ActivityCountType(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}
		public short getValue() {
			return value;
		}
	}
	public enum ActivityTypeEnum {

		WE_ADD_AWARD( 1, "本站加奖"),
		OFFICIAL_ADD_AWARD( 2, "官方加奖"),
		AWARD_ADD_AWARD(3,"奖上奖"),
		RECHARGE(4, "充值送活动"),
		MUTIL_BET(5, "倍投立减"),
		ADD_CODE(6, "追号送"),
		IMP_RETURN(7, "不中返"),
		FIRST_RECHARGE(8, "首充活动"),
		NEW_USER(9, "新用户活动"),
		ADD_SINGLE(10, "单关加奖"),
		SPECIAL(11, "特定赛事加奖"),
		PRIZE_AWARD(12, "抽奖活动"),
        REDEEM_CODE(13, "兑换码兑红包"),
        ANNUAL_MEET(14, "年会派送活动"),
        CHP_GUEST(15, "世界杯冠军竞猜活动"),
        ;
		private Integer value;
		private String desc;
		private ActivityTypeEnum(Integer value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Integer getValue() {
			return value;
		}

		public String getDesc() {
			return desc;
		}
		
		/**
		 * @param ActivityMqConsEnum
		 * @return 返回指定的活动渠道信息
		 */
		public static ActivityTypeEnum getCons(Integer value) {
		    if (value == null) {
                return null;
            }
			for (ActivityTypeEnum l : ActivityTypeEnum.values()){
				if (Objects.equals(l.getValue(), value)) {
					return l;
				}
			}
			return null;
		}
		/***
		 * 获取指定的彩金类型
		 */
		public static int getConType(int value) {
			if(value==OFFICIAL_ADD_AWARD.getValue()){
				return RedTypeEnum.PLUS_AWARDS_RED_PACKAGE.getType();
			}else if(value==FIRST_RECHARGE.getValue()){
				return RedTypeEnum.RECHARGE_RED_PACKAGE.getType();
			}else{
				return RedTypeEnum.HANDSEL_RED_PACKAGE.getType();
			}
		}
	}
	
	/**
	 * @desc  mq触发来源
	 * @author lidecheng
	 * @date 2017年7月13日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivityMqConsEnum {

		ADD_AWARD_CONS( 1, "派奖后触发"),
		OPEN_AWARD( 2, "开奖后触发"),
		RECHANGE( 3, "充值后触发"),
		BIND_ID_CARD(4, "实名认证"),
		BIND_BANK_CARD(5, "绑定银行卡"),
		BIND_MOBILE_NO(6, "绑定手机号"),
		SUCC_TICKET(7, "出票成功后执行"),
		REGISTER(8, "注册"),
		;
		private Integer value;

		private String desc;
		private ActivityMqConsEnum(Integer value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Integer getValue() {
			return value;
		}

		public String getDesc() {
			return desc;
		}

		
		/**
		 * @param ActivityMqConsEnum
		 * @return 返回指定的活动渠道信息
		 */
		public static ActivityMqConsEnum getCons(Integer value) {
		    if (value == null) {
                return null;
            }
			for (ActivityMqConsEnum l : ActivityMqConsEnum.values()){
				if (Objects.equals(l.getValue(), value)) {
					return l;
				}
			}
			return null;
		}
		
		/**
		 * @param ActivityMqConsEnum
		 * @return 返回指定的活动渠道信息
		 */
		public static boolean checkCons(Integer value) {
		    if (value == null) {
                return false;
            }
			for (ActivityMqConsEnum l : ActivityMqConsEnum.values()){
				if (Objects.equals(l.getValue(), value)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public enum ActivityUserActionEnum {
		BIND_ID_CARD((short)1, "实名认证"),
		BIND_BANK_CARD((short)2, "绑定银行卡"),
		BIND_MOBILE_NO((short)3, "绑定手机号"),
		REGISTER((short)4, "注册"),
		TAKE((short)5, "领取"),;
		private Short value;
		private String desc;

		private ActivityUserActionEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		public static ActivityUserActionEnum getUserActonEnum(Short value) {
			if (value == null) {
				return null;
			}
			for (ActivityUserActionEnum l : ActivityUserActionEnum.values()) {
				if (Objects.equals(l.getValue(), value)) {
					return l;
				}
			}
			return null;
		}
	}

	public enum ActivityConfigTypeEnum {
		COUPON((short) 1, "优惠券"), LOTTERY((short) 2, "彩票");
		private Short value;
		private String desc;

		private ActivityConfigTypeEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public static String getConfigTypeName(Short value) {
			if (value == null) {
				return null;
			}
			for (ActivityConfigTypeEnum l : ActivityConfigTypeEnum.values()) {
				if (Objects.equals(l.getValue(), value)) {
					return l.getDesc();
				}
			}
			return null;
		}
	}
	
	public enum ActivityAwardTypeEnum {
		COUPON((short)1, "优惠券"),
		ACTIVITY((short)2, "活动"),
		NO((short)0, "不送奖");
		private Short value;
		private String desc;

		private ActivityAwardTypeEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	public enum ActivityAddCodeRuleEnum {
		ISSUE((short)1, "期数"),
		COUPON((short)2, "优惠券");
		private Short value;
		private String desc;

		private ActivityAddCodeRuleEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	/**
	 * 活动竞技彩类型
	 * @desc
	 * @author lidecheng
	 * @date 2017年10月24日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ActivitySportTypeEnum {
		DG((short)1, "单关"),
		GG((short)2, "过关"),
		WIN((short)3, "胜"),
		DRAW((short)4, "平"),
		FAIL((short)5, "负");
		private Short value;
		private String desc;

		private ActivitySportTypeEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	/**
	 * 选号方式
	 *
	 * @author huangchengfang1219
	 * @date 2018年1月12日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LottoPickTypeEnum {
		MACHINE((short) 1, "机选"), HAND((short) 2, "手选");
		private Short value;
		private String desc;

		private LottoPickTypeEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	
	public enum GuessWinTypeEnum {
		MOTOPEN((short) 1, "未开奖"), OPEN((short) 2, "已开奖"), SEND((short) 3, "已派奖");
		private Short value;
		private String desc;

		private GuessWinTypeEnum(Short value, String desc) {
			this.value = value;
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
}
