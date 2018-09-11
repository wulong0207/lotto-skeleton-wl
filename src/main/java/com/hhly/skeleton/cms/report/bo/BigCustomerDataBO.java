package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 大客户明细数据
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class BigCustomerDataBO extends BaseBO{

		private Integer userId;//大客户id
		private String userName;//大客户用户名
		private Double rechargeMoney = 0.00;//大客户充值金额
		private Double orderMoney = 0.00;//大客户投注金额
		private Double prizeMoney = 0.00;//web中奖金额
		private String profitRate;//盈利率((中奖-投注)/ 投注)
		private String betValue;//流水价值(投注金额/充值金额)
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
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
