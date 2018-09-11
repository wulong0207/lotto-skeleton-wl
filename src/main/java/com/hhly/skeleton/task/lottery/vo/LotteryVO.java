package com.hhly.skeleton.task.lottery.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

/**
 * @desc 彩种VO
 * @author huangb
 * @date 2017年3月6日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryVO extends BaseVO {
	private static final long serialVersionUID = -7628758487059355101L;

	/**
	 * 彩种code
	 */
	private Integer lotteryCode;

	/**
	 * 彩种类型
	 */
	private Short lotteryCategory;

	/**
	 * 彩期
	 */
	private String issueCode;

	/**
	 * 是否当前期0：不是当前期；1：当前期
	 */
	private Short currentIssue;
	/**
	 * 主表限号状态1：启用；2：禁用；3：过期
	 */
	private Short status;
	/**
	 * 限号日期
	 */
	private Date limitDate;

    private Date lotteryTime;

	/**
	 * 来源
	 */
	private int source;

	/**
	 * 排序SQL
	 */
	private String orderSql;

	/**
	 * lottery_issue id
	 */
	private Integer issueId;

	public Integer getIssueId() {
		return issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

	public String getOrderSql() {
		return orderSql;
	}

	public void setOrderSql(String orderSql) {
		this.orderSql = orderSql;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public Date getLotteryTime() {
		return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

	public LotteryVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 */
	public LotteryVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public LotteryVO(String issueCode) {
		this.issueCode = issueCode;
	}

	/**
	 * 通过彩种，彩期，来源创建对象
	 *
	 * @param lotteryCode 彩种
	 * @param issueCode   彩期
	 * @param source      来源
	 * @return LotteryVO
	 */
	public static LotteryVO newVO(Integer lotteryCode, String issueCode, int source) {
		LotteryVO lotteryVO = new LotteryVO();
		lotteryVO.setLotteryCode(lotteryCode);
		lotteryVO.setIssueCode(issueCode);
		lotteryVO.setSource(source);
		return lotteryVO;
	}


	/**
	 * @param lotteryCode
	 *            彩种
	 * @param currentIssue
	 *            当前期
	 */
	public LotteryVO(Integer lotteryCode, Short currentIssue) {
		this(lotteryCode);
		this.currentIssue = currentIssue;
	}

	/**
	 * @param lotteryCode
	 * @param issueCode
	 */
	public LotteryVO(Integer lotteryCode, String issueCode) {
		this.lotteryCode = lotteryCode;
		this.issueCode = issueCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Short getCurrentIssue() {
		return currentIssue;
	}

	public void setCurrentIssue(Short currentIssue) {
		this.currentIssue = currentIssue;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getLimitDate() {
		return limitDate;
	}

	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

}
