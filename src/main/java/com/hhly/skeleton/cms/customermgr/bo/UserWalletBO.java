package com.hhly.skeleton.cms.customermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 会员钱包信息
 * @author huangb
 * @date 2017年2月7日
 * @company 益彩网络
 * @version v1.0
 */
public class UserWalletBO extends BaseBO {

	private static final long serialVersionUID = 1086094040419477888L;
	/**
	 * 自增编号
	 */
	private Long id;
	/**
	 * 用户信息表id关联
	 */
	private Integer userId;
	/**
	 * 关联的用户对象
	 */
	private LottoCustomerBO user;
	/**
	 * 现金总余额
	 */
	private Double totalCashBalance;
	/**
	 * 中奖余额
	 */
	private Double winningBalance;
	/**
	 * 充值80%余额
	 */
	private Double top80Balance;
	/**
	 * 充值20%余额
	 */
	private Double top20Balance;
	/**
	 * 可用红包余额
	 */
	private Double effRedBalance;
	/**
	 * 待发红包余额
	 */
	private Double readyRedBalance;
	/**
	 * 0：禁用中奖余额；1：启用
	 */
	private Short status;
	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LottoCustomerBO getUser() {
		return user;
	}

	public void setUser(LottoCustomerBO user) {
		this.user = user;
	}

	public Double getTotalCashBalance() {
		return totalCashBalance;
	}

	public void setTotalCashBalance(Double totalCashBalance) {
		this.totalCashBalance = totalCashBalance;
	}

	public Double getWinningBalance() {
		return winningBalance;
	}

	public void setWinningBalance(Double winningBalance) {
		this.winningBalance = winningBalance;
	}

	public Double getTop80Balance() {
		return top80Balance;
	}

	public void setTop80Balance(Double top80Balance) {
		this.top80Balance = top80Balance;
	}

	public Double getTop20Balance() {
		return top20Balance;
	}

	public void setTop20Balance(Double top20Balance) {
		this.top20Balance = top20Balance;
	}

	public Double getEffRedBalance() {
		return effRedBalance;
	}

	public void setEffRedBalance(Double effRedBalance) {
		this.effRedBalance = effRedBalance;
	}

	public Double getReadyRedBalance() {
		return readyRedBalance;
	}

	public void setReadyRedBalance(Double readyRedBalance) {
		this.readyRedBalance = readyRedBalance;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
