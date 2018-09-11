package com.hhly.skeleton.user.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

public class RealNameBO extends BaseBO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 帐户名
	 */
	@JsonProperty("acc")
	private String account;

	/**
	 * 是否实名认证
	 */
	@JsonProperty("is_pre_rn")
	private Short isPreRealName;
	
	public RealNameBO() {
		super();
	}

	public RealNameBO(String account, Short isPreRealName) {
		this.account = account;
		this.isPreRealName = isPreRealName = 0;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Short getIsPreRealName() {
		return isPreRealName;
	}

	public void setIsPreRealName(Short isPreRealName) {
		this.isPreRealName = isPreRealName;
	}
}
