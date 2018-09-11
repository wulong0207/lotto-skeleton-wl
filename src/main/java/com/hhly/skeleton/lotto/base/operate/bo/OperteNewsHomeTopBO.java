package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  资讯
 * @author lidecheng
 * @date 2017年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperteNewsHomeTopBO  extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7731208947101861201L;
	
	
	/**
	 * 热门彩种集合
	 */
	private List<OperateLotteryDetailBO> hotLotterList;
	
	/**
	 * 数字彩集合
	 */
	private List<OperateLotteryDetailBO> numLotterList;
	
	/**
	 * 高频彩集合
	 */
	private List<OperateLotteryDetailBO> highLotterList;
	
	/**
	 * 竞技彩集合
	 */
	private List<OperateLotteryDetailBO> sportLotterList;
	
	public List<OperateLotteryDetailBO> getHotLotterList() {
		return hotLotterList;
	}

	public void setHotLotterList(List<OperateLotteryDetailBO> hotLotterList) {
		this.hotLotterList = hotLotterList;
	}

	public List<OperateLotteryDetailBO> getNumLotterList() {
		return numLotterList;
	}

	public void setNumLotterList(List<OperateLotteryDetailBO> numLotterList) {
		this.numLotterList = numLotterList;
	}

	public List<OperateLotteryDetailBO> getHighLotterList() {
		return highLotterList;
	}

	public void setHighLotterList(List<OperateLotteryDetailBO> highLotterList) {
		this.highLotterList = highLotterList;
	}

	public List<OperateLotteryDetailBO> getSportLotterList() {
		return sportLotterList;
	}

	public void setSportLotterList(List<OperateLotteryDetailBO> sportLotterList) {
		this.sportLotterList = sportLotterList;
	}	
}
