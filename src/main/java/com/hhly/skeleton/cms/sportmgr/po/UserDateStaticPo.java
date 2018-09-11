package com.hhly.skeleton.cms.sportmgr.po;

import java.math.BigDecimal;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @ClassName: UserDateStaticPo 
 * @Description: 用户数据PO
 * @author wuLong
 * @date 2017年7月10日 下午12:28:43 
 *
 */
public class UserDateStaticPo extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2610820977715736133L;
	/**
	 * 人数
	 */
	private int num;
	/**
	 * 数据类型 (1:注册用户,2:投注用户,3:新用户投注,4:老用户投注)
	 */
	private int type;
	/**
	 * 首次充值用户数
	 */
	private int firstRechargeNum;
	/**
	 * 首充转化率(格式：10%)
	 */
	private String firstRechargeChangeRate;
	/**
	 * 投注次数
	 */
	private int betNum;
	/**
	 * 活跃度
	 */
	private int liveness;
	/**
	 * 投注额
	 */
	private BigDecimal amount;
	/**
	 * Arpu值
	 */
	private BigDecimal arpu;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getFirstRechargeNum() {
		return firstRechargeNum;
	}
	public void setFirstRechargeNum(int firstRechargeNum) {
		this.firstRechargeNum = firstRechargeNum;
	}
	public String getFirstRechargeChangeRate() {
		return firstRechargeChangeRate;
	}
	public void setFirstRechargeChangeRate(String firstRechargeChangeRate) {
		this.firstRechargeChangeRate = firstRechargeChangeRate;
	}
	public int getBetNum() {
		return betNum;
	}
	public void setBetNum(int betNum) {
		this.betNum = betNum;
	}
	public int getLiveness() {
		return liveness;
	}
	public void setLiveness(int liveness) {
		this.liveness = liveness;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getArpu() {
		return arpu;
	}
	public void setArpu(BigDecimal arpu) {
		this.arpu = arpu;
	}
	@Override
	public String toString() {
		return "UserDateStaticPo [num=" + num + ", type=" + type + ", firstRechargeNum=" + firstRechargeNum
				+ ", firstRechargeChangeRate=" + firstRechargeChangeRate + ", betNum=" + betNum + ", liveness="
				+ liveness + ", amount=" + amount + ", arpu=" + arpu + "]";
	}
	
	
}
