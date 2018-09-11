package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 竞技彩sp值信息
 * @author lidecheng
 * @date 2017年4月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class JcMathSPBO extends BaseBO{
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
	private String newestSpWin ;
	/*** 平sp*/
	private String newestSpDraw ;
	/*** 负sp*/
	private String newestSpFail ;
	/**主队logo url*/
	private String homeLogoUrl;
	/**客队logo url*/
	private String visitiLogoUrl;
	/**让分*/
	private Integer newestLetNum ;
	/**
	 * 客队简称
	 */
	private String visitiShortName;
	/**
	 * 主队简称
	 */
	private String homeShortName;
	private Integer lotteryCode;
	private Integer issueCode;
	
	/**
	 * 胜平负状态
	 */
	private Short wdfStatus;
	
	/**
	 * 竞彩官网id
	 */
	private String officialId;
	
	/**
	 * 订单购买次数
	 */
	private Integer buyCount;
	
	public Integer getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(Integer issueCode) {
		this.issueCode = issueCode;
	}
	/**
	 * 赛事编号
	 */
	private String systemCode;
	/**
	 * 官方赛事编号
	 */
	private String officialMatchCode;
	
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
		this.systemCode = systemCode;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
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
	public Integer getNewestLetNum() {
		return newestLetNum;
	}
	public void setNewestLetNum(Integer newestLetNum) {
		this.newestLetNum = newestLetNum;
	}
	/**截止销售时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;
	
	private JcMathWinSPBO jcDCZSBO;

	
	public JcMathWinSPBO getJcDCZSBO() {
		return jcDCZSBO;
	}
	public void setJcDCZSBO(JcMathWinSPBO jcDCZSBO) {
		this.jcDCZSBO = jcDCZSBO;
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
	public String getNewestSpWin() {
		return newestSpWin;
	}
	public void setNewestSpWin(String newestSpWin) {
		this.newestSpWin = newestSpWin;
	}
	public String getNewestSpDraw() {
		return newestSpDraw;
	}
	public void setNewestSpDraw(String newestSpDraw) {
		this.newestSpDraw = newestSpDraw;
	}
	public String getNewestSpFail() {
		return newestSpFail;
	}
	public void setNewestSpFail(String newestSpFail) {
		this.newestSpFail = newestSpFail;
	}
	public Short getWdfStatus() {
		return wdfStatus;
	}
	public void setWdfStatus(Short wdfStatus) {
		this.wdfStatus = wdfStatus;
	}
	public String getOfficialId() {
		return officialId;
	}
	public void setOfficialId(String officialId) {
		this.officialId = officialId;
	}
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
}
