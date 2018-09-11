package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ReportLotteryTypeBO extends BaseBO {
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date dt;
    //注册渠道
    private String channelId;

    private String channelName;
    //彩种编码
    private Integer lotteryCode;
    //1：数字彩；2：高频彩；3：竞彩;4:竞技彩
    private Integer lotteryType;
    //投注平台
    private Boolean platform;
    //投注用户
    private Integer orderUser;
    //投注金额
    private Double orderMoney;
    //新的投注用户
    private Integer newOrderUser;
    //新投注金额
    private Double newOrderMoney;
    //代购用户
    private Integer buyUser;
    //代购金额
    private Double buyMoney;
    //追加用户数
    private Integer addUser;
    //追加金额
    private Double addMoney;
    //合买用户
    private Integer groupUser;
    //合买金额
    private Double groupMoney;
    //彩种名称
    private String lotteryName;
    //代购用户占比
    private Double buyUserRatio;
    //代购金额占比
    private Double buyMoneyRatio;
    //追加用户占比
    private Double addUserRatio;
    //追加金额占比
    private Double addMoneyRatio;
    //合买用户占比
    private Double groupUserRatio;
    //合买金额占比
    private Double groupMoneyRatio;
    //奖金
    private Double winningMoney;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

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

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(Integer lotteryType) {
		this.lotteryType = lotteryType;
	}

	public Boolean getPlatform() {
		return platform;
	}

	public void setPlatform(Boolean platform) {
		this.platform = platform;
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

	public Integer getNewOrderUser() {
		return newOrderUser;
	}

	public void setNewOrderUser(Integer newOrderUser) {
		this.newOrderUser = newOrderUser;
	}

	public Double getNewOrderMoney() {
		return newOrderMoney;
	}

	public void setNewOrderMoney(Double newOrderMoney) {
		this.newOrderMoney = newOrderMoney;
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

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
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

	public Double getWinningMoney() {
		return winningMoney;
	}

	public void setWinningMoney(Double winningMoney) {
		this.winningMoney = winningMoney;
	}
}