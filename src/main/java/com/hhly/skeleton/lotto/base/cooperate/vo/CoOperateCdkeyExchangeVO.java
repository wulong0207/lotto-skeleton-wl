package com.hhly.skeleton.lotto.base.cooperate.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 积分兑换彩票
 *
 * @author huangchengfang1219
 * @date 2018年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateCdkeyExchangeVO extends BaseVO {

	private static final long serialVersionUID = -4142148187134840684L;
	
	private Short platform;
	
	private String channelId;

	private String cdkey;

	private String token;

	private List<String> planContentList;
	
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

	public String getCdkey() {
		return cdkey;
	}

	public void setCdkey(String cdkey) {
		this.cdkey = cdkey;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<String> getPlanContentList() {
		return planContentList;
	}

	public void setPlanContentList(List<String> planContentList) {
		this.planContentList = planContentList;
	}

}
