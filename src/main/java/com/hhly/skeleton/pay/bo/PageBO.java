package com.hhly.skeleton.pay.bo;

import java.io.Serializable;
import java.util.List;

/**
 * @desc 分页实体
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PageBO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int showCount = 20; // 每页显示记录数
	private int totalPage; // 总页数
	private int totalResult; // 总记录数
	private int currentPage; // 当前页
	private int currentResult; // 当前记录起始索引
	private List<?> dataList;// 记录列表

	public PageBO() {
		super();
	}

	public PageBO(int showCount, int totalResult, int currentPage) {
		super();
		this.showCount = showCount;
		this.totalResult = totalResult;
		this.currentPage = currentPage;
	}

	public PageBO(int totalResult, int currentPage) {
		super();
		this.totalResult = totalResult;
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		if (totalResult % showCount == 0) {
			totalPage = totalResult / showCount;
		} else {
			totalPage = totalResult / showCount + 1;
		}
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalResult() {
		return totalResult;
	}

	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	public int getCurrentPage() {
		if (currentPage <= 0)
			currentPage = 1;
		if (currentPage > getTotalPage())
			currentPage = getTotalPage();
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public int getCurrentResult() {
		currentResult = (getCurrentPage() - 1) * getShowCount();
		if (currentResult < 0)
			currentResult = 0;
		return currentResult;
	}

	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}

	public List<?> getDataList() {
		return dataList;
	}

	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}

}
