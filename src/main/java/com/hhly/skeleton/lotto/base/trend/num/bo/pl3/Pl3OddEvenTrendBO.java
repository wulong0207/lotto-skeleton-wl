package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三奇偶比遗漏走势
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3OddEvenTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -4576987987515543939L;
	/** 奇偶比3:0的遗漏 */
	private Integer oe30;
	/** 奇偶比2:1的遗漏 */
	private Integer oe21;
	/** 奇偶比1:2的遗漏 */
	private Integer oe12;
	/** 奇偶比0:3的遗漏 */
	private Integer oe03;

	public Integer getOe30() {
		return oe30;
	}

	public void setOe30(Integer oe30) {
		this.oe30 = oe30;
	}

	public Integer getOe21() {
		return oe21;
	}

	public void setOe21(Integer oe21) {
		this.oe21 = oe21;
	}

	public Integer getOe12() {
		return oe12;
	}

	public void setOe12(Integer oe12) {
		this.oe12 = oe12;
	}

	public Integer getOe03() {
		return oe03;
	}

	public void setOe03(Integer oe03) {
		this.oe03 = oe03;
	}

}
