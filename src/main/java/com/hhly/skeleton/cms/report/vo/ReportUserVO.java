package com.hhly.skeleton.cms.report.vo;

/**
 * @desc    用户数据报表查询VO
 * @author  Tony Wang
 * @boolean    2017年9月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportUserVO implements java.io.Serializable {
	
	private boolean adddate;
    private boolean channelId;
    private boolean channelName;
    private boolean platform;

	/**
	 * 注册人数
	 */
    private boolean regUser;

	/**
	 * 实名认证人数
	 */
    private boolean checkUser;

	/**
	 * 投注人数
	 */
    private boolean orderUser;

	/**
	 * 投注次数
	 */
    private boolean orderTimes;

	/**
	 * 投注额
	 */
    private boolean orderMoney;

	/**
	 * 新用户投注额
	 */
    private boolean newOrderUser;

    private boolean newOrderTimes;

    private boolean newOrderMoney;

    private boolean oldOrderUser;

    private boolean oldOrderTimes;

    private boolean oldOrderMoney;

    private boolean fillUser;

    private boolean fillTimes;

    private boolean fillMoney;

	/**
	 * 首充人数
	 */
    private boolean newFillUser;

    private boolean newFillTimes;

    private boolean newFillMoney;

    private boolean oldFillUser;

    private boolean oldFillTimes;

    private boolean oldFillMoney;
    
	public boolean isChannelId() {
		return channelId;
	}

	public void setChannelId(boolean channelId) {
		this.channelId = channelId;
	}

	public boolean isChannelName() {
		return channelName;
	}

	public void setChannelName(boolean channelName) {
		this.channelName = channelName;
	}

	public boolean isPlatform() {
		return platform;
	}

	public void setPlatform(boolean platform) {
		this.platform = platform;
	}

	public boolean isRegUser() {
		return regUser;
	}

	public void setRegUser(boolean regUser) {
		this.regUser = regUser;
	}

	public boolean isCheckUser() {
		return checkUser;
	}

	public void setCheckUser(boolean checkUser) {
		this.checkUser = checkUser;
	}

	public boolean isOrderUser() {
		return orderUser;
	}

	public void setOrderUser(boolean orderUser) {
		this.orderUser = orderUser;
	}

	public boolean isOrderTimes() {
		return orderTimes;
	}

	public void setOrderTimes(boolean orderTimes) {
		this.orderTimes = orderTimes;
	}

	public boolean isOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(boolean orderMoney) {
		this.orderMoney = orderMoney;
	}

	public boolean isNewOrderUser() {
		return newOrderUser;
	}

	public void setNewOrderUser(boolean newOrderUser) {
		this.newOrderUser = newOrderUser;
	}

	public boolean isNewOrderTimes() {
		return newOrderTimes;
	}

	public void setNewOrderTimes(boolean newOrderTimes) {
		this.newOrderTimes = newOrderTimes;
	}

	public boolean isNewOrderMoney() {
		return newOrderMoney;
	}

	public void setNewOrderMoney(boolean newOrderMoney) {
		this.newOrderMoney = newOrderMoney;
	}

	public boolean isOldOrderUser() {
		return oldOrderUser;
	}

	public void setOldOrderUser(boolean oldOrderUser) {
		this.oldOrderUser = oldOrderUser;
	}

	public boolean isOldOrderTimes() {
		return oldOrderTimes;
	}

	public void setOldOrderTimes(boolean oldOrderTimes) {
		this.oldOrderTimes = oldOrderTimes;
	}

	public boolean isOldOrderMoney() {
		return oldOrderMoney;
	}

	public void setOldOrderMoney(boolean oldOrderMoney) {
		this.oldOrderMoney = oldOrderMoney;
	}

	public boolean isFillUser() {
		return fillUser;
	}

	public void setFillUser(boolean fillUser) {
		this.fillUser = fillUser;
	}

	public boolean isFillTimes() {
		return fillTimes;
	}

	public void setFillTimes(boolean fillTimes) {
		this.fillTimes = fillTimes;
	}

	public boolean isFillMoney() {
		return fillMoney;
	}

	public void setFillMoney(boolean fillMoney) {
		this.fillMoney = fillMoney;
	}

	public boolean isNewFillUser() {
		return newFillUser;
	}

	public void setNewFillUser(boolean newFillUser) {
		this.newFillUser = newFillUser;
	}

	public boolean isNewFillTimes() {
		return newFillTimes;
	}

	public void setNewFillTimes(boolean newFillTimes) {
		this.newFillTimes = newFillTimes;
	}

	public boolean isNewFillMoney() {
		return newFillMoney;
	}

	public void setNewFillMoney(boolean newFillMoney) {
		this.newFillMoney = newFillMoney;
	}

	public boolean isOldFillUser() {
		return oldFillUser;
	}

	public void setOldFillUser(boolean oldFillUser) {
		this.oldFillUser = oldFillUser;
	}

	public boolean isOldFillTimes() {
		return oldFillTimes;
	}

	public void setOldFillTimes(boolean oldFillTimes) {
		this.oldFillTimes = oldFillTimes;
	}

	public boolean isOldFillMoney() {
		return oldFillMoney;
	}

	public void setOldFillMoney(boolean oldFillMoney) {
		this.oldFillMoney = oldFillMoney;
	}

	public boolean isAdddate() {
		return adddate;
	}

	public void setAdddate(boolean adddate) {
		this.adddate = adddate;
	}
}
