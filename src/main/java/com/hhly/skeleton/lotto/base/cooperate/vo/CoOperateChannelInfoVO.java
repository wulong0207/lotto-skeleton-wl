package com.hhly.skeleton.lotto.base.cooperate.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class CoOperateChannelInfoVO extends BaseVO {

	private static final long serialVersionUID = 3503321981782923636L;

	/**
	 * 渠道名称
	 */
	private String channelName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 平台
	 */
	private Short platform;

	/**
	 * 登录IP
	 */
	private String ip;

	/**
	 * 渠道Token
	 */
	private String channelToken;

	/**
	 * 新密码
	 */
	private String newPassword;

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
