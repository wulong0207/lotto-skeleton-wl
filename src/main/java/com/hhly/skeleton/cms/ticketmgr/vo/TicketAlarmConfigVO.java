package com.hhly.skeleton.cms.ticketmgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

@SuppressWarnings("serial")
public class TicketAlarmConfigVO extends PageVO{
    @Group({UPD})
    @NotNull(msg="主键ID")
    private Integer id;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警类型")
    private Short alarmType;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警子类型")
    private Short alarmChild;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警开关")
    private Short status;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警等级")
    private Short alarmLevel;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警上限")
    private Long parameter;
    
    @Group({ADD,UPD})
    @NotNull(msg="报警格式")
    @LenRange(min=1,max=1000,msg="报警格式")
    private String format;

    private String createBy;

    private String modifyBy;

    private Date modifyTime;

    private Date updateTime;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Short alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public Long getParameter() {
        return parameter;
    }

    public void setParameter(Long parameter) {
        this.parameter = parameter;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

   
}