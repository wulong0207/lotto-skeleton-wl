package com.hhly.skeleton.cms.customerservice.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @desc 用户消息
 * @author tangxiaobo
 * @date 2017年4月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class MUserMessageVO extends PageVO{
	private Integer id;
	/*
	 * 用户id
	 */
	private Integer userId;
	/*
	 * 用户:手机号或者邮件地址
	 */
	private String account;
	/*
	 * 验证码
	 */
	private String code;
	/*
	 * 消息类型 1登录,2注册验证,3完善资料绑定手机号码,4找回/重置密码,9其它
	 */
	private Short messageType;

	private String message;
	/*
	 * 验证码状态 1表示未使用 2表示已使用
	 */
	private Short status;
	/*
	 * 验证码类型 1短信,2邮件
	 */
	private Short type;
	/*
	 * 创建时间
	 */
	private Date createTime;
	/*
	 * 更新时间
	 */
	private Date updateTime;

	private String message2;
	/*
	 * 发送短信开始时间
	 */
	private String beginTime;
	/*
	 * 发送短信结束时间
	 */
	private String endTime;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Short getMessageType() {
		return messageType;
	}

	public void setMessageType(Short messageType) {
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}