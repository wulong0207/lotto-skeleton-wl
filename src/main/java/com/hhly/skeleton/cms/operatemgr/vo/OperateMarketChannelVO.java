package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OperateMarketChannelVO extends PageVO{
    
	@Group({UPD})
	@NotNull
	private Integer id;
	
	@Group({UPD})
    @NotNull
    @LenRange(max=20,min=1,msg="渠道ID")
    private String channelId;
    
	@Group({UPD,ADD})
    @NotNull
    @LenRange(max=30,min=1,msg="渠道名称")
    private String channelName;
	
	@Group({UPD,ADD})
    @NotNull(msg="终端平台")
    private Short terminalPlatform;
	
	@Group({UPD,ADD})
    @LenRange(max=20,min=1,msg="父渠道ID")
    private String parentChannelId;
    
	@Group({UPD,ADD})
    @NotNull(msg="级别")
    @Range(min=1,max=5,msg="级别")
    private Short grade;
    
	@Group({UPD,ADD})
    @NotNull(msg="结算类型")
    @Range(min=1,max=8,msg="结算类型")
    private Short settlementType;
    
	@Group({UPD,ADD})
    @LenRange(max=30,min=1,msg="资源名称")
    private String resourceName;
    
	@Group({UPD,ADD})
    @LenRange(max=100,min=1,msg="渠道来源的主页URL")
    private String resourceUrl;
    
	@Group({UPD,ADD})
    @Range(min=0,max=999.99,msg="计算费率")
    @Pattern(value=MatchPattern.FLOAT_TWO_DECIMAL,msg="计算费率（最多2位小数）")
    private Double settlementRate;
    
    private Date coopStartTime;
    
    private Date coopEndTime;
    
	@Group({UPD,ADD})
    @NotNull
    @Range(min=0,max=3,msg="渠道状态")
    private Short channelStatus;

    private Date modifyTime;
    

    private String modifyBy;
    
    private String createBy;

    private Date updateTime;

    private Date createTime;
    
    @Group({"add","upd"})
    @LenRange(max=100,min=1,msg="备注")
    private String remark;
    
    
    private Date createStartTime;
    
    private Date createEndTime;
    
  
    private Date updateStartTime;
  
    private Date updateEndTime;

    private String appUrl;
    
    /**
     * 作  like '%xxx'查询
     */
    private String appUrlLike;

	/**
	 * 是否为马甲包0：否；1：是
	 */
	private Integer majia;
	
	/**
	 * 渠道秘钥
	 */
    private String secretKey;


	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
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

	public Short getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(Short terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public String getParentChannelId() {
		return parentChannelId;
	}

	public void setParentChannelId(String parentChannelId) {
		this.parentChannelId = parentChannelId;
	}

	public Short getGrade() {
		return grade;
	}

	public void setGrade(Short grade) {
		this.grade = grade;
	}

	public Short getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Short settlementType) {
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

	public Date getCoopStartTime() {
		return coopStartTime;
	}

	public void setCoopStartTime(Date coopStartTime) {
		this.coopStartTime = coopStartTime;
	}

	public Date getCoopEndTime() {
		return coopEndTime;
	}

	public void setCoopEndTime(Date coopEndTime) {
		this.coopEndTime = coopEndTime;
	}

	public Short getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(Short channelStatus) {
		this.channelStatus = channelStatus;
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

	public String getAppUrlLike() {
		return appUrlLike;
	}

	public void setAppUrlLike(String appUrlLike) {
		this.appUrlLike = appUrlLike;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public Integer getMajia() {
		return majia;
	}

	public void setMajia(Integer majia) {
		this.majia = majia;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
}