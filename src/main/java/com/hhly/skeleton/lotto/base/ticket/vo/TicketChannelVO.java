package com.hhly.skeleton.lotto.base.ticket.vo;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class TicketChannelVO extends BaseVO{
	
	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
