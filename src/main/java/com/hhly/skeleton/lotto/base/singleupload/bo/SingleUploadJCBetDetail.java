package com.hhly.skeleton.lotto.base.singleupload.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;


/**
 * 
 * @desc 单式上转投注详情(竞彩)
 * @author zhanglei
 * @date 2017年6月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SingleUploadJCBetDetail extends BaseBO{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 场次编号 如:1001->星期一001
	 */
	@JsonProperty("sn")
	private String sessionNumber;
	
	/**
	 * 投注彩果(单个场次) 如:胜平负  -> 310
	 */
	@JsonProperty("lr")
	private String lotteryResult;
	
	/**
	 * 用户投注彩果(单个场次) 如:胜平负  -> abc 【有转换格式时要传此值】
	 */
	@JsonProperty("ur")
	private String userResult;
	
	/**
	 * 玩法(目前只有混投上传时需要,区分 胜平负[S]/让胜平负[R])
	 */
	@JsonProperty("play")
	private String play;
	
	/**
	 * 该场次最后截止销售时间
	 */
	@JsonIgnore
	private Date saleEndTime;
	
	/**
	 * 彩期
	 */
	@JsonIgnore
	private String issueCode;

	public String getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(String sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	public String getLotteryResult() {
		return lotteryResult;
	}

	public void setLotteryResult(String lotteryResult) {
		this.lotteryResult = lotteryResult;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}

	public String getUserResult() {
		return userResult;
	}

	public void setUserResult(String userResult) {
		this.userResult = userResult;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

}
