
package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年10月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public class OrderMatchContentBO {

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
	 * 让分值
	 */
	private Float letNum;
	
	/**
	 * 预设总分
	 */
	private Float sizeScore;
	
	/**
	 * 胜平负彩果
	 */
	private Integer wdf;
	
	/**
	 * 胜平负彩果文本
	 */
	private String wdfText;
	
	/**
	 * 让球胜平负
	 */
	private String letWdf;
	
	/**
	 * 让球胜平负文本
	 */
	private String letWdfText;
	
	/**
	 * 比分
	 */
	private String score;
	
	/**
	 * 比分文本
	 */
	private String scoreText;
	
	/**
	 * 总进球
	 */
	private Integer goalNum;
	
	/**
	 * 总进球文本
	 */
	private String goalNumText;
	
	/**
	 * 半全场胜负
	 */
	private String hfWdf;
	
	/**
	 * 半全场胜负文本
	 */
	private String hfWdfText;
		
	/**
	 * 胜分差
	 */
	private String winScore;
	
	/**
	 * 胜分差文本
	 */
	private String winScoreText;
	
	/**
	 * 上下单双
	 */
	private Integer udsd;
	
	/**
	 * 上下单双文本
	 */
	private String udsdText;
	
	/**
	 * 北单让球胜平负sp值
	 */
	private Float letWdfSp;
	
	/**
	 * 北单总进球数sp值
	 */
	private Float goalNumSp;
	
	/**
	 * 北单半全场胜平负SP值
	 */
	private Float hfWdfSp;
	
	/**
	 * 北单上下单双sp值
	 */
	private Float udsdSp;
	
	/**
	 * 北单比分sp值
	 */
	private Float scoreSp;
	
	/**
	 * 是否胆码 0:否,1:是
	 */
	private Integer isDan = 0;
	
	/**
	 * 子玩法投注对象
	 */
	private List<OrderMatchChildPlayBO> matchChildPlayList;
	
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

	public String getLetWdf() {
		return letWdf;
	}

	public void setLetWdf(String letWdf) {
		this.letWdf = letWdf;
	}

	public String getLetWdfText() {
		return letWdfText;
	}

	public void setLetWdfText(String letWdfText) {
		this.letWdfText = letWdfText;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getScoreText() {
		return scoreText;
	}

	public void setScoreText(String scoreText) {
		this.scoreText = scoreText;
	}

	public Integer getGoalNum() {
		return goalNum;
	}

	public void setGoalNum(Integer goalNum) {
		this.goalNum = goalNum;
	}

	public String getGoalNumText() {
		return goalNumText;
	}

	public void setGoalNumText(String goalNumText) {
		this.goalNumText = goalNumText;
	}

	public String getHfWdf() {
		return hfWdf;
	}

	public void setHfWdf(String hfWdf) {
		this.hfWdf = hfWdf;
	}

	public String getHfWdfText() {
		return hfWdfText;
	}

	public void setHfWdfText(String hfWdfText) {
		this.hfWdfText = hfWdfText;
	}

	public String getWinScore() {
		return winScore;
	}

	public void setWinScore(String winScore) {
		this.winScore = winScore;
	}

	public String getWinScoreText() {
		return winScoreText;
	}

	public void setWinScoreText(String winScoreText) {
		this.winScoreText = winScoreText;
	}
	
	public Integer getUdsd() {
		return udsd;
	}

	public void setUdsd(Integer udsd) {
		this.udsd = udsd;
	}

	public String getUdsdText() {
		return udsdText;
	}

	public void setUdsdText(String udsdText) {
		this.udsdText = udsdText;
	}

	public Float getLetWdfSp() {
		return letWdfSp;
	}

	public void setLetWdfSp(Float letWdfSp) {
		this.letWdfSp = letWdfSp;
	}

	public Float getGoalNumSp() {
		return goalNumSp;
	}

	public void setGoalNumSp(Float goalNumSp) {
		this.goalNumSp = goalNumSp;
	}

	public Float getHfWdfSp() {
		return hfWdfSp;
	}

	public void setHfWdfSp(Float hfWdfSp) {
		this.hfWdfSp = hfWdfSp;
	}

	public Float getUdsdSp() {
		return udsdSp;
	}

	public void setUdsdSp(Float udsdSp) {
		this.udsdSp = udsdSp;
	}

	public Float getScoreSp() {
		return scoreSp;
	}

	public void setScoreSp(Float scoreSp) {
		this.scoreSp = scoreSp;
	}

	public Integer getIsDan() {
		return isDan;
	}

	public void setIsDan(Integer isDan) {
		this.isDan = isDan;
	}

	public List<OrderMatchChildPlayBO> getMatchChildPlayList() {
		return matchChildPlayList;
	}

	public void setMatchChildPlayList(List<OrderMatchChildPlayBO> matchChildPlayList) {
		this.matchChildPlayList = matchChildPlayList;
	}

	public boolean isBuy() {
		return isBuy;
	}

	public void setBuy(boolean isBuy) {
		this.isBuy = isBuy;
	}
}
