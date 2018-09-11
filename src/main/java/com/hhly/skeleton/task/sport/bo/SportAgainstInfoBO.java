package com.hhly.skeleton.task.sport.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 竞技彩对阵信息表
 * @author huangb
 * @date 2017年6月6日
 * @company 益彩网络
 * @version v1.0
 */
public class SportAgainstInfoBO extends BaseBO {

	private static final long serialVersionUID = -985519895041871931L;

	private Long id;

	private Integer lotteryCode;

	private String issueCode;

	private Long sportMatchInfoId;

	private Long homeTeamId;

	private Long visitiTeamId;

	private String matchAnalysisUrl;

	private String matchInfoUrl;

	private Short isRecommend;

	private String matchLabelColor;

	private String officialMatchCode;
	/**
	 * 系统编号；也可代表场次编号进行排序。
	 */
	private String systemCode;

	private Short matchStatus;

	private String officialId;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;

	private Short isNeutral;

	private String stadium;

	private String weather;

	private String modifyBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;

	private String createBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		this.issueCode = issueCode == null ? null : issueCode.trim();
	}

	public Long getSportMatchInfoId() {
		return sportMatchInfoId;
	}

	public void setSportMatchInfoId(Long sportMatchInfoId) {
		this.sportMatchInfoId = sportMatchInfoId;
	}

	public Long getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(Long homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public Long getVisitiTeamId() {
		return visitiTeamId;
	}

	public void setVisitiTeamId(Long visitiTeamId) {
		this.visitiTeamId = visitiTeamId;
	}

	public String getMatchAnalysisUrl() {
		return matchAnalysisUrl;
	}

	public void setMatchAnalysisUrl(String matchAnalysisUrl) {
		this.matchAnalysisUrl = matchAnalysisUrl == null ? null : matchAnalysisUrl.trim();
	}

	public String getMatchInfoUrl() {
		return matchInfoUrl;
	}

	public void setMatchInfoUrl(String matchInfoUrl) {
		this.matchInfoUrl = matchInfoUrl == null ? null : matchInfoUrl.trim();
	}

	public Short getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}

	public String getMatchLabelColor() {
		return matchLabelColor;
	}

	public void setMatchLabelColor(String matchLabelColor) {
		this.matchLabelColor = matchLabelColor == null ? null : matchLabelColor.trim();
	}

	public String getOfficialMatchCode() {
		return officialMatchCode;
	}

	public void setOfficialMatchCode(String officialMatchCode) {
		this.officialMatchCode = officialMatchCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode == null ? null : systemCode.trim();
	}

	public Short getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(Short matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getOfficialId() {
		return officialId;
	}

	public void setOfficialId(String officialId) {
		this.officialId = officialId == null ? null : officialId.trim();
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Short getIsNeutral() {
		return isNeutral;
	}

	public void setIsNeutral(Short isNeutral) {
		this.isNeutral = isNeutral;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}