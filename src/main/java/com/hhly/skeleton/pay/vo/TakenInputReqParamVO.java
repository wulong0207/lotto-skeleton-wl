package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款请求
 * @author xiongJinGang
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenInputReqParamVO extends BaseBO {
	private static final long serialVersionUID = -5990910468700870369L;
	private String token;// 登录token
	// 提款金额请求
	private String bankCardId;// 银行卡ID
	private String takenAmount;// 提款金额
	private String takenToken;// 提款token
	private String bankName;// 支付名称
	private String channelId;// 渠道ID

	// 提款确认的参数
	private String takenIds;// 需要提款的ID，是间用逗号隔开
	private String platform;// 提款平台1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getTakenAmount() {
		return takenAmount;
	}

	public void setTakenAmount(String takenAmount) {
		this.takenAmount = takenAmount;
	}

	public String getTakenToken() {
		return takenToken;
	}

	public void setTakenToken(String takenToken) {
		this.takenToken = takenToken;
	}

	public String getTakenIds() {
		return takenIds;
	}

	public void setTakenIds(String takenIds) {
		this.takenIds = takenIds;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	@Override
	public String toString() {
		return "TakenInputReqParamVO [token=" + token + ", bankCardId=" + bankCardId + ", takenAmount=" + takenAmount + ", takenToken=" + takenToken + ", bankName=" + bankName + ", channelId=" + channelId + ", takenIds="
				+ takenIds + ", platform=" + platform + "]";
	}

}
