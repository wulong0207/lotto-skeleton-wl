package com.hhly.skeleton.cms.report.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 
* @Description: 月度报表-投注人数和投注金额范围统计
* @author HouXiangBao289
* @String 2017年10月11日 上午10:24:26 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class MonthRangeMoneyExcelBO extends BaseBO {

	@ExcelHeader("月份")
	private String yearMonth;
	@ExcelHeader("投注金额")
	private Double orderMoney;

	@ExcelHeader("1-100元")
	private Double o_1_100;
	
	@ExcelHeader("101-500元")
	private Double o_101_500;
	
	@ExcelHeader("501-1000元")
	private Double o_501_1000;
	
	@ExcelHeader("1001-5000元")
	private Double o_1001_5000;
	
	@ExcelHeader("5001-10000元")
	private Double o_5001_10000;
	
	@ExcelHeader("10001-50000元")
	private Double o_10001_50000;
	
	@ExcelHeader("50001-100000元")
	private Double o_50001_100000;
	
	@ExcelHeader("10万元以上")
	private Double o_100000;
	

	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public Double getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}
	public Double getO_1_100() {
		return o_1_100;
	}
	public void setO_1_100(Double o_1_100) {
		this.o_1_100 = o_1_100;
	}
	public Double getO_101_500() {
		return o_101_500;
	}
	public void setO_101_500(Double o_101_500) {
		this.o_101_500 = o_101_500;
	}
	public Double getO_501_1000() {
		return o_501_1000;
	}
	public void setO_501_1000(Double o_501_1000) {
		this.o_501_1000 = o_501_1000;
	}
	public Double getO_1001_5000() {
		return o_1001_5000;
	}
	public void setO_1001_5000(Double o_1001_5000) {
		this.o_1001_5000 = o_1001_5000;
	}
	public Double getO_5001_10000() {
		return o_5001_10000;
	}
	public void setO_5001_10000(Double o_5001_10000) {
		this.o_5001_10000 = o_5001_10000;
	}
	public Double getO_10001_50000() {
		return o_10001_50000;
	}
	public void setO_10001_50000(Double o_10001_50000) {
		this.o_10001_50000 = o_10001_50000;
	}
	public Double getO_50001_100000() {
		return o_50001_100000;
	}
	public void setO_50001_100000(Double o_50001_100000) {
		this.o_50001_100000 = o_50001_100000;
	}
	public Double getO_100000() {
		return o_100000;
	}
	public void setO_100000(Double o_100000) {
		this.o_100000 = o_100000;
	}
	
}