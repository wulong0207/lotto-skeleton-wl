package com.hhly.skeleton.cms.sportmgr.po;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @ClassName: RegisterEffectiveUserPo 
 * @Description: 注册与有效用户数据统计时间范围内每日汇总list集合对象
 * @author wuLong
 * @date 2017年7月10日 下午2:45:32 
 *
 */
public class RegisterEffectiveUserPo extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2023997079006671668L;
	/**
	 * 日期
	 */
	private String time;
	/**
	 * 新注册用户
	 */
	private long newRegisterUser;
	/**
	 * 完善用户
	 */
	private long perfectUser;
	/**
	 * 首充用户
	 */
	private long firstRechargeUser;
	/**
	 * 首投用户
	 */
	private long firstBetUser;
	/**
	 * 完善转换率
	 */
	private String perfectChangeRate;
	/**
	 * 首充转换率
	 */
	private String firstRechargeRate;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public long getNewRegisterUser() {
		return newRegisterUser;
	}
	public void setNewRegisterUser(long newRegisterUser) {
		this.newRegisterUser = newRegisterUser;
	}
	public long getPerfectUser() {
		return perfectUser;
	}
	public void setPerfectUser(long perfectUser) {
		this.perfectUser = perfectUser;
	}
	public long getFirstRechargeUser() {
		return firstRechargeUser;
	}
	public void setFirstRechargeUser(long firstRechargeUser) {
		this.firstRechargeUser = firstRechargeUser;
	}
	public long getFirstBetUser() {
		return firstBetUser;
	}
	public void setFirstBetUser(long firstBetUser) {
		this.firstBetUser = firstBetUser;
	}
	public String getPerfectChangeRate() {
		return perfectChangeRate;
	}
	public void setPerfectChangeRate(String perfectChangeRate) {
		this.perfectChangeRate = perfectChangeRate;
	}
	public String getFirstRechargeRate() {
		return firstRechargeRate;
	}
	public void setFirstRechargeRate(String firstRechargeRate) {
		this.firstRechargeRate = firstRechargeRate;
	}
	@Override
	public String toString() {
		return "RegisterEffectiveUserPo [time=" + time + ", newRegisterUser=" + newRegisterUser + ", perfectUser="
				+ perfectUser + ", firstRechargeUser=" + firstRechargeUser + ", firstBetUser=" + firstBetUser
				+ ", perfectChangeRate=" + perfectChangeRate + ", firstRechargeRate=" + firstRechargeRate + "]";
	}
	
	
}
