package com.hhly.skeleton.lotto.base.trend.vo.high;

/**
 * @desc 快乐10分BaseBO
 * @author Tony Wang
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class Kl10OmitVO extends HighLotteryVO {
	
	private Kl10BaseVO base;
	private Kl103CodeVO threeCode;
	

	public Kl10BaseVO getBase() {
		return base;
	}

	public void setBase(Kl10BaseVO base) {
		this.base = base;
	}

	public Kl103CodeVO getThreeCode() {
		return threeCode;
	}

	public void setThreeCode(Kl103CodeVO threeCode) {
		this.threeCode = threeCode;
	}
}