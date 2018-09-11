package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 
* @Description: 月度报表-彩种数据
* @author HouXiangBao289
* @String 2017年8月16日 下午2:24:17 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class MonthLotDataExcelBO extends BaseBO{
	
	@ExcelHeader("月份")
	private String yearMonth;//月份
	@ExcelHeader("竞足投注人数")
	private Integer jzBetUserCount = 0;//竞足投注人数
	@ExcelHeader("竞足投注金额")
	private Double jzBetMoney = 0.0;//竞足投注金额
	@ExcelHeader("双色球投注人数")
	private Integer ssqBetUserCount = 0;//双色球投注人数
	@ExcelHeader("双色球投注金额")
	private Double ssqBetMoney = 0.0;//双色球投注金额
	@ExcelHeader("大乐透投注人数")
	private Integer dltBetUserCount = 0;//大乐透投注人数
	@ExcelHeader("大乐透投注金额")
	private Double dltBetMoney = 0.0;//大乐透投注金额
	@ExcelHeader("竞篮投注人数")
	private Integer jlBetUserCount = 0;//竞篮投注人数
	@ExcelHeader("竞篮投注金额")
	private Double jlBetMoney = 0.0;//竞篮投注金额
	@ExcelHeader("北单投注人数")
	private Integer bdBetUserCount = 0;//北单投注人数
	@ExcelHeader("北单投注金额")
	private Double bdBetMoney = 0.0;//北单投注金额
	@ExcelHeader("11运夺金投注人数")
	private Integer syydjBetUserCount = 0;//11运夺金投注人数
	@ExcelHeader("11运夺金投注金额")
	private Double syydjBetMoney = 0.0;//11运夺金投注金额
	@ExcelHeader("重庆时时彩投注人数")
	private Integer cqsscBetUserCount = 0;//重庆时时彩投注人数
	@ExcelHeader("重庆时时彩投注金额")
	private Double cqsscBetMoney = 0.0;//重庆时时彩投注金额
	@ExcelHeader("江苏快3投注人数")
	private Integer jsk3BetUserCount = 0;//江苏快3投注人数
	@ExcelHeader("江苏快3投注金额")
	private Double jsk3BetMoney = 0.0;//江苏快3投注金额
	
	public Integer getJzBetUserCount() {
		return jzBetUserCount;
	}

	public void setJzBetUserCount(Integer jzBetUserCount) {
		this.jzBetUserCount = jzBetUserCount;
	}

	public Double getJzBetMoney() {
		return jzBetMoney;
	}

	public void setJzBetMoney(Double jzBetMoney) {
		this.jzBetMoney = jzBetMoney;
	}

	public Integer getSsqBetUserCount() {
		return ssqBetUserCount;
	}

	public void setSsqBetUserCount(Integer ssqBetUserCount) {
		this.ssqBetUserCount = ssqBetUserCount;
	}

	public Double getSsqBetMoney() {
		return ssqBetMoney;
	}

	public void setSsqBetMoney(Double ssqBetMoney) {
		this.ssqBetMoney = ssqBetMoney;
	}

	public Integer getDltBetUserCount() {
		return dltBetUserCount;
	}

	public void setDltBetUserCount(Integer dltBetUserCount) {
		this.dltBetUserCount = dltBetUserCount;
	}

	public Double getDltBetMoney() {
		return dltBetMoney;
	}

	public void setDltBetMoney(Double dltBetMoney) {
		this.dltBetMoney = dltBetMoney;
	}

	public Integer getJlBetUserCount() {
		return jlBetUserCount;
	}

	public void setJlBetUserCount(Integer jlBetUserCount) {
		this.jlBetUserCount = jlBetUserCount;
	}

	public Double getJlBetMoney() {
		return jlBetMoney;
	}

	public void setJlBetMoney(Double jlBetMoney) {
		this.jlBetMoney = jlBetMoney;
	}

	public Integer getBdBetUserCount() {
		return bdBetUserCount;
	}

	public void setBdBetUserCount(Integer bdBetUserCount) {
		this.bdBetUserCount = bdBetUserCount;
	}

	public Double getBdBetMoney() {
		return bdBetMoney;
	}

	public void setBdBetMoney(Double bdBetMoney) {
		this.bdBetMoney = bdBetMoney;
	}

	public Integer getSyydjBetUserCount() {
		return syydjBetUserCount;
	}

	public void setSyydjBetUserCount(Integer syydjBetUserCount) {
		this.syydjBetUserCount = syydjBetUserCount;
	}

	public Double getSyydjBetMoney() {
		return syydjBetMoney;
	}

	public void setSyydjBetMoney(Double syydjBetMoney) {
		this.syydjBetMoney = syydjBetMoney;
	}

	public Integer getCqsscBetUserCount() {
		return cqsscBetUserCount;
	}

	public void setCqsscBetUserCount(Integer cqsscBetUserCount) {
		this.cqsscBetUserCount = cqsscBetUserCount;
	}

	public Double getCqsscBetMoney() {
		return cqsscBetMoney;
	}

	public void setCqsscBetMoney(Double cqsscBetMoney) {
		this.cqsscBetMoney = cqsscBetMoney;
	}

	public Integer getJsk3BetUserCount() {
		return jsk3BetUserCount;
	}

	public void setJsk3BetUserCount(Integer jsk3BetUserCount) {
		this.jsk3BetUserCount = jsk3BetUserCount;
	}

	public Double getJsk3BetMoney() {
		return jsk3BetMoney;
	}

	public void setJsk3BetMoney(Double jsk3BetMoney) {
		this.jsk3BetMoney = jsk3BetMoney;
	}

	public String getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

}
