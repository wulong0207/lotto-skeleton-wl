package com.hhly.skeleton.cms.transmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 用户提款
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransTakenBO extends BaseBO{

	private static final long serialVersionUID = 2716400655573002122L;
	private Long id;
	// 系统流水编号
	private String transTakenCode;
	// 支付渠道 1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	private Integer payChannel;
	// 会员昵称
	private String nickName;
	// 交易状态 1：进行中；2：交易成功；3：交易失败；4：订单已关闭；
	private Integer transStatus;
	// 提款银行
	// 1：农商银行；2：光大银行；3：交通银行；4：平安银行；5：农业银行；6：中信银行；7：广发银行；8：华夏银行；9：浦发银行；10：民生银行；11：建设银行；12：中国银行；13：工商银行；14：邮储银行；15：招商银行；16：兴业银行；
	private Integer takenBank;
	// 银行卡号
	private String bankCardNum;
	// 用户真实姓名
	private String actualName;
	// 发起平台
	private Integer takenPlatform;
	// 创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	// 用户手机号码
	private String cusMobile;
	// 市场渠道
	private String channelName;
	// 审核时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date reviewTime;
	// 提款金额
	private Double extractAmount;
	// 订单编号
	//private String orderCode;
	// 汇款时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date remitTime;
	// 服务费
	private Double serviceCharge;
	// 第三方流水号
	private String thirdTransNum;
	// 到帐时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date arrivalTime;
	// 审核人
	private String reviewBy;
	// 批次号
	private String batchNum;
	// 银行处理时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dealTime;
	// 银行交易凭证
	private String transCert;
	// 批次状态； 0：处理失败；1：处理成功
	private Integer batchStatus;
	// 下发时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date sendDownTime;
	// 交易失败原因
	private String transFailInfo;
	// 分支行信息
	private String bankInfo;
	// 银行返回信息
	private String bankReturnInfo;
	// 修改时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	// 创建人
	private String createBy;
	// 修改人
	private String modifyBy;
	// 备注
	private String remark;
	
	private Long userId;
	//实际到账金额
	private Double realAmount;
	
	public String getTransTakenCode() {
		return transTakenCode;
	}
	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}
	public String getBankInfo() {
		return bankInfo;
	}
	public void setBankInfo(String bankInfo) {
		this.bankInfo = bankInfo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPayChannel() {
		return payChannel;
	}
	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
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
		this.bankCardNum = bankCardNum;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public Integer getTakenPlatform() {
		return takenPlatform;
	}
	public void setTakenPlatform(Integer takenPlatform) {
		this.takenPlatform = takenPlatform;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCusMobile() {
		return cusMobile;
	}
	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Date getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}
	public Double getExtractAmount() {
		return extractAmount;
	}
	public void setExtractAmount(Double extractAmount) {
		this.extractAmount = extractAmount;
	}
	public Date getRemitTime() {
		return remitTime;
	}
	public void setRemitTime(Date remitTime) {
		this.remitTime = remitTime;
	}
	public Double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getThirdTransNum() {
		return thirdTransNum;
	}
	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getReviewBy() {
		return reviewBy;
	}
	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}
	public String getBatchNum() {
		return batchNum;
	}
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public String getTransCert() {
		return transCert;
	}
	public void setTransCert(String transCert) {
		this.transCert = transCert;
	}
	public Integer getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(Integer batchStatus) {
		this.batchStatus = batchStatus;
	}
	public Date getSendDownTime() {
		return sendDownTime;
	}
	public void setSendDownTime(Date sendDownTime) {
		this.sendDownTime = sendDownTime;
	}
	public String getTransFailInfo() {
		return transFailInfo;
	}
	public void setTransFailInfo(String transFailInfo) {
		this.transFailInfo = transFailInfo;
	}
	public String getBankReturnInfo() {
		return bankReturnInfo;
	}
	public void setBankReturnInfo(String bankReturnInfo) {
		this.bankReturnInfo = bankReturnInfo;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Double getRealAmount() {
		return realAmount;
	}
	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}
	
}
