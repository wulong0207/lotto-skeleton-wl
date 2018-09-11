
package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @desc
 * @author cheng chen
 * @date 2017年10月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public class OrderOldMatchContentBO {

	/**
	 * 系统编码
	 */
	private String systemCode;

	/**
	 * 比赛开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date matchStartTime;

	/**
	 * 主队名称
	 */
	private String homeName;

	/**
	 * 客队名称
	 */
	private String guestName;

	/**
	 * 半场比分
	 */
	private String halfScore;

	/**
	 * 全场比分
	 */
	private String fullScore;

	/**
	 * 胜平负彩果
	 */
	private Integer wdf;

	/**
	 * 胜平负彩果文本
	 */
	private String wdfText;

	/**
	 * 是否胆码 0:否,1:是
	 */
	private Integer isDan = 0;

	/**
	 * 子玩法投注对象
	 */
	private List<OrderMatchBuyWayBO> matchBuyWayList;

	/**
	 * 是否购买
	 */
	private boolean isBuy = true;

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public Date getMatchStartTime() {
		return matchStartTime;
	}

	public void setMatchStartTime(Date matchStartTime) {
		this.matchStartTime = matchStartTime;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}

	public Integer getWdf() {
		return wdf;
	}

	public void setWdf(Integer wdf) {
		this.wdf = wdf;
	}

	public String getWdfText() {
		return wdfText;
	}

	public void setWdfText(String wdfText) {
		this.wdfText = wdfText;
	}

	public Integer getIsDan() {
		return isDan;
	}

	public void setIsDan(Integer isDan) {
		this.isDan = isDan;
	}

	public List<OrderMatchBuyWayBO> getMatchBuyWayList() {
		return matchBuyWayList;
	}

	public void setMatchBuyWayList(List<OrderMatchBuyWayBO> matchBuyWayList) {
		this.matchBuyWayList = matchBuyWayList;
	}

	public boolean isBuy() {
		return isBuy;
	}

	public void setBuy(boolean isBuy) {
		this.isBuy = isBuy;
	}
}
