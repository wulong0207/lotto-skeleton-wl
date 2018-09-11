package com.hhly.skeleton.cms.sportmgr.po;

import java.math.BigDecimal;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @ClassName: NewOldUserPo 
 * @Description: 新老用户数据统计时间范围内每日汇总list集合对象
 * @author wuLong
 * @date 2017年7月10日 下午2:45:32 
 *
 */
public class NewOldUserPo extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9110934622460281135L;
	/**
	 * 日期
	 */
	private String time;
	/**
	 * 新用户投注人数
	 */
	private long newBetUser;
	/**
	 * 老用户投注人数
	 */
	private long oldBetUser;
	/**
	 * 新用户投注金额数
	 */
	private BigDecimal newBetAmountUser;
	/**
	 * 老用户投注金额数
	 */
	private BigDecimal oldBetAmountUser;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public long getNewBetUser() {
		return newBetUser;
	}
	public void setNewBetUser(long newBetUser) {
		this.newBetUser = newBetUser;
	}
	public long getOldBetUser() {
		return oldBetUser;
	}
	public void setOldBetUser(long oldBetUser) {
		this.oldBetUser = oldBetUser;
	}
	public BigDecimal getNewBetAmountUser() {
		return newBetAmountUser;
	}
	public void setNewBetAmountUser(BigDecimal newBetAmountUser) {
		this.newBetAmountUser = newBetAmountUser;
	}
	public BigDecimal getOldBetAmountUser() {
		return oldBetAmountUser;
	}
	public void setOldBetAmountUser(BigDecimal oldBetAmountUser) {
		this.oldBetAmountUser = oldBetAmountUser;
	}
	@Override
	public String toString() {
		return "NewOldUserPo [time=" + time + ", newBetUser=" + newBetUser + ", oldBetUser=" + oldBetUser
				+ ", newBetAmountUser=" + newBetAmountUser + ", oldBetAmountUser=" + oldBetAmountUser + "]";
	}
	
	
	
}
