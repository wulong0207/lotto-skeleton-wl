package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三近期走势(包括和值走势、号码基本走势(不分区走势)、号码分区走势、大小比走势、奇偶比走势、类型走势等)
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3RecentTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -3634338561745188532L;
	/**
	 * 和值
	 */
	private Integer sum;
	/**
	 * 和值走势
	 */
	private Pl3SumTrendBO sumTrend;
	/**
	 * 分位走势(包括百、十、个位的号码走势)
	 */
	private Pl3Code3TrendBO code3Trend;
	/**
	 * 基本走势（不分位走势）
	 */
	private Pl3TrendBO baseTrend;
	/**
	 * 大小比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer bs;
	/**
	 * 大小走势
	 */
	private Pl3BigSmallTrendBO bsTrend;
	/**
	 * 奇偶比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer oe;
	/**
	 * 奇偶比走势
	 */
	private Pl3OddEvenTrendBO oeTrend;
	/**
	 * 类型值 1-豹子 2-组三 3-组六
	 */
	private Integer type;
	/**
	 * 类型走势
	 */
	private Pl3TypeTrendBO typeTrend;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Pl3SumTrendBO getSumTrend() {
		return sumTrend;
	}

	public void setSumTrend(Pl3SumTrendBO sumTrend) {
		this.sumTrend = sumTrend;
	}

	public Pl3Code3TrendBO getCode3Trend() {
		return code3Trend;
	}

	public void setCode3Trend(Pl3Code3TrendBO code3Trend) {
		this.code3Trend = code3Trend;
	}

	public Pl3TrendBO getBaseTrend() {
		return baseTrend;
	}

	public void setBaseTrend(Pl3TrendBO baseTrend) {
		this.baseTrend = baseTrend;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public Pl3BigSmallTrendBO getBsTrend() {
		return bsTrend;
	}

	public void setBsTrend(Pl3BigSmallTrendBO bsTrend) {
		this.bsTrend = bsTrend;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}

	public Pl3OddEvenTrendBO getOeTrend() {
		return oeTrend;
	}

	public void setOeTrend(Pl3OddEvenTrendBO oeTrend) {
		this.oeTrend = oeTrend;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Pl3TypeTrendBO getTypeTrend() {
		return typeTrend;
	}

	public void setTypeTrend(Pl3TypeTrendBO typeTrend) {
		this.typeTrend = typeTrend;
	}
}
