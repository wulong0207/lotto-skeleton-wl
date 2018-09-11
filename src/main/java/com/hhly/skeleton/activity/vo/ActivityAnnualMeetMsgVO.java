package com.hhly.skeleton.activity.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * @desc 年会活动
 * @author lidecheng
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityAnnualMeetMsgVO extends BaseBO{
	/**
	 * 追号活动id
	 */
	private Integer addId;
	/**
	 * 活动编号
	 */
	private String activityCode;
	/**
	 * 赠送彩期
	 */
	private String giveIssue;
	
	/**
	 * 是否赠送红包 0否 ，1是
	 */
	private Short isSendRed;
	/**
	 * 用户id列表,逗号分隔
	 */
	private String userIds;
	
	
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public Short getIsSendRed() {
		return isSendRed;
	}
	public void setIsSendRed(Short isSendRed) {
		this.isSendRed = isSendRed;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getGiveIssue() {
		return giveIssue;
	}
	public void setGiveIssue(String giveIssue) {
		this.giveIssue = giveIssue;
	}	
	
	public String getUserIds() {
		return userIds;
	}
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}
	public String toString(){
		return "活动编号:"+this.activityCode+"购买期号:"+this.giveIssue+"是否赠送红包:"+this.isSendRed;
	}
	
}
