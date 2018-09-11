package com.hhly.skeleton.pay.agent.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 确认提款结果
 * @author xiongJinGang
 * @date 2018年3月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ConfirmTakenResultVO extends BaseBO {

	private Double takenAmount;// 提款金额
	private String arrivalTime;// 到账时间
	private String bankName;// 银行名称
	private String cardCode;// 银行卡号
	private Double arrivalAmount;// 实到金额
	private Double tax;// 劳务所得税
	private Double fee;// 服务费
	private Double balance;// 提款后账户余额

	@JsonIgnore
	private Integer agentId;//
	@JsonIgnore
	private String agentCode;// 代理用户编号
	@JsonIgnore
	private String takenCode;// 提款流水

	public Double getTakenAmount() {
		return takenAmount;
	}

	public void setTakenAmount(Double takenAmount) {
		this.takenAmount = takenAmount;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public Double getArrivalAmount() {
		return arrivalAmount;
	}

	public void setArrivalAmount(Double arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getTakenCode() {
		return takenCode;
	}

	public void setTakenCode(String takenCode) {
		this.takenCode = takenCode;
	}

}
