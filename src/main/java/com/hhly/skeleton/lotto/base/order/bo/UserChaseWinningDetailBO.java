package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户追号中奖明细
 * @author huangb
 * @date 2017年4月13日
 * @company 益彩网络
 * @version v1.0
 */
public class UserChaseWinningDetailBO extends BaseBO {

	private static final long serialVersionUID = 1854358989363634578L;
	/**
	 * 中奖期号
	 */
	private String issueCode;
	/**
	 * 中奖税前金额
	 */
	private Double preBonus;
	/**
	 * 中奖税后金额
	 */
	private Double aftBonus;
	/**
	 * 中奖加奖金额
	 */
	private Double addedBonus;

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public Double getAddedBonus() {
		return addedBonus;
	}

	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
	}

}
