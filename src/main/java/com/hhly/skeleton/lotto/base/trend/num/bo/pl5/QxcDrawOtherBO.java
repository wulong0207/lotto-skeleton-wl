package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * @desc 七星彩开奖其它信息(eg:大小比、奇偶比等) 注：用于彩种首页最新开奖信息的补充信息
 * @author huangb
 * @date 2017年6月26日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class QxcDrawOtherBO extends DrawOtherBO {

	/**
	 * 开奖号奇偶比:1[7:0],2[6:1],3[5:2],4[4:3],5[3:4],6[2:5],7[1:6],8[0:7]
	 */
	private Integer oe;
	/**
	 * 开奖号大小比:1[7:0],2[6:1],3[5:2],4[4:3],5[3:4],6[2:5],7[1:6],8[0:7]
	 */
	private Integer bs;

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
