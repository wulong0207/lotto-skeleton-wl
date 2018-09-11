package com.hhly.skeleton.cms.customermgr.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

@SuppressWarnings("serial")
public class LottoCustomerBO extends BaseBO{

	private Integer id;

    private String accountId;

    private String accountName;

    private Long cusMobile;

    private String cusMail;

    private String nickName;

    private String accountPassword;
    
    private Short passwordGrade;

    private Short sex;

    private String actualName;

    private String idNum;

    private String headUrl;

    private Short headStatus;

    private String address;

    private String channelId;
    
    
    private Short mobileLogin;

    private Short emailLogin;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date registTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastLoginTime;

    private Short accountStatus;

    private String qqOpenId;

    private String sinaBlogOpenId;

    private String baiduOpenId;

    private String wechatOpenId;

    private String alipayOpenId;

    private String jdOpenId;

    private Short mobileCheck;

    private Short emailCheck;

    private Short accountModify;
    
    private Short headCheck;

    private String modifyBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String remark;
    
    private Integer msgMob = 1;
    private Integer msgSite = 1;
    private Integer msgApp = 1;
    private Integer msgWechat = 1;
    private String mobNotDisturb = "23:00-08:00";
    private String appNotDisturb = "23:00-08:00";
    
    /**
     * 注册平台:1：Web,2:Wap;3:Android;4:IOS
     */
    private Integer platform;
    /**代理编号*/
    private String agentCode;
    /**用户类型*/
    private String userType;
    
    private String rcode;

	/**
	 * 会员禁用截止时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date forbitEndTime;
    
    private int cusMobileCount;

    private int cusMailCount;
    
    
	

	public int getCusMobileCount() {
		return cusMobileCount;
	}

	public void setCusMobileCount(int cusMobileCount) {
		this.cusMobileCount = cusMobileCount;
	}

	public int getCusMailCount() {
		return cusMailCount;
	}

	public void setCusMailCount(int cusMailCount) {
		this.cusMailCount = cusMailCount;
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

	public Integer getMsgMob() {
		return msgMob;
	}

	public void setMsgMob(Integer msgMob) {
		this.msgMob = msgMob;
	}

	public Integer getMsgSite() {
		return msgSite;
	}

	public void setMsgSite(Integer msgSite) {
		this.msgSite = msgSite;
	}

	public Integer getMsgApp() {
		return msgApp;
	}

	public void setMsgApp(Integer msgApp) {
		this.msgApp = msgApp;
	}

	public Integer getMsgWechat() {
		return msgWechat;
	}

	public void setMsgWechat(Integer msgWechat) {
		this.msgWechat = msgWechat;
	}

	public String getMobNotDisturb() {
		return mobNotDisturb;
	}

	public void setMobNotDisturb(String mobNotDisturb) {
		this.mobNotDisturb = mobNotDisturb;
	}

	public String getAppNotDisturb() {
		return appNotDisturb;
	}

	public void setAppNotDisturb(String appNotDisturb) {
		this.appNotDisturb = appNotDisturb;
	}

	public Short getPasswordGrade() {
		return passwordGrade;
	}

	public void setPasswordGrade(Short passwordGrade) {
		this.passwordGrade = passwordGrade;
	}
	
	public Short getMobileLogin() {
		return mobileLogin;
	}

	public void setMobileLogin(Short mobileLogin) {
		this.mobileLogin = mobileLogin;
	}

	public Short getEmailLogin() {
		return emailLogin;
	}

	public void setEmailLogin(Short emailLogin) {
		this.emailLogin = emailLogin;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Long getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(Long cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getCusMail() {
		return cusMail;
	}

	public void setCusMail(String cusMail) {
		this.cusMail = cusMail;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public Short getSex() {
		return sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Short getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(Short accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getQqOpenId() {
		return qqOpenId;
	}

	public void setQqOpenId(String qqOpenId) {
		this.qqOpenId = qqOpenId;
	}

	public String getSinaBlogOpenId() {
		return sinaBlogOpenId;
	}

	public void setSinaBlogOpenId(String sinaBlogOpenId) {
		this.sinaBlogOpenId = sinaBlogOpenId;
	}

	public String getBaiduOpenId() {
		return baiduOpenId;
	}

	public void setBaiduOpenId(String baiduOpenId) {
		this.baiduOpenId = baiduOpenId;
	}

	public String getWechatOpenId() {
		return wechatOpenId;
	}

	public void setWechatOpenId(String wechatOpenId) {
		this.wechatOpenId = wechatOpenId;
	}

	public String getAlipayOpenId() {
		return alipayOpenId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getJdOpenId() {
		return jdOpenId;
	}

	public void setJdOpenId(String jdOpenId) {
		this.jdOpenId = jdOpenId;
	}

	public Short getMobileCheck() {
		return mobileCheck;
	}

	public void setMobileCheck(Short mobileCheck) {
		this.mobileCheck = mobileCheck;
	}

	public Short getEmailCheck() {
		return emailCheck;
	}

	public void setEmailCheck(Short emailCheck) {
		this.emailCheck = emailCheck;
	}

	public Short getAccountModify() {
		return accountModify;
	}

	public void setAccountModify(Short accountModify) {
		this.accountModify = accountModify;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getHeadCheck() {
		return headCheck;
	}

	public void setHeadCheck(Short headCheck) {
		this.headCheck = headCheck;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	/**
	 * @return the rcode
	 */
	public String getRcode() {
		return rcode;
	}

	/**
	 * @param rcode the rcode to set
	 */
	public void setRcode(String rcode) {
		this.rcode = rcode;
	}

	public Date getForbitEndTime() {
		return forbitEndTime;
	}

	public void setForbitEndTime(Date forbitEndTime) {
		this.forbitEndTime = forbitEndTime;
	}
}