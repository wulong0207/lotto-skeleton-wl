package com.hhly.skeleton.activity.bo;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    一分钱购彩BO
 * @author  Tony Wang
 * @date    2017年8月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class YfgcActivityBO extends BaseBO {

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动开始时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activityStartTime;

    /**
     * 活动结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activityEndTime;

    /**
     * 活动状态 0:不启用 1:启用
     */
    private Integer activityStatus;
    
    /**
     * key是期数，value是需要减免的金额
     */
    private Map<Integer, Double> activityRules;

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

	public Map<Integer, Double> getActivityRules() {
		return activityRules;
	}

	public void setActivityRules(Map<Integer, Double> activityRules) {
		this.activityRules = activityRules;
	}
    
}
