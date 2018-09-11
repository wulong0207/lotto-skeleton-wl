package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 第三方API接口返回参数，包含生成的cdkey和彩种等信息
 *
 * @author huangchengfang1219
 * @date 2018年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateLotteryCdkeyBO extends BaseBO {

	private static final long serialVersionUID = 2514586354215961430L;

	private String cdkey;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date overTime;

	private Integer lotteryCode;

	private String lotteryName;

	public String getCdkey() {
		return cdkey;
	}

	public void setCdkey(String cdkey) {
		this.cdkey = cdkey;
	}

	public Date getOverTime() {
		return overTime;
	}

	public void setOverTime(Date overTime) {
		this.overTime = overTime;
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
