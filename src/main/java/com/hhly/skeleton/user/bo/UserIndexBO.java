package com.hhly.skeleton.user.bo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

public class UserIndexBO extends BaseBO {

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
	 * 是否修改帐户名
	 */
	@JsonProperty("acc_m")
	private Short accountModify;
	
	/**
	 * 头像URL
	 */
	@JsonProperty("hd_url")
	private String headUrl;
	
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
	 * 姓名
	 */
	@JsonProperty("re_nm")
	private String realName;
	
	/**
	 * 身份证号码
	 */
	@JsonProperty("id_c")
	private String idCard;

	/**
	 * 上次登录时间 
	 */
	@JsonProperty("log_tm")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date lastLoginTime;

	/**
	 * ip
	 */
	@JsonProperty("ip")
	private String ip;
	
	/**
	 * 是否设置密码
	 */
	@JsonProperty("set_pwd")
	private Short isSetPassword;

	/**
	 * 账户余额
	 */
	@JsonProperty("u_wlt_blc")
	private Double userWalletBalance = 0d;
	
	/**
	 * 红包余额
	 */
	@JsonProperty("u_pk_blc")
	private Double redPackBalance = 0d;
	
	/**
	 * 账户金额是否有变动
	 */
	@JsonProperty("is_upd_wlt")
	private Short isUpdateWallet;
	
	/**
	 * 钱包金额是否有变动
	 */
	@JsonProperty("is_upd_rp")
	private Short isUpdateRedPack;
	
	/**
	 * 过期红包个数
	 */
	@JsonProperty("pst_d_ct")
	private Integer expireCount = 0;

	/**
	 * 账户安全积分
	 */
	@JsonProperty("sf_intgl")
	private Integer safeIntegral = 0;
	
	/**
	 * 绑定银行卡数量
	 */
	@JsonProperty("bk_ct")
	private Integer bankCount;

	/**
	 * 银行卡号
	 */
	@JsonProperty("bk_card")
	private String bankCard;

	/**
	 * 是否实名认证
	 */
	@JsonProperty("att_rn")
	private Short attestationRealName;

	/**
	 * QQ昵称
	 */
	@JsonProperty("qq_nm")
	private String qqName;

	/**
	 * 微信昵称
	 */
	@JsonProperty("wx_nm")
	private String wechatName;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Short getAccountModify() {
		return accountModify;
	}

	public void setAccountModify(Short accountModify) {
		this.accountModify = accountModify;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Double getUserWalletBalance() {
		return userWalletBalance;
	}

	public void setUserWalletBalance(Double userWalletBalance) {
		this.userWalletBalance = userWalletBalance;
	}

	public Double getRedPackBalance() {
		return redPackBalance;
	}

	public void setRedPackBalance(Double redPackBalance) {
		this.redPackBalance = redPackBalance;
	}

	public Integer getExpireCount() {
		return expireCount;
	}

	public void setExpireCount(Integer expireCount) {
		this.expireCount = expireCount;
	}

	public Short getIsSetPassword() {
		return isSetPassword;
	}

	public void setIsSetPassword(Short isSetPassword) {
		this.isSetPassword = isSetPassword;
	}

	public Short getIsUpdateWallet() {
		return isUpdateWallet;
	}

	public void setIsUpdateWallet(Short isUpdateWallet) {
		this.isUpdateWallet = isUpdateWallet;
	}

	public Short getIsUpdateRedPack() {
		return isUpdateRedPack;
	}

	public void setIsUpdateRedPack(Short isUpdateRedPack) {
		this.isUpdateRedPack = isUpdateRedPack;
	}

	public Integer getSafeIntegral() {
		return safeIntegral;
	}

	public void setSafeIntegral(Integer safeIntegral) {
		this.safeIntegral = safeIntegral;
	}

	public Integer getBankCount() {
		return bankCount;
	}

	public void setBankCount(Integer bankCount) {
		this.bankCount = bankCount;
	}

	public Short getAttestationRealName() {
		return attestationRealName;
	}

	public void setAttestationRealName(Short attestationRealName) {
		this.attestationRealName = attestationRealName;
	}

	public String getQqName() {
		return qqName;
	}

	public void setQqName(String qqName) {
		this.qqName = qqName;
	}

	public String getWechatName() {
		return wechatName;
	}

	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
}
