package com.hhly.skeleton.cms.report.vo;

/**
 * @desc    r_lottery_child表VO
 * @author  Tony Wang
 * @boolean    2017年9月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportLotteryChildVO implements java.io.Serializable {
	
//	/**
//	 * 是否join表lottery_child
//	 */
//	private boolean joinChild;
//	/**
//	 * 是否join表lottery_type
//	 */
//	private boolean joinType;
	
	private boolean orderUser;
	private boolean orderMoney;
	private boolean winningMoney;

	public boolean isOrderUser() {
		return orderUser;
	}

	public void setOrderUser(boolean orderUser) {
		this.orderUser = orderUser;
	}

	public boolean isOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(boolean orderMoney) {
		this.orderMoney = orderMoney;
	}

	public boolean isWinningMoney() {
		return winningMoney;
	}

	public void setWinningMoney(boolean winningMoney) {
		this.winningMoney = winningMoney;
	}

	
	
}
