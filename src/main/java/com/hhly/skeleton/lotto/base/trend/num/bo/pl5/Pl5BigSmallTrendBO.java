package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列五大小比遗漏走势
 * @author huangb
 * @date 2017年10月24日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5BigSmallTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -372320682790129207L;
	/** 大小比5:0的遗漏 */
	private Integer bs50;
	/** 大小比4:1的遗漏 */
	private Integer bs41;
	/** 大小比3:2的遗漏 */
	private Integer bs32;
	/** 大小比2:3的遗漏 */
	private Integer bs23;
	/** 大小比1:4的遗漏 */
	private Integer bs14;
	/** 大小比0:5的遗漏 */
	private Integer bs05;

	public Integer getBs50() {
		return bs50;
	}

	public void setBs50(Integer bs50) {
		this.bs50 = bs50;
	}

	public Integer getBs41() {
		return bs41;
	}

	public void setBs41(Integer bs41) {
		this.bs41 = bs41;
	}

	public Integer getBs32() {
		return bs32;
	}

	public void setBs32(Integer bs32) {
		this.bs32 = bs32;
	}

	public Integer getBs23() {
		return bs23;
	}

	public void setBs23(Integer bs23) {
		this.bs23 = bs23;
	}

	public Integer getBs14() {
		return bs14;
	}

	public void setBs14(Integer bs14) {
		this.bs14 = bs14;
	}

	public Integer getBs05() {
		return bs05;
	}

	public void setBs05(Integer bs05) {
		this.bs05 = bs05;
	}

}
