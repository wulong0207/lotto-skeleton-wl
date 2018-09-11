package com.hhly.skeleton.lotto.base.trend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 各彩种遗漏走势基础类()
 * @author huangb
 * @date 2017年3月8日
 * @company 益彩网络
 * @version v1.0
 */
public class TrendBaseBO extends BaseBO {

	private static final long serialVersionUID = -7704984829562494126L;
	/**
	 * 期号
	 */
	private String issue;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	
	/**
	 * 查询标识
	 */
	private Integer flag;

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

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}
