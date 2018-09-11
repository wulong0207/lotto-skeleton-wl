package com.hhly.skeleton.lotto.base.cooperate.bo;

/**
 * 统计
 *
 * @author huangchengfang1219
 * @date 2018年3月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateCdkeyCountBO {

	/**
	 * cdkey
	 */
	private String cdkey;

	/**
	 * 总数
	 */
	private Integer totalNum;

	/**
	 * 可兑换数
	 */
	private Integer canExchangeNum;

	/**
	 * 已兑换数量
	 */
	private Integer exchangedNum;

	/**
	 * 过期数量
	 */
	private Integer overTimeNum;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 渠道ID
	 */
	private String channelId;

	public String getCdkey() {
		return cdkey;
	}

	public void setCdkey(String cdkey) {
		this.cdkey = cdkey;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getCanExchangeNum() {
		return canExchangeNum;
	}

	public void setCanExchangeNum(Integer canExchangeNum) {
		this.canExchangeNum = canExchangeNum;
	}

	public Integer getExchangedNum() {
		return exchangedNum;
	}

	public void setExchangedNum(Integer exchangedNum) {
		this.exchangedNum = exchangedNum;
	}

	public Integer getOverTimeNum() {
		return overTimeNum;
	}

	public void setOverTimeNum(Integer overTimeNum) {
		this.overTimeNum = overTimeNum;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

}
