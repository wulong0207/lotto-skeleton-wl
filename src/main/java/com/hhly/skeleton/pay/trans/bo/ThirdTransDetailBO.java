package com.hhly.skeleton.pay.trans.bo;

import java.util.Date;

/**
 * @desc 第三方商户推荐赛事账户交易明细表
 * @author xiongJinGang
 * @date 2018年1月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ThirdTransDetailBO {
	private Integer id;//
	private String transCode;// 流水编号
	private String orderCode;// 推单编号
	private Integer masterId;// 公司账户id/第三个商户id/专家账户id
	private Integer guestId;// 公司账户id/第三个商户id/专家账户id
	private Double amount;// 交易金额
	private Double balance;// master账户余额
	private Short type;// 交易类型：1:INCOME：收入，2:EXPEND 支出
	private String remark;// 备注
	private Date createTime;// 默认系统时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getMasterId() {
		return masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
