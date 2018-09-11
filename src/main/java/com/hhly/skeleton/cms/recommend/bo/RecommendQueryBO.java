package com.hhly.skeleton.cms.recommend.bo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class RecommendQueryBO extends PageVO {

	//推单ID编号
	private Integer id;
	private Integer lotteryCode;
	private Integer passWay;
	//方案状态
	private Integer status;
	private Integer lotteryIssue;
	//推单编码
	private String rcmdCode;
	//用户昵称
	private String nickName;
	//中奖状态
	private Integer winningStatus;
	//发起时间
	private Date startTime;
	
	private Date endTime;
	//支付类型  免费和收费
	private Integer payType;
	//支付金额
	private Double payAmount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getLotteryIssue() {
		return lotteryIssue;
	}
	public void setLotteryIssue(Integer lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}
	public String getRcmdCode() {
		return rcmdCode;
	}
	public void setRcmdCode(String rcmdCode) {
		this.rcmdCode = rcmdCode;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	public Double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}
	
}
