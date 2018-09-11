package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StatisticsData {

	/** 时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dt;
	/** 充值用户数 **/
	private Integer fillUser;
	/** 充值金额 **/
	private Double fillMoney;
	/** 充值类型  **/
	private Integer type;

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getFillUser() {
		return fillUser;
	}

	public void setFillUser(Integer fillUser) {
		this.fillUser = fillUser;
	}

	public Double getFillMoney() {
		return fillMoney;
	}

	public void setFillMoney(Double fillMoney) {
		this.fillMoney = fillMoney;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
