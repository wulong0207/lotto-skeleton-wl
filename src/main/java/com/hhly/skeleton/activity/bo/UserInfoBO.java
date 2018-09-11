package com.hhly.skeleton.activity.bo;
import com.hhly.skeleton.base.bo.BaseBO;
@SuppressWarnings("serial")
public class UserInfoBO extends BaseBO{	
	/**用户id*/
	private String userId;
	/**用户真实姓名*/
	private String actualName;
	/**用户身份证号*/
	private String idNum;
	/**手机号*/
	private String mobile;
	/**手机号状态*/
	private Short mobileStatus;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	
}
