package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ActivityCountBO extends BaseBO{
	/**统计次数*/
	private Integer sum;
	/**统计类型,1用户,2手机号,3身份证(或者用户id)是否享受活动,4活动当天数量*/
	private Short type;
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	
}
