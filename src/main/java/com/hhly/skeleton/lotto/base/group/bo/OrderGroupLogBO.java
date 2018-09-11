package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class OrderGroupLogBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 合买订单编号 处理过的合买单都会在日志中体现
     */
    private String orderCode;

    /**
     * 下单阶段处理标识；0：未处理1：已处理   下单后处理表m_user_group_info和m_user_group_lottery_info的统计信息;如：更新字段order_count，order_amount
     */
    private Boolean buyStageFlag;

    /**
     * 开奖阶段处理标识；0：未处理 1：已处理  开奖后处理表m_user_group_info和m_user_group_lottery_info的统计信息如：更新字段order_suc_count，order_suc_amount，win_count，win_bw_count，win_sw_count，

win_w_count，win_q_count，win_amount，profit_amount，profit_rate，hit_rate，commission_amount
     */
    private Boolean drawStageFlag;

    /**
     * 备份信息;如：开奖金额等,若多个可符号分割保存	 像重置开奖的场景，需要回退前一次开奖金额，次数等信息；然后在加上重置开奖后的金额，次数；
     */
    private String backupInfo;

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
     * 修改时间
     */
    private Date modifyTime;

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

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Boolean getBuyStageFlag() {
        return buyStageFlag;
    }

    public void setBuyStageFlag(Boolean buyStageFlag) {
        this.buyStageFlag = buyStageFlag;
    }

    public Boolean getDrawStageFlag() {
        return drawStageFlag;
    }

    public void setDrawStageFlag(Boolean drawStageFlag) {
        this.drawStageFlag = drawStageFlag;
    }

    public String getBackupInfo() {
        return backupInfo;
    }

    public void setBackupInfo(String backupInfo) {
        this.backupInfo = backupInfo == null ? null : backupInfo.trim();
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}