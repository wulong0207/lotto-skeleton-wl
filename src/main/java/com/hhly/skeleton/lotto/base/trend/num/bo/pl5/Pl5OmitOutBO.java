package com.hhly.skeleton.lotto.base.trend.num.bo.pl5;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.lotto.base.trend.bo.OmitOutBaseBO;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列五 遗漏、冷热、概率，输出封装
 * @author huangb
 * @date 2017年6月29日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl5OmitOutBO extends OmitOutBaseBO {

	private static final long serialVersionUID = -3041010456417956389L;

	public Pl5OmitOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param flag
	 *            标识
	 * @param trend
	 *            走势数据
	 */
	public Pl5OmitOutBO(Integer flag, TrendBaseBO trend) {
		super.setFlag(flag);
		// 基础遗漏(万、千、百、十、个位遗漏);结果集大小：50(万、千、百、十、个位各10个)
		super.setOmits(genOmitsDigits(trend));
	}

	/**
	 * @desc 获取遗漏数据的数字集合
	 * @author huangb
	 * @date 2017年6月29日
	 * @param trend
	 *            遗漏数据(万、千、百、十、个位遗漏)
	 * @return 获取遗漏数据的数字集合
	 */
	private List<Integer> genOmitsDigits(TrendBaseBO trend) {
		if (null == trend) {
			return new ArrayList<>();
		}
		List<Integer> target = new ArrayList<>();
		// 基础遗漏(万、千、百、十、个位遗漏);结果集大小：50(万、千、百、十、个位各10个)
		if (trend instanceof Pl5TrendBO) {
			target = genBaseDigits((Pl5TrendBO) trend);
		}

		return target;
	}

	/**
	 * @desc 基础遗漏(万、千、百、十、个位遗漏)的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param baseTrend
	 *            基础遗漏数据
	 * @return 基础遗漏(万、千、百、十、个位遗漏)的数字集合
	 */
	private List<Integer> genBaseDigits(Pl5TrendBO baseTrend) {
		if (null == baseTrend) {
			return new ArrayList<>();
		}
		List<Integer> bases = new ArrayList<>();
		bases.addAll(genBaseDigits(baseTrend, "w"));
		bases.addAll(genBaseDigits(baseTrend, "q"));
		bases.addAll(genBaseDigits(baseTrend, "b"));
		bases.addAll(genBaseDigits(baseTrend, "s"));
		bases.addAll(genBaseDigits(baseTrend, "g"));
		return bases;
	}

	/**
	 * @desc 基础遗漏(万、千、百、十、个位遗漏)的数字集合
	 * @author huangb
	 * @date 2017年7月14日
	 * @param baseTrend
	 *            基础遗漏数据
	 * @param preField
	 *            字段名前缀
	 * @return 基础遗漏(万、千、百、十、个位遗漏)的数字集合
	 */
	private List<Integer> genBaseDigits(Pl5TrendBO baseTrend, String preField) {
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0; i <= Constants.NUM_9; i++) {
			tmp.add(ClassUtil.getField(baseTrend, preField + i, Integer.class));
		}
		return tmp;
	}
}
