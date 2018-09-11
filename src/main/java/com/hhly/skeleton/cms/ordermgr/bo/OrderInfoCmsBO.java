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
public class OrderInfoCmsBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4421632109857204438L;
	
	private String id;
    private String orderCode;
    private String lotteryIssue;
    private Integer buyType;
    private Integer lotteryCode;
    private Integer orderStatus;
    private Integer payStatus;
    private Double orderAmount;
    private Integer winningStatus;
    private Double aftBonus;
    private Double preBonus;
    private String nickName;
    private String winningDetail;
    
    private Double addedBonus;
    
    private Double websiteBonus;
    
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTicketTime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    
	/**
	 * 派奖管理页：派奖金额
	 */
	private Double sendBonus;
	/**
	 * 派奖管理页：开奖时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;
	/**
     * 是否大乐透加号0：否；1：是
     */
    private Short isDltAdd;
    /**
	 * 否允许检票:0：不允许，1：允许
	 */
	private Short checkTicket;
	
	private int count;
	//该订单本期销售截止时间
	private Date saleEndTime;
	
	/**
	 * 市场渠道
	 */
	private String channelName;
	/**
	 * 投注平台;1：Web,2:Wap;3:Android;4:IOS
	 */
	private Integer platform;
	/**
	 * 投注类型
	 */
	private Integer categoryId;
	
	public Date getSaleEndTime() {
		return saleEndTime;
	}
	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}
	public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Double getAddedBonus() {
		return addedBonus;
	}
	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
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
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public Double getSendBonus() {
		return sendBonus;
	}
	public void setSendBonus(Double sendBonus) {
		this.sendBonus = sendBonus;
	}
	public Date getLotteryTime() {
		return lotteryTime;
	}
	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}
	public Short getIsDltAdd() {
		return isDltAdd;
	}
	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}
	public Short getCheckTicket() {
		return checkTicket;
	}
	public void setCheckTicket(Short checkTicket) {
		this.checkTicket = checkTicket;
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
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Double getWebsiteBonus() {
		return websiteBonus;
	}
	public void setWebsiteBonus(Double websiteBonus) {
		this.websiteBonus = websiteBonus;
	}
	
	
}
