package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列五近期走势(包括号码基本走势(分区走势)、大小比走势、奇偶比走势等)
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5RecentTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -680330361472934238L;
	/**
	 * 基本走势（万-千-百-十-个 分位走势）
	 */
	private Pl5TrendBO baseTrend;
	/**
	 * 和值
	 */
	private Integer sum;
	/**
	 * 大小比值:1[5:0],2[4:1],3[3:2],4[2:3],5[1:4],6[0:5]
	 */
	private Integer bs;
	/**
	 * 大小比走势
	 */
	private Pl5BigSmallTrendBO bsTrend;
	/**
	 * 奇偶比值:1[5:0],2[4:1],3[3:2],4[2:3],5[1:4],6[0:5]
	 */
	private Integer oe;
	/**
	 * 奇偶比走势
	 */
	private Pl5OddEvenTrendBO oeTrend;

	public Pl5TrendBO getBaseTrend() {
		return baseTrend;
	}

	public void setBaseTrend(Pl5TrendBO baseTrend) {
		this.baseTrend = baseTrend;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public Pl5BigSmallTrendBO getBsTrend() {
		return bsTrend;
	}

	public void setBsTrend(Pl5BigSmallTrendBO bsTrend) {
		this.bsTrend = bsTrend;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}

	public Pl5OddEvenTrendBO getOeTrend() {
		return oeTrend;
	}

	public void setOeTrend(Pl5OddEvenTrendBO oeTrend) {
		this.oeTrend = oeTrend;
	}

}
