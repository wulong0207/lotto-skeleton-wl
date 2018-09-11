package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/***
 * @desc 
 * @author lidecheng
 * @date 2017年5月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateLottSoftwareVersionVO extends BaseBO{
	private Short type;
	private Integer channelId;
	private Integer synOfficial;
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getSynOfficial() {
		return synOfficial;
	}
	public void setSynOfficial(Integer synOfficial) {
		this.synOfficial = synOfficial;
	}
}
