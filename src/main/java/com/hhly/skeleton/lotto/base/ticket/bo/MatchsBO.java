package com.hhly.skeleton.lotto.base.ticket.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 对阵信息 BO
 * @author longguoyou
 * @date 2017年11月1日
 * @compay 益彩网络科技有限公司
 */
public class MatchsBO extends BaseBO {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 彩果
	 */
	private String caiguo;
	/**
	 * 子玩法编号
	 */
	private String childCode;
	/**
	 * 子玩法名称
	 */
	private String childName;
	/**
	 * 全场比分
	 */
	private String fullScore;
	/**
	 * 半场比分
	 */
	private String halfScore;
	/**
	 * 主队名
	 */
	private String hostName;
	/**
	 * 客队名
	 */
	private String visitName;
	/**
	 * 赛事编号
	 */
	private String num;
	/**
	 * 周几
	 */
	private String week;
	/**
	 * 投注内容列表
	 */
	private List<BetContentBO> listBetContent;
	
	/**
	 * 让分/大小分
	 */
	private String info;
	
	/**
	 * 比赛状态
	 */
	private Short matchStatus;

	public Short getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCaiguo() {
		return caiguo;
	}

	public void setCaiguo(String caiguo) {
		this.caiguo = caiguo;
	}

	public String getChildCode() {
		return childCode;
	}

	public void setChildCode(String childCode) {
		this.childCode = childCode;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getFullScore() {
		return fullScore;
	}

	public void setFullScore(String fullScore) {
		this.fullScore = fullScore;
	}

	public String getHalfScore() {
		return halfScore;
	}

	public void setHalfScore(String halfScore) {
		this.halfScore = halfScore;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getVisitName() {
		return visitName;
	}

	public void setVisitName(String visitName) {
		this.visitName = visitName;
	}

	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public List<BetContentBO> getListBetContent() {
		return listBetContent;
	}

	public void setListBetContent(List<BetContentBO> listBetContent) {
		this.listBetContent = listBetContent;
	}

}
