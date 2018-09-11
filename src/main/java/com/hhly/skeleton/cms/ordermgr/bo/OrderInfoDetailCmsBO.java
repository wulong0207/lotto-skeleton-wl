package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-12 上午11:35:16
 * @Desc 订单返回BO
 */
@SuppressWarnings("serial")
public class OrderInfoDetailCmsBO extends BaseBO {
	
	private String id;
    private String orderCode;
    private String lotteryIssue;
    private Integer buyType;
    private Integer lotteryCode;
    private Integer orderStatus;
    private Integer payStatus;
    private Integer orderAmount;
    private Integer winningStatus;
    private Double aftBonus;
    private Double preBonus;
    private String nickName;
    private String winningDetail;
    
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTicketTime;
    
    private String accountName;
    
    private String cusMobile;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endCheckTime;
    
    private String multipleNum;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date comeOutTime;
    
    private String splitNum;
    
    private String channelName;
 
	/**
	 * 投注平台;1：Web,2:Wap;3:Android;4:IOS
	 */
    private Integer platform;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lotteryTime;
    
    private String addedBonus;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendTime;
    
    private String redCodeUsed;
    
    private String redCodeGet;
    
    private String activityName;
    /**
     * 活动编号  20170905 add
     */
    private String activitySource;
    
    private String drawCode;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;
    
    private String modifyBy;
    
    private String remark;
    
    private  String isDltAdd;
    
    /**
	 * 否允许检票:0：不允许，1：允许
	 */
	private Short checkTicket;
	
	private String buyScreen;
	
	private String maxBuyScreen;
	
	private Integer lotteryChildCode;
    
    
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
	public Date getEndCheckTime() {
		return endCheckTime;
	}
	public void setEndCheckTime(Date endCheckTime) {
		this.endCheckTime = endCheckTime;
	}
	public String getMultipleNum() {
		return multipleNum;
	}
	public void setMultipleNum(String multipleNum) {
		this.multipleNum = multipleNum;
	}
	public Date getComeOutTime() {
		return comeOutTime;
	}
	public void setComeOutTime(Date comeOutTime) {
		this.comeOutTime = comeOutTime;
	}
	public String getSplitNum() {
		return splitNum;
	}
	public void setSplitNum(String splitNum) {
		this.splitNum = splitNum;
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
	public Date getLotteryTime() {
		return lotteryTime;
	}
	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}
	public String getAddedBonus() {
		return addedBonus;
	}
	public void setAddedBonus(String addedBonus) {
		this.addedBonus = addedBonus;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	
	public String getRedCodeUsed() {
		return redCodeUsed;
	}
	public void setRedCodeUsed(String redCodeUsed) {
		this.redCodeUsed = redCodeUsed;
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
	public String getDrawCode() {
		return drawCode;
	}
	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getWinningDetail() {
		return winningDetail;
	}
	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
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
	public Integer getBuyType() {
		return buyType;
	}
	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}
	
	public Integer getLotteryCode() {
        return lotteryCode;
    }
    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
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
	public Integer getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Integer getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}
	
	public Double getAftBonus() {
		return aftBonus;
	}
	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}
	public Double getPreBonus() {
		return preBonus;
	}
	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getEndTicketTime() {
		return endTicketTime;
	}
	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}
	public String getIsDltAdd() {
		return isDltAdd;
	}
	public void setIsDltAdd(String isDltAdd) {
		this.isDltAdd = isDltAdd;
	}
	public Short getCheckTicket() {
		return checkTicket;
	}
	public void setCheckTicket(Short checkTicket) {
		this.checkTicket = checkTicket;
	}
	public String getRedCodeGet() {
		return redCodeGet;
	}
	public void setRedCodeGet(String redCodeGet) {
		this.redCodeGet = redCodeGet;
	}
	public String getBuyScreen() {
		return buyScreen;
	}
	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}
	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}
	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}
	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}
	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
}
