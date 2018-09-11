package com.hhly.skeleton.lotto.base.order.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号计划信息
 */
public class OrderAddVO extends BaseVO {

	private static final long serialVersionUID = 7144416346601990520L;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期编号
	 */
	private String issueCode;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 渠道表自定义的ID
	 */
	private String channelId;
	/**
	 * 追号金额
	 */
	private Double addAmount;
	/**
	 * 方案倍数(该倍数无实际操作意义，仅仅是各追号子彩期倍数的和)
	 */
	private Integer multipleNum;
	/**
	 * 追号类型； 1：固定选号；2：随机选号
	 */
	private Short addType;
	/**
	 * 追号投注数(主要保存随机追号时的注数；选号追号也可以保留注数)
	 */
	private Integer addCount;
	/**
	 * 活动来源ID
	 */
	private String activityId;
	/**
	 * 停追类型； 1：奖项；2：金额；3：永追
	 */
	private Short stopType;
	/**
	 * 停追条件；例如：奖项：二等奖；永追：空；金额：5000
	 */
	private String stopCondition;
	/**
	 * 投注内容,拼接格式自定义(选球(根据单/复式/胆拖规则拼接):注数:倍数:金额:子玩法:选号方式:内容类型:投注模式)
	 */
	//private String betContent;
	/**
	 * 追号内容列表(根据投注内容生成)
	 */
	private List<OrderDetailVO> orderAddContentList;
	/**
	 * 追号期数,拼接格式自定义(期号:每期注数:每期倍数:每期金额)
	 */
	//private String addIssue;
	/**
	 * 追号期数列表
	 */
	private List<OrderAddIssueVO> orderAddIssueList;
	/**
	 * 是否大乐透追加 0：否；1：是
	 */
	private Short isDltAdd;
	/**
	 * 用户登录令牌
	 */
	private String token;
	
	/********移动端追号用(pc端会提供追号彩期的信息；移动端仅提供追号期数和追号倍数，所以要计算出彩期信息)*******/
	/**
	 * 追号计划来源 1:PC 2:IOS 3:H5 4:android
	 */
	private Short source;
	/**
	 * 移动端追号期数
	 */
	private Integer addIssues;
	/**
	 * 移动端追号倍数
	 */
	private Integer addMultiples;
	/**
	 * 未支付订单数量（验证及返回用） 
	 */
	private Integer noPayCount;
	/********* 20170525 add ********/
	/**
	 * 支付截止时间
	 */
	private Date payEndTime;
	/**
	 * 是否包含当前期 0:否， 1:是
	 */
	private Short containCurIssue;
	/********* 20170607 add ********/
	/**
	 * 投注平台:1：Web,2:Wap;3:Android;4:IOS;
	 */
	private Short platform;
	/********* 20171017 add 主要用于区分移动端追号类型(普通追号或高级追号),非接收参数,内部使用 ********/
	/**
	 * 是否是高级追号true/false, 默认false
	 */
	private boolean highChase = false;

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(Double addAmount) {
		this.addAmount = addAmount;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Short getAddType() {
		return addType;
	}

	public void setAddType(Short addType) {
		this.addType = addType;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
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

	public List<OrderDetailVO> getOrderAddContentList() {
		return orderAddContentList;
	}

	public void setOrderAddContentList(List<OrderDetailVO> orderAddContentList) {
		this.orderAddContentList = orderAddContentList;
	}

	public List<OrderAddIssueVO> getOrderAddIssueList() {
		return orderAddIssueList;
	}

	public void setOrderAddIssueList(List<OrderAddIssueVO> orderAddIssueList) {
		this.orderAddIssueList = orderAddIssueList;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

	public Short getSource() {
		return source;
	}

	public void setSource(Short source) {
		this.source = source;
	}

	public Integer getAddIssues() {
		return addIssues;
	}

	public void setAddIssues(Integer addIssues) {
		this.addIssues = addIssues;
	}

	public Integer getAddMultiples() {
		return addMultiples;
	}

	public void setAddMultiples(Integer addMultiples) {
		this.addMultiples = addMultiples;
	}

	public Integer getNoPayCount() {
		return noPayCount;
	}

	public void setNoPayCount(Integer noPayCount) {
		this.noPayCount = noPayCount;
	}

	public Date getPayEndTime() {
		return payEndTime;
	}

	public void setPayEndTime(Date payEndTime) {
		this.payEndTime = payEndTime;
	}

	public Short getContainCurIssue() {
		return containCurIssue;
	}

	public void setContainCurIssue(Short containCurIssue) {
		this.containCurIssue = containCurIssue;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public boolean isHighChase() {
		return highChase;
	}

	public void setHighChase(boolean highChase) {
		this.highChase = highChase;
	}
}
