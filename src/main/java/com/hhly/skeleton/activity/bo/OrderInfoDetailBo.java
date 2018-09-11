package com.hhly.skeleton.activity.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OrderInfoDetailBo extends BaseBO{
	//购买类型
	private String buyType;
	//平台
	private String platform;
	//倍数
	private Integer multipleNum;
	//彩种
	private String lotteryCode;
	//彩种名
	private String lotteryName;
	//彩期
	private String lotteryIssue;
	//购买时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date buyTime;
	//出票时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date comeOutTime;
	//开奖时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;
	//派奖时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date sendTime;
	//订单总额
	private Double orderAmount;
	//中奖详情
	private String winningDetail;
	//总注数
	private Integer buyNumber;
	//子玩法
	private String lotteryChildCode;
	//中奖号码
	private String drawCode;
	//中奖状态
	private int winningStatus;
	//订单状态
	private int orderStatus;
	//支付状态
	private int payStatus;
	//税前奖金
	private Double preBonus;
	//税后奖金
	private Double aftBonus;
	//详情
	private List<OrderDetailBO> details;
	public String getBuyType() {
		return buyType;
	}
	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Integer getMultipleNum() {
		return multipleNum;
	}
	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}
	public String getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getLotteryName() {
		return lotteryName;
	}
	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	public String getLotteryIssue() {
		return lotteryIssue;
	}
	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getComeOutTime() {
		return comeOutTime;
	}
	public void setComeOutTime(Date comeOutTime) {
		this.comeOutTime = comeOutTime;
	}
	public Date getLotteryTime() {
		return lotteryTime;
	}
	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getWinningDetail() {
		return winningDetail;
	}
	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}
	public Integer getBuyNumber() {
		return buyNumber;
	}
	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}
	public String getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public String getDrawCode() {
		return drawCode;
	}
	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}
	public int getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(int winningStatus) {
		this.winningStatus = winningStatus;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public Double getPreBonus() {
		return preBonus;
	}
	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}
	public Double getAftBonus() {
		return aftBonus;
	}
	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}
	public List<OrderDetailBO> getDetails() {
		return details;
	}
	public void setDetails(List<OrderDetailBO> details) {
		this.details = details;
	}
	
	
	
}
