package com.hhly.skeleton.cms.report.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * 
* @Description: 注册与有效数据报表 
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserRegisterExcelBO extends BaseBO{

		@ExcelHeader("序号")
		private String id;
		@ExcelHeader("日期")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private String registerDate;
		@ExcelHeader("新用户注册")
		private String newUserCount;//新用户
		@ExcelHeader("完善用户")
		private String perfectUserCount;//完善用户
		@ExcelHeader("首充用户")
		private String firstRechargeCount;//首充用户
		@ExcelHeader("首投用户")
		private String firstBuyCount;//首投用户
		@ExcelHeader("完善转化率")
		private String perfectRate;//完善转化率
		@ExcelHeader("首充转化率")
		private String firstRechargeRate;//首充转化率
		
		public UserRegisterExcelBO(){}
		
		public UserRegisterExcelBO(int id,UserRegisterBO bo){
			this.id = String.valueOf(id);
			this.registerDate = DateUtil.convertDateToStr(bo.getRegisterDate());
			this.newUserCount =  String.valueOf(bo.getNewUserCount());
			this.perfectUserCount =  String.valueOf(bo.getPerfectUserCount());
			this.firstRechargeCount =  String.valueOf(bo.getFirstRechargeCount());
			this.firstBuyCount =  String.valueOf(bo.getFirstBuyCount());
			this.perfectRate = String.valueOf(bo.getPerfectRate()) + "%";
			this.firstRechargeRate = String.valueOf(bo.getFirstRechargeRate()) + "%";
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegisterDate() {
			return registerDate;
		}

		public void setRegisterDate(String registerDate) {
			this.registerDate = registerDate;
		}

		public String getNewUserCount() {
			return newUserCount;
		}

		public void setNewUserCount(String newUserCount) {
			this.newUserCount = newUserCount;
		}

		public String getPerfectUserCount() {
			return perfectUserCount;
		}

		public void setPerfectUserCount(String perfectUserCount) {
			this.perfectUserCount = perfectUserCount;
		}

		public String getFirstRechargeCount() {
			return firstRechargeCount;
		}

		public void setFirstRechargeCount(String firstRechargeCount) {
			this.firstRechargeCount = firstRechargeCount;
		}

		public String getFirstBuyCount() {
			return firstBuyCount;
		}

		public void setFirstBuyCount(String firstBuyCount) {
			this.firstBuyCount = firstBuyCount;
		}

		public String getPerfectRate() {
			return perfectRate;
		}

		public void setPerfectRate(String perfectRate) {
			this.perfectRate = perfectRate;
		}

		public String getFirstRechargeRate() {
			return firstRechargeRate;
		}

		public void setFirstRechargeRate(String firstRechargeRate) {
			this.firstRechargeRate = firstRechargeRate;
		}
		
}
