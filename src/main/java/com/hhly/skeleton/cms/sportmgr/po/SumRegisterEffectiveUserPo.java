package com.hhly.skeleton.cms.sportmgr.po;
/**
 * 
 * @ClassName: SumRegisterEffectiveUserPo 
 * @Description: 注册与有效用户数据统计时间范围内的汇总
 * @author wuLong
 * @date 2017年7月10日 下午2:44:55 
 *
 */
public class SumRegisterEffectiveUserPo {
	/**
	 * 新注册用户
	 */
	private long sumNewRegisterUser;
	/**
	 * 完善用户
	 */
	private long sumPerfectUser;
	/**
	 * 首充用户
	 */
	private long sumFirstRechargeUser;
	/**
	 * 首投用户
	 */
	private long sumFirstBetUser;
	public long getSumNewRegisterUser() {
		return sumNewRegisterUser;
	}
	public void setSumNewRegisterUser(long sumNewRegisterUser) {
		this.sumNewRegisterUser = sumNewRegisterUser;
	}
	public long getSumPerfectUser() {
		return sumPerfectUser;
	}
	public void setSumPerfectUser(long sumPerfectUser) {
		this.sumPerfectUser = sumPerfectUser;
	}
	public long getSumFirstRechargeUser() {
		return sumFirstRechargeUser;
	}
	public void setSumFirstRechargeUser(long sumFirstRechargeUser) {
		this.sumFirstRechargeUser = sumFirstRechargeUser;
	}
	public long getSumFirstBetUser() {
		return sumFirstBetUser;
	}
	public void setSumFirstBetUser(long sumFirstBetUser) {
		this.sumFirstBetUser = sumFirstBetUser;
	}
	@Override
	public String toString() {
		return "SumRegisterEffectiveUserPo [sumNewRegisterUser=" + sumNewRegisterUser + ", sumPerfectUser="
				+ sumPerfectUser + ", sumFirstRechargeUser=" + sumFirstRechargeUser + ", sumFirstBetUser="
				+ sumFirstBetUser + "]";
	}
	
	
}
