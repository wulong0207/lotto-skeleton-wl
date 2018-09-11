package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

/**
 * 
 * @desc K3走势数据
 * @author chenghougui
 * @Date 2018年1月3日
 * @Company 益彩网络科技公司
 * @version
 */
public class TrendBaseK3BO extends TrendBaseBO {

	private static final long serialVersionUID = -7704984829562494126L;

	
	/**
	 * 基础号码
	 */
	private List<Integer> baseList;
	
	/**
	 * 和值
	 */
	private List<Integer> sumList;
	
	public List<Integer> getBaseList() {
		return baseList;
	}


	public void setBaseList(List<Integer> baseList) {
		this.baseList = baseList;
	}


	public List<Integer> getSumList() {
		return sumList;
	}


	public void setSumList(List<Integer> sumList) {
		this.sumList = sumList;
	}


	
}
