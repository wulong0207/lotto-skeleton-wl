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

/**
 * @desc 支付请求参数
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayInputParamVO implements Serializable {
	private static final long serialVersionUID = -441057897717727911L;

	/**以下字段是客户端必传的**/
	private String orderCode;// 订单号，多个用逗号隔开
	private String redCode;// 彩金、优惠券code
	private String token;// 用户登录的token
	private String platform;// 1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private String balance;// 余额，不为0表示使用余额金额
	private String payAmount;// 需要支付的现金金额
	private String bankId;// 银行ID（用户选择余额支付，该字段为空）
	private String bankCardId;// 银行卡ID（用户选择余额支付或者支付宝支付，银行卡ID为空）
	private String returnUrl;// 支付同步跳转地址，前台做为一个参数传递过来
	private String remark;// 描述
	private String extraData;// 额外字段
	private String buyType;// 购买方式，多个用逗号隔开
	private String channelId;// 渠道ID
	private String clientType;// 客户端类型1：Web; 2：Wap；3：Android；4：IOS；5：其他。
	private String change;// 是否切换（网银的切换成快捷、快捷地切换成网银。0不切换 1切换）
	private String oId;// 微信的openId
	private String aId;// 微信应用Id
	private String issueId;// 方案详情ID
	private String jsApi;// 是否为微信公众号支付 1是，
	private String buyAmount;// 参与合买的金额,2018-05-08添加，只有是合买订单才需要传值

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
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

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
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

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getJsApi() {
		return jsApi;
	}

	public void setJsApi(String jsApi) {
		this.jsApi = jsApi;
	}

	public String getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(String buyAmount) {
		this.buyAmount = buyAmount;
	}

	@Override
	public String toString() {
		return "PayInputParamVO [orderCode=" + orderCode + ", redCode=" + redCode + ", token=" + token + ", platform=" + platform + ", balance=" + balance + ", payAmount=" + payAmount + ", bankId=" + bankId + ", bankCardId=" + bankCardId
				+ ", returnUrl=" + returnUrl + ", remark=" + remark + ", extraData=" + extraData + ", buyType=" + buyType + ", channelId=" + channelId + ", clientType=" + clientType + ", change=" + change + ", oId=" + oId + ", aId=" + aId
				+ ", issueId=" + issueId + ", jsApi=" + jsApi + ", buyAmount=" + buyAmount + "]";
	}

}
