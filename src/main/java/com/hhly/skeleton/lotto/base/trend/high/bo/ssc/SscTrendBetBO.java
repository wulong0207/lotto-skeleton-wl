package com.hhly.skeleton.lotto.base.trend.high.bo.ssc;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;


@SuppressWarnings("serial")
public class SscTrendBetBO extends TrendBaseBO {
	/**
	 * 分位走势的数字集合
	 */
	private List<Integer> code5Digits;
	/**
	 * 基础走势(不分位走势)的数字集合
	 */
	private List<Integer> baseDigits;
	/**
	 * 基础走势中，开奖号码出现次数
	 */
	private List<Integer> hitTimes;
	/**
	 * 大小单双
	 */
	private Integer[] bsoe;

	/**
	 * 类型值 1-豹子 2-组三 3-组六
	 */
	private Integer[] typeDigits;

	public List<Integer> getCode5Digits() {
		return code5Digits;
	}

	public void setCode5Digits(List<Integer> code5Digits) {
		this.code5Digits = code5Digits;
	}

	public List<Integer> getBaseDigits() {
		return baseDigits;
	}

	public void setBaseDigits(List<Integer> baseDigits) {
		this.baseDigits = baseDigits;
	}

	public List<Integer> getHitTimes() {
		return hitTimes;
	}

	public void setHitTimes(List<Integer> hitTimes) {
		this.hitTimes = hitTimes;
	}

	public Integer[] getBsoe() {
		return bsoe;
	}

	public void setBsoe(Integer[] bsoe) {
		this.bsoe = bsoe;
	}

	public Integer[] getTypeDigits() {
		return typeDigits;
	}

	public void setTypeDigits(Integer[] typeDigits) {
		this.typeDigits = typeDigits;
	}


	

}
