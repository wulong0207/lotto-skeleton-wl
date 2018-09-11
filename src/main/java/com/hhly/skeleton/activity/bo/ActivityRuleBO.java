package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class ActivityRuleBO extends BaseBO{

	private static final long serialVersionUID = -5073134307593919593L;

	/**
     * 规则主键id
     */
    private Integer id;

    /**
     * 活动配置主键id
     */
    private Integer activityConfigId;

    /**
     * 子玩法
     */
    private String lotteryChildCode;

    /**
     * 过关方式
     */
    private String lotteryPassType;

    /**
     * 类型: 1:时间, 2:期号, 3:场次
     */
    private Short ruleType;

    /**
     * 规则开始 ,当类型为时间时,时间格式为 yyyyMMdd hh:mm:ss
     */
    private String ruleStart;

    /**
     * 规则结束
     */
    private String ruleEnd;

    /**
     * 中奖金额开始
     */
    private Double winStartMoney;

    /**
     * 中奖金额结束
     */
    private Double winEndMoney;

    /**
     * 返利类型(1:金额;2:百分比)
     */
    private Short rebateType;

    /**
     * 返利值
     */
    private Double rebateNum;

    /**
     * 是否倍数(0:否;1:是)
     */
    private Short isMultiple;

    /**
     * 倍数减免, 集合(Num:Int:倍数;Money:Double:减免金额)
     */
    private String multipleSub;

    /**
     * 追号期数赠送,集合(num:Int:期数;add_num:Int:赠送期数)
     */
    private String addedAdd;

    /**
     * 用户操作:1手机认证, 2实名认证
     */
    private Short userAction;

    /**
     * 赠送类型, 1:彩金红包, 2:充值优惠券, 3:彩票
     */
    private Short giftType;

    /**
     * 赠送金额
     */
    private Double giftMoney;

    /**
     * 0:无效:1:有效
     */
    private Short status;
    /**子玩法名称*/
	private String childName;
	/**0：全部 1：单式；2：复式；3：胆拖；6：和值',*/
	private String contentType;
	/**单个用户享受次数*/
	private Short singleUserNum;
	/**是否追加*/
	private Short isAdd;	
	
    public Short getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(Short isAdd) {
		this.isAdd = isAdd;
	}

	public Short getSingleUserNum() {
		return singleUserNum;
	}

	public void setSingleUserNum(Short singleUserNum) {
		this.singleUserNum = singleUserNum;
	}

	public String getChildName() {
		return childName==null?lotteryChildCode:childName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
    /**
     * 规则主键id
     * @param id 规则主键id
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

   

    public String getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	/**
     * 过关方式
     * @return lottery_pass_type 过关方式
     */
    public String getLotteryPassType() {
        return lotteryPassType;
    }

    /**
     * 过关方式
     * @param lotteryPassType 过关方式
     */
    public void setLotteryPassType(String lotteryPassType) {
        this.lotteryPassType = lotteryPassType == null ? null : lotteryPassType.trim();
    }

    /**
     * 类型: 1:时间, 2:期号, 3:场次
     * @return rule_type 类型: 1:时间, 2:期号, 3:场次
     */
    public Short getRuleType() {
        return ruleType;
    }

    /**
     * 类型: 1:时间, 2:期号, 3:场次
     * @param ruleType 类型: 1:时间, 2:期号, 3:场次
     */
    public void setRuleType(Short ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * 规则开始
     * @return rule_start 规则开始
     */
    public String getRuleStart() {
        return ruleStart;
    }

    /**
     * 规则开始
     * @param ruleStart 规则开始
     */
    public void setRuleStart(String ruleStart) {
        this.ruleStart = ruleStart == null ? null : ruleStart.trim();
    }

    /**
     * 规则结束
     * @return rule_end 规则结束
     */
    public String getRuleEnd() {
        return ruleEnd;
    }

    /**
     * 规则结束
     * @param ruleEnd 规则结束
     */
    public void setRuleEnd(String ruleEnd) {
        this.ruleEnd = ruleEnd == null ? null : ruleEnd.trim();
    }

    /**
     * 中奖金额开始
     * @return win_start_money 中奖金额开始
     */
    public Double getWinStartMoney() {
        return winStartMoney;
    }

    /**
     * 中奖金额开始
     * @param winStartMoney 中奖金额开始
     */
    public void setWinStartMoney(Double winStartMoney) {
        this.winStartMoney = winStartMoney;
    }

    /**
     * 中奖金额结束
     * @return win_end_money 中奖金额结束
     */
    public Double getWinEndMoney() {
        return winEndMoney;
    }

    /**
     * 中奖金额结束
     * @param winEndMoney 中奖金额结束
     */
    public void setWinEndMoney(Double winEndMoney) {
        this.winEndMoney = winEndMoney;
    }

    /**
     * 返利类型(1:金额;2:百分比)
     * @return rebate_type 返利类型(1:金额;2:百分比)
     */
    public Short getRebateType() {
        return rebateType;
    }

    /**
     * 返利类型(1:金额;2:百分比)
     * @param rebateType 返利类型(1:金额;2:百分比)
     */
    public void setRebateType(Short rebateType) {
        this.rebateType = rebateType;
    }

    /**
     * 返利值
     * @return rebate_num 返利值
     */
    public Double getRebateNum() {
        return rebateNum;
    }

    /**
     * 返利值
     * @param rebateNum 返利值
     */
    public void setRebateNum(Double rebateNum) {
        this.rebateNum = rebateNum;
    }

    /**
     * 是否倍数(0:否;1:是)
     * @return is_multiple 是否倍数(0:否;1:是)
     */
    public Short getIsMultiple() {
        return isMultiple;
    }

    /**
     * 是否倍数(0:否;1:是)
     * @param isMultiple 是否倍数(0:否;1:是)
     */
    public void setIsMultiple(Short isMultiple) {
        this.isMultiple = isMultiple;
    }

    /**
     * 倍数减免, 集合(Num:Int:倍数;Money:Double:减免金额)
     * @return multiple_sub 倍数减免, 集合(Num:Int:倍数;Money:Double:减免金额)
     */
    public String getMultipleSub() {
        return multipleSub;
    }

    /**
     * 倍数减免, 集合(Num:Int:倍数;Money:Double:减免金额)
     * @param multipleSub 倍数减免, 集合(Num:Int:倍数;Money:Double:减免金额)
     */
    public void setMultipleSub(String multipleSub) {
        this.multipleSub = multipleSub == null ? null : multipleSub.trim();
    }

    /**
     * 追号期数赠送,集合(num:Int:期数;add_num:Int:赠送期数)
     * @return added_add 追号期数赠送,集合(num:Int:期数;add_num:Int:赠送期数)
     */
    public String getAddedAdd() {
        return addedAdd;
    }

    /**
     * 追号期数赠送,集合(num:Int:期数;add_num:Int:赠送期数)
     * @param addedAdd 追号期数赠送,集合(num:Int:期数;add_num:Int:赠送期数)
     */
    public void setAddedAdd(String addedAdd) {
        this.addedAdd = addedAdd == null ? null : addedAdd.trim();
    }

    /**
     * 用户操作:1手机认证, 2实名认证
     * @return user_action 用户操作:1手机认证, 2实名认证
     */
    public Short getUserAction() {
        return userAction;
    }

    /**
     * 用户操作:1手机认证, 2实名认证
     * @param userAction 用户操作:1手机认证, 2实名认证
     */
    public void setUserAction(Short userAction) {
        this.userAction = userAction;
    }

    /**
     * 赠送类型, 1:彩金红包, 2:充值优惠券, 3:彩票
     * @return gift_type 赠送类型, 1:彩金红包, 2:充值优惠券, 3:彩票
     */
    public Short getGiftType() {
        return giftType;
    }

    /**
     * 赠送类型, 1:彩金红包, 2:充值优惠券, 3:彩票
     * @param giftType 赠送类型, 1:彩金红包, 2:充值优惠券, 3:彩票
     */
    public void setGiftType(Short giftType) {
        this.giftType = giftType;
    }

    /**
     * 赠送金额
     * @return gift_moeny 赠送金额
     */
    public Double getGiftMoney() {
        return giftMoney;
    }

    /**
     * 赠送金额
     * @param giftMoney 赠送金额
     */
    public void setGiftMoney(Double giftMoney) {
        this.giftMoney = giftMoney;
    }

    /**
     * 0:无效:1:有效
     * @return status 0:无效:1:有效
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 0:无效:1:有效
     * @param status 0:无效:1:有效
     */
    public void setStatus(Short status) {
        this.status = status;
    }

	public Integer getId() {
		return id;
	}

}