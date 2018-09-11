package com.hhly.skeleton.lotto.base.activity.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class ActivityNewUserOrderVO extends BaseVO {

	private static final long serialVersionUID = 5957002609724356079L;

	/**
	 * 规则ID
	 */
	private Integer activityRuleId;

	/**
	 * 投注内容
	 */
	private String planContent;

	public Integer getActivityRuleId() {
		return activityRuleId;
	}

	public void setActivityRuleId(Integer activityRuleId) {
		this.activityRuleId = activityRuleId;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

}
