package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 渠道兑换每月或每日交易流水统计
* @author HouXiangBao289
* @date 2017年9月12日 下午6:00:36 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class ExchangeDayOrMonthSumBO extends BaseBO{
	
	private String statisticsDate;// 统计时间：日期或月份
	private Double saleMoney = 0.00;// 交易流水(元)
	
	public String getStatisticsDate() {
		return statisticsDate;
	}
	public void setStatisticsDate(String statisticsDate) {
		this.statisticsDate = statisticsDate;
	}
	public Double getSaleMoney() {
		return saleMoney;
	}
	public void setSaleMoney(Double saleMoney) {
		this.saleMoney = saleMoney;
	}
	
	
	
}
