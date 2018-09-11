package com.hhly.skeleton.lotto.base.trend.num.bo.qlc;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.lotto.base.trend.bo.OmitOutBaseBO;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 七乐彩 遗漏、冷热、概率，输出封装
 * @author huangb
 * @date 2017年6月29日
 * @company 益彩网络
 * @version v1.0
 */
public class QlcOmitOutBO extends OmitOutBaseBO { 


	private static final long serialVersionUID = 398943687039612521L;

	public QlcOmitOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param flag
	 *            标识
	 * @param trend
	 *            走势数据
	 */
	public QlcOmitOutBO(Integer flag, TrendBaseBO trend) {
		super.setFlag(flag);
		// 基础遗漏(号码遗漏);结果集大小：30
		super.setOmits(genOmitsDigits(trend));
	}

	/**
	 * @desc 获取遗漏数据的数字集合
	 * @author huangb
	 * @date 2017年6月29日
	 * @param trend
	 *            遗漏数据(号码遗漏)
	 * @return 获取遗漏数据的数字集合
	 */
	private List<Integer> genOmitsDigits(TrendBaseBO trend) {
		if (null == trend) {
			return new ArrayList<>();
		}
		List<Integer> target = new ArrayList<>();
		// 基础遗漏(号码遗漏);结果集大小：30
		if (trend instanceof QlcTrendBO) {
			target = genBaseDigits((QlcTrendBO) trend);
		}

		return target;
	}

	/**
	 * @desc 基础遗漏(号码遗漏)的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param baseTrend
	 *            基础遗漏数据
	 * @return 基础遗漏(号码遗漏)的数字集合
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
	 * @desc 基础遗漏(号码遗漏)的数字集合
	 * @author huangb
	 * @date 2017年7月14日
	 * @param baseTrend
	 *            基础遗漏数据
	 * @param preField
	 *            字段名前缀
	 * @return 基础遗漏(号码遗漏)的数字集合
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
