package com.hhly.skeleton.task.activity.vo;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class ActivityCountVO  extends PageVO{
	/**
	 * 查询活动类型
	 */
	private Short activityType;
	
	public Short getActivityType() {
		return activityType;
	}

	public void setActivityType(Short activityType) {
		this.activityType = activityType;
	}

	public String toString(){
		return "查询活动类型："+activityType+",页数："+getPageIndex()+",每页行数："+getPageSize();
	}
}
