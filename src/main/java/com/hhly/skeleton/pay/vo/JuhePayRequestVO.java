package com.hhly.skeleton.pay.vo;
/**
 * 
 * @ClassName: JuhePayRequestVo 
 * @Description: 聚合支付请求对象
 * @author wuLong
 * @date 2017年7月21日 下午4:52:47 
 *
 */
public class JuhePayRequestVO {
	/**
	 * 接口类型
	 */
	public String serviceName; 
	/**
	 * 商户ID
	 */
	public String cpId;
	/**
	 * 字符集
	 */
	public String inputCharset = "UTF-8";
	/**
	 * 签名类型
	 */
	public String signType = "MD5";
	/**
	 * 签名
	 */
	public String sign;
	/**
	 * 商户订单号
	 */
	public String cpOrderId;
	/**
	 * 交易金额
	 */
	public int totalFee;
	/**
	 * 随机字符串
	 */
	public String nonceStr;
	/**
	 * 交易币种
	 */
	public String currency = "CNY";
	/**
	 * 商户附加信息
	 */
	public String attach;
	/**
	 * 通知地址
	 */
	public String notifyUrl;
	/**
	 * 订单生成时间
	 */
	public String timeStart;
	/**
	 * 订单失效时间
	 */
	public String timeExpire;
	/**
	 * 商品描述
	 */
	public String body;
	/**
	 * 订单生成的机器IP
	 */
	public String mchCreateIp;
	/**
	 * 是否限制使用信用卡
	 */
	public String limitCreditPay;
	/**
	 * 运行平台类型
	 */
	public String platform;
	/**
	 * 门店编号
	 */
	public String opShopId;
	
	public String getOpShopId() {
		return opShopId;
	}
	public void setOpShopId(String opShopId) {
		this.opShopId = opShopId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getCpId() {
		return cpId;
	}
	public void setCpId(String cpId) {
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
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public String getNonceStr() {
		return nonceStr;
	}
	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeExpire() {
		return timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMchCreateIp() {
		return mchCreateIp;
	}
	public void setMchCreateIp(String mchCreateIp) {
		this.mchCreateIp = mchCreateIp;
	}
	public String getLimitCreditPay() {
		return limitCreditPay;
	}
	public void setLimitCreditPay(String limitCreditPay) {
		this.limitCreditPay = limitCreditPay;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
}
