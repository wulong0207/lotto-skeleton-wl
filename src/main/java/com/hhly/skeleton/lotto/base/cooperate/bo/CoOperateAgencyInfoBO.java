package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.List;

/**
 * 中介信息
 *
 * @author huangchengfang1219
 * @date 2018年3月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateAgencyInfoBO {

	private List<CoOperateChannelInfoBO> agencyChannelList;

	public List<CoOperateChannelInfoBO> getAgencyChannelList() {
		return agencyChannelList;
	}

	public void setAgencyChannelList(List<CoOperateChannelInfoBO> agencyChannelList) {
		this.agencyChannelList = agencyChannelList;
	}

}
