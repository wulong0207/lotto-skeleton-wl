package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.OmitEnum.Pl3OmitType;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.lotto.base.trend.bo.OmitOutBaseBO;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三 遗漏、冷热、概率，输出封装
 * @author huangb
 * @date 2017年6月29日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3OmitOutBO extends OmitOutBaseBO {

	private static final long serialVersionUID = 1317239826831896894L;

	public Pl3OmitOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param src
	 *            源数据
	 */
	public Pl3OmitOutBO(Integer flag, Pl3OmitType omitType, TrendBaseBO trend) {
		super.setFlag(flag);
		this.omitType = (null == omitType) ? null : omitType.getValue();
		/**
		 * 开奖号码遗漏次数/出现次数/出号概率的数字集合<br>
		 * 根据遗漏类型不同存在不同的结果集<br>
		 * 1.直选-普通，结果集大小：30(百/十/个位各10个)；<br>
		 * 2.直选-和值，结果集大小：28；<br>
		 * 3.组三-包号，结果集大小 ：10；<br>
		 * 4.组三-和值，结果集大小：26；<br>
		 * 5.组六-普通、胆拖，结果集大小：10；<br>
		 * 6.组六-和值，结果集大小：22；
		 */
		super.setOmits(genOmitsDigits(omitType, trend));
	}

	/**
	 * 遗漏类型 <br>
	 * 1：直选-普通遗漏；2：直选-和值遗漏；3：组三-包号遗漏；4：组三-和值遗漏；5：组六-普通、胆拖遗漏；6：组六-和值遗漏
	 */
	private Short omitType;

	public Short getOmitType() {
		return omitType;
	}

	public void setOmitType(Short omitType) {
		this.omitType = omitType;
	}

	/**
	 * @desc 按遗漏类型获取不同遗漏数据的数字集合
	 * @author huangb
	 * @date 2017年6月29日
	 * @param omitType
	 *            遗漏类型
	 * @param trend
	 *            遗漏数据(分区遗漏、不分区遗漏、和值遗漏等)
	 * @return 按遗漏类型获取不同遗漏数据的数字集合
	 */
	public List<Integer> genOmitsDigits(Pl3OmitType omitType, TrendBaseBO trend) {
		if (null == omitType || null == trend) {
			return new ArrayList<>();
		}
		List<Integer> target = new ArrayList<>();
		// 分遗漏类型
		switch (omitType) {
		case D_PT:
			// 分区遗漏;结果集大小：30(百/十/个位各10个)
			if (trend instanceof Pl3Code3TrendBO) {
				target = genCode3Digits((Pl3Code3TrendBO) trend);
			}
			break;
		case G3_BH_G6_PT_DT:
			// 不分区遗漏;结果集大小：10
			if (trend instanceof Pl3TrendBO) {
				target = genBaseDigits((Pl3TrendBO) trend);
			}
			break;
		case D_SUM:
			// 和值遗漏;结果集大小：28(0-27)
			if (trend instanceof Pl3SumTrendBO) {
				target = genSumDigits((Pl3SumTrendBO) trend, Constants.NUM_0, Constants.NUM_27);
			}
			break;
		case G3_SUM:
			// 和值遗漏;结果集大小：26(1-26)
			if (trend instanceof Pl3SumTrendBO) {
				target = genSumDigits((Pl3SumTrendBO) trend, Constants.NUM_1, Constants.NUM_26);
			}
			break;
		case G6_SUM:
			// 和值遗漏;结果集大小：22(3-24)
			if (trend instanceof Pl3SumTrendBO) {
				target = genSumDigits((Pl3SumTrendBO) trend, Constants.NUM_3, Constants.NUM_24);
			}
			break;
		default:
			break;
		}

		return target;
	}

	/**
	 * @desc 分位走势（分百、十、个位）的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param code3Trend
	 *            分位遗漏走势
	 * @return 分位走势（分百、十、个位）的数字集合
	 */
	public List<Integer> genCode3Digits(Pl3Code3TrendBO code3Trend) {
		if (null == code3Trend) {
			return new ArrayList<>();
		}
		List<Integer> bases = new ArrayList<>();
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(code3Trend, "b" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(code3Trend, "s" + i, Integer.class));
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			bases.add(ClassUtil.getField(code3Trend, "g" + i, Integer.class));
		}
		return bases;
	}

	/**
	 * @desc 封装和值走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param sumTrend
	 *            和值走势
	 * @param startIdx
	 *            开始索引
	 * @param endIdx
	 *            结束索引
	 * @return 封装和值走势的数字集合
	 */
	public List<Integer> genSumDigits(Pl3SumTrendBO sumTrend, int startIdx, int endIdx) {
		if (null == sumTrend) {
			return new ArrayList<>();
		}
		List<Integer> sums = new ArrayList<>();
		for (int i = startIdx; i <= endIdx; i++) {
			sums.add(ClassUtil.getField(sumTrend, "s" + i, Integer.class));
		}
		return sums;
	}

	/**
	 * @desc 基础走势(不分位走势)的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param baseTrend
	 *            基础(不分百、十、个位)遗漏走势
	 * @return 基础走势(不分位走势)的数字集合
	 */
	public List<Integer> genBaseDigits(Pl3TrendBO baseTrend) {
		if (null == baseTrend) {
			return new ArrayList<>();
		}
		List<Integer> merges = new ArrayList<>();
		for (int i = 0; i <= Constants.NUM_9; i++) {
			merges.add(ClassUtil.getField(baseTrend, "b" + i, Integer.class));
		}
		return merges;
	}
}
