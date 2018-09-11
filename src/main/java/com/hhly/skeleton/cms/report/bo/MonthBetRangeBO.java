package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 月度报表-投注人数和投注金额范围统计
* @author HouXiangBao289
* @date 2017年10月11日 上午10:24:26 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class MonthBetRangeBO extends BaseBO {

	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	private Date yearMonth;
	private Double o_1_100 = 0.00;
	private Integer u_1_100 = 0;
	private Double o_101_500 = 0.00;
	private Integer u_101_500 = 0;
	private Double o_501_1000 = 0.00;
	private Integer u_501_1000 = 0;
	private Double o_1001_5000 = 0.00;
	private Integer u_1001_5000 = 0;
	private Double o_5001_10000 = 0.00;
	private Integer u_5001_10000 = 0;
	private Double o_10001_50000 = 0.00;
	private Integer u_10001_50000 = 0;
	private Double o_50001_100000 = 0.00;
	private Integer u_50001_100000 = 0;
	private Double o_100000 = 0.00;
	private Integer u_100000 = 0;
	private Integer totalUser = 0;
	private Double totalMoney = 0.00;
	

	public Date getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(Date yearMonth) {
		this.yearMonth = yearMonth;
	}
	public Double getO_1_100() {
		return o_1_100;
	}
	public void setO_1_100(Double o_1_100) {
		this.o_1_100 = o_1_100;
	}
	public Integer getU_1_100() {
		return u_1_100;
	}
	public void setU_1_100(Integer u_1_100) {
		this.u_1_100 = u_1_100;
	}
	public Double getO_101_500() {
		return o_101_500;
	}
	public void setO_101_500(Double o_101_500) {
		this.o_101_500 = o_101_500;
	}
	public Integer getU_101_500() {
		return u_101_500;
	}
	public void setU_101_500(Integer u_101_500) {
		this.u_101_500 = u_101_500;
	}
	public Double getO_501_1000() {
		return o_501_1000;
	}
	public void setO_501_1000(Double o_501_1000) {
		this.o_501_1000 = o_501_1000;
	}
	public Integer getU_501_1000() {
		return u_501_1000;
	}
	public void setU_501_1000(Integer u_501_1000) {
		this.u_501_1000 = u_501_1000;
	}
	public Double getO_1001_5000() {
		return o_1001_5000;
	}
	public void setO_1001_5000(Double o_1001_5000) {
		this.o_1001_5000 = o_1001_5000;
	}
	public Integer getU_1001_5000() {
		return u_1001_5000;
	}
	public void setU_1001_5000(Integer u_1001_5000) {
		this.u_1001_5000 = u_1001_5000;
	}
	public Double getO_5001_10000() {
		return o_5001_10000;
	}
	public void setO_5001_10000(Double o_5001_10000) {
		this.o_5001_10000 = o_5001_10000;
	}
	public Integer getU_5001_10000() {
		return u_5001_10000;
	}
	public void setU_5001_10000(Integer u_5001_10000) {
		this.u_5001_10000 = u_5001_10000;
	}
	public Double getO_10001_50000() {
		return o_10001_50000;
	}
	public void setO_10001_50000(Double o_10001_50000) {
		this.o_10001_50000 = o_10001_50000;
	}
	public Integer getU_10001_50000() {
		return u_10001_50000;
	}
	public void setU_10001_50000(Integer u_10001_50000) {
		this.u_10001_50000 = u_10001_50000;
	}
	public Double getO_50001_100000() {
		return o_50001_100000;
	}
	public void setO_50001_100000(Double o_50001_100000) {
		this.o_50001_100000 = o_50001_100000;
	}
	public Integer getU_50001_100000() {
		return u_50001_100000;
	}
	public void setU_50001_100000(Integer u_50001_100000) {
		this.u_50001_100000 = u_50001_100000;
	}
	public Double getO_100000() {
		return o_100000;
	}
	public void setO_100000(Double o_100000) {
		this.o_100000 = o_100000;
	}
	public Integer getU_100000() {
		return u_100000;
	}
	public void setU_100000(Integer u_100000) {
		this.u_100000 = u_100000;
	}
	public Integer getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(Integer totalUser) {
		this.totalUser = totalUser;
	}
	public Double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}
}