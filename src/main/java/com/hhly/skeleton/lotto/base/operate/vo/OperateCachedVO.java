package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  缓存数据的信息
 * @author lidecheng
 * @date 2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateCachedVO extends BaseBO{
	/**上传用户的ip*/
	private String ip;
	/**信息id*/
	private String id;
	/**登录用户token*/
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
}
