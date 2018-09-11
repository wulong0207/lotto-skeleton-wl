package com.hhly.skeleton.cms.customermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class UserIssueLevelBO extends BaseBO{
    
	private Integer id;
	private Integer level;
	private Integer userIssueInfoId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
}