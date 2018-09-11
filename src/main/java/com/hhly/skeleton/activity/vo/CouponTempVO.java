package com.hhly.skeleton.activity.vo;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.vo.OperateCouponTempVO;

@SuppressWarnings("serial")
public class CouponTempVO extends BaseBO{
	private List<Integer> userIds;
	private OperateCouponTempVO  operateCouponTempvo;
	public List<Integer> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<Integer> userIds) {
		this.userIds = userIds;
	}
	public OperateCouponTempVO getOperateCouponTempvo() {
		return operateCouponTempvo;
	}
	public void setOperateCouponTempvo(OperateCouponTempVO operateCouponTempvo) {
		this.operateCouponTempvo = operateCouponTempvo;
	}
}
