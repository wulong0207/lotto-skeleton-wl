package com.hhly.skeleton.activity.bo;



import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 竟足/竞篮首投活动相关信息，此活动是后台配置死的
 * @date 2017/8/3 16:28
 * @company 益彩网络科技公司
 */
public class ActivityMutilBetInfoBO extends BaseBO {
	
    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 活动名称
     */
    private String activityName;
    /**
     * 类型: 1:时间, 2:期号, 3:场次
     */
    private Short ruleType;
    /**
     * 活动开始时间
     */
    private String ruleStart;

    /**
     * 活动结束时间
     */
    private String ruleEnd;
    
    /**
     * 子彩种
     */
    private String lotteryChildCode;
    
    /**
     * 子玩法
     */
    private String lotteryPassType;
    /**
     * 竟足首投活动规则
     */
    private String multipleSub ;
    private List<JzstActivityRule> jzstActivityRules;

    public String getActivityCode() {
        return activityCode;
    }

    public List<JzstActivityRule> getJzstActivityRules() {
        return jzstActivityRules;
    }

    public void setJzstActivityRules(List<JzstActivityRule> jzstActivityRules) {
        this.jzstActivityRules = jzstActivityRules;
    }

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Short getRuleType() {
		return ruleType;
	}

	public void setRuleType(Short ruleType) {
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

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getMultipleSub() {
		return multipleSub;
	}

	public void setMultipleSub(String multipleSub) {
		this.multipleSub = multipleSub;
	}
	
}
