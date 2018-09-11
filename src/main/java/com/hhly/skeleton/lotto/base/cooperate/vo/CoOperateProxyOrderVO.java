package com.hhly.skeleton.lotto.base.cooperate.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CoOperateProxyOrderVO extends CoOperateProxyVO {

	private static final long serialVersionUID = -7051986325385921309L;

	/**
	 * 状态，1等待出票, 2出票失败, 3等待开奖, 4已中奖, 5未中奖
	 */
	private Short status;

	/**
	 * 查询开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;

	/**
	 * 查询结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;

	/**
	 * 流水号
	 */
	private String transCode;

	/**
	 * 支付类型
	 */
	private Short payType;
	
	/**
	 * 公司保底账号ID
	 */
	private Integer companyUserId;

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
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

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
	}

	public Integer getCompanyUserId() {
		return companyUserId;
	}

	public void setCompanyUserId(Integer companyUserId) {
		this.companyUserId = companyUserId;
	}
	
}
