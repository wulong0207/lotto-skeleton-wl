package com.hhly.skeleton.cms.transmgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * 用户充值
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransRechargeBO extends BaseBO{

	private static final long serialVersionUID = -2655189855656487117L;
	private Long id;
	// 会员昵称
	private String nickName;
	// 系统流水编号
	private String transRechargeCode;
	// 交易状态 1审核通过; 2审核不通过; 3银行处理成功; 4银行处理失败; 5已到帐;6待审核;7银行处理中
	private Integer transStatus;
	// 充值金额
	private Double rechargeAmount;
	// 服务费
	private Double serviceCharge;
	// 红包金额
	private Double redAmount;
	// 到账金额
	private Double arrivalAmount;
	// 充值渠道 1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值；6：易宝支付
	private Integer rechargeChannel;
	// 银行卡分类 1：储蓄卡；2：信用卡；3：其它
	private Integer bankCardType;
	// 银行名称
	// 1：农商银行；2：光大银行；3：交通银行；4：平安银行；5：农业银行；5：中信银行；6：广发银行；7：华夏银行；8：浦发银行；9：民生银行；10：建设银行；11：中国银行；12：工商银行；13：邮储银行；14：招商银行；15：兴业银行；
	private Integer rechargeBank;
	// 支付方式 分类 1：快捷支付；2：网银支付；3：其它支付；
	private Integer payType;
	// 创建时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	// 交易时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	// 交易结束时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transEndTime;
	// 第三方流水号
	private String thirdTransNum;
	// 充值平台 1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	private Integer rechargePlatform;
	// 补单人
	private String supplementBy;
	// 备注
	private String remark;
	// 用户帐号
	private String accountName;
	// 用户手机号码
	private String cusMobile;
	// 市场渠道
	private String channelName;
	// 订单编号
	private String orderCode;
	// 第三方交易时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date thirdTransTime;
	// 请求响应时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date responseTime;
	// 修改时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	// 充值描述
	private String rechargeRemark;
	// 创建人
	private String createBy;
	// 修改人
	private String modifyBy;
	private String bankCardNum;//银行卡号
	// 跳转地址
	public Date getTransTime() {
		return transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
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
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTransRechargeCode() {
		return transRechargeCode;
	}
	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}
	public Integer getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}
	public Double getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public Double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public Double getRedAmount() {
		return redAmount;
	}
	public void setRedAmount(Double redAmount) {
		this.redAmount = redAmount;
	}
	public Double getArrivalAmount() {
		return arrivalAmount;
	}
	public void setArrivalAmount(Double arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}
	public Integer getRechargeChannel() {
		return rechargeChannel;
	}
	public void setRechargeChannel(Integer rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}
	public Integer getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(Integer bankCardType) {
		this.bankCardType = bankCardType;
	}
	public Integer getRechargeBank() {
		return rechargeBank;
	}
	public void setRechargeBank(Integer rechargeBank) {
		this.rechargeBank = rechargeBank;
	}
	public Integer getPayType() {
		return payType;
	}
	public void setPayType(Integer payType) {
		this.payType = payType;
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
	public String getThirdTransNum() {
		return thirdTransNum;
	}
	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}
	public Integer getRechargePlatform() {
		return rechargePlatform;
	}
	public void setRechargePlatform(Integer rechargePlatform) {
		this.rechargePlatform = rechargePlatform;
	}
	public String getSupplementBy() {
		return supplementBy;
	}
	public void setSupplementBy(String supplementBy) {
		this.supplementBy = supplementBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Date getThirdTransTime() {
		return thirdTransTime;
	}
	public void setThirdTransTime(Date thirdTransTime) {
		this.thirdTransTime = thirdTransTime;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public String getRechargeRemark() {
		return rechargeRemark;
	}
	public void setRechargeRemark(String rechargeRemark) {
		this.rechargeRemark = rechargeRemark;
	}
	public String getBankCardNum() {
		return bankCardNum;
	}
	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
}
