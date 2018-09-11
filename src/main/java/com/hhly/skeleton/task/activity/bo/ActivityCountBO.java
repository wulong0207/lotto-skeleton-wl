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
public class ActivityCountBO extends BaseBO{
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
    private String createBy;
    private String channelId;
    public ActivityCountBO(){
    	
    }
    public ActivityCountBO(ActivityCouponCountBO actBO,String createBy){
    	this.id = actBO.getId();
    	this.operactionType = actBO.getOperactionType();
    	this.redCode = actBO.getRedCode();
		this.createBy = createBy;
    }
	public Short getOperactionType() {
		return operactionType;
	}

	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
    public String toString(){
    	return "红包id:"+id+",活动编码:"+activityCode+",活动规则明细+"+activityRuleId+",用户id:"+userId+",返利金额:"+rebateMoney
    			+",红包编号："+redCode+",分期返送数:"+installment+",分期返送金额:"+installmentMoney+",操作状态:"+operactionType;
   }
}
