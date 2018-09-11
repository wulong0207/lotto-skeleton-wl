package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

public class OperateMarketChannelBO extends BaseBO {

	private static final long serialVersionUID = -1431155758205031047L;

	/**
	 * 实际渠道ID
	 */
	private String channelId;

	/**
	 * 渠道名称
	 */
	private String channelName;

	/**
	 * 渠道状态
	 */
	private Short channelStatus;

	/**
	 * 合作开始时间
	 */
	private Date coopStartTime;

	/**
	 * 合作结束时间
	 */
	private Date coopEndTime;

	/**
	 * 渠道接口密钥
	 */
	private String key;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Short getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(Short channelStatus) {
		this.channelStatus = channelStatus;
	}

	public Date getCoopStartTime() {
		return coopStartTime;
	}

	public void setCoopStartTime(Date coopStartTime) {
		this.coopStartTime = coopStartTime;
	}

	public Date getCoopEndTime() {
		return coopEndTime;
	}

	public void setCoopEndTime(Date coopEndTime) {
		this.coopEndTime = coopEndTime;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
