package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * 渠道基本信息与渠道登录信息
 *
 * @author lidecheng
 * @date 2018年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelAndLogBO extends CoOperateChannelBO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7379828462705133765L;
	/**
	 * 最后登录时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lastLoginTime;

	/**
	 * 最后登录IP
	 */
	private String lastLoginIp;
	/**
	 * 今日订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderToday;
	/**
	 * 一周订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderWeek;
	/**
	 * 一月订单
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double orderMonth;
	/**
	 * 彩种信息
	 */
	private List<CoOperateChannelLotteryBO> lotteryList;
	private Short merchantType;
	
	public Short getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(Short merchantType) {
		this.merchantType = merchantType;
	}
	public Double getOrderToday() {
		return orderToday;
	}
	public void setOrderToday(Double orderToday) {
		this.orderToday = orderToday;
	}
	public Double getOrderWeek() {
		return orderWeek;
	}
	public void setOrderWeek(Double orderWeek) {
		this.orderWeek = orderWeek;
	}
	public Double getOrderMonth() {
		return orderMonth;
	}
	public void setOrderMonth(Double orderMonth) {
		this.orderMonth = orderMonth;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public List<CoOperateChannelLotteryBO> getLotteryList() {
		return lotteryList;
	}
	public void setLotteryList(List<CoOperateChannelLotteryBO> lotteryList) {
		this.lotteryList = lotteryList;
	}		
}
