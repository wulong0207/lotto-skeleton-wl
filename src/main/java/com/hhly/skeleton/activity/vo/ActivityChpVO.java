package com.hhly.skeleton.activity.vo;
import com.hhly.skeleton.base.bo.BaseBO;


/**
 * @desc 竞猜vo类
 * @author lidecheng
 * @date 2018年4月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityChpVO extends BaseBO{
	/**
     * 活动编码
     */
    private String activityCode;
    /**
     * 规则编码
     */
	private Integer ruleId;
	
	private String token;

	private Integer userId;
	
	private String channelId;
	
	
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Integer getRuleId() {
		return ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}		
}
