package com.hhly.skeleton.lotto.base.lottery.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种中奖级别
 * @author huangb
 * @date 2017年2月24日
 * @company 益彩网络
 * @version v1.0
 */
public class LotWinningBO extends BaseBO {

	private static final long serialVersionUID = 5449862758229286095L;
	/**
	 * 奖项编号
	 */
	private Integer code;
	/**
	 * 奖项名称
	 */
	private String name;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}