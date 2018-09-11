package com.hhly.skeleton.pay.vo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;
import com.hhly.skeleton.lotto.base.order.bo.OrderInfoBO;
import com.hhly.skeleton.pay.bo.PayOrderAddBO;

/**
 * @desc 订单信息和订单追加信息合并
 * @author xiongJinGang
 * @date 2017年4月26日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayOrderBaseInfoVO extends BaseBO {
	private static final long serialVersionUID = -474463471669872193L;
	/**
	 * 增长ID
	 */
	private Integer id;
	/**
	 * 订单编号（orderAdd不同）
	 */
	private String orderCode;
	/**
	 * 追号计划订单号
	 */
	private String orderAddCode;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期编号（orderAdd不同）
	 */
	private String lotteryIssue;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 订单金额（orderAdd不同）
	 */
	private Double orderAmount;
	/**
	 * 活动来源ID
	 */
	private String activityCode;
	/**
	 * 支付状态； 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	private Short payStatus;
	/**
	 * 订单状态： 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败 10：撤单中
	 */
	private Short orderStatus;
	/**
	 * 支付时使用的红包编号
	 */
	private String redCodeUsed;
	/**
	 *订单购买类型：0:全部； 1：代购；2：追号代购；3：合买；4：追号计划
	 */
	private Integer buyType;//

	/**
	 * 追号期数
	 */
	private Integer issueAmount;
	/**
	 * 已追期数
	 */
	private Integer hadIssue;
	/**
	 * 系统截止时间(竞技彩专用)（orderAdd不同 pay_end_time）add by 2017-06-08
	 */
	private Date endSysTime;
	/**
	 * 平台 投注平台:1：Web,2:Wap;3:Android;4:IOS
	 */
	private Short platform;

	private String channelId;// 渠道ID

	public PayOrderBaseInfoVO() {
		super();
	}

	public PayOrderBaseInfoVO(OrderBaseInfoBO orderBaseInfoBO) {
		super();
		this.id = orderBaseInfoBO.getId();
		this.orderCode = orderBaseInfoBO.getOrderCode();
		this.lotteryName = orderBaseInfoBO.getLotteryName();
		this.lotteryCode = orderBaseInfoBO.getLotteryCode();
		this.lotteryIssue = orderBaseInfoBO.getLotteryIssue();
		// this.userId = orderBaseInfoBO.get;
		this.orderAmount = orderBaseInfoBO.getOrderAmount();
		this.activityCode = orderBaseInfoBO.getActivityCode();
		this.payStatus = Short.parseShort(String.valueOf(orderBaseInfoBO.getPayStatus()));
		// this.redCodeUsed = orderBaseInfoBO.getRedCode();
		this.buyType = orderBaseInfoBO.getBuyType();
		this.endSysTime = orderBaseInfoBO.getEndSaleTime();
	}

	public PayOrderBaseInfoVO(OrderInfoBO orderInfoBO) {
		super();
		this.id = Integer.parseInt(orderInfoBO.getId() + "");
		this.orderCode = orderInfoBO.getOrderCode();
		this.lotteryName = orderInfoBO.getLotteryName();
		this.lotteryCode = orderInfoBO.getLotteryCode();
		this.lotteryIssue = orderInfoBO.getLotteryIssue();
		this.userId = Integer.parseInt(orderInfoBO.getUserId() + "");
		this.orderAmount = orderInfoBO.getOrderAmount();
		this.activityCode = orderInfoBO.getActivitySource();// 活动编号
		this.payStatus = orderInfoBO.getPayStatus();
		this.redCodeUsed = orderInfoBO.getRedCodeUsed();
		this.buyType = Integer.parseInt(orderInfoBO.getBuyType() + "");
		this.endSysTime = orderInfoBO.getEndSysTime();
		this.platform = orderInfoBO.getPlatform();
		this.orderStatus = orderInfoBO.getOrderStatus();
		this.channelId = orderInfoBO.getChannelId();
		this.orderAddCode = orderInfoBO.getOrderAddCode();
	}

	public PayOrderBaseInfoVO(PayOrderAddBO payOrderAddBO, String lotteryName) {
		super();
		this.id = payOrderAddBO.getId();
		this.orderCode = payOrderAddBO.getOrderAddCode();
		this.lotteryName = lotteryName;
		this.lotteryCode = payOrderAddBO.getLotteryCode();
		this.lotteryIssue = payOrderAddBO.getIssueCode();
		this.userId = payOrderAddBO.getUserId();
		this.orderAmount = payOrderAddBO.getAddAmount();
		this.activityCode = payOrderAddBO.getActivityId();// 活动编号
		this.payStatus = payOrderAddBO.getPayStatus();
		this.redCodeUsed = payOrderAddBO.getRedCodeUsed();
		this.buyType = PayConstants.BuyTypeEnum.TRACKING_PLAN.getKey();
		this.endSysTime = payOrderAddBO.getPayEndTime();
		this.platform = payOrderAddBO.getPlatform();
		this.orderStatus = payOrderAddBO.getAddStatus();
		this.channelId = payOrderAddBO.getChannelId();// 渠道ID
		this.orderAddCode = payOrderAddBO.getOrderAddCode();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
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

	public String getRedCodeUsed() {
		return redCodeUsed;
	}

	public void setRedCodeUsed(String redCodeUsed) {
		this.redCodeUsed = redCodeUsed;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
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

	public Date getEndSysTime() {
		return endSysTime;
	}

	public void setEndSysTime(Date endSysTime) {
		this.endSysTime = endSysTime;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

}
