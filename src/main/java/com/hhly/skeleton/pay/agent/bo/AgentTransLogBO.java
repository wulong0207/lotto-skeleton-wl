package com.hhly.skeleton.pay.agent.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class AgentTransLogBO extends BaseBO {
	@JsonIgnore
	private Integer id;
	@JsonIgnore
	private Integer agentId;// 代理id
	private String transCode;// 固定规则的流水ID
	private Short transType;// 交易类型；1:充值到账号;2:提现到银行卡;3:充值失败退款;4:提现失败退款;5:结算佣金
	private String transInfo;// 交易信息说明：如提现会有银行及卡号说明
	@JsonIgnore
	private Date transEndTime;// 交易结束时间
	private Double transAmount;// 交易总金额
	private Short transStatus;// 交易状态；0：交易失败；1：交易成功；2：待审核； 3：审核通过； 4：审核不通过
	private Double serviceCharge;// 服务费
	private Double realAmount;// 实到金额；提现操作记录
	private Double taxCharge;// 劳务所得税费
	private Double totalCashBalance;// 代理账户余额
	private String tradeCode;// 流水编号;针对充值到账号的交易类型，记录收款账号的流水编号，以便建立关联关系
	@JsonIgnore
	private String createBy;// 创建人
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;// 生成时间
	@JsonIgnore
	private String updateBy;// 修改人
	@JsonIgnore
	private Date updateTime;// 修改时间
	@JsonIgnore
	private String remark;// 备注说明

	private String showAmount;// 前端直接显示的金额
	private String transStatusName;// 前端直接显示的交易状态名称
	private String createTimeStr;// 前端直接显示的时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Short getTransType() {
		return transType;
	}

	public void setTransType(Short transType) {
		this.transType = transType;
	}

	public String getTransInfo() {
		return transInfo;
	}

	public void setTransInfo(String transInfo) {
		this.transInfo = transInfo;
	}

	public Date getTransEndTime() {
		return transEndTime;
	}

	public void setTransEndTime(Date transEndTime) {
		this.transEndTime = transEndTime;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Double getTaxCharge() {
		return taxCharge;
	}

	public void setTaxCharge(Double taxCharge) {
		this.taxCharge = taxCharge;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public String getShowAmount() {
		return showAmount;
	}

	public void setShowAmount(String showAmount) {
		this.showAmount = showAmount;
	}

	public String getTransStatusName() {
		return transStatusName;
	}

	public void setTransStatusName(String transStatusName) {
		this.transStatusName = transStatusName;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

}