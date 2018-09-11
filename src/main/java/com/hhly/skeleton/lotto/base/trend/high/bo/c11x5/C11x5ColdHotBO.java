package com.hhly.skeleton.lotto.base.trend.high.bo.c11x5;

import com.hhly.skeleton.base.bo.BaseBO;

public class C11x5ColdHotBO extends BaseBO{
	
	//号码
	private String code;
	//30期冷热期数
	private Integer ch30;
	//50期冷热期数
	private Integer ch50;
	//100期冷热期数
	private Integer ch100;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getCh30() {
		return ch30;
	}
	public void setCh30(Integer ch30) {
		this.ch30 = ch30;
	}
	public Integer getCh50() {
		return ch50;
	}
	public void setCh50(Integer ch50) {
		this.ch50 = ch50;
	}
	public Integer getCh100() {
		return ch100;
	}
	public void setCh100(Integer ch100) {
		this.ch100 = ch100;
	}
	
	
}
