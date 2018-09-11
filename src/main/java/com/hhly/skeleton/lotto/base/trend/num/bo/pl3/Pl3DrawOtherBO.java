package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * @desc 排列三开奖其它信息(eg:计算的和值、跨度、大小、奇偶等) 注：用于彩种首页最新开奖信息的补充信息
 * @author huangb
 * @date 2017年6月26日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3DrawOtherBO extends DrawOtherBO {

	private static final long serialVersionUID = -3903032010588126150L;
	/**
	 * 开奖号：和值
	 */
	private Integer sum;
	/**
	 * 开奖号：跨度
	 */
	private Integer span;
	/**
	 * 开奖号：奇偶比；eg:1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer oe;
	/**
	 * 开奖号：大小比；eg:1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer bs;
	/**
	 * 开奖号：类型；eg:排列三开奖号类型（1-豹子;2-组三;3-组六）
	 */
	private Integer type;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getSpan() {
		return span;
	}

	public void setSpan(Integer span) {
		this.span = span;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
