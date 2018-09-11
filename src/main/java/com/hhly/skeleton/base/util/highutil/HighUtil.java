package com.hhly.skeleton.base.util.highutil;

import java.util.EnumSet;
import java.util.Objects;

import com.hhly.skeleton.base.common.LotteryChildEnum.LotteryChild;

public class HighUtil {

	/**
	 * @desc   是否为山东十一选五的子玩法
	 * @author Tony Wang
	 * @create 2017年3月30日
	 * @param lotteryChildCode
	 * @return 
	 */
	public static boolean isSd11x5(Integer lotteryChildCode) {
		return isLotteryChild(getSd11x5Child(), lotteryChildCode);
	}
	
	/**
	 * @desc   是否为广东十一选五的子玩法
	 * @author Tony Wang
	 * @create 2017年7月19日
	 * @param lotteryChildCode
	 * @return 
	 */
	public static boolean isD11x5(Integer lotteryChildCode) {
		return isLotteryChild(getD11x5Child(), lotteryChildCode);
	}
	
	/**
	 * @desc   是否为江西十一选五的子玩法
	 * @author Tony Wang
	 * @create 2017年7月19日
	 * @param lotteryChildCode
	 * @return 
	 */
	public static boolean isJX11x5(Integer lotteryChildCode) {
		return isLotteryChild(getJX11x5Child(), lotteryChildCode);
	}
	/**
	 * 
	 * @desc 是否为广西11十一选5的子玩法
	 * @create 2017年12月13日
	 * @param lotteryChildCode
	 * @return boolean
	 */
	public static boolean isGX11x5(Integer lotteryChildCode) {
		return isLotteryChild(getGX11x5Child(), lotteryChildCode);
	}
	
	/**
	 * @desc   是否为新疆十一选五的子玩法
	 * @author Tony Wang
	 * @create 2017年7月19日
	 * @param lotteryChildCode
	 * @return 
	 */
	public static boolean isXJ11x5(Integer lotteryChildCode) {
		return isLotteryChild(getXJ11x5Child(), lotteryChildCode);
	}

	/**
	 * @desc   是否为江苏快3的子玩法
	 * @author Tony Wang
	 * @create 2017年3月30日
	 * @param lotteryChildCode
	 * @return 
	 */
	public static boolean isJsk3(Integer lotteryChildCode) {
		return isLotteryChild(getJsk3Child(), lotteryChildCode);
	}
	
	//是否是江西快3的子玩法
	public static boolean isJxk3(Integer lotteryChildCode) {
		return isLotteryChild(getJxk3Child(), lotteryChildCode);
	}
	
	public static boolean isCqssc(Integer lotteryChildCode) {
		return isLotteryChild(getCqsscChild(), lotteryChildCode);
	}

	public static boolean isCqkl10(Integer lotteryChildCode) {
		return isLotteryChild(getCqkl10Child(), lotteryChildCode);
	}
	
	public static boolean isDkl10(Integer lotteryChildCode) {
		return isLotteryChild(getDkl10Child(), lotteryChildCode);
	}
	
