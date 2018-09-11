package com.hhly.skeleton.user.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.pay.bo.PayBankcardBO;

import java.util.List;

public class UserResultBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 自增id（即帐号id）
	 */
	@JsonProperty("u_id")
	private Integer id;
	
	/**
	 * 帐户名
	 */
	@JsonProperty("acc")
	private String account;
	
	/**
	 * 姓名
	 */
	@JsonProperty("re_nm")
	private String realName;
	
	/**
	 * 手机号
	 */
	@JsonProperty("mob")
	private String mobile;

	/**
	 * 手机号是否认证	0：未认证，1：已认证
	 */
	@JsonProperty("mob_sts")
	private Short mobileStatus;

	/**
	 * 是否开启手机号登录	0：禁用，1：启用
	 */
	@JsonProperty("mob_log")
	private Short isMobileLogin;
	
	/**
	 * 电子邮箱
	 */
	@JsonProperty("em")
	private String email;

	/**
	 * 邮箱是否认证	0：未认证，1：已认证
	 */
	@JsonProperty("em_sts")
	private Short emailStatus;

	/**
	 * 是否开启邮箱登录	0：禁用，1：启用
	 */
	@JsonProperty("em_log")
	private Short isEmailLogin;
	
	/**
	 * 银行卡列表
	 */
	private List<PayBankcardBO> bankList;

	/**
	 * 默认银行卡
	 */
	@JsonProperty("dft_cd")
	private String defualtCard;

	/**
	 * 是否设置密码
	 */
	@JsonProperty("set_pwd")
	private Short isSetPassword;
    
    /**
     * 头像地址
     */
    @JsonProperty("hd_url")
    private String headerUrl;

	/**
	 * 返回状态码
	 */
	private Short status;

	/**
	 * 银行名称
	 */
	private String bankName;
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeaderUrl () {
        return headerUrl;
    }
    
    public void setHeaderUrl (String headerUrl) {
        this.headerUrl = headerUrl;
    }
    
    public String getAccount () {
        return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public Short getMobileStatus() {
		return mobileStatus;
	}

	public void setMobileStatus(Short mobileStatus) {
		this.mobileStatus = mobileStatus;
	}

	public Short getIsMobileLogin() {
		return isMobileLogin;
	}

	public void setIsMobileLogin(Short isMobileLogin) {
		this.isMobileLogin = isMobileLogin;
	}

	public Short getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(Short emailStatus) {
		this.emailStatus = emailStatus;
	}

	public Short getIsEmailLogin() {
		return isEmailLogin;
	}

	public void setIsEmailLogin(Short isEmailLogin) {
		this.isEmailLogin = isEmailLogin;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getIsSetPassword() {
		return isSetPassword;
	}

	public void setIsSetPassword(Short isSetPassword) {
		this.isSetPassword = isSetPassword;
	}

	public List<PayBankcardBO> getBankList() {
		return bankList;
	}

	public void setBankList(List<PayBankcardBO> bankList) {
		this.bankList = bankList;
	}

	public String getDefualtCard() {
		return defualtCard;
	}

	public void setDefualtCard(String defualtCard) {
		this.defualtCard = defualtCard;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}
