package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
@SuppressWarnings("serial")
public class TransUserExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
	private String id;
	
	@ExcelHeader("会员昵称")
	private String nickName;
	
	@ExcelHeader("系统流水编号")
	private String transCode;
	
	@ExcelHeader("交易分类")
	@ReplaceAttribute(DicDataEnum.TRANS_TYPE)
	private String transType;
	
	@ExcelHeader("交易状态")
	@ReplaceAttribute(DicDataEnum.TRANS_STATUS)
	private String transStatus;
	
	@ExcelHeader("交易金额")
	private Double transAmount;
	
	@ExcelHeader("现金")
	private Double cashAmount;
	
	@ExcelHeader("红包")
	private Double redTransAmount;
	
	@ExcelHeader("服务费")
	private Double serviceCharge;
	
	@ExcelHeader("订单信息")
	private String orderInfo;
	
	@ExcelHeader("创建时间")
	private String createTime;
	
	@ExcelHeader("交易结束时间")
	private String transEndTime;
	
	@ExcelHeader("订单编号")
	private String orderCode;
	
	@ExcelHeader("第三方流水号")
	private String thirdTransId;

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
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
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
	public Double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getTransEndTime() {
		return transEndTime;
	}
	public void setTransEndTime(String transEndTime) {
		this.transEndTime = transEndTime;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getThirdTransId() {
		return thirdTransId;
	}
	public void setThirdTransId(String thirdTransId) {
		this.thirdTransId = thirdTransId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
}