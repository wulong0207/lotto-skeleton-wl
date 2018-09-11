package com.hhly.skeleton.pay.agent.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提现申请参数
 * @author xiongJinGang
 * @date 2018年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class WithdrawApplyVO extends BaseBO {
	private String token;//
	private Double amount;// 提现金额
	private Integer bankCardId;// 银行卡ID

	private String channelId;// 渠道ID
	private Short paltform;// 平台 1--PC 2--H5 3--Android 4--IOS

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getPaltform() {
		return paltform;
	}

	public void setPaltform(Short paltform) {
		this.paltform = paltform;
	}

	@Override
	public String toString() {
		return "WithdrawApplyVO [token=" + token + ", amount=" + amount + ", bankCardId=" + bankCardId + ", channelId=" + channelId + ", paltform=" + paltform + "]";
	}

}
