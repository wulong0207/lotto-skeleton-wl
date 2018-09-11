package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @desc 竞技彩sp值信息
 * @author lidecheng
 * @date 2017年4月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class JcMathWinSPBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 226541788267039738L;
	/**对阵id*/
	private Long id;
	/**比赛名称*/
	private String matchName;
	/**比赛时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date  startTime;
	/**主场名称*/
	private String homeName;
	/**客场比赛名称*/
	private String visitiName;
	/*** 胜sp*/
	private Float newestSpWin ;
	/*** 平sp*/
	private Float newestSpDraw ;
	/*** 负sp*/
	private Float newestSpFail ;
	/*** 让分胜sp*/
	private Float newestLetSpWin ;
	/*** 让分平sp*/
	private Float newestLetSpDraw ;
	/*** 让分负sp*/
	private Float newestLetSpFail ;
	/**主队logo url*/
	private String homeLogoUrl;
	/**客队logo url*/
	private String visitiLogoUrl;	
	/**让分*/
	private Integer newestLetNum ;
	/**截止销售时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;
	/**
	 * 客队简称
	 */
	private String visitiShortName;
	/**
	 * 主队简称
	 */
	private String homeShortName;
	private String systemCode;
	
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public String getVisitiShortName() {
		return visitiShortName;
	}
	public void setVisitiShortName(String visitiShortName) {
		this.visitiShortName = visitiShortName;
	}
	public String getHomeShortName() {
		return homeShortName;
	}
	public void setHomeShortName(String homeShortName) {
		this.homeShortName = homeShortName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getSaleEndTime() {
		return saleEndTime;
	}
	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}
	public String getHomeLogoUrl() {
		return homeLogoUrl;
	}
	public void setHomeLogoUrl(String homeLogoUrl) {
		this.homeLogoUrl = homeLogoUrl;
	}
	public String getVisitiLogoUrl() {
		return visitiLogoUrl;
	}
	public void setVisitiLogoUrl(String visitiLogoUrl) {
		this.visitiLogoUrl = visitiLogoUrl;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public String getVisitiName() {
		return visitiName;
	}
	public void setVisitiName(String visitiName) {
		this.visitiName = visitiName;
	}
	public Float getNewestSpWin() {
		return newestSpWin;
	}
	public void setNewestSpWin(Float newestSpWin) {
		this.newestSpWin = newestSpWin;
	}
	public Float getNewestSpDraw() {
		return newestSpDraw;
	}
	public void setNewestSpDraw(Float newestSpDraw) {
		this.newestSpDraw = newestSpDraw;
	}
	public Float getNewestSpFail() {
		return newestSpFail;
	}
	public void setNewestSpFail(Float newestSpFail) {
		this.newestSpFail = newestSpFail;
	}
	public Float getNewestLetSpWin() {
		return newestLetSpWin;
	}
	public void setNewestLetSpWin(Float newestLetSpWin) {
		this.newestLetSpWin = newestLetSpWin;
	}
	public Float getNewestLetSpDraw() {
		return newestLetSpDraw;
	}
	public void setNewestLetSpDraw(Float newestLetSpDraw) {
		this.newestLetSpDraw = newestLetSpDraw;
	}
	public Float getNewestLetSpFail() {
		return newestLetSpFail;
	}
	public void setNewestLetSpFail(Float newestLetSpFail) {
		this.newestLetSpFail = newestLetSpFail;
	}
	public Integer getNewestLetNum() {
		return newestLetNum;
	}
	public void setNewestLetNum(Integer newestLetNum) {
		this.newestLetNum = newestLetNum;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("matchName", matchName)
				.append("startTime", startTime)
				.append("homeName", homeName)
				.append("visitiName", visitiName)
				.append("newestSpWin", newestSpWin)
				.append("newestSpDraw", newestSpDraw)
				.append("newestSpFail", newestSpFail)
				.append("newestLetSpWin", newestLetSpWin)
				.append("newestLetSpDraw", newestLetSpDraw)
				.append("newestLetSpFail", newestLetSpFail)
				.append("homeLogoUrl", homeLogoUrl)
				.append("visitiLogoUrl", visitiLogoUrl)
				.append("newestLetNum", newestLetNum)
				.append("saleEndTime", saleEndTime)
				.append("visitiShortName", visitiShortName)
				.append("homeShortName", homeShortName)
				.append("systemCode", systemCode)
				.toString();
	}
}
