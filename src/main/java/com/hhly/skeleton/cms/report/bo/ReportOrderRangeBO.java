package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ReportOrderRangeBO extends BaseBO {
	private Long id;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date dt;
	//注册渠道
	private String channelId;
	//彩种编码
	private Integer lotteryCode;
	//彩种类型
	private Integer lotteryType;
	//投注平台
	private Integer platform;
	//投注用户
	private Integer orderUser;
	//投注金额
	private Double orderMoney;

	private Double o_1_100;
	private Integer u_1_100;
	private Double o_101_500;
	private Integer u_101_500;
	private Double o_501_1000;
	private Integer u_501_1000;
	private Double o_1001_5000;
	private Integer u_1001_5000;
	private Double o_5001_10000;
	private Integer u_5001_10000;
	private Double o_10001_50000;
	private Integer u_10001_50000;
	private Double o_50001_100000;
	private Integer u_50001_100000;
	private Double o_100000;
	private Integer u_100000;
	
	private Double o_1_100_new;
	private Integer u_1_100_new;
	private Double o_101_500_new;
	private Integer u_101_500_new;
	private Double o_501_1000_new;
	private Integer u_501_1000_new;
	private Double o_1001_5000_new;
	private Integer u_1001_5000_new;
	private Double o_5001_10000_new;
	private Integer u_5001_10000_new;
	private Double o_10001_50000_new;
	private Integer u_10001_50000_new;
	private Double o_50001_100000_new;
	private Integer u_50001_100000_new;
	private Double o_100000_new;
	private Integer u_100000_new;
	//总用户
	private Integer totalUser;
	//总金额
	private Double totalMoney;
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
	public Double getO_1_100() {
		return o_1_100;
	}
	public void setO_1_100(Double o_1_100) {
		this.o_1_100 = o_1_100;
	}
	public Integer getU_1_100() {
		return u_1_100;
	}
	public void setU_1_100(Integer u_1_100) {
		this.u_1_100 = u_1_100;
	}
	public Double getO_101_500() {
		return o_101_500;
	}
	public void setO_101_500(Double o_101_500) {
		this.o_101_500 = o_101_500;
	}
	public Integer getU_101_500() {
		return u_101_500;
	}
	public void setU_101_500(Integer u_101_500) {
		this.u_101_500 = u_101_500;
	}
	public Double getO_501_1000() {
		return o_501_1000;
	}
	public void setO_501_1000(Double o_501_1000) {
		this.o_501_1000 = o_501_1000;
	}
	public Integer getU_501_1000() {
		return u_501_1000;
	}
	public void setU_501_1000(Integer u_501_1000) {
		this.u_501_1000 = u_501_1000;
	}
	public Double getO_1001_5000() {
		return o_1001_5000;
	}
	public void setO_1001_5000(Double o_1001_5000) {
		this.o_1001_5000 = o_1001_5000;
	}
	public Integer getU_1001_5000() {
		return u_1001_5000;
	}
	public void setU_1001_5000(Integer u_1001_5000) {
		this.u_1001_5000 = u_1001_5000;
	}
	public Double getO_5001_10000() {
		return o_5001_10000;
	}
	public void setO_5001_10000(Double o_5001_10000) {
		this.o_5001_10000 = o_5001_10000;
	}
	public Integer getU_5001_10000() {
		return u_5001_10000;
	}
	public void setU_5001_10000(Integer u_5001_10000) {
		this.u_5001_10000 = u_5001_10000;
	}
	public Double getO_10001_50000() {
		return o_10001_50000;
	}
	public void setO_10001_50000(Double o_10001_50000) {
		this.o_10001_50000 = o_10001_50000;
	}
	public Integer getU_10001_50000() {
		return u_10001_50000;
	}
	public void setU_10001_50000(Integer u_10001_50000) {
		this.u_10001_50000 = u_10001_50000;
	}
	public Double getO_50001_100000() {
		return o_50001_100000;
	}
	public void setO_50001_100000(Double o_50001_100000) {
		this.o_50001_100000 = o_50001_100000;
	}
	public Integer getU_50001_100000() {
		return u_50001_100000;
	}
	public void setU_50001_100000(Integer u_50001_100000) {
		this.u_50001_100000 = u_50001_100000;
	}
	public Double getO_100000() {
		return o_100000;
	}
	public void setO_100000(Double o_100000) {
		this.o_100000 = o_100000;
	}
	public Integer getU_100000() {
		return u_100000;
	}
	public void setU_100000(Integer u_100000) {
		this.u_100000 = u_100000;
	}
	public Integer getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(Integer totalUser) {
		this.totalUser = totalUser;
	}
	public Double getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}
	public Double getO_1_100_new() {
		return o_1_100_new;
	}
	public void setO_1_100_new(Double o_1_100_new) {
		this.o_1_100_new = o_1_100_new;
	}
	public Integer getU_1_100_new() {
		return u_1_100_new;
	}
	public void setU_1_100_new(Integer u_1_100_new) {
		this.u_1_100_new = u_1_100_new;
	}
	public Double getO_101_500_new() {
		return o_101_500_new;
	}
	public void setO_101_500_new(Double o_101_500_new) {
		this.o_101_500_new = o_101_500_new;
	}
	public Integer getU_101_500_new() {
		return u_101_500_new;
	}
	public void setU_101_500_new(Integer u_101_500_new) {
		this.u_101_500_new = u_101_500_new;
	}
	public Double getO_501_1000_new() {
		return o_501_1000_new;
	}
	public void setO_501_1000_new(Double o_501_1000_new) {
		this.o_501_1000_new = o_501_1000_new;
	}
	public Integer getU_501_1000_new() {
		return u_501_1000_new;
	}
	public void setU_501_1000_new(Integer u_501_1000_new) {
		this.u_501_1000_new = u_501_1000_new;
	}
	public Double getO_1001_5000_new() {
		return o_1001_5000_new;
	}
	public void setO_1001_5000_new(Double o_1001_5000_new) {
		this.o_1001_5000_new = o_1001_5000_new;
	}
	public Integer getU_1001_5000_new() {
		return u_1001_5000_new;
	}
	public void setU_1001_5000_new(Integer u_1001_5000_new) {
		this.u_1001_5000_new = u_1001_5000_new;
	}
	public Double getO_5001_10000_new() {
		return o_5001_10000_new;
	}
	public void setO_5001_10000_new(Double o_5001_10000_new) {
		this.o_5001_10000_new = o_5001_10000_new;
	}
	public Integer getU_5001_10000_new() {
		return u_5001_10000_new;
	}
	public void setU_5001_10000_new(Integer u_5001_10000_new) {
		this.u_5001_10000_new = u_5001_10000_new;
	}
	public Double getO_10001_50000_new() {
		return o_10001_50000_new;
	}
	public void setO_10001_50000_new(Double o_10001_50000_new) {
		this.o_10001_50000_new = o_10001_50000_new;
	}
	public Integer getU_10001_50000_new() {
		return u_10001_50000_new;
	}
	public void setU_10001_50000_new(Integer u_10001_50000_new) {
		this.u_10001_50000_new = u_10001_50000_new;
	}
	public Double getO_50001_100000_new() {
		return o_50001_100000_new;
	}
	public void setO_50001_100000_new(Double o_50001_100000_new) {
		this.o_50001_100000_new = o_50001_100000_new;
	}
	public Integer getU_50001_100000_new() {
		return u_50001_100000_new;
	}
	public void setU_50001_100000_new(Integer u_50001_100000_new) {
		this.u_50001_100000_new = u_50001_100000_new;
	}
	public Double getO_100000_new() {
		return o_100000_new;
	}
	public void setO_100000_new(Double o_100000_new) {
		this.o_100000_new = o_100000_new;
	}
	public Integer getU_100000_new() {
		return u_100000_new;
	}
	public void setU_100000_new(Integer u_100000_new) {
		this.u_100000_new = u_100000_new;
	}
}