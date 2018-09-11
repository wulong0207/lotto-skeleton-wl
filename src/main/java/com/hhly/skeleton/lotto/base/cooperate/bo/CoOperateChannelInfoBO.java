package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.CoOperateEnum;

/**
 * 渠道用户信息（前端使用）
 *
 * @author huangchengfang1219
 * @date 2018年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelInfoBO extends BaseBO {

	private static final long serialVersionUID = 8732372889403345225L;

	/**
	 * 渠道ID
	 */
	private String channelId;

	/**
	 * 渠道名称
	 */
	private String channelName;

	/**
	 * 商户类型；1：余额结算（可欠款和不可欠款合并）；2：彩种库存；3：中介商户
	 */
	private Short merchantType;

	/**
	 * 最后登录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastLoginTime;

	/**
	 * 最后登录IP
	 */
	private String lastLoginIp;

	/**
	 * 渠道Token
	 */
	private String channelToken;
	
	/**
	 * 是否强制修改密码
	 */
	private Short isMandatoryPassword;

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

	public Short getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(Short merchantType) {
		this.merchantType = merchantType;
	}

	public String getMerchantTypeName() {
		CoOperateEnum.MerchantType type = CoOperateEnum.MerchantType.valueOf(merchantType);
		return type == null ? null : type.getName();
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public Short getIsMandatoryPassword() {
		return isMandatoryPassword;
	}

	public void setIsMandatoryPassword(Short isMandatoryPassword) {
		this.isMandatoryPassword = isMandatoryPassword;
	}

}
