package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants;

/**
 * @desc 支付请求结果返回
 * @author xiongJinGang
 * @date 2017年3月31日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayReqResultVO extends BaseBO {
	private static final long serialVersionUID = -5073114550433723045L;
	private short type;// 1 form表单内容、2二维码链接、3不需要调用第三方支付（用的余额或者彩金支付）4、支付的URL 5、加密请求参数  6、二维码图片（直接显示图片）
	private String formLink;// 支付form表单或者二维码链接，type为3时，此字段为空
	// 1、支付宝充值；2、微信支付；3、连连支付；4、百度支付；5、人工充值；6、易宝支付；7、代理系统充值；8、聚合支付；9、现在支付；10、神州支付；11、掌易付支付；12、威富通支付；13、兴业银行
	private Short tradeChannel;// 交易渠道，参考PayConstants.PayChannelEnum
	private Short payType = PayConstants.AppPayTypeEnum.H5.getKey();// 支付类型 默认h5
	private byte[] qrStream;// 二维码流
	private boolean code = true;// 成功或者失败
	private String msg = "成功";
	private String transCode;// 交易编号
	private String channel;// 支付渠道 10 支付宝支付、11 微信支付 。这个值仅当返回是二维码时判断。PC端用来区分二维码类型，做不同的展示。该字段可能为空。
	private String isSafari;// 是否打开浏览器发起支付。默认不打开为null 1打开

	public PayReqResultVO() {
		super();
	}

	public PayReqResultVO(String formLink) {
		super();
		this.formLink = formLink;
	}

	public String getFormLink() {
		return formLink;
	}

	public void setFormLink(String formLink) {
		this.formLink = formLink;
	}

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public boolean isCode() {
		return code;
	}

	public void setCode(boolean code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public byte[] getQrStream() {
		return qrStream;
	}

	public void setQrStream(byte[] qrStream) {
		this.qrStream = qrStream;
	}

	public Short getTradeChannel() {
		return tradeChannel;
	}

	public void setTradeChannel(Short tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
	}

	public String getIsSafari() {
		return isSafari;
	}

	public void setIsSafari(String isSafari) {
		this.isSafari = isSafari;
	}
}