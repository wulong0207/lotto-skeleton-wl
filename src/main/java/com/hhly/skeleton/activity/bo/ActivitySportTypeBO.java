package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class ActivitySportTypeBO extends BaseBO {
	/**
	 * 类型
	 */
	private Short type ;
	/**
	 * 百分比
	 */
	private Double percent;
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
}
