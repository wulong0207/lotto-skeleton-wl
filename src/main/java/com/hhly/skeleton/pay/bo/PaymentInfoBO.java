package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.pay.vo.PayParamVO;
import com.hhly.skeleton.pay.vo.RechargeParamVO;
import com.hhly.skeleton.user.bo.UserInfoBO;

/**
 * @Desc: 请求第三方支付参数信息bo
 * @author YiJian
 * @date 2017年3月15日
 * @compay 益彩网络科技有限公司
 * @version 1.0
 */
public class PaymentInfoBO {

	private String requestUrl; // 请求URL

	private String userId; // 用户编号
	private Integer userIdInt;// 数字型用户ID
	private Date registerTime;// 用户注册时间
	private String timestamp; // 格式：YYYYMMDDH24MISS
	private String noOrder; // 商户唯一订单号
	private String dtOrder; // 商户订单时间 yyyyMMddHHmmss
	private String nameGoods; // 商品名称
	private String infoOrder; // 订单描述
	private String moneyOrder; // 交易金额 单位为RMB-元
	private String notifyUrl; // 服务器异步通知地址
	private String urlReturn; // 支付结束回显url
	private String userreqIp; // 用户端申请IP
	private String urlOrder; // 订单地址
	private String validOrder; // 订单有效时间 分钟为单位，默认为10080分钟（7天）
	private String bankCode; // 制定银行编号
	private String payType; // 支付方式 1:网银支付(借记卡) 2:快捷支付(借记卡) 3:快捷支付(信用卡)8:网银支付(信用卡)9:B2B企业网银支付 10：支付宝 11：微信 12：QQ支付
	private String idType; // 证件类型 0：身份证
	private String idNo; // 身份证号码
	private String acctName; // 姓名
	private String cardNo; // 银行卡号
	private String mobilePhone;// 手机号
	private String backUrl; // 返回修改地址
	private Short payPlatform;// 支付平台 1PC、2WAP、3ANDROID、4IOS、5未知、6H5，参见：PayConstants.TakenPlatformEnum枚举
	private Short transType;// 交易类型 PayConstants.RechargeTypeEnum
	private String openId;// 微信公众号的openId
	private String noAgree; // 连连快捷支付（卡前置模式） 用户绑卡之后会返回此参数值
	private String appId;// 微信公众号应用ID

	private String attach; // 附加参数
	private boolean isTest;// 是否为测试环境 true:是；false:否
	private String bankSimpleCode;// 银行英文简码

	public PaymentInfoBO() {
		super();
	}

	/**
	 *单个支付
	 */
	public PaymentInfoBO(PayParamVO payParam, UserInfoBO userInfoBO, String transCode) {
		this.userIdInt = userInfoBO.getId();
		this.userId = userInfoBO.getId() + userInfoBO.getIdCard();// 用户Id加上身份证号，做为唯一用户ID
		this.timestamp = DateUtil.getNow(DateUtil.DATE_FORMAT_NUM);
		// this.noOrder = orderInfo.getOrderCode();//2017-05-08，跟Mr.Wang商定，用充值流水做商户订单号
		this.noOrder = transCode;// 交易流水号做为商户订单号
		// this.dtOrder = DateUtil.convertDateToStr(orderInfo.getShowDate(), DateUtil.DATE_FORMAT_NUM);
		this.dtOrder = DateUtil.getNow(DateUtil.DATE_FORMAT_NUM);// 默认当前时间
		// this.nameGoods = ObjectUtil.isBlank(orderInfo.getLotteryName()) ? "彩票" : orderInfo.getLotteryName();
		// this.infoOrder = orderInfo.getLotteryName();

		this.nameGoods = transCode;// 用交易号做为商品名称
		this.infoOrder = transCode;
		this.userreqIp = payParam.getClientIp().equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : payParam.getClientIp();
		this.bankCode = payParam.getBankCode();
		this.idType = "0";
		this.idNo = userInfoBO.getIdCard();
		this.acctName = userInfoBO.getRealName();
		this.payPlatform = payParam.getPlatform();// 支付平台
		this.transType = PayConstants.RechargeTypeEnum.PAY.getKey();
		this.mobilePhone = userInfoBO.getMobile();
		this.isTest = payParam.isTest();
		this.openId = payParam.getOpenId();
		this.appId = payParam.getAppId();
		if (!ObjectUtil.isBlank(payParam.getPayBankcardBO())) {
			this.cardNo = payParam.getPayBankcardBO().getCardcode();
		}
		if (!ObjectUtil.isBlank(payParam.getPayBankBO())) {
			this.bankSimpleCode = payParam.getPayBankBO().getCode();
		}
		this.moneyOrder = MathUtil.formatAmount(payParam.getPayAmount());// 金额统一保留2位小数
	}

