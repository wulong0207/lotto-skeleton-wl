package com.hhly.skeleton.task.order.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 追号计划信息
 * @author huangb
 * @date 2017年4月20日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseInfoBO extends BaseBO {

	private static final long serialVersionUID = -1809717382156947941L;
	/**
	 * 追号计划，自增ID
	 */
	private Long id;
	/**
	 * 自定义追号编号
	 */
	private String orderAddCode;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 渠道表自定义的ID
	 */
	private String channelId;
	/**
	 * 追号类型； 1：固定选号；2：随机选号
	 */
	private Short addType;
	/**
	 * 追号投注数(主要保存随机追号时的注数；选号追号也可以保留注数)
	 */
	private Integer addCount;
	/**
	 * 中奖税前奖金(追号各期累计金额)
	 */
	private Double preBonus;
	/**
	 * 中奖税后奖金(追号各期累计金额)
	 */
	private Double aftBonus;
	/**
	 * 追号状态； 1：追号中；2：中奖停追；3：追号结束；4：用户撤单；5：系统撤单；
	 */
	private Short addStatus;
	/**
	 * 停追类型； 1：奖项；2：金额；3：永追
	 */
	private Short stopType;
	/**
	 * 停追条件；例如：奖项：二等奖；永追：空；金额：5000
	 */
	private String stopCondition;
	/**
	 * 0：否；1：是
	 */
	private Short isDltAdd;
	/**
	 * 追号期数
	 */
	private Integer issueAmount;
	/**
	 * 已追期数
	 */
	private Integer hadIssue;
	/**
	 * 关联的追号彩期（用于关联当前追号期号）
	 */
	private ChaseIssueBO chaseIssue;
	/**
	 * 停追奖项名称（停追类型=1时用到）
	 */
	private String stopPrizeName;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	/**
	 * 官方截止出票时间；高频，数字彩，老足彩：取lottery_issue official_end_time； 其它竞技彩：....
	 */
	private Date endTicketTime;
	
	/***20170808 add***/
	/**
	 * 投注平台:1：Web,2:Wap;3:Android;4:IOS   (生成追号订单时使用)
	 */
	private Short platform;
	/**
	 * 追号期的最终检票时间；lottery_type的end_check_time 与 end_ticket_time 进行计算。   (生成追号订单时使用)
	 */
	private Date endCheckTime;
	
	/***20180125 added***/
	/**
	 * 追号计划对应的活动编号
	 */
	private String activityId;

	public ChaseInfoBO() {
	}

	public ChaseInfoBO(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public ChaseInfoBO(String orderAddCode, Long userId) {
		this(orderAddCode);
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Short getAddType() {
		return addType;
	}

	public void setAddType(Short addType) {
		this.addType = addType;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public Short getStopType() {
		return stopType;
	}

	public void setStopType(Short stopType) {
		this.stopType = stopType;
	}

	public String getStopCondition() {
		return stopCondition;
	}

	public void setStopCondition(String stopCondition) {
		this.stopCondition = stopCondition;
	}

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

	public Integer getIssueAmount() {
		return issueAmount;
	}

	public void setIssueAmount(Integer issueAmount) {
		this.issueAmount = issueAmount;
	}

	public Integer getHadIssue() {
		return hadIssue;
	}

	public void setHadIssue(Integer hadIssue) {
		this.hadIssue = hadIssue;
	}

	public ChaseIssueBO getChaseIssue() {
		return chaseIssue;
	}

	public void setChaseIssue(ChaseIssueBO chaseIssue) {
		this.chaseIssue = chaseIssue;
	}

	public String getStopPrizeName() {
		return stopPrizeName;
	}

	public void setStopPrizeName(String stopPrizeName) {
		this.stopPrizeName = stopPrizeName;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Date getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Date getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Date endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
}
