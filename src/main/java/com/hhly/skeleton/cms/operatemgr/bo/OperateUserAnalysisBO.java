package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.cms.customermgr.bo.LottoCustomerBO;

/**
 * @desc 会员访问分析
 * @author huangb
 * @date 2017年2月9日
 * @company 益彩网络
 * @version v1.0
 */
public class OperateUserAnalysisBO extends BaseBO {

	private static final long serialVersionUID = 2975210324462308484L;
	/**
	 * 自增编号
	 */
	private Long id;
	/**
	 * 用户信息表id关联
	 */
	private Long userId;
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 关联的用户对象
	 */
	private LottoCustomerBO user;
	/**
	 * 渠道商号
	 */
	private String channelId;
	/**
	 * IP地址
	 */
	private String ip;
	/**
	 * 时长/秒
	 */
	private Integer seconds;
	/**
	 * 访问功能名称
	 */
	private String webName;
	/**
	 * 访问Url
	 */
	private String url;
	/**
	 * 去向访问功能名称
	 */
	private String goWebName;
	/**
	 * 去向访问Url
	 */
	private String goUrl;
	/**
	 * 访问时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LottoCustomerBO getUser() {
		return user;
	}

	public void setUser(LottoCustomerBO user) {
		this.user = user;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	public String getWebName() {
		return webName;
	}

	public void setWebName(String webName) {
		this.webName = webName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGoWebName() {
		return goWebName;
	}

	public void setGoWebName(String goWebName) {
		this.goWebName = goWebName;
	}

	public String getGoUrl() {
		return goUrl;
	}

	public void setGoUrl(String goUrl) {
		this.goUrl = goUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
