package com.hhly.skeleton.base.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @desc 分页获取结果
 * @author xiongjingang
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class Page<T> implements Serializable {

	private static final long serialVersionUID = -8780744210524022722L;

	private int pageNum;// 页码
	private int pageSize;// 每页显示数量
	private int startRow;//
	private int endRow;//
	private int pages;//
	private long total;//
	private List<T> rows;

	public Page(List<T> rows) {
		this(0, rows);
	}

	public Page(long total, List<T> rows) {
		this(0, 0, 0, total, rows);
	}

	public Page(int pageNum, int pageSize, int startRow, long total, List<T> rows) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.startRow = startRow;
		this.total = total;
		this.rows = rows;
	}

	public static <T> Page<T> empty() {
		return new Page<T>(0L, Collections.<T> emptyList());
	}

	public void putRow(T t) {
		if (this.rows == null) {
			this.rows = new ArrayList<>();
		}
		this.rows.add(t);
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Page {pageNum=" + pageNum + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows + "}";
	}

}