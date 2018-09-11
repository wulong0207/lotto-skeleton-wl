package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.util.MathUtil;

/**
 * @desc 交易中，各子钱包的金额
 * @author xiongJinGang
 * @date 2017年7月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayChildWalletVO {
	private Integer userId;// 用户ID
	private Double useAmountRed = 0d;// 彩金红包金额
	private Double useAmount20 = 0d;// 20%部分金额
	private Double useAmount80 = 0d;// 80%部分金额
	private Double useAmountWin = 0d;// 中奖部分金额
	private Double needSubCouponAmount = 0d;// 需要扣除的优惠券金额
	private Double totalCashAmount = 0d;// 钱包中总现金金额

	private Double tradeAmount = 0d;// 需要交易的金额（退款多少钱）
	@SuppressWarnings("unused")
	private Double backCachAmount = 0d;// 需要退还的现金金额

	private Double redAmount = 0d;// 需要重新生成的红包金额
	private String orderCode;// 订单编号
	private Short transType;// 交易类型
	private String operateRemark;// 操作描述
	private String redCode;// 红包编号
	private String orderInfo;// 订单描述
	private String tradeCode;// 交易编号
	private String channelId;// 渠道ID
	private Double totalRedBalance;// 剩余红包总金额

	public PayChildWalletVO() {
		super();
	}

	public PayChildWalletVO(Integer userId, Double useAmountRed, Double useAmount20, Double useAmount80, Double useAmountWin, Double needSubCouponAmount, Double totalCashAmount, Double totalRedBalance) {
		super();
		this.userId = userId;
		this.useAmountRed = useAmountRed;
		this.useAmount20 = useAmount20;
		this.useAmount80 = useAmount80;
		this.useAmountWin = useAmountWin;
		this.needSubCouponAmount = needSubCouponAmount;
		this.totalCashAmount = totalCashAmount;
		this.totalRedBalance = totalRedBalance;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getUseAmountRed() {
		return useAmountRed;
	}

	public void setUseAmountRed(Double useAmountRed) {
		this.useAmountRed = useAmountRed;
	}

	public Double getUseAmount20() {
		return useAmount20;
	}

	public void setUseAmount20(Double useAmount20) {
		this.useAmount20 = useAmount20;
	}

	public Double getUseAmount80() {
		return useAmount80;
	}

	public void setUseAmount80(Double useAmount80) {
		this.useAmount80 = useAmount80;
	}

	public Double getUseAmountWin() {
		return useAmountWin;
	}

	public void setUseAmountWin(Double useAmountWin) {
		this.useAmountWin = useAmountWin;
	}

	public Double getNeedSubCouponAmount() {
		return needSubCouponAmount;
	}

	public void setNeedSubCouponAmount(Double needSubCouponAmount) {
		this.needSubCouponAmount = needSubCouponAmount;
	}

	public Double getTotalCashAmount() {
		return totalCashAmount;
	}

	public void setTotalCashAmount(Double totalCashAmount) {
		this.totalCashAmount = totalCashAmount;
	}

	public Double getBackCachAmount() {
		return MathUtil.add(getUseAmount20(), getUseAmount80(), getUseAmountWin());
	}

	public void setBackCachAmount(Double backCachAmount) {
		this.backCachAmount = backCachAmount;
	}

	public Double getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(Double redAmount) {
		this.redAmount = redAmount;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public String getOperateRemark() {
		return operateRemark;
	}

	public void setOperateRemark(String operateRemark) {
		this.operateRemark = operateRemark;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Double getTradeAmount() {
		return tradeAmount;
	}

	public void setTradeAmount(Double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Double getTotalRedBalance() {
		return totalRedBalance;
	}

	public void setTotalRedBalance(Double totalRedBalance) {
		this.totalRedBalance = totalRedBalance;
	}

}
