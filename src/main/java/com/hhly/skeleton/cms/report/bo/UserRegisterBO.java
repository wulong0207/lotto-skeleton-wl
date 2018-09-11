package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 注册与有效数据报表 
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserRegisterBO extends BaseBO{

		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date registerDate;
		private Integer newUserCount = 0;//新用户
		private Integer perfectUserCount = 0;//完善用户
		private Integer firstRechargeCount = 0;//首充用户
		private Integer firstBuyCount = 0;//首投用户
		private Integer perfectRate = 0;//完善转化率
		private String firstRechargeRate = "0.00";//首充转化率
		private Double firstBuyMoney = 0.00;// 首投金额
		private Double firstRechargeMoney = 0.00;//首充金额

		public Double getFirstBuyMoney() {
			return firstBuyMoney;
		}
		public void setFirstBuyMoney(Double firstBuyMoney) {
			this.firstBuyMoney = firstBuyMoney;
		}
		public Double getFirstRechargeMoney() {
			return firstRechargeMoney;
		}
		public void setFirstRechargeMoney(Double firstRechargeMoney) {
			this.firstRechargeMoney = firstRechargeMoney;
		}
		/**
		 * 
		 * @Description 日期
		 * @author HouXiangBao289
		 * @return
		 */
		public Date getRegisterDate() {
			return registerDate;
		}
		/**
		 * 
		 * @Description 日期
		 * @author HouXiangBao289
		 * @return
		 */
		public void setRegisterDate(Date registerDate) {
			this.registerDate = registerDate;
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
		public Integer getPerfectRate() {
			return perfectRate;
		}
		/**
		 * 
		 * @Description 完善转化率
		 * @author HouXiangBao289
		 * @return
		 */
		public void setPerfectRate(Integer perfectRate) {
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
