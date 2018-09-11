package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款后，账户剩余总金额
 * @author xiongJinGang
 * @date 2017年4月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenAfterUserWallet extends BaseBO {
	private static final long serialVersionUID = 8732307728659680992L;
	private Double totalBalance;// 账户剩余总金额

	public TakenAfterUserWallet() {
		super();
	}

	public TakenAfterUserWallet(Double totalBalance) {
		super();
		this.totalBalance = totalBalance;
	}

	public Double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

}
