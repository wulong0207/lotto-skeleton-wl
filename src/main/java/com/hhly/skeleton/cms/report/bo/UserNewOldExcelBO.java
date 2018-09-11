package com.hhly.skeleton.cms.report.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * 
* @Description: 新老用户数据报表导出
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserNewOldExcelBO extends BaseBO{

		@ExcelHeader("序号")
		private String id;
		@ExcelHeader("日期")
		@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
		private String buyDate;//投注时间
		@ExcelHeader("投注用户数")
		private String orderUserCount;//投注用户
		@ExcelHeader("投注新用户数")
		private String newUserCount;//新用户投注
		@ExcelHeader("投注老用户数")
		private String oldUserCount;//老用户投注
		@ExcelHeader("投注总金额")
		private String userMoney;//投注金额
		@ExcelHeader("新用户投注金额")
		private String newUserMoney;//新用户投注金额
		@ExcelHeader("老用户投注金额")
		private String oldUserMoney;//老用户投注金额
		
		public UserNewOldExcelBO(){}
		
		public UserNewOldExcelBO(int id,UserNewOldBO bo){
			this.id = String.valueOf(id);
			this.buyDate = DateUtil.convertDateToStr(bo.getBuyDate());
			this.orderUserCount = StringUtil.convertObjToStr(bo.getOrderUserCount());
			this.newUserCount = StringUtil.convertObjToStr(bo.getNewUserCount());
			this.oldUserCount = StringUtil.convertObjToStr(bo.getOldUserCount());
			this.userMoney = StringUtil.convertObjToStr(bo.getUserMoney());
			this.oldUserMoney = StringUtil.convertObjToStr(bo.getOldUserMoney());
			this.newUserMoney = StringUtil.convertObjToStr(bo.getNewUserMoney());
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}

		public String getBuyDate() {
			return buyDate;
		}

		public void setBuyDate(String buyDate) {
			this.buyDate = buyDate;
		}

		public String getOrderUserCount() {
			return orderUserCount;
		}

		public void setOrderUserCount(String orderUserCount) {
			this.orderUserCount = orderUserCount;
		}

		public String getNewUserCount() {
			return newUserCount;
		}

		public void setNewUserCount(String newUserCount) {
			this.newUserCount = newUserCount;
		}

		public String getOldUserCount() {
			return oldUserCount;
		}

		public void setOldUserCount(String oldUserCount) {
			this.oldUserCount = oldUserCount;
		}

		public String getUserMoney() {
			return userMoney;
		}

		public void setUserMoney(String userMoney) {
			this.userMoney = userMoney;
		}

		public String getNewUserMoney() {
			return newUserMoney;
		}

		public void setNewUserMoney(String newUserMoney) {
			this.newUserMoney = newUserMoney;
		}

		public String getOldUserMoney() {
			return oldUserMoney;
		}

		public void setOldUserMoney(String oldUserMoney) {
			this.oldUserMoney = oldUserMoney;
		}
		
}
