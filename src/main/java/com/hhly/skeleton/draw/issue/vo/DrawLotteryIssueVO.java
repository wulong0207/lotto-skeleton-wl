package com.hhly.skeleton.draw.issue.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.hhly.skeleton.base.vo.PageVO;

public class DrawLotteryIssueVO extends PageVO {

	private static final long serialVersionUID = 797059637371053232L;

	private Integer lotteryCode;

	private String issueCode;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startTime;

	private Integer maxSize;

	private Integer issueLasest;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	public Integer getIssueLasest() {
		return issueLasest;
	}

	public void setIssueLasest(Integer issueLasest) {
		this.issueLasest = issueLasest;
	}
}
