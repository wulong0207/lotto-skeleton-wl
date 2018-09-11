package com.hhly.skeleton.lotto.base.recommend.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RcmdUserDetailBO extends BaseBO {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 周期类型；2：近1周 3：近15天
	 */
	private Integer type;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 玩法编号
	 */
	private Integer lotteryChildCode;

	/**
	 * 过关方式；1：单关 2：2串1实单(暂时不合并)；后续外围玩法等(注：目前仅针对竞足)
	 */
	private Integer passWay;

	/**
	 * 命中率
	 */
	private double hitRate;

	/**
	 * 盈利率
	 */
	private double profitRate;

	/**
	 * 关注总人数
	 */
	private Integer focusNum;

	/**
	 * 发单总次数
	 */
	private Integer issueNum;

	/**
	 * 发单总金额
	 */
	private double issueAmount;

	/**
	 * 命中次数
	 */
	private Integer hitNum;

	/**
	 * 命中订单总金额
	 */
	private double hitMoney;

	/**
	 * 返佣总金额
	 */
	private double commissionAmount;

	/**
	 * 跟单总人数
	 */
	private Integer followNum;

	/**
	 * 跟单总金额
	 */
	private double followAmount;

	/**
	 * 付费人数（购买人数）
	 */
	private Integer payCounts;

	/**
	 * 付费总额（购买总额）
	 */
	private double payAmount;

	/**
	 * 阅读总数量/总浏览量
	 */
	private Integer clicks;

	/**
	 * 近期状态;1:不好；2：好；3：非常好
	 */
	private double recentStatus;

	/**
	 * 近期状态走势；如：中,不中,中,中.....标识规则可自定
	 */
	private String recentStatusTrend;

	/**
	 * 连红数
	 */
	private Integer continueHit;

	/**
	 * 用户近期战绩；仅提供近7天；例如近7中7
	 */
	private String recentRecord;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 修改人
	 */
	private String modifyBy;

	/**
	 * 备注说明
	 */
	private String remark;
	private double returnRate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}



	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}



	public Integer getPassWay() {
		return passWay;
	}

	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}

	public double getHitRate() {
		return hitRate;
	}

	public void setHitRate(double hitRate) {
		this.hitRate = hitRate;
	}

	public double getProfitRate() {
		return profitRate;
	}

	public void setProfitRate(double profitRate) {
		this.profitRate = profitRate;
	}

	public Integer getFocusNum() {
		return focusNum;
	}

	public void setFocusNum(Integer focusNum) {
		this.focusNum = focusNum;
	}

	public Integer getIssueNum() {
		return issueNum;
	}

	public void setIssueNum(Integer issueNum) {
		this.issueNum = issueNum;
	}

	public double getIssueAmount() {
		return issueAmount;
	}

	public void setIssueAmount(double issueAmount) {
		this.issueAmount = issueAmount;
	}

	public Integer getHitNum() {
		return hitNum;
	}

	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}

	public double getHitMoney() {
		return hitMoney;
	}

	public void setHitMoney(double hitMoney) {
		this.hitMoney = hitMoney;
	}

	public double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Integer getFollowNum() {
		return followNum;
	}

	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}

	public double getFollowAmount() {
		return followAmount;
	}

	public void setFollowAmount(double followAmount) {
		this.followAmount = followAmount;
	}

	public Integer getPayCounts() {
		return payCounts;
	}

	public void setPayCounts(Integer payCounts) {
		this.payCounts = payCounts;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public double getRecentStatus() {
		return recentStatus;
	}

	public void setRecentStatus(double recentStatus) {
		this.recentStatus = recentStatus;
	}

	public String getRecentStatusTrend() {
		return recentStatusTrend;
	}

	public void setRecentStatusTrend(String recentStatusTrend) {
		this.recentStatusTrend = recentStatusTrend == null ? null : recentStatusTrend.trim();
	}

	public Integer getContinueHit() {
		return continueHit;
	}

	public void setContinueHit(Integer continueHit) {
		this.continueHit = continueHit;
	}

	public String getRecentRecord() {
		return recentRecord;
	}

	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord == null ? null : recentRecord.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy == null ? null : modifyBy.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public double getReturnRate() {
		return returnRate;
	}

	public void setReturnRate(double returnRate) {
		this.returnRate = returnRate;
	}

}