package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RechargeOverviewBo extends BaseVO {

	private Integer id;
	/** 充值时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dt;
	/** 注册渠道id **/
	private String channelId;
	/** 注册渠道名称 **/
	private String chanelName;
	/** 支付渠道id **/
	private Integer channelPayId;
	/** 支付渠道名称 **/
	private String channelPayName;
	/** 充值用户数 **/
	private Integer fillUser;
	/** 充值次数 **/
	private Integer fillTimes;
	/** 充值金额 **/
	private Double fillMoney;
	/** 新用户充值人数 **/
	private Integer newFillUser;
	/** 新用户充值次数 **/
	private Integer newFillTimes;
	/** 新用户充值金额数 **/
	private Double newFillMoney;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChanelName() {
		return chanelName;
	}

	public void setChanelName(String chanelName) {
		this.chanelName = chanelName;
	}

	public Integer getChannelPayId() {
		return channelPayId;
	}

	public void setChannelPayId(Integer channelPayId) {
		this.channelPayId = channelPayId;
	}

	public String getChannelPayName() {
		return channelPayName;
	}

	public void setChannelPayName(String channelPayName) {
		this.channelPayName = channelPayName;
	}

	public Integer getFillUser() {
		return fillUser;
	}

	public void setFillUser(Integer fillUser) {
		this.fillUser = fillUser;
	}

	public Integer getFillTimes() {
		return fillTimes;
	}

	public void setFillTimes(Integer fillTimes) {
		this.fillTimes = fillTimes;
	}

	public Integer getNewFillUser() {
		return newFillUser;
	}

	public void setNewFillUser(Integer newFillUser) {
		this.newFillUser = newFillUser;
	}

	public Integer getNewFillTimes() {
		return newFillTimes;
	}

	public void setNewFillTimes(Integer newFillTimes) {
		this.newFillTimes = newFillTimes;
	}

	public Double getFillMoney() {
		return fillMoney;
	}

	public void setFillMoney(Double fillMoney) {
		this.fillMoney = fillMoney;
	}

	public Double getNewFillMoney() {
		return newFillMoney;
	}

	public void setNewFillMoney(Double newFillMoney) {
		this.newFillMoney = newFillMoney;
	}





}
