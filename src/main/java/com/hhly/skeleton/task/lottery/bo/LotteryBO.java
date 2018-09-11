package com.hhly.skeleton.task.lottery.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种BO
 * @author huangb
 * @date 2017年3月6日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryBO extends BaseBO {

	private static final long serialVersionUID = -7555387138273402720L;
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	/**
	 * 彩种logo地址
	 */
	private String lotteryLogoUrl;

	/**
	 * 彩种状态 0：暂停销售；1：正常销售
	 */
	private Short saleStatus;

	/**
	 * 官方开奖时间 格式为： 2|21:15,4|21:15,7|21:15 代表周二，周四，周日的21:15分开奖
	 */
	private String drawTime;

	/**
	 * 休市时间 格式为： 2017/01/27,2017/01/28 代表2017年1月27日休市
	 */
	private String vacations;
	
	/**
	 * 官方检票时间距离的秒数
	 */
	private Integer endCheckTime;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getDrawTime() {
		return drawTime;
	}

	public void setDrawTime(String drawTime) {
		this.drawTime = drawTime;
	}

	public String getVacations() {
		return vacations;
	}

	public void setVacations(String vacations) {
		this.vacations = vacations;
	}

	public Integer getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Integer endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

}