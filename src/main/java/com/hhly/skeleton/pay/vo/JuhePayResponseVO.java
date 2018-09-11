package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
 * @ClassName: JuhePayResponseVo 
 * @Description: 聚合支付response返回结果对象
 * @author wuLong
 * @date 2017年7月24日 上午11:24:32 
 *
 */
public class JuhePayResponseVO extends BaseBO {
	// {"cpId":660012,"inputCharset":"UTF-8","signType":"MD5","nonceStr":"1500862331765","sign":"1E4CA1E9E5DEDAB41931542681EFAB81",
	// "cpOrderId":"4545dfa25adfa2112312sdf","transId":"1162331097999947","codeUrl":"https://qr.alipay.com/bax05144ln6w5g2t4s6t00ef",
	// "codeImgUrl":"http://203.19.33.141:2225//qrcode?uuid=https%3A%2F%2Fqr.alipay.com%2Fbax05144ln6w5g2t4s6t00ef"}

	private static final long serialVersionUID = 1L;
	public int cpId;
	public String inputCharset;
	public String signType;
	public String nonceStr;
	public String sign;
	public String cpOrderId;
	public String transId;
	public String codeUrl;
	public String codeImgUrl;
	public String payInfo;// 商家扫用户的二维码信息
	public String payUrl;// 商家扫用户的二维码地址

	public int getCpId() {
		return cpId;
	}

	public void setCpId(int cpId) {
		this.cpId = cpId;
	}

	public String getInputCharset() {
		return inputCharset;
	}

	public void setInputCharset(String inputCharset) {
		this.inputCharset = inputCharset;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCpOrderId() {
		return cpOrderId;
	}

	public void setCpOrderId(String cpOrderId) {
		this.cpOrderId = cpOrderId;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getCodeUrl() {
		return codeUrl;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getCodeImgUrl() {
		return codeImgUrl;
	}

	public void setCodeImgUrl(String codeImgUrl) {
		this.codeImgUrl = codeImgUrl;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

}
