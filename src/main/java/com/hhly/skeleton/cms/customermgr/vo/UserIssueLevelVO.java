package com.hhly.skeleton.cms.customermgr.vo;

import java.util.Date;
import java.util.Set;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class UserIssueLevelVO extends PageVO {
    
	private Integer id;
	private Integer userIssueInfoId;
	private Integer lotteryCode;
	private Integer level;
	private Date createTime;
	private String modifyBy;
	private Date modifyTime;
	private Date updateTime;
	
	private Set<Integer> userIssueInfoIds;
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Integer getUserIssueInfoId() {
		return userIssueInfoId;
	}
	public void setUserIssueInfoId(Integer userIssueInfoId) {
		this.userIssueInfoId = userIssueInfoId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Set<Integer> getUserIssueInfoIds() {
		return userIssueInfoIds;
	}
	public void setUserIssueInfoIds(Set<Integer> userIssueInfoIds) {
		this.userIssueInfoIds = userIssueInfoIds;
	}
	@Override
	public String toString() {
		return "UserIssueLevelVO [id=" + id + ", userIssueInfoId=" + userIssueInfoId + ", lotteryCode=" + lotteryCode
				+ ", level=" + level + "]";
	}
}