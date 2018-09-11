package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 合买订单信息
 * @author xiongJinGang
 * @date 2018年4月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderGroupBO extends BaseBO {
	private Integer id;//
	private Integer userId;// 合买发起人；关联用户表
	private String orderCode;// 合买订单编号
	private Short grpbuyStatus;// 合买状态;1：招募中；2：已满员；3：合买流产
	private Double minBuyRatio;// 最低认购比例
	private Double minBuyAmount;// 最低认购金额
	private Double guaranteeRatio;// 保底比例
	private Double guaranteeAmount;// 保底金额
	private Short visibleType;// 公开类型;1：完全公开；2：跟单后公开；3：开奖后公开；
	private Double commissionRatio;// 提成比例
	private Double commissionAmount;// 提成金额
	private Short applyWay;// 合买方式;1：所有人可认购；2：凭密码认购；
	private String applyCode;// 认购密码；当合买方式为凭密码认购时，提供的认购码
	private String title;// 合买方案标题
	private String description;// 合买方案宣言
	private Short isTop;// 是否置顶 0：不置顶；1：置顶；
	private Short isRecommend;// 是否加推荐 0：不推荐；1：推荐；
	private Double progress;// 合买进度
	private Double progressAmount;// 进度金额
	private Integer buyCount;// 合买总数
	private Date createTime;// 创建时间/发起时间
	private Date updateTime;// 修改时间
	private String remark;// 备注说明

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode == null ? null : orderCode.trim();
	}

	public Short getGrpbuyStatus() {
		return grpbuyStatus;
	}

	public void setGrpbuyStatus(Short grpbuyStatus) {
		this.grpbuyStatus = grpbuyStatus;
	}

	public Double getMinBuyRatio() {
		return minBuyRatio;
	}

	public void setMinBuyRatio(Double minBuyRatio) {
		this.minBuyRatio = minBuyRatio;
	}

	public Double getMinBuyAmount() {
		return minBuyAmount;
	}

	public void setMinBuyAmount(Double minBuyAmount) {
		this.minBuyAmount = minBuyAmount;
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

	public Short getVisibleType() {
		return visibleType;
	}

	public void setVisibleType(Short visibleType) {
		this.visibleType = visibleType;
	}

	public Double getCommissionRatio() {
		return commissionRatio;
	}

	public void setCommissionRatio(Double commissionRatio) {
		this.commissionRatio = commissionRatio;
	}

	public Double getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Short getApplyWay() {
		return applyWay;
	}

	public void setApplyWay(Short applyWay) {
		this.applyWay = applyWay;
	}

	public String getApplyCode() {
		return applyCode;
	}

	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode == null ? null : applyCode.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Short getIsTop() {
		return isTop;
	}

	public void setIsTop(Short isTop) {
		this.isTop = isTop;
	}

	public Short getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Short isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Double getProgress() {
		return progress;
	}

	public void setProgress(Double progress) {
		this.progress = progress;
	}

	public Double getProgressAmount() {
		return progressAmount;
	}

	public void setProgressAmount(Double progressAmount) {
		this.progressAmount = progressAmount;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
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
}