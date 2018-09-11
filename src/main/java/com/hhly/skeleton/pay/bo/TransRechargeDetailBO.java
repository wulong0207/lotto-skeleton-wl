package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 充值明细详情（批量、单个支付才使用）
 * @author xiongJinGang
 * @date 2017年8月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransRechargeDetailBO extends BaseBO {
	private static final long serialVersionUID = -6015564136837475181L;
	private Integer id;//
	private String rechargeCode;// 充值编号
	private String orderCode;// 订单编号
	private Integer buyType;// 购买类型
	private Double orderAmount;// 订单金额
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRechargeCode() {
		return rechargeCode;
	}

	public void setRechargeCode(String rechargeCode) {
		this.rechargeCode = rechargeCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
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

}
