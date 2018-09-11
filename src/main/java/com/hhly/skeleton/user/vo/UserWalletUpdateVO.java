package com.hhly.skeleton.user.vo;

import java.io.Serializable;

/**
 * @desc 用户钱包更新参数
 * @author xiongJinGang
 * @date 2017年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class UserWalletUpdateVO implements Serializable {

	private static final long serialVersionUID = -1130808883190476530L;

	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 充值金额
	 */
	private Double rechargeMoney;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(Double rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

}
