package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 合买订单申购信息
 * @author xiongJinGang
 * @date 2018年4月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderGroupContentBO extends BaseBO {
	private Integer id;//
	private String orderCode;// 合买订单编号;关联合买订单表ordre_group
	private String buyCode;// 认购编号；主要作用于认购、退款时的交易标识
	private Integer userId;// 认购用户id;关联用户表
	private Double buyRatio;// 认购比例
	private Double buyAmount;// 认购金额
	private Date buyTime;// 认购时间
	private Double preBonus;// 税前奖金
	private Double aftBonus;// 税后奖金
	private Double commissionAmount;// 抽成佣金
	private Double sendBonus;// 派发奖金;税后-抽成佣金
	private Date createTime;// 创建时间
	private Date updateTime;// 修改时间
	private String remark;// 备注说明
	private Short refundStatus;// 退款状态；0-未退 1-已退；仅用于退款（流产退款和出票退款）时的状态标识，以确定是否退款成功
	private Short buyType;// 认购类型；1：普通认购 2：发起人保底认购 3：网站保底认购
	private Short buyFlag;// 购买标识；1：发起人认购 2：跟单人认购 主要标识发起人认购记录和跟单记录；第一条是发起人认购记录；其余都是跟单记录

	
	private Double addedBonus;// 官方嘉奖奖金
	private Double siteAddedBonus;// 本站加奖金额
	private String redCodeUsed;//支付时使用的红包编号 后续使用：支持认购人使用红包支付
	private String redCodeGet;//本站嘉奖返给的红包编号(系统自动发放的红包编号) 返奖红包，关联红包记录

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
		this.orderCode = orderCode == null ? null : orderCode.trim();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getBuyRatio() {
		return buyRatio;
	}

	public void setBuyRatio(Double buyRatio) {
		this.buyRatio = buyRatio;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
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

	public Double getSendBonus() {
		return sendBonus;
	}

	public void setSendBonus(Double sendBonus) {
		this.sendBonus = sendBonus;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public String getBuyCode() {
		return buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

	public Short getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(Short refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Short getBuyFlag() {
		return buyFlag;
	}

	public void setBuyFlag(Short buyFlag) {
		this.buyFlag = buyFlag;
	}

	public Double getAddedBonus() {
		return addedBonus;
	}

	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
	}

	public Double getSiteAddedBonus() {
		return siteAddedBonus;
	}

	public void setSiteAddedBonus(Double siteAddedBonus) {
		this.siteAddedBonus = siteAddedBonus;
	}

	public String getRedCodeUsed() {
		return redCodeUsed;
	}

	public void setRedCodeUsed(String redCodeUsed) {
		this.redCodeUsed = redCodeUsed;
	}

	public String getRedCodeGet() {
		return redCodeGet;
	}

	public void setRedCodeGet(String redCodeGet) {
		this.redCodeGet = redCodeGet;
	}

}