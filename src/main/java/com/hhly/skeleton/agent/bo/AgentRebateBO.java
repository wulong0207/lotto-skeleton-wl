package com.hhly.skeleton.agent.bo;

import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 代理返佣
 * 
 * @author huangchengfang1219
 *
 */
public class AgentRebateBO {

	/**
	 * 月份
	 */
	@ExcelHeader("月份")
	private String month;

	/**
	 * 代理名称
	 */
	@ExcelHeader("代理名称")
	private String accountName;
	
	/**
	 * 返佣收入(直属会员收入)
	 */
	@ExcelHeader("直属会员收入")
	private Double rebateIncome;

	/**
	 * 奖励收入(代理收入)
	 */
	@ExcelHeader("代理收入")
	private Double rewardIncome;

	/**
	 * 总收入
	 */
	@ExcelHeader("总收入")
	private Double totalInCome;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getRebateIncome() {
		return rebateIncome;
	}

	public void setRebateIncome(Double rebateIncome) {
		this.rebateIncome = rebateIncome;
	}

	public Double getRewardIncome() {
		return rewardIncome;
	}

	public void setRewardIncome(Double rewardIncome) {
		this.rewardIncome = rewardIncome;
	}

	public Double getTotalInCome() {
		return totalInCome;
	}

	public void setTotalInCome(Double totalInCome) {
		this.totalInCome = totalInCome;
	}
	
}
