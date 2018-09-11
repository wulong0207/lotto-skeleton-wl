package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc 用户数字彩方案明细查询实体
 * @author huangb
 * @date 2017年4月11日
 * @company 益彩网络
 * @version v1.0
 */
public class UserNumOrderDetailQueryVO extends PageVO {

	private static final long serialVersionUID = 4292828428220207321L;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 用户token串
	 */
	private String token;
	/**
	 * 用户Id
	 */
	private Integer userId;

	/**
	 * 请求来源，默认是PC端 0：Pc端,1:移动端
	 */
	private Integer source=0;

	public UserNumOrderDetailQueryVO() {
	}

	public UserNumOrderDetailQueryVO(String orderCode, String token, Integer pageIndex, Integer pageSize) {
		this.orderCode = orderCode;
		this.token = token;
		super.setPageIndex(pageIndex);
		super.setPageSize(pageSize);
	}
	
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}
}
