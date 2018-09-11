package com.hhly.skeleton.lotto.base.issue.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩期BO
 * @author huangb
 * @date 2017年3月8日
 * @company 益彩网络
 * @version v1.0
 */
public class IssueBO extends BaseBO {

	private static final long serialVersionUID = -3715256399122120672L;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期期号
	 */
	private String issueCode;

	/**
	 * 0：暂停销售；1：未开售；2：预售中；3：销售中；4：销售截止；5：已开奖；6：已派奖；7：已兑奖
	 */
	private Short saleStatus;

	/**
	 * 本站截止销售时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;

	/**
	 * 官方截止销售时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date officialEndTime;


    private Date officialStartTime;
    /**
	 * 奖池金额
	 */
	private Long jackpotAmount;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	/**
	 * 格式例如： 一等奖,2,10000000 | 二等奖,5,200000 |用 | 线隔开；代表 奖项，注数，每注中奖金额
	 */
	private String drawDetail;
	/**
	 * 服务器当前时间（用于前端倒计时用）
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date currentDateTime;
	
	/**
	 * 官方开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;

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

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Long getJackpotAmount() {
		return jackpotAmount;
	}

	public void setJackpotAmount(Long jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
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

	public Date getCurrentDateTime() {
		return new Date();
	}

    public Date getOfficialStartTime() {
        return officialStartTime;
    }

    public void setOfficialStartTime(Date officialStartTime) {
        this.officialStartTime = officialStartTime;
    }

    public void setCurrentDateTime(Date currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}


}
