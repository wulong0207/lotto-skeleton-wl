package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 
* @Description: 大客户明细数据
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class BigCustomerDataExcelBO extends BaseBO{
		
	@ExcelHeader("序列号")
	private String rowId;
	@ExcelHeader("用户名")
	private String userName;//客户账户
	@ExcelHeader("充值金额")
	private Double rechargeMoney = 0.0;//大客户充值金额
	@ExcelHeader("投注金额")
	private Double orderMoney = 0.0;//非大客户投注金额
	@ExcelHeader("中奖金额")
	private Double prizeMoney;//web中奖金额
	@ExcelHeader("盈利率")
	private String profitRate;//盈利率((中奖-投注)/ 投注)
	@ExcelHeader("流水价值")
	private String betValue;//流水价值(投注金额/充值金额)
	
	
	
		public String getRowId() {
			return rowId;
		}
		public void setRowId(String rowId) {
			this.rowId = rowId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Double getRechargeMoney() {
			return rechargeMoney;
		}
		public void setRechargeMoney(Double rechargeMoney) {
			this.rechargeMoney = rechargeMoney;
		}
		public Double getOrderMoney() {
			return orderMoney;
		}
		public void setOrderMoney(Double orderMoney) {
			this.orderMoney = orderMoney;
		}
		public Double getPrizeMoney() {
			return prizeMoney;
		}
		public void setPrizeMoney(Double prizeMoney) {
			this.prizeMoney = prizeMoney;
		}
		public String getProfitRate() {
			return profitRate;
		}
		public void setProfitRate(String profitRate) {
			this.profitRate = profitRate;
		}
		public String getBetValue() {
			return betValue;
		}
		public void setBetValue(String betValue) {
			this.betValue = betValue;
		}

}
