package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class RechargeRangeMoneyDataExcelVO extends BaseVO{

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelHeader("日期")
	private Date dt;
	@ExcelHeader("10-50")
	private Double m10_50;
	@ExcelHeader("51-100")
	private Double m51_100;
	@ExcelHeader("101-500")
	private Double m101_500;
	@ExcelHeader("501-1000")
	private Double m501_1000;
	@ExcelHeader("1001-5000")
	private Double m1001_5000;
	@ExcelHeader("5001-10000")
	private Double m5001_10000;
	@ExcelHeader("10001-50000")
	private Double m10001_50000;
	@ExcelHeader("50001-100000")
	private Double m50001_100000;
	@ExcelHeader("100000")
	private Double m100000;

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Double getM10_50() {
		return m10_50;
	}

	public void setM10_50(Double m10_50) {
		this.m10_50 = m10_50;
	}

	public Double getM51_100() {
		return m51_100;
	}

	public void setM51_100(Double m51_100) {
		this.m51_100 = m51_100;
	}

	public Double getM101_500() {
		return m101_500;
	}

	public void setM101_500(Double m101_500) {
		this.m101_500 = m101_500;
	}

	public Double getM501_1000() {
		return m501_1000;
	}

	public void setM501_1000(Double m501_1000) {
		this.m501_1000 = m501_1000;
	}

	public Double getM1001_5000() {
		return m1001_5000;
	}

	public void setM1001_5000(Double m1001_5000) {
		this.m1001_5000 = m1001_5000;
	}

	public Double getM5001_10000() {
		return m5001_10000;
	}

	public void setM5001_10000(Double m5001_10000) {
		this.m5001_10000 = m5001_10000;
	}

	public Double getM10001_50000() {
		return m10001_50000;
	}

	public void setM10001_50000(Double m10001_50000) {
		this.m10001_50000 = m10001_50000;
	}

	public Double getM50001_100000() {
		return m50001_100000;
	}

	public void setM50001_100000(Double m50001_100000) {
		this.m50001_100000 = m50001_100000;
	}

	public Double getM100000() {
		return m100000;
	}

	public void setM100000(Double m100000) {
		this.m100000 = m100000;
	}

}
