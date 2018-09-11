package com.hhly.skeleton.base.common;

import java.util.Objects;


/**
 * @desc    
 * @author  cheng chen
 * @date    2017年4月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpCorrectEnum {

	/**
	 * @desc    意见来源
	 * @author  cheng chen
	 * @date    2017年4月25日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum Sources {
		/**
		 * 1：首页；2：文章
		 */
		Home(1),
		Article(2);
		
		private int value;

		Sources(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}

		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Sources sources : Sources.values()) {
				if(Objects.equals(sources.getValue(), target))
					return true;
			}
			return false;
		}
		public static Sources valueOf(Integer target) {
			if(null == target) return null;
			for(Sources sources : Sources.values()) {
				if(Objects.equals(sources.getValue(), target))
					return sources;
			}
			return null;
		}
	}

	/**
	 * @desc    意见状态
	 * @author  cheng chen
	 * @date    2017年4月25日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum Status {
		/**
		 * 1：已处理；0：未处理
		 */
		Yes(1),
		No(0);
		
		private int value;

		Status(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}

		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Status status : Status.values()) {
				if(Objects.equals(status, target))
					return true;
			}
			return false;
		}
		public static Status valueOf(Integer target) {
			if(null == target) return null;
			for(Status status : Status.values()) {
				if(Objects.equals(status.getValue(), target))
					return status;
			}
			return null;
		}
	}
	
	/**
	 * @desc    意见类型
	 * @author  cheng chen
	 * @date    2017年4月25日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum Type {
		/**
		 * 1：纠正内容；2：文章建议
		 */
		Correct(1),
		Advice(2);
		
		private int value;

		Type(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}

		public static boolean contains(Integer target) {
			if(null == target) return false;
			for(Type type : Type.values()) {
				if(Objects.equals(type.getValue(), target))
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
}
