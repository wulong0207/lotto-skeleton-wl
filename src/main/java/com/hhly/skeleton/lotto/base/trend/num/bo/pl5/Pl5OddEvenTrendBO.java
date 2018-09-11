package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列五奇偶比遗漏走势
 * @author huangb
 * @date 2017年10月24日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5OddEvenTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -7601564146909299350L;
	/** 奇偶比5:0的遗漏 */
	private Integer oe50;
	/** 奇偶比4:1的遗漏 */
	private Integer oe41;
	/** 奇偶比3:2的遗漏 */
	private Integer oe32;
	/** 奇偶比2:3的遗漏 */
	private Integer oe23;
	/** 奇偶比1:4的遗漏 */
	private Integer oe14;
	/** 奇偶比0:5的遗漏 */
	private Integer oe05;

	public Integer getOe50() {
		return oe50;
	}

	public void setOe50(Integer oe50) {
		this.oe50 = oe50;
	}

	public Integer getOe41() {
		return oe41;
	}

	public void setOe41(Integer oe41) {
		this.oe41 = oe41;
	}

	public Integer getOe32() {
		return oe32;
	}

	public void setOe32(Integer oe32) {
		this.oe32 = oe32;
	}

	public Integer getOe23() {
		return oe23;
	}

	public void setOe23(Integer oe23) {
		this.oe23 = oe23;
	}

	public Integer getOe14() {
		return oe14;
	}

	public void setOe14(Integer oe14) {
		this.oe14 = oe14;
	}

	public Integer getOe05() {
		return oe05;
	}

	public void setOe05(Integer oe05) {
		this.oe05 = oe05;
	}

}
