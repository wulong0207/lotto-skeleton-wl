package com.hhly.skeleton.lotto.base.trend.num.bo.qlc;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 七乐彩近期走势(号码基本走势),输出封装
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class QlcRecentTrendOutBO extends TrendBaseBO {

	private static final long serialVersionUID = 8230976473693150472L;

	public QlcRecentTrendOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param src
	 *            源数据
	 */
	public QlcRecentTrendOutBO(TrendBaseBO trend) {
		super.setIssue(trend.getIssue());
		super.setDrawCode(trend.getDrawCode());
		this.baseDigits = genBaseDigits(trend);
	}

	/**
	 * 基础走势的数字集合
	 */
	private List<Integer> baseDigits;

	public List<Integer> getBaseDigits() {
		return baseDigits;
	}

	public void setBaseDigits(List<Integer> baseDigits) {
		this.baseDigits = baseDigits;
	}

	/**
	 * @desc 基础走势的数字集合
	 * @author huangb
	 * @date 2017年6月29日
	 * @param baseTrend
	 *            基础走势走势(号码走势)
	 * @return 基础走势的数字集合
	 */
	private List<Integer> genBaseDigits(TrendBaseBO baseTrend) {
		if (null == baseTrend || ObjectUtil.isBlank(baseTrend.getDrawCode())) { // 开奖号码若为空，则基础走势也是空的
			return new ArrayList<>();
		}
		List<Integer> target = new ArrayList<>();
		// 基础走势(号码走势);结果集大小：30
		if (baseTrend instanceof QlcTrendBO) {
			target = genBaseDigits((QlcTrendBO) baseTrend);
		}

		return target;
	}

	/**
	 * @desc 基础走势(号码走势)的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param baseTrend
	 *            基础走势数据
	 * @return 基础走势(号码走势)的数字集合
	 */
	private List<Integer> genBaseDigits(QlcTrendBO baseTrend) {
		if (null == baseTrend) {
			return new ArrayList<>();
		}
		List<Integer> bases = new ArrayList<>();
		bases.addAll(genBaseDigits(baseTrend, "b"));
		return bases;
	}

	/**
	 * @desc 基础走势(号码走势)的数字集合
	 * @author huangb
	 * @date 2017年7月14日
	 * @param baseTrend
	 *            基础走势数据
	 * @param preField
	 *            字段名前缀
	 * @return 基础走势(号码走势)的数字集合
	 */
	private List<Integer> genBaseDigits(QlcTrendBO baseTrend, String preField) {
		List<Integer> tmp = new ArrayList<>();
		String sufField = ""; // 字段后缀
		for (int i = 1; i <= Constants.NUM_30; i++) {
			sufField = (i >= 1 && i <= 9) ? "0" + i : String.valueOf(i); // 1~9的数字补0
			tmp.add(ClassUtil.getField(baseTrend, preField + sufField, Integer.class));
		}
		return tmp;
	}
}
