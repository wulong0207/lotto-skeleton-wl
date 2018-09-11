package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 平台首充用户数
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class PlatformFirstBO extends BaseBO{

		private Integer webFirstRechargeCount = 0;//web平台首充用户数
		private Integer wapFirstRechargeCount = 0;//wap平台首充用户数
		private Integer androidFirstRechargeCount = 0;//Android平台首充用户数
		private Integer iosFirstRechargeCount = 0;//ios平台首充用户数
		
		public Integer getWebFirstRechargeCount() {
			return webFirstRechargeCount;
		}
		public void setWebFirstRechargeCount(Integer webFirstRechargeCount) {
			this.webFirstRechargeCount = webFirstRechargeCount;
		}
		public Integer getWapFirstRechargeCount() {
			return wapFirstRechargeCount;
		}
		public void setWapFirstRechargeCount(Integer wapFirstRechargeCount) {
			this.wapFirstRechargeCount = wapFirstRechargeCount;
		}
		public Integer getAndroidFirstRechargeCount() {
			return androidFirstRechargeCount;
		}
		public void setAndroidFirstRechargeCount(Integer androidFirstRechargeCount) {
			this.androidFirstRechargeCount = androidFirstRechargeCount;
		}
		public Integer getIosFirstRechargeCount() {
			return iosFirstRechargeCount;
		}
		public void setIosFirstRechargeCount(Integer iosFirstRechargeCount) {
			this.iosFirstRechargeCount = iosFirstRechargeCount;
		}
		
		
}
