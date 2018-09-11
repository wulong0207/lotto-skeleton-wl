package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户提款实际金额
 * @author xiongJinGang
 * @date 2017年4月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenRealAmountVO extends BaseBO {

	private static final long serialVersionUID = 3422759908931185667L;

	private Double realTakenAmount;// 实际提款金额
	private List<TakenAmountInfoVO> needTakenList;// 用户实际提款的信息

	public TakenRealAmountVO() {
		super();
	}

	public TakenRealAmountVO(Double realTakenAmount, List<TakenAmountInfoVO> needTakenList) {
		super();
		this.realTakenAmount = realTakenAmount;
		this.needTakenList = needTakenList;
	}

	public Double getRealTakenAmount() {
		return realTakenAmount;
	}

	public void setRealTakenAmount(Double realTakenAmount) {
		this.realTakenAmount = realTakenAmount;
	}

	public List<TakenAmountInfoVO> getNeedTakenList() {
		return needTakenList;
	}

	public void setNeedTakenList(List<TakenAmountInfoVO> needTakenList) {
		this.needTakenList = needTakenList;
	}

}
