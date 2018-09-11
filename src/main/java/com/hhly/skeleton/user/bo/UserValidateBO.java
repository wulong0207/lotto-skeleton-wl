package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class UserValidateBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 邮箱地址
	 */
	private String email;
	
	/**
	 * 银行卡号
	 */
	private String bankNumber;
	
	/**
	 * 验证码
	 */
	private String code;
	
	/**
	 * 是否通过验证
	 */
	private Short validatePass;
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Short getValidatePass() {
		return validatePass;
	}

	public void setValidatePass(Short validatePass) {
		this.validatePass = validatePass;
	}
	
}
