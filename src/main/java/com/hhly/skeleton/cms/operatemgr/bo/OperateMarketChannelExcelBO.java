package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-3 下午5:53:49
 * @Desc 渠道信息导出excel
 */
@SuppressWarnings("serial")
public class OperateMarketChannelExcelBO extends BaseBO{
    
    @ExcelHeader("序号")
	private String id;
    @ExcelHeader("渠道ID")
    private String channelId;
    @ExcelHeader("渠道名称")
    private String channelName;
    
    @ExcelHeader("渠道来源")
    @ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_TPF)
    private String terminalPlatform;
    @ExcelHeader("父级渠道")
    private String parentChannelId;
    
    @ExcelHeader("级别")
    @ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_GRAGE)
    private String grade;
    
    @ExcelHeader("结算类型")
    @ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_ST)
    private String settlementType;
    
    @ExcelHeader("资源名称")
    private String resourceName;
    @ExcelHeader("资源URL")
    private String resourceUrl;
    @ExcelHeader("结算费率")
    private Double settlementRate;
    @ExcelHeader("合作开始时间")
    private String coopStartTime;
    @ExcelHeader("合作结束时间")
    private String coopEndTime;
    
    @ExcelHeader("渠道状态")
    @ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_STATUS)
    private String channelStatus;
    @ExcelHeader("修改时间")
    private String updateTime;
    @ExcelHeader("创建时间")
    private String createTime;
    @ExcelHeader("备注")
    private String remark;
    
    
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(String terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public String getParentChannelId() {
		return parentChannelId;
	}

	public void setParentChannelId(String parentChannelId) {
		this.parentChannelId = parentChannelId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	

	public Double getSettlementRate() {
        return settlementRate;
    }

    public void setSettlementRate(Double settlementRate) {
        this.settlementRate = settlementRate;
    }

    public String getCoopStartTime() {
		return coopStartTime;
	}

	public void setCoopStartTime(String coopStartTime) {
		this.coopStartTime = coopStartTime;
	}

	public String getCoopEndTime() {
		return coopEndTime;
	}

	public void setCoopEndTime(String coopEndTime) {
		this.coopEndTime = coopEndTime;
	}

	public String getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(String channelStatus) {
		this.channelStatus = channelStatus;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
    
}