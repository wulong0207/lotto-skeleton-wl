package com.hhly.skeleton.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hhly.skeleton.base.common.LotteryChildEnum.LotteryChild;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.constants.NUMConstants;
import com.hhly.skeleton.base.constants.SymbolConstants;

/**
 * 随机一注彩票
 *
 * @author huangchengfang1219
 * @date 2018年3月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class LottoRandomUtil {

	private static Map<Integer, Integer> defaultChildCodeMap = new HashMap<>();

	static {
		defaultChildCodeMap.put(LotteryEnum.Lottery.SSQ.getName(), LotteryChild.SSQ_PT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.QLC.getName(), LotteryChild.QLC_PT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.DLT.getName(), LotteryChild.DLT_PT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.PL5.getName(), LotteryChild.PL5_DIRECT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.PL3.getName(), LotteryChild.PL3_DIRECT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.F3D.getName(), LotteryChild.D_DIRECT.getValue());
		defaultChildCodeMap.put(LotteryEnum.Lottery.QXC.getName(), LotteryChild.QXC_PT.getValue());
	}
	
	/**
	 * 默认子玩法
	 * @param lotteryCode
	 * @return
	 */
	public static Integer getDefaultChildCode(Integer lotteryCode) {
		return defaultChildCodeMap.get(lotteryCode);
	}

	/**
	 * 随机一注号码，子玩法为普通直选玩法
	 * 
	 * @param lotteryCode
	 * @return
	 */
	public static String random(Integer lotteryCode) {
		return random(lotteryCode, defaultChildCodeMap.get(lotteryCode));
	}

	/**
	 * 随机一注号码
	 * 
	 * @param lotteryCode
	 * @param lotteryChildCode
	 * @return
	 */
	public static String random(Integer lotteryCode, Integer lotteryChildCode) {
		if (lotteryCode == null || lotteryChildCode == null) {
			throw new RuntimeException("lotteryCode和lotteryChildCode不能为空");
		}
		if (lotteryCode.equals(LotteryEnum.Lottery.SSQ.getName())) {
			if (lotteryChildCode.equals(LotteryChild.SSQ_PT.getValue())) {
				return randomSsqPt();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.QLC.getName())) {
			if (lotteryChildCode.equals(LotteryChild.QLC_PT.getValue())) {
				return randomQlcPt();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.DLT.getName())) {
			if (lotteryChildCode.equals(LotteryChild.DLT_PT.getValue())) {
				return randomDltPt();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.PL5.getName())) {
			if (lotteryChildCode.equals(LotteryChild.PL5_DIRECT.getValue())) {
				return randomPl5Zx();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.PL3.getName())) {
			if (lotteryChildCode.equals(LotteryChild.PL3_DIRECT.getValue())) {
				return randomPl3Zx();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.F3D.getName())) {
			if (lotteryChildCode.equals(LotteryChild.D_DIRECT.getValue())) {
				return randomF3dZx();
			}
		} else if (lotteryCode.equals(LotteryEnum.Lottery.QXC.getName())) {
			if (lotteryChildCode.equals(LotteryChild.QXC_PT.getValue())) {
				return randomQxcPt();
			}
		}
		throw new RuntimeException("未实现的彩种或子玩法:" + lotteryCode + ", " + lotteryChildCode);
	}

	/**
	 * 随机多注不重复号码
	 * 
	 * @param lotteryCode
	 * @param num
	 * @return
	 */
	public static List<String> randomMulti(Integer lotteryCode, int num) {
		return randomMulti(lotteryCode, defaultChildCodeMap.get(lotteryCode), num);
	}

	/**
	 * 随机多注不重复号码
	 * 
	 * @param lotteryCode
	 * @param lotteryChildCode
	 * @param num
	 * @return
	 */
	public static List<String> randomMulti(Integer lotteryCode, Integer lotteryChildCode, int num) {
		Set<String> lottos = new HashSet<String>();
		while (lottos.size() < num) {
			lottos.add(random(lotteryCode, lotteryChildCode));
		}
		return new ArrayList<String>(lottos);
	}

	/**
	 * 双色球普通投注
	 * 
	 * @return
	 */
	public static String randomSsqPt() {
		Integer[] redBalls = NumberUtil.genRamdomNum(NUMConstants.SSQ_RED_BASE_COUNT, false, NUMConstants.SSQ_RED_MIN,
				NUMConstants.SSQ_RED_MAX, null);
		Integer[] blueBalls = NumberUtil.genRamdomNum(NUMConstants.SSQ_BLUE_BASE_COUNT, false, NUMConstants.SSQ_BLUE_MIN,
				NUMConstants.SSQ_BLUE_MAX, null);
		String redBallStr = StringUtil.arrayToDelimitedString(ArrayUtil.numLeftAddZ(redBalls), SymbolConstants.COMMA);
		String blueBallStr = StringUtil.arrayToDelimitedString(ArrayUtil.numLeftAddZ(blueBalls), SymbolConstants.COMMA);
		return redBallStr + SymbolConstants.VERTICAL_BAR + blueBallStr;
	}

	/**
	 * 七乐彩普通投注
	 * 
	 * @return
	 */
	public static String randomQlcPt() {
		Integer[] nums = NumberUtil.genRamdomNum(NUMConstants.QLC_CHOOSE_7, false, NUMConstants.QLC_NUM_MIN, NUMConstants.QLC_NUM_MAX,
				null);
		return StringUtil.arrayToDelimitedString(ArrayUtil.numLeftAddZ(nums), SymbolConstants.COMMA);
	}

	/**
	 * 大乐透普通
	 * 
	 * @return
	 */
	public static String randomDltPt() {
		Integer[] redBalls = NumberUtil.genRamdomNum(NUMConstants.DLT_RED_BASE_COUNT, false, NUMConstants.DLT_RED_MIN,
				NUMConstants.DLT_RED_MAX, null);
		Integer[] blueBalls = NumberUtil.genRamdomNum(NUMConstants.DLT_BLUE_BASE_COUNT, false, NUMConstants.DLT_BLUE_MIN,
				NUMConstants.DLT_BLUE_MAX, null);
		String redBallStr = StringUtil.arrayToDelimitedString(ArrayUtil.numLeftAddZ(redBalls), SymbolConstants.COMMA);
		String blueBallStr = StringUtil.arrayToDelimitedString(ArrayUtil.numLeftAddZ(blueBalls), SymbolConstants.COMMA);
		// 方法内容，eg: 01,02,03,04,05|01,02
		return redBallStr + SymbolConstants.VERTICAL_BAR + blueBallStr;
	}

	/**
	 * 排列5直选
	 * 
	 * @return
	 */
	public static String randomPl5Zx() {
		Integer[] areaAll = NumberUtil.genRamdomNum(NUMConstants.PL5_CHOOSE_5, true, NUMConstants.PL5_NUM_MIN, NUMConstants.PL5_NUM_MAX,
				null);
		return StringUtil.arrayToDelimitedString(areaAll, SymbolConstants.VERTICAL_BAR);
	}

	/**
	 * 排列3直选投注
	 * 
	 * @return
	 */
	public static String randomPl3Zx() {
		Integer[] areaAll = NumberUtil.genRamdomNum(NUMConstants.PL3_CHOOSE_3, true, NUMConstants.PL5_NUM_MIN, NUMConstants.PL5_NUM_MAX,
				null);
		return StringUtil.arrayToDelimitedString(areaAll, SymbolConstants.VERTICAL_BAR);
	}

	/**
	 * 福彩3D直选投注
	 * 
	 * @return
	 */
	public static String randomF3dZx() {
		Integer[] areaAll = NumberUtil.genRamdomNum(NUMConstants.F3D_CHOOSE_3, true, NUMConstants.F3D_MIN_0, NUMConstants.F3D_MAX_9, null);
		return StringUtil.arrayToDelimitedString(areaAll, SymbolConstants.VERTICAL_BAR);
	}

	/**
	 * 七星彩普通投注
	 * 
	 * @return
	 */
	public static String randomQxcPt() {
		Integer[] areaAll = NumberUtil.genRamdomNum(7, true, 0, 9, null);
		return StringUtil.arrayToDelimitedString(areaAll, SymbolConstants.VERTICAL_BAR);
	}

}
