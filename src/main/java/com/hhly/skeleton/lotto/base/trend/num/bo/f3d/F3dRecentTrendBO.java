package com.hhly.skeleton.lotto.base.trend.num.bo.f3d;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 福彩3D近期走势(包括和值走势、号码基本走势(不分区走势)、号码分区走势、大小比走势、奇偶比走势、类型走势等)
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class F3dRecentTrendBO extends TrendBaseBO {

	private static final long serialVersionUID = -778852224339454835L;
	/**
	 * 试机号
	 */
	private String drawCodeTest;
	/**
	 * 和值
	 */
	private Integer sum;
	/**
	 * 和值走势
	 */
	private F3dSumTrendBO sumTrend;
	/**
	 * 分位走势(包括百、十、个位的号码走势)
	 */
	private F3dCode3TrendBO code3Trend;
	/**
	 * 基本走势（不分位走势）
	 */
	private F3dTrendBO baseTrend;
	/**
	 * 大小比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer bs;
	/**
	 * 大小走势
	 */
	private F3dBigSmallTrendBO bsTrend;
	/**
	 * 奇偶比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer oe;
	/**
	 * 奇偶比走势
	 */
	private F3dOddEvenTrendBO oeTrend;
	/**
	 * 类型值 1-豹子 2-组三 3-组六
	 */
	private Integer type;
	/**
	 * 类型走势
	 */
	private F3dTypeTrendBO typeTrend;

	public String getDrawCodeTest() {
		return drawCodeTest;
	}

	public void setDrawCodeTest(String drawCodeTest) {
		this.drawCodeTest = drawCodeTest;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public F3dSumTrendBO getSumTrend() {
		return sumTrend;
	}

	public void setSumTrend(F3dSumTrendBO sumTrend) {
		this.sumTrend = sumTrend;
	}

	public F3dCode3TrendBO getCode3Trend() {
		return code3Trend;
	}

	public void setCode3Trend(F3dCode3TrendBO code3Trend) {
		this.code3Trend = code3Trend;
	}

	public F3dTrendBO getBaseTrend() {
		return baseTrend;
	}

	public void setBaseTrend(F3dTrendBO baseTrend) {
		this.baseTrend = baseTrend;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public F3dBigSmallTrendBO getBsTrend() {
		return bsTrend;
	}

	public void setBsTrend(F3dBigSmallTrendBO bsTrend) {
		this.bsTrend = bsTrend;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}

	public F3dOddEvenTrendBO getOeTrend() {
		return oeTrend;
	}

	public void setOeTrend(F3dOddEvenTrendBO oeTrend) {
		this.oeTrend = oeTrend;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public F3dTypeTrendBO getTypeTrend() {
		return typeTrend;
	}

	public void setTypeTrend(F3dTypeTrendBO typeTrend) {
		this.typeTrend = typeTrend;
	}
}
