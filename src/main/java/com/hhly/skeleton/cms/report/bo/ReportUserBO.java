package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    用户数据报表BO
 * @author  Tony Wang
 * @date    2017年9月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportUserBO extends BaseBO {
	//注册渠道
    private String channelId;
    //日期
    @JsonFormat(pattern = "M/d", timezone = "GMT+8")
    private Date addDate;
    //渠道名称
    private String channelName;
    //投注平台
    private Integer platform;

	/**
	 * 注册人数
	 */
    private Integer regUser;

	/**
	 * 实名认证人数
	 */
    private Integer checkUser;

	/**
	 * 投注人数
	 */
    private Integer orderUser;

	/**
	 * 投注次数
	 */
    private Integer orderTimes;

	/**
	 * 投注额
	 */
    private Double orderMoney;

	/**
	 * 新用户投注人数
	 */
    private Integer newOrderUser;

	/**
	 * 新用户投注次数
	 */
    private Integer newOrderTimes;

	/**
	 * 新用户投注金额
	 */
    private Double newOrderMoney;

	/**
	 * 老用户投注人数
	 */
    private Integer oldOrderUser;
	/**
	 * 老用户投注次数
	 */
    private Integer oldOrderTimes;
	/**
	 * 老用户投注金额
	 */
    private Double oldOrderMoney;
	/**
	 * 充值用户
	 */
    private Integer fillUser;
	/**
	 * 充值次数
	 */
    private Integer fillTimes;
	/**
	 * 充值金额
	 */
    private Double fillMoney;

	/**
	 * 首充人数
	 */
    private Integer newFillUser;
	/**
	 * 首充次数
	 */
    private Integer newFillTimes;
	/**
	 * 首充金额
	 */
    private Double newFillMoney;
	/**
	 * 非首充人数
	 */
    private Integer oldFillUser;
	/**
	 * 非首充次数
	 */
    private Integer oldFillTimes;
	/**
	 * 非首充金额
	 */
    private Double oldFillMoney;
    
	/**
	 * 首充转化率或有效用户转化,首充用户/注册用户 * 100%
	 */
	private Double newFillRatio;
	
	/**
	 * 活跃度=投注次数 / 活跃会员数
	 */
	private Double liveness;
	
	/**
	 * 活跃度=投注次数 / 活跃会员数
	 */
	private Double newLiveness;
	
	/**
	 * 人均投注额,投注额 / 活跃
	 */
	private Double avgOrderMoney;
	
	/**
	 * 完善转化：完善用户/注册用户 * 100%
	 */
	private Double checkRatio;
	
	/**
	 * arpu值：投注金额/投注人数（人均投注额）
	 */
	private Double arpu;
	
	private Double newArpu;
	
	/**
	 * 新用户人均投注
	 */
	private Double newAvgOrderMoney;
	
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
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

	public Integer getOldOrderUser() {
		return oldOrderUser;
	}

	public void setOldOrderUser(Integer oldOrderUser) {
		this.oldOrderUser = oldOrderUser;
	}

	public Integer getOldOrderTimes() {
		return oldOrderTimes;
	}

	public void setOldOrderTimes(Integer oldOrderTimes) {
		this.oldOrderTimes = oldOrderTimes;
	}

	public Double getOldOrderMoney() {
		return oldOrderMoney;
	}

	public void setOldOrderMoney(Double oldOrderMoney) {
		this.oldOrderMoney = oldOrderMoney;
	}

	public Integer getFillUser() {
		return fillUser;
	}

	public void setFillUser(Integer fillUser) {
		this.fillUser = fillUser;
	}

	public Integer getFillTimes() {
		return fillTimes;
	}

	public void setFillTimes(Integer fillTimes) {
		this.fillTimes = fillTimes;
	}

	public Double getFillMoney() {
		return fillMoney;
	}

	public void setFillMoney(Double fillMoney) {
		this.fillMoney = fillMoney;
	}

	public Integer getNewFillUser() {
		return newFillUser;
	}

	public void setNewFillUser(Integer newFillUser) {
		this.newFillUser = newFillUser;
	}

	public Integer getNewFillTimes() {
		return newFillTimes;
	}

	public void setNewFillTimes(Integer newFillTimes) {
		this.newFillTimes = newFillTimes;
	}

	public Double getNewFillMoney() {
		return newFillMoney;
	}

	public void setNewFillMoney(Double newFillMoney) {
		this.newFillMoney = newFillMoney;
	}

	public Integer getOldFillUser() {
		return oldFillUser;
	}

	public void setOldFillUser(Integer oldFillUser) {
		this.oldFillUser = oldFillUser;
	}

	public Integer getOldFillTimes() {
		return oldFillTimes;
	}

	public void setOldFillTimes(Integer oldFillTimes) {
		this.oldFillTimes = oldFillTimes;
	}

	public Double getOldFillMoney() {
		return oldFillMoney;
	}

	public void setOldFillMoney(Double oldFillMoney) {
		this.oldFillMoney = oldFillMoney;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Double getLiveness() {
		return liveness;
	}

	public void setLiveness(Double liveness) {
		this.liveness = liveness;
	}

	public Double getAvgOrderMoney() {
		return avgOrderMoney;
	}

	public void setAvgOrderMoney(Double avgOrderMoney) {
		this.avgOrderMoney = avgOrderMoney;
	}

	public Double getNewFillRatio() {
		return newFillRatio;
	}

	public void setNewFillRatio(Double newFillRatio) {
		this.newFillRatio = newFillRatio;
	}

	public Double getCheckRatio() {
		return checkRatio;
	}

	public void setCheckRatio(Double checkRatio) {
		this.checkRatio = checkRatio;
	}

	public Double getArpu() {
		return arpu;
	}

	public void setArpu(Double arpu) {
		this.arpu = arpu;
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

	public Double getNewAvgOrderMoney() {
		return newAvgOrderMoney;
	}

	public void setNewAvgOrderMoney(Double newAvgOrderMoney) {
		this.newAvgOrderMoney = newAvgOrderMoney;
	}
}
