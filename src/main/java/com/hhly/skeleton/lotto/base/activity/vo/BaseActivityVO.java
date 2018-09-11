package com.hhly.skeleton.lotto.base.activity.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 活动
 *
 * @author huangchengfang1219
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class BaseActivityVO extends BaseVO {

	private static final long serialVersionUID = -9042472962961948567L;

	/**
	 * 活动编号
	 */
	private String activityCode;

	/**
	 * 用户Token
	 */
	private String token;

	/**
	 * 平台
	 */
	private Short platform;

	/**
	 * 渠道
	 */
	private String channelId;
	
	/**
	 * 当前时间
	 */
	private Long currentTimeMillis;

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Long getCurrentTimeMillis() {
		return currentTimeMillis;
	}

	public void setCurrentTimeMillis(Long currentTimeMillis) {
		this.currentTimeMillis = currentTimeMillis;
	}
	
}
