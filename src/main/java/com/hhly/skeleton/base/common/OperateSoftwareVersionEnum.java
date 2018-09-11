package com.hhly.skeleton.base.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.hhly.skeleton.base.bo.DictionaryBO;


/**
 * @desc    
 * @author  cheng chen
 * @date    2017年5月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateSoftwareVersionEnum {

	public enum Isnew{
		YES(1, "是"),
		NO(0, "否");
		
		private int value;
		
		private String text;
		
		Isnew(int value, String text){
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public String getText() {
			return text;
		}
		
		public static List<DictionaryBO> baseIsnew(){
			List<DictionaryBO> list = new ArrayList<DictionaryBO>();
			for (Isnew isnew : Isnew.values()) {
				DictionaryBO bo = new DictionaryBO();
				bo.setId(String.valueOf(isnew.getValue()));
				bo.setText(isnew.getText());
				list.add(bo);
			}
			return list;
		}		
		
		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Isnew isnew : Isnew.values()) {
				if(Objects.equals(isnew, target))
					return true;
			}
			return false;
		}
		public static Isnew valueOf(Integer target) {
			if(null == target) return null;
			for(Isnew isnew : Isnew.values()) {
				if(Objects.equals(isnew.getValue(), target))
					return isnew;
			}
			return null;
		}		
	}
	
	public enum Isupdate{
		YES(1, "是"),
		NO(0, "否");
		
		private int value;
		
		private String text;
		
		Isupdate(int value, String text){
			this.value = value;
			this.text = text;
		}

		public int getValue() {
			return value;
		}

		public String getText() {
			return text;
		}
		
		public static List<DictionaryBO> baseIsupdate(){
			List<DictionaryBO> list = new ArrayList<DictionaryBO>();
			for (Isupdate isupdate : Isupdate.values()) {
				DictionaryBO bo = new DictionaryBO();
				bo.setId(String.valueOf(isupdate.getValue()));
				bo.setText(isupdate.getText());
				list.add(bo);
			}
			return list;
		}
		
		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Isupdate isupdate : Isupdate.values()) {
				if(Objects.equals(isupdate, target))
					return true;
			}
			return false;
		}
		public static Isupdate valueOf(Integer target) {
			if(null == target) return null;
			for(Isupdate isupdate : Isupdate.values()) {
				if(Objects.equals(isupdate.getValue(), target))
					return isupdate;
			}
			return null;
		}		
	}
	
	public enum Type{
		IOS(1),
		ANDROID(2);
		
		private int value;
		
		Type(int value){
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Type type : Type.values()) {
				if(Objects.equals(type, target))
					return true;
			}
			return false;
		}
		public static Type valueOf(Integer target) {
			if(null == target) return null;
			for(Type type : Type.values()) {
				if(Objects.equals(type.getValue(), target))
					return type;
			}
			return null;
		}		
		
	}
	
	// APP功能隐藏模块
	public enum Modul{
		INDEX("1", "首页"),// 原'购彩栏'
		BANNER("2", "banner板块"),
		LOTTERY_NAV("3", "彩种导航"),// 彩种导航板块
		//MATCH_AND_PRIZE(4, "赛事直播/开奖通知板块"),// 二期没用
		FAST_LOTTERY("5", "快投"),// 快投板块
		//NEWS(6, "新闻资讯板块"),// 	二期没用
		LIVE("7", "直播栏"),
		NEWS_BAR("8", "资讯栏"),
		USER_CENTER("9", "个人中心栏"),
		CONFIG("10", "设置"),// 原'设置入口'
		//CHARGE_AND_TAKEN(11, "充值/提款入口"),// 二期拆分'充值'、'提款'
		BET_HISTORY("12","投注记录"),// 购彩记录
		PROFILE("13","个人资料"),// 个人资料入口
		ANGENT("14","我要代理"),// 代理入口
		FAST_LOTTERY_2("15","无购彩记录时快投入口"),//二期没用
		HIT("16","中奖播报"),
		CHARGE("17","充值"),
		TAKEN("18","提款"),
		DEAL_DETAIL("19","交易明细"),
		BALANCE("20","账户余额/红包余额"),
		CUSTOMER_SERVICE("21","联系客服"),
		MY_MESSAGE("22","我的消息"),
		DRAW_NOTICE("23","开奖公告"),
		DRAW_NOTICE_COUNTRY("24","全国类"),
		DRAW_NOTICE_HIGH("25","高频"),
		DRAW_NOTICE_PROVINCIALLY("26","地方性"),
		CHARGE_NOW("27","立即充值"),//注册成功页面的立即充值
		MY_RED_PACKET("28","我的红包"),
		GO_HIT_THE_PRIZE("29","去中奖"),
		;
		
		private String value;
		
		private String text;
		
		Modul(String value, String text){
			this.value = value;
			this.text = text;
		}

		public String getValue() {
			return value;
		}

		public String getText() {
			return text;
		}

		/**
		 * @desc   返回属于'购彩功能'的模块
		 * @author Tony Wang
		 * @create 2017年10月19日
		 * @return 
		 */
		public static List<String> getLotteryModul() {
			return Arrays.asList(
					INDEX.getValue(),
					BANNER.getValue(),
					HIT.getValue(),
					FAST_LOTTERY.getValue(),
					LOTTERY_NAV.getValue(),
					//USER_CENTER.getValue(),
					CHARGE.getValue(),
					TAKEN.getValue(),
					BET_HISTORY.getValue(),
					DEAL_DETAIL.getValue(),
					MY_RED_PACKET.getValue(),
					ANGENT.getValue(),
					BALANCE.getValue(),
					CHARGE_NOW.getValue(),
					GO_HIT_THE_PRIZE.getValue()
					);
		}

//		/**
//		 * @desc   返回'个人中心栏'下属子模块
//		 * @author Tony Wang
//		 * @create 2017年10月17日
//		 * @return 
//		 */
//		public static List<String> getUserCenterSubModul() {
//			return Arrays.asList(
//					CHARGE.getValue(),
//					TAKEN.getValue(),
//					BET_HISTORY.getValue(),
//					DEAL_DETAIL.getValue(),
//					ANGENT.getValue(),
//					BALANCE.getValue(),
//					PROFILE.getValue(),
//					CUSTOMER_SERVICE.getValue(),
//					CONFIG.getValue(),
//					MY_MESSAGE.getValue()
//					);
//		}
//		
//		/**
//		 * @desc   返回'开奖公告'下属子模块
//		 * @author Tony Wang
//		 * @create 2017年10月17日
//		 * @return 
//		 */
//		public static List<String> getDrawNoticeSubModul() {
//			return Arrays.asList(
//					GO_HIT_THE_PRIZE.getValue(),
//					DRAW_NOTICE_COUNTRY.getValue(),
//					DRAW_NOTICE_HIGH.getValue(),
//					DRAW_NOTICE_PROVINCIALLY.getValue()
//					);
//		}
	}
}
