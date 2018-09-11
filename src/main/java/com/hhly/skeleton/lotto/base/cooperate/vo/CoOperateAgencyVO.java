package com.hhly.skeleton.lotto.base.cooperate.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * 中介后台查询
 *
 * @author huangchengfang1219
 * @date 2018年3月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateAgencyVO extends PageVO {

	private static final long serialVersionUID = 1566247375241041567L;

	/**
	 * 渠道登录Token
	 */
	private String channelToken;

	/**
	 * 查询的渠道ID
	 */
	private String queryChannelId;

	/**
	 * 查询开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startTime;

	/**
	 * 查询结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date endTime;

	/**
	 * 查询开始日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date startDate;

	/**
	 * 查询结束日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date endDate;

	/**
	 * 查询开始月份
	 */
	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	private Date startMonth;

	/**
	 * 查询开始月份
	 */
	@JsonFormat(pattern = "yyyy-MM", timezone = "GMT+8")
	private Date endMonth;

	/**
	 * 手机号
	 */
	private String cusMobile;

	/**
	 * 订单号
	 */
	private String orderCode;

	/**
	 * 兑换码状态
	 */
	private Short status;

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public String getQueryChannelId() {
		return queryChannelId;
	}

	public void setQueryChannelId(String queryChannelId) {
		this.queryChannelId = queryChannelId;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(Date startMonth) {
		this.startMonth = startMonth;
	}

	public Date getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Date endMonth) {
		this.endMonth = endMonth;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

}
