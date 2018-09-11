package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * @desc 投注方式Excel表BO
 * @author Tony Wang
 * @date 2017年9月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportLotteryWayExcelBO extends BaseBO {

	@ExcelHeader("日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date dt;

	@ExcelHeader("投注人数(全)")
	private Integer orderUser;

	@ExcelHeader("投注金额(全)")
	private Double orderMoney;

	@ExcelHeader("投注人数(代)")
	private Integer buyUser;

	@ExcelHeader("占比(代)")
	private Double buyUserRatio;

	@ExcelHeader("投注金额(代)")
	private Double buyMoney;

	@ExcelHeader("占比(代)")
	private Double buyMoneyRatio;

	@ExcelHeader("投注人数(追)")
	private Integer addUser;

	@ExcelHeader("占比(追)")
	private Double addUserRatio;

	@ExcelHeader("投注金额(追)")
	private Double addMoney;

	@ExcelHeader("占比(追)")
	private Double addMoneyRatio;

	@ExcelHeader("投注人数(合)")
	private Integer groupUser;

	@ExcelHeader("占比(合)")
	private Double groupUserRatio;

	@ExcelHeader("投注金额(合)")
	private Double groupMoney;

	@ExcelHeader("占比(合)")
	private Double groupMoneyRatio;

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(Integer orderUser) {
		this.orderUser = orderUser;
	}

	public Double getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Integer getBuyUser() {
		return buyUser;
	}

	public void setBuyUser(Integer buyUser) {
		this.buyUser = buyUser;
	}

	public Double getBuyMoney() {
		return buyMoney;
	}

	public void setBuyMoney(Double buyMoney) {
		this.buyMoney = buyMoney;
	}

	public Integer getAddUser() {
		return addUser;
	}

	public void setAddUser(Integer addUser) {
		this.addUser = addUser;
	}

	public Double getAddMoney() {
		return addMoney;
	}

	public void setAddMoney(Double addMoney) {
		this.addMoney = addMoney;
	}

	public Integer getGroupUser() {
		return groupUser;
	}

	public void setGroupUser(Integer groupUser) {
		this.groupUser = groupUser;
	}

	public Double getGroupMoney() {
		return groupMoney;
	}

	public void setGroupMoney(Double groupMoney) {
		this.groupMoney = groupMoney;
	}

	public Double getBuyUserRatio() {
		return buyUserRatio;
	}

	public void setBuyUserRatio(Double buyUserRatio) {
		this.buyUserRatio = buyUserRatio;
	}

	public Double getBuyMoneyRatio() {
		return buyMoneyRatio;
	}

	public void setBuyMoneyRatio(Double buyMoneyRatio) {
		this.buyMoneyRatio = buyMoneyRatio;
	}

	public Double getAddUserRatio() {
		return addUserRatio;
	}

	public void setAddUserRatio(Double addUserRatio) {
		this.addUserRatio = addUserRatio;
	}

	public Double getAddMoneyRatio() {
		return addMoneyRatio;
	}

	public void setAddMoneyRatio(Double addMoneyRatio) {
		this.addMoneyRatio = addMoneyRatio;
	}

	public Double getGroupUserRatio() {
		return groupUserRatio;
	}

	public void setGroupUserRatio(Double groupUserRatio) {
		this.groupUserRatio = groupUserRatio;
	}

	public Double getGroupMoneyRatio() {
		return groupMoneyRatio;
	}

	public void setGroupMoneyRatio(Double groupMoneyRatio) {
		this.groupMoneyRatio = groupMoneyRatio;
	}
}
