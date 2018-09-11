package com.hhly.skeleton.activity.bo;
/**
 * @desc 活动明细信息开发
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ActivityInfoBO {
    /**
     * 活动明细id
     */
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

   
    /**
     * 操作类型(1:未处理;2:等待处理:3:已处理)
     */
    private Short operactionType;

    /**
     * 活动明细id
     * @return id 活动明细id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 活动明细id
     * @param id 活动明细id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 活动编码
     * @return activity_code 活动编码
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * 活动编码
     * @param activityCode 活动编码
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode == null ? null : activityCode.trim();
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
     * 用户真实姓名
     * @return actual_name 用户真实姓名
     */
    public String getActualName() {
        return actualName;
    }

    /**
     * 用户真实姓名
     * @param actualName 用户真实姓名
     */
    public void setActualName(String actualName) {
        this.actualName = actualName == null ? null : actualName.trim();
    }

    /**
     * 用户身份证号
     * @return id_num 用户身份证号
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 用户身份证号
     * @param idNum 用户身份证号
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    /**
     * 返利金额
     * @return rebate_money 返利金额
     */
    public Double getRebateMoney() {
        return rebateMoney;
    }

    /**
     * 返利金额
     * @param rebateMoney 返利金额
     */
    public void setRebateMoney(Double rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    /**
     * 订单编码
     * @return order_code 订单编码
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单编码
     * @param orderCode 订单编码
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 红包编码
     * @return red_code 红包编码
     */
    public String getRedCode() {
        return redCode;
    }

    /**
     * 红包编码
     * @param redCode 红包编码
     */
    public void setRedCode(String redCode) {
        this.redCode = redCode == null ? null : redCode.trim();
    }

 
    /**
     * 操作类型(1:未处理;2:等待处理:3:已处理)
     * @return operaction_type 操作类型(1:未处理;2:等待处理:3:已处理)
     */
    public Short getOperactionType() {
        return operactionType;
    }

    /**
     * 操作类型(1:未处理;2:等待处理:3:已处理)
     * @param operactionType 操作类型(1:未处理;2:等待处理:3:已处理)
     */
    public void setOperactionType(Short operactionType) {
        this.operactionType = operactionType;
    }

	public Integer getActivityRuleId() {
		return activityRuleId;
	}

	public void setActivityRuleId(Integer activityRuleId) {
		this.activityRuleId = activityRuleId;
	}
    
}