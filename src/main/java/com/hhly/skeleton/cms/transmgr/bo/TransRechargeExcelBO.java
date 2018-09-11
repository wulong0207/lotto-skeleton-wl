package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
@SuppressWarnings("serial")
public class TransRechargeExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
	private String id;
	
	@ExcelHeader("会员昵称")
	private String nickName;
	
	@ExcelHeader("系统流水编号")
	private String transRechargeCode;
	
	@ExcelHeader("交易状态")
	@ReplaceAttribute(DicDataEnum.TRANS_RECHARGE_STATUS)
	private String transStatus;
	
	@ExcelHeader("充值金额")
	private Double rechargeAmount;
	
	@ExcelHeader("服务费")
	private Double serviceCharge;
	
	@ExcelHeader("红包金额")
	private Double redAmount;
	
	@ExcelHeader("到账金额")
	private Double arrivalAmount;
	
	@ExcelHeader("充值渠道")
	@ReplaceAttribute(DicDataEnum.TRANS_RECHARGE_CHANNEL)
	private String rechargeChannel;
	
	@ExcelHeader("银行卡分类")
	@ReplaceAttribute(DicDataEnum.TRANS_BANK_CARD_TYPE)
	private String bankCardType;
	
	@ExcelHeader("银行名称")
	@ReplaceAttribute(DicDataEnum.TRANS_BANK_NAME)
	private String rechargeBank;
	
	@ExcelHeader("支付方式 分类")
	@ReplaceAttribute(DicDataEnum.TRANS_PAY_TYPE)
	private String payType;
	
	@ExcelHeader("创建时间")
	private String createTime;
	
	@ExcelHeader("交易时间")
	private String transTime;
	
	@ExcelHeader("交易结束时间")
	private String transEndTime;

	@ExcelHeader("订单编号")
	private String orderCode;
	
	@ExcelHeader("第三方流水号")
	private String thirdTransNum;
	
	@ExcelHeader("充值平台")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_SOURCE)
	private String rechargePlatform;
	
	@ExcelHeader("补单人")
	private String supplementBy;
	
	@ExcelHeader("备注")
	private String remark;

	@ExcelHeader("市场渠道")
	private String channelName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
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

	public String getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(String rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getRechargeBank() {
		return rechargeBank;
	}

	public void setRechargeBank(String rechargeBank) {
		this.rechargeBank = rechargeBank;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getTransEndTime() {
		return transEndTime;
	}

	public void setTransEndTime(String transEndTime) {
		this.transEndTime = transEndTime;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}

	public String getRechargePlatform() {
		return rechargePlatform;
	}

	public void setRechargePlatform(String rechargePlatform) {
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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}