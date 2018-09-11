package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

/**
 * @desc 数组展示  基本走势
 * @author huangb
 * @date 2017年3月8日
 * @company 益彩网络
 * @version v1.0
 */
public class TrendBaseArrayBO extends TrendBaseBO {

	private static final long serialVersionUID = -7704984829562494126L;

	/**
	 * 红球
	 */
	private List<Integer> redList;
	
	/**
	 * 蓝球
	 */
	private List<Integer> blueList;

	public List<Integer> getRedList() {
		return redList;
	}

	public void setRedList(List<Integer> redList) {
		this.redList = redList;
	}

	public List<Integer> getBlueList() {
		return blueList;
	}

	public void setBlueList(List<Integer> blueList) {
		this.blueList = blueList;
	}



}
