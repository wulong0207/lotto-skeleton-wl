package com.hhly.skeleton.activity.bo;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
@SuppressWarnings("serial")
public class OrderInfoBO extends BaseBO{
	/**订单编号*/
	private String orderId; 
	/**用户id*/
	private String userId; 
	/**购买类型    1：代购；2：追号；3：合买*/
	private Short buyType; 
	/**投注平台:1：Web,2:Wap;3:Android;4:IOS*/
	private Short platform;
	/**订单创建时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date  createTime;
	/**订单创建时间*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date  buyTime;
	/**总倍数*/
	private Integer multipleNum;
	/**用户真实名称*/
	private String actualName;
	/**用户身份证号*/
	private String idNum;
	/**渠道号*/
	private String channelId;
	
	/**彩种编号*/
	private Integer lotteryCode;
	/**彩期号*/
	private Long issueCode;	
	/**最大场次编号*/
	private String maxBuyScreen;
	/**子玩法*/
	private Integer lotteryChildCode;
	/**彩种类型*/
	private Integer lotteryCategory;
	/*** 税后金额*/
	private Double aftBonus;
	/**开奖后生成的加奖奖金*/
	private Double addedBonus;
	/**订单总额*/
	private Double orderAmount;
	/**追号期数*/
	private Integer issueAmount;
	/**追号编号*/
	private String orderAddCode;
	/**是否大乐透追加*/
	private Short isDltAdd;
	/**活动编号*/
	private String activityId;
	/**
	 * 订单详情表
	 */
	private List<OrderDetailBO> orderDetailBO;
	
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
	public String getOrderAddCode() {
		return orderAddCode;
	}
	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Double getAddedBonus() {
		return addedBonus;
	}
	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
	}
	public Double getAftBonus() {
		return aftBonus;
	}
	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}
	public Integer getLotteryCategory() {
		return lotteryCategory;
	}
	public void setLotteryCategory(Integer lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}
	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}
	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Long getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(Long issueCode) {
		this.issueCode = issueCode;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public Integer getMultipleNum() {
		return multipleNum;
	}
	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}
	public List<OrderDetailBO> getOrderDetailBO() {
		return orderDetailBO;
	}
	public void setOrderDetailBO(List<OrderDetailBO> orderDetailBO) {
		this.orderDetailBO = orderDetailBO;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Short getBuyType() {
		return buyType;
	}
	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}
	public Short getPlatform() {
		return platform;
	}
	public void setPlatform(Short platform) {
		this.platform = platform;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	
}
