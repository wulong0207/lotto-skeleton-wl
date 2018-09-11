package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class TransTakenExcelBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("会员昵称")
	private String nickName;

	@ExcelHeader("系统流水编号")
	private String transTakenCode;

	@ExcelHeader("交易状态")
	@ReplaceAttribute(DicDataEnum.TRANS_TAKEN_STATUS)
	private String transStatus;

	@ExcelHeader("提款金额")
	private Double extractAmount;

	@ExcelHeader("到账金额")
	private Double realAmount;

	@ExcelHeader("服务费")
	private Double serviceCharge;

	@ExcelHeader("会员姓名")
	private String actualName;

	@ExcelHeader("支付渠道")
	@ReplaceAttribute(DicDataEnum.TRANS_RECHARGE_CHANNEL)
	private String payChannel;

	@ExcelHeader("银行分类")
	@ReplaceAttribute(DicDataEnum.TRANS_BANK_NAME)
	private String takenBank;

	@ExcelHeader("银行卡号")
	private String bankCardNum;

	@ExcelHeader("分支行信息")
	private String bankInfo;

	@ExcelHeader("创建时间")
	private String createTime;

	@ExcelHeader("银行处理时间")
	private String dealTime;

	@ExcelHeader("到帐时间")
	private String arrivalTime;

	@ExcelHeader("第三方流水号")
	private String thirdTransNum;

	@ExcelHeader("批次号")
	private String batchNum;

	@ExcelHeader("批次状态")
	@ReplaceAttribute(DicDataEnum.TRANS_BATCH_STATUS)
	private String batchStatus;

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

	public String getTransTakenCode() {
		return transTakenCode;
	}

	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public Double getExtractAmount() {
		return extractAmount;
	}

	public void setExtractAmount(Double extractAmount) {
		this.extractAmount = extractAmount;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getTakenBank() {
		return takenBank;
	}

	public void setTakenBank(String takenBank) {
		this.takenBank = takenBank;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	public String getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(String bankInfo) {
		this.bankInfo = bankInfo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getDealTime() {
		return dealTime;
	}

	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
}