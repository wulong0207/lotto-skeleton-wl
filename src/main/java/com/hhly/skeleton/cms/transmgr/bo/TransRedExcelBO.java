package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class TransRedExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
	private String id;
	
	@ExcelHeader("会员昵称")
	private String nickName;
	
	@ExcelHeader("系统流水编号")
	private String redTransCode;
	
	@ExcelHeader("红包编号")
	private String redCode;
	
	@ExcelHeader("红包类型")
	@ReplaceAttribute(DicDataEnum.TRANS_RED_TYPE)
	private String redType;
	
	@ExcelHeader("交易分类")
	@ReplaceAttribute(DicDataEnum.TRANS_TYPE)
	private String transType;
	
	@ExcelHeader("交易状态")
	@ReplaceAttribute(DicDataEnum.TRANS_STATUS)
	private String transStatus;
	
	@ExcelHeader("交易金额")
	private Double transAmount;
	
	@ExcelHeader("交易后红包金额")
	private Double aftTransAmount;
	
	@ExcelHeader("订单信息")
	private String orderInfo;
	
	@ExcelHeader("交易时间")
	private String transTime;
	
	@ExcelHeader("订单编号")
	private String orderCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRedType() {
		return redType;
	}

	public void setRedType(String redType) {
		this.redType = redType;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRedTransCode() {
		return redTransCode;
	}

	public void setRedTransCode(String redTransCode) {
		this.redTransCode = redTransCode;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
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

	public Double getAftTransAmount() {
		return aftTransAmount;
	}

	public void setAftTransAmount(Double aftTransAmount) {
		this.aftTransAmount = aftTransAmount;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
}