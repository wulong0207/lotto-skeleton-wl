package com.hhly.skeleton.draw.sport.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc 竞技彩
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportBaseVO extends PageVO {

	private static final long serialVersionUID = 4289117590232978752L;

	/**
	 * 对阵ID
	 */
	private Integer matchId;
	
	/**
	 * 赛事ID
	 */
	private Integer raceId;

	/**
	 * 彩种
	 */
	private Integer lotteryCode;

	/**
	 * 彩期
	 */
	private String issueCode;

	/**
	 * 开始彩期
	 */
	private String startIssueCode;

	/**
	 * 结束彩期
	 */
	private String endIssueCode;

	/**
	 * 查询开始日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startTime;

	/**
	 * 查询结束日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endTime;

	/**
	 * 球队名称
	 */
	private String teamName;

	/**
	 * 比赛状态
	 */
	private Integer matchStatus;

	/**
	 * 比赛状态
	 */
	private Integer[] matchStatusArr;

	/**
	 * 最近期数
	 */
	private Integer issuceSize;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}
	
	public Integer getRaceId() {
		return raceId;
	}

	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getStartIssueCode() {
		return startIssueCode;
	}

	public void setStartIssueCode(String startIssueCode) {
		this.startIssueCode = startIssueCode;
	}

	public String getEndIssueCode() {
		return endIssueCode;
	}

	public void setEndIssueCode(String endIssueCode) {
		this.endIssueCode = endIssueCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Integer matchStatus) {
		this.matchStatus = matchStatus;
	}

	public Integer[] getMatchStatusArr() {
		return matchStatusArr;
	}

	public void setMatchStatusArr(Integer[] matchStatusArr) {
		this.matchStatusArr = matchStatusArr;
	}

	public Integer getIssuceSize() {
		return issuceSize;
	}

	public void setIssuceSize(Integer issuceSize) {
		this.issuceSize = issuceSize;
	}

}
