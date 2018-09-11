package com.hhly.skeleton.cms.sysmgr.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

@SuppressWarnings("serial")
public class PayBankSegmentVO extends PageVO {

	private Integer id;

	private Integer bankId;

	private String bankName;

	private String cardName;

	private Integer cardLength;

	private Long topCut;

	private Integer topCutLength;

	private Integer cardType;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	private String createBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;

	private String modifyBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	private Long topCut2;

	private Integer topCutLength2;

	private Long topCutLike;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
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

	public Integer getTopCutLength() {
		return topCutLength;
	}

	public void setTopCutLength(Integer topCutLength) {
		this.topCutLength = topCutLength;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
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

	public Long getTopCutLike() {
		return topCutLike;
	}

	public void setTopCutLike(Long topCutLike) {
		this.topCutLike = topCutLike;
	}
}
