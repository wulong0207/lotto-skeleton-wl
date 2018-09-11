package com.hhly.skeleton.activity.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 活动渠道vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class MsgVO extends BaseBO {
	/**流水号*/
	private String transId;
	/**活动编号*/
	private String activityCode;
	/**渠道*/
	private String channelId;
	/**是否活动页面 0 不是、1是*/
	private String activityPage;

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getActivityPage() {
		return activityPage;
	}

	public void setActivityPage(String activityPage) {
		this.activityPage = activityPage;
	}

	@Override
	public String toString() {
		return "流水号" + transId + ",活动编号" + activityCode + ",活动页面" + activityPage;
	}
}
