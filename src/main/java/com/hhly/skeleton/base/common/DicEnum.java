/**
 * 
 */
package com.hhly.skeleton.base.common;

import java.util.Objects;

/**
 * @desc 数据字典枚举类
 * @author Bruce
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DicEnum {
	/**
	 * @desc 发布平台枚举类
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum PlatFormEnum{
		WEB((short)1),
		WAP((short)2),
		ANDROID((short)3),
		IOS((short)4);
		/*** 类型*/
		private short value;
		/*** 描述 */
		private String desc;

		PlatFormEnum(short value) {
			this.value = value;
		}

		PlatFormEnum(short value, String desc) {
			this(value);
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}
				
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		/**
		 * @param value
		 * @return
		 * @Desc 是否包含类型
		 */
		public static boolean contain(Short value) {
			if(value==null)return false;
			for (PlatFormEnum temp : PlatFormEnum.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
		
		public static PlatFormEnum getPlatFormEnum(Short platform) {
		    if (platform == null) {
                return null;
            }
			for (PlatFormEnum l : PlatFormEnum.values()){
				if (Objects.equals(l.getValue(), platform)) {
					return l;
				}
			}
			return null;
		}
	}
	
	/**
	 * @desc 移动端类型:1:ios;2:android;
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum MobailPlatFormEnum{
		IOS((short)1),
		ANDROID((short)2);
		/*** 类型*/
		private short value;
		/*** 描述 */
		private String desc;

		MobailPlatFormEnum(short value) {
			this.value = value;
		}
		MobailPlatFormEnum(short value, String desc) {
			this(value);
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
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
	 * @desc 广告图页面枚举类
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AdMenuEnum{
		HOME((short)1),//首页
		LOGIO((short)2),//登录页
		USERHONE((short)3),//用户中心页
		PAY((short)4),//付款落地页
		GC((short)5),//购彩页
		MOBAILHOME((short)6),//移动端首页
		NEWS((short)7),//资讯首页
		NEWSLM((short)8),//资讯栏目页首页
		MOBAILLM((short)9),//移动端资讯栏目页
		VIDEO((short)10),//视频内容页
		MOBILNESDETAIL((short)11),//移动资讯内容页
		FAETAIL((short)12),//方案详情页
		JUMPMOBIAL((short)13),//移动端首页弹窗
		GCDT((short)14),//购彩大厅
		CDHOME((short)15)//抄单首页
		;
		/*** 类型*/
		private short value;
		/*** 描述 */
		private String desc;

		AdMenuEnum(short value) {
			this.value = value;
		}

		AdMenuEnum(short value, String desc) {
			this(value);
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}
				
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		/**
		 * @param value
		 * @return
		 * @Desc 是否包含类型
		 */
		public static boolean contain(short value) {
			for (AdMenuEnum temp : AdMenuEnum.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}
	
	/**
	 * @desc 快投页面枚举类
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum FastMenuEnum{
		HOME((short)1),
		NEWS((short)2),
		USERHOME((short)3),
		DRAW((short)4);

		/*** 类型*/
		private short value;
		/*** 描述 */
		private String desc;

		FastMenuEnum(short value) {
			this.value = value;
		}

		FastMenuEnum(short value, String desc) {
			this(value);
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}
				
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		/**
		 * @param value
		 * @return
		 * @Desc 是否包含类型
		 */
		public static boolean contain(short value) {
			for (FastMenuEnum temp : FastMenuEnum.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}
	
	/**
	 * @desc 快投竞彩足球枚举类
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum FastFootBollEnum{
		SINGLE_BET(1),//单关
		SINGLE_WIN(2);//单场致胜

		/*** 类型*/
		private int value;
		/*** 描述 */
		private String desc;

		FastFootBollEnum(int value) {
			this.value = value;
		}

		FastFootBollEnum(int value, String desc) {
			this(value);
			this.desc = desc;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
	 * @desc 大客户返佣周期：1每单，2每天
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum RebateTypeEnum{
		EVERY_ORDER(1,"每单"),//每单
		EVERY_DAY(2,"每天"),//每天
		EVERY_WEEK(3,"每周"),//每周
		EVERY_MONTH(4,"每月");//每周

		/*** 类型*/
		private int value;
		/*** 描述 */
		private String desc;

		RebateTypeEnum(int value, String desc) {
			this.value=value ;
			this.desc = desc;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
	 * @desc 状态; 1已处理;2;待处理
	 * @author lidecheng
	 * @date 2017年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum RebateStatusEnum{
		HENDED(1,"已处理"),//每单
		HEND_WAIT(2,"待处理");//每天

		/*** 类型*/
		private int value;
		/*** 描述 */
		private String desc;

		RebateStatusEnum(int value, String desc) {
			this.value=value ;
			this.desc = desc;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
