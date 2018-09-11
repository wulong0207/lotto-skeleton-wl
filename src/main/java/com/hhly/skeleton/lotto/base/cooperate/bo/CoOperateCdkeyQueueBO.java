package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

public class CoOperateCdkeyQueueBO extends BaseBO {

	private static final long serialVersionUID = -6257021527286201711L;

	private Integer id;

	private Date overTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOverTime() {
		return overTime;
	}

	public void setOverTime(Date overTime) {
		this.overTime = overTime;
	}

}
