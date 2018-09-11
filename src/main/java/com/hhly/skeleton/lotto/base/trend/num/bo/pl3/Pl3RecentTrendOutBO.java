package com.hhly.skeleton.lotto.base.trend.num.bo.pl3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 排列三近期走势(包括和值走势、号码基本走势、号码不分区走势、大小比走势、奇偶比走势、类型走势等),输出封装
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class Pl3RecentTrendOutBO extends TrendBaseBO {


	private static final long serialVersionUID = -7633078833214634638L;

	public Pl3RecentTrendOutBO() {
	}

	/**
	 * 构造 封装源数据并输出
	 * 
	 * @param src
	 *            源数据
	 */
	public Pl3RecentTrendOutBO(Pl3RecentTrendBO src) {
		super.setIssue(src.getIssue());
		super.setDrawCode(src.getDrawCode());
		this.sum = src.getSum();
		this.sumDigits = genSumDigits(src.getSumTrend());
		this.code3Digits = genCode3Digits(src.getCode3Trend());
		this.baseDigits = genBaseDigits(src.getBaseTrend());
		this.hitTimes = genHitTimes(src.getDrawCode());
		this.bs = src.getBs();
		this.bsDigits = genBsDigits(src.getBsTrend());
		this.oe = src.getOe();
		this.oeDigits = genOeDigits(src.getOeTrend());
		this.type = src.getType();
		this.typeDigits = genTypeDigits(src.getTypeTrend());
	}

	/**
	 * 试机号
	 */
	private String drawCodeTest;
	/**
	 * 和值
	 */
	private Integer sum;
	/**
	 * 和值走势的数字集合
	 */
	private List<Integer> sumDigits;
	/**
	 * 分位走势(包括百、十、个位的号码走势)的数字集合
	 */
	private List<Integer> code3Digits;
	/**
	 * 基础走势(不分位走势)的数字集合
	 */
	private List<Integer> baseDigits;
	/**
	 * 基础走势中，开奖号码出现次数
	 */
	private List<Integer> hitTimes;
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
	/**
	 * 类型值 1-豹子 2-组三 3-组六
	 */
	private Integer type;
	/**
	 * 类型走势的数字集合
	 */
	private List<Integer> typeDigits;

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

	public List<Integer> getSumDigits() {
		return sumDigits;
	}

	public void setSumDigits(List<Integer> sumDigits) {
		this.sumDigits = sumDigits;
	}

	public List<Integer> getCode3Digits() {
		return code3Digits;
	}

	public void setCode3Digits(List<Integer> code3Digits) {
		this.code3Digits = code3Digits;
	}

	public List<Integer> getBaseDigits() {
		return baseDigits;
	}

	public void setBaseDigits(List<Integer> baseDigits) {
		this.baseDigits = baseDigits;
	}

	public List<Integer> getHitTimes() {
		return hitTimes;
	}

	public void setHitTimes(List<Integer> hitTimes) {
		this.hitTimes = hitTimes;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<Integer> getTypeDigits() {
		return typeDigits;
	}

	public void setTypeDigits(List<Integer> typeDigits) {
		this.typeDigits = typeDigits;
	}

	/**
	 * @desc 封装和值走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param sumTrend
	 *            和值走势
	 * @return 封装和值走势的数字集合
	 */
	public List<Integer> genSumDigits(Pl3SumTrendBO sumTrend) {
		if (null == sumTrend) {
			return new ArrayList<>();
		}
		List<Integer> sums = new ArrayList<>();
		for (int i = 0; i <= Constants.NUM_27; i++) {
			sums.add(ClassUtil.getField(sumTrend, "s" + i, Integer.class));
		}
		return sums;
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

	/**
	 * @desc 基础走势时开奖号码出现次数的数字集合（主要是记录组三和豹子这种数字出现多次的）
	 * @author huangb
	 * @date 2017年6月27日
	 * @param drawCode
	 *            开奖号码
	 * @return 基础走势时开奖号码出现次数的数字集合（主要是记录组三和豹子这种数字出现多次的）
	 */
	public List<Integer> genHitTimes(String drawCode) {
		if (ObjectUtil.isBlank(drawCode)) {
			return new ArrayList<>();
		}
		List<Integer> merges = new ArrayList<>();
		// 其实根据"|"就可以了
		List<Integer> drawCodes = StringUtil.toIntList(drawCode,
				SymbolConstants.COMMA + SymbolConstants.NUMBER_SIGN + SymbolConstants.VERTICAL_BAR);
		Map<Integer, Integer> drawCodeMap = new HashMap<Integer, Integer>();
		for (Integer tmp : drawCodes) {
			if (drawCodeMap.get(tmp) == null) {
				drawCodeMap.put(tmp, Constants.NUM_1);
				continue;
			}
			drawCodeMap.put(tmp, drawCodeMap.get(tmp) + Constants.NUM_1);
		}
		for (int i = 0; i <= Constants.NUM_9; i++) {
			merges.add(drawCodeMap.containsKey(i) ? drawCodeMap.get(i) : Constants.NUM_0);
		}
		return merges;
	}

	/**
	 * @desc 封装大小比走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param bsTrend
	 *            排列三大小比遗漏走势
	 * @return 封装大小比走势的数字集合
	 */
	public List<Integer> genBsDigits(Pl3BigSmallTrendBO bsTrend) {
		if (null == bsTrend) {
			return new ArrayList<>();
		}
		List<Integer> bss = new ArrayList<>();
		bss.add(bsTrend.getBs30());
		bss.add(bsTrend.getBs21());
		bss.add(bsTrend.getBs12());
		bss.add(bsTrend.getBs03());
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
	public List<Integer> genOeDigits(Pl3OddEvenTrendBO oeTrend) {
		if (null == oeTrend) {
			return new ArrayList<>();
		}
		List<Integer> oes = new ArrayList<>();
		oes.add(oeTrend.getOe30());
		oes.add(oeTrend.getOe21());
		oes.add(oeTrend.getOe12());
		oes.add(oeTrend.getOe03());
		return oes;
	}

	/**
	 * @desc 封装类型走势的数字集合
	 * @author huangb
	 * @date 2017年6月27日
	 * @param typeTrend
	 *            排列三号码类型遗漏走势
	 * @return 封装类型走势的数字集合
	 */
	public List<Integer> genTypeDigits(Pl3TypeTrendBO typeTrend) {
		if (null == typeTrend) {
			return new ArrayList<>();
		}
		List<Integer> types = new ArrayList<>();
		types.add(typeTrend.getType0());
		types.add(typeTrend.getType3());
		types.add(typeTrend.getType6());
		return types;
	}
}
