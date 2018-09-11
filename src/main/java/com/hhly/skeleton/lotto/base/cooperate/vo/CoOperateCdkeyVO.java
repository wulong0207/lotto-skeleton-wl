package com.hhly.skeleton.lotto.base.cooperate.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class CoOperateCdkeyVO extends BaseVO {

	private static final long serialVersionUID = -2102666731639049202L;

	/**
	 * 渠道ID
	 */
	private String channelId;

	/**
	 * 彩种编码
	 */
	private Integer lotteryCode;

	/**
	 * 中心兑换码数量
	 */
	private Integer num;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}
