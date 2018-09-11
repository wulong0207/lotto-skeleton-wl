package com.hhly.skeleton.cms.ordermgr.bo;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.SysUtil;

@SuppressWarnings("serial")
public class OrderGroupBO extends BaseBO {
	
	private Integer id;
	// 彩种
    private Integer lotteryCode;
	//彩期
	private String lotteryIssue;
	// 购买类型
	private Integer buyType;
	// 发起人用户名
	private String accountName;
	// 发起人昵称
	private String nickName;
	// 方案编号
	private String orderCode;
	//支付状态
	private Integer payStatus;
	//合买状态
	private Short grpbuyStatus;
	//方案状态
	private Integer orderStatus;
	//方案金额
	private Double orderAmount;
	//方案倍数
	private Integer multipleNum;
	
	//提成比例
	private Double commissionRatio;
	//合买进度
	private Double progress;
	private Double progressAmount;
	//参与人数
	private Integer buyCount;
	//平台保底
	private Double siteGuaranteeRatio;
	//平台保底
	private Double siteGuaranteeAmount;
	//保底
	private Double guaranteeRatio;
	//保底
	private Double guaranteeAmount;
	//中奖状态
	private Integer winningStatus;
	//税前奖金
	private Double preBonus;
	//税后奖金
	private Double aftBonus;
	//发起人佣金
	private Double commissionAmount;	
	//购买时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date buyTime;
	
	// 支付截止时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endSysTime;
	
	// 合买订单发起时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
	/**
	 * 渠道
	 */
	private String channelId;
	//平台
	private Short platform;
	
	//保密类型：1：完全公开；2：跟单后公开；3：开奖后公开
	private Short visibleType;
	
	//合买宣言
	private String title;
	
	//合买描述
	private String description;
	//修改时间
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	
	//修改人
	private String modifyBy;
	//备注
	private String remark;
	
	private String groupOrderCode;
	
	private Short isRecommend;
	
	private Short isTop;
	
	//发起人
	private Integer userId;
	//加奖标识(1返合买发起人，2返所有合买人)
	private Short bonusFlag;

	public Short getBonusFlag() {
		return bonusFlag;
	}
	public void setBonusFlag(Short bonusFlag) {
		this.bonusFlag = bonusFlag;
	}
	public Short getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}
	public Short getIsTop() {
		return isTop;
	}
	public void setIsTop(Short isTop) {
		this.isTop = isTop;
	}
	public String getGroupOrderCode() {
		return groupOrderCode;
	}
	public void setGroupOrderCode(String groupOrderCode) {
		this.groupOrderCode = groupOrderCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getBuyType() {
		return buyType;
	}
	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	public Short getGrpbuyStatus() {
		return grpbuyStatus;
	}
	public void setGrpbuyStatus(Short grpbuyStatus) {
		this.grpbuyStatus = grpbuyStatus;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Integer getMultipleNum() {
		return multipleNum;
	}
	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}
	public Double getCommissionRatio() {
		return commissionRatio;
	}
	public void setCommissionRatio(Double commissionRatio) {
		this.commissionRatio = commissionRatio;
	}
	public Double getProgress() {
		return progress;
	}
	public void setProgress(Double progress) {
		this.progress = progress;
	}
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
	
	public Double getSiteGuaranteeRatio() {
		return siteGuaranteeRatio;
	}
	public void setSiteGuaranteeRatio(Double siteGuaranteeRatio) {
		this.siteGuaranteeRatio = siteGuaranteeRatio;
	}
	public Double getSiteGuaranteeAmount() {
		return siteGuaranteeAmount;
	}
	public void setSiteGuaranteeAmount(Double siteGuaranteeAmount) {
		this.siteGuaranteeAmount = siteGuaranteeAmount;
	}
	
	public Double getGuaranteeRatio() {
		return guaranteeRatio;
	}
	public void setGuaranteeRatio(Double guaranteeRatio) {
		this.guaranteeRatio = guaranteeRatio;
	}
	public Double getGuaranteeAmount() {
		return guaranteeAmount;
	}
	public void setGuaranteeAmount(Double guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}
	public Integer getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
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
	public Double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public Date getEndSysTime() {
		return endSysTime;
	}
	public void setEndSysTime(Date endSysTime) {
		this.endSysTime = endSysTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public Short getPlatform() {
		return platform;
	}
	public void setPlatform(Short platform) {
		this.platform = platform;
	}
	public Short getVisibleType() {
		return visibleType;
	}
	public void setVisibleType(Short visibleType) {
		this.visibleType = visibleType;
	}
	public String getTitle() throws UnsupportedEncodingException{
		if(title == null)
			return "";
		return new String(Base64.decodeBase64(title.getBytes(SysUtil.getSystemEncoding())));
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() throws UnsupportedEncodingException  {
		if(description == null)
			return "";
		return new String(Base64.decodeBase64(description.getBytes(SysUtil.getSystemEncoding())));
	}
	public void setDescription(String description){
		this.description = description;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
	public Double getProgressAmount() {
		return progressAmount;
	}
	public void setProgressAmount(Double progressAmount) {
		this.progressAmount = progressAmount;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

	
	
	
	
}