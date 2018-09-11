package com.hhly.skeleton.lotto.base.cooperate.vo;

import com.hhly.skeleton.base.vo.PageVO;

public class CoOperateProxyVO extends PageVO{

	private static final long serialVersionUID = 8630144563568102170L;


	/**
	 * 渠道Token
	 */
	private String channelToken;

	/**
	 * 查询渠道ID
	 */
	private String queryChannelId;

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public String getQueryChannelId() {
		return queryChannelId;
	}

	public void setQueryChannelId(String queryChannelId) {
		this.queryChannelId = queryChannelId;
	}
	
}
