package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    用户中奖信息
 * @author  Tony Wang
 * @date    2017年8月12日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class WinBO extends BaseBO{
    
    /**
     * 会员昵称
     */
    private String nickName;

    /**
     * 总金额
     */
    private Double money;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
}