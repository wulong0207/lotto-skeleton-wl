package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 赛事加奖活动参数类
 * @date 2017/8/18
 * @company 益彩网络科技公司
 */
public class OperateActivitySportRuleVO extends PageVO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 活动配置主键id
     */
    private Integer activityConfigId;

    /**
     * 彩种子玩法
     */
    private String lotteryChildCode;

    /**
     * 过关方式
     */
    private String lotteryPassType;

    /**
     * 赛事系统编号
     */
    private String systemCode;

    /**
     * 类型   1： 时间，2：日期，3：期数
     */
    private String ruleType;

    /**
     * 类型开始
     */
    private String ruleStart;

    /**
     * 类型结束
     */
    private String ruleEnd;

    /**
     * 加奖方式
     */
    private String passAdd;

    /**
     * 活动状态
     */
    private Short openStatus;

    /**
     * 胜平负
     */
    private String spf;

    /**
     * 让分胜平负

     */
    private String rfspf;

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

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    public String getLotteryChildCode() {
        if (!ObjectUtil.isBlank(this.getSpf()) && !ObjectUtil.isBlank(this.getRfspf())) {
            if (this.getSpf().equals("√")) {
                this.lotteryChildCode = "30002";
            }
            if (this.getRfspf().equals("√")) {
                this.lotteryChildCode = "30003";
            }
            if (this.getSpf().equals("√") && this.getRfspf().equals("√")) {
                this.lotteryChildCode = "30002,30003";
            }
        }
        return lotteryChildCode;
    }

    public String getLotteryChildCode2() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(String lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public String getLotteryPassType() {
        return lotteryPassType;
    }

    public void setLotteryPassType(String lotteryPassType) {
        this.lotteryPassType = lotteryPassType;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public String getRuleStart() {
        return ruleStart;
    }

    public void setRuleStart(String ruleStart) {
        this.ruleStart = ruleStart;
    }

    public String getRuleEnd() {
        return ruleEnd;
    }

    public void setRuleEnd(String ruleEnd) {
        this.ruleEnd = ruleEnd;
    }

    public String getPassAdd() {
        return passAdd;
    }

    public void setPassAdd(String passAdd) {
        this.passAdd = passAdd;
    }

    public Short getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Short openStatus) {
        this.openStatus = openStatus;
    }

    public String getSpf() {
        return spf;
    }

    public void setSpf(String spf) {
        this.spf = spf;
    }

    public String getRfspf() {
        return rfspf;
    }

    public void setRfspf(String rfspf) {
        this.rfspf = rfspf;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
}
