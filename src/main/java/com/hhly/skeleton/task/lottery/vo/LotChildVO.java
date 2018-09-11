package com.hhly.skeleton.task.lottery.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 彩种子玩法
 * @author huangb
 * @date 2017年3月7日
 * @company 益彩网络
 * @version v1.0
 */
public class LotChildVO extends BaseVO {

	private static final long serialVersionUID = 5608815614114707335L;

	/**
	 * 子玩法code
	 */
	private Integer lotteryChildCode;

	/**
	 * 彩种code
	 */
	private Integer lotteryCode;

	public LotChildVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种编号
	 */
	public LotChildVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	/**
	 * @param lotteryCode
	 *            彩种编号
	 * @param lotteryChildCode
	 *            子玩法编号
	 */
	public LotChildVO(Integer lotteryCode, Integer lotteryChildCode) {
		this(lotteryCode);
		this.lotteryChildCode = lotteryChildCode;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

}