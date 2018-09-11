package com.hhly.skeleton.pay.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款处理流程
 * @author xiongJinGang
 * @date 2017年10月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenFlowVO extends BaseBO {
	private static final long serialVersionUID = -6810642329660322846L;
	private String remark;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dealTime;

	public TakenFlowVO() {
		super();
	}

	public TakenFlowVO(Date dealTime, String remark) {
		super();
		this.dealTime = dealTime;
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
}
