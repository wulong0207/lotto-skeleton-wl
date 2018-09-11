package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 订单重置开奖
 * @author xiongJinGang
 * @date 2017年9月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OrderResetExceptionBO extends BaseBO {
	private Integer id;//
	private String orderCode;// 订单编号
	private Double aftBonus;// 税后奖金
	private Double totalCashBalance;// 当前账户余额总现金金额
	private Double differenceBalance;// 相差金额（订单税后奖金-总现金金额）。账户总金额存在多少钱不够扣
	private Integer userId;// 用户ID
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间

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

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public Double getDifferenceBalance() {
		return differenceBalance;
	}

	public void setDifferenceBalance(Double differenceBalance) {
		this.differenceBalance = differenceBalance;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
