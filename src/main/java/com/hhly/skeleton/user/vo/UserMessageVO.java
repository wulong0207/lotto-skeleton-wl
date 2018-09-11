package com.hhly.skeleton.user.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 验证码参数传递实体类
 * @desc
 * @author zhouyang
 * @date 2017年2月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserMessageVO extends BaseVO {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	private Integer id;
	
	/**
	 * 用户id
	 */
	private Integer userId; 
	
	/**
	 * 发送方式名称，手机或email
	 */
	private String account;
	
	/**
	 * 验证码
	 */
	private String code;
	
	/**
	 * 完整信息
	 */
	private String message;
	
	/**
	 * 消息类型	1：登录，2：注册，3完善资料绑定手机号码，4：找回/重置密码， 9：其它
	 */
	private Short messageType;
	
	/**
	 * 状态	0：未使用，1：已使用
	 */
	private Short status;
	
	/**
	 * 类型	1：短信，2：邮件
	 */
	private Short type;
	
	/**
	 * 创建时间（系统时间）
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 * @return
	 */
	private Date updateTime;
	
	public UserMessageVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserMessageVO(Integer userId, String code, String message, Short messageType, Short type) {
		super();
		this.userId = userId;
		this.code = code;
		this.message = message;
		this.messageType = messageType;
		this.status = status;
		this.type = type;
	}

	public UserMessageVO(String account, String code, String message, Short messageType, Short type) {
		this.account = account;
		this.code = code;
		this.message = message;
		this.messageType = messageType;
		this.status = status;
		this.type = type;
	}

	public UserMessageVO(String account, Short messageType, Short status, Short type) {
		this.account = account;
		this.messageType = messageType;
		this.status = status;
		this.type = type;
	}

	public UserMessageVO(String account, String code, Short messageType) {
		super();
		this.account = account;
		this.code = code;
		this.messageType = messageType;
	}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Short getMessageType() {
		return messageType;
	}

	public void setMessageType(Short messageType) {
		this.messageType = messageType;
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

}
