package com.hhly.skeleton.cms.report.vo;

/**
 * @desc    r_lottery_type表VO
 * @author  Tony Wang
 * @boolean 2017年9月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportLotteryTypeVO implements java.io.Serializable {
	
	private boolean orderMoney;
	private boolean orderUser;
	private boolean winningMoney;
    private boolean buyUser;
    private boolean buyMoney;
    private boolean addUser;
    private boolean addMoney;
    private boolean groupUser;
    private boolean groupMoney;

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

	public boolean isOrderUser() {
		return orderUser;
	}

	public void setOrderUser(boolean orderUser) {
		this.orderUser = orderUser;
	}

	public boolean isBuyUser() {
		return buyUser;
	}

	public void setBuyUser(boolean buyUser) {
		this.buyUser = buyUser;
	}

	public boolean isBuyMoney() {
		return buyMoney;
	}

	public void setBuyMoney(boolean buyMoney) {
		this.buyMoney = buyMoney;
	}

	public boolean isAddUser() {
		return addUser;
	}

	public void setAddUser(boolean addUser) {
		this.addUser = addUser;
	}

	public boolean isAddMoney() {
		return addMoney;
	}

	public void setAddMoney(boolean addMoney) {
		this.addMoney = addMoney;
	}

	public boolean isGroupUser() {
		return groupUser;
	}

	public void setGroupUser(boolean groupUser) {
		this.groupUser = groupUser;
	}

	public boolean isGroupMoney() {
		return groupMoney;
	}

	public void setGroupMoney(boolean groupMoney) {
		this.groupMoney = groupMoney;
	}
	
}
