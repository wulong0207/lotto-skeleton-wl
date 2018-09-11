package com.hhly.skeleton.lotto.base.lottery.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种投注注数，倍数配置
 * @author huangb
 * @date 2017年3月7日
 * @company 益彩网络
 * @version v1.0
 */
public class LotBettingMulBO extends BaseBO {

	private static final long serialVersionUID = 6991358524145054054L;
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;
	/**
	 * 投注注数
	 */
	private Integer bettindNum;
	/**
	 * 投注倍数
	 */
	private Integer multipleNum;
	/**
	 * 距离官方截止时间的秒数
	 */
	private Integer endTime;
	
	public LotBettingMulBO() {
	}

	public LotBettingMulBO(Integer bettindNum, Integer multipleNum, Integer endTime) {
		this.bettindNum = bettindNum;
		this.multipleNum = multipleNum;
		this.endTime = endTime;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getBettindNum() {
		return bettindNum;
	}

	public void setBettindNum(Integer bettindNum) {
		this.bettindNum = bettindNum;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

}