package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.user.bo.UserWalletBO;

/**
 * @desc 跳转支付钱包数据
 * @author xiongJinGang
 * @date 2017年5月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class PayUserWalletVO extends BaseBO {
	@JsonProperty("p_n")
	private String payName;// 帐户余额
	/**
	 * 现金总余额
	 */
	@JsonProperty("tot_c_b")
	private Double totalCashBalance;

	/**
	 * 中奖余额
	 */
	@JsonProperty("win_b")
	private Double winningBalance;

	/**
	 * 可用红包余额
	 */
	@JsonProperty("eff_r_b")
	private Double effRedBalance;

	public PayUserWalletVO() {
		super();
	}

	public PayUserWalletVO(UserWalletBO userWalletBO) {
		super();
		this.payName = Constants.PAY_WALLET_NAME;
		this.totalCashBalance = userWalletBO.getTotalCashBalance();
		this.winningBalance = userWalletBO.getWinningBalance();
		this.effRedBalance = userWalletBO.getEffRedBalance();
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public Double getWinningBalance() {
		return winningBalance;
	}

	public void setWinningBalance(Double winningBalance) {
		this.winningBalance = winningBalance;
	}

	public Double getEffRedBalance() {
		return effRedBalance;
	}

	public void setEffRedBalance(Double effRedBalance) {
		this.effRedBalance = effRedBalance;
	}

}
