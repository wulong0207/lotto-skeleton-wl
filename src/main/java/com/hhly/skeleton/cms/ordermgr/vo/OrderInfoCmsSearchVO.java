package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-12 上午10:35:27
 * @Desc 后台管理系统订单查询条件
 */
public class OrderInfoCmsSearchVO extends PageVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7975089020583108089L;
	/**
	 * 彩种编码
	 */
	private String lotteryCode;
	/**
	 * 彩期
	 */
	private String lotteryIssue;
	/**
	 * 最大竞猜编号
	 */
	private String maxBuyScreen;
	/**
	 * 竞猜编号
	 */
	private String buyScreen;

	/**
	 * 市场渠道
	 */
	private String channelId;
	/**
	 * 投注平台;1：Web,2:Wap;3:Android;4:IOS
	 */
	private Integer platform;
	/**
	 * 订单编号
	 */
	@Group("detail")
	@NotNull(msg="方案编号")
	private String orderCode;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 账号
	 */
	private String accountName;
	/**
	 * 手机号码
	 */
	@Group("search")
	@Pattern(value= MatchPattern.PHONE,msg="手机号码")
	private String cusMobile;
	/**
	 * 用户id
	 */
	@Group("search")
	@Pattern(value= MatchPattern.NUM,msg="用户id")
	private String userId;

	/**
	 * 活动名称
	 */
	private String activityName;
	
	/**
	 * 活动编号
	 */
	private String activitySource;

	/**
	 * 大乐透追加
	 */
	private Integer dltAdd;

	/**
	 * 追号方式
	 */
	private Integer codeWay;
	/**
	 * 类容类型
	 */
	private Integer contentType;
	/**
	 * 购买类型
	 */
	private Integer buyType;
	/**
	 * 支付状态
	 */
	private Integer payStatus;
	/**
	 * 方案状态
	 */
	private Integer orderStatus;
	/**
	 * 中奖状态
	 */
	private Integer winningStatus;
	/**
	 * 中奖等级
	 */
	private String winningDetail;
	
	/**
	 * 统计类型
	 */
	private String statistics;
	/**
	 * 统计判断是否关联用户表
	 */
	private String joinUser;
	/**
	 * 否允许检票:0：不允许，1：允许
	 */
	private Short checkTicket;
	/**
	 * 查询时间类型
	 */
	private String timeType;
	private Date startTime;
	private Date endTime;
	/**
	 * 订单编号
	 */
    private List<String> orderCodes;
    /**
     * 金额最小值
     */
    private Double minBonus;
    /**
	 * 金额最大值
	 */
    private Double maxBonus;
   /**
    * 中奖状态
    */
    private List<Short> winningStatusList;
    /**
     * 追号计划订单
     */
    private String  orderAddCode;
    
    private List<String> issues;

	/**
	 * 注册渠道
	 */
	private String registerChannelId;
    
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStatistics() {
		return statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	public List<String> getOrderCodes() {
		return orderCodes;
	}

	public void setOrderCodes(List<String> orderCodes) {
		this.orderCodes = orderCodes;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}

	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}

	public String getBuyScreen() {
		return buyScreen;
	}

	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTimeType() {
		return timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	public String getActivitySource() {
		return activitySource;
	}

	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}	

	public Integer getDltAdd() {
		return dltAdd;
	}

	public void setDltAdd(Integer dltAdd) {
		this.dltAdd = dltAdd;
	}

	public Integer getCodeWay() {
		return codeWay;
	}

	public void setCodeWay(Integer codeWay) {
		this.codeWay = codeWay;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

	public String getJoinUser() {
		return joinUser;
	}

	public void setJoinUser(String joinUser) {
		this.joinUser = joinUser;
	}

	public Double getMinBonus() {
		return minBonus;
	}

	public void setMinBonus(Double minBonus) {
		this.minBonus = minBonus;
	}

	public Double getMaxBonus() {
		return maxBonus;
	}

	public void setMaxBonus(Double maxBonus) {
		this.maxBonus = maxBonus;
	}

	public Short getCheckTicket() {
		return checkTicket;
	}

	public void setCheckTicket(Short checkTicket) {
		this.checkTicket = checkTicket;
	}

	/**
	 * @return the winningStatusList
	 */
	public List<Short> getWinningStatusList() {
		return winningStatusList;
	}

	/**
	 * @param winningStatusList the winningStatusList to set
	 */
	public void setWinningStatusList(List<Short> winningStatusList) {
		this.winningStatusList = winningStatusList;
	}

	/**
	 * @return the orderAddCode
	 */
	public String getOrderAddCode() {
		return orderAddCode;
	}

	/**
	 * @param orderAddCode the orderAddCode to set
	 */
	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	/**
	 * @return the issues
	 */
	public List<String> getIssues() {
		return issues;
	}

	/**
	 * @param issues the issues to set
	 */
	public void setIssues(List<String> issues) {
		this.issues = issues;
	}

	public String getRegisterChannelId() {
		return registerChannelId;
	}

	public void setRegisterChannelId(String registerChannelId) {
		this.registerChannelId = registerChannelId;
	}
}
