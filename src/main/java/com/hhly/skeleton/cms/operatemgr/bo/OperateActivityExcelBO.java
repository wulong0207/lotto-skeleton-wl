package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;


@SuppressWarnings("serial")
public class OperateActivityExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
    private String id;
	
	@ExcelHeader("活动ID")
    private String activityId;
	
	@ExcelHeader("活动名称")
    private String activityName;
	
	@ExcelHeader("活动类型")
	@ReplaceAttribute(DicDataEnum.OPERATE_ACTIVITY_TYPE)
    private String activityType;
	
	@ExcelHeader("活动开始时间")
    private String activityStartTime;
	
	@ExcelHeader("活动结束时间")
    private String activityEndTime;
	
	@ExcelHeader("活动状态")
	@ReplaceAttribute(DicDataEnum.OPERATE_ACTIVITY_STATUS)
    private String activityStatus;
	
	@ExcelHeader("UV总数")
    private String uvCount;
	
	@ExcelHeader("PV总数")
    private String pvCount;
	
	@ExcelHeader("参与人数")
    private String partNum;
	
	@ExcelHeader("获取奖品人数")
    private String prizeGetNum;
	
	@ExcelHeader("成本总投入")
    private String totalCost;
	
	@ExcelHeader("成本实付")
    private String costPaid;
	
	@ExcelHeader("修改时间")
    private String updateTime;
	
	@ExcelHeader("创建时间")
    private String createTime;
	
	@ExcelHeader("备注")
    private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getUvCount() {
		return uvCount;
	}

	public void setUvCount(String uvCount) {
		this.uvCount = uvCount;
	}

	public String getPvCount() {
		return pvCount;
	}

	public void setPvCount(String pvCount) {
		this.pvCount = pvCount;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPrizeGetNum() {
		return prizeGetNum;
	}

	public void setPrizeGetNum(String prizeGetNum) {
		this.prizeGetNum = prizeGetNum;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getCostPaid() {
		return costPaid;
	}

	public void setCostPaid(String costPaid) {
		this.costPaid = costPaid;
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