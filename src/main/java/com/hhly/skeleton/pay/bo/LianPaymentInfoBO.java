package com.hhly.skeleton.pay.bo;

/**
 * @Desc: 连连支付信息bean
 * @author YiJian
 * @date 2017年3月6日
 * @compay 益彩网络科技有限公司
 * @version 1.0
 */
public class LianPaymentInfoBO {

	private String requestUrl; // 请求URL

	/*
	 *  基本参数
	 */
	private String version; // 接口版本号
	private String oidPartner; // 商户编号
	private String userId; // 用户编号
	private String timestamp; // 格式：YYYYMMDDH24MISS
	private String signType; // 签名方式 RSA、MD5
	private String sign; // 签名
	/*
	 * 业务参数
	 */
	private String busiPartner; // 商户业务类型
	private String noOrder; // 商户唯一订单号
	private String dtOrder; // 商户订单时间
	private String nameGoods; // 商品名称
	private String infoOrder; // 订单描述
	private String moneyOrder; // 交易金额 单位为RMB-元
	private String notifyUrl; // 服务器异步通知地址
	private String urlReturn; // 支付结束回显url
	private String userreqIp; // 用户端申请IP
	private String urlOrder; // 订单地址
	private String validOrder; // 订单有效时间 分钟为单位，默认为10080分钟（7天）
	private String bankCode; // 制定银行编号
	private String payType; // 支付方式 1:网银支付(借记卡) 2:快捷支付(借记卡) 3:快捷支付(信用卡)8:网银支付(信用卡)9:B2B企业网银支付
	private String noAgree; // 签约协议号
	private String shareingData; // 分账信息数据
	private String riskItem; // 风险控制参数
	private String idType; // 证件类型 0：身份证
	private String idNo; // 身份证号码
	private String acctName; // 姓名
	/*
	 * 0-可以修改，默认为 0
	 * 1-不允许修改
	 * 与 id_type,no,acct_name配合使用， 如果该用户在商系统已经实名认证过了，否则 在绑定银行卡的输入信息不能修改
	 */
	private String flagModify; // 修改标记
	private String cardNo; // 银行卡号
	private String backUrl; // 返回修改地址

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOidPartner() {
		return oidPartner;
	}

	public void setOidPartner(String oidPartner) {
		this.oidPartner = oidPartner;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
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

	public String getBusiPartner() {
		return busiPartner;
	}

	public void setBusiPartner(String busiPartner) {
		this.busiPartner = busiPartner;
	}

	public String getNoOrder() {
		return noOrder;
	}

	public void setNoOrder(String noOrder) {
		this.noOrder = noOrder;
	}

	public String getDtOrder() {
		return dtOrder;
	}

	public void setDtOrder(String dtOrder) {
		this.dtOrder = dtOrder;
	}

	public String getNameGoods() {
		return nameGoods;
	}

	public void setNameGoods(String nameGoods) {
		this.nameGoods = nameGoods;
	}

	public String getInfoOrder() {
		return infoOrder;
	}

	public void setInfoOrder(String infoOrder) {
		this.infoOrder = infoOrder;
	}

	public String getMoneyOrder() {
		return moneyOrder;
	}

	public void setMoneyOrder(String moneyOrder) {
		this.moneyOrder = moneyOrder;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getUrlReturn() {
		return urlReturn;
	}

	public void setUrlReturn(String urlReturn) {
		this.urlReturn = urlReturn;
	}

	public String getUserreqIp() {
		return userreqIp;
	}

	public void setUserreqIp(String userreqIp) {
		this.userreqIp = userreqIp;
	}

	public String getUrlOrder() {
		return urlOrder;
	}

	public void setUrlOrder(String urlOrder) {
		this.urlOrder = urlOrder;
	}

	public String getValidOrder() {
		return validOrder;
	}

	public void setValidOrder(String validOrder) {
		this.validOrder = validOrder;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getNoAgree() {
		return noAgree;
	}

	public void setNoAgree(String noAgree) {
		this.noAgree = noAgree;
	}

	public String getShareingData() {
		return shareingData;
	}

	public void setShareingData(String shareingData) {
		this.shareingData = shareingData;
	}

	public String getRiskItem() {
		return riskItem;
	}

	public void setRiskItem(String riskItem) {
		this.riskItem = riskItem;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getFlagModify() {
		return flagModify;
	}

	public void setFlagModify(String flagModify) {
		this.flagModify = flagModify;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getBackUrl() {
		return backUrl;
	}

	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

}
