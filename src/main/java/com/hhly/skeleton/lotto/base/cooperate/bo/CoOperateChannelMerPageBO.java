package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.PagingBO;
/**
 * @desc 商户订单信息类
 * @author lidecheng
 * @date 2018年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelMerPageBO<T> extends PagingBO<T>{
	
	private static final long serialVersionUID = -5109462951817621585L;
	/**
	 * 彩种信息
	 */
	private List<CoOperateChannelLotteryBO> lotteryList;

	public CoOperateChannelMerPageBO(List<CoOperateChannelLotteryBO>  lotteryList,Integer totalPage,List<T> data){
		this.lotteryList=lotteryList;
		setTotal(totalPage);
		setData(data);
	}
	public List<CoOperateChannelLotteryBO> getLotteryList() {
		return lotteryList;
	}

	public void setLotteryList(List<CoOperateChannelLotteryBO> lotteryList) {
		this.lotteryList = lotteryList;
	}
	
}
