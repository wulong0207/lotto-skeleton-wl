package com.hhly.skeleton.lotto.base.lottery.vo;

@SuppressWarnings("serial")
public class LotteryTimeVO extends LotteryVO{
	
	/** 查询开始彩期 */
	private String startIssue;
	/** 查询结束彩期 */
	private String endIssue;
	
	public String getStartIssue() {
		return startIssue;
	}
	public void setStartIssue(String startIssue) {
		this.startIssue = startIssue;
	}
	public String getEndIssue() {
		return endIssue;
	}
	public void setEndIssue(String endIssue) {
		this.endIssue = endIssue;
	}
	
	
}
