package com.hhly.skeleton.cms.report.bo;

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
public class MonthRangeCountExcelBO extends BaseBO {

	@ExcelHeader("月份")
	private String yearMonth;
	@ExcelHeader("投注人数")
	private Integer orderUser;

	@ExcelHeader("1-100元")
	private Integer u_1_100;
	
	@ExcelHeader("101-500元")
	private Integer u_101_500;
	
	@ExcelHeader("501-1000元")
	private Integer u_501_1000;
	
	@ExcelHeader("1001-5000元")
	private Integer u_1001_5000;
	
	@ExcelHeader("5001-10000元")
	private Integer u_5001_10000;
	
	@ExcelHeader("10001-50000元")
	private Integer u_10001_50000;
	
	@ExcelHeader("50001-100000元")
	private Integer u_50001_100000;
	
	@ExcelHeader("10万元以上")
	private Integer u_100000;
	

	public String getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}
	public Integer getU_1_100() {
		return u_1_100;
	}
	public void setU_1_100(Integer u_1_100) {
		this.u_1_100 = u_1_100;
	}

	public Integer getU_101_500() {
		return u_101_500;
	}
	public void setU_101_500(Integer u_101_500) {
		this.u_101_500 = u_101_500;
	}

	public Integer getU_501_1000() {
		return u_501_1000;
	}
	public void setU_501_1000(Integer u_501_1000) {
		this.u_501_1000 = u_501_1000;
	}

	public Integer getU_1001_5000() {
		return u_1001_5000;
	}
	public void setU_1001_5000(Integer u_1001_5000) {
		this.u_1001_5000 = u_1001_5000;
	}

	public Integer getU_5001_10000() {
		return u_5001_10000;
	}
	public void setU_5001_10000(Integer u_5001_10000) {
		this.u_5001_10000 = u_5001_10000;
	}

	public Integer getU_10001_50000() {
		return u_10001_50000;
	}
	public void setU_10001_50000(Integer u_10001_50000) {
		this.u_10001_50000 = u_10001_50000;
	}

	public Integer getU_50001_100000() {
		return u_50001_100000;
	}
	public void setU_50001_100000(Integer u_50001_100000) {
		this.u_50001_100000 = u_50001_100000;
	}

	public Integer getU_100000() {
		return u_100000;
	}
	public void setU_100000(Integer u_100000) {
		this.u_100000 = u_100000;
	}
}