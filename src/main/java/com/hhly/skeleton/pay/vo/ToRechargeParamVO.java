package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 获取支付/充值请求方式
 * @author xiongJinGang
 * @date 2018年2月27日
 * @company 益彩网络科技公司
 * @version 1.0 token, platform.getPlatForm(), PayConstants.RechargeTypeEnum.RECHARGE.getKey(), channelId
 */
public class ToRechargeParamVO implements Serializable {
	private static final long serialVersionUID = 4665159480654087356L;
	private String token;// 登录token
	private String channelId;// 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道
	private String browserType;// BrowerTypeEnum 浏览器类型 1微信、2支付宝、3QQ。2018-02-27添加 【选填】
	private String platform;// 平台
	private Short rechargeType;// 充值类型PayConstants.RechargeTypeEnum.RECHARGE

	public ToRechargeParamVO() {
		super();
	}

	public ToRechargeParamVO(String token, String channelId, String browserType, String platform, Short rechargeType) {
		super();
		this.token = token;
		this.channelId = channelId;
		this.browserType = browserType;
		this.platform = platform;
		this.rechargeType = rechargeType;
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

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Short getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Short rechargeType) {
		this.rechargeType = rechargeType;
	}

	@Override
	public String toString() {
		return "ToRechargeParamVO [token=" + token + ", channelId=" + channelId + ", browserType=" + browserType + ", platform=" + platform + ", rechargeType=" + rechargeType + "]";
	}

}
