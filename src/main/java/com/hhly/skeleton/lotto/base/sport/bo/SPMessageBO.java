package com.hhly.skeleton.lotto.base.sport.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class SPMessageBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mobile;
	private String mail;
	private String name;
	private String num;
	private String channel;
	private String amount;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
