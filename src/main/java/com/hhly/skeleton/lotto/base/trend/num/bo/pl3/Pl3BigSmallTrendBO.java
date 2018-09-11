package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三大小比遗漏走势
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3BigSmallTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -4089709714681643424L;
	/** 大小比3:0的遗漏 */
	private Integer bs30;
	/** 大小比2:1的遗漏 */
	private Integer bs21;
	/** 大小比1:2的遗漏 */
	private Integer bs12;
	/** 大小比0:3的遗漏 */
	private Integer bs03;

	public Integer getBs30() {
		return bs30;
	}

	public void setBs30(Integer bs30) {
		this.bs30 = bs30;
	}

	public Integer getBs21() {
		return bs21;
	}

	public void setBs21(Integer bs21) {
		this.bs21 = bs21;
	}

	public Integer getBs12() {
		return bs12;
	}

	public void setBs12(Integer bs12) {
		this.bs12 = bs12;
	}

	public Integer getBs03() {
		return bs03;
	}

	public void setBs03(Integer bs03) {
		this.bs03 = bs03;
	}

}
