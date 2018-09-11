package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

import com.hhly.skeleton.pay.bo.OperateCouponBO;

/**
 * @desc 彩金红包表更新信息
 * @author xiongJinGang
 * @date 2017年3月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateCouponUpdateVO implements Serializable {
	private static final long serialVersionUID = 92097714813014965L;
	/**
	 * 自增Id
	 */
	private Integer id;
	/**
	 * 自定义编号
	 */
	private String redCode;
	/**
	 * 红包余额 
	 */
	private Double redBalance;
	/**
	 * 所属用户。user_id 
	 */
	private Integer userId;
	/**
	 * 1：待激活；2：待派发；3：可使用；4：已过期；5：已作废；6：已使用 
	 */
	private String redStatus;

	public OperateCouponUpdateVO() {
		super();
	}

	public OperateCouponUpdateVO(OperateCouponBO operateCouponBO) {
		super();
		this.id = operateCouponBO.getId();
		this.redCode = operateCouponBO.getRedCode();
		this.redBalance = operateCouponBO.getRedBalance();
		this.redStatus = operateCouponBO.getRedStatus();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Double getRedBalance() {
		return redBalance;
	}

	public void setRedBalance(Double redBalance) {
		this.redBalance = redBalance;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(String redStatus) {
		this.redStatus = redStatus;
	}

}