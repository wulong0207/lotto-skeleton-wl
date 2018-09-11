package com.hhly.skeleton.lotto.base.bo;

/**
 * @desc    奖项BO
 * @author  Tony Wang
 * @date    2017年2月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public class PrizeBO {

//	private static final PrizeBO emptyInstance;
//	static {
//		
//	}
	/**
	 * 一等奖
	 */
	private final PrizeGradeBO firstPrize;
	
	/**
	 * 一等奖
	 */
	private final PrizeGradeBO secondPrize;

	public PrizeBO(PrizeGradeBO firstPrize, PrizeGradeBO secondPrize) {
		this.firstPrize = firstPrize;
		this.secondPrize = secondPrize;
	}

	public PrizeGradeBO getFirstPrize() {
		return firstPrize;
	}

	public PrizeGradeBO getSecondPrize() {
		return secondPrize;
	}
	
}
