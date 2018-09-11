package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class OrderFollowedExcelBO extends BaseBO {
	
	@ExcelHeader("序号")
	private Integer id;
	
	@ExcelHeader("用户账户")
    private String accountName;
    
    //private Integer type;
	
	@ExcelHeader("抄单金额")
	private Double orderAmount;
	
	@ExcelHeader("出票状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_STATUS)
    private String orderStatus;

	@ExcelHeader("方案编号")
    private String orderCode;

	@ExcelHeader("税前奖金")
    private Double preBonus;
	
	@ExcelHeader("税后奖金")
    private Double aftBonus;
    
	@ExcelHeader("推单人提成")
    private Double commissionAmount;
	
    /**
     * 应发奖金：税后金额-推单人提成-平台提成
     */
	@ExcelHeader("派发奖金")
    private Double sendAmount;

	@ExcelHeader("抄单时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public Double getSendAmount() {
		return sendAmount;
	}

	public void setSendAmount(Double sendAmount) {
		this.sendAmount = sendAmount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}