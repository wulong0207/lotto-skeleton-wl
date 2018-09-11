package com.hhly.skeleton.cms.ticketmgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;


@SuppressWarnings("serial")
public class TicketMonitorCommonVO extends BaseVO{
    @Group({UPD})
    @NotNull(msg="主键ID")
    private Integer id;
    
    @Group({UPD})
    @NotNull(msg="配置")
    private Integer parameter;
    
    @Group({UPD})
    @NotNull(msg="备注说明")
    @LenRange(min=1,max=30,msg="备注说明")
    private String remark;
    
    private String createBy;

    private String modifyBy;

    private Date modifyTime;

    private Date updateTime;

    private Date createTime;
    
    

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParameter() {
        return parameter;
    }

    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

   
}