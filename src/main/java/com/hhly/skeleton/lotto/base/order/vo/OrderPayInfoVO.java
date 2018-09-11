package com.hhly.skeleton.lotto.base.order.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrderPayInfoVO implements Serializable {
	private static final long serialVersionUID = -118769960982313641L;

	/**
	 * 订单主键ID
	 */
	private Integer orderId;

	/**
	 * 订单编号
	 */
	private String orderCode;

	/**
	 * 小彩种编号，参考LotteryEnum 枚举
	 */
	private Integer lotteryChildCode;

	/**
	 * 小彩种名称
	 */
	private String lotteryChildName;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	/**
	 * 方案金额
	 */
	private Integer orderAmount;

	/**
	 * 期号
	 */
	private String lotteryIssue;

	/**
	 * 方案倍数
	 */
	private Integer multipleNum;

	/**
	 * 方案注数
	 */
	private Integer betNum;

	/**
	 * 投注内容 ，过关串，胆信息前端从此获取
	 */
	private String betContent;

	/**
	 * 开奖号码  开奖结果格式：3|1|3|1|3|1|3|1|3|1|3|1
	 赛果未开奖格式为”_” 表示，赛事取消格式为”*”表示
	 */
	private String drawCode;

	/**
	 * 方案  1：代购；2：追号；3：合买
	 */
	private Integer buyType;

	/**
	 *
	 * 官方截止时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date endTicketTime;

	/**
	 *
	 * 开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;

	/**
	 * 投注内容类型 1：单式；2：复式；3：胆拖；4：混合；5：上传
	 */
	private Integer contentType;

	/**
	 * 订单状态 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败；8：已撤单;9拆票失败
	 */
	private Integer orderStatus;

	/**
	 * 支付状态 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	private Integer payStatus;

	/**
	 * 开奖状态 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private Integer winningStatus;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 串关
	 */
	private String bunchStr;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Integer getBetNum() {
		return betNum;
	}

	public void setBetNum(Integer betNum) {
		this.betNum = betNum;
	}

	public String getBetContent() {
		return betContent;
	}

	public void setBetContent(String betContent) {
		this.betContent = betContent;
	}

	public Date getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLotteryChildName() {
		return lotteryChildName;
	}

	public void setLotteryChildName(String lotteryChildName) {
		this.lotteryChildName = lotteryChildName;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public String getBunchStr() {
		return bunchStr;
	}

	public void setBunchStr(String bunchStr) {
		this.bunchStr = bunchStr;
	}
}
