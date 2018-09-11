package com.hhly.skeleton.cms.customerservice.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 用户消息
 * @author tangxiaobo
 * @date 2017年4月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class SendMessageVO extends BaseVO{

	private Integer id;
	/*
	 * 用户:手机号或者邮件地址
	 */
	private String account;


	private String message;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}