package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class GroupUserVO extends PageVO {
	
	private Integer id;
	/**
	 * 是否加推荐 0：不推荐；1：推荐；
	 */
	private Short isRecommend;
	private Short flag;
	private String userType;
	private String userTypeVal;
	
	public Short getFlag() {
		return flag;
	}

	public void setFlag(Short flag) {
		this.flag = flag;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserTypeVal() {
		return userTypeVal;
	}

	public void setUserTypeVal(String userTypeVal) {
		this.userTypeVal = userTypeVal;
	}

	public Short getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}