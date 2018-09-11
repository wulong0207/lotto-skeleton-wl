package com.hhly.skeleton.cms.sportmgr.po;

import com.hhly.skeleton.base.bo.BaseBO;

public class SumNewOldUserPo extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8035072372491612668L;
	/**
	 * 新用户时间范围内投注总和数
	 */
	private long sumNewBetUser;
	/**
	 * 老用户时间范围内投注总和数
	 */
	private long sumOldBetUser;
	
	/**
	 * 新用户时间范围内的投注金额总和数
	 */
	private long sumNewBetAmountUser;
	/**
	 * 老用户时间范围内的投注金额总和数
	 */
	private long sumOldBetAmountUser;
	public long getSumNewBetUser() {
		return sumNewBetUser;
	}
	public void setSumNewBetUser(long sumNewBetUser) {
		this.sumNewBetUser = sumNewBetUser;
	}
	public long getSumOldBetUser() {
		return sumOldBetUser;
	}
	public void setSumOldBetUser(long sumOldBetUser) {
		this.sumOldBetUser = sumOldBetUser;
	}
	public long getSumNewBetAmountUser() {
		return sumNewBetAmountUser;
	}
	public void setSumNewBetAmountUser(long sumNewBetAmountUser) {
		this.sumNewBetAmountUser = sumNewBetAmountUser;
	}
	public long getSumOldBetAmountUser() {
		return sumOldBetAmountUser;
	}
	public void setSumOldBetAmountUser(long sumOldBetAmountUser) {
		this.sumOldBetAmountUser = sumOldBetAmountUser;
	}
	@Override
	public String toString() {
		return "SumNewOldUserPo [sumNewBetUser=" + sumNewBetUser + ", sumOldBetUser=" + sumOldBetUser
				+ ", sumNewBetAmountUser=" + sumNewBetAmountUser + ", sumOldBetAmountUser=" + sumOldBetAmountUser + "]";
	}
	
	
	
}
