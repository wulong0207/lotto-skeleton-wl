package com.hhly.skeleton.pay.channel.vo;

/**
 * @desc 筛选支付方式结果
 * @author xiongJinGang
 * @date 2017年12月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayTypeResultVO {
	private Integer payChannelId;// 支付渠道ID
	private String payType;// 支付方式（支付宝、微信等）
	private String payTypeName;// 支付方式名称
	private String channelCode;// 渠道编号

	public PayTypeResultVO() {
		super();
	}

	public PayTypeResultVO(Integer payChannelId, String payType, String payTypeName, String channelCode) {
		super();
		this.payChannelId = payChannelId;
		this.payType = payType;
		this.payTypeName = payTypeName;
		this.channelCode = channelCode;
	}

	public Integer getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(Integer payChannelId) {
		this.payChannelId = payChannelId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTypeName() {
		return payTypeName;
	}

	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

}
