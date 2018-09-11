package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.constants.PayConstants.TransStatusEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 充值更新内容
 * @author xiongJinGang
 * @date 2017年3月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RechargeUpdateVO implements Serializable {
	private static final long serialVersionUID = 327970917954421067L;
	private Integer rechargeId;
	/**
	 * 交易状态
	 */
	private Short transStatus;
	/**
	 * 交易号
	 */
	private String transCode;
	/**
	 * 响应时间
	 */
	private String responseTime;
	/**
	 * 第三方交易时间
	 */
	private String thirdTransTime;
	/**
	 * 到账金额
	 */
	private Double arrivalAmount;
	/**
	 * 第三方流水号
	 */
	private String thirdTransNum;

	public RechargeUpdateVO() {
		super();
	}

	public RechargeUpdateVO(PayNotifyResultVO payNotifyResult, Integer rechargeId) {
		this.rechargeId = rechargeId;
		String transTime = ObjectUtil.isBlank(payNotifyResult.getTradeTime()) ? DateUtil.getNow() : payNotifyResult.getTradeTime();
		this.thirdTransTime = transTime;
		if (payNotifyResult.getStatus().getKey().equals(PayConstants.PayStatusEnum.PAYMENT_SUCCESS.getKey())) {
			this.arrivalAmount = payNotifyResult.getOrderAmt();
			this.thirdTransNum = payNotifyResult.getThirdTradeNo();
			this.transStatus = TransStatusEnum.TRADE_SUCCESS.getKey();
		} else {
			this.transStatus = TransStatusEnum.TRADE_FAIL.getKey();
		}
	}

	public Integer getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(Integer rechargeId) {
		this.rechargeId = rechargeId;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getThirdTransTime() {
		return thirdTransTime;
	}

	public void setThirdTransTime(String thirdTransTime) {
		this.thirdTransTime = thirdTransTime;
	}

	public Double getArrivalAmount() {
		return arrivalAmount;
	}

	public void setArrivalAmount(Double arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}

}