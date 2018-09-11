package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.pay.vo.BasePageVo;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户操作日志
 * @desc
 * @author zhouyang
 * @date 2017年2月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserModifyLogVO extends BasePageVo implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 渠道id
	 */
	private String channelId;

	/**
	 * 平台
	 */
	private Short platform;

	/**
	 * 操作状态	0：失败，1：成功，2：操作中
	 */
	private Short operationStatus;

	/**
	 * 用户ID
	 */
	private Integer userId;

	/**
	 * 用户操作类型或者栏目
	 */
	private Short userAction;

	/**
	 * 用户IP
	 */
	private String userIp;

	/**
	 * 开始日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String createTime;
	/**
	 * 结束日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String createTimeEnd;

	private String token;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Short getUserAction() {
		return userAction;
	}

	public void setUserAction(Short userAction) {
		this.userAction = userAction;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(Short operationStatus) {
		this.operationStatus = operationStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
