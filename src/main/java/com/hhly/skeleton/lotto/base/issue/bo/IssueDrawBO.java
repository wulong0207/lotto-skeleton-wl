package com.hhly.skeleton.lotto.base.issue.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * @desc 彩期开奖信息实体(如最近开奖，最新开奖)
 * @author huangb
 * @date 2017年3月30日
 * @company 益彩网络
 * @version v1.0
 */
public class IssueDrawBO extends BaseBO {

	private static final long serialVersionUID = 1857606220544299298L;
	/**
	 * 彩期期号
	 */
	private String issueCode;

	/**
	 * 奖池金额
	 */
	private Long jackpotAmount;

	/**
	 * 当前奖池可中500w注数
	 */
	private Integer drawNumCount;

	/**
	 * 开奖号码
	 */
	private String drawCode;
	/**
	 * 格式例如:一等奖|2|10000000 ,二等奖|5|200000,用 '|' 隔开；代表 奖项，注数，每注中奖金额 ，奖项与奖项之间用','号隔开。
	 */
	private String drawDetail;
	/**
	 * 官方截止销售时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date officialEndTime;
	/**
	 * 试机号;目前仅福彩3D有试机号
	 */
	private String drawCodeTest;
	/**
	 * 开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;
	/**
	 * 本期销售金额
	 */
	private Long salesAmount;
	/**
	 * 其它开奖信息
	 */
	private DrawOtherBO other;

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Long getJackpotAmount() {
		return jackpotAmount;
	}

	public void setJackpotAmount(Long jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
	}

	public Integer getDrawNumCount() {
		return drawNumCount;
	}

	public void setDrawNumCount(Integer drawNumCount) {
		this.drawNumCount = drawNumCount;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public String getDrawDetail() {
		return drawDetail;
	}

	public void setDrawDetail(String drawDetail) {
		this.drawDetail = drawDetail;
	}

	public Date getOfficialEndTime() {
		return officialEndTime;
	}

	public void setOfficialEndTime(Date officialEndTime) {
		this.officialEndTime = officialEndTime;
	}

	public String getDrawCodeTest() {
		return drawCodeTest;
	}

	public void setDrawCodeTest(String drawCodeTest) {
		this.drawCodeTest = drawCodeTest;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public Long getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Long salesAmount) {
		this.salesAmount = salesAmount;
	}

	public DrawOtherBO getOther() {
		return other;
	}

	public void setOther(DrawOtherBO other) {
		this.other = other;
	}
}
