package com.hhly.skeleton.cms.cooperate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class CooperateAgencyBO extends BaseBO {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 关联市场渠道id
     */
    private String channelId;

    /**
     * 本站渠道主键id
     */
    private String cooperateChannelId;

    /**
     * 返点值
     */
    private Float returnRate;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private Date modifyTime;

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
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getCooperateChannelId() {
        return cooperateChannelId;
    }

    public void setCooperateChannelId(String cooperateChannelId) {
        this.cooperateChannelId = cooperateChannelId;
    }

    public Float getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(Float returnRate) {
        this.returnRate = returnRate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}