package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class CommonCodeBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 验证码
	 */
	private String code;
	
	/**
	 * 验证码唯一标识
	 */
	private String token;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
