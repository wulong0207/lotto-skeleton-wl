/**    
* @Title: PayParamVo.java  
* @Package com.hhly.skeleton.pay.vo  
* @Description: TODO
* @author xiongjingang 
* @date 2017年3月6日 下午2:53:33  
* @version V1.0    
*/
package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.hhly.skeleton.pay.bo.PayBankBO;
import com.hhly.skeleton.pay.bo.PayBankcardBO;

/**
 * @desc 充值请求参数、查看推单方案详情请求参数
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RechargeParamVO implements Serializable {
	private static final long serialVersionUID = -441057897717727911L;

	/**以下字段是客户端必传的**/
	private String redCode;// 充值优惠券ID
	private String token;// 用户登录的token
	private Integer bankId;// 银行ID
	private Integer bankCardId;// 银行卡ID
	private Short platform;// 1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private Double rechargeAmount;// 充值金额
	private String clientIp;// 客户端IP
	private String returnUrl;// 支付同步跳转地址，前台做为一个参数传递过来
	private String channelId = "7";// 渠道Id，前端不传，默认7
	private Short change;// 是否切换（网银的切换成快捷、快捷地切换成网银。0不切换 1切换）
	private String hdCode;// 活动编号
	private String openId;// 微信的openId
	private String appId;// 微信应用ID
	private String activity;// 是否活动页面充值 0或者空不是 、1是

	/*********客户端不用传**********/
	private String bankCode;// 银行附加编码
	private String transCode;// 交易码
	private String name = "账户充值";// 充值
	private PayBankcardBO payBankcardBO;// 银行卡信息
	private PayBankBO payBankBO;// 银行信息
	private boolean isTest;// 是否为测试环境 true:是；false:否

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayBankcardBO getPayBankcardBO() {
		return payBankcardBO;
	}

	public void setPayBankcardBO(PayBankcardBO payBankcardBO) {
		this.payBankcardBO = payBankcardBO;
	}

	public PayBankBO getPayBankBO() {
		return payBankBO;
	}

	public void setPayBankBO(PayBankBO payBankBO) {
		this.payBankBO = payBankBO;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getChange() {
		return change;
	}

	public void setChange(Short change) {
		this.change = change;
	}

	public String getHdCode() {
		return hdCode;
	}

	public void setHdCode(String hdCode) {
		this.hdCode = hdCode;
	}

	public boolean isTest() {
		return isTest;
	}

	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "充值参数 [redCode=" + redCode + ", token=" + token + ", bankId=" + bankId + ", bankCardId=" + bankCardId + ", platform=" + platform + ", rechargeAmount=" + rechargeAmount + ", clientIp=" + clientIp + ", returnUrl=" + returnUrl
				+ ", channelId=" + channelId + ", change=" + change + ", hdCode=" + hdCode + ", bankCode=" + bankCode + ", transCode=" + transCode + ", name=" + name + "]";
	}

}
