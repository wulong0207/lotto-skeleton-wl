package com.hhly.skeleton.pay.channel.vo;

import java.io.Serializable;
import java.util.List;

import com.hhly.skeleton.pay.channel.bo.PayChannelMgrBO;

/**
 * @desc 可使用的渠道列表信息
 * @author xiongJinGang
 * @date 2017年12月12日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ChannelMgrVO implements Serializable {

	private List<PayChannelMgrBO> mgrList;// 可使用的渠道列表
	private List<Integer> idList;// 可使用的渠道ID集合
	private Double leastAmount = 0d;// 单笔最低限额
	private Double highestAmount = 0d;// 单笔最高限额

	public ChannelMgrVO() {
		super();
	}

	public ChannelMgrVO(List<Integer> idList, List<PayChannelMgrBO> mgrList, Double leastAmount, Double highestAmount) {
		super();
		this.idList = idList;
		this.mgrList = mgrList;
		this.leastAmount = leastAmount;
		this.highestAmount = highestAmount;
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public List<PayChannelMgrBO> getMgrList() {
		return mgrList;
	}

	public void setMgrList(List<PayChannelMgrBO> mgrList) {
		this.mgrList = mgrList;
	}

	public Double getLeastAmount() {
		return leastAmount;
	}

	public void setLeastAmount(Double leastAmount) {
		this.leastAmount = leastAmount;
	}

	public Double getHighestAmount() {
		return highestAmount;
	}

	public void setHighestAmount(Double highestAmount) {
		this.highestAmount = highestAmount;
	}

}
