package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class PassportVO extends BaseVO {

    /**勿扰时间段*/
    String timeStr;
    /**开关状态*/
    Integer switchStatus;
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 帐号id
	 */
	private Integer userId;

	/**
	 * 帐号
	 */
	private String userName;
	
	/**
	 * 原密码
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
	 * 验证码
	 */
	private String code;
	
	/**
	 * 缓存key
	 */
	private String token;
	
	/**
	 * 帐户名
	 */
	private String account;

	/**
	 * 昵称
	 */
	private String nickname;
	
	/**
	 * 手机号码
	 */
	private String mobile;
	
	/**
	 * 邮箱地址
	 */
	private String email;
	
	/**
	 * 身份证号码
	 */
	private String idCard;
	
	/**
	 * 真实姓名
	 */
	private String realName;
	
	/**
	 * 银行卡号后8位
	 */
	private String cardNum;
	
	/**
	 * 发送来源类型
	 */
	private Short sendType;

	/**
	 * ip地址
	 */
	private  String ip;

	/**
	 * 注册平台 1.web, 2.wap, 3.android, 4.ios
	 */
	private Short platform;

	/**
	 * 登录平台 1.web, 2.wap, 3.android, 4.ios
	 */
	private Short loginPlatform;

	/**
	 * pc：2，android：4，ios：5，wap：6，未知渠道：7
	 */
	private String channelId;
	
	/**
	 * 代理系统编码
	 */
	private String agentCode;
	
	/** vo对象新增参数 **/
	
	/**
	 * 第三方Id
	 */
	private String openId;
	
	/**
	 * 渠道等级计算字段
	 */
	private Short orderNum;
	
	public PassportVO() {
		super();
	}

	public PassportVO(String code, String token, Short sendType) {
		super();
		this.code = code;
		this.token = token;
		this.sendType = sendType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
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

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
    
    public String getTimeStr () {
        return timeStr;
    }
    
    public void setTimeStr (String timeStr) {
        this.timeStr = timeStr;
    }
    
    public Integer getSwitchStatus () {
        return switchStatus;
    }
    
    public void setSwitchStatus (Integer switchStatus) {
        this.switchStatus = switchStatus;
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

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getLoginPlatform() {
		return loginPlatform;
	}

	public void setLoginPlatform(Short loginPlatform) {
		this.loginPlatform = loginPlatform;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Short getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Short orderNum) {
		this.orderNum = orderNum;
	}
}
