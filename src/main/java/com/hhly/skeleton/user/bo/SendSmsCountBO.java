package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class SendSmsCountBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 发送次数
	 */
	private Integer count;

	/**
	 * 帐户名
	 */
	private String account;

	public SendSmsCountBO() {
		super();
	}

	public SendSmsCountBO(Integer count) {
		super();
		this.count = count;
	}

	public SendSmsCountBO(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
