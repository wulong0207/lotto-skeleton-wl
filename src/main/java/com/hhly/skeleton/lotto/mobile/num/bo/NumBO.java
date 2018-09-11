/**
 * 
 */
package com.hhly.skeleton.lotto.mobile.num.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryIssueBaseBO;
import com.hhly.skeleton.lotto.base.trend.bo.OmitOutBaseBO;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc
 * @author Bruce
 * @date 2017年3月8日
 * @company 益彩网络科技有限公司
 * @version 1.0
 */
public class NumBO extends BaseBO {

	private static final long serialVersionUID = -2006311363702092887L;

	/**
	 * 基础数据(彩种、彩期、最新开奖、注/倍数配置、子玩法、限号)
	 */
	private LotteryIssueBaseBO lotteryIssueBase;
	/**
	 * 遗漏走势数据
	 */
	private TrendBaseBO trendBase;
	/**
	 * 遗漏走势数据封装输出，字段信息封装成数组列表(手机端需要一次返回数据，所有这里包含了指定彩种所有遗漏类型的数据)
	 */
	private List trendDigits;
	/**
	 * 遗漏走势数据封装输出，字段信息封装成数组列表(这里区别上面的列表，只返回一种遗漏类型的数据)
	 */
	private OmitOutBaseBO trendDigit;

	public NumBO() {
	}

	/**
	 * 构造
	 * 
	 * @param lotteryIssueBase
	 * @param trendBaseBO
	 */
	public NumBO(LotteryIssueBaseBO lotteryIssueBase, TrendBaseBO trendBaseBO) {
		this.lotteryIssueBase = lotteryIssueBase;
		this.trendBase = trendBaseBO;
	}

	public NumBO(LotteryIssueBaseBO lotteryIssueBase, List trendDigits) {
		this.lotteryIssueBase = lotteryIssueBase;
		this.trendDigits = trendDigits;
	}

	public NumBO(LotteryIssueBaseBO lotteryIssueBase, OmitOutBaseBO trendDigit) {
		this.lotteryIssueBase = lotteryIssueBase;
		this.trendDigit = trendDigit;
	}

	public LotteryIssueBaseBO getLotteryIssueBase() {
		return lotteryIssueBase;
	}

	public void setLotteryIssueBase(LotteryIssueBaseBO lotteryIssueBase) {
		this.lotteryIssueBase = lotteryIssueBase;
	}

	public TrendBaseBO getTrendBase() {
		return trendBase;
	}

	public void setTrendBase(TrendBaseBO trendBase) {
		this.trendBase = trendBase;
	}

	public List getTrendDigits() {
		return trendDigits;
	}

	public void setTrendDigits(List trendDigits) {
		this.trendDigits = trendDigits;
	}

	public OmitOutBaseBO getTrendDigit() {
		return trendDigit;
	}

	public void setTrendDigit(OmitOutBaseBO trendDigit) {
		this.trendDigit = trendDigit;
	}

}
