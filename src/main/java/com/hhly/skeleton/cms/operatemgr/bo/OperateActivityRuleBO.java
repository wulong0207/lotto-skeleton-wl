package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class OperateActivityRuleBO extends BaseBO {
    /**
     * 规则主键id
     */
    private Integer id;

    /**
     * 活动配置主键id
     */
    private Integer activityConfigId;
    
    /**
     * 彩种
     */
    private Integer lotteryCode;

    /**
     * 子彩种
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
     * 规则开始
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

    /**
     * 创建人姓名
     */
    private String createBy;

    /**
     * 创建时间
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改人姓名
     */
    private String modifyBy;

    /**
     * 修改时间(人为修改时:修改此时间)
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    /**
     * 更新时间(程序应用更新时,修改此时间)
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
	 /**
     * 内容类型
     */
    private String contentType;

	private Short singleUserNum;
	/**
	 * 是否追加
	 */
	private Short isAdd;

    /**
     * 世界杯冠军竞猜活动配置详情
     */
	private List<OperateActivityChpGuessBO> chpGuesses;
	
	
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

	public String getContentType() {
		return contentType;
	}
    
    public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
     * 规则主键id
     * @return id 规则主键id
     */
    public Integer getId() {
        return id;
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

    public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
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

    public Double getGiftMoney() {
        return giftMoney;
    }

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

    /**
     * 创建人姓名
     * @return create_by 创建人姓名
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人姓名
     * @param createBy 创建人姓名
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人姓名
     * @return modify_by 修改人姓名
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 修改人姓名
     * @param modifyBy 修改人姓名
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }



    /**

     * 修改时间(人为修改时:修改此时间)
     * @return modify_time 修改时间(人为修改时:修改此时间)
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间(人为修改时:修改此时间)
     * @param modifyTime 修改时间(人为修改时:修改此时间)
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 更新时间(程序应用更新时,修改此时间)
     * @return update_time 更新时间(程序应用更新时,修改此时间)
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间(程序应用更新时,修改此时间)
     * @param updateTime 更新时间(程序应用更新时,修改此时间)
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<OperateActivityChpGuessBO> getChpGuesses() {
        return chpGuesses;
    }

    public void setChpGuesses(List<OperateActivityChpGuessBO> chpGuesses) {
        this.chpGuesses = chpGuesses;
    }
}