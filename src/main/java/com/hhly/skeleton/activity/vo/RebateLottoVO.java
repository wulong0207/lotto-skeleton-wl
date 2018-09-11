package com.hhly.skeleton.activity.vo;

import com.hhly.skeleton.base.bo.BaseBO;


/**
 * @desc 大客户彩种信息vo类，解析{"lotteryCategory":4,"status":1,"lotteryCode":"300,301,302","rebate":1}
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class RebateLottoVO extends BaseBO{	
	/***
	 * 彩种类型
	 */
	private Short lotteryCategory;
	/**
	 * 彩种状态
	 */
	private Short status;
	/**
	 * 彩种信息逗号分隔
	 */
	private String lotteryCode;
	/**
	 * 返利值
	 */
	private Double rebate;
	public Short getLotteryCategory() {
		return lotteryCategory;
	}
	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public String getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Double getRebate() {
		return rebate;
	}
	public void setRebate(Double rebate) {
		this.rebate = rebate;
	} 
	
}
