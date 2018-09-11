package com.hhly.skeleton.user.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 账户钱包数据返回类
 * @desc
 * @author zhouyang
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserWalletBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@JsonProperty("w_id")
	private Integer id;

	/**
	 * 用户id
	 */
	@JsonProperty("u_id")
	private Integer userId;

	/**
	 * 现金总余额【中奖金额+80%+20%】
	 */
	@JsonProperty("tot_c_b")
	private Double totalCashBalance;

	/**
	 * 中奖余额
	 */
	@JsonProperty("win_b")
	private Double winningBalance;

	/**
	 * 充值80%余额
	 */
	@JsonProperty("t80_b")
	private Double top80Balance;

	/**
	 * 充值20%余额
	 */
	@JsonProperty("t20_b")
	private Double top20Balance;

	/**
	 * 可用红包余额
	 */
	@JsonProperty("eff_r_b")
	private Double effRedBalance;

	/**
	 * 待发红包余额
	 */
	@JsonProperty("rea_r_b")
	private Double readyRedBalance;

	/**
	 * 中奖余额 0：禁用；1：启用
	 */
	@JsonProperty("sts")
	private Short status;

	/**
	 * 创建时间
	 */
	@JsonProperty("crt_tm")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@JsonProperty("upd_tm")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 账户总金额，总现金金额+中奖余额
	 */
	@JsonIgnore
	@JsonProperty("t_a")
	private Double totalAmount;
	/**
	 * 版本号
	 */
	@JsonIgnore
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

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "UserWalletBO [userId=" + userId + ", totalCashBalance=" + totalCashBalance + ", winningBalance=" + winningBalance + ", top80Balance=" + top80Balance + ", top20Balance=" + top20Balance + ", effRedBalance="
				+ effRedBalance + ", readyRedBalance=" + readyRedBalance + ", createTime=" + createTime + ", updateTime=" + updateTime + ", totalAmount=" + totalAmount + ", version=" + version + "]";
	}

}
