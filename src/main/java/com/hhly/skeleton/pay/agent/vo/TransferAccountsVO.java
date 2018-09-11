package com.hhly.skeleton.pay.agent.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 代理充值
 * @author xiongJinGang
 * @date 2018年3月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TransferAccountsVO extends BaseBO {
	private String rechargeAccount;// 充值账号
	private String realName;// 真实姓名
	private String rechargeAmount;// 充值金额
	private String validateCode;// 验证码
	private String token;// 用户登录token
	private String channelId;// 渠道ID
	private String activityCode;// 活动编号

	public String getRechargeAccount() {
		return rechargeAccount;
	}

	public void setRechargeAccount(String rechargeAccount) {
		this.rechargeAccount = rechargeAccount;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
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

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	@Override
	public String toString() {
		return "TransferAccountsVO [rechargeAccount=" + rechargeAccount + ", realName=" + realName + ", rechargeAmount=" + rechargeAmount + ", validateCode=" + validateCode + ", token=" + token + ", channelId=" + channelId + ", activityCode="
				+ activityCode + "]";
	}

}
