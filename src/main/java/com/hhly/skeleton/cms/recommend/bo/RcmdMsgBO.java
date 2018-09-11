package com.hhly.skeleton.cms.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.valid.NotNull;

@SuppressWarnings("serial")
public class RcmdMsgBO extends BaseBO{

	/**
	 * 
	 */

	// 必须  1.推单 2.开奖 3.锁定修改 4.浏览量增加
	@NotNull
	private int type;
	
	//必须
	@NotNull
	private String rcmdCode;
	
	private Integer userId;
	
	private Integer click;
	
	private Integer winningStatus;
	
	private double winningAmount;
	
	private Integer payCount;
	
	private double payAmount;


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRcmdCode() {
		return rcmdCode;
	}

	public void setRcmdCode(String rcmdCode) {
		this.rcmdCode = rcmdCode;
	}

	public Integer getClick() {
		return click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}


	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public double getWinningAmount() {
		return winningAmount;
	}

	public void setWinningAmount(double winningAmount) {
		this.winningAmount = winningAmount;
	}

	public Integer getPayCount() {
		return payCount;
	}

	public void setPayCount(Integer payCount) {
		this.payCount = payCount;
	}

	public double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}




	
	
	
}
