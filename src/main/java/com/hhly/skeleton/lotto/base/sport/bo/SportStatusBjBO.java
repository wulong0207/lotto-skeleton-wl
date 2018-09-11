package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

public class SportStatusBjBO {
    /**
     * 自增长主键ID
     */
    private Long id;

    /**
     * 竞技彩对阵详情表ID
     */
    private Long sportAgainstInfoId;

    /**
     * 1：正常销售；2：暂停销售 让球胜平负玩法
     */
    private Boolean statusLetWdf;

    /**
     * 1：正常销售；2：暂停销售 总进球数玩法
     */
    private Boolean statusGoal;

    /**
     * 1：正常销售；2：暂停销售 半全场胜平负玩法
     */
    private Boolean statusHfWdf;

    /**
     * 1：正常销售；2：暂停销售 上下盘单双玩法
     */
    private Boolean statusUdSd;

    /**
     * 1：正常销售；2：暂停销售 单场比分固定玩法
     */
    private Boolean statusScore;

    /**
     *
     */
    private String modifyBy;

    /**
     *
     */
    private Date modifyTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 1：正常销售；2：暂停销售  胜负过关状态玩法
     */
    private Boolean statusLetWf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSportAgainstInfoId() {
        return sportAgainstInfoId;
    }

    public void setSportAgainstInfoId(Long sportAgainstInfoId) {
        this.sportAgainstInfoId = sportAgainstInfoId;
    }

    public Boolean getStatusLetWdf() {
        return statusLetWdf;
    }

    public void setStatusLetWdf(Boolean statusLetWdf) {
        this.statusLetWdf = statusLetWdf;
    }

    public Boolean getStatusGoal() {
        return statusGoal;
    }

    public void setStatusGoal(Boolean statusGoal) {
        this.statusGoal = statusGoal;
    }

    public Boolean getStatusHfWdf() {
        return statusHfWdf;
    }

    public void setStatusHfWdf(Boolean statusHfWdf) {
        this.statusHfWdf = statusHfWdf;
    }

    public Boolean getStatusUdSd() {
        return statusUdSd;
    }

    public void setStatusUdSd(Boolean statusUdSd) {
        this.statusUdSd = statusUdSd;
    }

    public Boolean getStatusScore() {
        return statusScore;
    }

    public void setStatusScore(Boolean statusScore) {
        this.statusScore = statusScore;
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

    public Boolean getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Boolean statusLetWf) {
        this.statusLetWf = statusLetWf;
    }
}