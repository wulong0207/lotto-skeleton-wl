package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 战绩统计
 * @desc 
 * @author chenghougui
 * @Date 2018年8月21日
 * @Company 益彩网络科技公司
 * @version
 */
public class LogbuchCalcBO extends BaseBO {
	
	private Integer id;
	@ExcelHeader("周期")
	private Integer type;
	@ExcelHeader("开始时间")
	private Date dtBegin;
	@ExcelHeader("结束时间")
	private Date dtEnd;
	@ExcelHeader("过关方式")
	private Integer passWay;
	@ExcelHeader("推单人")
	private Integer userId;
	@ExcelHeader("推单次数")
	private Integer times;
	@ExcelHeader("命中次数")
	private Integer hitTimes;
	@ExcelHeader("命中率")
	private double hitRate;
	@ExcelHeader("收益率")
	private double profitRate;
	@ExcelHeader("关注人数")
	private Integer focusCounts;
	@ExcelHeader("购买人数")
	private Integer payCounts;
	@ExcelHeader("购买金额")
	private double payAmount;
	@ExcelHeader("阅读量")
	private Integer clicks;
	@ExcelHeader("近期状态")
	private double recentStatus;
	@ExcelHeader("近期走势")
	private String recentStatusTrend;
	@ExcelHeader("连红数")
	private Integer continueHit;
	@ExcelHeader("用户近期战绩")
	private String recentRecord;
	@ExcelHeader("回报率")
	private double returnRate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getDtBegin() {
		return dtBegin;
	}
	public void setDtBegin(Date dtBegin) {
		this.dtBegin = dtBegin;
	}
	public Date getDtEnd() {
		return dtEnd;
	}
	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}
	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public Integer getHitTimes() {
		return hitTimes;
	}
	public void setHitTimes(Integer hitTimes) {
		this.hitTimes = hitTimes;
	}
	public double getHitRate() {
		return hitRate;
	}
	public void setHitRate(double hitRate) {
		this.hitRate = hitRate;
	}
	public double getProfitRate() {
		return profitRate;
	}
	public void setProfitRate(double profitRate) {
		this.profitRate = profitRate;
	}
	public Integer getFocusCounts() {
		return focusCounts;
	}
	public void setFocusCounts(Integer focusCounts) {
		this.focusCounts = focusCounts;
	}
	public Integer getPayCounts() {
		return payCounts;
	}
	public void setPayCounts(Integer payCounts) {
		this.payCounts = payCounts;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	public double getRecentStatus() {
		return recentStatus;
	}
	public void setRecentStatus(double recentStatus) {
		this.recentStatus = recentStatus;
	}
	public String getRecentStatusTrend() {
		return recentStatusTrend;
	}
	public void setRecentStatusTrend(String recentStatusTrend) {
		this.recentStatusTrend = recentStatusTrend;
	}
	public Integer getContinueHit() {
		return continueHit;
	}
	public void setContinueHit(Integer continueHit) {
		this.continueHit = continueHit;
	}
	public String getRecentRecord() {
		return recentRecord;
	}
	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord;
	}
	public double getReturnRate() {
		return returnRate;
	}
	public void setReturnRate(double returnRate) {
		this.returnRate = returnRate;
	}
	
	
}
