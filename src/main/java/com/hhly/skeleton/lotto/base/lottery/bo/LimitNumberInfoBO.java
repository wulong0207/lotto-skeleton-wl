package com.hhly.skeleton.lotto.base.lottery.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hhly.skeleton.base.bo.BaseBO;


/**
 * @desc 限号基本信息
 * @author Bruce
 * @date 2017年3月8日
 * @company 益彩网络科技有限公司
 * @version 1.0
 */
@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class LimitNumberInfoBO extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 彩种编码
	 */
	private Integer lotteryCode;
	/**
	 * 状态；；1：启用；2：禁用；3：过期
	 */
	private Short status;
	/**
	 * 限号类型;;1：所有类型；2：全匹配内容限制；3：部分匹配该内容限制
	 */
	private Short limitType;

	/**
	 * 限号彩期开始
	 */
	private String issueStart;
	/**
	 * 限号彩期结束
	 */
	private String issueEnd;
	/**
	 * 限号时间开始
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeStart;
	/**
	 * 限号时间结束
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeEnd;
	/**
	 * 1：限号彩期；2：限号时间
	 */
	private Short limitWay;
	
	/**
	 * 限号详情
	 */
	private List<LimitNumberDetailBO> limitNumberList;
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public Short getLimitType() {
		return limitType;
	}
	public void setLimitType(Short limitType) {
		this.limitType = limitType;
	}
	public String getIssueStart() {
		return issueStart;
	}
	public void setIssueStart(String issueStart) {
		this.issueStart = issueStart;
	}
	public String getIssueEnd() {
		return issueEnd;
	}
	public void setIssueEnd(String issueEnd) {
		this.issueEnd = issueEnd;
	}
	public Date getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
	public Date getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public Short getLimitWay() {
		return limitWay;
	}
	public void setLimitWay(Short limitWay) {
		this.limitWay = limitWay;
	}
	public List<LimitNumberDetailBO> getLimitNumberList() {
		return limitNumberList;
	}
	public void setLimitNumberList(List<LimitNumberDetailBO> limitNumberList) {
		this.limitNumberList = limitNumberList;
	}
}
