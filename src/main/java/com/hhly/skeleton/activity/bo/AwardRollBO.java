package com.hhly.skeleton.activity.bo;
import com.hhly.skeleton.base.bo.BaseBO;
@SuppressWarnings("serial")
public class AwardRollBO extends BaseBO{	
	/**用户真实姓名*/
	private String userName;
	/**用户身份证号*/
	private String redName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRedName() {
		return redName;
	}
	public void setRedName(String redName) {
		this.redName = redName;
	}
	
}
