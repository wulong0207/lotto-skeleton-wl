package com.hhly.skeleton.activity.vo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OrderDetailVO extends BaseBO{
	/**倍数*/
	public Integer multiple;
	/**单注税后金额*/
	public Double oneAftBonus;
	/**奖项*/
	public String prize;
	/**中奖后的注数*/
	public Double aftNumber;
	public Integer getMultiple() {
		return multiple;
	}
	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}
	public Double getOneAftBonus() {
		return oneAftBonus;
	}
	public void setOneAftBonus(Double oneAftBonus) {
		this.oneAftBonus = oneAftBonus;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public Double getAftNumber() {
		return aftNumber;
	}
	public void setAftNumber(Double aftNumber) {
		this.aftNumber = aftNumber;
	}	
}
