package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.constants.RechargeConstants;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.pay.bo.PayBankcardBO;

/**
 * @desc 用户充值管理
 * @author xiongjingang
 * @date 2017年3月1日 下午3:40:27
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransRechargeVO implements Serializable {
	private static final long serialVersionUID = 327970917954421067L;
	/**
	 * 用户登录token
	 */
	private String token;
	/**
	*1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	*/
	private Short rechargeChannel;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 交易状态
	 */
	private Short transStatus;
	/**
	*1：快捷支付；2：网银支付；3：其它支付；
	*/
	private Short payType;
	/**
	*1：农商银行；2：光大银行；3：交通银行；4：平安银行；5：农业银行；5：中信银行；6：广发银行；7：华夏银行；8：浦发银行；9：民生银行；10：建设银行；11：中国银行；12：工商银行；13：邮储银行；14：招商银行；15：兴业银行；
	*/
	private Integer rechargeBank;
	/**
	*1：储蓄卡；2：信用卡；3：其它
	*/
	private Short bankCardType;
	/**
	*银行卡号
	*/
	private String bankCardNum;
	/**
	*充值金额
	*/
	private Double rechargeAmount;
	/**
	 * 到账金额
	 */
	private Double arrivalAmount;
	/**
	*充值描述
	*/
	private String rechargeRemark;
	/**
	*1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	*/
	private Short rechargePlatform;
	/**
	*市场渠道ID
	*/
	private String channelId;
	/**
	*红包金额
	*/
	private Double redAmount;
	/**
	*描述
	*/
	private String remark;
	/**
	*时间类型，列表查询用，不一定都有值
	*/
	private String timeType;
	/**
	 * 交易号
	 */
	private String transCode;
	/**
	 *红包编号
	 */
	private String redCode;
	/**
	 *支付渠道编号
	 */
	private String channelCode;
	private String thirdTransNum;// 第三方交易流水号

	private Short switchStatus;// 网银和快捷切换状态:0不切换;1切换
	private String hdCode;// 充值活动编号
	/**
	 * 是否可提款状态:0不可提、1可提 、2已提
	 */
	private Short takenStatus;
	/**
	 *  0充值、1即买即付，默认0
	 */
	private Short rechargeType;
	private Object[] excludeChannels;// 充值渠道
	private Integer payChannelId;// 充值渠道ID

	public TransRechargeVO() {
		super();
	}

	public TransRechargeVO(PayQueryParamVO payQueryParamVO) {
		super();
		this.thirdTransNum = payQueryParamVO.getTradeNo();
		this.transCode = payQueryParamVO.getTransCode();
	}

	public TransRechargeVO(RefundParamVO refundParam) {
		super();
		this.thirdTransNum = refundParam.getTradeNo();
		this.transCode = refundParam.getTransCode();
	}

	public TransRechargeVO(PayParamVO payParam) {
		// this.rechargeChannel = payParam.getChannelType();
		PayBankcardBO payBankcardBO = payParam.getPayBankcardBO();
		this.payType = PayConstants.PayTypeEnum.THIRD_PAYMENT.getKey();// 默认第三方支付
		this.bankCardType = PayConstants.BankCardTypeEnum.OTHER.getKey();// 默认其它类型
		this.rechargeBank = payParam.getBankId();// 银行Id
		// 银行卡号不为空
		if (!ObjectUtil.isBlank(payBankcardBO)) {
			// 是否开启快捷支付 0：否，1：是
			Short openBank = payBankcardBO.getOpenbank();
			if (PayConstants.BandCardQuickEnum.HAD_OPEN.getKey().equals(openBank)) {
				this.payType = PayConstants.PayTypeEnum.QUICK_PAYMENT.getKey();// 快捷支付
			} else {
				this.payType = PayConstants.PayTypeEnum.BANK_PAYMENT.getKey();// 网银支付
			}
			this.bankCardType = payBankcardBO.getBanktype();
			this.bankCardNum = payBankcardBO.getCardcode();
		} else {
			// 获取第三方支付方式
			Short payType = RechargeConstants.getThirdTradeType(payParam.getPayBankBO());
			if (!ObjectUtil.isBlank(payType)) {
				this.payType = payType;
			} else {
				this.payType = PayConstants.PayTypeEnum.THIRD_PAYMENT.getKey();// 其它支付
			}
		}
		this.rechargeRemark = payParam.getRemark();
		this.rechargePlatform = payParam.getPlatform();
		// this.channelId = payParam.getChannelId();
		this.remark = payParam.getRemark();
		this.redAmount = payParam.getUseRedAmount();
		this.orderCode = payParam.getOrderCode();
		this.redCode = payParam.getRedCode();// 红包编号
		this.transStatus = PayConstants.TransStatusEnum.TRADE_UNDERWAY.getKey();// 交易进行中
	}

	public TransRechargeVO(RechargeParamVO recharge) {
		// this.rechargeChannel = payParam.getChannelType();
		PayBankcardBO payBankcardBO = recharge.getPayBankcardBO();
		this.payType = PayConstants.PayTypeEnum.THIRD_PAYMENT.getKey();// 默认第三方支付
		this.bankCardType = PayConstants.BankCardTypeEnum.OTHER.getKey();// 默认其它类型
		this.rechargeBank = recharge.getBankId();// 银行ID
		// 银行卡号不为空
		if (!ObjectUtil.isBlank(payBankcardBO)) {
			// 是否开启快捷支付 0：否，1：是
			Short openBank = payBankcardBO.getOpenbank();
			if (PayConstants.BandCardQuickEnum.HAD_OPEN.getKey().equals(openBank)) {
				this.payType = PayConstants.PayTypeEnum.QUICK_PAYMENT.getKey();// 快捷支付
			} else {
				this.payType = PayConstants.PayTypeEnum.BANK_PAYMENT.getKey();// 网银支付
			}
			this.bankCardType = payBankcardBO.getBanktype();
			this.bankCardNum = payBankcardBO.getCardcode();
		} else {
			// 获取第三方支付方式
			Short payType = RechargeConstants.getThirdTradeType(recharge.getPayBankBO());
			if (!ObjectUtil.isBlank(payType)) {
				this.payType = payType;
			} else {
				this.payType = PayConstants.PayTypeEnum.THIRD_PAYMENT.getKey();// 其它支付
			}
		}
		this.rechargePlatform = recharge.getPlatform();
		// this.channelId = payParam.getChannelId();
		this.remark = recharge.getName();
		// this.redAmount = recharge.getRedAmount();//充值没有红包金额
		// this.orderCode = payParam.getOrderCode();//充值没有订单金额
		this.redCode = recharge.getRedCode();// 红包编号
		this.transStatus = PayConstants.TransStatusEnum.TRADE_UNDERWAY.getKey();// 交易进行中
		this.switchStatus = recharge.getChange();// 是否切换
		this.hdCode = recharge.getHdCode();// 充值活动编号
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(Short rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
	}

	public Integer getRechargeBank() {
		return rechargeBank;
	}

	public void setRechargeBank(Integer rechargeBank) {
		this.rechargeBank = rechargeBank;
	}

	public Short getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(Short bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getRechargeRemark() {
		return rechargeRemark;
	}

	public void setRechargeRemark(String rechargeRemark) {
		this.rechargeRemark = rechargeRemark;
	}

	public Short getRechargePlatform() {
		return rechargePlatform;
	}

	public void setRechargePlatform(Short rechargePlatform) {
		this.rechargePlatform = rechargePlatform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Double getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(Double redAmount) {
		this.redAmount = redAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}

	public Double getArrivalAmount() {
		return arrivalAmount;
	}

	public void setArrivalAmount(Double arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}

	public Short getSwitchStatus() {
		return switchStatus;
	}

	public void setSwitchStatus(Short switchStatus) {
		this.switchStatus = switchStatus;
	}

	public String getHdCode() {
		return hdCode;
	}

	public void setHdCode(String hdCode) {
		this.hdCode = hdCode;
	}

	public Short getTakenStatus() {
		return takenStatus;
	}

	public void setTakenStatus(Short takenStatus) {
		this.takenStatus = takenStatus;
	}

	public Short getRechargeType() {
		return rechargeType;
	}

	public void setRechargeType(Short rechargeType) {
		this.rechargeType = rechargeType;
	}

	public Object[] getExcludeChannels() {
		return excludeChannels;
	}

	public void setExcludeChannels(Object[] excludeChannels) {
		this.excludeChannels = excludeChannels;
	}

	public Integer getPayChannelId() {
		return payChannelId;
	}

	public void setPayChannelId(Integer payChannelId) {
		this.payChannelId = payChannelId;
	}

	@Override
	public String toString() {
		return "TransRechargeVO [token=" + token + ", rechargeChannel=" + rechargeChannel + ", orderCode=" + orderCode + ", userId=" + userId + ", transStatus=" + transStatus + ", payType=" + payType + ", rechargeBank=" + rechargeBank
				+ ", bankCardType=" + bankCardType + ", bankCardNum=" + bankCardNum + ", rechargeAmount=" + rechargeAmount + ", rechargeRemark=" + rechargeRemark + ", rechargePlatform=" + rechargePlatform + ", channelId=" + channelId + ", redAmount="
				+ redAmount + ", transCode=" + transCode + "]";
	}

}