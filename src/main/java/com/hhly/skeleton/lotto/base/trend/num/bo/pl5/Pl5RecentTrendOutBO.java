package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列五近期走势(包括号码基本走势、大小比走势、奇偶比走势等),输出封装
 * @author huangb
 * @date 2017年10月24日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5RecentTrendOutBO extends TrendBaseBO {

	private static final long serialVersionUID = 1754027435856087313L;

	public Pl5RecentTrendOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param src
	 *            源数据
	 */
	public Pl5RecentTrendOutBO(Pl5RecentTrendBO src) {
		super.setIssue(src.getIssue());
		super.setDrawCode(src.getDrawCode());
		this.sum = src.getSum();
		this.baseDigits = genBaseDigits(src.getBaseTrend());
		this.bs = src.getBs();
		this.bsDigits = genBsDigits(src.getBsTrend());
		this.oe = src.getOe();
		this.oeDigits = genOeDigits(src.getOeTrend());
	}

	/**
	 * 和值
	 */
	private Integer sum;
	/**
	 * 基础走势(分位走势)的数字集合
	 */
	private List<Integer> baseDigits;
	/**
	 * 大小比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer bs;
	/**
	 * 大小比走势的数字集合
	 */
	private List<Integer> bsDigits;
	/**
	 * 奇偶比值 1-[3:0],2-[2:1],3-[1:2],4-[0:3]
	 */
	private Integer oe;
	/**
	 * 奇偶比走势的数字集合
	 */
	private List<Integer> oeDigits;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public List<Integer> getBaseDigits() {
		return baseDigits;
	}

	public void setBaseDigits(List<Integer> baseDigits) {
		this.baseDigits = baseDigits;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public List<Integer> getBsDigits() {
		return bsDigits;
	}

	public void setBsDigits(List<Integer> bsDigits) {
		this.bsDigits = bsDigits;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}

	public List<Integer> getOeDigits() {
		return oeDigits;
	}

	public void setOeDigits(List<Integer> oeDigits) {
		this.oeDigits = oeDigits;
	}

	/**
	 * @desc 分位走势（分万、千、百、十、个位）的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param baseTrend
	 *            基本走势（分位遗漏走势）
	 * @return 分位走势（分万、千、百、十、个位）的数字集合
	 */
	public List<Integer> genBaseDigits(Pl5TrendBO baseTrend) {
		if (null == baseTrend) {
			return new ArrayList<>();
		}
		List<Integer> bases = new ArrayList<>();
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(baseTrend, "w" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(baseTrend, "q" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(baseTrend, "b" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(baseTrend, "s" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(baseTrend, "g" + i, Integer.class));
		}
		return bases;
	}

	/**
	 * @desc 封装大小比走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param bsTrend
	 *            排列三大小比遗漏走势
	 * @return 封装大小比走势的数字集合
	 */
	public List<Integer> genBsDigits(Pl5BigSmallTrendBO bsTrend) {
		if (null == bsTrend) {
			return new ArrayList<>();
		}
		List<Integer> bss = new ArrayList<>();
		bss.add(bsTrend.getBs50());
		bss.add(bsTrend.getBs41());
		bss.add(bsTrend.getBs32());
		bss.add(bsTrend.getBs23());
		bss.add(bsTrend.getBs14());
		bss.add(bsTrend.getBs05());
		return bss;
	}

	/**
	 * @desc 封装奇偶比走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param oeTrend
	 *            排列三奇偶比遗漏走势
	 * @return 封装奇偶比走势的数字集合
	 */
	public List<Integer> genOeDigits(Pl5OddEvenTrendBO oeTrend) {
		if (null == oeTrend) {
			return new ArrayList<>();
		}
		List<Integer> oes = new ArrayList<>();
		oes.add(oeTrend.getOe50());
		oes.add(oeTrend.getOe41());
		oes.add(oeTrend.getOe32());
		oes.add(oeTrend.getOe23());
		oes.add(oeTrend.getOe14());
		oes.add(oeTrend.getOe05());
		return oes;
	}

}
