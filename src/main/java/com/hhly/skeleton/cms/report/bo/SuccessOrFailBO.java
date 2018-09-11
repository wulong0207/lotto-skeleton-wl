package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class SuccessOrFailBO extends BaseBO{
	//日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dt;
	//类型
	private int type;
	//成功
	private int success;
	//失败，第三方原因
	private int failThird;
	//失败，用户原因
	private int failUser;
	//充值用户数
	private int fillUser;
	//占比
	private String ratio="0";
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSuccess() {
		return success;
	}

	public void setSuccess(int success) {
		this.success = success;
	}

	public int getFailThird() {
		return failThird;
	}

	public void setFailThird(int failThird) {
		this.failThird = failThird;
	}

	public int getFailUser() {
		return failUser;
	}

	public void setFailUser(int failUser) {
		this.failUser = failUser;
	}

	public int getFillUser() {
		return fillUser;
	}

	public void setFillUser(int fillUser) {
		this.fillUser = fillUser;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}


	
}
