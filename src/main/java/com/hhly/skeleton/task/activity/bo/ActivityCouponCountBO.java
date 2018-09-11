package com.hhly.skeleton.task.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;
/***
 * @desc 分期送活动类
 * @author lidecheng
 * @date 2017年7月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityCouponCountBO extends BaseBO{
	private Integer id;
    /**
     * 活动编码
     */
    private String activityCode;

    /**
     * 活动配置id
     */
    private Integer activityRuleId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户真实姓名
     */
    private String actualName;

    /**
     * 用户身份证号
     */
    private String idNum;

    /**
     * 返利金额
     */
    private Double rebateMoney;

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 红包编码
     */
    private String redCode;

    /**分期返送数*/
    private Integer installment;
    /**分期返送金额*/
    private String installmentMoney;
    /**活动名称*/
    private String activityName;
    /**操作状态*/
    private Short operactionType;

    /**
     * 
     */
    private Integer couponId;

    /**
     * 活动配置表id
     */
    private Integer activityConfigId;

    /**
     * 红包类型
     */
    private Short redType;

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
    private Short ectivityDay;

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
     * 活动配置表id
     * @return activity_config_id 活动配置表id
     */
    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    /**
     * 活动配置表id
     * @param activityConfigId 活动配置表id
     */
    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    /**
     * 红包类型
     * @return red_type 红包类型
     */
    public Short getRedType() {
        return redType;
    }

    /**
     * 红包类型
     * @param redType 红包类型
     */
    public void setRedType(Short redType) {
        this.redType = redType;
    }

    /**
     * 红包状态
     * @return red_status 红包状态
     */
    public Short getRedStatus() {
        return redStatus;
    }

    /**
     * 红包状态
     * @param redStatus 红包状态
     */
    public void setRedStatus(Short redStatus) {
        this.redStatus = redStatus;
    }

    /**
     * 红包面额
     * @return red_value 红包面额
     */
    public Double getRedValue() {
        return redValue;
    }

    /**
     * 红包面额
     * @param redValue 红包面额
     */
    public void setRedValue(Double redValue) {
        this.redValue = redValue;
    }

    /**
     * 最低消费金额
     * @return min_spend_amount 最低消费金额
     */
    public Integer getMinSpendAmount() {
        return minSpendAmount;
    }

    /**
     * 最低消费金额
     * @param minSpendAmount 最低消费金额
     */
    public void setMinSpendAmount(Integer minSpendAmount) {
        this.minSpendAmount = minSpendAmount;
    }

    /**
     * 有效天数
     * @return ectivity_day 有效天数
     */
    public Short getEctivityDay() {
        return ectivityDay;
    }

    /**
     * 有效天数
     * @param ectivityDay 有效天数
     */
    public void setEctivityDay(Short ectivityDay) {
        this.ectivityDay = ectivityDay;
    }

    /**
     * 激活时间
     * @return active_end_time 激活时间
     */
    public Short getActiveEndTime() {
        return activeEndTime;
    }

    /**
     * 激活时间
     * @param activeEndTime 激活时间
     */
    public void setActiveEndTime(Short activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    /**
     * 限制平台
     * @return limit_platform 限制平台
     */
    public String getLimitPlatform() {
        return limitPlatform;
    }

    /**
     * 限制平台
     * @param limitPlatform 限制平台
     */
    public void setLimitPlatform(String limitPlatform) {
        this.limitPlatform = limitPlatform == null ? null : limitPlatform.trim();
    }

    /**
     * 限制竞技彩种的过关方式
     * @return limit_lottery_child_type 限制竞技彩种的过关方式
     */
    public String getLimitLotteryChildType() {
        return limitLotteryChildType;
    }

    /**
     * 限制竞技彩种的过关方式
     * @param limitLotteryChildType 限制竞技彩种的过关方式
     */
    public void setLimitLotteryChildType(String limitLotteryChildType) {
        this.limitLotteryChildType = limitLotteryChildType == null ? null : limitLotteryChildType.trim();
    }

    /**
     * 生成数量
     * @return limit_num 生成数量
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    /**
     * 生成数量
     * @param limitNum 生成数量
     */
    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    /**
     * 红包标签
     * @return red_label 红包标签
     */
    public String getRedLabel() {
        return redLabel;
    }

    /**
     * 红包标签
     * @param redLabel 红包标签
     */
    public void setRedLabel(String redLabel) {
        this.redLabel = redLabel == null ? null : redLabel.trim();
    }

    /**
     * 关联彩种运营管理ID，list
     * @return operate_lottery_id 关联彩种运营管理ID，list
     */
    public String getOperateLotteryId() {
        return operateLotteryId;
    }

    /**
     * 关联彩种运营管理ID，list
     * @param operateLotteryId 关联彩种运营管理ID，list
     */
    public void setOperateLotteryId(String operateLotteryId) {
        this.operateLotteryId = operateLotteryId == null ? null : operateLotteryId.trim();
    }


    /**
     * 可用渠道
     * @return channel_id 可用渠道
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 可用渠道
     * @param channelId 可用渠道
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 限制彩种
     * @return limit_lottery 限制彩种
     */
    public String getLimitLottery() {
        return limitLottery;
    }

    /**
     * 限制彩种
     * @param limitLottery 限制彩种
     */
    public void setLimitLottery(String limitLottery) {
        this.limitLottery = limitLottery == null ? null : limitLottery.trim();
    }

    /**
     * 限制彩种子玩法
     * @return limit_lottery_child 限制彩种子玩法
     */
    public String getLimitLotteryChild() {
        return limitLotteryChild;
    }

    /**
     * 限制彩种子玩法
     * @param limitLotteryChild 限制彩种子玩法
     */
    public void setLimitLotteryChild(String limitLotteryChild) {
        this.limitLotteryChild = limitLotteryChild == null ? null : limitLotteryChild.trim();
    }

	public Short getOperactionType() {
		return operactionType;
	}

	public void setOperactionType(Short operactionType) {
		this.operactionType = operactionType;
	}

	public Integer getInstallment() {
		return installment;
	}

	public void setInstallment(Integer installment) {
		this.installment = installment;
	}

	public String getInstallmentMoney() {
		return installmentMoney;
	}

	public void setInstallmentMoney(String installmentMoney) {
		this.installmentMoney = installmentMoney;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Integer getActivityRuleId() {
		return activityRuleId;
	}

	public void setActivityRuleId(Integer activityRuleId) {
		this.activityRuleId = activityRuleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public Double getRebateMoney() {
		return rebateMoney;
	}

	public void setRebateMoney(Double rebateMoney) {
		this.rebateMoney = rebateMoney;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	
    public Integer getCouponId() {
		return couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String toString(){
    	return "红包id:"+id+",活动编码:"+activityCode+",活动规则明细+"+activityRuleId+",用户id:"+userId+",返利金额:"+rebateMoney
    			+",红包编号："+redCode+",分期返送数:"+installment+",分期返送金额:"+installmentMoney+",操作状态:"+operactionType;
   }
}
