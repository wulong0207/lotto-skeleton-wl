/**
 * 
 */
package com.hhly.skeleton.base.common;

/**
 * @desc    报表枚举类
 * @author  Tony Wang
 * @date    2017年9月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ReportEnum {

	/**
	 * @desc    统计时间
	 * @author  Tony Wang
	 * @date    2017年9月1日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum StatisTime {
		// 1昨天 2今天 3上周  4本周  5上月  6本月
		YESTODAY(1),
		TODAY(2),
		LASTWEEK(3),
		THISWEEK(4),
		LASTMONTH(5),
		THISMONTH(6)
		;
		private final int value;

		StatisTime(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
	}
}
