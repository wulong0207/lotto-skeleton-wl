package com.hhly.skeleton.lotto.base.cooperate.vo;

import com.hhly.skeleton.lotto.base.order.vo.OrderInfoVO;

/**
 * 积分兑换码下单（第三方下单接口）
 *
 * @author huangchengfang1219
 * @date 2018年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateOrderInfoVO extends OrderInfoVO {

	private static final long serialVersionUID = -2693609664176079762L;

	private String channelId;

	/**
	 * 数量，机选投注时使用
	 */
	private Long num;

	/**
	 * 外部用户唯一标识
	 */
	private String outUserId;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 接口IP
	 */
	private String ip;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getOutUserId() {
		return outUserId;
	}

	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
