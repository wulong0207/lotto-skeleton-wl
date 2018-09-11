package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class OperateMsgLotteryConfigVO extends BaseVO {

	private Integer id;
	private Integer lotteryCode;
	private Integer type;
	private Integer app;
	private Integer userId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getApp() {
		return app;
	}
	public void setApp(Integer app) {
		this.app = app;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
