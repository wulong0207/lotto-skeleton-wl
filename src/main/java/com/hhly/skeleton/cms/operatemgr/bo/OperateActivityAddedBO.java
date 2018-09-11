package com.hhly.skeleton.cms.operatemgr.bo;
import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * @desc 追号送活动类
 * @author lidecheng
 * @date 2017年11月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateActivityAddedBO extends BaseBO{
    /**
     * 
     */
    private Integer id;

    /**
     * 活动配置主键id
     */
    private Integer activityConfigId;

    /**
     * 子玩法编号
     */
    private String lotteryChildCode;

    /**
     * 活动类型:1期数;2红包
     */
    private Short ruleType;

    /**
     * 活动优惠券表id
     */
    private Integer operateActivityCouponId;

    /**
     * 追号期数
     */
    private Integer addNum;

    /**
     * 赠送期数
     */
    private Short giveNum;

    /**
     * 同一用户享受次数
     */
    private Short singleUserNum;

    /**
     * 活动限制次数
     */
    private Integer ruleOfferNum;
    /**
     * 赠送彩期
     */
    private String giveIssue;
    /**
     * 
     */
    private Date modifyTime;

    /**
     * 
     */
    private String modifyBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 红包类型
     */
    private Short redType;
    
    private String redName;

    /**
     * 红包状态
     */
    private Short redStatus;

    /**
     * 红包面额
     */
    private Double redValue;

    /**
     * 最低消费金额
     */
    private Integer minSpendAmount;

    /**
     * 有效天数
     */
    private Integer ectivityDay;

    /**
     * 激活时间
     */
    private Short activeEndTime;

    /**
     * 限制平台
     */
    private String limitPlatform;

    /**
     * 限制竞技彩种的过关方式
     */
    private String limitLotteryChildType;

    /**
     * 生成数量
     */
    private Integer limitNum;

    /**
     * 红包标签
     */
    private String redLabel;

    /**
     * 关联彩种运营管理ID，list
     */
    private String operateLotteryId;

    /**
     * 可用渠道
     */
    private String channelId;

    /**
     * 限制彩种
     */
    private String limitLottery;

    /**
     * 限制彩种子玩法
     */
    private String limitLotteryChild;
    
    /**
     * 活动编号
     */
    private String activityId;
    
    public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	/**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 活动配置主键id
     * @return activity_config_id 活动配置主键id
     */
    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    /**
     * 活动配置主键id
     * @param activityConfigId 活动配置主键id
     */
    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    /**
     * 子玩法编号
     * @return lottery_child_code 子玩法编号
     */
    public String getLotteryChildCode() {
        return lotteryChildCode;
    }

    /**
     * 子玩法编号
     * @param lotteryChildCode 子玩法编号
     */
    public void setLotteryChildCode(String lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode == null ? null : lotteryChildCode.trim();
    }

    /**
     * 活动类型:1期数;2红包
     * @return rule_type 活动类型:1期数;2红包
     */
    public Short getRuleType() {
        return ruleType;
    }

    /**
     * 活动类型:1期数;2红包
     * @param ruleType 活动类型:1期数;2红包
     */
    public void setRuleType(Short ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 活动优惠券表id
     * @return operate_activity_coupon_id 活动优惠券表id
     */
    public Integer getOperateActivityCouponId() {
        return operateActivityCouponId;
    }

    /**
     * 活动优惠券表id
     * @param operateActivityCouponId 活动优惠券表id
     */
    public void setOperateActivityCouponId(Integer operateActivityCouponId) {
        this.operateActivityCouponId = operateActivityCouponId;
    }

    /**
     * 追号期数
     * @return add_num 追号期数
     */
    public Integer getAddNum() {
        return addNum;
    }

    /**
     * 追号期数
     * @param addNum 追号期数
     */
    public void setAddNum(Integer addNum) {
        this.addNum = addNum;
    }

    /**
     * 赠送期数
     * @return give_num 赠送期数
     */
    public Short getGiveNum() {
        return giveNum;
    }

    /**
     * 赠送期数
     * @param giveNum 赠送期数
     */
    public void setGiveNum(Short giveNum) {
        this.giveNum = giveNum;
    }

    /**
     * 同一用户享受次数
     * @return single_user_num 同一用户享受次数
     */
    public Short getSingleUserNum() {
        return singleUserNum;
    }

    /**
     * 同一用户享受次数
     * @param singleUserNum 同一用户享受次数
     */
    public void setSingleUserNum(Short singleUserNum) {
        this.singleUserNum = singleUserNum;
    }

    /**
     * 活动限制次数
     * @return rule_offer_num 活动限制次数
     */
    public Integer getRuleOfferNum() {
        return ruleOfferNum;
    }

    /**
     * 活动限制次数
     * @param ruleOfferNum 活动限制次数
     */
    public void setRuleOfferNum(Integer ruleOfferNum) {
        this.ruleOfferNum = ruleOfferNum;
    }

    /**
     * 
     * @return modify_time 
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 
     * @param modifyTime 
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getRedName() {
		return redName;
	}

	public void setRedName(String redName) {
		this.redName = redName;
	}

	public Short getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(Short redStatus) {
		this.redStatus = redStatus;
	}

	public Double getRedValue() {
		return redValue;
	}

	public void setRedValue(Double redValue) {
		this.redValue = redValue;
	}

	public Integer getMinSpendAmount() {
		return minSpendAmount;
	}

	public void setMinSpendAmount(Integer minSpendAmount) {
		this.minSpendAmount = minSpendAmount;
	}

	public Integer getEctivityDay() {
		return ectivityDay;
	}

	public void setEctivityDay(Integer ectivityDay) {
		this.ectivityDay = ectivityDay;
	}

	public Short getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(Short activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getLimitPlatform() {
		return limitPlatform;
	}

	public void setLimitPlatform(String limitPlatform) {
		this.limitPlatform = limitPlatform;
	}

	public String getLimitLotteryChildType() {
		return limitLotteryChildType;
	}

	public void setLimitLotteryChildType(String limitLotteryChildType) {
		this.limitLotteryChildType = limitLotteryChildType;
	}

	public Integer getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}

	public String getRedLabel() {
		return redLabel;
	}

	public void setRedLabel(String redLabel) {
		this.redLabel = redLabel;
	}

	public String getOperateLotteryId() {
		return operateLotteryId;
	}

	public void setOperateLotteryId(String operateLotteryId) {
		this.operateLotteryId = operateLotteryId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getLimitLottery() {
		return limitLottery;
	}

	public void setLimitLottery(String limitLottery) {
		this.limitLottery = limitLottery;
	}

	public String getLimitLotteryChild() {
		return limitLotteryChild;
	}

	public void setLimitLotteryChild(String limitLotteryChild) {
		this.limitLotteryChild = limitLotteryChild;
	}

	public String getGiveIssue() {
		return giveIssue;
	}

	public void setGiveIssue(String giveIssue) {
		this.giveIssue = giveIssue;
	}
 
}