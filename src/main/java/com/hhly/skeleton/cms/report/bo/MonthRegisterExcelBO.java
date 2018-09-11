package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 
* @Description: 注册与有效数据报表 
* @author HouXiangBao289
* @String 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class MonthRegisterExcelBO extends BaseBO{
		
		@ExcelHeader("月份")
		private String yearMonth;
		@ExcelHeader("新注册用户")
		private Integer newUserCount = 0;//新用户
		@ExcelHeader("完善用户")
		private Integer perfectUserCount = 0;//完善用户
		@ExcelHeader("首充用户")
		private Integer firstRechargeCount = 0;//首充用户
		@ExcelHeader("首投用户")
		private Integer firstBuyCount = 0;//首投用户
		@ExcelHeader("完善转化率")
		private String perfectRate;//完善转化率
		@ExcelHeader("首充转化率")
		private String firstRechargeRate;//首充转化率
		
		/**
		 * 
		 * @Description 日期
		 * @author HouXiangBao289
		 * @return
		 */
		public String getYearMonth() {
			return yearMonth;
		}
		/**
		 * 
		 * @Description 日期
		 * @author HouXiangBao289
		 * @return
		 */
		public void setYearMonth(String yearMonth) {
			this.yearMonth = yearMonth;
		}
		/**
		 * 
		 * @Description 新用户
		 * @author HouXiangBao289
		 * @return
		 */
		public Integer getNewUserCount() {
			return newUserCount;
		}
		
		/**
		 * 
		 * @Description 新用户
		 * @author HouXiangBao289
		 * @return
		 */
		public void setNewUserCount(Integer newUserCount) {
			this.newUserCount = newUserCount;
		}
		
		/**
		 * 
		 * @Description 完善用户
		 * @author HouXiangBao289
		 * @return
		 */
		public Integer getPerfectUserCount() {
			return perfectUserCount;
		}
		/**
		 * 
		 * @Description 完善用户
		 * @author HouXiangBao289
		 * @return
		 */
		public void setPerfectUserCount(Integer perfectUserCount) {
			this.perfectUserCount = perfectUserCount;
		}
		
		/**
		 * 
		 * @Description 首充用户
		 * @author HouXiangBao289
		 * @return
		 */
		public Integer getFirstRechargeCount() {
			return firstRechargeCount;
		}
		/**
		 * 
		 * @Description 首充用户
		 * @author HouXiangBao289
		 * @return
		 */
		public void setFirstRechargeCount(Integer firstRechargeCount) {
			this.firstRechargeCount = firstRechargeCount;
		}
		
		/**
		 * 
		 * @Description 首投用户
		 * @author HouXiangBao289
		 * @return
		 */
		public Integer getFirstBuyCount() {
			return firstBuyCount;
		}
		/**
		 * 
		 * @Description 首投用户
		 * @author HouXiangBao289
		 * @return
		 */
		public void setFirstBuyCount(Integer firstBuyCount) {
			this.firstBuyCount = firstBuyCount;
		}
		
		/**
		 * 
		 * @Description 完善转化率
		 * @author HouXiangBao289
		 * @return
		 */
		public String getPerfectRate() {
			return perfectRate;
		}
		/**
		 * 
		 * @Description 完善转化率
		 * @author HouXiangBao289
		 * @return
		 */
		public void setPerfectRate(String perfectRate) {
			this.perfectRate = perfectRate;
		}
		
		/**
		 * 
		 * @Description 首充转化率
		 * @author HouXiangBao289
		 * @return
		 */
		public String getFirstRechargeRate() {
			return firstRechargeRate;
		}
		/**
		 * 
		 * @Description 首充转化率
		 * @author HouXiangBao289
		 * @return
		 */
		public void setFirstRechargeRate(String firstRechargeRate) {
			this.firstRechargeRate = firstRechargeRate;
		}
		
}
