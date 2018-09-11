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

import com.hhly.skeleton.base.constants.PayConstants.TakenPlatformEnum;

/**
 * @desc 充值请求参数
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RechargeInputParamVO implements Serializable {
	private static final long serialVersionUID = -441057897717727911L;

	/**以下字段是客户端必传的**/
	private String redCode;// 充值优惠券ID
	private String token;// 用户登录的token
	private String bankId;// 银行ID
	private String bankCardId;// 银行卡ID
	private String platform;// 1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private String rechargeAmount;// 充值金额
	private String clientIp;// 客户端IP
	private String returnUrl;// 支付同步跳转地址，前台做为一个参数传递过来
	private TakenPlatformEnum platformEnum;// 操作平台
	private String channelId;// 渠道ID
	private String clientType;// 客户端类型（h:h5，i:ios，a:android）
	private String change;// 是否切换（网银的切换成快捷、快捷地切换成网银。0不切换 1切换）
	private String hdCode;// 活动编号
	private String oId;// 微信的openId
	private String aId;// 微信应用Id
	private String jsApi;// 微信公众号支付 1 是
	private String activity;// 是否活动页面充值 0或者空不是 、1是

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

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public TakenPlatformEnum getPlatformEnum() {
		return platformEnum;
	}

	public void setPlatformEnum(TakenPlatformEnum platformEnum) {
		this.platformEnum = platformEnum;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getHdCode() {
		return hdCode;
	}

	public void setHdCode(String hdCode) {
		this.hdCode = hdCode;
	}

	public String getoId() {
		return oId;
	}

	public void setoId(String oId) {
		this.oId = oId;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getJsApi() {
		return jsApi;
	}

	public void setJsApi(String jsApi) {
		this.jsApi = jsApi;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
