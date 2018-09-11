package com.hhly.skeleton.lotto.base.trend.vo.high;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class HighOmitBetVO extends BaseVO {

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 多个子玩法 十一选五：1任选;2.万位;3:千位;4:百位;5:前二组选;6:前三组选
	 */
	private List<String> fatypes;

	private List<String> sontypes;

	/**
	 * 期数，默认全部
	 */
	private Integer qryCount;

	private boolean desc;
	private String sortField;
	private String ylCode;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public List<String> getFatypes() {
		return fatypes;
	}

	public void setFatypes(List<String> fatypes) {
		this.fatypes = fatypes;
	}

	public List<String> getSontypes() {
		return sontypes;
	}

	public void setSontypes(List<String> sontypes) {
		this.sontypes = sontypes;
	}

	public Integer getQryCount() {
		return qryCount;
	}

	public void setQryCount(Integer qryCount) {
		this.qryCount = qryCount;
	}

	public boolean isDesc() {
		return desc;
	}

	public void setDesc(boolean desc) {
		this.desc = desc;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getYlCode() {
		return ylCode;
	}

	public void setYlCode(String ylCode) {
		this.ylCode = ylCode;
	}

}
