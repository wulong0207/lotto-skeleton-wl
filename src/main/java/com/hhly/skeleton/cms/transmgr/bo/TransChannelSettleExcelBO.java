package com.hhly.skeleton.cms.transmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
@SuppressWarnings("serial")
public class TransChannelSettleExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
	private String id;
	
	@ExcelHeader("结算流水ID")
  private String transChannelSettleCode;
	
	@ExcelHeader("渠道名称")
	private String channelName;
	
	@ExcelHeader("应结佣金")
	private Double settleCommission;
	
	@ExcelHeader("结算状态")
	@ReplaceAttribute(DicDataEnum.TRANS_SETTLE_STATUS)
	private String settleStatus;
	
	@ExcelHeader("结算类型")
	@ReplaceAttribute(DicDataEnum.TRANS_SETTLE_TYPE)
	private String settleType;
	
	@ExcelHeader("结算总量")
	private Double settleCount;
	
	@ExcelHeader("结算费率")
	private Double settleRate;
	
	@ExcelHeader("结算开始时间")
	private String settleStartTime;
	
	@ExcelHeader("结算结束时间")
	private String settleEndTime;
	
	@ExcelHeader("结算时间")
	private String settleTime;
	
	@ExcelHeader("备注")
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Double getSettleCommission() {
		return settleCommission;
	}

	public void setSettleCommission(Double settleCommission) {
		this.settleCommission = settleCommission;
	}

	public String getSettleStatus() {
		return settleStatus;
	}

	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSettleType() {
		return settleType;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public Double getSettleCount() {
		return settleCount;
	}

	public void setSettleCount(Double settleCount) {
		this.settleCount = settleCount;
	}

	public Double getSettleRate() {
		return settleRate;
	}

	public void setSettleRate(Double settleRate) {
		this.settleRate = settleRate;
	}

	public String getSettleStartTime() {
		return settleStartTime;
	}

	public void setSettleStartTime(String settleStartTime) {
		this.settleStartTime = settleStartTime;
	}

	public String getSettleEndTime() {
		return settleEndTime;
	}

	public void setSettleEndTime(String settleEndTime) {
		this.settleEndTime = settleEndTime;
	}

	public String getSettleTime() {
		return settleTime;
	}

	public void setSettleTime(String settleTime) {
		this.settleTime = settleTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransChannelSettleCode() {
		return transChannelSettleCode;
	}

	public void setTransChannelSettleCode(String transChannelSettleCode) {
		this.transChannelSettleCode = transChannelSettleCode;
	}
}