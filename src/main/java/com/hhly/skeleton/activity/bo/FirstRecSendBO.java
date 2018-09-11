package com.hhly.skeleton.activity.bo;
import com.hhly.skeleton.base.bo.BaseBO;

public class FirstRecSendBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1665145004694956227L;
	
	/**
	 * 剩余活动数量
	 */
	private Integer surplus ;
	private String activityCode;
	private String realName;
	private Double minMoney;
	/**
	 * 活动状态
	 */
	private Short activityStatus;
	public FirstRecSendBO(){
		
	}
	public FirstRecSendBO(Short activityStatus){
		this.activityStatus = activityStatus;
	}
	public FirstRecSendBO(Integer surplus,String activityCode,Double minMoney,String realName){
		this.surplus = surplus;
		this.activityCode = activityCode;
		this.minMoney = minMoney;
		this.realName = realName;
	}
	
	public Short getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(Short activityStatus) {
		this.activityStatus = activityStatus;
	}

	public FirstRecSendBO(String realName){
		this.realName = realName;
	}
	public Integer getSurplus() {
		return surplus;
	}

	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public void setSurplus(Integer surplus) {
		this.surplus = surplus;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public Double getMinMoney() {
		return minMoney;
	}
	public void setMinMoney(Double minMoney) {
		this.minMoney = minMoney;
	}
	
}
