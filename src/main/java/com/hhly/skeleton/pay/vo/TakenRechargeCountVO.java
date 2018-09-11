package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.pay.bo.TransRechargeBO;

/**
 * @desc 提款时，计算充值金额的百分比及总金额
 * @author xiongJinGang
 * @date 2017年4月20日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenRechargeCountVO {
	private Double totalTop20Balance = 0.0;// 总的20%金额
	private Double totalBalance = 0.0;// 总的充值金额
	private Double totalServiceBalance = 0.0;// 总手续费
	private boolean bigger = false;// 是否大于当前钱包中20%的余额
	private List<TransRechargeBO> list;// 需要原路退回的充值信息

	public Double getTotalTop20Balance() {
		return totalTop20Balance;
	}

	public void setTotalTop20Balance(Double totalTop20Balance) {
		this.totalTop20Balance = totalTop20Balance;
	}

	public Double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(Double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public boolean isBigger() {
		return bigger;
	}

	public void setBigger(boolean bigger) {
		this.bigger = bigger;
	}

	public List<TransRechargeBO> getList() {
		return list;
	}

	public void setList(List<TransRechargeBO> list) {
		this.list = list;
	}

	public Double getTotalServiceBalance() {
		return totalServiceBalance;
	}

	public void setTotalServiceBalance(Double totalServiceBalance) {
		this.totalServiceBalance = totalServiceBalance;
	}

}
