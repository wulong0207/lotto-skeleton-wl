package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 用户数据概况
* @author HouXiangBao289
* @date 2017年8月16日 下午2:24:17 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class UserDataBO extends BaseBO{
	
	private Integer registerUserCount = 0;//注册用户
	private Integer firstRechargeCount = 0;//首充用户
	private Integer buyUserCount = 0;//投注用户
	private Integer userBuyCount = 0;//投注次数
	private Double buyMoney = 0.00;//投注额
	private Integer newUserCount = 0;//新用户
	private Integer newUserBuyCount = 0;//新用户投注次数
	private Double newUserBuyMoney = 0.00;//新用户投注金额
	private Integer oldUserCount = 0;//老用户
	private Integer oldUserBuyCount = 0;//老用户投注次数
	private Double oldUserBuyMoney = 0.00;//老用户投注金额
	
	public Integer getRegisterUserCount() {
		return registerUserCount;
	}
	public void setRegisterUserCount(Integer registerUserCount) {
		this.registerUserCount = registerUserCount;
	}
	public Integer getFirstRechargeCount() {
		return firstRechargeCount;
	}
	public void setFirstRechargeCount(Integer firstRechargeCount) {
		this.firstRechargeCount = firstRechargeCount;
	}
	public Integer getBuyUserCount() {
		return buyUserCount;
	}
	public void setBuyUserCount(Integer buyUserCount) {
		this.buyUserCount = buyUserCount;
	}
	public Integer getUserBuyCount() {
		return userBuyCount;
	}
	public void setUserBuyCount(Integer userBuyCount) {
		this.userBuyCount = userBuyCount;
	}
	public Double getBuyMoney() {
		return buyMoney;
	}
	public void setBuyMoney(Double buyMoney) {
		this.buyMoney = buyMoney;
	}
	public Integer getNewUserCount() {
		return newUserCount;
	}
	public void setNewUserCount(Integer newUserCount) {
		this.newUserCount = newUserCount;
	}
	public Integer getNewUserBuyCount() {
		return newUserBuyCount;
	}
	public void setNewUserBuyCount(Integer newUserBuyCount) {
		this.newUserBuyCount = newUserBuyCount;
	}
	public Double getNewUserBuyMoney() {
		return newUserBuyMoney;
	}
	public void setNewUserBuyMoney(Double newUserBuyMoney) {
		this.newUserBuyMoney = newUserBuyMoney;
	}
	public Integer getOldUserCount() {
		return oldUserCount;
	}
	public void setOldUserCount(Integer oldUserCount) {
		this.oldUserCount = oldUserCount;
	}
	public Integer getOldUserBuyCount() {
		return oldUserBuyCount;
	}
	public void setOldUserBuyCount(Integer oldUserBuyCount) {
		this.oldUserBuyCount = oldUserBuyCount;
	}
	public Double getOldUserBuyMoney() {
		return oldUserBuyMoney;
	}
	public void setOldUserBuyMoney(Double oldUserBuyMoney) {
		this.oldUserBuyMoney = oldUserBuyMoney;
	}

	
	
}
