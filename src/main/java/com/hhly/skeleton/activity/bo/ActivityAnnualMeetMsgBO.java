package com.hhly.skeleton.activity.bo;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * @desc 年会活动返回前端信息
 * @author lidecheng
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityAnnualMeetMsgBO extends BaseBO{
	/**
	 * 活动编号
	 */
	private String activityCode;
	/**
	 * 活动开始时间
	 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date activityStartTime;
	
	/**
	 * 活动结束时间
	 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date activityEndTime;
	/**
	 * 赠送期号
	 */
	private String issueCode;
	
	/**
	 * 赠送彩期的开始销售时间（年会页面倒计时时间）
	 * @return
	 */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date saleTime;

    /**
     * 输入用户是否显示倒计时：0否，1是   默认否
     */
    private Short status = 0;
    public ActivityAnnualMeetMsgBO(){
    	
    }
    public ActivityAnnualMeetMsgBO(ActivityBO actBO){
    	this.activityCode=actBO.getActivityCode();
    	this.activityStartTime=actBO.getActivityStartTime();
    	this.activityEndTime=actBO.getActivityEndTime();
    }
	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Date getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Date getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Date getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}			
}
