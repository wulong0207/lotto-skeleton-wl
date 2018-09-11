package com.hhly.skeleton.lotto.base.ordercopy.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 抄单明细 BO
 * @author longguoyou
 * @date 2017年10月14日
 * @compay 益彩网络科技有限公司
 */
public class FollowedDetailsBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date followedTime;//跟单时间
	private String nickName;//用户昵称
	private Double orderAmount;//跟单金额
	private Double commissionAmount;//提成
	private Integer winStatus;//中奖状态

	public Integer getWinStatus() {
		return winStatus;
	}

	public void setWinStatus(Integer winStatus) {
		this.winStatus = winStatus;
	}

	public Date getFollowedTime() {
		return followedTime;
	}
	public void setFollowedTime(Date followedTime) {
		this.followedTime = followedTime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Double getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Double commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
}
