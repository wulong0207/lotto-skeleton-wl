package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

@SuppressWarnings("serial")
public class OperateCouponVO extends  PageVO implements Cloneable{
	/**
	 * 修改红包状态为已作废
	 */
	@Group({"updcancel"})
	@NotNull(msg="编号")
    private Integer id;

    private String redCode;

    private Short redCategory;

    private String activityCode;

    private String operateLotteryId;

    private Date activeEndTime;

    private Date obtainTime;

    private Date redOverdueTime;

    private Date useTime;

    private Short redType;

    private String redName;

    private Double redValue;

    private Double redBalance;

    private Integer minSpendAmount;

    private Integer userId;

    private Short ectivityDay;

    private String channelId;

    private String redLabel;
    
    @Group({"updcancel"})
	@NotNull(msg="红包状态")
    @Range(min=5,max=5,msg="红包状态")
    private Short redStatus;

    private String limitPlatform;

    private String limitLottery;

    private String useRule;

    private String redRemark;

    private Date modifyTime;

    private String modifyBy;

    private String createBy;

    private Date updateTime;

    private Date createTime;

    private String remark;
    
    private Short redSource;
    
    /**
     * 限制红包彩种子玩法
     */
    private String limitLotteryChild;

    /**
     * 限制竞技彩种的过关方式
     */
    private String limitLotteryChildType; 
    
    /**
     * 随机红包类型
     */
    private Short randomRedType;
    
    //扩展字段
    /**
     * 生成红包数量
     */
    private Short num;
    
    /**
     * 用户昵称集合, 以,隔开
     */
    private String userAccountNameStr;
    
    private String accountName;
    
    private String activityName;
    
    private Date useTimeStart;

    private Date obtainTimeStart;
    
    private Date redOverdueTimeStart;
    
    private Date activeEndTimeStart;
    
    private Date useTimeEnd;

    private Date obtainTimeEnd;
    
    private Date redOverdueTimeEnd;
    
    private Date activeEndTimeEnd;
    

    private Date createStartTime;
    
    private Date createEndTime;
    
  
    private Date updateStartTime;
  
    private Date updateEndTime;
    
    private Integer noticeStatus;

    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 
     * @Description 红包过期通知状态
     * @author HouXiangBao289
     * @return
     */
	public Integer getNoticeStatus() {
		return noticeStatus;
	}
	/**
     * 
     * @Description 红包过期通知状态
     * @author HouXiangBao289
     * @return
     */
	public void setNoticeStatus(Integer noticeStatus) {
		this.noticeStatus = noticeStatus;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Date getUseTimeStart() {
		return useTimeStart;
	}

	public void setUseTimeStart(Date useTimeStart) {
		this.useTimeStart = useTimeStart;
	}

	public Date getObtainTimeStart() {
		return obtainTimeStart;
	}

	public void setObtainTimeStart(Date obtainTimeStart) {
		this.obtainTimeStart = obtainTimeStart;
	}

	public Date getRedOverdueTimeStart() {
		return redOverdueTimeStart;
	}

	public void setRedOverdueTimeStart(Date redOverdueTimeStart) {
		this.redOverdueTimeStart = redOverdueTimeStart;
	}

	public Date getActiveEndTimeStart() {
		return activeEndTimeStart;
	}

	public void setActiveEndTimeStart(Date activeEndTimeStart) {
		this.activeEndTimeStart = activeEndTimeStart;
	}

	public Date getUseTimeEnd() {
		return useTimeEnd;
	}

	public void setUseTimeEnd(Date useTimeEnd) {
		this.useTimeEnd = useTimeEnd;
	}

	public Date getObtainTimeEnd() {
		return obtainTimeEnd;
	}

	public void setObtainTimeEnd(Date obtainTimeEnd) {
		this.obtainTimeEnd = obtainTimeEnd;
	}

	public Date getRedOverdueTimeEnd() {
		return redOverdueTimeEnd;
	}

	public void setRedOverdueTimeEnd(Date redOverdueTimeEnd) {
		this.redOverdueTimeEnd = redOverdueTimeEnd;
	}

	public Date getActiveEndTimeEnd() {
		return activeEndTimeEnd;
	}

	public void setActiveEndTimeEnd(Date activeEndTimeEnd) {
		this.activeEndTimeEnd = activeEndTimeEnd;
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

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Short getRedCategory() {
		return redCategory;
	}

	public void setRedCategory(Short redCategory) {
		this.redCategory = redCategory;
	}
	
	public String getActivityCode() {
		return activityCode;
	}
	
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	
	public String getOperateLotteryId() {
		return operateLotteryId;
	}

	public void setOperateLotteryId(String operateLotteryId) {
		this.operateLotteryId = operateLotteryId;
	}

	public Date getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(Date activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public Date getObtainTime() {
		return obtainTime;
	}

	public void setObtainTime(Date obtainTime) {
		this.obtainTime = obtainTime;
	}

	public Date getRedOverdueTime() {
		return redOverdueTime;
	}

	public void setRedOverdueTime(Date redOverdueTime) {
		this.redOverdueTime = redOverdueTime;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
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
	
	public Double getRedBalance() {
		return redBalance;
	}
	
	public void setRedBalance(Double redBalance) {
		this.redBalance = redBalance;
	}
	
	public Integer getMinSpendAmount() {
		return minSpendAmount;
	}

	public void setMinSpendAmount(Integer minSpendAmount) {
		this.minSpendAmount = minSpendAmount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Short getEctivityDay() {
		return ectivityDay;
	}

	public void setEctivityDay(Short ectivityDay) {
		this.ectivityDay = ectivityDay;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getRedLabel() {
		return redLabel;
	}

	public void setRedLabel(String redLabel) {
		this.redLabel = redLabel;
	}

	public Short getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(Short redStatus) {
		this.redStatus = redStatus;
	}

	public String getLimitPlatform() {
		return limitPlatform;
	}

	public void setLimitPlatform(String limitPlatform) {
		this.limitPlatform = limitPlatform;
	}

	public String getLimitLottery() {
		return limitLottery;
	}

	public void setLimitLottery(String limitLottery) {
		this.limitLottery = limitLottery;
	}

	public String getUseRule() {
		return useRule;
	}

	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	public String getRedRemark() {
		return redRemark;
	}

	public void setRedRemark(String redRemark) {
		this.redRemark = redRemark;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Short getRedSource() {
		return redSource;
	}

	public void setRedSource(Short redSource) {
		this.redSource = redSource;
	}

	public Short getNum() {
		return num;
	}

	public String getLimitLotteryChild() {
		return limitLotteryChild;
	}

	public void setLimitLotteryChild(String limitLotteryChild) {
		this.limitLotteryChild = limitLotteryChild;
	}

	public String getLimitLotteryChildType() {
		return limitLotteryChildType;
	}

	public void setLimitLotteryChildType(String limitLotteryChildType) {
		this.limitLotteryChildType = limitLotteryChildType;
	}

	public void setNum(Short num) {
		this.num = num;
	}

	public String getUserAccountNameStr() {
		return userAccountNameStr;
	}

	public void setUserAccountNameStr(String userAccountNameStr) {
		this.userAccountNameStr = userAccountNameStr;
	}

	public Short getRandomRedType() {
		return randomRedType;
	}

	public void setRandomRedType(Short randomRedType) {
		this.randomRedType = randomRedType;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
}