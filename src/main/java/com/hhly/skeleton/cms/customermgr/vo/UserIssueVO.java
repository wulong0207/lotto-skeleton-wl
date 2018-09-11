package com.hhly.skeleton.cms.customermgr.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class UserIssueVO extends PageVO {
    
	private Integer id;
	private List<Integer> ids;
	private List<Integer> negativeIds;
	private Integer status;
	private Integer level;
	
	private boolean joinIssueLevel;
	private boolean joinUser;
	private boolean joinOrderIssue;
	private Integer userType;
	
	private String userTypeValue;
	
	private Integer timeType;
	
	private Date startTime;
	
	private Date endTime;
	
	private Integer lotteryCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public boolean isJoinIssueLevel() {
		return joinIssueLevel;
	}
	public void setJoinIssueLevel(boolean joinIssueLevel) {
		this.joinIssueLevel = joinIssueLevel;
	}
	public boolean isJoinUser() {
		return joinUser;
	}
	public void setJoinUser(boolean joinUser) {
		this.joinUser = joinUser;
	}
	
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public String getUserTypeValue() {
		return userTypeValue;
	}
	public void setUserTypeValue(String userTypeValue) {
		this.userTypeValue = userTypeValue;
	}
	public Integer getTimeType() {
		return timeType;
	}
	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
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
	
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public boolean isJoinOrderIssue() {
		return joinOrderIssue;
	}
	public void setJoinOrderIssue(boolean joinOrderIssue) {
		this.joinOrderIssue = joinOrderIssue;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public List<Integer> getNegativeIds() {
		return negativeIds;
	}
	public void setNegativeIds(List<Integer> negativeIds) {
		this.negativeIds = negativeIds;
	}
	@Override
	public String toString() {
		return "UserIssueVO [id=" + id + ", status=" + status + "]";
	}
	
}