package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

public class PayNotifyMockVO extends BaseBO {
	private static final long serialVersionUID = 7708886081041950228L;
	private String transCode;// 交易号
	private String transAmount;// 实际需要交易金额
	/**以下是选填 */
	private String payStatus;// 支付状态 0 失败 1成功
	private String thirdTradeNo;// 第三方交易号
	private String tradeTime;// 交易时间

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getThirdTradeNo() {
		return thirdTradeNo;
	}

	public void setThirdTradeNo(String thirdTradeNo) {
		this.thirdTradeNo = thirdTradeNo;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	@Override
	public String toString() {
		return "PayNotifyMockVO [transCode=" + transCode + ", transAmount=" + transAmount + ", payStatus=" + payStatus + ", thirdTradeNo=" + thirdTradeNo + ", tradeTime=" + tradeTime + "]";
	}

}
