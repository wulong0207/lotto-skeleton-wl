package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
@SuppressWarnings("serial")
public class RechargeRangePersonDataExcelVO extends BaseBO{

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelHeader("日期")
	private Date dt;
	/** 10-50的总充值人数 **/
	@ExcelHeader("0-50")
	private Integer u0_50;
	@ExcelHeader("51-100")
	private Integer u51_100;
	@ExcelHeader("101-500")
	private Integer u101_500;
	@ExcelHeader("501-1000")
	private Integer u501_1000;
	@ExcelHeader("1001-5000")
	private Integer u1001_5000;
	@ExcelHeader("5001-10000")
	private Integer u5001_10000;
	@ExcelHeader("10001-50000")
	private Integer u10001_50000;
	@ExcelHeader("50001-100000")
	private Integer u50001_100000;
	@ExcelHeader("100000")
	private Integer u100000;

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getU0_50() {
		return u0_50;
	}

	public void setU0_50(Integer u0_50) {
		this.u0_50 = u0_50;
	}

	public Integer getU51_100() {
		return u51_100;
	}

	public void setU51_100(Integer u51_100) {
		this.u51_100 = u51_100;
	}

	public Integer getU101_500() {
		return u101_500;
	}

	public void setU101_500(Integer u101_500) {
		this.u101_500 = u101_500;
	}

	public Integer getU501_1000() {
		return u501_1000;
	}

	public void setU501_1000(Integer u501_1000) {
		this.u501_1000 = u501_1000;
	}

	public Integer getU1001_5000() {
		return u1001_5000;
	}

	public void setU1001_5000(Integer u1001_5000) {
		this.u1001_5000 = u1001_5000;
	}

	public Integer getU5001_10000() {
		return u5001_10000;
	}

	public void setU5001_10000(Integer u5001_10000) {
		this.u5001_10000 = u5001_10000;
	}

	public Integer getU10001_50000() {
		return u10001_50000;
	}

	public void setU10001_50000(Integer u10001_50000) {
		this.u10001_50000 = u10001_50000;
	}

	public Integer getU50001_100000() {
		return u50001_100000;
	}

	public void setU50001_100000(Integer u50001_100000) {
		this.u50001_100000 = u50001_100000;
	}

	public Integer getU100000() {
		return u100000;
	}

	public void setU100000(Integer u100000) {
		this.u100000 = u100000;
	}

}
