package com.hhly.skeleton.cms.report.vo;

import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc    代理兑换报表查询VO
 * @company 益彩网络科技公司
 */
@SuppressWarnings("serial")
public class ExchangeSaleVO extends PageVO{
	
	private String parentChannelId;// 渠道编号(中介)
	private String channelId;// 渠道编号必传
	private String startDate;// 开始时间
	private String endDate;// 结束时间

	public String getParentChannelId() {
		if(StringUtil.isBlank(parentChannelId)) {parentChannelId="0";} 
		return parentChannelId;
	}
	public void setParentChannelId(String parentChannelId) {
		this.parentChannelId = parentChannelId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
