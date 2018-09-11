package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 渠道兑换最近交易流水统计
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class ExchangeRecentlySumBO extends BaseBO{
	
	private Double todaySaleMoney = 0.00;// 今日交易流水(元)
	private Double monthSaleMoney = 0.00;//本月交易流水(元)
	private Double weekSaleMoney = 0.00;//本周交易流水
	//近7日交易流水
	private Double recentlyDay1 = 0.00;
	private Double recentlyDay2 = 0.00;
	private Double recentlyDay3 = 0.00;
	private Double recentlyDay4 = 0.00;
	private Double recentlyDay5 = 0.00;
	private Double recentlyDay6 = 0.00;
	private Double recentlyDay7 = 0.00;
	
	public Double getTodaySaleMoney() {
		return todaySaleMoney;
	}
	public void setTodaySaleMoney(Double todaySaleMoney) {
		this.todaySaleMoney = todaySaleMoney;
	}
	public Double getMonthSaleMoney() {
		return monthSaleMoney;
	}
	public void setMonthSaleMoney(Double monthSaleMoney) {
		this.monthSaleMoney = monthSaleMoney;
	}
	public Double getWeekSaleMoney() {
		return weekSaleMoney;
	}
	public void setWeekSaleMoney(Double weekSaleMoney) {
		this.weekSaleMoney = weekSaleMoney;
	}
	public Double getRecentlyDay1() {
		return recentlyDay1;
	}
	public void setRecentlyDay1(Double recentlyDay1) {
		this.recentlyDay1 = recentlyDay1;
	}
	public Double getRecentlyDay2() {
		return recentlyDay2;
	}
	public void setRecentlyDay2(Double recentlyDay2) {
		this.recentlyDay2 = recentlyDay2;
	}
	public Double getRecentlyDay3() {
		return recentlyDay3;
	}
	public void setRecentlyDay3(Double recentlyDay3) {
		this.recentlyDay3 = recentlyDay3;
	}
	public Double getRecentlyDay4() {
		return recentlyDay4;
	}
	public void setRecentlyDay4(Double recentlyDay4) {
		this.recentlyDay4 = recentlyDay4;
	}
	public Double getRecentlyDay5() {
		return recentlyDay5;
	}
	public void setRecentlyDay5(Double recentlyDay5) {
		this.recentlyDay5 = recentlyDay5;
	}
	public Double getRecentlyDay6() {
		return recentlyDay6;
	}
	public void setRecentlyDay6(Double recentlyDay6) {
		this.recentlyDay6 = recentlyDay6;
	}
	public Double getRecentlyDay7() {
		return recentlyDay7;
	}
	public void setRecentlyDay7(Double recentlyDay7) {
		this.recentlyDay7 = recentlyDay7;
	}
	
	
}
