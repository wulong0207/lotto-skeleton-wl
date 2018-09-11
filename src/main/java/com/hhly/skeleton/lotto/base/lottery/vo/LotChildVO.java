package com.hhly.skeleton.lotto.base.lottery.vo;

import java.util.Set;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 彩种子玩法
 * @author huangb
 * @date 2017年3月7日
 * @company 益彩网络
 * @version v1.0
 */
public class LotChildVO extends BaseVO {

	private static final long serialVersionUID = -8757329689341322496L;

	/**
	 * 子玩法code
	 */
	private Integer lotteryChildCode;

	/**
	 * 彩种code
	 */
	private Integer lotteryCode;

	/**
	 * 多个子玩法
	 */
	private Set<Integer> lotteryChildCodes;
	
	/**
	 * 销售状态
	 */
	private Short saleStatus;

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

	public LotChildVO(Integer lotteryCode, Set<Integer> lotteryChildCodes, Short saleStatus) {
		super();
		this.lotteryCode = lotteryCode;
		this.lotteryChildCodes = lotteryChildCodes;
		this.saleStatus = saleStatus;
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

	public Set<Integer> getLotteryChildCodes() {
		return lotteryChildCodes;
	}

	public void setLotteryChildCodes(Set<Integer> lotteryChildCodes) {
		this.lotteryChildCodes = lotteryChildCodes;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}
}