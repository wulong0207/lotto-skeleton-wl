package com.hhly.skeleton.task.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class ActivityBO extends BaseBO {

	private static final long serialVersionUID = -1421684152754609097L;

	/**
	 * 活动ID
	 */
	private Integer id;

	/**
	 * 活动编号
	 */
	private String activityCode;

	/**
	 * 参与人数
	 */
	private Integer partNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Integer getPartNum() {
		return partNum;
	}

	public void setPartNum(Integer partNum) {
		this.partNum = partNum;
	}

}
