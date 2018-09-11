package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * @desc    用户数据报表BO
 * @author  Tony Wang
 * @date    2017年9月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ReportUserDistributionExcelBO extends BaseBO {
	
	@ExcelHeader("日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date addDate;
    
	/**
	 * 投注人数
	 */
	@ExcelHeader("投注人数")
    private Integer orderUser;

	/**
	 * 投注次数
	 */
	@ExcelHeader("投注次数")
    private Integer orderTimes;

	/**
	 * 投注额
	 */
	@ExcelHeader("投注金额")
    private Double orderMoney;
	
	/**
	 * 活跃度=投注次数 / 活跃会员数
	 */
    @ExcelHeader("活跃度")
	private Double liveness;
	
	@ExcelHeader("arpu值")
	private Double arpu;
	
	/**
	 * 投注人数
	 */
	@ExcelHeader("投注人数(新)")
    private Integer newOrderUser;

	/**
	 * 投注次数
	 */
	@ExcelHeader("投注次数(新)")
    private Integer newOrderTimes;

	/**
	 * 投注额
	 */
	@ExcelHeader("投注金额(新)")
    private Double newOrderMoney;
	
	/**
	 * 活跃度=投注次数 / 活跃会员数
	 */
	@ExcelHeader("活跃度(新)")
	private Double newLiveness;
	
	@ExcelHeader("arpu值(新)")
	private Double newArpu;

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Integer getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(Integer orderUser) {
		this.orderUser = orderUser;
	}

	public Integer getOrderTimes() {
		return orderTimes;
	}

	public void setOrderTimes(Integer orderTimes) {
		this.orderTimes = orderTimes;
	}

	public Double getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Double orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Double getLiveness() {
		return liveness;
	}

	public void setLiveness(Double liveness) {
		this.liveness = liveness;
	}

	public Double getArpu() {
		return arpu;
	}

	public void setArpu(Double arpu) {
		this.arpu = arpu;
	}

	public Integer getNewOrderUser() {
		return newOrderUser;
	}

	public void setNewOrderUser(Integer newOrderUser) {
		this.newOrderUser = newOrderUser;
	}

	public Integer getNewOrderTimes() {
		return newOrderTimes;
	}

	public void setNewOrderTimes(Integer newOrderTimes) {
		this.newOrderTimes = newOrderTimes;
	}

	public Double getNewOrderMoney() {
		return newOrderMoney;
	}

	public void setNewOrderMoney(Double newOrderMoney) {
		this.newOrderMoney = newOrderMoney;
	}

	public Double getNewLiveness() {
		return newLiveness;
	}

	public void setNewLiveness(Double newLiveness) {
		this.newLiveness = newLiveness;
	}

	public Double getNewArpu() {
		return newArpu;
	}

	public void setNewArpu(Double newArpu) {
		this.newArpu = newArpu;
	}
}
