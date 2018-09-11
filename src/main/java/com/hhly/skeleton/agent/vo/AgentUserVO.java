package com.hhly.skeleton.agent.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 代理系统用户信息
 * @author YiJian
 * @date 2017年7月20日 下午4:12:15
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class AgentUserVO extends BaseVO {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 账户名
	 */
	private String accountName;
	
	/**
	 * 真实姓名
	 */
	private String actualName;
	
	/**
	 * 手机号码
	 */
	private String mobile;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
