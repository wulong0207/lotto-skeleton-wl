package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * @desc 排列五开奖其它信息(eg:计算的和值、大小比、奇偶比等) 注：用于彩种首页最新开奖信息的补充信息
 * @author huangb
 * @date 2017年6月26日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5DrawOtherBO extends DrawOtherBO {

	private static final long serialVersionUID = -9129872402989400026L;
	/**
	 * 开奖号：和值
	 */
	private Integer sum;
	/**
	 * 开奖号：奇偶比；eg:1-[5:0],2-[4:1],3-[3:2],4-[2:3],5-[1:4],6-[0:5]
	 */
	private Integer oe;
	/**
	 * 开奖号：大小比；eg:1-[5:0],2-[4:1],3-[3:2],4-[2:3],5-[1:4],6-[0:5]
	 */
	private Integer bs;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
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

}
