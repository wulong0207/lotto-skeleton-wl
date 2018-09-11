package com.hhly.skeleton.lotto.base.ordercopy.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

public class MUserIssueLinkVO extends PageVO{

    private static final long serialVersionUID = 1L;

	/**
     * 主键
     */
    private Integer id;

    /**
     * m_user_issue_info主键ID
     */
    private Integer userIssueId;

    /**
     * m_user_info主键id
     */
    private Integer userId;

    /**
     * 关注时间
     */
    private Date beginTime;

    /**
     * 取消关注时间
     */
    private Date endTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 数据有效性，默认1：有效；0：无效
     */
    private Boolean dataStatus;
    /**
     * 用户登录token
     */
    private String token;
    /**
     * 操作标识
     */
    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserIssueId() {
        return userIssueId;
    }

    public void setUserIssueId(Integer userIssueId) {
        this.userIssueId = userIssueId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Boolean dataStatus) {
        this.dataStatus = dataStatus;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}