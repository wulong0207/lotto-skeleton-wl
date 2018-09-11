package com.hhly.skeleton.lotto.base.trend.high.bo.c11x5;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

public class C11x5TrendBetBO extends BaseBO {

	private String issue;
	private String drawCode;
	private List<Integer> code5Digits;

	public C11x5TrendBetBO() {
	}

	public C11x5TrendBetBO(String issue, String drawCode, List<Integer> code5Digits) {
		super();
		this.issue = issue;
		this.drawCode = drawCode;
		this.code5Digits = code5Digits;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public List<Integer> getCode5Digits() {
		return code5Digits;
	}

	public void setCode5Digits(List<Integer> code5Digits) {
		this.code5Digits = code5Digits;
	}

}
