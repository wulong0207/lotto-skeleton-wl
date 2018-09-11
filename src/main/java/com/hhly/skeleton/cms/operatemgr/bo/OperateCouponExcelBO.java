package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

@SuppressWarnings("serial")
public class OperateCouponExcelBO extends BaseBO{
	@ExcelHeader("序号")
    private String id;
	@ExcelHeader("红包编号")
    private String redCode;
	@ExcelHeader("来源类型")
	@ReplaceAttribute(DicDataEnum.OPERATE_COUPON_SOURCE)
	private String redSource;
	@ExcelHeader("红包种类")
	@ReplaceAttribute(DicDataEnum.OPERATE_COUPON_CATEGORY)
    private String redCategory;
	@ExcelHeader("激活截止时间")
    private String activeEndTime;
	@ExcelHeader("获取时间")
    private String obtainTime;
	@ExcelHeader("红包过期时间")
    private String redOverdueTime;
	@ExcelHeader("使用时间")
    private String useTime;
	@ExcelHeader("红包类型")
	@ReplaceAttribute(DicDataEnum.OPERATE_COUPON_TYPE)
    private String redType;
	@ExcelHeader("红包名字")
    private String redName;
	@ExcelHeader("红包面额")
    private Double redValue;

	@ExcelHeader("红包状态")
	@ReplaceAttribute(DicDataEnum.OPERATE_COUPON_STATUS)
    private String redStatus;
	@ExcelHeader("账号名")
    private String accountname;
	@ExcelHeader("活动编码")
	private String activityCode;
	@ExcelHeader("活动名")
	private String activityName;
	@ExcelHeader("红包备注")
    private String redRemark;
	@ExcelHeader("修改时间")
    private String updateTime;
	@ExcelHeader("创建时间")
    private String createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public String getRedCategory() {
		return redCategory;
	}

	public void setRedCategory(String redCategory) {
		this.redCategory = redCategory;
	}


	public String getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(String activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getObtainTime() {
		return obtainTime;
	}

	public void setObtainTime(String obtainTime) {
		this.obtainTime = obtainTime;
	}

	public String getRedOverdueTime() {
		return redOverdueTime;
	}

	public void setRedOverdueTime(String redOverdueTime) {
		this.redOverdueTime = redOverdueTime;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getRedType() {
		return redType;
	}

	public void setRedType(String redType) {
		this.redType = redType;
	}

	public String getRedName() {
		return redName;
	}

	public void setRedName(String redName) {
		this.redName = redName;
	}

	

	public Double getRedValue() {
        return redValue;
    }

    public void setRedValue(Double redValue) {
        this.redValue = redValue;
    }

    public String getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(String redStatus) {
		this.redStatus = redStatus;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getRedRemark() {
		return redRemark;
	}

	public void setRedRemark(String redRemark) {
		this.redRemark = redRemark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getRedSource() {
		return redSource;
	}

	public void setRedSource(String redSource) {
		this.redSource = redSource;
	}
    

   
}