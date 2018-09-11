package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;


public class LogbuchSearchBO extends PageVO{
	
	private Integer type;
	private Integer passWay;
	private Date startDt;
	private Date endDt;

	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getPassWay() {
		return passWay;
	}
	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}
	public Date getStartDt() {
		return startDt;
	}
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}
	public Date getEndDt() {
		return endDt;
	}
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}
	
}
