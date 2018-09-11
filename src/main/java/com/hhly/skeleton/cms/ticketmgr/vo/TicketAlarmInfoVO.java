package com.hhly.skeleton.cms.ticketmgr.vo;

import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class TicketAlarmInfoVO extends PageVO{
    
    private Integer id;

    private Integer typeId;
    @NotNull(msg="报警类型")
    private Short alarmType;
    @NotNull(msg="报警子类型")
    private Short alarmChild;
    @NotNull(msg="报警等级")
    private Short alarmLevel;
    
    private Short status;
    @NotNull(msg="报警信息")
    private String alarmInfo;

    private String remark;

    private String dealBy;
    @NotNull(msg="报警时间")
    private Date alarmTime;

    private Date dealTime;

    private Date alarmTimeStart;
    
    private Date alarmTimeEnd;
    
    private Date dealTimeStart;
    
    private Date dealTimeEnd;
    
    private List<String> ids;
    
    private List<Integer> alarmChildList;
    
    /**
     * 订单号
     */
    private String orderCode;
    
    public Date getAlarmTimeStart() {
        return alarmTimeStart;
    }

    public void setAlarmTimeStart(Date alarmTimeStart) {
        this.alarmTimeStart = alarmTimeStart;
    }

    public Date getAlarmTimeEnd() {
        return alarmTimeEnd;
    }

    public void setAlarmTimeEnd(Date alarmTimeEnd) {
        this.alarmTimeEnd = alarmTimeEnd;
    }

    public Date getDealTimeStart() {
        return dealTimeStart;
    }

    public void setDealTimeStart(Date dealTimeStart) {
        this.dealTimeStart = dealTimeStart;
    }

    public Date getDealTimeEnd() {
        return dealTimeEnd;
    }

    public void setDealTimeEnd(Date dealTimeEnd) {
        this.dealTimeEnd = dealTimeEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Short getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Short alarmType) {
        this.alarmType = alarmType;
    }

    public Short getAlarmChild() {
        return alarmChild;
    }

    public void setAlarmChild(Short alarmChild) {
        this.alarmChild = alarmChild;
    }

    public Short getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Short alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDealBy() {
        return dealBy;
    }

    public void setDealBy(String dealBy) {
        this.dealBy = dealBy;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode == null ? null : orderCode.trim();
	}

	/**
	 * @return the alarmChildList
	 */
	public List<Integer> getAlarmChildList() {
		return alarmChildList;
	}

	/**
	 * @param alarmChildList the alarmChildList to set
	 */
	public void setAlarmChildList(List<Integer> alarmChildList) {
		this.alarmChildList = alarmChildList;
	}
}