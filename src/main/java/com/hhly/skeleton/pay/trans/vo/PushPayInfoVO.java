package com.hhly.skeleton.pay.trans.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 支付方案查看信息
 * @author xiongJinGang
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PushPayInfoVO extends BaseBO {

	/**
	 * 专家账户ID
	 */
	@JsonProperty("u_i_i")
	private Integer userIssueId;

	/**
	 * 彩种
	 */
	@JsonProperty("l_c")
	private Integer lotteryCode;

	/**
	 * 彩期
	 */
	@JsonProperty("i_c")
	private String issueCode;

	/**
	 * 彩种LOGO
	 */
	@JsonProperty("l_l_u")
	private String lotteryLogoUrl;

	/**
	 * 方案查看价格
	 */
	@JsonProperty("p_a")
	private Double price;

	public Integer getUserIssueId() {
		return userIssueId;
	}

	public void setUserIssueId(Integer userIssueId) {
		this.userIssueId = userIssueId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
