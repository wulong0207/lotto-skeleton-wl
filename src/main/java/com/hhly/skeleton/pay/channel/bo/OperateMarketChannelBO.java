package com.hhly.skeleton.pay.channel.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 市场渠道
 * @author xiongJinGang
 * @date 2018年1月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateMarketChannelBO extends BaseBO {

	private Integer id;
	private String channelId;// 自定义ID
	private String channelName;// 渠道名称
	private Short terminalPlatform;// 1：Web；2：Wap；3：Android；4：IOS；5：未知
	private String parentChannelId;// 父级渠道ID，等级为1时为空
	private Short majia;// 是否为马甲包0：否；1：是

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Short getTerminalPlatform() {
		return terminalPlatform;
	}

	public void setTerminalPlatform(Short terminalPlatform) {
		this.terminalPlatform = terminalPlatform;
	}

	public String getParentChannelId() {
		return parentChannelId;
	}

	public void setParentChannelId(String parentChannelId) {
		this.parentChannelId = parentChannelId;
	}

	public Short getMajia() {
		return majia;
	}

	public void setMajia(Short majia) {
		this.majia = majia;
	}

}