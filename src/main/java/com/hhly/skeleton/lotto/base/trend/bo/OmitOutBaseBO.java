package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 遗漏、冷热、概率，输出基础类
 * @author huangb
 * @date 2017年6月29日
 * @company 益彩网络
 * @version v1.0
 */
public class OmitOutBaseBO extends BaseBO {

	private static final long serialVersionUID = 6847619106301865895L;

	/**
	 * 期号
	 */
	private String issue;
	/**
	 * 开奖号码遗漏次数/出现次数/出号概率的数字集合<br>
	 */
	private List<Integer> omits;
	/**
	 * 标识 1：查遗漏；2：查冷热；3：查概率
	 */
	private Integer flag;

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public List<Integer> getOmits() {
		return omits;
	}

	public void setOmits(List<Integer> omits) {
		this.omits = omits;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}
