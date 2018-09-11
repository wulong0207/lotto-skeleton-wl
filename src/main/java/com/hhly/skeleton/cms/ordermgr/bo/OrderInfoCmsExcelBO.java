package com.hhly.skeleton.cms.ordermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-12 上午11:35:16
 * @Desc 订单返回BO
 */
@SuppressWarnings("serial")
public class OrderInfoCmsExcelBO extends BaseBO {
	@ExcelHeader("序号")
	private String id;
	@ExcelHeader("订单编号")
	private String orderCode;
	@ExcelHeader("彩期")
	private String lotteryIssue;
	@ExcelHeader("购买类型")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_BUY_TYPE)
	private String buyType;
	@ExcelHeader("投注类型")
	@ReplaceAttribute(DicDataEnum.ORDER_CATHECTIC_TYPE)
	private String categoryId;
	@ExcelHeader("彩种名称")
	private String lotteryName;

	@ExcelHeader("订单状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_STATUS)
	private String orderStatus;

	@ExcelHeader("支付状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_PAY_STATUS)
	private String payStatus;
	@ExcelHeader("订单金额")
	private String orderAmount;
	@ExcelHeader("中奖状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_WIN_STATUS)
	private String winningStatus;
	@ExcelHeader("税后金额")
	private String aftBonus;
	@ExcelHeader("税前金额")
	private String preBonus;
	@ExcelHeader("加奖金额")
	private String addedBonus;
	@ExcelHeader("昵称")
	private String nickName;
	@ExcelHeader("渠道")
	private String channelName;
	@ExcelHeader("平台")
	private Integer platform;
	@ExcelHeader("中奖等级")
	private String winningDetail;

	@ExcelHeader("购买时间")
	private String buyTime;
	@ExcelHeader("出票截止时间")
	private String endTicketTime;
	@ExcelHeader("创建时间")
	private String createTime;
	@ExcelHeader("修改时间")
	private String updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getAddedBonus() {
		return addedBonus;
	}

	public void setAddedBonus(String addedBonus) {
		this.addedBonus = addedBonus;
	}

	public String getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(String winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(String aftBonus) {
		this.aftBonus = aftBonus;
	}

	public String getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(String preBonus) {
		this.preBonus = preBonus;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

	public String getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(String endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
