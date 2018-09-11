package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class RcmdUserCheckBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 申请人；关联用户表
     */
    private Integer userId;

    /**
     * 申请来源；1：个人申请；2：平台签约；
     */
    private Integer applySource;

    /**
     * 申请类型
     */
    private Integer applyType;

    /**
     * 彩种编号
     */
    private Short lotteryCode;

    /**
     * 擅长的赛事；多个逗号分隔
     */
    private String adeptMatch;

    /**
     * 个人简述
     */
    private String summary;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 审核时间
     */
    private Date checkTime;

    /**
     * 审核状态；1：待审核；2：审核中；3：通过；4：不通过；5：取消资格
     */
    private Integer status;

    /**
     * 是否显示战绩 0：不显示；1：显示；
     */
    private Integer isShowRecord;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 备注说明
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getApplySource() {
        return applySource;
    }

    public void setApplySource(Integer applySource) {
        this.applySource = applySource;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Short getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Short lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getAdeptMatch() {
        return adeptMatch;
    }

    public void setAdeptMatch(String adeptMatch) {
        this.adeptMatch = adeptMatch == null ? null : adeptMatch.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsShowRecord() {
        return isShowRecord;
    }

    public void setIsShowRecord(Integer isShowRecord) {
        this.isShowRecord = isShowRecord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}