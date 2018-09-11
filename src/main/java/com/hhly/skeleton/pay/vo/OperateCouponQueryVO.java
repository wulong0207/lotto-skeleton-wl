package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 查询当前平台可用红包列表
 * @author xiongJinGang
 * @date 2017年4月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateCouponQueryVO implements Serializable {
	private static final long serialVersionUID = 5469738657382040574L;
	private String token;// 登录token
	private Short platform;// 平台类型
	private String lottoryCode;// 彩种编号
	private String redType;// 红包类型(充值recharge、支付pay)
	private String channelId;// 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道

	public OperateCouponQueryVO() {
		super();
	}

	public OperateCouponQueryVO(String token, Short platform, String lottoryCode, String redType) {
		super();
		this.token = token;
		this.platform = platform;
		this.lottoryCode = lottoryCode;
		this.redType = redType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getLottoryCode() {
		return lottoryCode;
	}

	public void setLottoryCode(String lottoryCode) {
		this.lottoryCode = lottoryCode;
	}

	public String getRedType() {
		return redType;
	}

	public void setRedType(String redType) {
		this.redType = redType;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	@Override
	public String toString() {
		return "OperateCouponQueryVO [token=" + token + ", platform=" + platform + ", lottoryCode=" + lottoryCode + ", redType=" + redType + "]";
	}

}