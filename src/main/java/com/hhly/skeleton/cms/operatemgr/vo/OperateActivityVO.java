package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.GroupValue;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OperateActivityVO extends PageVO{
	
	@Group({UPD})
	@NotNull
    private Integer id;
	
	@Group({UPD,ADD})
	@NotNull
	@LenRange(max=20,min=1,msg="活动编码")
    private String activityCode;
	
	@Group({UPD,ADD})
	@NotNull
	@LenRange(max=20,min=1,msg="活动名称")
    private String activityName;
	
	@Group({UPD,ADD})
	@NotNull
    private Short activityType;
	
	@Group({UPD,ADD})
	@NotNull
    private Date activityStartTime;
	
	@Group({UPD,ADD})
	@NotNull
    private Date activityEndTime;
	
	@Group({UPD,ADD})
	@LenRange(max=100,min=1,msg="活动页面地址")
    private String activityUrl;

	@Group({UPD,ADD})
	@NotNull
	@Range(min=1,max=4,msg="活动状态")
    private Short activityStatus;
    
	@Group({UPD,ADD})
	@Range(min=0,max=999999999,msg="活动页面的总人数(IP) ")
    private Long uvCount;
	
	@Group({UPD,ADD})
	@Range(min=0,max=999999999,msg="刷新页面次数")
    private Long pvCount;
	
	@Group({UPD,ADD})
	@Range(min=0,max=999999999,msg="参与成功的人数(统计)")
    private Integer partNum;
	
	@Group({UPD,ADD})
	@Range(min=0,max=999999999,msg="实际获取奖品人数(统计)")
    private Integer prizeGetNum;

	@Group({UPD,ADD})
	@Range(min=0,max=99999999.99,msg="成本总投入；(统计)")
    private Double totalCost;
	
	@Group({UPD,ADD})
	@Range(min=0,max=99999999.99,msg="按照优惠券实际使用统计 (统计)")
    private Double costPaid;
	
    private String channelId;
	
	@Group({UPD,ADD})
	@LenRange(max=2000,min=0,msg="活动规则描述")
    private String activityDes;

    private Date modifyTime;

    private String modifyBy;

    private String createBy;

    private Date updateTime;

    private Date createTime;
    
    @Group({GroupValue.UPD,GroupValue.ADD})
	@LenRange(max=100,min=0,msg="备注")
    private String remark;

    private Date createStartTime;
    
    private Date createEndTime;
    
  
    private Date updateStartTime;
  
    private Date updateEndTime;
    
    private Integer publishStatus;
    
    
	public Integer getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}

	public Date getCreateStartTime() {
		return createStartTime;
	}

	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public Date getCreateEndTime() {
		return createEndTime;
	}

	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public Date getUpdateStartTime() {
		return updateStartTime;
	}

	public void setUpdateStartTime(Date updateStartTime) {
		this.updateStartTime = updateStartTime;
	}

	public Date getUpdateEndTime() {
		return updateEndTime;
	}

	public void setUpdateEndTime(Date updateEndTime) {
		this.updateEndTime = updateEndTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Short getActivityType() {
		return activityType;
	}

	public void setActivityType(Short activityType) {
		this.activityType = activityType;
	}

	public Date getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Date getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityUrl() {
		return activityUrl;
	}

	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public Short getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(Short activityStatus) {
		this.activityStatus = activityStatus;
	}

	public Long getUvCount() {
		return uvCount;
	}

	public void setUvCount(Long uvCount) {
		this.uvCount = uvCount;
	}

	public Long getPvCount() {
		return pvCount;
	}

	public void setPvCount(Long pvCount) {
		this.pvCount = pvCount;
	}

	public Integer getPartNum() {
		return partNum;
	}

	public void setPartNum(Integer partNum) {
		this.partNum = partNum;
	}

	public Integer getPrizeGetNum() {
		return prizeGetNum;
	}

	public void setPrizeGetNum(Integer prizeGetNum) {
		this.prizeGetNum = prizeGetNum;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Double getCostPaid() {
		return costPaid;
	}

	public void setCostPaid(Double costPaid) {
		this.costPaid = costPaid;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getActivityDes() {
		return activityDes;
	}

	public void setActivityDes(String activityDes) {
		this.activityDes = activityDes;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


    
}