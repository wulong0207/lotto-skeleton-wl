package com.hhly.skeleton.pay.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @auth chenkangning
 * @date 2017/3/13
 * @desc 银行卡号码段信息BO
 * @compay 益彩网络科技有限公司
 */
public class PayBankSegmentBO implements Serializable {

	private static final long serialVersionUID = 3103732921852793705L;

	/**
	 * 银行id.关联pay_bank
	 */
	@JsonProperty("bk_id")
	private Integer bankId;

	/**
	 * 银行名称
	 */
	@JsonProperty("bk_nm")
	private String bankName;

	/**
	 * 卡号长度.
	 */
	@JsonProperty("cdl")
	private Integer cardLength;

	/**
	 * 截取卡号头部数字
	 */
	@JsonProperty("tct")
	private Long topCut;

	@JsonProperty("p_id")
	private Integer id;
	
	/**
	 * 银行名称
	 */
	@JsonProperty("c_nm")
	private String cardName;

	/**
	 * 截取卡号头部数字的长度
	 */
	@JsonProperty("tcl")
	private Integer topCutLength;
	/**
	 * 卡类型:1储蓄卡;2信用卡;3预付费卡
	 */
	@JsonProperty("ct")
	private Short cardType;
	/**
	 * 创建时间
	 */
	@JsonProperty("ctt")
	private Date createTime;
	/**
	 * 修改时间
	 */
	@JsonProperty("udt")
	private Date updateTime;
	/**
	 * 
	 */
	@JsonProperty("tc2")
	private Long topCut2;
	/**
	 * 
	 */
	@JsonProperty("tcl2")
	private Integer topCutLength2;

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Integer getCardLength() {
		return cardLength;
	}

	public void setCardLength(Integer cardLength) {
		this.cardLength = cardLength;
	}

	public Long getTopCut() {
		return topCut;
	}

	public void setTopCut(Long topCut) {
		this.topCut = topCut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Integer getTopCutLength() {
		return topCutLength;
	}

	public void setTopCutLength(Integer topCutLength) {
		this.topCutLength = topCutLength;
	}

	public Short getCardType() {
		return cardType;
	}

	public void setCardType(Short cardType) {
		this.cardType = cardType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Long getTopCut2() {
		return topCut2;
	}

	public void setTopCut2(Long topCut2) {
		this.topCut2 = topCut2;
	}

	public Integer getTopCutLength2() {
		return topCutLength2;
	}

	public void setTopCutLength2(Integer topCutLength2) {
		this.topCutLength2 = topCutLength2;
	}

	@Override
	public String toString() {
		return "PayBankSegmentBO{" + "bankId=" + bankId + ", bankName='" + bankName + '\'' + ", cardLength=" + cardLength + ", topCut='" + topCut + '\'' + '}';
	}
}
