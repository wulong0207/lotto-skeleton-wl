package com.hhly.skeleton.pay.agent.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.pay.vo.TakenFlowVO;

/**
 * @desc 代理提款记录表
 * @author xiongJinGang
 * @date 2018年3月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class AgentTransTakenBO extends BaseBO {
	private static final long serialVersionUID = -2667337965022003035L;
	@JsonIgnore
	private Integer id;
	private String transTakenCode;// 固定规则的提现记录编号
	@JsonIgnore
	private Integer agentId;// 代理id
	private Short payChannel;// 提现的付款渠道；1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	private Integer takenBank;// 银行ID
	private String bankCardNum;// 提现的银行卡号
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date reviewTime;// 审核时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date remitTime;// 汇款时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date arrivalTime;// 到账时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dealTime;// 银行处理时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date sendDownTime;// 下发时间
	private String bankInfo;// 分支行信息
	private Double extractAmount;// 提款金额
	private Double serviceCharge;// 服务费
	private Double taxCharge;// 劳务所得税费
	private String reviewBy;// 审核人
	private String transCert;// 银行交易凭证
	private String transFailInfo;// 交易失败原因
	private Short transStatus;// 提现交易状态；1审核通过; 2审核不通过; 3银行处理成功; 4银行处理失败; 5已到帐;6待审核;7银行处理中
	private String transStatusName;//
	private Short takenPlatform;// 提现平台1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private String channelId;// 提现渠道
	private String thirdTransNum;// 第三方流水号
	private String batchNum;// 批次号
	private Short batchStatus;// 批次状态； 0：处理失败；1：处理成功
	private String bankReturnInfo;// 银行返回信息描述
	private Double realAmount;// 用户实际到帐金额
	private String createBy;// 创建人
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;// 创建时间
	private String updateBy;// 修改人
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;// 修改时间
	private String remark;// 备注说明

	private String showMoney;// 带符号的金额
	/**
	 * 提款流程
	 */
	private List<TakenFlowVO> flowList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransTakenCode() {
		return transTakenCode;
	}

	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode == null ? null : transTakenCode.trim();
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public Integer getTakenBank() {
		return takenBank;
	}

	public void setTakenBank(Integer takenBank) {
		this.takenBank = takenBank;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum == null ? null : bankCardNum.trim();
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Date getRemitTime() {
		return remitTime;
	}

	public void setRemitTime(Date remitTime) {
		this.remitTime = remitTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public Date getSendDownTime() {
		return sendDownTime;
	}

	public void setSendDownTime(Date sendDownTime) {
		this.sendDownTime = sendDownTime;
	}

	public String getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(String bankInfo) {
		this.bankInfo = bankInfo == null ? null : bankInfo.trim();
	}

	public Double getExtractAmount() {
		return extractAmount;
	}

	public void setExtractAmount(Double extractAmount) {
		this.extractAmount = extractAmount;
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

	public String getReviewBy() {
		return reviewBy;
	}

	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy == null ? null : reviewBy.trim();
	}

	public String getTransCert() {
		return transCert;
	}

	public void setTransCert(String transCert) {
		this.transCert = transCert == null ? null : transCert.trim();
	}

	public String getTransFailInfo() {
		return transFailInfo;
	}

	public void setTransFailInfo(String transFailInfo) {
		this.transFailInfo = transFailInfo == null ? null : transFailInfo.trim();
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Short getTakenPlatform() {
		return takenPlatform;
	}

	public void setTakenPlatform(Short takenPlatform) {
		this.takenPlatform = takenPlatform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId == null ? null : channelId.trim();
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum == null ? null : thirdTransNum.trim();
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum == null ? null : batchNum.trim();
	}

	public Short getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Short payChannel) {
		this.payChannel = payChannel;
	}

	public Short getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(Short batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getBankReturnInfo() {
		return bankReturnInfo;
	}

	public void setBankReturnInfo(String bankReturnInfo) {
		this.bankReturnInfo = bankReturnInfo == null ? null : bankReturnInfo.trim();
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
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
		this.updateBy = updateBy == null ? null : updateBy.trim();
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
		this.remark = remark == null ? null : remark.trim();
	}

	public String getShowMoney() {
		return showMoney;
	}

	public void setShowMoney(String showMoney) {
		this.showMoney = showMoney;
	}

	public String getTransStatusName() {
		return transStatusName;
	}

	public void setTransStatusName(String transStatusName) {
		this.transStatusName = transStatusName;
	}

	public List<TakenFlowVO> getFlowList() {
		return flowList;
	}

	public void setFlowList(List<TakenFlowVO> flowList) {
		this.flowList = flowList;
	}

}