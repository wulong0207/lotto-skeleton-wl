package com.hhly.skeleton.cms.operatemgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class OperateRebateUserVO extends PageVO {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 状态; 0:无效;1:有效;
     */
    private Integer status;

    /**
     * 竞彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate:返利设置)l示例:ottery_category:1,status:1,lottery_code:300,301,rebate:14.99
     */
    private String matchRule;

    /**
     * 竞技彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    private String sportRule;

    /**
     * 高频彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    private String highRule;

    /**
     * 数字彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    private String numRule;

    /**
     * 1:出票成功;
     */
    private Integer orderType;

    /**
     * 返佣周期：1每单，2每天
     */
    private Integer rebateType;

    /**
     * 累计返佣
     */
    private Double sendAmount;

    /**
     * 合作时间
     */
    private Date cooperateTime;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 0;历史;1:当前;
     */
    private Integer type;
    private Date startTime;
    private Date endTime;
    /**用户账号*/
    private String accountName;
    /**用户真实姓名*/
    private String actualName;
    /**手机号*/
    private String mobile;
    
    public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
     * 自增ID
     * @return id 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 状态; 0:无效;1:有效;
     * @return status 状态; 0:无效;1:有效;
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态; 0:无效;1:有效;
     * @param status 状态; 0:无效;1:有效;
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 竞彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate:返利设置)l示例:ottery_category:1,status:1,lottery_code:300,301,rebate:14.99
     * @return match_rule 竞彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate:返利设置)l示例:ottery_category:1,status:1,lottery_code:300,301,rebate:14.99
     */
    public String getMatchRule() {
        return matchRule;
    }

    /**
     * 竞彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate:返利设置)l示例:ottery_category:1,status:1,lottery_code:300,301,rebate:14.99
     * @param matchRule 竞彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate:返利设置)l示例:ottery_category:1,status:1,lottery_code:300,301,rebate:14.99
     */
    public void setMatchRule(String matchRule) {
        this.matchRule = matchRule == null ? null : matchRule.trim();
    }

    /**
     * 竞技彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @return sport_rule 竞技彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public String getSportRule() {
        return sportRule;
    }

    /**
     * 竞技彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @param sportRule 竞技彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public void setSportRule(String sportRule) {
        this.sportRule = sportRule == null ? null : sportRule.trim();
    }

    /**
     * 高频彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @return high_rule 高频彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public String getHighRule() {
        return highRule;
    }

    /**
     * 高频彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @param highRule 高频彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public void setHighRule(String highRule) {
        this.highRule = highRule == null ? null : highRule.trim();
    }

    /**
     * 数字彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @return num_rule 数字彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public String getNumRule() {
        return numRule;
    }

    /**
     * 数字彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     * @param numRule 数字彩规则对象(lottery_category:彩种类型;status:状态;lottery_code:彩种;rebate_set:返利设置)
     */
    public void setNumRule(String numRule) {
        this.numRule = numRule == null ? null : numRule.trim();
    }

    /**
     * 1:出票成功;
     * @return order_type 1:出票成功;
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 1:出票成功;
     * @param orderType 1:出票成功;
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 返佣周期：1每单，2每天
     * @return rebate_type 返佣周期：1每单，2每天
     */
    public Integer getRebateType() {
        return rebateType;
    }

    /**
     * 返佣周期：1每单，2每天
     * @param rebateType 返佣周期：1每单，2每天
     */
    public void setRebateType(Integer rebateType) {
        this.rebateType = rebateType;
    }

    /**
     * 累计返佣
     * @return send_amount 累计返佣
     */
    public Double getSendAmount() {
        return sendAmount;
    }

    /**
     * 累计返佣
     * @param sendAmount 累计返佣
     */
    public void setSendAmount(Double sendAmount) {
        this.sendAmount = sendAmount;
    }

    /**
     * 合作时间
     * @return cooperate_time 合作时间
     */
    public Date getCooperateTime() {
        return cooperateTime;
    }

    /**
     * 合作时间
     * @param cooperateTime 合作时间
     */
    public void setCooperateTime(Date cooperateTime) {
        this.cooperateTime = cooperateTime;
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

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 0;历史;1:当前;
     * @return type 0;历史;1:当前;
     */
    public Integer getType() {
        return type;
    }

    /**
     * 0;历史;1:当前;
     * @param type 0;历史;1:当前;
     */
    public void setType(Integer type) {
        this.type = type;
    }
}