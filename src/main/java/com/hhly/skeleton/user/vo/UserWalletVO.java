package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 账户钱包参数传递类
 * @desc
 * @author zhouyang
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserWalletVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 现金总余额【中奖金额+80%+20%】
	 */
	private Double totalCashBalance;

	/**
	 * 中奖余额
	 */
	private Double winningBalance;

	/**
	 * 充值80%余额
	 */
	private String top80Balance;

	/**
	 * 充值20%余额
	 */
	private String top20Balance;

	/**
	 * 可用红包余额
	 */
	private String effRedBalance;

	/**
	 * 待发红包余额
	 */
	private String readyRedBalance;

	/**
	 * 红包状态 0：禁用，1：启用
	 */
	private Short status;

	/**
	 * 创建时间
	 */
	private String createTime;

	/**
	 * 修改时间
	 */
	private String updateTime;

	/**
	 * 版本号
	 */
	private Integer version;

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

	public String getTop80Balance() {
		return top80Balance;
	}

	public void setTop80Balance(String top80Balance) {
		this.top80Balance = top80Balance;
	}

	public String getTop20Balance() {
		return top20Balance;
	}

	public void setTop20Balance(String top20Balance) {
		this.top20Balance = top20Balance;
	}

	public String getEffRedBalance() {
		return effRedBalance;
	}

	public void setEffRedBalance(String effRedBalance) {
		this.effRedBalance = effRedBalance;
	}

	public String getReadyRedBalance() {
		return readyRedBalance;
	}

	public void setReadyRedBalance(String readyRedBalance) {
		this.readyRedBalance = readyRedBalance;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
