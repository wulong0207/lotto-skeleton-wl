package com.hhly.skeleton.lotto.base.trend.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 
 * @desc
 * @author chenghougui
 * @Date 2018年1月5日
 * @Company 益彩网络科技公司
 * @version
 */
@SuppressWarnings("serial")
public class NumTimeVo extends BaseVO {
	// 号码
	private String code;
	// 号码的次数
	private int time;
	
	public NumTimeVo(){}
	
	public NumTimeVo(String code,int time){
		this.code = code;
		this.time = time;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
