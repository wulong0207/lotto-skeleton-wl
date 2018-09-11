package com.hhly.skeleton.task.lottery.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc
 * @author Bruce
 * @date 2017年3月8日
 * @company 益彩网络科技有限公司
 * @version 1.0
 */
public class LimitNumberDetailBO extends BaseBO {

	private static final long serialVersionUID = 4606636852016262312L;
	/**
	 * 限号内容
	 */
	private String limitContent;
	/**
	 * 0：禁用；1：启用
	 */
	private Short status;
	/**
	 * 限号的子玩法CODE 前端要根据子玩法来检验限号信息
	 */
	private Integer lotteryChildCode;
	/**
	 * 子玩法名称
	 */
	private String lotteryChildName;
	/**
	 * 限号开始时间 从限表主表中读取
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeStart;
	/**
	 * 限号时间结束
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeEnd;
	/**
	 * 限号彩期开始
	 */
	private String issueStart;
	/**
	 * 限号彩期结束
	 */
	private String issueEnd;

	public String getLimitContent() {
		return limitContent;
	}

	public void setLimitContent(String limitContent) {
		this.limitContent = limitContent;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getLotteryChildName() {
		return lotteryChildName;
	}

	public void setLotteryChildName(String lotteryChildName) {
		this.lotteryChildName = lotteryChildName;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getIssueStart() {
		return issueStart;
	}

	public void setIssueStart(String issueStart) {
		this.issueStart = issueStart;
	}

	public String getIssueEnd() {
		return issueEnd;
	}

	public void setIssueEnd(String issueEnd) {
		this.issueEnd = issueEnd;
	}
}
