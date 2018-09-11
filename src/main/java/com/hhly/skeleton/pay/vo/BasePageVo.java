package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.util.ObjectUtil;

public class BasePageVo {
    public Integer currentPage = 0;// 当前页
    private Integer showCount = 20;// 每页显示的条数，【默认20条】

	private Integer currentResult; // 当前记录起始索引
	private Integer endResult; // 当前记录结束索引

	public Integer getCurrentPage() {
		if (ObjectUtil.isBlank(currentPage)) {
			currentPage = 1;
		}
		if (currentPage <= 0) {
			currentPage = 1;
		}
		// if (currentPage > getTotalPage())
		// currentPage = getTotalPage();
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getShowCount() {
		if (ObjectUtil.isBlank(showCount)) {
			showCount = 20;
		}
		return showCount;
	}

	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}

	public Integer getCurrentResult() {
		currentResult = (getCurrentPage() - 1) * getShowCount();
		if (currentResult < 0) {
			currentResult = 0;
		}
		return currentResult;
	}

	public void setCurrentResult(Integer currentResult) {
		this.currentResult = currentResult;
	}

	public Integer getEndResult() {
		endResult = getCurrentPage() * getShowCount();
		return endResult;
	}

	public void setEndResult(Integer endResult) {
		this.endResult = endResult;
	}
}
