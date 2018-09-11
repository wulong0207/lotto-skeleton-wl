package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.CustomFloatSerialize;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @desc  竞彩比赛信息
 * @author lidecheng
 * @date 2017年4月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class JcMatchBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1772218102475036109L;
	/**比赛名称*/
	private String matchName;
	/**比赛时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date  startTime;
	/**主场名称*/
	private String homeName;
	/**客场比赛名称*/
	private String visitiName;
	/** 平均欧赔胜 */
	@JsonSerialize(using = CustomFloatSerialize.class)
	private Float oddsWin;
	/** 平均欧赔平 */
	@JsonSerialize(using = CustomFloatSerialize.class)
	private Float oddsDraw;
	/** 平均欧赔负 */
	@JsonSerialize(using = CustomFloatSerialize.class)
	private Float oddsFail;
	/**match_data_url */
	private String m_d_id;
	private String matchInfoUrl;
	
	public String getM_d_id() {
		return m_d_id;
	}
	public void setM_d_id(String m_d_id) {
		this.m_d_id = m_d_id;
	}
	public String getMatchInfoUrl() {
		return matchInfoUrl;
	}
	public void setMatchInfoUrl(String matchInfoUrl) {
		this.matchInfoUrl = matchInfoUrl;
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
	public Float getOddsWin() {
		return oddsWin;
	}
	public void setOddsWin(Float oddsWin) {
		this.oddsWin = oddsWin;
	}
	public Float getOddsDraw() {
		return oddsDraw;
	}
	public void setOddsDraw(Float oddsDraw) {
		this.oddsDraw = oddsDraw;
	}
	public Float getOddsFail() {
		return oddsFail;
	}
	public void setOddsFail(Float oddsFail) {
		this.oddsFail = oddsFail;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("matchName", matchName)
				.append("startTime", startTime)
				.append("homeName", homeName)
				.append("visitiName", visitiName)
				.append("oddsWin", oddsWin)
				.append("oddsDraw", oddsDraw)
				.append("oddsFail", oddsFail)
				.append("m_d_id", m_d_id)
				.append("matchInfoUrl", matchInfoUrl)
				.toString();
	}
}
