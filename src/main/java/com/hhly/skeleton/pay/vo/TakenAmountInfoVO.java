package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款金额的组成
 * @author xiongJinGang
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenAmountInfoVO extends BaseBO {
	private static final long serialVersionUID = 6681277821778621894L;
	private Integer takenId;// 每一种提款给一个编码
	private String title;// 标题 正常申请 第一笔异常申请 第二笔异常申请
	private String takenAmount;// 提款金额，格式化后的提款金额
	private Double takenAmountDou;// 提款金额
	private String actualAmount;// 实际到账金额
	private String serviceFee;// 手续费，带格式化的输入 1,200.00
	private Integer bankId;// 银行ID
	private String bankName;// 到账银行
	private String bankCard;// 银行卡号 尾号4907
	private String arrivalTime;// 到账时间 预计2016-07-09前（15日内）到账
	private String exceptionRemark;// 异常提款说明：为了防止少数用户利用信用卡套现和洗钱的行为，保护正常用户的资金安全，所有充值金额消费不满20%的申请原路返还，15个工作日内到账，并收取充值金额1%的手续费。
	private String exceptionTips;// 2016-07-07 21:54:12 充值345,678.00元，只消费了678.00元，不足20%(差1234元)
	private Short status;// 提款状态 1正常 2原路返回 3不可提款
	private String serviceFeeTips;// 免手续费、原路返还手续费： 1,120.00 元
	private String notAllowTips;// 不可提款说明
	@JsonIgnore
	private Short rechargeChannel;// 充值渠道
	@JsonIgnore
	private String fullBankCard;// 银行卡号
	@JsonIgnore
	private Integer rechargeId;// 充值流水ID
	@JsonIgnore
	private String rechargeCode;// 充值流水号
	@JsonIgnore
	private Double taken20Amount;// 提款20%部分的金额
	private Double serviceFeeDou;// double类型的服务费

	public Integer getTakenId() {
		return takenId;
	}

	public void setTakenId(Integer takenId) {
		this.takenId = takenId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTakenAmount() {
		return takenAmount;
	}

	public void setTakenAmount(String takenAmount) {
		this.takenAmount = takenAmount;
	}

	public String getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getExceptionRemark() {
		return exceptionRemark;
	}

	public void setExceptionRemark(String exceptionRemark) {
		this.exceptionRemark = exceptionRemark;
	}

	public String getExceptionTips() {
		return exceptionTips;
	}

	public void setExceptionTips(String exceptionTips) {
		this.exceptionTips = exceptionTips;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getServiceFeeTips() {
		return serviceFeeTips;
	}

	public void setServiceFeeTips(String serviceFeeTips) {
		this.serviceFeeTips = serviceFeeTips;
	}

	public String getRechargeCode() {
		return rechargeCode;
	}

	public void setRechargeCode(String rechargeCode) {
		this.rechargeCode = rechargeCode;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Short getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(Short rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public String getFullBankCard() {
		return fullBankCard;
	}

	public void setFullBankCard(String fullBankCard) {
		this.fullBankCard = fullBankCard;
	}

	public Double getTaken20Amount() {
		return taken20Amount;
	}

	public void setTaken20Amount(Double taken20Amount) {
		this.taken20Amount = taken20Amount;
	}

	public Integer getRechargeId() {
		return rechargeId;
	}

	public void setRechargeId(Integer rechargeId) {
		this.rechargeId = rechargeId;
	}

	public String getNotAllowTips() {
		return notAllowTips;
	}

	public void setNotAllowTips(String notAllowTips) {
		this.notAllowTips = notAllowTips;
	}

	public Double getServiceFeeDou() {
		return serviceFeeDou;
	}

	public void setServiceFeeDou(Double serviceFeeDou) {
		this.serviceFeeDou = serviceFeeDou;
	}

	public Double getTakenAmountDou() {
		return takenAmountDou;
	}

	public void setTakenAmountDou(Double takenAmountDou) {
		this.takenAmountDou = takenAmountDou;
	}

	@Override
	public String toString() {
		return "TakenAmountInfoVO [takenId=" + takenId + ", title=" + title + ", takenAmount=" + takenAmount + ", serviceFee=" + serviceFee + ", bankId=" + bankId + ", bankName=" + bankName + ", bankCard=" + bankCard + ", arrivalTime=" + arrivalTime
				+ ", status=" + status + ", rechargeChannel=" + rechargeChannel + ", fullBankCard=" + fullBankCard + ", rechargeCode=" + rechargeCode + "]";
	}

}
