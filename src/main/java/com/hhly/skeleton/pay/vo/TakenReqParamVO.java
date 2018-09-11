package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款请求
 * @author xiongJinGang
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenReqParamVO extends BaseBO {
	private static final long serialVersionUID = -5990910468700870369L;
	private String token;// 登录token
	// 提款金额请求
	private Integer bankCardId;// 银行卡ID
	private Double takenAmount;// 提款金额
	// private String takenToken;// 提款token
	private String bankName;// 支行名称

	// 提款确认的参数
	private String takenIds;// 需要提款的ID，是间用逗号隔开
	private Short platform;// 提款平台1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private String channelId = "7";// 渠道ID,7为未知渠道

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public Double getTakenAmount() {
		return takenAmount;
	}

	public void setTakenAmount(Double takenAmount) {
		this.takenAmount = takenAmount;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTakenIds() {
		return takenIds;
	}

	public void setTakenIds(String takenIds) {
		this.takenIds = takenIds;
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

	@Override
	public String toString() {
		return "提款确认参数 [token=" + token + ", bankCardId=" + bankCardId + ", takenAmount=" + takenAmount + ", bankName=" + bankName + ", takenIds=" + takenIds + ", platform=" + platform + ", channelId=" + channelId + "]";
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
