package com.hhly.skeleton.pay.trans.vo;

import java.io.Serializable;

/**
 * @desc 推单支付请求
 * @author xiongJinGang
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ToPushPayVO implements Serializable {
	private static final long serialVersionUID = 1l;
	private String issueId;// 方案详情编号
	private String token;// 推单编号
	private String channelId;// 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

}
