package com.hhly.skeleton.cms.sportmgr.bo;


import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
/**
 * 竞彩足球子玩法状态信息
 * @author longguoyou
 * @date 2017年4月6日
 * @compay 益彩网络科技有限公司
 */
public class SportStatusFBBO extends BaseBO{
    private static final long serialVersionUID = 155181075146279262L;
    private Long id;
    /**
     *竞技彩对阵详情表ID 
     */
    private Long sportAgainstInfoId;
    /**
     *胜平负玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusWdf;
    /**
     * 让球胜平负玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusLetWdf;
    /**
     * 总进球数玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusGoal;
    /**
     * 半全场胜平负玩法 1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusHfWdf;
    /**
     * 比分固定玩法  1：正常销售；2：仅售过关；3：仅售单关；4：暂停销售
     */
    private Short statusScore;
    /**
     *修改人
     */
    private String modifyBy;
    /**
     *修改时间
     */
    private Date modifyTime;
    /**
     *更新时间
     */
    private Date updateTime;
    /**
     * 创建时间
     */
    private Date createTime;

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

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public Short getStatusWdf() {
        return statusWdf;
    }

    public void setStatusWdf(Short statusWdf) {
        this.statusWdf = statusWdf;
    }

    public Short getStatusLetWdf() {
        return statusLetWdf;
    }

    public void setStatusLetWdf(Short statusLetWdf) {
        this.statusLetWdf = statusLetWdf;
    }

    public Short getStatusGoal() {
        return statusGoal;
    }

    public void setStatusGoal(Short statusGoal) {
        this.statusGoal = statusGoal;
    }

    public Short getStatusHfWdf() {
        return statusHfWdf;
    }

    public void setStatusHfWdf(Short statusHfWdf) {
        this.statusHfWdf = statusHfWdf;
    }

    public Short getStatusScore() {
        return statusScore;
    }

    public void setStatusScore(Short statusScore) {
        this.statusScore = statusScore;
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

    @Override
    public String toString() {
        return "statusWdf:"+statusWdf+",statusLetWdf:"+statusLetWdf+",statusHfWdf:"+statusHfWdf+",statusGoal:"+statusGoal+",statusScore:"+statusScore;
    }
}