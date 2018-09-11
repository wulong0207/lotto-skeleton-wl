package com.hhly.skeleton.pay.channel.vo;

import java.io.Serializable;
import java.util.List;

import com.hhly.skeleton.pay.bo.PayBankBO;
import com.hhly.skeleton.pay.bo.PayBankcardBO;
import com.hhly.skeleton.pay.channel.bo.PayChannelBO;

/**
 * @desc 选择支付渠道的请求参数
 * @author xiongJinGang
 * @date 2017年12月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ChannelParamVO implements Serializable {

	private Short platform;// 客户端类型
	private Double payAmount;// 交易现金金额
	private PayBankBO payBankBO;// 银行
	private PayBankcardBO payBankcardBO;// 银行卡
	private List<PayChannelBO> payChannelList;
	private Short transType;// 交易类型；参考 PayConstants.RechargeTypeEnum 常量
	private Double dayLimit;// 当天限额
	private Double montyLimit;// 当月限额
	private String channelId;// 渠道
	private String appId;// 公众号的appID

	public ChannelParamVO() {
		super();
	}

	public ChannelParamVO(Short platform, Double payAmount, PayBankBO payBankBO, PayBankcardBO payBankcardBO, List<PayChannelBO> payChannelList, Short transType, String channelId, String appId) {
		super();
		this.platform = platform;
		this.payAmount = payAmount;
		this.payBankBO = payBankBO;
		this.payBankcardBO = payBankcardBO;
		this.payChannelList = payChannelList;
		this.transType = transType;
		this.channelId = channelId;
		this.appId = appId;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public PayBankBO getPayBankBO() {
		return payBankBO;
	}

	public void setPayBankBO(PayBankBO payBankBO) {
		this.payBankBO = payBankBO;
	}

	public PayBankcardBO getPayBankcardBO() {
		return payBankcardBO;
	}

	public void setPayBankcardBO(PayBankcardBO payBankcardBO) {
		this.payBankcardBO = payBankcardBO;
	}

	public List<PayChannelBO> getPayChannelList() {
		return payChannelList;
	}

	public void setPayChannelList(List<PayChannelBO> payChannelList) {
		this.payChannelList = payChannelList;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public Double getDayLimit() {
		return dayLimit;
	}

	public void setDayLimit(Double dayLimit) {
		this.dayLimit = dayLimit;
	}

	public Double getMontyLimit() {
		return montyLimit;
	}

	public void setMontyLimit(Double montyLimit) {
		this.montyLimit = montyLimit;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

}
