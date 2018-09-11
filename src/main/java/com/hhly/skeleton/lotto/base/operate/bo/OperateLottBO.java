package com.hhly.skeleton.lotto.base.operate.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.LotteryEnum.Lottery;

/**
 * 返回手机端彩种信息
 * @desc
 * @author lidecheng
 * @date 2017年5月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateLottBO extends BaseBO{
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	
	public OperateLottBO(){
		
	}
	public OperateLottBO(Lottery lottery){
		lotteryCode = lottery.getName();
		lotteryName = lottery.getDesc();
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public String getLotteryName() {
		return lotteryName;
	}
	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
}
