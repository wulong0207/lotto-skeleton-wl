
package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.List;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年10月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OrderMatchChildPlayBO {

	/**
	 * 彩种子玩法
	 */
	private String lotteryChildCode;
	
	/**
	 * 竞彩玩法
	 */
	private String playWay;
	
	/**
	 * 玩法名称
	 */
	private String playWayName;
		
	/**
	 * 让分
	 */
	private Float letNum;
	
	/**
	 * 预设总分
	 */
	private Float sizeScore;
	
	private List<OrderMatchBuyWayBO> matchBuyWayList;
	

	public String getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getPlayWay() {
		return playWay;
	}

	public void setPlayWay(String playWay) {
		this.playWay = playWay;
	}

	public String getPlayWayName() {
		return playWayName;
	}

	public void setPlayWayName(String playWayName) {
		this.playWayName = playWayName;
	}
	
	public Float getLetNum() {
		return letNum;
	}

	public void setLetNum(Float letNum) {
		this.letNum = letNum;
	}

	public Float getSizeScore() {
		return sizeScore;
	}

	public void setSizeScore(Float sizeScore) {
		this.sizeScore = sizeScore;
	}

	public List<OrderMatchBuyWayBO> getMatchBuyWayList() {
		return matchBuyWayList;
	}

	public void setMatchBuyWayList(List<OrderMatchBuyWayBO> matchBuyWayList) {
		this.matchBuyWayList = matchBuyWayList;
	}
}
