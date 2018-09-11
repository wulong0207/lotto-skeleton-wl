package com.hhly.skeleton.user.vo;


import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 用户信息参数传递实体类
 * @desc
 * @author zhouyang
 * @date 2017年2月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserInfoVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 自增id（即帐号id）
	 */
	private Integer id;
	
	/**
	 * 账号综合平台id
	 */
	private String accountId;

	/**
	 * 帐号 （帐户名，手机号，邮箱地址）
	 */
	private String userName;
	
	/**
	 * 帐户名
	 */
	private String account;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 新密码
	 */
	private String password1;

	/**
	 * 确认新密码
	 */
	private String password2;
	
	/**
	 * 密码随机码
	 */
	private String rCode;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 手机号是否认证	0：未认证，1：已认证
	 */
	private Short mobileStatus;
	
	/**
	 * 是否开启手机号登录	0：禁用，1：启用
	 */
	private Short isMobileLogin;
	
	/**
	 * 电子邮箱
	 */
	private String email;

	/**
	 * 邮箱是否认证	0：未认证，1：已认证
	 */
	private Short emailStatus;
	
	/**
	 * 是否开启邮箱登录	0：禁用，1：启用
	 */
	private Short isEmailLogin;
	
	/**
	 * 账户状态
	 */
	private Short accountStatus;
	
	/**
	 * 头像URL
	 */
	private String headUrl;
	
	/**
	 * 头像状态	0：禁用，1：启用
	 */
	private Short headStatus;
	
	/**
	 * 用户昵称
	 */
	private String nickname;
	
	/**
	 * 姓名
	 */
	private String realName;
	
	/**
	 * 身份证号码
	 */
	private String idCard;
	
	/**
	 * 居住地址
	 */
	private String address;
	
	/**
	 * 性别
	 */
	private Short sex;
	
	/**
	 * 注册时间
	 */
	private Date registerTime;
	
	/**
	 * 登录时间
	 */
	private Date lastLoginTime;

	/**
	 * 账户注册渠道id
	 */
	private String channelId;

	/**
	 * 平台
	 */
	private Short platform;
	
	/**
	 * 用户ip地址
	 */
	private String ip;
	
	/**
	 * 帐号是否修改过 0：否，1：是
	 */
	private Short accountModify;
	
	/**
	 * 登录类型
	 */
	private Short loginType;
	
	/**
	 * 缓存key
	 */
	private String token;

	/**
	 * qqopenId
	 */
	private String qqOpenID;

	/**
	 * 新浪openId
	 */
	private String sinaBlogOpenID;

	/**
	 * 百度openId
	 */
	private String baiduOpenID;

	/**
	 * 微信openId
	 */
	private String wechatOpenID;

	/**
	 * 支付宝openId
	 */
	private String alipayOpenID;

	/**
	 * 京东openId
	 */
	private String jdOpenID;
	
	/**
	 * 渠道openId
	 */
	private String channelOpenID;

	/**
	 * 第三方帐号是第一次
	 */
	private Short fristRegister;

	/**
	 * 最后一次使用的银行卡号
	 */
	private String userPayCardcode;

	/**
	 * 代理编码
	 */
	private String agentCode;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 查询字段名
	 */
	private String queryField;

	/**
	 * 查询类型
	 */
	private Short type;

	/**
	 * 查询类型
	 */
	private String limitPlatform;

	/**
	 * 银行卡后8位
	 */
	private String cardNum;

	/**
	 * 验证码请求类型
	 */
	private Short sendType;


	public String getQqOpenID() {
		return qqOpenID;
	}

	public void setQqOpenID(String qqOpenID) {
		this.qqOpenID = qqOpenID;
	}

	public String getSinaBlogOpenID() {
		return sinaBlogOpenID;
	}

	public void setSinaBlogOpenID(String sinaBlogOpenID) {
		this.sinaBlogOpenID = sinaBlogOpenID;
	}

	public String getBaiduOpenID() {
		return baiduOpenID;
	}

	public void setBaiduOpenID(String baiduOpenID) {
		this.baiduOpenID = baiduOpenID;
	}

	public String getWechatOpenID() {
		return wechatOpenID;
	}

	public void setWechatOpenID(String wechatOpenID) {
		this.wechatOpenID = wechatOpenID;
	}

	public String getAlipayOpenID() {
		return alipayOpenID;
	}

	public void setAlipayOpenID(String alipayOpenID) {
		this.alipayOpenID = alipayOpenID;
	}

	public String getJdOpenID() {
		return jdOpenID;
	}

	public void setJdOpenID(String jdOpenID) {
		this.jdOpenID = jdOpenID;
	}

	
	public String getChannelOpenID() {
		return channelOpenID;
	}

	public void setChannelOpenID(String channelOpenID) {
		this.channelOpenID = channelOpenID;
	}

	public UserInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfoVO(Integer id, String accountId, String account, String password, String rCode, String mobile,
			Short mobileStatus, Short isMobileLogin, String email, Short emailStatus, Short isEmailLogin,
			Short accountStatus, String headUrl, Short headStatus, String nickname, String realName, String idCard,
			String address, Short sex, Date registerTime, Date lastLoginTime, String channelId, String ip,
			Short accountModify, Short loginType) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.account = account;
		this.password = password;
		this.rCode = rCode;
		this.mobile = mobile;
		this.mobileStatus = mobileStatus;
		this.isMobileLogin = isMobileLogin;
		this.email = email;
		this.emailStatus = emailStatus;
		this.isEmailLogin = isEmailLogin;
		this.accountStatus = accountStatus;
		this.headUrl = headUrl;
		this.headStatus = headStatus;
		this.nickname = nickname;
		this.realName = realName;
		this.idCard = idCard;
		this.address = address;
		this.sex = sex;
		this.registerTime = registerTime;
		this.lastLoginTime = lastLoginTime;
		this.channelId = channelId;
		this.ip = ip;
		this.accountModify = accountModify;
		this.loginType = loginType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getrCode() {
		return rCode;
	}

	public void setrCode(String rCode) {
		this.rCode = rCode;
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

	public Short getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Short accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public Short getHeadStatus() {
		return headStatus;
	}

	public void setHeadStatus(Short headStatus) {
		this.headStatus = headStatus;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Short getAccountModify() {
		return accountModify;
	}

	public void setAccountModify(Short accountModify) {
		this.accountModify = accountModify;
	}

	public Short getLoginType() {
		return loginType;
	}

	public void setLoginType(Short loginType) {
		this.loginType = loginType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getFristRegister() {
		return fristRegister;
	}

	public void setFristRegister(Short fristRegister) {
		this.fristRegister = fristRegister;
	}

	public String getUserPayCardcode() {
		return userPayCardcode;
	}

	public void setUserPayCardcode(String userPayCardcode) {
		this.userPayCardcode = userPayCardcode;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getQueryField() {
		return queryField;
	}

	public void setQueryField(String queryField) {
		this.queryField = queryField;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getLimitPlatform() {
		return limitPlatform;
	}

	public void setLimitPlatform(String limitPlatform) {
		this.limitPlatform = limitPlatform;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Short getSendType() {
		return sendType;
	}

	public void setSendType(Short sendType) {
		this.sendType = sendType;
	}
}
