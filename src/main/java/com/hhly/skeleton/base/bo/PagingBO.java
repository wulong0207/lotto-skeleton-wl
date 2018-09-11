package com.hhly.skeleton.base.bo;

import java.util.List;


@SuppressWarnings("serial")
public class PagingBO <T> extends BaseBO {
	private static final String code = ResultBO.SUCCESS_CODE;
	/**
	 * 总条数
	 */
    private int  total;
    private List<T> data;
    //其他信息
    private Object other;
    
	public Object getOther() {
		return other;
	}

	public void setOther(Object other) {
		this.other = other;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}    
    
}
