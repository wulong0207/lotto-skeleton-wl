package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 帮助中心用户满意度调查
 *
 * @author huangchengfang1219
 * @date 2018年2月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpAbleVO extends BaseVO {

	private static final long serialVersionUID = -2930843317321277276L;

	/**
	 * 帮助ID
	 */
	private Integer helpId;

	/**
	 * 用户ID
	 */
	private Integer userId;

	/**
	 * 用户Token
	 */
	private String token;

	/**
	 * 是否满意
	 */
	private Short isAble;
	
	/**
	 * 用户IP
	 */
	private String ip;

	public Integer getHelpId() {
		return helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getIsAble() {
		return isAble;
	}

	public void setIsAble(Short isAble) {
		this.isAble = isAble;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	

}
