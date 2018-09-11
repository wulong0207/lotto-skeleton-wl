package com.hhly.skeleton.lotto.base.bo;

/**
 * @desc    奖项等级BO
 * @author  Tony Wang
 * @date    2017年2月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PrizeGradeBO {

	/**
	 * 奖项等级
	 */
	private final String grade;
	
	/**
	 * 奖项注数
	 */
	private final int count;
	
	/**
	 * 奖项奖金
	 */
	private final double bonus;

	
	public PrizeGradeBO(String grade, int count, double bonus) {
		this.grade = grade;
		this.count = count;
		this.bonus = bonus;
	}

	public String getGrade() {
		return grade;
	}

	public int getCount() {
		return count;
	}

	public double getBonus() {
		return bonus;
	}
}
