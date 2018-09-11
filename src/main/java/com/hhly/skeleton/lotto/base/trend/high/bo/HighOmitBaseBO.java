package com.hhly.skeleton.lotto.base.trend.high.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hhly.skeleton.base.vo.BaseVO;


@SuppressWarnings("serial")
@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class HighOmitBaseBO extends BaseVO{

	/**
	 * 期号
	 */
	private String issue;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	
	/**
	 * 子玩法：不同彩种取值不同
	 * 十一选五：1任选;2.万位;3:千位;4:百位;5:前二组选;6:前三组选
	 */
	private String subPlay;
	
	/**
	 * 遗漏类型
	 * 1:冷热数据;2:当前遗漏;3:最大遗漏;4:上次遗漏
	 */
	private String omitType;
	
	/**
	 * 历史彩期
	 */
	private List<HighOmitBaseBO> history;

	
	public HighOmitBaseBO() {
	}

	public HighOmitBaseBO(String subPlay, List<HighOmitBaseBO> history) {
		this.subPlay = subPlay;
		this.history = history;
	}

	public String getSubPlay() {
		return subPlay;
	}

	public void setSubPlay(String subPlay) {
		this.subPlay = subPlay;
	}

	public String getOmitType() {
		return omitType;
	}

	public void setOmitType(String omitType) {
		this.omitType = omitType;
	}

	public List<HighOmitBaseBO> getHistory() {
		return history;
	}

	public void setHistory(List<HighOmitBaseBO> history) {
		this.history = history;
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
}
