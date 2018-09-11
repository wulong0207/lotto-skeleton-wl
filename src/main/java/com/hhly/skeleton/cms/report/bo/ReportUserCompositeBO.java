package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    运营简报数据概况
 * @author  Tony Wang
 * @date    2017年9月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportUserCompositeBO extends BaseBO{

	/**
	 * 全部数据
	 */
	private ReportUserBO all;
	/**
	 * 渠道数据
	 */
	private ReportUserBO channel;
	public ReportUserBO getAll() {
		return all;
	}
	public void setAll(ReportUserBO all) {
		this.all = all;
	}
	public ReportUserBO getChannel() {
		return channel;
	}
	public void setChannel(ReportUserBO channel) {
		this.channel = channel;
	}
}
