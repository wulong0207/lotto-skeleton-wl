package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户提现所有可用的储蓄卡
 * @author xiongJinGang
 * @date 2017年4月18日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenBankCardVO extends BaseBO {
	private static final long serialVersionUID = 152616993506402518L;
	private Integer bankId;// 银行ID
	private Integer bankCardId;// 银行卡Id
	private String bankName;// 银行名称
	private String branchBankName;//
	private String bankCard;// 隐藏了头部的银行卡号
	private Short isDefault;// 是否默认 0 不是 1是
	private String bLogo;// 大图标
	private String sLogo;// 小图标
	private Short bankType;// 银行卡类型
	private Short openBank;// 是否开通快捷支付
	@JsonIgnore
	private String fullBankCard;// 显示全部的银行卡号

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getbLogo() {
		return bLogo;
	}

	public void setbLogo(String bLogo) {
		this.bLogo = bLogo;
	}

	public String getsLogo() {
		return sLogo;
	}

	public void setsLogo(String sLogo) {
		this.sLogo = sLogo;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getFullBankCard() {
		return fullBankCard;
	}

	public void setFullBankCard(String fullBankCard) {
		this.fullBankCard = fullBankCard;
	}

	public String getBranchBankName() {
		return branchBankName;
	}

	public void setBranchBankName(String branchBankName) {
		this.branchBankName = branchBankName;
	}

	public Short getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}

	public Short getBankType() {
		return bankType;
	}

	public void setBankType(Short bankType) {
		this.bankType = bankType;
	}

	public Short getOpenBank() {
		return openBank;
	}

	public void setOpenBank(Short openBank) {
		this.openBank = openBank;
	}

}
