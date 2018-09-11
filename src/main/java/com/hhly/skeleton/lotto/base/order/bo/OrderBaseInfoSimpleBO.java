package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 订单基本信息（对外提供简写的字段）
 * @author xiongJinGang
 * @date 2017年4月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderBaseInfoSimpleBO extends BaseBO {

	@JsonProperty("l_l_u")
	private String lotteryLogoUrl;// 彩种URL
	@JsonProperty("o_c")
	private String orderCode;// 订单编号
	@JsonProperty("l_n")
	private String lotteryName;// 彩种名称
	@JsonProperty("l_i")
	private String lotteryIssue;// 期号
	@JsonProperty("b_t")
	private String buyType;// 方案 0:全部； 1：代购；2：追号；3：合买
	@JsonProperty("b_t_n")
	private String buyTypeName;// 支付名称。代购、追号、合买、合并支付
	@JsonProperty("o_a")
	private Double orderAmount;// 付款金额
	@JsonProperty("l_c")
	private Integer lotteryCode;// 彩种编号

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getBuyTypeName() {
		return buyTypeName;
	}

	public void setBuyTypeName(String buyTypeName) {
		this.buyTypeName = buyTypeName;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

}
