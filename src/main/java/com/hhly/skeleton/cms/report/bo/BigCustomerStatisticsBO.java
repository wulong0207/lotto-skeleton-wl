package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 大客户统计
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class BigCustomerStatisticsBO extends BaseBO{

		private Integer bigBetUserCount = 0;//大客户投注人数
		private Integer noBigBetUserCount = 0;//非大客户投注人数
		private Double bigOrderMoney = 0.0;//大客户投注金额
		private Double noBigOrderMoney = 0.0;//非大客户投注金额
		private Double webOrderMoney = 0.00;//web销售金额
		private Double wapOrderMoney = 0.00;//wap销售金额
		private Double androidOrderMoney = 0.00;//android销售金额
		private Double iosOrderMoney = 0.00;//ios销售金额
		
		public Integer getBigBetUserCount() {
			return bigBetUserCount;
		}
		public void setBigBetUserCount(Integer bigBetUserCount) {
			this.bigBetUserCount = bigBetUserCount;
		}
		public Integer getNoBigBetUserCount() {
			return noBigBetUserCount;
		}
		public void setNoBigBetUserCount(Integer noBigBetUserCount) {
			this.noBigBetUserCount = noBigBetUserCount;
		}
		public Double getBigOrderMoney() {
			return bigOrderMoney;
		}
		public void setBigOrderMoney(Double bigOrderMoney) {
			this.bigOrderMoney = bigOrderMoney;
		}
		public Double getNoBigOrderMoney() {
			return noBigOrderMoney;
		}
		public void setNoBigOrderMoney(Double noBigOrderMoney) {
			this.noBigOrderMoney = noBigOrderMoney;
		}
		public Double getWebOrderMoney() {
			return webOrderMoney;
		}
		public void setWebOrderMoney(Double webOrderMoney) {
			this.webOrderMoney = webOrderMoney;
		}
		public Double getWapOrderMoney() {
			return wapOrderMoney;
		}
		public void setWapOrderMoney(Double wapOrderMoney) {
			this.wapOrderMoney = wapOrderMoney;
		}
		public Double getAndroidOrderMoney() {
			return androidOrderMoney;
		}
		public void setAndroidOrderMoney(Double androidOrderMoney) {
			this.androidOrderMoney = androidOrderMoney;
		}
		public Double getIosOrderMoney() {
			return iosOrderMoney;
		}
		public void setIosOrderMoney(Double iosOrderMoney) {
			this.iosOrderMoney = iosOrderMoney;
		}
		
}
