package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户提款确认 
 * @author xiongJinGang
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenConfirmVO extends BaseBO {
	private static final long serialVersionUID = -4081217200096216001L;
	private TakenUserWalletVO takenUserWallet;// 用户钱包信息
	private List<TakenAmountInfoVO> list;// 提款批次列表
	private String confirmTips;// 本次提款分3笔到，手续费3456元，如没有问题确认提交申请。
	private Integer num;// 到账笔数
	private Double serviceFee;// 收多少手续费
	private Integer bankCardId;// 银行卡ID
	private Double actualTakenAmount = 0d;// 实际需要提款的金额
	@JsonIgnore
	private Double totalServiceFee = 0d;// 总服务费
	@JsonIgnore
	private Integer userId;// 用户Id
	@JsonIgnore
	private Double totalTop20Balance = 0d;// 总的20%金额

	public TakenConfirmVO() {
		super();
	}

	public TakenConfirmVO(TakenUserWalletVO takenUserWallet) {
		super();
		this.takenUserWallet = takenUserWallet;
	}

	public TakenUserWalletVO getTakenUserWallet() {
		return takenUserWallet;
	}

	public void setTakenUserWallet(TakenUserWalletVO takenUserWallet) {
		this.takenUserWallet = takenUserWallet;
	}

	public List<TakenAmountInfoVO> getList() {
		return list;
	}

	public void setList(List<TakenAmountInfoVO> list) {
		this.list = list;
	}

	public String getConfirmTips() {
		return confirmTips;
	}

	public void setConfirmTips(String confirmTips) {
		this.confirmTips = confirmTips;
	}

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public Double getTotalServiceFee() {
		return totalServiceFee;
	}

	public void setTotalServiceFee(Double totalServiceFee) {
		this.totalServiceFee = totalServiceFee;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getTotalTop20Balance() {
		return totalTop20Balance;
	}

	public void setTotalTop20Balance(Double totalTop20Balance) {
		this.totalTop20Balance = totalTop20Balance;
	}

	public Double getActualTakenAmount() {
		return actualTakenAmount;
	}

	public void setActualTakenAmount(Double actualTakenAmount) {
		this.actualTakenAmount = actualTakenAmount;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(Double serviceFee) {
		this.serviceFee = serviceFee;
	}

}
