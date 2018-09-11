package com.hhly.skeleton.cms.lotterymgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author huangb
 *
 * @Date 2016年12月31日
 *
 * @Desc 彩期开奖详情
 */
@SuppressWarnings("serial")
public class DrawDetailBO extends BaseBO {
	/**
	 * 彩种
	 */
	private Integer lotteryCode;
	/**
	 * 期号
	 */
	private String lotteryIssue;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	/**
	 * 一等奖奖项
	 */
	private String firstPrize;
	/**
	 * 二等奖奖项
	 */
	private String secondPrize;
	/**
	 * 一等奖注数
	 */
	private Integer firstCount;
	/**
	 * 二等奖注数
	 */
	private Integer secondCount;
	/**
	 * 一等奖奖金
	 */
	private Double firstBonus;
	/**
	 * 二等奖奖金
	 */
	private Double secondBonus;

	

	public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getFirstPrize() {
		return firstPrize;
	}

	public void setFirstPrize(String firstPrize) {
		this.firstPrize = firstPrize;
	}

	public String getSecondPrize() {
		return secondPrize;
	}

	public void setSecondPrize(String secondPrize) {
		this.secondPrize = secondPrize;
	}

	public Integer getFirstCount() {
		return firstCount;
	}

	public void setFirstCount(Integer firstCount) {
		this.firstCount = firstCount;
	}

	public Integer getSecondCount() {
		return secondCount;
	}

	public void setSecondCount(Integer secondCount) {
		this.secondCount = secondCount;
	}

	public Double getFirstBonus() {
		return firstBonus;
	}

	public void setFirstBonus(Double firstBonus) {
		this.firstBonus = firstBonus;
	}

	public Double getSecondBonus() {
		return secondBonus;
	}

	public void setSecondBonus(Double secondBonus) {
		this.secondBonus = secondBonus;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}
}
