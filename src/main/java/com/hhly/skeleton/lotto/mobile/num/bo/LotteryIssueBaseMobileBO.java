package com.hhly.skeleton.lotto.mobile.num.bo;

import com.hhly.skeleton.lotto.base.lottery.bo.LotteryIssueBaseBO;
import com.hhly.skeleton.lotto.base.trend.high.bo.HighOmitBaseBO;

@SuppressWarnings("serial")
public class LotteryIssueBaseMobileBO extends LotteryIssueBaseBO {

	/**
	 * 遗漏
	 * 移动端首页要返回默认的遗漏类型
	 */
	private HighOmitBaseBO omit;

	public LotteryIssueBaseMobileBO(LotteryIssueBaseBO issueBase, HighOmitBaseBO omit) {
		setCurLottery(issueBase.getCurLottery());
		setCurIssue(issueBase.getCurIssue());
		setLatestIssue(issueBase.getLatestIssue());
		setLotBetMulList(issueBase.getLotBetMulList());
		setLotChildList(issueBase.getLotChildList());
		setLimitInfoList(issueBase.getLimitInfoList());
		setActivityBO(issueBase.getActivityBO());
		this.omit = omit;
	}

	public HighOmitBaseBO getOmit() {
		return omit;
	}

	public void setOmit(HighOmitBaseBO omit) {
		this.omit = omit;
	}

	
	
}