	/**
	 *充值
	 */
	public PaymentInfoBO(RechargeParamVO rechargeParam, UserInfoBO userInfoBO, String transCode) {
		String nowTime = DateUtil.getNow(DateUtil.DATE_FORMAT_NUM);
		this.userIdInt = userInfoBO.getId();
		this.userId = userInfoBO.getId() + userInfoBO.getIdCard();
		this.timestamp = nowTime;
		this.noOrder = rechargeParam.getTransCode();
		this.dtOrder = nowTime;
		// this.nameGoods = rechargeParam.getName();
		// this.infoOrder = rechargeParam.getName();
		this.nameGoods = transCode;
		this.infoOrder = transCode;
		this.userreqIp = rechargeParam.getClientIp().equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : rechargeParam.getClientIp();
		this.bankCode = rechargeParam.getBankCode();
		this.idType = "0";
		this.idNo = userInfoBO.getIdCard();
		this.payPlatform = rechargeParam.getPlatform();// 支付平台
		this.acctName = userInfoBO.getRealName();
		this.transType = PayConstants.RechargeTypeEnum.RECHARGE.getKey();
		this.mobilePhone = userInfoBO.getMobile();
		if (!ObjectUtil.isBlank(rechargeParam.getPayBankcardBO())) {
			this.cardNo = rechargeParam.getPayBankcardBO().getCardcode();
		}
		if (!ObjectUtil.isBlank(rechargeParam.getPayBankBO())) {
			this.bankSimpleCode = rechargeParam.getPayBankBO().getCode();
		}
		this.isTest = rechargeParam.isTest();
		this.openId = rechargeParam.getOpenId();
		this.appId = rechargeParam.getAppId();
		this.moneyOrder = MathUtil.formatAmount(rechargeParam.getRechargeAmount());// 金额统一保留2位小数
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
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

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getNoAgree() {
		return noAgree;
	}

	public void setNoAgree(String noAgree) {
		this.noAgree = noAgree;
	}

	public Short getPayPlatform() {
		return payPlatform;
	}

	public void setPayPlatform(Short payPlatform) {
		this.payPlatform = payPlatform;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public boolean isTest() {
		return isTest;
	}

	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}

	public String getBankSimpleCode() {
		return bankSimpleCode;
	}

	public void setBankSimpleCode(String bankSimpleCode) {
		this.bankSimpleCode = bankSimpleCode;
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

	public Integer getUserIdInt() {
		return userIdInt;
	}

	public void setUserIdInt(Integer userIdInt) {
		this.userIdInt = userIdInt;
	}

	@Override
	public String toString() {
		return "支付参数 [userId=" + userId + ",noOrder=" + noOrder + ", dtOrder=" + dtOrder + ", nameGoods=" + nameGoods + ", infoOrder=" + infoOrder + ", moneyOrder=" + moneyOrder + ", notifyUrl=" + notifyUrl + ", urlReturn=" + urlReturn
				+ ", userreqIp=" + userreqIp + ", validOrder=" + validOrder + ", bankCode=" + bankCode + ", payType=" + payType + ", idType=" + idType + ", idNo=" + idNo + ", acctName=" + acctName + ", cardNo=" + cardNo + ", payPlatform="
				+ payPlatform + ", attach=" + attach + "]";
	}

}
