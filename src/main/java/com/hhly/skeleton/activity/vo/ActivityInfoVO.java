package com.hhly.skeleton.activity.vo;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.activity.bo.ActivityBO;
import com.hhly.skeleton.activity.bo.OrderInfoBO;
import com.hhly.skeleton.activity.bo.TransRechargeBO;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.user.bo.UserInfoBO;


/**
 * @desc 活动明细vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityInfoVO extends BaseBO{
	private Integer id;
	/**用户id*/
	private String userId;
	/**订单创建时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date  createTime;
	/**
     * 活动编码
     */
    private String activityCode;
    private Integer activityType;
    private Short userAction;
    /**用户真实名称*/
	private String actualName;
	private String idNum;
	private String mobile;
	private Date  startTime;
	private Date  endTime;
	private Integer rowNum;
	private String orderCode;
	private Integer activityRuleId;
	/**支付状态*/
	private Short payStatus;
	/**追号期数*/
	private Integer addNum;
	/**白名单字典编号*/
	private String whiteListDicCode;
    public ActivityInfoVO(){
    	
    }
    public ActivityInfoVO(OrderInfoBO orderInfoBO,ActivityBO actBO){
    	this.userId = orderInfoBO.getUserId();
    	this.createTime = orderInfoBO.getCreateTime();
    	this.activityCode = actBO.getActivityCode();
    	this.actualName = orderInfoBO.getActualName();
    	this.idNum = orderInfoBO.getIdNum();
    }
    public ActivityInfoVO(TransRechargeBO transRechargeBO,ActivityBO actBO){
    	this.userId = transRechargeBO.getUserId();
    	this.createTime = transRechargeBO.getCreateTime();
    	this.activityCode = actBO.getActivityCode();
    	this.actualName = transRechargeBO.getActualName();
    	this.idNum = transRechargeBO.getIdNum();
    	this.startTime = actBO.getActivityStartTime();
    	this.endTime = actBO.getActivityEndTime();
    	this.mobile = transRechargeBO.getMobile();
    }
    public ActivityInfoVO(UserInfoBO userInfoBO,Date createTime,String activityCode){
    	this.userId = ""+userInfoBO.getId();
    	this.createTime = createTime;
    	this.activityCode = activityCode;
    	this.actualName = userInfoBO.getRealName();
    	this.idNum =userInfoBO.getIdCard();
    	this.mobile = userInfoBO.getMobile();
    }
    public ActivityInfoVO(UserInfoBO userInfoBO,ActivityBO actBO){
    	this.userId = ""+userInfoBO.getId();
    	this.startTime = actBO.getActivityStartTime();
    	this.endTime = actBO.getActivityEndTime();
    	this.idNum =userInfoBO.getIdCard();
    	this.mobile = userInfoBO.getMobile();
    }
    public ActivityInfoVO(ActivityBO actBO,UserInfoBO userInfoBO){
    	this.mobile = userInfoBO.getMobile();
    	this.userId = ""+userInfoBO.getId();
    	this.idNum =userInfoBO.getIdCard();
    }
    public ActivityInfoVO(ActivityBO actBO,TransRechargeBO userInfoBO){
    	this.mobile = userInfoBO.getMobile();
    	this.userId = ""+userInfoBO.getUserId();
    	this.idNum =userInfoBO.getIdNum();
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public Integer getActivityType() {
		return activityType;
	}
	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}
	public Short getUserAction() {
		return userAction;
	}
	public void setUserAction(Short userAction) {
		this.userAction = userAction;
	}
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getActivityRuleId() {
		return activityRuleId;
	}
	public void setActivityRuleId(Integer activityRuleId) {
		this.activityRuleId = activityRuleId;
	}
	public Short getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}
	public Integer getAddNum() {
		return addNum;
	}
	public void setAddNum(Integer addNum) {
		this.addNum = addNum;
	}
	public String getWhiteListDicCode() {
		return whiteListDicCode;
	}
	public void setWhiteListDicCode(String whiteListDicCode) {
		this.whiteListDicCode = whiteListDicCode;
	}		
	
}