	private static EnumSet<LotteryChild> getCqkl10Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.CQKL10_ST,
				LotteryChild.CQKL10_HT,
				LotteryChild.CQKL10_R2,
				LotteryChild.CQKL10_G2,
				LotteryChild.CQKL10_D2,
				LotteryChild.CQKL10_R3,
				LotteryChild.CQKL10_G3,
				LotteryChild.CQKL10_D3,
				LotteryChild.CQKL10_R4,
				LotteryChild.CQKL10_R5
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getDkl10Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.DKL10_ST,
				LotteryChild.DKL10_HT,
				LotteryChild.DKL10_R2,
				LotteryChild.DKL10_G2,
				LotteryChild.DKL10_D2,
				LotteryChild.DKL10_R3,
				LotteryChild.DKL10_G3,
				LotteryChild.DKL10_D3,
				LotteryChild.DKL10_R4,
				LotteryChild.DKL10_R5
				);
		return lotteryChildSet;
	}

	public static boolean isLotteryChild(EnumSet<LotteryChild> lotteryChildSet, Integer lotteryChildCode) {
		if(lotteryChildSet == null || lotteryChildCode == null) 
			return false;
		for(LotteryChild child : lotteryChildSet) {
			if(Objects.equals(child.getValue(), lotteryChildCode))
				return true;
		}
		return false;
	}
	
	private static EnumSet<LotteryChild> getSd11x5Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.SD11X5_R2,
				LotteryChild.SD11X5_R3,
				LotteryChild.SD11X5_R4,
				LotteryChild.SD11X5_R5,
				LotteryChild.SD11X5_R6,
				LotteryChild.SD11X5_R7,
				LotteryChild.SD11X5_R8,
				LotteryChild.SD11X5_Q1,
				LotteryChild.SD11X5_Q2_GROUP,
				LotteryChild.SD11X5_Q2_DIRECT,
				LotteryChild.SD11X5_Q3_GROUP,
				LotteryChild.SD11X5_Q3_DIRECT,
				LotteryChild.SD11X5_L2,
				LotteryChild.SD11X5_L3,
				LotteryChild.SD11X5_L4,
				LotteryChild.SD11X5_L5
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getD11x5Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.D11X5_R2,
				LotteryChild.D11X5_R3,
				LotteryChild.D11X5_R4,
				LotteryChild.D11X5_R5,
				LotteryChild.D11X5_R6,
				LotteryChild.D11X5_R7,
				LotteryChild.D11X5_R8,
				LotteryChild.D11X5_Q1,
				LotteryChild.D11X5_Q2_GROUP,
				LotteryChild.D11X5_Q2_DIRECT,
				LotteryChild.D11X5_Q3_GROUP,
				LotteryChild.D11X5_Q3_DIRECT
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getJX11x5Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.JX11X5_R2,
				LotteryChild.JX11X5_R3,
				LotteryChild.JX11X5_R4,
				LotteryChild.JX11X5_R5,
				LotteryChild.JX11X5_R6,
				LotteryChild.JX11X5_R7,
				LotteryChild.JX11X5_R8,
				LotteryChild.JX11X5_Q1,
				LotteryChild.JX11X5_Q2_GROUP,
				LotteryChild.JX11X5_Q2_DIRECT,
				LotteryChild.JX11X5_Q3_GROUP,
				LotteryChild.JX11X5_Q3_DIRECT
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getGX11x5Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.GX11X5_R2,
				LotteryChild.GX11X5_R3,
				LotteryChild.GX11X5_R4,
				LotteryChild.GX11X5_R5,
				LotteryChild.GX11X5_R6,
				LotteryChild.GX11X5_R7,
				LotteryChild.GX11X5_R8,
				LotteryChild.GX11X5_Q1,
				LotteryChild.GX11X5_Q2_GROUP,
				LotteryChild.GX11X5_Q2_DIRECT,
				LotteryChild.GX11X5_Q3_GROUP,
				LotteryChild.GX11X5_Q3_DIRECT
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getXJ11x5Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.XJ11X5_R2,
				LotteryChild.XJ11X5_R3,
				LotteryChild.XJ11X5_R4,
				LotteryChild.XJ11X5_R5,
				LotteryChild.XJ11X5_R6,
				LotteryChild.XJ11X5_R7,
				LotteryChild.XJ11X5_R8,
				LotteryChild.XJ11X5_Q1,
				LotteryChild.XJ11X5_Q2_GROUP,
				LotteryChild.XJ11X5_Q2_DIRECT,
				LotteryChild.XJ11X5_Q3_GROUP,
				LotteryChild.XJ11X5_Q3_DIRECT,
				LotteryChild.XJ11X5_L2,
				LotteryChild.XJ11X5_L3,
				LotteryChild.XJ11X5_L4,
				LotteryChild.XJ11X5_L5
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getJsk3Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.JSK3_S,
				LotteryChild.JSK3_TT3,
				LotteryChild.JSK3_TD3,
				LotteryChild.JSK3_BT3,
				LotteryChild.JSK3_L3,
				LotteryChild.JSK3_TF2,
				LotteryChild.JSK3_TD2,
				LotteryChild.JSK3_BT2
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getJxk3Child() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.JXK3_S,
				LotteryChild.JXK3_TT3,
				LotteryChild.JXK3_TD3,
				LotteryChild.JXK3_BT3,
				LotteryChild.JXK3_L3,
				LotteryChild.JXK3_TF2,
				LotteryChild.JXK3_TD2,
				LotteryChild.JXK3_BT2
				);
		return lotteryChildSet;
	}
	
	private static EnumSet<LotteryChild> getCqsscChild() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.CQSSC_5,
				LotteryChild.CQSSC_5T,
				LotteryChild.CQSSC_3,
				LotteryChild.CQSSC_3Z3,
				LotteryChild.CQSSC_3Z6,
				LotteryChild.CQSSC_2,
				LotteryChild.CQSSC_2Z,
				LotteryChild.CQSSC_1,
				LotteryChild.CQSSC_DXDS
				);
		return lotteryChildSet;
	}


	public static boolean isPoker(Integer lotteryChildCode) {
		return isLotteryChild(getPokerChild(), lotteryChildCode);
	}


	private static EnumSet<LotteryChild> getPokerChild() {
		EnumSet<LotteryChild> lotteryChildSet = EnumSet.of(
				LotteryChild.POKER_R1,
				LotteryChild.POKER_R2,
				LotteryChild.POKER_R3,
				LotteryChild.POKER_R4,
				LotteryChild.POKER_R5,
				LotteryChild.POKER_R6,
				LotteryChild.POKER_TH,
				LotteryChild.POKER_SZ,
				LotteryChild.POKER_BZ,
				LotteryChild.POKER_DZ
				);
		return lotteryChildSet;
	}

	/**
	 * @desc   是否高频彩有效的投注方式
	 * @author Tony Wang
	 * @create 2017年3月30日
	 * @param contentType
	 * @return 
	 */
//	public static boolean isValidContentType(Integer contentType) {
//		BetContentType betContentTypeEnum = BetContentType.getContentType(contentType);
//		if(null == betContentTypeEnum) return false;
//		switch (betContentTypeEnum) {
//		case SINGLE:
//		case MULTIPLE:
//		case DANTUO:
//			return true;
//		default:
//			return false;
//		}
//	}
}
