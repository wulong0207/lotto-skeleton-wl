package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  存放多个业务需要的信息
 * @author lidecheng
 * @date 2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateVO extends BaseBO{
	/**登录用户token*/
	private String token;
	
	/**
	   * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
	*/
	private short categoryId;
    
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}	
}
