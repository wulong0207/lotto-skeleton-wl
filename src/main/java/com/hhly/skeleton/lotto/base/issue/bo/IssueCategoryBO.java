package com.hhly.skeleton.lotto.base.issue.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

public class IssueCategoryBO  extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2492238825865772117L;
	/**
	 * 彩种类型
	 */
	private Integer lotteryCategory ;	
	private List<IssueLottBO> issueList;
	
	public Integer getLotteryCategory() {
		return lotteryCategory;
	}
	public void setLotteryCategory(Integer lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}
	public List<IssueLottBO> getIssueList() {
		return issueList;
	}
	public void setIssueList(List<IssueLottBO> issueList) {
		this.issueList = issueList;
	}
	
}
