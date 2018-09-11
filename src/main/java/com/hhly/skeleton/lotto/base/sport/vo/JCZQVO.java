package com.hhly.skeleton.lotto.base.sport.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;
/**
 * 竞彩足球查询条件
 * @author zhanglei
 *
 */
public class JCZQVO extends BaseVO {

	private static final long serialVersionUID = 1L;
	/**
	 * 期号
	 */
	private String issueNo;
	/**
	 * 彩种id
	 */
	private Integer lotteryId;
	/**
	 * 比赛gameno
	 */
	private String gameNo;
	/**
	 * 比赛场次-周几00几(或者第几场)
	 */
	private String matchNo;
	/**
	 * 主队id
	 */
	private Integer homeTeamId;

	/**
	 * 客队id
	 */
	private Integer awayTeamId;
	/**
	 * 比赛时间
	 */
	private Date playTime;
	/**
	 * 是否热门 1:是,0:否
	 */
	private String isHot;
	/**
	 * 是否单关 1:是,0:否
	 */
	private String isSingle;
	
	public String getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}
	public Integer getLotteryId() {
		return lotteryId;
	}
	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getMatchNo() {
		return matchNo;
	}
	public void setMatchNo(String matchNo) {
		this.matchNo = matchNo;
	}
	public Integer getHomeTeamId() {
		return homeTeamId;
	}
	public void setHomeTeamId(Integer homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	public Integer getAwayTeamId() {
		return awayTeamId;
	}
	public void setAwayTeamId(Integer awayTeamId) {
		this.awayTeamId = awayTeamId;
	}
	public Date getPlayTime() {
		return playTime;
	}
	public void setPlayTime(Date playTime) {
		this.playTime = playTime;
	}
	public String getIsHot() {
		return isHot;
	}
	public void setIsHot(String isHot) {
		this.isHot = isHot;
	}
	public String getIsSingle() {
		return isSingle;
	}
	public void setIsSingle(String isSingle) {
		this.isSingle = isSingle;
	}
}
