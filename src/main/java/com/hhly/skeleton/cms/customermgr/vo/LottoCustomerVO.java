package com.hhly.skeleton.cms.customermgr.vo;

import com.hhly.skeleton.base.valid.*;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class LottoCustomerVO extends PageVO{
	@Group({"upd","resetPassword"})
	@NotNull
	private Integer id;

    private String accountId;
    
    private String accountName;
    
    @Group("upd")
    @Pattern(value=MatchPattern.PHONE,msg="手机号码")
    private Long cusMobile;
    
    @Group("upd")
    @Pattern(value=MatchPattern.MAIL,msg="邮箱")
    private String cusMail;
    
    private String nickName;

    private String accountPassword;
    
    private Short passwordGrade;
    
    @Group("upd")
    @Range(min=1,max=3,msg="性别")
    private Short sex;

    private String actualName;
    
    
    private String idNum;

    private String headUrl;
    @Group("upd")
    //@NotNull
    @Range(min=0,max=1,msg="头像状态")
    private Short headStatus;

    private String address;

    private String channelId;
    
    
    private Short mobileLogin;

    private Short emailLogin;
    
    private Date registTime;

    private Date lastLoginTime;
    
    @Group("upd")
    @NotNull
    @Range(min=0,max=2,msg="会员状态")
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

    private Date modifyTime;

    private Date updateTime;

    private Date createTime;
    
    @Group("upd")
    //@NotNull
    @LenRange(max=100,min=1,msg="备注")
    private String remark;
    
    //注册时间范围
    private Date startRegistTime;
    
    private Date endRegistTime;
    
    //最后登录时间范围
    private Date startLastLoginTime;
    
    private Date endLastLoginTime;
    
    @Group({"resetPassword","cleanMessage"})
	@NotNull
    private String type;
    //值
    private List<String> values;
    
    /**
     * 注册平台:1：Web,2:Wap;3:Android;4:IOS
     */
    private Integer platform;
    
    /**代理编号*/
    private String agentCode;
    /**用户类型*/
    private String userType;
    /**
     * 重置密码
     */
    private String resetPassword;

	/**
	 * 会员禁用截止时间
	 */
	private Date forbitEndTime;
    
	public String getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getEndLastLoginTime() {
		return endLastLoginTime;
	}

	public void setEndLastLoginTime(Date endLastLoginTime) {
		this.endLastLoginTime = endLastLoginTime;
	}

	public Date getStartRegistTime() {
		return startRegistTime;
	}

	public void setStartRegistTime(Date startRegistTime) {
		this.startRegistTime = startRegistTime;
	}

	public Date getEndRegistTime() {
		return endRegistTime;
	}

	public void setEndRegistTime(Date endRegistTime) {
		this.endRegistTime = endRegistTime;
	}

	public Date getStartLastLoginTime() {
		return startLastLoginTime;
	}

	public void setStartLastLoginTime(Date startLastLoginTime) {
		this.startLastLoginTime = startLastLoginTime;
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

	public Date getForbitEndTime() {
		return forbitEndTime;
	}

	public void setForbitEndTime(Date forbitEndTime) {
		this.forbitEndTime = forbitEndTime;
	}
}