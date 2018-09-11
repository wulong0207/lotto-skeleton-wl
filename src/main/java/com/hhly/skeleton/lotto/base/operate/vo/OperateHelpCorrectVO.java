package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.bo.BaseBO;

public class OperateHelpCorrectVO extends BaseBO {

	private static final long serialVersionUID = -1288250621808130219L;

	/**
	 * 类型:1 纠正内容;2 意见建议
	 */
	private Integer type;

	/**
	 * 文章ID
	 */
	private Integer helpId;

	/**
	 * 帮助中心栏目编码
	 */
	private String helpTypeCode;

	/**
	 * 用户token
	 */
	private String token;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 来源; 1:首页; 2:文章;
	 */
	private Integer sources;

	/**
	 * ip
	 */
	private String ip;

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getHelpId() {
		return helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	public String getHelpTypeCode() {
		return helpTypeCode;
	}

	public void setHelpTypeCode(String helpTypeCode) {
		this.helpTypeCode = helpTypeCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getSources() {
		return sources;
	}

	public void setSources(Integer sources) {
		this.sources = sources;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
