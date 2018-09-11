package com.hhly.skeleton.lotto.base.cooperate.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 渠道彩种统计信息
 *
 * @author lidecheng
 * @date 2018年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelLotteryBO extends BaseBO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5651078652943416614L;

	private Integer lotteryCode;
	private String lotteryName;
	private String lotteryLogoUrl;
	private Double exchangeBalance;
	/**
	 * 彩种数量
	 */
	private Integer num;
	
	public Double getExchangeBalance() {
		return exchangeBalance;
	}
	public void setExchangeBalance(Double exchangeBalance) {
		this.exchangeBalance = exchangeBalance;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getLotteryName() {
		return lotteryName;
	}
	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}
	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}	
}
