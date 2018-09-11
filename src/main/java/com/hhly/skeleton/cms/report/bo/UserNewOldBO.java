package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 新老用户数据报表 
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserNewOldBO extends BaseBO{

		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private Date buyDate;//投注时间
		private Integer orderUserCount = 0;//投注用户
		private Integer newUserCount = 0;//新用户投注
		private Integer oldUserCount = 0;//老用户投注
		private Integer userMoney = 0;//投注金额
		private Double newUserMoney = 0.00;//新用户投注金额
		private Double oldUserMoney = 0.00;//老用户投注金额
		
		public Date getBuyDate() {
			return buyDate;
		}
		public void setBuyDate(Date buyDate) {
			this.buyDate = buyDate;
		}
		public Integer getOrderUserCount() {
			return orderUserCount;
		}
		public void setOrderUserCount(Integer orderUserCount) {
			this.orderUserCount = orderUserCount;
		}
		public Integer getNewUserCount() {
			return newUserCount;
		}
		public void setNewUserCount(Integer newUserCount) {
			this.newUserCount = newUserCount;
		}
		public Integer getOldUserCount() {
			return oldUserCount;
		}
		public void setOldUserCount(Integer oldUserCount) {
			this.oldUserCount = oldUserCount;
		}
		public Integer getUserMoney() {
			return userMoney;
		}
		public void setUserMoney(Integer userMoney) {
			this.userMoney = userMoney;
		}
		public Double getNewUserMoney() {
			return newUserMoney;
		}
		public void setNewUserMoney(Double newUserMoney) {
			this.newUserMoney = newUserMoney;
		}
		public Double getOldUserMoney() {
			return oldUserMoney;
		}
		public void setOldUserMoney(Double oldUserMoney) {
			this.oldUserMoney = oldUserMoney;
		}
}
