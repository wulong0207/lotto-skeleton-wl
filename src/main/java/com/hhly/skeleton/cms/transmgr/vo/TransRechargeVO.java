package com.hhly.skeleton.cms.transmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * 用户充值
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransRechargeVO extends PageVO {

	private static final long serialVersionUID = 5744815883873276285L;
	// 系统流水编号
	private String transRechargeCode;
	// 第三方流水号
	private String thirdTransNum;
	// 充值渠道 1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	private Integer rechargeChannel;
	// 银行卡分类 1：储蓄卡；2：信用卡；3：其它
	private Integer bankCardType;
	// 充值平台 1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	// private Integer rechargePlatform;
	// 市场渠道
	private String channelName;
	private Integer searchUserType;
	private String searchUserValue;
	private Integer searchTimeType;
	private Date startTime;
	private Date endTime;
	// 交易状态 1审核通过; 2审核不通过; 3银行处理成功; 4银行处理失败; 5已到帐;6待审核;7银行处理中
	private Integer transStatus;
	// 银行名称
	private Integer rechargeBank;
	// 支付方式分类
	private Integer payType;
	
	private String createBy;
	private String modifyBy;
	/**
	 * 充值金额
	 */
	private Double rechargeAmount;

	private Integer channelId;

	public Integer getSearchTimeType() {
		return searchTimeType;
	}

	public void setSearchTimeType(Integer searchTimeType) {
		this.searchTimeType = searchTimeType;
	}

	public String getTransRechargeCode() {
		return transRechargeCode;
	}

	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
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

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getSearchUserType() {
		return searchUserType;
	}

	public void setSearchUserType(Integer searchUserType) {
		this.searchUserType = searchUserType;
	}

	public String getSearchUserValue() {
		return searchUserValue;
	}

	public void setSearchUserValue(String searchUserValue) {
		this.searchUserValue = searchUserValue;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
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

	public Double getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	@Override
	public String toString() {
		return "TransRechargeVO [transRechargeCode=" + transRechargeCode + ", thirdTransNum=" + thirdTransNum
				+ ", rechargeChannel=" + rechargeChannel + ", bankCardType=" + bankCardType + ", channelName="
				+ channelName + ", searchUserType=" + searchUserType + ", searchUserValue=" + searchUserValue
				+ ", searchTimeType=" + searchTimeType + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", transStatus=" + transStatus + ", rechargeBank=" + rechargeBank + ", payType=" + payType
				+ ", createBy=" + createBy + ", modifyBy=" + modifyBy + "]";
	}
	
}
