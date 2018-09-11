/**
 * 
 */
package com.hhly.skeleton.lotto.mobile.num.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryIssueBaseBO;

/**
 * @desc    十一选五移动端BO
 * @author  Tony Wang
 * @date    2017年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class X115MobileBO extends BaseBO {
	private LotteryIssueBaseBO lotteryIssueBase;

	public LotteryIssueBaseBO getLotteryIssueBase() {
		return lotteryIssueBase;
	}

	public void setLotteryIssueBase(LotteryIssueBaseBO lotteryIssueBase) {
		this.lotteryIssueBase = lotteryIssueBase;
	}

}
