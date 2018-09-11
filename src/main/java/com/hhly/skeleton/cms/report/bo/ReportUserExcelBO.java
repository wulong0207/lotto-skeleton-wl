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
public class ReportUserExcelBO extends BaseBO {
	
    //private String channelId;

	@ExcelHeader("日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date addDate;
    
    //private String channelName;

    //private Integer platform;

	/**
	 * 注册人数
	 */
	@ExcelHeader("注册用户")
    private Integer regUser;

	/**
	 * 实名认证人数
	 */
	@ExcelHeader("完善用户")
    private Integer checkUser;

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

//	/**
//	 * 新用户投注额
//	 */
//    private Integer newOrderUser;
//
//    private Integer newOrderTimes;
//
//    private Double newOrderMoney;
//
//    private Integer oldOrderUser;
//
//    private Integer oldOrderTimes;
//
//    private Double oldOrderMoney;
//
//    private Integer fillUser;
//
//    private Integer fillTimes;
//
//    private Double fillMoney;

	/**
	 * 首充人数
	 */
	@ExcelHeader("首充用户")
    private Integer newFillUser;

//    private Integer newFillTimes;
//
//    private Double newFillMoney;
//
//    private Integer oldFillUser;
//
//    private Integer oldFillTimes;
//
//    private Double oldFillMoney;
    
	/**
	 * 首充转化率或有效用户转化,首充用户/注册用户 * 100%
	 */
    @ExcelHeader("首充转化")
	private String newFillRatio;
	
	/**
	 * 活跃度=投注次数 / 活跃会员数
	 */
    @ExcelHeader("活跃度")
	private Double liveness;
//	
//	/**
//	 * 人均投注额,投注额 / 活跃
//	 */
//	private Double avgOrderMoney;
	
	/**
	 * 完善转化：完善用户/注册用户 * 100%
	 */
	@ExcelHeader("完善转化")
	private String checkRatio;
	
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

	public Integer getRegUser() {
		return regUser;
	}

	public void setRegUser(Integer regUser) {
		this.regUser = regUser;
	}

	public Integer getCheckUser() {
		return checkUser;
	}

	public void setCheckUser(Integer checkUser) {
		this.checkUser = checkUser;
	}

	public Integer getNewFillUser() {
		return newFillUser;
	}

	public void setNewFillUser(Integer newFillUser) {
		this.newFillUser = newFillUser;
	}

	public String getNewFillRatio() {
		return newFillRatio;
	}

	public void setNewFillRatio(String newFillRatio) {
		this.newFillRatio = newFillRatio;
	}

	public String getCheckRatio() {
		return checkRatio;
	}

	public void setCheckRatio(String checkRatio) {
		this.checkRatio = checkRatio;
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
