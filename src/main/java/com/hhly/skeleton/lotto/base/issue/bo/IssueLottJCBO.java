package com.hhly.skeleton.lotto.base.issue.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @desc  彩期
 * @author lidecheng
 * @date 2017年3月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class IssueLottJCBO extends BaseBO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -3432568135431729401L;
	/**
	 * 彩期期号
	 */
	private String issueCode;
	/**
	 * 是否当前期
	 */
	private Short currentIssue;
	/**
	 * 销售状态
	 */
	private Short saleStatus;

	/**
	 * 销售截止时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date officialEndTime;

	/**
	 * 销售截止时间戳
	 */
	private Date saleEndTimeStamp;

	/**
	 * 销售金额
	 */
	private String salesAmount;
	/**
	 * 开奖金额
	 */
	private String jackpotAmount;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	/**
	 * 开奖详情
	 */
	private String drawDetail;


	public Date getSaleEndTimeStamp() {
		return saleEndTimeStamp;
	}

	public void setSaleEndTimeStamp(Date saleEndTimeStamp) {
		this.saleEndTimeStamp = saleEndTimeStamp;
	}

	public String getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}
	public Short getCurrentIssue() {
		return currentIssue;
	}
	public void setCurrentIssue(Short currentIssue) {
		this.currentIssue = currentIssue;
	}
	public Short getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getOfficialEndTime() {
		return officialEndTime;
	}

	public void setOfficialEndTime(Date officialEndTime) {
		this.officialEndTime = officialEndTime;
	}

	public String getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getJackpotAmount() {
		return jackpotAmount;
	}

	public void setJackpotAmount(String jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public String getDrawDetail() {
		return drawDetail;
	}

	public void setDrawDetail(String drawDetail) {
		this.drawDetail = drawDetail;
	}
}
