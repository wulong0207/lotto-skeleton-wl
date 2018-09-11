package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description: 月度报表-平台数据
* @author HouXiangBao289
* @date 2017年8月16日 下午2:24:17 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class MonthPlatformDataBO extends BaseBO{
	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	private Date yearMonth;//月份
	private Integer allBetUserCount = 0;//所有投注人数
	private Double allBetMoney = 0.0;//所有投注金额
	private Integer webBetUserCount = 0;//Web投注人数
	private Double webBetMoney = 0.0;//Web投注金额
	private Integer wapBetUserCount = 0;//Wap投注人数
	private Double wapBetMoney = 0.0;//Wap投注金额
	private Integer androidBetUserCount = 0;//Android投注人数
	private Double androidBetMoney = 0.0;//Android投注金额
	private Integer iosBetUserCount = 0;//Ios投注人数
	private Double iosBetMoney = 0.0;//Ios投注金额

	
	public Date getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(Date yearMonth) {
		this.yearMonth = yearMonth;
	}
	public Integer getAllBetUserCount() {
		return allBetUserCount;
	}
	public void setAllBetUserCount(Integer allBetUserCount) {
		this.allBetUserCount = allBetUserCount;
	}
	public Double getAllBetMoney() {
		return allBetMoney;
	}
	public void setAllBetMoney(Double allBetMoney) {
		this.allBetMoney = allBetMoney;
	}
	public Integer getWebBetUserCount() {
		return webBetUserCount;
	}
	public void setWebBetUserCount(Integer webBetUserCount) {
		this.webBetUserCount = webBetUserCount;
	}
	public Double getWebBetMoney() {
		return webBetMoney;
	}
	public void setWebBetMoney(Double webBetMoney) {
		this.webBetMoney = webBetMoney;
	}
	public Integer getWapBetUserCount() {
		return wapBetUserCount;
	}
	public void setWapBetUserCount(Integer wapBetUserCount) {
		this.wapBetUserCount = wapBetUserCount;
	}
	public Double getWapBetMoney() {
		return wapBetMoney;
	}
	public void setWapBetMoney(Double wapBetMoney) {
		this.wapBetMoney = wapBetMoney;
	}
	public Integer getAndroidBetUserCount() {
		return androidBetUserCount;
	}
	public void setAndroidBetUserCount(Integer androidBetUserCount) {
		this.androidBetUserCount = androidBetUserCount;
	}
	public Double getAndroidBetMoney() {
		return androidBetMoney;
	}
	public void setAndroidBetMoney(Double androidBetMoney) {
		this.androidBetMoney = androidBetMoney;
	}
	public Integer getIosBetUserCount() {
		return iosBetUserCount;
	}
	public void setIosBetUserCount(Integer iosBetUserCount) {
		this.iosBetUserCount = iosBetUserCount;
	}
	public Double getIosBetMoney() {
		return iosBetMoney;
	}
	public void setIosBetMoney(Double iosBetMoney) {
		this.iosBetMoney = iosBetMoney;
	}
	
	
}
