package com.hhly.skeleton.cms.sportmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;


/**
 * @desc 北京单场导出excelBO
 * @author tangxiaobo
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class SportBJDataExcelBO extends BaseBO {
	@ExcelHeader("序号")
	private Long againstId;

	@ExcelHeader("彩期编号")
	private Integer issueCode;
	
	@ExcelHeader("系统编号")
	private Integer systemCode;
	
	@ExcelHeader("彩种编号")
	private Integer lotteryCode;

	@ExcelHeader("比赛时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startTime; 
	
	@ExcelHeader("赛事全称")
	private String matchFullName;

	@ExcelHeader("赛事简称")
	private String matchShortName;

	@ExcelHeader("主队球队全称")
	private String homeTeamFullName;

	@ExcelHeader("主队球队简称")
	private String homeTeamShortName;

	@ExcelHeader("客队球队全称")
	private String guestTeamFullName;

	@ExcelHeader("客队球队简称")
	private String guestTeamShortName;

	@ExcelHeader("赛事状态")
	private Short matchStatus;
	
	@ExcelHeader("半场比分")
	private String halfScore;

	@ExcelHeader("全场比分")
	private String fullScore;
	
	@ExcelHeader("胜平负")
	private String spHfWdf;
	
	@ExcelHeader("总进球数")
	private String spGoalNum;
	
	@ExcelHeader("上下盘单双")
	private String spUdSd;
	
	@ExcelHeader("单场比分")
	private String spScore;
	
	@ExcelHeader("官方id")
	private String officialId;

	@ExcelHeader("赛事分析id")
	private String analysisUrl;
	
	@ExcelHeader("其他")
	private String wrong;
	
	@ExcelHeader("是否推荐")
	private Integer isRecommend;

	public Long getAgainstId() {
		return againstId;
	}

	public void setAgainstId(Long againstId) {
		this.againstId = againstId;
	}

	public Integer getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(Integer issueCode) {
		this.issueCode = issueCode;
	}

	public Integer getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(Integer systemCode) {
		this.systemCode = systemCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getMatchFullName() {
		return matchFullName;
	}

	public void setMatchFullName(String matchFullName) {
		this.matchFullName = matchFullName;
	}

	public String getMatchShortName() {
		return matchShortName;
	}

	public void setMatchShortName(String matchShortName) {
		this.matchShortName = matchShortName;
	}

	public String getHomeTeamFullName() {
		return homeTeamFullName;
	}

	public void setHomeTeamFullName(String homeTeamFullName) {
		this.homeTeamFullName = homeTeamFullName;
	}

	public String getHomeTeamShortName() {
		return homeTeamShortName;
	}

	public void setHomeTeamShortName(String homeTeamShortName) {
		this.homeTeamShortName = homeTeamShortName;
	}

	public String getGuestTeamFullName() {
		return guestTeamFullName;
	}

	public void setGuestTeamFullName(String guestTeamFullName) {
		this.guestTeamFullName = guestTeamFullName;
	}

	public String getGuestTeamShortName() {
		return guestTeamShortName;
	}

	public void setGuestTeamShortName(String guestTeamShortName) {
		this.guestTeamShortName = guestTeamShortName;
	}

	public Short getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
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


	public String getOfficialId() {
		return officialId;
	}

	public void setOfficialId(String officialId) {
		this.officialId = officialId;
	}

	public String getAnalysisUrl() {
		return analysisUrl;
	}

	public void setAnalysisUrl(String analysisUrl) {
		this.analysisUrl = analysisUrl;
	}

	public String getWrong() {
		return wrong;
	}

	public void setWrong(String wrong) {
		this.wrong = wrong;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

}
