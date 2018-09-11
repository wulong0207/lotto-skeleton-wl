package com.hhly.skeleton.lotto.base.lottery.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 彩种投注注数，倍数配置
 * @author huangb
 * @date 2017年3月7日
 * @company 益彩网络
 * @version v1.0
 */
public class LotBettingMulVO extends BaseVO {

	private static final long serialVersionUID = -3671963465532175065L;
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;

	public LotBettingMulVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种编号
	 */
	public LotBettingMulVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

}