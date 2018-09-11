package com.hhly.skeleton.agent.bo;

public class AgentUserInfoBO {
	/**
	 * 益彩用户userId
	 */
	private String memberId;
	/**
	 * 益彩用户真实姓名
	 */
	private String userName;
	/**
	 * 益彩用户手机号码
	 */
	private String phone;
	/**
	 * 易众平台推广编码
	 */
	private String partnerNo;
	/**
	 * 易众平台授权给益彩公司的id，用于标识用户是益彩用户
	 */
	private String mchId;
	/**
	 * 国家：“0”是中国
	 */
	private String country = "0";
	/**
	 * 来源网址，即用户从哪个网址跳转到益彩网络网站，通过js代码“document.referrer”可获得
	 */
	private String referrerWebsiteUrl;
	/**
	 * 推广链接地址，即用户通过哪个推广链接注册的
	 */
	private String promoteUrl;
	/**
	 * 注册来源，即用户是通过PC、H5端，还是其他方式注册，标识信息为1:pc,2:android,3:ios,4:H5,5:其他
	 */
	private String osType;
	
	/**
	 * 合作伙伴分配给益彩的产品表示，不同产品,不同端，不一样，如:10898492
	 */
	private String platformId;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getPartnerNo() {
		return partnerNo;
	}
	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}
	
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getReferrerWebsiteUrl() {
		return referrerWebsiteUrl;
	}
	public void setReferrerWebsiteUrl(String referrerWebsiteUrl) {
		this.referrerWebsiteUrl = referrerWebsiteUrl;
	}
	
	public String getPromoteUrl() {
		return promoteUrl;
	}
	public void setPromoteUrl(String promoteUrl) {
		this.promoteUrl = promoteUrl;
	}
	
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
