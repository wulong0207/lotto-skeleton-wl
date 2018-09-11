package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.CoOperateEnum;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 代理商户充值
 *
 * @author huangchengfang1219
 * @date 2018年4月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateProxyRechargeBO extends BaseBO {

	@ExcelIgnore
	private static final long serialVersionUID = 1283588327392525018L;

	/**
	 * 流水号
	 */
	@ExcelHeader("系统流水号")
	private String transRechargeCode;
	
	@ExcelIgnore
	private Short payType;

	@ExcelHeader("支付类型")
	private String payTypeText;

	/**
	 * 前端显示状态,1 交易成功, 2交易失败
	 */
	@ExcelIgnore
	private Short status;

	@ExcelHeader("交易状态")
	private String statusText;

	/**
	 * 交易状态,0 交易失败, 1 交易成功, 2 待审核, 3 审核通过, 4 审核不通过
	 */
	@JsonIgnore
	@ExcelIgnore
	private Short transStatus;

	@JsonIgnore
	@ExcelIgnore
	private Double cashAmount;

	@JsonIgnore
	@ExcelIgnore
	private Double redTransAmount;

	/**
	 * 充值金额
	 */
	@ExcelHeader("充值金额")
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double rechargeAmount;

	/**
	 * 交易时间
	 */
	@ExcelHeader("交易时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;

	public String getTransRechargeCode() {
		return transRechargeCode;
	}

	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
		CoOperateEnum.ProxyRechargeStatus statusEnum = CoOperateEnum.ProxyRechargeStatus.valueOf(status);
		this.statusText = statusEnum == null ? null : statusEnum.getName();
	}

	public String getStatusText() {
		return statusText;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Double getCashAmount() {
		return cashAmount;
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

	public Short getPayType() {
		return payType;
	}

	public void setPayType(Short payType) {
		this.payType = payType;
		CoOperateEnum.PayType payTypeEnum = CoOperateEnum.PayType.valueOf(payType);
		this.payTypeText = payTypeEnum == null ? null : payTypeEnum.getName();
	}

	public String getPayTypeText() {
		return payTypeText;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

}
