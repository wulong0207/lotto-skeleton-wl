package com.hhly.skeleton.cms.transmgr.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 用户流水
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransUserBO extends BaseBO {

	private static final long serialVersionUID = 8690583928794736554L;
	private BigDecimal id;
	// 会员昵称
	private String nickName;
	// 系统流水编号
	private String transCode;
	// 交易分类
	private Integer transType;
	// 交易状态
	private Integer transStatus;
	// 交易金额
	private Double transAmount;
	// 现金
	private Double cashAmount;
	// 红包
	private Double redTransAmount;
	// 服务费
	private Double serviceCharge;
	// 订单信息
	private String orderInfo;
	// 创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	// 交易结束时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transEndTime;
	// 订单编号
	private String orderCode;
	// 第三方流水号
	private String thirdTransId;
	private String channelName;
	private Integer terminalPlatform;
	private String accountName;
	private String cusMobile;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date thirdTransTime;
	// 现金总余额
	private Double totalCashBalance;
	private Double amount80;// 使用80%金额
	private Double amount20;// 使用20%金额
	private Double amountWin;// 使用中奖金额
	private Double totalRedBalance;// 剩余红包总余额

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getTransType() {
		return transType;
	}

	public void setTransType(Integer transType) {
		this.transType = transType;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public Date getThirdTransTime() {
		return thirdTransTime;
	}

	public void setThirdTransTime(Date thirdTransTime) {
		this.thirdTransTime = thirdTransTime;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Double getCashAmount() {
		// 提款
		if (getTransType().equals(Integer.parseInt(PayConstants.TransTypeEnum.DRAWING.getKey() + ""))) {
			Double amountWin = ObjectUtil.isBlank(getAmountWin()) ? 0d : getAmountWin();
			cashAmount = MathUtil.sub(transAmount, amountWin);
			if (MathUtil.compareTo(cashAmount, 0d) < 0) {
				cashAmount = 0d;
			}
		}
		return MathUtil.add(amount20, amount80);
	}

	public void setCashAmount(Double cashAmount) {
		this.cashAmount = cashAmount;
	}

	public Double getRedTransAmount() {
		return redTransAmount;
	}

	public void setRedTransAmount(Double redTransAmount) {
		this.redTransAmount = redTransAmount;
	}

	public Integer getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}

	public String getThirdTransId() {
		return thirdTransId;
	}

	public void setThirdTransId(String thirdTransId) {
		this.thirdTransId = thirdTransId;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getTransEndTime() {
		return transEndTime;
	}

	public void setTransEndTime(Date transEndTime) {
		this.transEndTime = transEndTime;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public Integer getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(Integer terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public Double getAmount80() {
		return amount80;
	}

	public void setAmount80(Double amount80) {
		this.amount80 = amount80;
	}

	public Double getAmount20() {
		return amount20;
	}

	public void setAmount20(Double amount20) {
		this.amount20 = amount20;
	}

	public Double getAmountWin() {
		// 只有提款才展示中奖金额。2018-02-28，将该判断去掉，所有的都显示
		/*if (!getTransType().equals(Integer.parseInt(PayConstants.TransTypeEnum.DRAWING.getKey() + ""))) {
			amountWin = 0d;
		}*/
		return amountWin;
	}

	public void setAmountWin(Double amountWin) {
		this.amountWin = amountWin;
	}

	public Double getTotalRedBalance() {
		return totalRedBalance;
	}

	public void setTotalRedBalance(Double totalRedBalance) {
		this.totalRedBalance = totalRedBalance;
	}

}
