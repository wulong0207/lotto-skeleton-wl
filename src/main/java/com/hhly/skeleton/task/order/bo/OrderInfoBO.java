package com.hhly.skeleton.task.order.bo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 订单信息
 * @author huangb
 * @date 2017年4月21日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderInfoBO extends BaseBO {
	private static final long serialVersionUID = -5317283495780967234L;
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 彩种代码
	 */
	private Integer lotteryCode;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	/**
	 * 彩期
	 */
	private String lotteryIssue;
	/**
	 * 官方截止检票时间；高频，数字彩，老足彩：取lottery_issue official_end_time；
	 * 其它竞技彩：取lottery_issue
	 * official_end_time与订单中最早开赛赛事的比赛时间进行比较，若大于，取比赛时间，若小于取official_end_time
	 */
	private Date endTicketTime;
	/**
	 * 最终检票时间；lottery_type的end_check_time 与 end_ticket_time 进行计算。
	 */
	private Date endCheckTime;
	/**
	 * 用户
	 */
	private Long userId;
	/**
	 * 订单总额
	 */
	private Double orderAmount;
	/**
	 * 此订单总倍数
	 */
	private Integer multipleNum;
	/**
	 * 中奖详情；数字彩：中奖等级，竞技彩：过关方式；高频彩：玩法名称
	 */
	private String winningDetail;
	/**
	 * 1：代购；2：追号；3：合买
	 */
	private Short buyType;
	/**
	 * 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	private Short payStatus;
	/**
	 * 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败
	 */
	private Short orderStatus;
	/**
	 * 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private Short winningStatus;
	/**
	 * 渠道
	 */
	private String channelId;
	/**
	 * 备注(目前用来存撤单原因)
	 */
	private String remark;
	/**
	 * 是否大乐透加号0：否；1：是
	 */
	private Short isDltAdd;
	/**
	 * 订单明细(方案内容)
	 */
	private List<OrderDetailBO> orderDetailList;
	/**
	 * 竞技彩购买的场次编号
	 */
	private String buyScreen;

	/***20170808 add***/
	/**
	 * 投注平台:1：Web,2:Wap;3:Android;4:IOS
	 */
	private Short platform;
	/**
	 * 总注数
	 */
	private Integer buyNumber;
	
	/***20170914 add***/
	/**
	 * 追号计划编号，用于追号订单与追号计划的关联
	 */
	private String orderAddCode;
	
	/***20180125 added***/
	/**
	 * 订单对应的活动编号
	 */
	private String activitySource;
	
	private String redeemCode;
	
	private String accountName;
	
	private String cusMobile;
	
	public OrderInfoBO() {
	}

	/**
	 * 构造
	 * 
	 * @param lotteryCode
	 *            彩种code
	 * @param lotteryName
	 *            彩种名称
	 * @param lotteryIssue
	 *            彩期
	 * @param userId
	 *            用户id
	 * @param orderAmount
	 *            订单总额
	 * @param multipleNum
	 *            订单总倍数
	 * @param channelId
	 *            渠道id
	 * @param isDltAdd
	 *            是否大乐透
	 * @param orderDetailList
	 *            订单明细
	 * @param endCheckTime
	 *            最终检票时间
	 * @param platform
	 *            平台
	 * @param buyNumber
	 *            总注数
	 * @param orderAddCode
	 *            追号计划编号
	 */
	public OrderInfoBO(Integer lotteryCode, String lotteryName, String lotteryIssue, Date endTicketTime, Long userId,
			Double orderAmount, Integer multipleNum, String channelId, Short isDltAdd,
			List<OrderDetailBO> orderDetailList, Date endCheckTime, Short platform, Integer buyNumber, String orderAddCode, String activityId) {
		this.lotteryCode = lotteryCode;
		this.lotteryName = lotteryName;
		this.lotteryIssue = lotteryIssue;
		this.endTicketTime = endTicketTime;
		this.userId = userId;
		this.orderAmount = orderAmount;
		this.multipleNum = multipleNum;
		this.channelId = channelId;
		this.isDltAdd = isDltAdd;
		this.orderDetailList = orderDetailList;
		this.endCheckTime = endCheckTime;
		this.platform = platform;
		this.buyNumber = buyNumber;
		this.orderAddCode = orderAddCode;
		this.activitySource = activityId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Date getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public Date getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Date endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

	public List<OrderDetailBO> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailBO> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public String getBuyScreen() {
		return buyScreen;
	}

	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Integer getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public String getActivitySource() {
		return activitySource;
	}

	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	/**
	 * @return the redeemCode
	 */
	public String getRedeemCode() {
		return redeemCode;
	}

	/**
	 * @param redeemCode the redeemCode to set
	 */
	public void setRedeemCode(String redeemCode) {
		this.redeemCode = redeemCode;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the cusMobile
	 */
	public String getCusMobile() {
		return cusMobile;
	}

	/**
	 * @param cusMobile the cusMobile to set
	 */
	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
	
}
