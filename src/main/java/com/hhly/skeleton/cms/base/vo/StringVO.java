package com.hhly.skeleton.cms.base.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class StringVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8509276350002636870L;

	private String str;

	public StringVO() {
	}

	public StringVO(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
