package com.hhly.skeleton.cms.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ExcelIgnore;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

/**
 * @desc    针对银行的ExcelBO
 * @author  Tony Wang
 * @date    2017年8月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class AgentTakenCMBCBankExcelBO extends BaseBO{
//	帐号	户名	金额	开户行	开户地	注释
	@ExcelHeader("帐号")
	private String bankCardNum;
	
	@ExcelHeader("户名")
	private String actualName;
	
	@ExcelHeader("金额")
	private Double extractAmount;
	
	@ExcelHeader("到账金额")
	private Double realAmount;
	
	@ExcelHeader("开户行")
	@ReplaceAttribute(DicDataEnum.TRANS_BANK_NAME)
	private String takenBank;
	
	@ExcelHeader("开户地")
	private String bankInfo;
	
	@ExcelHeader("注释")
	private String comment;
	
	@ExcelHeader("交易流水号")
	private String transTakenCode;
	
	@ExcelIgnore
	private String batchNum;
	
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

	public Double getExtractAmount() {
		return extractAmount;
	}

	public void setExtractAmount(Double extractAmount) {
		this.extractAmount = extractAmount;
	}

	public String getTakenBank() {
		return takenBank;
	}

	public void setTakenBank(String takenBank) {
		this.takenBank = takenBank;
	}

	public String getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(String bankInfo) {
		this.bankInfo = bankInfo;
	}

	public String getTransTakenCode() {
		return transTakenCode;
	}

	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}
}