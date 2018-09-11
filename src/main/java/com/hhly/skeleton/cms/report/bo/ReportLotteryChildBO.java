package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ReportLotteryChildBO extends BaseBO {
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date dt;
    //注册渠道
    private String channelId;
    //子玩法编码
    private Integer childCode;
    //投注平台
    private Integer platform;
    //投注用户
    private Integer orderUser;
    //投注金额
    private Double orderMoney;
    //中奖用户
    private Integer winningUser;
    //中奖金额
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

	public Integer getChildCode() {
		return childCode;
	}

	public void setChildCode(Integer childCode) {
		this.childCode = childCode;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
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

	public Integer getWinningUser() {
		return winningUser;
	}

	public void setWinningUser(Integer winningUser) {
		this.winningUser = winningUser;
	}

	public Double getWinningMoney() {
		return winningMoney;
	}

	public void setWinningMoney(Double winningMoney) {
		this.winningMoney = winningMoney;
	}
}