package com.hhly.skeleton.pay.channel.vo;

import java.io.Serializable;

/**
 * @desc 支付渠道
 * @author xiongJinGang
 * @date 2017年12月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class PayChannelVO implements Serializable {

	/**
	 * 银行id
	 */
	private String bankId;
	/**
	 * 是否可用:0不可用;1可用
	 */
	private String available;
	/**
	 * 是否暂停:0不可用;1可用
	 */
	private String pause;
	/**
	 * 维护结束时间
	 */
	private Boolean endtime;

	public PayChannelVO(String bankId, String available, String pause) {
		this.bankId = bankId;
		this.available = available;
		this.pause = pause;
	}

	public PayChannelVO(String bankId, String available, String pause, Boolean endtime) {
		this.bankId = bankId;
		this.available = available;
		this.pause = pause;
		this.endtime = endtime;
	}

	public Boolean getEndtime() {
		return endtime;
	}

	public void setEndtime(Boolean endtime) {
		this.endtime = endtime;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getPause() {
		return pause;
	}

	public void setPause(String pause) {
		this.pause = pause;
	}
}
