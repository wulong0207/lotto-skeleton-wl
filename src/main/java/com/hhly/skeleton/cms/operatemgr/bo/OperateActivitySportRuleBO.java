package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 赛事加奖实体类
 * @date 2017/8/18
 * @company 益彩网络科技公司
 */
public class OperateActivitySportRuleBO extends BaseBO {

    /**
     * 主键id
     */
    private Integer id;

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
    private String createTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 修改时间
     */
    private String modifyTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 赛事编号
     */
    private String officialMatchCode;

    /**
     * 系统编号
     */
    private String matchName;

    /**
     * 主队名
     */
    private String homeName;

    /**
     * 客队名
     */
    private String visitiName;

    /**
     * 比赛开始时间
     */
    private String startTime;

    /**
     * 截止时间
     */
    private String saleEndTime;

    /**
     * 销售状态
     */
    private Integer  matchStatus;
    /**
     * 全场胜平负 :0：负；1：平；3：胜'
     */
    private Short fullSpf;
    /**
     * 让球胜平负 :0：负；1：平；3：胜'
     */
    private Short letSpf;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getFullSpf() {
		return fullSpf;
	}

	public void setFullSpf(Short fullSpf) {
		this.fullSpf = fullSpf;
	}

	public Short getLetSpf() {
		return letSpf;
	}

	public void setLetSpf(Short letSpf) {
		this.letSpf = letSpf;
	}

	public Integer getActivityConfigId() {
        return activityConfigId;
    }

    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    public String getLotteryChildCode() {
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
        if (this.getLotteryChildCode().indexOf("30002") >= 0) {
            return "√";
        } else {
            return  "X";
        }
    }

    public void setSpf(String spf) {
        this.spf = spf;
    }

    public String getRfspf() {
        if (this.getLotteryChildCode().indexOf("30003") >= 0) {
            return  "√";
        } else {
            return  "X";
        }
    }

    public void setRfspf(String rfspf) {
        this.rfspf =rfspf;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getVisitiName() {
        return visitiName;
    }

    public void setVisitiName(String visitiName) {
        this.visitiName = visitiName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(String saleEndTime) {
        this.saleEndTime = saleEndTime;
    }
}
