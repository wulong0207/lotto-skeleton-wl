package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号期数信息
 */
public class OrderAddIssueVO extends BaseVO {

	private static final long serialVersionUID = -1071799747936455945L;
	/**
	 * 彩期期号
	 */
	private String issueCode;
	/**
	 * 认购金额
	 */
	private Double buyAmount;
	/**
	 * 倍数
	 */
	private Integer multiple;
	/**
	 * 每期追号投注注数
	 */
	private Integer chaseBetNum;

	public OrderAddIssueVO() {
	}

	/**
	 * @param issueCode
	 *            每期期号
	 * @param chaseBetNum
	 *            每期追号注数
	 * @param multiple
	 *            每期追号倍数
	 * @param buyAmount
	 *            每期追号金额
	 */
	public OrderAddIssueVO(String issueCode, Integer chaseBetNum, Integer multiple, Double buyAmount) {
		this.issueCode = issueCode;
		this.chaseBetNum = chaseBetNum;
		this.multiple = multiple;
		this.buyAmount = buyAmount;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Integer getChaseBetNum() {
		return chaseBetNum;
	}

	public void setChaseBetNum(Integer chaseBetNum) {
		this.chaseBetNum = chaseBetNum;
	}

}
