package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三号码类型遗漏走势
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3TypeTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -7256943291176007596L;
	/** 豹子的遗漏 */
	private Integer type0;
	/** 组三的遗漏 */
	private Integer type3;
	/** 组六的遗漏 */
	private Integer type6;

	public Integer getType0() {
		return type0;
	}

	public void setType0(Integer type0) {
		this.type0 = type0;
	}

	public Integer getType3() {
		return type3;
	}

	public void setType3(Integer type3) {
		this.type3 = type3;
	}

	public Integer getType6() {
		return type6;
	}

	public void setType6(Integer type6) {
		this.type6 = type6;
	}

}
