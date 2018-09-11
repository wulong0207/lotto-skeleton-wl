package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 提款时钱包金额信息
 * @author xiongJinGang
 * @date 2017年4月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenUserWalletVO extends BaseVO {

	private static final long serialVersionUID = -6630441101963188421L;

	/**
	 * 现金总余额
	 */
	private Double totalCashBalance;

	/**
	 * 中奖余额
	 */
	private Double winningBalance;

	/**
	 * 充值80%余额
	 */
	private Double top80Balance;

	/**
	 * 充值20%余额
	 */
	private Double top20Balance;

	/**
	 * 提款后余额
	 */
	private Double takenAfterBalance;

	/**
	 * 可用红包余额
	 */
	private Double effRedBalance;

	/**
	 * 待发红包余额
	 */
	private Double readyRedBalance;

	/**
	 * 账户总余额（总现金金额+红包余额+中奖余额）
	 */
	private Double totalBalance;

	/**
	 * 可提款金额（总现金金额+中奖余额）
	 */
	private Double totalAmount;

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

	public Double getTop80Balance() {
		return top80Balance;
	}

	public void setTop80Balance(Double top80Balance) {
		this.top80Balance = top80Balance;
	}

	public Double getTop20Balance() {
		return top20Balance;
	}

	public void setTop20Balance(Double top20Balance) {
		this.top20Balance = top20Balance;
	}

	public Double getEffRedBalance() {
		return effRedBalance;
	}

	public void setEffRedBalance(Double effRedBalance) {
		this.effRedBalance = effRedBalance;
	}

	public Double getReadyRedBalance() {
		return readyRedBalance;
	}

	public void setReadyRedBalance(Double readyRedBalance) {
		this.readyRedBalance = readyRedBalance;
	}

	public Double getTakenAfterBalance() {
		return takenAfterBalance;
	}

	public void setTakenAfterBalance(Double takenAfterBalance) {
		this.takenAfterBalance = takenAfterBalance;
	}

	public Double getTotalBalance() {
		Double totalCash = getTotalCashBalance();
		totalCash = ObjectUtil.isBlank(totalCash) ? 0.0 : totalCash;
		Double effRed = getEffRedBalance();
		effRed = ObjectUtil.isBlank(effRed) ? 0.0 : effRed;
		totalBalance = MathUtil.add(totalCash, effRed);
		return totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
