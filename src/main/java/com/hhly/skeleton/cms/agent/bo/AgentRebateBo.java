package com.hhly.skeleton.cms.agent.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

public class AgentRebateBo extends BaseBO {

	private Integer id;
	private Date createTime;

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

}
